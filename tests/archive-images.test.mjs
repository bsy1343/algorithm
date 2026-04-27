import { test } from 'node:test';
import assert from 'node:assert/strict';
import { mkdtemp, writeFile, mkdir, rm } from 'node:fs/promises';
import { tmpdir } from 'node:os';
import { join } from 'node:path';

import {
  extractImageUrls,
  urlToLocalPath,
  collectImageUrls,
} from '../scripts/archive-images.mjs';
import { fetchBojImages, repairReadmeImages } from '../scripts/archive-images.mjs';

test('extractImageUrls: pulls https sources from img tags', () => {
  const html = `
    <p>some text</p>
    <img src="https://u.acmicpc.net/abc/img.png">
    <img alt="" src='https://upload.acmicpc.net/xyz/-/preview/' style="width:300px">
    <img src="/relative/should/be/ignored.png">
    <img src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/1/1.png">
  `;
  const urls = extractImageUrls(html);
  assert.deepEqual(urls.sort(), [
    'https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/1/1.png',
    'https://u.acmicpc.net/abc/img.png',
    'https://upload.acmicpc.net/xyz/-/preview/',
  ]);
});

test('urlToLocalPath: stable 8-char sha1 + extension', () => {
  const a = urlToLocalPath('https://u.acmicpc.net/abc/img.png');
  const b = urlToLocalPath('https://u.acmicpc.net/abc/img.png');
  assert.equal(a, b, 'same url should map to same path');
  assert.match(a, /백준\/\.assets\/[a-f0-9]{8}\.png$/);
});

test('urlToLocalPath: defaults to .png when extension missing/odd', () => {
  const p = urlToLocalPath('https://upload.acmicpc.net/xyz/-/preview/');
  assert.match(p, /백준\/\.assets\/[a-f0-9]{8}\.png$/);
});

test('urlToLocalPath: preserves common image extensions', () => {
  assert.match(urlToLocalPath('https://x/a.jpg'), /\.jpg$/);
  assert.match(urlToLocalPath('https://x/a.JPEG'), /\.jpeg$/);
  assert.match(urlToLocalPath('https://x/a.gif'), /\.gif$/);
  assert.match(urlToLocalPath('https://x/a.svg'), /\.svg$/);
});

test('collectImageUrls: walks 백준 tree and dedupes urls', async () => {
  const root = await mkdtemp(join(tmpdir(), 'boj-test-'));
  try {
    await mkdir(join(root, '백준', 'Silver', '111. A'), { recursive: true });
    await mkdir(join(root, '백준', 'Gold', '222. B'), { recursive: true });
    await writeFile(join(root, '백준', 'Silver', '111. A', 'README.md'),
      '<img src="https://x/1.png"> shared <img src="https://y/2.gif">');
    await writeFile(join(root, '백준', 'Gold', '222. B', 'README.md'),
      '<img src="https://x/1.png"> dup <img src="https://z/3.jpg">');

    const urls = await collectImageUrls({ rootDir: root });
    assert.deepEqual(urls.sort(), [
      'https://x/1.png',
      'https://y/2.gif',
      'https://z/3.jpg',
    ]);
  } finally {
    await rm(root, { recursive: true, force: true });
  }
});

test('fetchBojImages: filters to BOJ hosts only', async () => {
  const fakeHtml = `
    <img id="logo" src="https://d2gd6pc034wcta.cloudfront.net/images/logo.png">
    <img alt="" src="https://upload.acmicpc.net/abc/-/preview/">
    <img src="https://www.facebook.com/tr?id=foo">
    <img alt="" src="https://u.acmicpc.net/foo/img.png">
    <img src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9/9.png">
  `;
  const fakeFetch = async () => ({ ok: true, status: 200, text: async () => fakeHtml });
  const urls = await fetchBojImages('9999', { fetchImpl: fakeFetch });
  assert.deepEqual(urls.sort(), [
    'https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9/9.png',
    'https://u.acmicpc.net/foo/img.png',
    'https://upload.acmicpc.net/abc/-/preview/',
  ]);
});

test('repairReadmeImages: fills empty src using BOJ images in order', async () => {
  const root = await mkdtemp(join(tmpdir(), 'boj-repair-'));
  try {
    await mkdir(join(root, '백준', 'Gold', '1068. 트리'), { recursive: true });
    const before = `<p>설명</p>
<p style="text-align: center"><img alt="" src="" style="width:200px"></p>
<p>중간 내용</p>
<p style="text-align: center"><img alt="" src='' style="width:200px"></p>`;
    await writeFile(join(root, '백준', 'Gold', '1068. 트리', 'README.md'), before);

    const fakeFetch = async (url) => {
      assert.match(url, /\/problem\/1068$/);
      return {
        ok: true, status: 200,
        text: async () => `
          <img src="https://upload.acmicpc.net/aaa/-/preview/">
          <img src="https://upload.acmicpc.net/bbb/-/preview/">
        `,
      };
    };
    const result = await repairReadmeImages({ rootDir: root, fetchImpl: fakeFetch });
    assert.equal(result.repaired, 1);
    assert.deepEqual(result.problems, [{ num: '1068', filled: 2, total: 2 }]);

    const { readFile } = await import('node:fs/promises');
    const after = await readFile(join(root, '백준', 'Gold', '1068. 트리', 'README.md'), 'utf8');
    assert.match(after, /src="https:\/\/upload\.acmicpc\.net\/aaa\/-\/preview\/"/);
    assert.match(after, /src='https:\/\/upload\.acmicpc\.net\/bbb\/-\/preview\/'/);
  } finally {
    await rm(root, { recursive: true, force: true });
  }
});

test('repairReadmeImages: skips problem when BOJ returns no images', async () => {
  const root = await mkdtemp(join(tmpdir(), 'boj-repair-empty-'));
  try {
    await mkdir(join(root, '백준', 'Silver', '999. test'), { recursive: true });
    const before = `<img alt="" src="">`;
    await writeFile(join(root, '백준', 'Silver', '999. test', 'README.md'), before);
    const fakeFetch = async () => ({ ok: true, status: 200, text: async () => '<html><body>no images</body></html>' });
    const result = await repairReadmeImages({ rootDir: root, fetchImpl: fakeFetch });
    assert.equal(result.repaired, 0);

    const { readFile } = await import('node:fs/promises');
    const after = await readFile(join(root, '백준', 'Silver', '999. test', 'README.md'), 'utf8');
    assert.equal(after, before, 'README should be unchanged when no BOJ images found');
  } finally {
    await rm(root, { recursive: true, force: true });
  }
});

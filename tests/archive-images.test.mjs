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

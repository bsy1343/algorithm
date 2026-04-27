#!/usr/bin/env node
import { readFile, writeFile, readdir, stat, mkdir } from 'node:fs/promises';
import { existsSync } from 'node:fs';
import { join, extname, dirname } from 'node:path';
import { fileURLToPath } from 'node:url';
import { createHash } from 'node:crypto';

const IMG_RE = /<img[^>]+src=["']([^"']+)["'][^>]*>/gi;
const KNOWN_EXTS = new Set(['.png', '.jpg', '.jpeg', '.gif', '.svg', '.webp', '.bmp']);

export function extractImageUrls(html) {
  const urls = new Set();
  for (const m of html.matchAll(IMG_RE)) {
    const src = m[1];
    if (/^https?:\/\//i.test(src)) urls.add(src);
  }
  return [...urls];
}

const BOJ_IMAGE_HOSTS = [
  'upload.acmicpc.net',
  'u.acmicpc.net',
  'onlinejudgeimages.s3-ap-northeast-1.amazonaws.com',
  'www.acmicpc.net/upload',
];

export async function fetchBojImages(problemNum, { fetchImpl = fetch } = {}) {
  const url = `https://www.acmicpc.net/problem/${encodeURIComponent(problemNum)}`;
  const res = await fetchImpl(url);
  if (!res.ok) throw new Error(`BOJ HTTP ${res.status} for problem ${problemNum}`);
  const html = await res.text();
  const urls = [];
  for (const m of html.matchAll(/<img[^>]+src=["']([^"']+)["']/gi)) {
    let src = m[1];
    // Normalize BOJ-relative paths like "/upload/images/foo.png" to absolute.
    if (/^\/upload\//i.test(src)) src = 'https://www.acmicpc.net' + src;
    if (!/^https?:\/\//i.test(src)) continue;
    if (BOJ_IMAGE_HOSTS.some(h => src.includes(h))) urls.push(src);
  }
  return urls;
}

const PROBLEM_FOLDER_RE = /^(\d+)\.\s/;
const EMPTY_SRC_RE = /<img\b([^>]*?)\bsrc=(["'])\s*\2/gi;

export async function repairReadmeImages({ rootDir = '.', fetchImpl = fetch } = {}) {
  const bojDir = join(rootDir, '백준');
  if (!existsSync(bojDir)) return { repaired: 0, problems: [] };

  const repairedProblems = [];
  let repaired = 0;
  const tiers = await readdir(bojDir);
  for (const tier of tiers) {
    if (tier.startsWith('.')) continue;
    const tierPath = join(bojDir, tier);
    let s; try { s = await stat(tierPath); } catch { continue; }
    if (!s.isDirectory()) continue;

    const problems = await readdir(tierPath);
    for (const p of problems) {
      if (p.startsWith('.')) continue;
      const m = p.match(PROBLEM_FOLDER_RE);
      if (!m) continue;
      const num = m[1];

      const readmePath = join(tierPath, p, 'README.md');
      if (!existsSync(readmePath)) continue;
      const content = await readFile(readmePath, 'utf8');

      const emptyMatches = [...content.matchAll(EMPTY_SRC_RE)];
      if (emptyMatches.length === 0) continue;

      let bojImages;
      try {
        bojImages = await fetchBojImages(num, { fetchImpl });
      } catch (e) {
        console.error(`  ! repair ${num}: ${e.message}`);
        continue;
      }
      if (!bojImages.length) {
        console.warn(`  ! repair ${num}: no BOJ images found (page may have no images)`);
        continue;
      }

      let i = 0;
      const newContent = content.replace(EMPTY_SRC_RE, (full, attrs, quote) => {
        if (i >= bojImages.length) return full;
        return `<img${attrs}src=${quote}${bojImages[i++]}${quote}`;
      });

      if (newContent !== content) {
        await writeFile(readmePath, newContent, 'utf8');
        repaired++;
        repairedProblems.push({ num, filled: i, total: emptyMatches.length });
        console.log(`  ok ${num}: filled ${i}/${emptyMatches.length} src(s)`);
      }
    }
  }
  return { repaired, problems: repairedProblems };
}

export function urlToLocalPath(url, { rootDir = '.' } = {}) {
  const hash = createHash('sha1').update(url).digest('hex').slice(0, 8);
  let ext = '.png';
  try {
    const u = new URL(url);
    const e = extname(u.pathname).toLowerCase();
    if (KNOWN_EXTS.has(e)) ext = e;
  } catch { /* default */ }
  return join(rootDir, '백준', '.assets', `${hash}${ext}`);
}

export async function collectImageUrls({ rootDir = '.' } = {}) {
  const bojDir = join(rootDir, '백준');
  if (!existsSync(bojDir)) return [];

  const urls = new Set();
  const tiers = await readdir(bojDir);
  for (const tier of tiers) {
    if (tier.startsWith('.')) continue;
    const tierPath = join(bojDir, tier);
    let s;
    try { s = await stat(tierPath); } catch { continue; }
    if (!s.isDirectory()) continue;

    const problems = await readdir(tierPath);
    for (const p of problems) {
      if (p.startsWith('.')) continue;
      const readme = join(tierPath, p, 'README.md');
      if (!existsSync(readme)) continue;
      const content = await readFile(readme, 'utf8');
      for (const u of extractImageUrls(content)) urls.add(u);
    }
  }
  return [...urls];
}

export async function loadIndex({ rootDir = '.' } = {}) {
  const indexFile = join(rootDir, '백준', '.assets', 'index.json');
  if (!existsSync(indexFile)) return {};
  return JSON.parse(await readFile(indexFile, 'utf8'));
}

export async function saveIndex(index, { rootDir = '.' } = {}) {
  const dir = join(rootDir, '백준', '.assets');
  await mkdir(dir, { recursive: true });
  await writeFile(join(dir, 'index.json'), JSON.stringify(index, null, 2) + '\n');
}

export async function downloadOne(url, { rootDir = '.' } = {}) {
  const localFull = urlToLocalPath(url, { rootDir });
  if (existsSync(localFull)) return relativeToRoot(localFull, rootDir);
  await mkdir(dirname(localFull), { recursive: true });
  const res = await fetch(url);
  if (!res.ok) throw new Error(`HTTP ${res.status}`);
  const buf = Buffer.from(await res.arrayBuffer());
  await writeFile(localFull, buf);
  return relativeToRoot(localFull, rootDir);
}

function relativeToRoot(absPath, rootDir) {
  const root = rootDir === '.' ? process.cwd() : rootDir;
  if (absPath.startsWith(root + '/')) return absPath.slice(root.length + 1);
  if (absPath.startsWith(root)) return absPath.slice(root.length);
  return absPath;
}

async function main() {
  const rootDir = process.cwd();

  console.log('Phase 1: repair empty img src by scraping BOJ pages...');
  let repairResult = { repaired: 0, problems: [] };
  try {
    repairResult = await repairReadmeImages({ rootDir });
    console.log(`  → ${repairResult.repaired} README(s) repaired`);
  } catch (e) {
    console.error(`  ! repair phase error: ${e.message}`);
  }

  console.log('Phase 2: collect + download images...');
  const index = await loadIndex({ rootDir });
  const urls = await collectImageUrls({ rootDir });

  let downloaded = 0, cached = 0, failed = 0;
  for (const url of urls) {
    if (index[url]) { cached++; continue; }
    try {
      index[url] = await downloadOne(url, { rootDir });
      downloaded++;
      console.log(`  ok ${url}`);
    } catch (e) {
      failed++;
      console.error(`  fail ${url}: ${e.message}`);
    }
  }
  await saveIndex(index, { rootDir });
  console.log(`done: ${downloaded} downloaded, ${cached} cached, ${failed} failed (repaired ${repairResult.repaired} README)`);
}

if (process.argv[1] && fileURLToPath(import.meta.url) === process.argv[1]) {
  main().catch(e => { console.error(e); process.exit(1); });
}

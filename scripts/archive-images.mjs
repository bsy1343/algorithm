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
  console.log(`done: ${downloaded} downloaded, ${cached} cached, ${failed} failed`);
}

if (process.argv[1] && fileURLToPath(import.meta.url) === process.argv[1]) {
  main().catch(e => { console.error(e); process.exit(1); });
}

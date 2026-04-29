#!/usr/bin/env node
/**
 * Localize all <img> tags in README.md across 백준/ to local files,
 * sourcing images from boja.mercury.kr (BOJ is offline).
 *
 * For each README:
 *   - Parse <img src="..."> in document order.
 *   - If src is already a relative path that exists locally → keep as-is.
 *   - If src is absolute non-BOJ (e.g., github raw) → keep as-is.
 *   - Otherwise (broken acmicpc URL, empty, local-missing, /assets/problem/...)
 *     → look up boja's i-th image for the problem and download it.
 *   - Save into the problem folder with a sha1[:8] filename, and rewrite the
 *     README's src to a relative URL-encoded path with onerror fallback.
 *
 * Run:  node scripts/localize-images-from-boja.mjs
 *       DRY_RUN=1   audit only, no writes
 *       DELAY_MS=50 throttle between image downloads (default 50ms)
 *
 * Idempotent — already-localized references are skipped.
 */
import { readFile, writeFile, readdir, stat, mkdir } from 'node:fs/promises';
import { existsSync } from 'node:fs';
import { join, dirname, extname } from 'node:path';
import { fileURLToPath } from 'node:url';
import { createHash } from 'node:crypto';

const __dirname = dirname(fileURLToPath(import.meta.url));
const ROOT = join(__dirname, '..');
const BASE = 'https://boja.mercury.kr';
const UA = 'Mozilla/5.0 boj-study-viewer/1.0 (personal use)';
const KNOWN_EXTS = new Set(['.png', '.jpg', '.jpeg', '.gif', '.svg', '.webp', '.bmp']);

const log = (...a) => console.log('[img]', ...a);

async function fetchJson(url, attempts = 3) {
  let last;
  for (let i = 0; i < attempts; i++) {
    try {
      const r = await fetch(url, { headers: { 'User-Agent': UA } });
      if (!r.ok) throw new Error(`HTTP ${r.status}`);
      return await r.json();
    } catch (e) { last = e; await new Promise(res => setTimeout(res, 500 * (i + 1))); }
  }
  throw last;
}

async function downloadBuf(url, attempts = 3) {
  let last;
  for (let i = 0; i < attempts; i++) {
    try {
      const r = await fetch(url, { headers: { 'User-Agent': UA } });
      if (!r.ok) throw new Error(`HTTP ${r.status}`);
      return Buffer.from(await r.arrayBuffer());
    } catch (e) { last = e; await new Promise(res => setTimeout(res, 500 * (i + 1))); }
  }
  throw last;
}

function urlToFilename(url) {
  const hash = createHash('sha1').update(url).digest('hex').slice(0, 8);
  let ext = '.png';
  try {
    const u = new URL(url, BASE);
    const e = extname(u.pathname).toLowerCase();
    if (KNOWN_EXTS.has(e)) ext = e;
  } catch { /* default */ }
  return `${hash}${ext}`;
}

function encodePath(p) {
  return p.split('/').map(encodeURIComponent).join('/');
}

const IMG_RE = /<img\b([^>]*?)\bsrc=(["'])([^"']*)\2([^>]*)>/gi;

// Collect all <img src> values in document order from a chunk of HTML.
function imgSrcsInHtml(html) {
  const out = [];
  if (!html) return out;
  for (const m of String(html).matchAll(IMG_RE)) out.push(m[3]);
  return out;
}

// Extract boja's per-problem image URLs in display order, by walking
// section blocks (description → input → output → limit → hint).
function bojaImageList(p) {
  const order = ['description', 'input', 'output', 'limit', 'hint'];
  const blocks = p.blocks || [];
  const byKey = new Map();
  for (const b of blocks) {
    if (b.type !== 'section') continue;
    byKey.set(b.langKey, b.html || '');
  }
  const urls = [];
  for (const k of order) {
    if (!byKey.has(k)) continue;
    for (const src of imgSrcsInHtml(byKey.get(k))) {
      if (!src) continue;
      const abs = src.startsWith('http') ? src : new URL(src, BASE).toString();
      urls.push(abs);
    }
  }
  return urls;
}

// Decide whether a local img src needs re-download from boja:
//   - empty
//   - absolute acmicpc/onlinejudgeimages (broken)
//   - boja-relative (/assets/problem/...)
//   - relative path that doesn't exist on disk
// Other absolute URLs (github raw, etc.) are kept as-is.
function needsFetch(src, folderAbs) {
  if (!src) return true;
  if (src.startsWith('/assets/problem/')) return true;
  if (/^https?:\/\//i.test(src)) {
    if (/acmicpc\.net|onlinejudgeimages/.test(src)) return true;
    return false;
  }
  // Relative path inside repo. Decode and check existence.
  const decoded = decodeURIComponent(src);
  // src may be "백준/Bronze/123. ..." (full repo-rel) or just "filename.png"
  const candidates = [
    join(ROOT, decoded),
    join(folderAbs, decoded),
  ];
  return !candidates.some(p => existsSync(p));
}

async function processProblem(folderAbs, num, dryRun, delayMs, shardCache) {
  const readmePath = join(folderAbs, 'README.md');
  if (!existsSync(readmePath)) return null;
  const original = await readFile(readmePath, 'utf8');
  const matches = [...original.matchAll(IMG_RE)];
  if (matches.length === 0) return null;

  // Decide which need fetching, and remember their position (i-th overall).
  const work = [];  // { idx, full, before, q, src, after }
  for (let idx = 0; idx < matches.length; idx++) {
    const m = matches[idx];
    const [full, before, q, src, after] = m;
    if (needsFetch(src, folderAbs)) work.push({ idx, full, before, q, src, after });
  }
  if (work.length === 0) return { id: num, status: 'ok', imgs: matches.length, fetched: 0 };

  // Fetch boja detail (cached per shard).
  const sk = Math.floor(parseInt(num, 10) / 100);
  if (!shardCache.has(sk)) {
    try { shardCache.set(sk, await fetchJson(`${BASE}/data/problems/${sk}.json`)); }
    catch (e) { return { id: num, status: 'shard-failed', error: e.message, imgs: matches.length, fetched: 0 }; }
  }
  const detail = shardCache.get(sk);
  const p = detail.problems.find(x => x.id === parseInt(num, 10));
  if (!p) return { id: num, status: 'not-on-boja', imgs: matches.length, fetched: 0 };

  const bojaImgs = bojaImageList(p);
  if (bojaImgs.length === 0) return { id: num, status: 'no-boja-images', imgs: matches.length, fetched: 0 };

  // Compute folder path relative to repo root for use in img src URLs.
  const folderRel = folderAbs.startsWith(ROOT + '/') ? folderAbs.slice(ROOT.length + 1) : folderAbs;

  // For each work item, the i-th overall <img> in README maps to bojaImgs[i].
  const replacements = [];
  let fetched = 0, missing = 0;
  for (const w of work) {
    const bojaUrl = bojaImgs[w.idx];
    if (!bojaUrl) { missing++; continue; }
    const filename = urlToFilename(bojaUrl);
    const destPath = join(folderAbs, filename);
    if (!dryRun && !existsSync(destPath)) {
      try {
        const buf = await downloadBuf(bojaUrl);
        await mkdir(folderAbs, { recursive: true });
        await writeFile(destPath, buf);
        fetched++;
        if (delayMs > 0) await new Promise(r => setTimeout(r, delayMs));
      } catch (e) {
        missing++;
        log(`! ${num} dl ${bojaUrl}: ${e.message}`);
        continue;
      }
    } else if (existsSync(destPath)) {
      // Already cached on disk.
    } else {
      // dry-run with no file yet
    }
    const localUrl = encodePath(`${folderRel}/${filename}`);
    replacements.push({ ...w, localUrl, bojaUrl });
  }

  if (replacements.length === 0) return { id: num, status: 'no-replace', imgs: matches.length, fetched };

  // Rewrite README. We replace by exact match of the original full match string,
  // each only once (in case identical srcs repeat).
  let content = original;
  for (const r of replacements) {
    const safeOriginal = r.bojaUrl.replace(/"/g, '&quot;');
    // Drop any preexisting onerror= or data-original-src= to avoid duplication
    const cleanedBefore = r.before.replace(/\s+onerror="[^"]*"/gi, '').replace(/\s+data-original-src="[^"]*"/gi, '');
    const cleanedAfter = r.after.replace(/\s+onerror="[^"]*"/gi, '').replace(/\s+data-original-src="[^"]*"/gi, '');
    const newTag = `<img${cleanedBefore}src=${r.q}${r.localUrl}${r.q} data-original-src="${safeOriginal}" onerror="this.onerror=null;this.src=this.dataset.originalSrc"${cleanedAfter}>`;
    const idx = content.indexOf(r.full);
    if (idx === -1) continue;
    content = content.slice(0, idx) + newTag + content.slice(idx + r.full.length);
  }

  if (!dryRun && content !== original) {
    await writeFile(readmePath, content, 'utf8');
  }
  return { id: num, status: 'updated', imgs: matches.length, fetched, replaced: replacements.length, missing };
}

async function walkProblems() {
  const out = [];
  const bojDir = join(ROOT, '백준');
  for (const tier of await readdir(bojDir)) {
    if (tier.startsWith('.')) continue;
    const tp = join(bojDir, tier);
    const s = await stat(tp).catch(() => null);
    if (!s?.isDirectory()) continue;
    for (const p of await readdir(tp)) {
      if (p.startsWith('.')) continue;
      const m = p.match(/^(\d+)\./);
      if (!m) continue;
      const folder = join(tp, p);
      const ss = await stat(folder).catch(() => null);
      if (ss?.isDirectory()) out.push({ folder, num: m[1] });
    }
  }
  return out;
}

async function main() {
  const dryRun = process.env.DRY_RUN === '1';
  const delayMs = parseInt(process.env.DELAY_MS || '50', 10);

  const problems = await walkProblems();
  log(`scanning ${problems.length} problem folders${dryRun ? ' (DRY RUN)' : ''}`);

  const shardCache = new Map();
  let touched = 0, totalFetched = 0, totalReplaced = 0, totalMissing = 0;
  let foldersWithImgs = 0;
  const failures = [];

  for (let i = 0; i < problems.length; i++) {
    const { folder, num } = problems[i];
    try {
      const r = await processProblem(folder, num, dryRun, delayMs, shardCache);
      if (!r) continue;
      if (r.imgs > 0) foldersWithImgs++;
      if (r.status === 'updated') {
        touched++;
        totalFetched += r.fetched;
        totalReplaced += r.replaced;
        totalMissing += r.missing;
      } else if (r.status !== 'ok') {
        failures.push({ id: num, status: r.status, error: r.error });
      }
    } catch (e) {
      failures.push({ id: num, status: 'thrown', error: e.message });
      log(`! ${num}: ${e.message}`);
    }
    if ((i + 1) % 500 === 0 || i === problems.length - 1) {
      log(`progress ${i + 1}/${problems.length} | folders w/imgs ${foldersWithImgs} | touched ${touched} fetched ${totalFetched} replaced ${totalReplaced} missing ${totalMissing}`);
    }
  }

  log(`done. touched ${touched} READMEs | downloaded ${totalFetched} imgs | replaced ${totalReplaced} src refs | unmatched ${totalMissing}`);

  if (failures.length) {
    const failPath = join(__dirname, 'localize-images.failed.json');
    if (!dryRun) await writeFile(failPath, JSON.stringify(failures, null, 2));
    log(`failures (${failures.length}) → ${dryRun ? 'NOT WRITTEN (dry run)' : failPath}`);
  }
}

main().catch(e => { console.error(e); process.exit(1); });

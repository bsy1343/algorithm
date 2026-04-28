#!/usr/bin/env node
/**
 * Per-problem archival: makes each `백준/<tier>/<id>. <title>/` folder
 * SELF-CONTAINED.
 *
 * Phases per problem:
 *   1. Empty <img src=""> repair
 *      Pulls images from BOJ page, fills the empty src in order.
 *   2. Image localization
 *      Downloads each absolute https image into the problem folder
 *      itself (sha1-based filename), rewrites README's <img src> to
 *      a relative local path.
 *   3. BaekjoonHub README augmentation
 *      If README is BaekjoonHub-format (has "### 성능 요약" with user
 *      runtime stats but no "### 제한" / "### 힌트" / "### 통계"),
 *      fetches BOJ once and appends the missing sections.
 *
 * Run:  node scripts/archive-per-problem.mjs
 * Idempotent — running again with no new READMEs is a no-op.
 *
 * The legacy shared `백준/.assets/` folder is no longer used. Once
 * this script has been run and the changes pushed, that folder can
 * be deleted manually (or by the cleanup hint at the end of this file).
 */
import { readFile, writeFile, readdir, stat, mkdir, rm } from 'node:fs/promises';
import { existsSync } from 'node:fs';
import { join, dirname, extname } from 'node:path';
import { fileURLToPath } from 'node:url';
import { createHash } from 'node:crypto';

import {
  extractSection, extractProblemInfo, extractSamples,
} from './boj-lib.mjs';

const __dirname = dirname(fileURLToPath(import.meta.url));
const ROOT = process.cwd();

const IMG_RE = /<img([^>]*)src=(["'])([^"']+)\2([^>]*)>/gi;
const KNOWN_EXTS = new Set(['.png', '.jpg', '.jpeg', '.gif', '.svg', '.webp', '.bmp']);
const BOJ_IMAGE_HOSTS = [
  'upload.acmicpc.net',
  'u.acmicpc.net',
  'onlinejudgeimages.s3-ap-northeast-1.amazonaws.com',
  'www.acmicpc.net/upload',
];

// ---------- helpers --------------------------------------------------------

function sleep(ms) { return new Promise(r => setTimeout(r, ms)); }

function urlToFilename(url) {
  const hash = createHash('sha1').update(url).digest('hex').slice(0, 8);
  let ext = '.png';
  try {
    const u = new URL(url);
    const e = extname(u.pathname).toLowerCase();
    if (KNOWN_EXTS.has(e)) ext = e;
  } catch { /* default */ }
  return `${hash}${ext}`;
}

async function downloadTo(url, destPath) {
  if (existsSync(destPath)) return false; // already cached
  await mkdir(dirname(destPath), { recursive: true });
  const res = await fetch(url, {
    headers: { 'User-Agent': 'Mozilla/5.0 boj-archiver/1.0' },
  });
  if (!res.ok) throw new Error(`HTTP ${res.status}`);
  const buf = Buffer.from(await res.arrayBuffer());
  await writeFile(destPath, buf);
  return true;
}

let bojCache = new Map();
async function fetchBojPage(num) {
  if (bojCache.has(num)) return bojCache.get(num);
  const r = await fetch(`https://www.acmicpc.net/problem/${encodeURIComponent(num)}`, {
    headers: { 'User-Agent': 'Mozilla/5.0 boj-archiver/1.0' },
  });
  if (!r.ok) throw new Error(`BOJ HTTP ${r.status}`);
  const html = await r.text();
  bojCache.set(num, html);
  return html;
}

function extractBojImageUrls(html) {
  const urls = [];
  for (const m of html.matchAll(IMG_RE)) {
    let src = m[3];
    if (/^\/upload\//i.test(src)) src = 'https://www.acmicpc.net' + src;
    if (!/^https?:\/\//i.test(src)) continue;
    if (BOJ_IMAGE_HOSTS.some(h => src.includes(h))) urls.push(src);
  }
  return urls;
}

// ---------- per-problem phases --------------------------------------------

// Phase 1: repair empty <img src="">
async function repairEmptySrc(readmeContent, problemNum) {
  const EMPTY_SRC_RE = /<img\b([^>]*?)\bsrc=(["'])\s*\2/gi;
  const empties = [...readmeContent.matchAll(EMPTY_SRC_RE)];
  if (empties.length === 0) return readmeContent;

  let html;
  try { html = await fetchBojPage(problemNum); }
  catch (e) {
    console.warn(`  ! ${problemNum} repair: ${e.message}`);
    return readmeContent;
  }
  const bojImgs = extractBojImageUrls(html);
  if (!bojImgs.length) return readmeContent;

  let i = 0;
  return readmeContent.replace(EMPTY_SRC_RE, (full, attrs, q) => {
    if (i >= bojImgs.length) return full;
    return `<img${attrs}src=${q}${bojImgs[i++]}${q}`;
  });
}

function encodePath(p) {
  return p.split('/').map(encodeURIComponent).join('/');
}

// Phase 2: download absolute https images into the problem folder, rewrite src
// to a path relative to the repo root (URL-encoded). The viewer's HTML is at
// the repo root, so img src needs to include the full subpath, not just the
// filename.
async function localizeImages(readmeContent, folder, folderRel) {
  // Also handle BOJ-relative `/upload/` srcs by promoting to absolute first.
  let working = readmeContent
    .replace(/(<img[^>]+src=["'])\/upload\//gi, '$1https://www.acmicpc.net/upload/');

  let downloaded = 0, kept = 0;
  const replacements = new Map();

  for (const m of working.matchAll(IMG_RE)) {
    const src = m[3];
    if (!/^https?:\/\//i.test(src)) continue; // already localized
    if (replacements.has(src)) continue;
    const filename = urlToFilename(src);
    const destPath = join(folder, filename);
    try {
      const fresh = await downloadTo(src, destPath);
      if (fresh) downloaded++;
      else kept++;
      const localUrl = encodePath(`${folderRel}/${filename}`);
      replacements.set(src, localUrl);
    } catch (e) {
      console.warn(`  ! download ${src}: ${e.message}`);
    }
  }

  // Apply replacements, also adding onerror fallback to original URL
  for (const [absUrl, localUrl] of replacements) {
    const escAbs = absUrl.replace(/[.*+?^${}()|[\]\\]/g, '\\$&');
    const re = new RegExp(`(<img[^>]*?)src=(["'])${escAbs}\\2([^>]*)>`, 'gi');
    working = working.replace(re, (full, before, q, after) => {
      // Drop any preexisting onerror= or data-original-src= to avoid duplication
      const cleanedBefore = before.replace(/\s+onerror="[^"]*"/gi, '').replace(/\s+data-original-src="[^"]*"/gi, '');
      const cleanedAfter = after.replace(/\s+onerror="[^"]*"/gi, '').replace(/\s+data-original-src="[^"]*"/gi, '');
      const safeOriginal = absUrl.replace(/"/g, '&quot;');
      return `${cleanedBefore}src=${q}${localUrl}${q} data-original-src="${safeOriginal}" onerror="this.onerror=null;this.src=this.dataset.originalSrc"${cleanedAfter}>`;
    });
  }

  return { content: working, downloaded, kept };
}

// Phase 3: augment BaekjoonHub-format README with missing 통계 / 제한 / 힌트.
function isBaekjoonHubFormat(content) {
  // BaekjoonHub READMEs have the user-stats line "메모리: <N> KB, 시간: <N> ms".
  return /메모리[:\s]+[\d,]+\s*KB[,\s]+시간[:\s]+[\d,]+\s*ms/.test(content);
}

async function augmentBhubReadme(content, problemNum) {
  if (!isBaekjoonHubFormat(content)) return content;

  const has = (h) => new RegExp(`^#+\\s*${h}\\s*$`, 'm').test(content);
  const need = {
    stats: !has('통계'),
    limit: !has('제한'),
    hint: !has('힌트'),
  };
  // Also need problem-info table info (시간 제한 / 메모리 제한)
  // BaekjoonHub doesn't include problem limits, only user runtime stats, so always add.
  const needLimits = !/시간\s*제한[:\s]+[\d,]+/.test(content);

  if (!need.stats && !need.limit && !need.hint && !needLimits) return content;

  let html;
  try { html = await fetchBojPage(problemNum); }
  catch (e) {
    console.warn(`  ! ${problemNum} augment: ${e.message}`);
    return content;
  }

  const info = extractProblemInfo(html);
  const limitHtml = extractSection(html, 'limit');
  const hintHtml = extractSection(html, 'hint');

  const additions = [];
  if (info && needLimits) {
    additions.push(`### 문제 제한\n\n시간 제한: ${info.timeLimit}, 메모리 제한: ${info.memoryLimit}\n`);
  }
  if (info && need.stats) {
    additions.push(`### 통계\n\n제출: ${info.submitCount}, 정답: ${info.acceptCount}, 맞힌 사람: ${info.personCount}, 정답 비율: ${info.ratio}\n`);
  }
  if (need.limit && limitHtml && limitHtml.trim()) {
    additions.push(`### 제한\n\n${limitHtml}\n`);
  }
  if (need.hint && hintHtml && hintHtml.trim()) {
    additions.push(`### 힌트\n\n${hintHtml}\n`);
  }

  if (!additions.length) return content;
  // Append to end with a blank line separator
  return content.replace(/\s*$/, '') + '\n\n' + additions.join('\n');
}

// ---------- driver --------------------------------------------------------

async function processProblem(folder, problemNum) {
  const readmePath = join(folder, 'README.md');
  if (!existsSync(readmePath)) return null;
  const original = await readFile(readmePath, 'utf8');
  let content = original;

  // Compute folder path relative to repo root for use in img src URLs.
  const folderRel = folder.startsWith(ROOT + '/') ? folder.slice(ROOT.length + 1) : folder;

  // Phase 0: fix bare-filename src that already point to a local image but
  // lack the folder prefix (legacy bug from earlier script versions).
  content = content.replace(/(<img[^>]*?)src=(["'])([^"'/]+\.(?:png|jpg|jpeg|gif|svg|webp|bmp))\2/gi, (full, before, q, name) => {
    if (!existsSync(join(folder, name))) return full;
    const localUrl = encodePath(`${folderRel}/${name}`);
    return `${before}src=${q}${localUrl}${q}`;
  });

  // Phase 1: repair empty src
  content = await repairEmptySrc(content, problemNum);

  // Phase 2: localize images
  const { content: c2, downloaded, kept } = await localizeImages(content, folder, folderRel);
  content = c2;

  // Phase 3: augment BaekjoonHub READMEs
  content = await augmentBhubReadme(content, problemNum);

  if (content !== original) {
    await writeFile(readmePath, content, 'utf8');
    return { changed: true, downloaded, kept };
  }
  return { changed: false, downloaded, kept };
}

async function walkProblems() {
  const out = [];
  const bojDir = join(ROOT, '백준');
  if (!existsSync(bojDir)) return out;
  for (const tier of await readdir(bojDir)) {
    if (tier.startsWith('.')) continue;
    const tp = join(bojDir, tier);
    let s; try { s = await stat(tp); } catch { continue; }
    if (!s.isDirectory()) continue;
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
  const problems = await walkProblems();
  console.log(`scanning ${problems.length} problem folders...`);
  let touched = 0, totalDl = 0, fetched = 0;
  for (let i = 0; i < problems.length; i++) {
    const { folder, num } = problems[i];
    try {
      const r = await processProblem(folder, num);
      if (r?.changed) {
        touched++;
        totalDl += r.downloaded;
        if (r.downloaded > 0) fetched++;
      }
    } catch (e) {
      console.warn(`  ! ${num}: ${e.message}`);
    }
    if ((i + 1) % 100 === 0) {
      console.log(`  progress ${i + 1}/${problems.length} | touched ${touched}, ${totalDl} images downloaded`);
    }
    // small delay between any fetches
    await sleep(50);
  }
  console.log(`done: ${touched} READMEs updated, ${totalDl} images downloaded across ${fetched} problems`);

  // Helpful hint
  if (existsSync(join(ROOT, '백준/.assets'))) {
    console.log(`\nThe legacy shared folder 백준/.assets is no longer used.`);
    console.log(`Once you've verified the new layout, remove it with:`);
    console.log(`  rm -rf 백준/.assets`);
  }
}

main().catch(e => { console.error(e); process.exit(1); });

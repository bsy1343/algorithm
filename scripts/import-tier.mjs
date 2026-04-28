#!/usr/bin/env node
/**
 * Bulk import all BOJ problems from Bronze V to Platinum I (~23,755 problems).
 * Reuses the same logic as import-missing.mjs but:
 *   - Reads scripts/all-tiers-meta.json (pre-fetched solved.ac metadata)
 *   - Filters by tier range (env vars TIER_FROM, TIER_TO; default 1..20)
 *   - Resilient: retries on 429/5xx, idempotent skip on existing folder
 *   - Periodic progress logs to scripts/import-tier.log
 *   - Graceful: failures logged to scripts/import-tier.failed.json, script continues
 *
 * Run on Mac mini (or any always-on box):
 *   node scripts/import-tier.mjs
 *
 * Resume:
 *   Just re-run. Existing folders are skipped automatically.
 *
 * Filter to a single tier (Bronze only):
 *   TIER_FROM=1 TIER_TO=5 node scripts/import-tier.mjs
 *
 * After it's done:
 *   1) git add -A
 *   2) git commit -m "import all bronze..platinum problems"
 *   3) git push
 *   (Push will be large — split into smaller commits per tier if you prefer.)
 */
import { mkdir, writeFile, readFile, appendFile } from 'node:fs/promises';
import { existsSync } from 'node:fs';
import { join, dirname } from 'node:path';
import { fileURLToPath } from 'node:url';

import {
  tierFolder, tierFullName,
  extractSection, extractSamples, extractProblemInfo,
  buildReadme, buildJavaSkeleton,
} from './boj-lib.mjs';

const __dirname = dirname(fileURLToPath(import.meta.url));

// BaekjoonHub uses U+2005 (FOUR-PER-EM SPACE) instead of regular space in folder/file names.
// We match that exactly so when BaekjoonHub later commits the same problem, it's the SAME folder.
const BHUB_SPACE = ' ';
function safeName(s) {
  return s.replace(/\//g, '／').replace(/ /g, BHUB_SPACE);
}

const LOG_FILE = join(__dirname, 'import-tier.log');
const FAIL_FILE = join(__dirname, 'import-tier.failed.json');

async function log(line) {
  const stamped = `[${new Date().toISOString()}] ${line}\n`;
  process.stdout.write(stamped);
  try { await appendFile(LOG_FILE, stamped); } catch {}
}

function sleep(ms) { return new Promise(r => setTimeout(r, ms)); }

async function fetchWithRetry(url, { maxAttempts = 5 } = {}) {
  let attempt = 0, lastErr;
  while (attempt < maxAttempts) {
    attempt++;
    try {
      const res = await fetch(url, {
        headers: { 'User-Agent': 'Mozilla/5.0 boj-archiver/1.0' },
      });
      if (res.status === 429) {
        const wait = 30000 * attempt; // 30s, 60s, 90s, ...
        await log(`  rate-limited 429, sleeping ${wait/1000}s (attempt ${attempt})`);
        await sleep(wait);
        continue;
      }
      if (res.status >= 500) {
        const wait = 5000 * attempt;
        await log(`  ${res.status}, sleeping ${wait/1000}s (attempt ${attempt})`);
        await sleep(wait);
        continue;
      }
      if (res.status === 404) {
        return { notFound: true, status: 404 };
      }
      if (!res.ok) {
        return { error: `HTTP ${res.status}`, status: res.status };
      }
      return { html: await res.text(), status: res.status };
    } catch (e) {
      lastErr = e;
      const wait = 5000 * attempt;
      await log(`  network err: ${e.message}, sleeping ${wait/1000}s (attempt ${attempt})`);
      await sleep(wait);
    }
  }
  return { error: lastErr?.message || 'max retries exceeded' };
}

async function importOne(id, meta, { rootDir, refreshReadme = false }) {
  const safeTitle = safeName(meta.title);
  const folder = join(rootDir, '백준', tierFolder(meta.level), `${id}.${BHUB_SPACE}${safeTitle}`);
  const folderExists = existsSync(folder);
  if (folderExists && !refreshReadme) return { id, status: 'skipped' };

  const pageRes = await fetchWithRetry(`https://www.acmicpc.net/problem/${id}`);
  if (pageRes.notFound) return { id, status: 'not_found' };
  if (pageRes.error) return { id, status: 'failed', error: pageRes.error };

  const html = pageRes.html;
  const desc = extractSection(html, 'description');
  const inp = extractSection(html, 'input');
  const out = extractSection(html, 'output');
  const limit = extractSection(html, 'limit');
  const hint = extractSection(html, 'hint');
  const problemInfo = extractProblemInfo(html);
  const { inputs, outputs } = extractSamples(html);

  // Heuristic: if all sections empty, BOJ likely returned a non-problem page (e.g., login redirect)
  if (!desc && !inp && !out && inputs.length === 0) {
    return { id, status: 'failed', error: 'empty page (no sections found)' };
  }

  const readme = buildReadme({
    id,
    title: meta.title,
    tierFull: tierFullName(meta.level),
    tags: meta.tags || [],
    descriptionHtml: desc,
    inputHtml: inp,
    outputHtml: out,
    limitHtml: limit,
    hintHtml: hint,
    problemInfo,
  });

  if (folderExists && refreshReadme) {
    await writeFile(join(folder, 'README.md'), readme, 'utf8');
    return { id, status: 'readme-refreshed' };
  }

  await mkdir(folder, { recursive: true });
  await writeFile(join(folder, 'README.md'), readme, 'utf8');
  await writeFile(join(folder, `${safeTitle}.java`), buildJavaSkeleton(meta.title), 'utf8');
  for (let i = 0; i < inputs.length; i++) {
    await writeFile(join(folder, `input${i + 1}.txt`), inputs[i], 'utf8');
  }
  for (let i = 0; i < outputs.length; i++) {
    await writeFile(join(folder, `output${i + 1}.txt`), outputs[i], 'utf8');
  }
  return { id, status: 'imported', samples: Math.max(inputs.length, outputs.length) };
}

async function main() {
  const rootDir = process.cwd();
  const tierFrom = parseInt(process.env.TIER_FROM || '1', 10);  // Bronze V
  const tierTo = parseInt(process.env.TIER_TO || '20', 10);     // Platinum I
  const delayMs = parseInt(process.env.DELAY_MS || '500', 10);
  const refreshReadme = process.env.REFRESH_README === '1';

  const metaJson = await readFile(join(__dirname, 'all-tiers-meta.json'), 'utf8');
  const meta = JSON.parse(metaJson);

  // Filter + sort by id
  const ids = Object.keys(meta)
    .filter(id => meta[id].level >= tierFrom && meta[id].level <= tierTo)
    .map(Number)
    .sort((a, b) => a - b);

  await log(`begin: ${ids.length} problems in tier range [${tierFrom}..${tierTo}], delay ${delayMs}ms${refreshReadme ? ', refresh-readme mode' : ''}`);

  let imported = 0, refreshed = 0, skipped = 0, notFound = 0, failed = 0;
  const failures = [];

  for (let i = 0; i < ids.length; i++) {
    const id = ids[i];
    const m = meta[id];
    let lastStatus = null;
    try {
      const r = await importOne(id, m, { rootDir, refreshReadme });
      lastStatus = r.status;
      if (r.status === 'imported') imported++;
      else if (r.status === 'readme-refreshed') refreshed++;
      else if (r.status === 'skipped') skipped++;
      else if (r.status === 'not_found') { notFound++; failures.push({ id, reason: '404' }); }
      else { failed++; failures.push({ id, reason: r.error }); }
    } catch (e) {
      failed++;
      failures.push({ id, reason: e.message });
      await log(`  ! ${id}: ${e.message}`);
    }

    // Progress every 50 problems
    if ((i + 1) % 50 === 0 || i === ids.length - 1) {
      await log(`progress ${i + 1}/${ids.length} | imported ${imported} refreshed ${refreshed} skipped ${skipped} notFound ${notFound} failed ${failed} (current id ${id})`);
    }

    // Polite delay only when we actually hit BOJ. existsSync skip = no network.
    if (lastStatus !== 'skipped') {
      await sleep(delayMs);
    }
  }

  await writeFile(FAIL_FILE, JSON.stringify(failures, null, 2));
  await log(`done: imported ${imported}, skipped ${skipped}, notFound ${notFound}, failed ${failed}`);
  await log(`failures saved to ${FAIL_FILE}`);
}

if (process.argv[1] && fileURLToPath(import.meta.url) === process.argv[1]) {
  main().catch(e => { console.error(e); process.exit(1); });
}

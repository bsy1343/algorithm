#!/usr/bin/env node
/**
 * Import missing BOJ problems from boja.mercury.kr (community archive)
 * for tiers Bronze V .. Platinum I (level 1..20). Skips IDs already in 백준/.
 *
 * Run:  node scripts/import-from-boja.mjs
 *
 * Env:
 *   TIER_FROM (default 1), TIER_TO (default 20)
 *   DRY_RUN=1     list missing count and exit (no fetch of detail shards)
 *   DELAY_MS      per-shard delay in ms (default 100)
 *
 * Output:
 *   백준/<Tier>/<id>. <title>/
 *     ├─ README.md
 *     ├─ <title>.java          (skeleton — user fills in)
 *     ├─ input{N}.txt          (sample inputs)
 *     └─ output{N}.txt         (sample outputs)
 *
 *   On failure, ids logged to scripts/import-from-boja.failed.json
 */
import { mkdir, writeFile } from 'node:fs/promises';
import { existsSync, readdirSync } from 'node:fs';
import { join, dirname } from 'node:path';
import { fileURLToPath } from 'node:url';
import { tierFolder, tierFullName, buildReadme, buildJavaSkeleton } from './boj-lib.mjs';

const __dirname = dirname(fileURLToPath(import.meta.url));
const ROOT = join(__dirname, '..');
const BASE = 'https://boja.mercury.kr/data';
const UA = 'Mozilla/5.0 boj-study-viewer/1.0 (personal use)';
// BaekjoonHub uses U+2005 (FOUR-PER-EM SPACE) instead of a regular space in folder/file names.
const BHUB_SPACE = ' ';

const log = (...a) => console.log('[boja]', ...a);

async function fetchJson(url, attempts = 3) {
  let lastErr;
  for (let i = 0; i < attempts; i++) {
    try {
      const res = await fetch(url, { headers: { 'User-Agent': UA } });
      if (!res.ok) throw new Error(`HTTP ${res.status}`);
      return await res.json();
    } catch (e) {
      lastErr = e;
      await new Promise(r => setTimeout(r, 500 * (i + 1)));
    }
  }
  throw lastErr;
}

function safeName(s) {
  // Match BaekjoonHub: replace `/` with U+FF0F, swap regular space for U+2005.
  return s.replace(/\//g, '／').replace(/ /g, BHUB_SPACE);
}

function getLocalIds() {
  const ids = new Set();
  const root = join(ROOT, '백준');
  for (const tier of readdirSync(root)) {
    const td = join(root, tier);
    let entries;
    try { entries = readdirSync(td); } catch { continue; }
    for (const f of entries) {
      const m = f.match(/^(\d+)\./);
      if (m) ids.add(parseInt(m[1], 10));
    }
  }
  return ids;
}

function blockHtml(blocks, langKey) {
  const b = blocks?.find(x => x.type === 'section' && x.langKey === langKey);
  return (b?.html || '').trim();
}

function getSamples(blocks) {
  const samples = (blocks || [])
    .filter(b => b.type === 'sample')
    .sort((a, b) => (a.index ?? 0) - (b.index ?? 0));
  return {
    inputs: samples.map(s => s.input ?? ''),
    outputs: samples.map(s => s.output ?? ''),
  };
}

function getProblemInfo(p) {
  const v = p?.info?.values;
  if (!Array.isArray(v) || v.length < 6) return null;
  return {
    timeLimit: v[0],
    memoryLimit: v[1],
    submitCount: v[2],
    acceptCount: v[3],
    personCount: v[4],
    ratio: v[5],
  };
}

async function importOne(p, tagMap) {
  const safeTitle = safeName(p.title);
  const folder = join(ROOT, '백준', tierFolder(p.tier), `${p.id}.${BHUB_SPACE}${safeTitle}`);
  if (existsSync(folder)) return 'skipped';

  const desc = blockHtml(p.blocks, 'description');
  const inp = blockHtml(p.blocks, 'input');
  const out = blockHtml(p.blocks, 'output');
  const limit = blockHtml(p.blocks, 'limit');
  const hint = blockHtml(p.blocks, 'hint');
  const { inputs, outputs } = getSamples(p.blocks);
  const tags = (p.tagIds || []).map(id => tagMap[id]).filter(Boolean);

  const readme = buildReadme({
    id: p.id,
    title: p.title,
    tierFull: tierFullName(p.tier),
    tags,
    descriptionHtml: desc,
    inputHtml: inp,
    outputHtml: out,
    limitHtml: limit,
    hintHtml: hint,
    problemInfo: getProblemInfo(p),
  });

  await mkdir(folder, { recursive: true });
  await writeFile(join(folder, 'README.md'), readme, 'utf8');
  await writeFile(join(folder, `${safeTitle}.java`), buildJavaSkeleton(p.title), 'utf8');
  for (let i = 0; i < inputs.length; i++) {
    await writeFile(join(folder, `input${i + 1}.txt`), inputs[i], 'utf8');
  }
  for (let i = 0; i < outputs.length; i++) {
    await writeFile(join(folder, `output${i + 1}.txt`), outputs[i], 'utf8');
  }
  return 'imported';
}

async function main() {
  const tierFrom = parseInt(process.env.TIER_FROM || '1', 10);
  const tierTo = parseInt(process.env.TIER_TO || '20', 10);
  const dryRun = process.env.DRY_RUN === '1';
  const delayMs = parseInt(process.env.DELAY_MS || '100', 10);

  log('fetching manifest...');
  const manifest = await fetchJson(`${BASE}/manifest.json`);
  const tagMap = Object.fromEntries((manifest.tags || []).map(t => [t.id, t.name]));

  log(`scanning ${manifest.problemIndexShards.length} index shards...`);
  const remote = new Map(); // id -> tier
  for (const s of manifest.problemIndexShards) {
    const idx = await fetchJson(`${BASE}/problem-index/${s}.json`);
    for (const p of idx.problems) {
      if (p.tier >= tierFrom && p.tier <= tierTo) remote.set(p.id, p.tier);
    }
  }
  log(`remote tier ${tierFrom}..${tierTo}: ${remote.size}`);

  const localIds = getLocalIds();
  const missing = [...remote.keys()].filter(id => !localIds.has(id)).sort((a, b) => a - b);
  log(`local: ${localIds.size}, missing: ${missing.length}`);

  if (dryRun) {
    const c = { Bronze: 0, Silver: 0, Gold: 0, Platinum: 0 };
    for (const id of missing) c[tierFolder(remote.get(id))]++;
    log(`Bronze ${c.Bronze}, Silver ${c.Silver}, Gold ${c.Gold}, Platinum ${c.Platinum}`);
    log(`first 30: ${missing.slice(0, 30).join(', ')}`);
    return;
  }

  // Group missing by detail shard (id // 100). Each shard holds 100 problems.
  const byShard = new Map();
  for (const id of missing) {
    const s = Math.floor(id / 100);
    if (!byShard.has(s)) byShard.set(s, []);
    byShard.get(s).push(id);
  }
  const shardKeys = [...byShard.keys()].sort((a, b) => a - b);
  log(`will fetch ${shardKeys.length} detail shards (delay ${delayMs}ms)`);

  const failures = [];
  let imported = 0, skipped = 0, failed = 0;

  for (let i = 0; i < shardKeys.length; i++) {
    const sk = shardKeys[i];
    let detail;
    try {
      detail = await fetchJson(`${BASE}/problems/${sk}.json`);
    } catch (e) {
      log(`! shard ${sk}: ${e.message}`);
      for (const id of byShard.get(sk)) failures.push({ id, reason: `shard fetch: ${e.message}` });
      failed += byShard.get(sk).length;
      continue;
    }
    const byId = new Map(detail.problems.map(p => [p.id, p]));

    for (const id of byShard.get(sk)) {
      const p = byId.get(id);
      if (!p) { failures.push({ id, reason: 'not in detail shard' }); failed++; continue; }
      try {
        const r = await importOne(p, tagMap);
        if (r === 'imported') imported++;
        else if (r === 'skipped') skipped++;
      } catch (e) {
        failures.push({ id, reason: e.message });
        failed++;
        log(`! ${id}: ${e.message}`);
      }
    }
    if ((i + 1) % 10 === 0 || i === shardKeys.length - 1) {
      log(`progress shard ${i + 1}/${shardKeys.length} | imported ${imported} skipped ${skipped} failed ${failed}`);
    }
    if (delayMs > 0) await new Promise(r => setTimeout(r, delayMs));
  }

  log(`done. imported ${imported}, skipped ${skipped}, failed ${failed}`);
  if (failures.length) {
    const failPath = join(__dirname, 'import-from-boja.failed.json');
    await writeFile(failPath, JSON.stringify(failures, null, 2));
    log(`failures → ${failPath}`);
  }
}

main().catch(e => {
  console.error(e);
  process.exit(1);
});

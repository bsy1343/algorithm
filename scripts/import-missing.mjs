#!/usr/bin/env node
/**
 * Bulk-import BOJ problems that exist in the user's solved list but are
 * missing from the local repo. Output mirrors BaekjoonHub's format:
 *   백준/{Tier}/{id}. {title}/
 *     ├─ README.md
 *     ├─ {title}.java          (skeleton — user fills in)
 *     ├─ input{N}.txt          (sample inputs)
 *     └─ output{N}.txt         (sample outputs)
 *
 * Inputs:
 *   - scripts/import-missing-meta.json  ← solved.ac metadata (title/level/tags)
 *   - https://www.acmicpc.net/problem/{id}  ← public, no auth needed
 *
 * Run:  node scripts/import-missing.mjs
 */
import { mkdir, writeFile, readFile } from 'node:fs/promises';
import { existsSync } from 'node:fs';
import { join, dirname } from 'node:path';
import { fileURLToPath } from 'node:url';

const __dirname = dirname(fileURLToPath(import.meta.url));

const TIER_NAMES = ['Bronze', 'Silver', 'Gold', 'Platinum', 'Diamond', 'Ruby', 'Master'];
const SUBS = ['I', 'II', 'III', 'IV', 'V'];

export function tierFolder(level) {
  if (!level) return 'Unrated';
  return TIER_NAMES[Math.floor((level - 1) / 5)];
}

export function tierFullName(level) {
  if (!level) return 'Unrated';
  const tier = Math.floor((level - 1) / 5);
  const sub = 5 - ((level - 1) % 5);
  return `${TIER_NAMES[tier]} ${SUBS[sub - 1]}`;
}

function decodeEntities(s) {
  return s
    .replace(/&lt;/g, '<')
    .replace(/&gt;/g, '>')
    .replace(/&quot;/g, '"')
    .replace(/&#39;/g, "'")
    .replace(/&amp;/g, '&');
}

export function extractSection(html, baseId) {
  // BOJ structure: <section id="X"> ... <div id="problem_X"> ...content... </div> </section>
  const re = new RegExp(`<div id="problem_${baseId}"[^>]*>([\\s\\S]*?)</section>`);
  const m = html.match(re);
  if (!m) return '';
  let body = m[1];
  // Strip the closing </div> of the problem_X wrapper that we kept inside
  body = body.replace(/\s*<\/div>\s*$/, '');
  return body.trim();
}

// Pulls the problem-info table at the top of every BOJ problem page.
// Returns { timeLimit, memoryLimit, submitCount, acceptCount, personCount, ratio }
export function extractProblemInfo(html) {
  const m = html.match(/<table[^>]*id="problem-info"[^>]*>([\s\S]*?)<\/table>/);
  if (!m) return null;
  const cells = [...m[1].matchAll(/<td[^>]*>([\s\S]*?)<\/td>/g)].map(x =>
    x[1].replace(/<[^>]+>/g, '').replace(/&nbsp;/g, ' ').trim()
  );
  if (cells.length < 6) return null;
  return {
    timeLimit: cells[0],
    memoryLimit: cells[1],
    submitCount: cells[2],
    acceptCount: cells[3],
    personCount: cells[4],
    ratio: cells[5],
  };
}

export function extractSamples(html) {
  const inputs = [], outputs = [];
  const re = /<pre[^>]+id="sample-(input|output)-(\d+)"[^>]*>([\s\S]*?)<\/pre>/g;
  for (const m of html.matchAll(re)) {
    const kind = m[1];
    const num = parseInt(m[2], 10);
    const text = decodeEntities(m[3]).replace(/\r\n/g, '\n');
    if (kind === 'input') inputs[num - 1] = text;
    else outputs[num - 1] = text;
  }
  // Filter out undefined gaps just in case BOJ uses non-sequential numbering
  return {
    inputs: inputs.filter(x => x !== undefined),
    outputs: outputs.filter(x => x !== undefined),
  };
}

export function buildReadme({
  id, title, tierFull, tags,
  descriptionHtml, inputHtml, outputHtml,
  limitHtml = '', hintHtml = '',
  problemInfo = null,
}) {
  const tagsLine = tags.length ? tags.join(', ') : '(분류 없음)';

  let perf = '';
  if (problemInfo) {
    perf = `### 성능 요약

시간 제한: ${problemInfo.timeLimit}, 메모리 제한: ${problemInfo.memoryLimit}

### 통계

제출: ${problemInfo.submitCount}, 정답: ${problemInfo.acceptCount}, 맞힌 사람: ${problemInfo.personCount}, 정답 비율: ${problemInfo.ratio}

`;
  }

  let body = `# [${tierFull}] ${title} - ${id}

[문제 링크](https://www.acmicpc.net/problem/${id})

${perf}### 분류

${tagsLine}

### 문제 설명

${descriptionHtml}

### 입력

${inputHtml}

### 출력

${outputHtml}`;

  if (limitHtml && limitHtml.trim()) {
    body += `\n\n### 제한\n\n${limitHtml}`;
  }
  if (hintHtml && hintHtml.trim()) {
    body += `\n\n### 힌트\n\n${hintHtml}`;
  }
  return body;
}

export function buildJavaSkeleton(title) {
  return `import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO: ${title}
    }
}
`;
}

// Filesystem-safe title: replace `/` with fullwidth solidus (matches BaekjoonHub behavior).
function safeName(s) {
  return s.replace(/\//g, '／');
}

// BaekjoonHub uses U+2005 (FOUR-PER-EM SPACE) instead of regular space in folder/file names.
// We match that to avoid creating duplicate folders when BaekjoonHub later commits the same problem.
const BHUB_SPACE = ' ';
function bhubName(s) {
  return s.replace(/\//g, '／').replace(/ /g, BHUB_SPACE);
}

export async function importProblem(id, meta, { rootDir = '.', fetchImpl = fetch, refreshReadme = false } = {}) {
  const safeTitle = bhubName(meta.title);
  const folder = join(rootDir, '백준', tierFolder(meta.level), `${id}.${BHUB_SPACE}${safeTitle}`);
  const folderExists = existsSync(folder);

  if (folderExists && !refreshReadme) return { id, status: 'skipped', folder };

  const res = await fetchImpl(`https://www.acmicpc.net/problem/${id}`, {
    headers: { 'User-Agent': 'Mozilla/5.0 boj-archiver/1.0' },
  });
  if (!res.ok) throw new Error(`BOJ HTTP ${res.status}`);
  const html = await res.text();

  const desc = extractSection(html, 'description');
  const inp = extractSection(html, 'input');
  const out = extractSection(html, 'output');
  const limit = extractSection(html, 'limit');
  const hint = extractSection(html, 'hint');
  const problemInfo = extractProblemInfo(html);
  const { inputs, outputs } = extractSamples(html);

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
    // README only — leave Java and input/output files alone (user may have edited them).
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
  const refreshReadme = process.env.REFRESH_README === '1';
  const metaJson = await readFile(join(__dirname, 'import-missing-meta.json'), 'utf8');
  const meta = JSON.parse(metaJson);
  const ids = Object.keys(meta).map(Number).sort((a, b) => a - b);

  console.log(`importing ${ids.length} problems${refreshReadme ? ' (refresh README mode)' : ''}...`);
  let imported = 0, refreshed = 0, skipped = 0, failed = 0;
  for (const id of ids) {
    try {
      const r = await importProblem(id, meta[id], { rootDir, refreshReadme });
      if (r.status === 'imported') {
        console.log(`  ok ${id} ${meta[id].title} (${r.samples} samples)`);
        imported++;
      } else if (r.status === 'readme-refreshed') {
        console.log(`  refresh ${id} ${meta[id].title}`);
        refreshed++;
      } else {
        console.log(`  skip ${id} (already exists)`);
        skipped++;
      }
    } catch (e) {
      console.error(`  fail ${id}: ${e.message}`);
      failed++;
    }
    // Be polite to BOJ
    await new Promise(r => setTimeout(r, 600));
  }
  console.log(`done: ${imported} imported, ${refreshed} refreshed, ${skipped} skipped, ${failed} failed`);
}

if (process.argv[1] && fileURLToPath(import.meta.url) === process.argv[1]) {
  main().catch(e => { console.error(e); process.exit(1); });
}

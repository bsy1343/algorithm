#!/usr/bin/env node
/**
 * Builds data/tree-cache.json — a flat list of {type, path[, size]} for every
 * blob under 백준/. The viewer fetches this static file instead of calling
 * the GitHub Tree API, which removes the rate-limit risk and makes initial
 * load a CDN-cached download (~10ms vs API ~500ms).
 *
 * Run locally:
 *   node scripts/build-tree-cache.mjs
 *
 * In CI: triggered by .github/workflows/build-tree-cache.yml on push to main.
 *
 * Output format mirrors the slimmed structure the viewer already consumes
 * (Api.slimTree), so the viewer only needs a tiny adapter.
 */
import { readdir, stat, mkdir, writeFile } from 'node:fs/promises';
import { join, dirname, relative } from 'node:path';
import { fileURLToPath } from 'node:url';

const __dirname = dirname(fileURLToPath(import.meta.url));
const ROOT = join(__dirname, '..');
const OUT = join(ROOT, 'data/tree-cache.json');

async function* walk(dir) {
  let entries;
  try { entries = await readdir(dir, { withFileTypes: true }); }
  catch { return; }
  for (const ent of entries) {
    if (ent.name.startsWith('.')) continue;
    const p = join(dir, ent.name);
    if (ent.isDirectory()) yield* walk(p);
    else if (ent.isFile()) yield p;
  }
}

async function main() {
  const tree = [];
  const baseDir = join(ROOT, '백준');
  for await (const file of walk(baseDir)) {
    const rel = relative(ROOT, file).split(/[/\\]/).join('/');
    const e = { type: 'blob', path: rel };
    // Java skeleton vs. real solution detection in viewer needs size.
    if (rel.toLowerCase().endsWith('.java')) {
      const s = await stat(file);
      e.size = s.size;
    }
    tree.push(e);
  }
  // Stable order: helps git produce minimal diffs commit-to-commit.
  tree.sort((a, b) => a.path < b.path ? -1 : a.path > b.path ? 1 : 0);

  await mkdir(dirname(OUT), { recursive: true });
  const out = {
    generatedAt: new Date().toISOString(),
    count: tree.length,
    tree,
  };
  await writeFile(OUT, JSON.stringify(out));
  console.log(`[tree] wrote ${OUT}  (${tree.length} entries, ${(JSON.stringify(out).length / 1024).toFixed(1)} KB)`);
}

main().catch(e => { console.error(e); process.exit(1); });

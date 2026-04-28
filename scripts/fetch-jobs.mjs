#!/usr/bin/env node
/**
 * Bulk fetch IT job postings from configured companies.
 *   - data/jobs-config.json   user-editable (companies + filters)
 *   - data/jobs-latest.json   auto-generated output
 *
 * Run: node scripts/fetch-jobs.mjs
 *      DEBUG=1 node scripts/fetch-jobs.mjs   (verbose logs)
 *
 * Fetchers:
 *   greenhouse-api   public Greenhouse boards API
 *   next-data        scrape __NEXT_DATA__ JSON inline
 *   playwright       headless browser for SPA pages (chromium)
 */
import { readFile, writeFile } from 'node:fs/promises';
import { join, dirname } from 'node:path';
import { fileURLToPath } from 'node:url';

const __dirname = dirname(fileURLToPath(import.meta.url));
const ROOT = join(__dirname, '..');
const CONFIG_PATH = join(ROOT, 'data/jobs-config.json');
const OUTPUT_PATH = join(ROOT, 'data/jobs-latest.json');

const UA = 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/130.0.0.0 Safari/537.36';
const log = (...a) => console.log('[jobs]', ...a);

async function fetchGreenhouse({ board }) {
  const res = await fetch(`https://boards-api.greenhouse.io/v1/boards/${board}/jobs?content=false`, { headers: { 'User-Agent': UA } });
  if (!res.ok) throw new Error(`greenhouse HTTP ${res.status}`);
  const { jobs } = await res.json();
  return jobs.map(j => ({
    title: j.title,
    department: j.departments?.[0]?.name || '',
    location: j.location?.name || '',
    deadline: '',
    url: j.absolute_url,
  }));
}

async function fetchNextData({ url, matchKeys }) {
  // Retry on transient 5xx — Next.js SSR sites occasionally fail.
  let html, lastErr;
  for (let attempt = 1; attempt <= 4; attempt++) {
    try {
      const res = await fetch(url, { headers: { 'User-Agent': UA } });
      if (res.ok) { html = await res.text(); break; }
      if (res.status >= 500 && attempt < 4) {
        log(`   next-data ${res.status} on attempt ${attempt}, retrying after ${attempt * 5}s`);
        await new Promise(r => setTimeout(r, attempt * 5000));
        continue;
      }
      throw new Error(`next-data HTTP ${res.status}`);
    } catch (e) {
      lastErr = e;
      if (attempt < 4) {
        log(`   next-data error (${e.message}), retrying after ${attempt * 5}s`);
        await new Promise(r => setTimeout(r, attempt * 5000));
      }
    }
  }
  if (!html) throw lastErr || new Error('next-data: max retries exceeded');
  const m = html.match(/<script id="__NEXT_DATA__"[^>]*>([\s\S]*?)<\/script>/);
  if (!m) throw new Error('no __NEXT_DATA__');
  const data = JSON.parse(m[1]);
  const required = matchKeys || ['title'];
  let target = null;
  const find = (o, depth = 0) => {
    if (target || depth > 12) return;
    if (Array.isArray(o) && o.length > 0 && o[0] && typeof o[0] === 'object'
        && required.every(k => k in o[0])) { target = o; return; }
    if (o && typeof o === 'object') for (const k in o) find(o[k], depth + 1);
  };
  find(data);
  if (!target) throw new Error('no jobs array');
  return target.map(j => ({
    title: j.title,
    department: j.workspaceDivision?.division || j.team?.name || j.department || '',
    location: j.location || '',
    deadline: j.dueDate ? j.dueDate.slice(0, 10) : '',
    url: j.openingId ? `${url.split('?')[0]}/${j.openingId}` : '',
  }));
}

let browserHandle = null;
async function getBrowser() {
  if (browserHandle) return browserHandle;
  const mod = await import('playwright');
  browserHandle = await mod.chromium.launch({ headless: true });
  return browserHandle;
}

async function fetchPlaywright(params) {
  const { url, selector, scrollPasses = 6, parseFromBodyText, filterByText, clickFilters, extractNextData, matchKeys, reloadOnFirstLoad } = params;
  const browser = await getBrowser();
  const ctx = await browser.newContext({ userAgent: UA });
  const page = await ctx.newPage();
  try {
    await page.goto(url, { waitUntil: 'domcontentloaded', timeout: 30000 });
    await page.waitForTimeout(3500);
    // Some SPAs (e.g. LG U+ careers channel) only show data after a reload.
    if (reloadOnFirstLoad) {
      await page.reload({ waitUntil: 'domcontentloaded' });
      await page.waitForTimeout(3500);
    }
    // For anchor-based extraction, wait until the selector actually appears (SPA hydration).
    if (selector) {
      try { await page.waitForSelector(selector, { timeout: 10000 }); } catch {}
    }

    // Click filter labels (e.g. CJ filter UI: IT, 경력)
    if (clickFilters && clickFilters.length) {
      for (const target of clickFilters) {
        await page.evaluate(t => {
          const labels = [...document.querySelectorAll('label, button')];
          const lbl = labels.find(l => l.textContent?.trim() === t);
          if (lbl) lbl.click();
        }, target);
        await page.waitForTimeout(800);
      }
    }

    for (let i = 0; i < scrollPasses; i++) {
      await page.evaluate(() => window.scrollTo(0, document.body.scrollHeight));
      await page.waitForTimeout(500);
    }
    await page.waitForTimeout(800);

    if (extractNextData) {
      // Render with Playwright (avoids 5xx from headless fetch UA), then parse __NEXT_DATA__.
      const html = await page.content();
      const m = html.match(/<script id="__NEXT_DATA__"[^>]*>([\s\S]*?)<\/script>/);
      if (!m) throw new Error('no __NEXT_DATA__ in rendered page');
      const data = JSON.parse(m[1]);
      const required = matchKeys || ['title'];
      let target = null;
      const find = (o, depth = 0) => {
        if (target || depth > 12) return;
        if (Array.isArray(o) && o.length > 0 && o[0] && typeof o[0] === 'object'
            && required.every(k => k in o[0])) { target = o; return; }
        if (o && typeof o === 'object') for (const k in o) find(o[k], depth + 1);
      };
      find(data);
      if (!target) throw new Error('no jobs array in __NEXT_DATA__');
      return target.map(j => ({
        title: j.title,
        department: j.workspaceDivision?.division || j.team?.name || j.department || '',
        location: j.location || '',
        deadline: j.dueDate ? j.dueDate.slice(0, 10) : '',
        url: j.openingId ? `${url.split('?')[0]}/${j.openingId}` : '',
      }));
    }

    if (parseFromBodyText) {
      // Collapse blank lines so patterns can use a single \n between fields.
      const text = (await page.evaluate(() => document.body.innerText))
        .replace(/\n{2,}/g, '\n');
      const jobs = [];
      const seen = new Set();
      const push = (title, deadline, dept, loc) => {
        const t = title.replace(/^공유\s*/, '').trim();
        if (!t || t.length < 5 || /^채용|^전체|^본문|^로그인|^더보기|^선택|^등록일|^신규/.test(t)) return;
        const k = t + '|' + deadline;
        if (seen.has(k)) return;
        seen.add(k);
        jobs.push({ title: t, department: (dept||'').trim(), location: (loc||'').trim(), deadline: deadline.trim(), url: '' });
      };
      // Pattern A (현대차 style — 6 lines): title \n D-N \n tag \n tag \n tag \n tag
      const reA = /([^\n]{5,150})\n(D-\d+|채용시까지|상시|마감)\n([^\n]+)\n([^\n]+)\n([^\n]+)\n([^\n]+)/g;
      let m;
      while ((m = reA.exec(text)) !== null) push(m[1], m[2], m[6] || m[3], m[5]);
      // Pattern B (CJ — 8 lines): title \n co \n D-N \n date~date \n career \n type \n loc \n dept
      const reB = /([^\n]{5,150})\n([^\n]+)\n(D-\d+|상시|마감|채용시까지)\n(\d{4}\.\d{2}\.\d{2}[^\n]*)\n([^\n]+)\n([^\n]+)\n([^\n]+)\n([^\n]+)/g;
      while ((m = reB.exec(text)) !== null) push(m[1], m[3], m[8], m[7]);
      // Pattern C (LG CNS — 7 lines): co \n [co] title \n D-N \n date \n career \n co \n category
      const reC = /([^\n]+)\n\[[^\]]+\]\s*([^\n]{3,150})\n(D-\d+|상시|마감|채용시까지)\n(\d{4}\.\d{2}\.\d{2}[^\n]*)\n([^\n]+)\n([^\n]+)\n([^\n]+)/g;
      while ((m = reC.exec(text)) !== null) push(m[2], m[3], m[7], '');
      return jobs;
    }

    const items = await page.evaluate((args) => {
      const anchors = [...document.querySelectorAll(args.selector)];
      const out = [];
      const seen = new Set();
      for (const a of anchors) {
        if (args.filterByText && !a.innerText?.includes(args.filterByText)) continue;
        const text = a.innerText?.replace(/\s+/g, ' ').trim() || '';
        if (text.length < 5 || text.length > 400) continue;
        const href = a.href || '';
        if (seen.has(href + '|' + text)) continue;
        seen.add(href + '|' + text);
        out.push({ text, href });
      }
      return out;
    }, { selector, filterByText });

    return items.map(({ text, href }) => {
      // D-N takes precedence; fall back to absolute date in either format.
      const dl = text.match(/D-\d+|상시|채용시까지|채용종료시|마감|\d{4}\.\d{2}\.\d{2}|\d{4}년\s?\d{1,2}월\s?\d{1,2}일/);
      return {
        title: text.split('\n')[0].split(/\s{2,}|・|\|/)[0].trim().slice(0, 200),
        department: '',
        location: '',
        deadline: dl ? dl[0] : '',
        url: href,
        _raw: text.slice(0, 200),
      };
    });
  } finally {
    await page.close();
    await ctx.close();
  }
}

function passesFilter(job, filters) {
  const text = `${job.title} ${job.department} ${job._raw || ''}`.toLowerCase();
  for (const ex of filters.exclude) {
    if (text.includes(ex.toLowerCase())) return false;
  }
  for (const inc of filters.include) {
    if (text.includes(inc.toLowerCase())) return true;
  }
  return false;
}

async function main() {
  const config = JSON.parse(await readFile(CONFIG_PATH, 'utf8'));
  const filters = config.filters;
  const companies = config.companies.filter(c => c.enabled !== false);
  log(`fetching ${companies.length} companies`);

  const results = [];
  const errors = [];

  for (const c of companies) {
    log(`-> ${c.name} (${c.fetcher})`);
    try {
      let raw;
      if (c.fetcher === 'greenhouse-api') raw = await fetchGreenhouse(c.params);
      else if (c.fetcher === 'next-data') raw = await fetchNextData(c.params);
      else if (c.fetcher === 'playwright') raw = await fetchPlaywright(c.params);
      else throw new Error(`unknown fetcher: ${c.fetcher}`);
      const filtered = raw.filter(j => passesFilter(j, filters)).map(j => ({
        company: c.name, companyId: c.id, ...j,
      }));
      log(`   raw=${raw.length} filtered=${filtered.length}`);
      results.push(...filtered);
    } catch (e) {
      console.error(`   ERROR: ${e.message}`);
      errors.push({ company: c.name, error: e.message });
    }
    await new Promise(r => setTimeout(r, 1500));
  }

  if (browserHandle) await browserHandle.close();

  const out = {
    fetchedAt: new Date().toISOString(),
    totalCount: results.length,
    companies: companies.map(c => c.name),
    errors,
    jobs: results.sort((a, b) => (a.deadline || 'zzz').localeCompare(b.deadline || 'zzz')),
  };
  await writeFile(OUTPUT_PATH, JSON.stringify(out, null, 2));
  log(`done: ${results.length} jobs across ${companies.length} companies (${errors.length} errors)`);
  log(`saved to ${OUTPUT_PATH}`);
}

main().catch(e => { console.error('FATAL:', e); process.exit(1); });

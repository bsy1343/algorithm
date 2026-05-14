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
// Hanwha-only: hits the public search-rcrt JSON endpoint that the SPA calls
// internally. Filters (계열사 / 직무 / 채용구분) are passed as IDs the official
// portal uses; resolve them via search-sbsd & search-rcrt-job once and store
// in jobs-config.json.
async function fetchHanwhaApi(params) {
  const {
    sdSeqList = null, rjSeqList = null, djSeqList = null,
    rtCarrYn = '', rtNrcrtYn = '', rtIntnYn = '',
    rtPermanentWorkYn = '', rtTempWorkYn = '',
  } = params;
  const body = {
    langCd: 'ko', searchText: '',
    sdSeqList: sdSeqList?.length ? sdSeqList : null,
    rtNrcrtYn, rtCarrYn, rtIntnYn, rtPermanentWorkYn, rtTempWorkYn,
    djSeqList: djSeqList?.length ? djSeqList : null,
    rjSeqList: rjSeqList?.length ? rjSeqList : null,
    page: 0, size: 200,
  };
  const r = await fetch('https://hwadm.hanwhain.com/new-backend/portal/api/rcRecruit/search-rcrt', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json', 'User-Agent': UA },
    body: JSON.stringify(body),
  });
  if (!r.ok) throw new Error(`Hanwha HTTP ${r.status}`);
  const d = await r.json();
  const items = d?.data?.list || d?.data?.content || [];
  return items.map(it => {
    // rtAcptEndDttm format: "2026.05.08 15:00" — KST local time.
    const m = (it.rtAcptEndDttm || '').match(/(\d{4})\.(\d{2})\.(\d{2})\s+(\d{2}):(\d{2})/);
    return {
      title: it.rtNm || '',
      department: it.sdNm || '',
      location: '',
      deadline: m ? `${m[1]}-${m[2]}-${m[3]}` : '',
      deadlineTime: m ? `${m[4]}:${m[5]}` : '',
      url: `https://www.hanwhain.com/portal/apply/recruit/detail?rtSeq=${it.rtSeq}`,
    };
  });
}

// CJ careers portal — same trick as Hanwha: hit the JSON endpoint the SPA
// already calls (recruit.cj.net/.../searchNewGonggoList.fo). Filters
// (채용구분 / 직무 / 주관사) are passed as the codes the site uses.
async function fetchCjApi(params) {
  const {
    arrGubun = '',     // 채용구분: B=경력, A=신입
    arrRecJob = '',    // 직무: IR=IT, etc.
    arrRecBu = '',     // 주관사 (계열사 코드)
    arrRecArea = '',   // 지역
    pageSize = 200,    // tot_cnt 181 → 200이면 한 번에 다 받음
  } = params;
  const body = {
    pageVal: '1',
    pageIndex: String(pageSize),
    orderDesc: '1',
    sch_title: '',
    arrGubun,
    arrRecBu,
    arrRecJob,
    arrRecArea,
    schArea: arrGubun || arrRecJob || arrRecBu || arrRecArea ? 'Y' : 'N',
    recGubunbox: arrGubun,
    recJobbox: arrRecJob,
  };
  const r = await fetch('https://recruit.cj.net/recruit/ko/recruit/recruit/searchNewGonggoList.fo', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
      'User-Agent': UA,
      'Accept': 'application/json, text/plain, */*',
      'Origin': 'https://recruit.cj.net',
      'Referer': 'https://recruit.cj.net/recruit/ko/recruit/recruit/list.fo',
    },
    body: JSON.stringify(body),
  });
  if (!r.ok) throw new Error(`CJ HTTP ${r.status}`);
  const d = await r.json();
  const items = d?.ds_newRecruitList || [];
  return items.map(it => {
    const dl = it.zz_end_dt_str ? it.zz_end_dt_str.replace(/\./g, '-') : '';
    const tm = (it.zz_end_hh && it.zz_end_mi) ? `${it.zz_end_hh}:${it.zz_end_mi}` : '';
    return {
      title: it.zz_title || '',
      // department gets "회사명 / 직무" so the calendar entry shows which CJ
      // subsidiary (올리브영 vs 올리브네트웍스 vs 4DPLEX) the posting is for.
      department: it.compnm
        ? `${it.compnm}${it.job_cd_nm ? ' / ' + it.job_cd_nm : ''}`
        : (it.job_cd_nm || ''),
      location: it.location_cd_nm || '',
      deadline: dl,
      deadlineTime: tm,
      // Detail page URL: list view with the zz_jo_num so the user can find it.
      url: it.zz_jo_num
        ? `https://recruit.cj.net/recruit/ko/recruit/recruit/list.fo?zz_jo_num=${encodeURIComponent(it.zz_jo_num)}`
        : '',
    };
  });
}

async function getBrowser() {
  if (browserHandle) return browserHandle;
  const mod = await import('playwright');
  browserHandle = await mod.chromium.launch({ headless: true });
  return browserHandle;
}

async function fetchPlaywright(params) {
  const { url, selector, scrollPasses = 6, parseFromBodyText, filterByText, clickFilters, extractNextData, matchKeys, reloadOnFirstLoad, detailBase } = params;
  const browser = await getBrowser();
  const ctx = await browser.newContext({ userAgent: UA });
  const page = await ctx.newPage();
  try {
    await page.goto(url, { waitUntil: 'domcontentloaded', timeout: 30000 });
    await page.waitForTimeout(3500);
    // Some SPAs (e.g. LG U+ careers channel) only show data after a reload,
    // and the metadata (D-N, dates) hydrates several seconds after the anchors appear.
    if (reloadOnFirstLoad) {
      await page.reload({ waitUntil: 'domcontentloaded' });
      await page.waitForTimeout(8000);
    }
    // For anchor-based extraction, wait until the selector actually appears (SPA hydration).
    if (selector) {
      try { await page.waitForSelector(selector, { timeout: 10000 }); } catch {}
      // Wait until anchor texts include date/D-N markers.
      try {
        await page.waitForFunction((sel) => {
          const list = [...document.querySelectorAll(sel)];
          return list.some(a => /D-\d+|\d{4}[.-]\d{1,2}[.-]\d{1,2}/.test(a.innerText || ''));
        }, selector, { timeout: 16000 });
      } catch {}
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
      const base = detailBase || url.split('?')[0];
      const pad = n => String(n).padStart(2, '0');
      return target.map(j => {
        // dueDate is UTC ISO; shift +9h for KST display.
        let deadline = '', deadlineTime = '';
        if (j.dueDate) {
          const kst = new Date(new Date(j.dueDate).getTime() + 9 * 3600_000);
          deadline = `${kst.getUTCFullYear()}-${pad(kst.getUTCMonth()+1)}-${pad(kst.getUTCDate())}`;
          deadlineTime = `${pad(kst.getUTCHours())}:${pad(kst.getUTCMinutes())}`;
        }
        return {
          title: j.title,
          department: j.workspaceDivision?.division || j.team?.name || j.department || '',
          location: j.location || '',
          deadline,
          deadlineTime,
          url: j.openingId ? `${base}/${j.openingId}` : '',
        };
      });
    }

    if (parseFromBodyText) {
      // Body text may still be hydrating after scrollPasses — wait until at least
      // 3 deadline markers (D-N or YYYY.MM.DD) are present, so we don't snapshot
      // a half-loaded page (LG U+ has been seen returning 1 of 6 jobs this way).
      try {
        await page.waitForFunction(() => {
          const t = document.body.innerText;
          const dn = (t.match(/D-\d+/g) || []).length;
          const ds = (t.match(/\d{4}\.\d{2}\.\d{2}/g) || []).length;
          return Math.max(dn, ds) >= 3;
        }, { timeout: 15000 });
      } catch {}
      // Collapse blank lines so patterns can use a single \n between fields.
      const text = (await page.evaluate(() => document.body.innerText))
        .replace(/\n{2,}/g, '\n');
      const jobs = [];
      const seen = new Set();
      // Normalize raw text to { date: 'YYYY-MM-DD', time: 'HH:MM' or '' }.
      const normalize = (raw) => {
        if (!raw) return { date: '', time: '' };
        const abs = raw.match(/(\d{4})[.-](\d{1,2})[.-](\d{1,2})/);
        const time = raw.match(/(\d{1,2}):(\d{2})/);
        const t = time ? `${String(time[1]).padStart(2,'0')}:${time[2]}` : '';
        if (abs) return { date: `${abs[1]}-${String(abs[2]).padStart(2,'0')}-${String(abs[3]).padStart(2,'0')}`, time: t };
        const dd = raw.match(/D-(\d+)/);
        if (dd) {
          const d = new Date();
          d.setHours(0,0,0,0);
          d.setDate(d.getDate() + +dd[1]);
          return { date: `${d.getFullYear()}-${String(d.getMonth()+1).padStart(2,'0')}-${String(d.getDate()).padStart(2,'0')}`, time: t };
        }
        return { date: '', time: '' };  // 상시/채용시까지 → 빈 값
      };
      // Pattern A is 6 lines (현대차 6-tag style). On 5-line listings (LG U+),
      // its 6th capture is the NEXT job's title, not a dept — which then leaks
      // unrelated keywords into passesFilter (e.g. "architect", "법무").
      // Treat any dept that looks like a bracketed job title as empty.
      const looksLikeTitle = (s) => /^\s*\[[^\]]+\].+(채용|모집|영입)\s*$/.test(s || '');
      const push = (title, dCode, dept, loc, dAbs) => {
        const t = title.replace(/^공유\s*/, '').trim();
        if (!t || t.length < 5 || /^채용|^전체|^본문|^로그인|^더보기|^선택|^등록일|^신규/.test(t)) return;
        // Prefer absolute date (more accurate); fall back to D-N translation.
        const { date: deadline, time: deadlineTime } = normalize(dAbs || dCode);
        // Dedup key strips bracket prefixes like "[LG CNS]" so patternA/C don't double-emit.
        const dedup = t.replace(/^\[[^\]]+\]\s*/, '').trim() + '|' + deadline;
        if (seen.has(dedup)) return;
        seen.add(dedup);
        const cleanDept = looksLikeTitle(dept) ? '' : (dept || '').trim();
        jobs.push({ title: t, department: cleanDept, location: (loc||'').trim(), deadline, deadlineTime, url: '' });
      };
      // Pattern A (현대차 style — 6 lines): title \n D-N \n tag \n tag \n tag \n tag
      const reA = /([^\n]{5,150})\n(D-\d+|채용시까지|상시|마감)\n([^\n]+)\n([^\n]+)\n([^\n]+)\n([^\n]+)/g;
      let m;
      while ((m = reA.exec(text)) !== null) {
        // 6 lines may include an absolute date in field 3 or 5 — try both.
        const dateGuess = [m[3], m[5]].find(s => /\d{4}[.-]\d{1,2}[.-]\d{1,2}/.test(s));
        push(m[1], m[2], m[6] || m[3], m[5], dateGuess);
      }
      // Pattern B (CJ — 8 lines): title \n co \n D-N \n date~date \n career \n type \n loc \n dept
      const reB = /([^\n]{5,150})\n([^\n]+)\n(D-\d+|상시|마감|채용시까지)\n(\d{4}\.\d{2}\.\d{2}[^\n]*)\n([^\n]+)\n([^\n]+)\n([^\n]+)\n([^\n]+)/g;
      while ((m = reB.exec(text)) !== null) push(m[1], m[3], m[8], m[7], m[4]);
      // Pattern C (LG CNS — 7 lines): co \n [co] title \n D-N \n date \n career \n co \n category
      const reC = /([^\n]+)\n\[[^\]]+\]\s*([^\n]{3,150})\n(D-\d+|상시|마감|채용시까지)\n(\d{4}\.\d{2}\.\d{2}[^\n]*)\n([^\n]+)\n([^\n]+)\n([^\n]+)/g;
      while ((m = reC.exec(text)) !== null) push(m[2], m[3], m[7], '', m[4]);
      // Pattern D (LG U+ var1 — 4 lines): title \n career-type \n D-N \n date
      const reD = /([^\n]{5,150})\n(경력|신입\/경력|신입|인턴|계약직)\n(D-\d+|상시|마감|채용시까지)\n(\d{4}\.\d{2}\.\d{2}[^\n]*)/g;
      while ((m = reD.exec(text)) !== null) push(m[1], m[3], '', '', m[4]);
      // Pattern E (LG U+ var2 — 5 lines): title \n D-N \n date \n co \n career
      const reE = /([^\n]{5,150})\n(D-\d+|상시|마감|채용시까지)\n(\d{4}\.\d{2}\.\d{2}[^\n]*)\n([^\n]+)\n(경력|신입\/경력|신입|인턴|계약직)/g;
      while ((m = reE.exec(text)) !== null) push(m[1], m[2], '', '', m[3]);
      return jobs;
    }

    const items = await page.evaluate((args) => {
      const anchors = [...document.querySelectorAll(args.selector)];
      const out = [];
      const byHref = new Map();
      for (const a of anchors) {
        if (args.filterByText && !a.innerText?.includes(args.filterByText)) continue;
        const text = a.innerText?.replace(/\s+/g, ' ').trim() || '';
        if (text.length < 5 || text.length > 400) continue;
        const href = a.href || '';
        // Some sites (LG careers) emit two anchors per job: a long one with
        // deadline metadata and a short one with just the title. Dedup by href
        // and keep the entry with more text so deadline info is preserved.
        const key = href || ('text:' + text);
        const prev = byHref.get(key);
        if (!prev || text.length > prev.text.length) byHref.set(key, { text, href });
      }
      for (const v of byHref.values()) out.push(v);
      return out;
    }, { selector, filterByText });

    // SK careers titles embed an English date range like "April 22, 2026(Wed) ~ May 22, 2026(Fri)".
    // Take the end of the range (closing date) as deadline.
    const EN_MONTHS = { jan:1, feb:2, mar:3, apr:4, may:5, jun:6, jul:7, aug:8, sep:9, oct:10, nov:11, dec:12 };
    const EN_DATE_RE = /(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)[a-z]*\.?\s+(\d{1,2}),?\s*(\d{4})/gi;
    const EN_DATE_RANGE_RE = /(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)[a-z]*\.?\s+\d{1,2},?\s*\d{4}(?:\s*\([^)]+\))?\s*~\s*(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)[a-z]*\.?\s+\d{1,2},?\s*\d{4}(?:\s*\([^)]+\))?/gi;

    // SK careers in Korean locale: "2026년 04월 22일(수) ~ 2026년 05월 22일(금)".
    // Need to pick the closing date (after `~`), not the first match.
    const ABS_DATE_RE = /(\d{4})[.-](\d{1,2})[.-](\d{1,2})|(\d{4})년\s?(\d{1,2})월\s?(\d{1,2})일/g;

    return items.map(({ text, href }) => {
      // Prefer absolute date (most accurate). For `~` range, pick the end date.
      const absMatches = [...text.matchAll(ABS_DATE_RE)];
      const abs = text.includes('~') && absMatches.length >= 2
        ? absMatches[absMatches.length - 1]
        : absMatches[0];
      const dd = text.match(/D-(\d+)/);
      const time = text.match(/(\d{1,2}):(\d{2})/);
      const deadlineTime = time ? `${String(time[1]).padStart(2,'0')}:${time[2]}` : '';
      let deadline = '';
      if (abs) {
        const y = abs[1] || abs[4], mm = abs[2] || abs[5], d = abs[3] || abs[6];
        deadline = `${y}-${String(mm).padStart(2,'0')}-${String(d).padStart(2,'0')}`;
      } else {
        // English-month fallback: take last match (end of A~B range, or sole date).
        const enMatches = [...text.matchAll(EN_DATE_RE)];
        if (enMatches.length) {
          const last = enMatches[enMatches.length - 1];
          const mm = EN_MONTHS[last[1].slice(0,3).toLowerCase()];
          deadline = `${last[3]}-${String(mm).padStart(2,'0')}-${String(last[2]).padStart(2,'0')}`;
        } else if (dd) {
          const t = new Date(); t.setHours(0,0,0,0);
          t.setDate(t.getDate() + +dd[1]);
          deadline = `${t.getFullYear()}-${String(t.getMonth()+1).padStart(2,'0')}-${String(t.getDate()).padStart(2,'0')}`;
        }
      }
      // Strip embedded English date ranges from the title (SK careers leaks them into the heading).
      const cleanedText = text.replace(EN_DATE_RANGE_RE, '').replace(/\s{2,}/g, ' ').trim();
      return {
        title: cleanedText.split('\n')[0].split(/\s{2,}|・|\|/)[0].trim().slice(0, 200),
        department: '',
        location: '',
        deadline,
        deadlineTime,
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
      else if (c.fetcher === 'hanwha-api') raw = await fetchHanwhaApi(c.params);
      else if (c.fetcher === 'cj-api') raw = await fetchCjApi(c.params);
      else throw new Error(`unknown fetcher: ${c.fetcher}`);
      // Fallback url: link to the company's main listing page if individual url is empty
      // (parseFromBodyText extractors can't reliably attach per-job URLs).
      const fallbackUrl = c.params?.url || '';
      // bypassFilter=true: company API already filters server-side (e.g. Hanwha
      // returns only the requested 계열사/직무/채용구분), so the global include/
      // exclude word filters would just throw out valid hits.
      const passes = c.bypassFilter ? () => true : (j) => passesFilter(j, filters);
      const filtered = raw.filter(passes).map(j => ({
        company: c.name, companyId: c.id, ...j,
        url: j.url || fallbackUrl,
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

import { chromium } from 'playwright';
const browser = await chromium.launch({ headless: true });
const ctx = await browser.newContext({ userAgent: 'Mozilla/5.0' });
const page = await ctx.newPage();
const apiCalls = [];
page.on('response', async (res) => {
  const url = res.url();
  if (url.includes('cj.net') && (url.includes('list') || url.includes('search') || url.includes('api') || url.includes('recruit'))) {
    const ct = res.headers()['content-type'] || '';
    if (ct.includes('json')) apiCalls.push({ url, body: (await res.text()).slice(0, 500) });
  }
});
await page.goto('https://recruit.cj.net/recruit/ko/recruit/recruit/list.fo', { waitUntil: 'domcontentloaded' });
await page.waitForTimeout(3000);
console.log('=== INITIAL API CALLS ===');
for (const c of apiCalls.slice(0, 10)) console.log(c.url, '\n  body:', c.body, '\n');
console.log('=== INITIAL JOB COUNT TEXT ===');
const head = await page.evaluate(() => {
  const all = document.body.innerText;
  return all.split('\n').slice(0, 5).join(' | ');
});
console.log(head);
console.log('\n=== TRY FILTERS: 경력 + IT ===');
for (const t of ['경력', 'IT']) {
  await page.evaluate(text => {
    const labels = [...document.querySelectorAll('label')];
    const m = labels.find(l => l.textContent?.trim() === text);
    if (m) m.click();
  }, t);
  await page.waitForTimeout(800);
}
// Click 필터적용
await page.evaluate(() => {
  const btns = [...document.querySelectorAll('button')];
  const apply = btns.find(b => b.textContent?.trim() === '필터적용');
  if (apply) apply.click();
});
await page.waitForTimeout(3000);
console.log('=== AFTER FILTER APPLY ===');
console.log('count text:', await page.evaluate(() => document.body.innerText.split('\n').slice(0,3).join(' | ')));
console.log('apiCalls (recent):');
for (const c of apiCalls.slice(-5)) console.log(c.url, '\n  body:', c.body, '\n');
console.log('=== ALL XHR URLs visited ===');
console.log(apiCalls.map(c => c.url).filter((v,i,a) => a.indexOf(v)===i).join('\n'));
await browser.close();

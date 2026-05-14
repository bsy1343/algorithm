// Compare current data/jobs-latest.json with the previous commit that touched
// that file and push a ntfy notification listing newly-added jobs.
// No-op if nothing changed. Intended for the 13:00 KST schedule, while the
// 09:00 schedule sends the full daily summary.
//
// Required env: NTFY_PASS. Optional: NTFY_URL, NTFY_TOPIC, NTFY_USER.

import { readFile } from 'node:fs/promises';
import { execFileSync } from 'node:child_process';

const NTFY_URL = process.env.NTFY_URL || 'https://ntfy.sybaek.dev';
const NTFY_TOPIC = process.env.NTFY_TOPIC || 'jobs';
const NTFY_USER = process.env.NTFY_USER || 'admin';
const NTFY_PASS = process.env.NTFY_PASS;

if (!NTFY_PASS) {
  console.error('NTFY_PASS not set — skipping');
  process.exit(0);
}

// Find the second-most-recent commit that touched data/jobs-latest.json.
// Workflow-bot commits and unrelated user commits can both sit on HEAD, so
// `HEAD~1` isn't reliable; ask git for the file's own history instead.
let prevCommit;
try {
  const out = execFileSync(
    'git',
    ['log', '--format=%H', '-2', '--', 'data/jobs-latest.json'],
    { encoding: 'utf8', stdio: ['pipe', 'pipe', 'ignore'] }
  ).trim();
  const lines = out.split('\n').filter(Boolean);
  if (lines.length < 2) {
    console.log('no previous commit for jobs-latest.json — skipping');
    process.exit(0);
  }
  prevCommit = lines[1];
} catch (e) {
  console.error('git log failed:', e.message);
  process.exit(0);
}

let prev;
try {
  const raw = execFileSync('git', ['show', `${prevCommit}:data/jobs-latest.json`], {
    encoding: 'utf8',
    stdio: ['pipe', 'pipe', 'ignore'],
  });
  prev = JSON.parse(raw);
} catch (e) {
  console.error('git show failed:', e.message);
  process.exit(0);
}

const curr = JSON.parse(await readFile('data/jobs-latest.json', 'utf8'));

const key = (j) => `${j.companyId}|${j.title}|${j.deadline || ''}`;
const prevKeys = new Set((prev.jobs || []).map(key));
const added = (curr.jobs || []).filter((j) => !prevKeys.has(key(j)));

if (!added.length) {
  console.log(`no new jobs since ${prevCommit.slice(0, 8)}`);
  process.exit(0);
}

console.log(`new jobs: ${added.length} (vs commit ${prevCommit.slice(0, 8)})`);
for (const j of added) console.log(`  + [${j.company}] ${j.title} (~${j.deadline || '?'})`);

const today = new Date();
today.setHours(0, 0, 0, 0);
const dday = (d) => {
  if (!d || !/^\d{4}-\d{2}-\d{2}$/.test(d)) return '';
  const t = new Date(d); t.setHours(0, 0, 0, 0);
  return ` (D-${Math.round((t - today) / 86400000)})`;
};

// Group by company name (ASC), deadline ASC within a company.
const byCompany = {};
for (const j of added) (byCompany[j.company] = byCompany[j.company] || []).push(j);
const groups = Object.entries(byCompany).sort((a, b) => a[0].localeCompare(b[0]));

const lines = [];
for (const [company, items] of groups) {
  items.sort((a, b) => (a.deadline || '').localeCompare(b.deadline || ''));
  lines.push(`■ ${company} (${items.length})`);
  for (const j of items.slice(0, 5)) {
    lines.push(`  · ${j.title.slice(0, 70)}${dday(j.deadline)}`);
  }
  if (items.length > 5) lines.push(`  · 외 ${items.length - 5}건`);
}

const body = {
  topic: NTFY_TOPIC,
  title: `🆕 신규 채용 ${added.length}건`,
  message: lines.join('\n'),
  tags: ['new'],
  priority: 4,
};

const auth = Buffer.from(`${NTFY_USER}:${NTFY_PASS}`).toString('base64');
const res = await fetch(NTFY_URL + '/', {
  method: 'POST',
  headers: {
    Authorization: `Basic ${auth}`,
    'Content-Type': 'application/json',
  },
  body: JSON.stringify(body),
});

if (!res.ok) {
  console.error(`ntfy failed: ${res.status} ${await res.text()}`);
  process.exit(1);
}
console.log('ntfy sent');

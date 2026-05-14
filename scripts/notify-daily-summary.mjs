// Daily 09:00 KST summary: every job currently open for application
// (deadline >= today). Grouped by company name, sorted by deadline.
//
// Required env: NTFY_PASS. Optional: NTFY_URL, NTFY_TOPIC, NTFY_USER, SITE_URL.

import { readFile } from 'node:fs/promises';

const NTFY_URL = process.env.NTFY_URL || 'https://ntfy.sybaek.dev';
const NTFY_TOPIC = process.env.NTFY_TOPIC || 'jobs';
const NTFY_USER = process.env.NTFY_USER || 'admin';
const NTFY_PASS = process.env.NTFY_PASS;

if (!NTFY_PASS) {
  console.error('NTFY_PASS not set — skipping');
  process.exit(0);
}

const data = JSON.parse(await readFile('data/jobs-latest.json', 'utf8'));

const today = new Date();
today.setHours(0, 0, 0, 0);

const parseDeadline = (d) => {
  if (!d || !/^\d{4}-\d{2}-\d{2}$/.test(d)) return null;
  const t = new Date(d);
  t.setHours(0, 0, 0, 0);
  return t;
};

const open = (data.jobs || []).filter((j) => {
  const d = parseDeadline(j.deadline);
  return d && d >= today;
});

if (!open.length) {
  console.log('no open jobs — skipping');
  process.exit(0);
}

// Group by company name (ASC), deadline ASC within a company.
const byCompany = {};
for (const j of open) (byCompany[j.company] = byCompany[j.company] || []).push(j);
const groups = Object.entries(byCompany).sort((a, b) => a[0].localeCompare(b[0]));

const lines = [];
for (const [company, items] of groups) {
  items.sort((a, b) => (a.deadline || '').localeCompare(b.deadline || ''));
  lines.push(`■ ${company} (${items.length})`);
  for (const j of items.slice(0, 3)) {
    const dd = parseDeadline(j.deadline);
    const days = Math.round((dd - today) / 86400000);
    lines.push(`  · ${j.title.slice(0, 70)} (D-${days})`);
  }
  if (items.length > 3) lines.push(`  · 외 ${items.length - 3}건`);
}

const message = lines.join('\n');
const title = `📅 채용 ${open.length}건 모집 중`;

console.log(title);
console.log(message);

const auth = Buffer.from(`${NTFY_USER}:${NTFY_PASS}`).toString('base64');
const res = await fetch(NTFY_URL + '/', {
  method: 'POST',
  headers: {
    Authorization: `Basic ${auth}`,
    'Content-Type': 'application/json',
  },
  body: JSON.stringify({
    topic: NTFY_TOPIC,
    title,
    message,
    tags: ['briefcase'],
    priority: 3,
  }),
});

if (!res.ok) {
  console.error(`ntfy failed: ${res.status} ${await res.text()}`);
  process.exit(1);
}
console.log(`ntfy sent (${open.length} jobs)`);

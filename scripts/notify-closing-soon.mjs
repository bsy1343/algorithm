// Closing-soon alert: jobs whose deadline is 0–7 days away (D-7 ~ D-0,
// today inclusive). Fired daily at 18:00 KST via n8n -> workflow_dispatch.
// No-op if nothing is closing soon.
//
// Required env: NTFY_PASS. Optional: NTFY_URL, NTFY_TOPIC, NTFY_USER.

import { readFile } from 'node:fs/promises';

const NTFY_URL = process.env.NTFY_URL || 'https://ntfy.sybaek.dev';
const NTFY_TOPIC = process.env.NTFY_TOPIC || 'jobs';
const NTFY_USER = process.env.NTFY_USER || 'admin';
const NTFY_PASS = process.env.NTFY_PASS;

if (!NTFY_PASS) {
  console.error('NTFY_PASS not set — skipping');
  process.exit(0);
}

const WINDOW_DAYS = 7;

const data = JSON.parse(await readFile('data/jobs-latest.json', 'utf8'));

const today = new Date();
today.setHours(0, 0, 0, 0);

const parseDeadline = (d) => {
  if (!d || !/^\d{4}-\d{2}-\d{2}$/.test(d)) return null;
  const t = new Date(d);
  t.setHours(0, 0, 0, 0);
  return t;
};

const soon = [];
for (const j of data.jobs || []) {
  const d = parseDeadline(j.deadline);
  if (!d) continue;
  const days = Math.round((d - today) / 86400000);
  if (days >= 0 && days <= WINDOW_DAYS) soon.push({ ...j, _days: days });
}

if (!soon.length) {
  console.log(`no jobs closing within ${WINDOW_DAYS} days — skipping`);
  process.exit(0);
}

// Most urgent first; company name as tiebreaker.
soon.sort(
  (a, b) => a._days - b._days || (a.company || '').localeCompare(b.company || '')
);

const lines = soon
  .slice(0, 30)
  .map((j) => `· D-${j._days} [${j.company}] ${j.title.slice(0, 60)}`);
if (soon.length > 30) lines.push(`· 외 ${soon.length - 30}건`);

const title = `⏰ 마감 임박 ${soon.length}건 (${WINDOW_DAYS}일 이내)`;
const message = lines.join('\n');

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
    tags: ['hourglass_flowing_sand'],
    priority: 4,
  }),
});

if (!res.ok) {
  console.error(`ntfy failed: ${res.status} ${await res.text()}`);
  process.exit(1);
}
console.log(`ntfy sent (${soon.length} closing-soon jobs)`);

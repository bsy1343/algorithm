// Compare current data/jobs-latest.json with the previous commit and push a
// ntfy notification listing newly-added jobs. No-op if nothing changed.
//
// Required env: NTFY_PASS (auth for admin user on the self-hosted ntfy server).
// Optional env: NTFY_URL, NTFY_TOPIC, NTFY_USER, SITE_URL.

import { readFile } from 'node:fs/promises';
import { execFileSync } from 'node:child_process';

const NTFY_URL = process.env.NTFY_URL || 'https://ntfy.sybaek.dev';
const NTFY_TOPIC = process.env.NTFY_TOPIC || 'jobs';
const NTFY_USER = process.env.NTFY_USER || 'admin';
const NTFY_PASS = process.env.NTFY_PASS;
const SITE_URL = process.env.SITE_URL || 'https://bsy1343.github.io/algorithm/';

if (!NTFY_PASS) {
  console.error('NTFY_PASS not set — skipping notification');
  process.exit(0);
}

let prev;
try {
  const raw = execFileSync('git', ['show', 'HEAD:data/jobs-latest.json'], {
    encoding: 'utf8',
    stdio: ['pipe', 'pipe', 'ignore'],
  });
  prev = JSON.parse(raw);
} catch {
  console.log('no previous jobs-latest.json in HEAD — skipping diff');
  process.exit(0);
}

const curr = JSON.parse(await readFile('data/jobs-latest.json', 'utf8'));

const key = (j) => `${j.companyId}|${j.title}|${j.deadline || ''}`;
const prevKeys = new Set((prev.jobs || []).map(key));
const added = (curr.jobs || []).filter((j) => !prevKeys.has(key(j)));

if (!added.length) {
  console.log('no new jobs');
  process.exit(0);
}

console.log(`new jobs: ${added.length}`);
for (const j of added) console.log(`  + [${j.company}] ${j.title} (~${j.deadline || '?'})`);

// Group by company so a "10 new jobs" notification still reads sensibly.
const byCompany = {};
for (const j of added) (byCompany[j.company] = byCompany[j.company] || []).push(j);

const lines = [];
for (const [company, items] of Object.entries(byCompany).sort((a, b) => a[0].localeCompare(b[0]))) {
  lines.push(`■ ${company} (${items.length})`);
  for (const j of items.slice(0, 5)) {
    const d = j.deadline ? ` ~${j.deadline}` : '';
    lines.push(`  · ${j.title}${d}`);
  }
  if (items.length > 5) lines.push(`  · 외 ${items.length - 5}건`);
}

const body = {
  topic: NTFY_TOPIC,
  title: `채용 신규 ${added.length}건`,
  message: lines.join('\n'),
  tags: ['briefcase'],
  click: SITE_URL + '#jobs',
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

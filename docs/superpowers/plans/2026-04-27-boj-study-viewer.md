# BOJ Study Viewer Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Build a single-page static HTML viewer (`index.html`) that visualizes the BOJ
problems in `algorithm/백준/`, lets the user write new solutions in-browser, and hands
stress-testing off to testcase.ac via a clipboard-copy-and-new-tab flow. Plus a Node
script that archives BOJ-hosted images locally so README images survive after BOJ shutdown.

**Architecture:** One `index.html` at repo root with everything inlined (`<style>` and
`<script>`). One Node 18+ script `scripts/archive-images.mjs` (no deps). Hosted on GitHub
Pages with `.nojekyll`. Data fetched same-origin via relative paths. GitHub API used once
on page load (cached with ETag) for the problem index. testcase.ac registry checked
once per problem (cached). No build step, no backend.

**Tech Stack:**
- HTML5 / CSS / vanilla JS (ES2022, no framework)
- Node 18+ for the archive script (built-in `fetch`, `node:test`, `crypto`)
- GitHub Pages (static hosting)
- External services: api.github.com, api.testcase.ac, next.testcase.ac, acmicpc.net

---

## File Structure

```
algorithm/                              (existing repo)
├─ .nojekyll                            NEW (empty marker, disables Jekyll)
├─ index.html                           NEW (entire viewer, inline)
├─ baekjoon-viewer.html                 (existing, kept as historical reference)
├─ scripts/
│  └─ archive-images.mjs                NEW (Node script, idempotent image downloader)
├─ tests/
│  └─ archive-images.test.mjs           NEW (Node test for archive logic)
├─ docs/superpowers/
│  ├─ specs/2026-04-27-boj-study-viewer-design.md   (already committed)
│  └─ plans/2026-04-27-boj-study-viewer.md          (this file)
├─ 백준/
│  ├─ .assets/                          NEW (created on first script run)
│  │  ├─ index.json                     URL → local path mapping
│  │  └─ <sha1-8>.{png,jpg,...}         downloaded images
│  ├─ Silver/...                        (existing data)
│  └─ Gold/...                          (existing data)
```

**Single-file constraint:** All viewer JS (Api, Parser, State, Sidebar, ProblemView,
CodeView, IOView, ActionBar, ImageArchive, App) lives inline in `index.html` as
namespaced objects within one `<script>` IIFE. The only separately-tested unit is the
`scripts/archive-images.mjs` Node script, because it must be a Node module to run.

**Testing strategy:**
- `archive-images.mjs` → automated tests via `node --test`.
- Viewer (UI logic, rendering, interactions) → manual browser verification at every
  task. Each UI task ends with a step that says "open in browser, do X, expect Y".
- Local browser preview: `python3 -m http.server 8000` from repo root, then open
  `http://localhost:8000/index.html`. (Direct `file://` open often blocks `fetch` of
  local files in modern browsers.)

---

## Task Sequence

| # | Task | Outcome |
|---|---|---|
| 1 | Foundation (skeleton + .nojekyll + GH Pages) | Page loads at `localhost:8000`, GitHub Pages serves it |
| 2 | CSS port from baekjoon-viewer + new style tokens | Dark theme matches existing viewer; new utility classes for editor / action bar / compare |
| 3 | Repo auto-detect + GitHub API tree fetch (Api) | `Api.fetchTree()` returns array; ETag cached in localStorage |
| 4 | Tree parsing into problem list (Parser) + Sidebar tier tabs / list / search | Sidebar shows BOJ problems by tier; click selects |
| 5 | Problem view: meta cards + README rendering | Selected problem shows meta + body |
| 6 | Code view: 모범답안 tab with java syntax highlight | "모범답안" tab shows colored .java |
| 7 | Code view: 내 풀이 editor + localStorage drafts + 초기화 / 시작 button | Typed code persists per problem; reset works |
| 8 | IO view: example input/output pairs | "예제 입출력" tab shows paired blocks |
| 9 | Action bar: testcase.ac registry lookup + clipboard + new tab + BOJ link | "반례 찾기" disables for unregistered, copies code, opens new tab |
| 10 | Archive script (`scripts/archive-images.mjs`) — TDD | `node --test` passes; running script downloads images and writes index.json |
| 11 | ImageArchive viewer integration | README images load from local paths when index.json present, fallback to source on failure |
| 12 | Compare mode (side-by-side 모범답안 vs 내 풀이) | Toggle splits CodeView into two columns |
| 13 | Topbar: status chip + refresh button + offline banner | Trees refresh on demand; rate limit / offline shown clearly |
| 14 | Final smoke test + GitHub Pages enable + commit | Site lives at bsy1343.github.io/algorithm/ |

---

## Task 1: Foundation — skeleton + .nojekyll + local serve check

**Files:**
- Create: `.nojekyll`
- Create: `index.html`

- [ ] **Step 1.1: Create empty `.nojekyll` file at repo root**

```bash
touch .nojekyll
```

This single empty file disables Jekyll on GitHub Pages so that `백준/.assets/` (a dot-folder)
is served instead of being filtered out. Without it, the image archive will 404.

- [ ] **Step 1.2: Write the minimal index.html skeleton**

Create `index.html` with the topbar/sidebar/main layout placeholders and an inline
"loading" message. CSS and JS will be filled in by subsequent tasks.

```html
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>BOJ 학습 뷰어</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=JetBrains+Mono:wght@400;500&family=Pretendard:wght@400;500;600&display=swap" rel="stylesheet">
<style>
  /* === Layout shell only. Full theme arrives in Task 2. === */
  *, *::before, *::after { box-sizing: border-box; margin: 0; padding: 0; }
  html, body { height: 100%; background: #0f1117; color: #e6edf3; font-family: 'Pretendard', sans-serif; font-size: 14px; }
  .app { display: grid; grid-template-columns: 280px 1fr; grid-template-rows: 52px 1fr; height: 100vh; }
  .topbar { grid-column: 1 / -1; display: flex; align-items: center; padding: 0 16px; border-bottom: 1px solid #30363d; background: #161b22; }
  .sidebar { border-right: 1px solid #30363d; background: #161b22; overflow: hidden; }
  .main { display: flex; flex-direction: column; overflow: hidden; }
  .loading { padding: 24px; color: #8b949e; font-family: 'JetBrains Mono', monospace; font-size: 12px; }
</style>
</head>
<body>
<div class="app">
  <header class="topbar"><div style="font-family:'JetBrains Mono',monospace;font-size:13px;color:#8b949e">boj<span style="color:#58a6ff">.</span>study</div></header>
  <aside class="sidebar"><div class="loading">트리 로딩 대기...</div></aside>
  <main class="main"><div class="loading">문제를 선택하세요</div></main>
</div>
<script>
(() => {
  'use strict';
  console.log('[boj.study] skeleton loaded; waiting for Task 3 wiring.');
})();
</script>
</body>
</html>
```

- [ ] **Step 1.3: Manually verify the skeleton renders**

Run from repo root:

```bash
python3 -m http.server 8000
```

Open `http://localhost:8000/index.html`. Expected:
- Dark page (background `#0f1117`)
- Top bar with "boj.study" text
- Left sidebar with "트리 로딩 대기..."
- Main area with "문제를 선택하세요"
- DevTools console: `[boj.study] skeleton loaded; ...`

Stop the server with `Ctrl+C`.

- [ ] **Step 1.4: Commit**

```bash
git add .nojekyll index.html
git commit -m "feat(viewer): scaffold index.html shell + .nojekyll"
```

---

## Task 2: CSS port — full theme + new utility classes

**Files:**
- Modify: `index.html` (replace `<style>` block with full stylesheet)

The existing `baekjoon-viewer.html` has a polished dark theme that we keep as the
visual baseline. Port it verbatim, plus three new sections: `.editor` (textarea),
`.action-bar` (header buttons), and `.compare` (side-by-side columns).

- [ ] **Step 2.1: Replace the `<style>` block with the full theme**

In `index.html`, replace the entire `<style>...</style>` block with:

```html
<style>
  *, *::before, *::after { box-sizing: border-box; margin: 0; padding: 0; }

  :root {
    --bg: #0f1117;
    --bg2: #161b22;
    --bg3: #1c2128;
    --bg4: #21262d;
    --border: #30363d;
    --border2: #3d444d;
    --text: #e6edf3;
    --text2: #8b949e;
    --text3: #484f58;
    --accent: #58a6ff;
    --accent-bg: rgba(88,166,255,0.1);
    --gold: #d29922;
    --gold-bg: rgba(210,153,34,0.12);
    --silver: #79c0ff;
    --silver-bg: rgba(121,192,255,0.1);
    --bronze: #f0883e;
    --bronze-bg: rgba(240,136,62,0.1);
    --green: #3fb950;
    --green-bg: rgba(63,185,80,0.1);
    --danger: #f85149;
    --radius: 8px;
    --radius-sm: 5px;
    --font: 'Pretendard', -apple-system, sans-serif;
    --mono: 'JetBrains Mono', 'Fira Code', monospace;
  }

  html, body { height: 100%; background: var(--bg); color: var(--text); font-family: var(--font); font-size: 14px; line-height: 1.6; }

  .app { display: grid; grid-template-columns: 280px 1fr; grid-template-rows: 52px 1fr; height: 100vh; }

  /* Topbar */
  .topbar {
    grid-column: 1 / -1;
    display: flex; align-items: center; gap: 12px;
    padding: 0 16px;
    border-bottom: 1px solid var(--border);
    background: var(--bg2);
  }
  .topbar-logo { font-family: var(--mono); font-size: 13px; font-weight: 500; color: var(--text2); white-space: nowrap; }
  .topbar-logo span { color: var(--accent); }
  .topbar-spacer { flex: 1; }
  .stat-chip { font-size: 11px; font-family: var(--mono); color: var(--text2); white-space: nowrap; }
  .stat-chip.warn { color: var(--gold); }
  .stat-chip.err { color: var(--danger); }
  .topbar-btn {
    font-size: 11px; font-family: var(--mono); color: var(--text3);
    background: none; border: 1px solid var(--border); border-radius: var(--radius-sm);
    padding: 4px 10px; cursor: pointer; transition: color 0.15s, border-color 0.15s;
  }
  .topbar-btn:hover { color: var(--text); border-color: var(--border2); }

  /* Sidebar */
  .sidebar { border-right: 1px solid var(--border); background: var(--bg2); display: flex; flex-direction: column; overflow: hidden; }
  .tier-tabs { display: flex; overflow-x: auto; border-bottom: 1px solid var(--border); scrollbar-width: none; }
  .tier-tabs::-webkit-scrollbar { display: none; }
  .tier-tab {
    padding: 8px 12px; font-size: 11px; font-family: var(--mono);
    cursor: pointer; white-space: nowrap; color: var(--text3);
    border-bottom: 2px solid transparent; transition: color 0.15s;
  }
  .tier-tab:hover { color: var(--text2); }
  .tier-tab.active { color: var(--text); border-bottom-color: var(--accent); }

  .search-box { padding: 8px 10px; border-bottom: 1px solid var(--border); }
  .search-box input {
    width: 100%; background: var(--bg3); border: 1px solid var(--border);
    border-radius: var(--radius-sm); color: var(--text); font-family: var(--font);
    font-size: 12px; padding: 5px 8px; outline: none;
  }
  .search-box input:focus { border-color: var(--border2); }
  .search-box input::placeholder { color: var(--text3); }

  .problem-list { flex: 1; overflow-y: auto; padding: 4px; }
  .problem-list::-webkit-scrollbar { width: 4px; }
  .problem-list::-webkit-scrollbar-track { background: transparent; }
  .problem-list::-webkit-scrollbar-thumb { background: var(--border); border-radius: 2px; }
  .problem-item {
    padding: 9px 10px; border-radius: var(--radius-sm);
    cursor: pointer; margin-bottom: 1px;
    border: 1px solid transparent;
    transition: background 0.1s, border-color 0.1s;
  }
  .problem-item:hover { background: var(--bg3); }
  .problem-item.active { background: var(--bg3); border-color: var(--border2); }
  .problem-item.has-draft { position: relative; }
  .problem-item.has-draft::after {
    content: ''; position: absolute; top: 12px; right: 10px;
    width: 6px; height: 6px; border-radius: 50%; background: var(--accent);
  }
  .pi-top { display: flex; align-items: center; gap: 6px; }
  .pi-num { font-size: 10px; font-family: var(--mono); color: var(--text3); }
  .pi-tier-dot { width: 6px; height: 6px; border-radius: 50%; flex-shrink: 0; }
  .pi-title { font-size: 13px; color: var(--text); overflow: hidden; text-overflow: ellipsis; white-space: nowrap; }
  .pi-meta { font-size: 10px; color: var(--text3); margin-top: 2px; font-family: var(--mono); padding-left: 12px; }
  .empty-sidebar { padding: 24px 12px; text-align: center; font-size: 12px; color: var(--text3); line-height: 1.8; }

  /* Main */
  .main { display: flex; flex-direction: column; overflow: hidden; background: var(--bg); }
  .main-header {
    padding: 14px 20px; border-bottom: 1px solid var(--border);
    display: flex; align-items: center; gap: 10px;
    background: var(--bg2); flex-wrap: wrap; min-height: 52px;
  }
  .main-title { font-size: 16px; font-weight: 600; color: var(--text); }
  .tier-badge {
    font-size: 10px; font-family: var(--mono); font-weight: 500;
    padding: 2px 8px; border-radius: 20px; border: 1px solid;
  }
  .badge-gold { color: var(--gold); border-color: var(--gold); background: var(--gold-bg); }
  .badge-silver { color: var(--silver); border-color: var(--silver); background: var(--silver-bg); }
  .badge-bronze { color: var(--bronze); border-color: var(--bronze); background: var(--bronze-bg); }
  .badge-default { color: var(--text2); border-color: var(--border2); background: var(--bg3); }
  .badge-green { color: var(--green); border-color: var(--green); background: var(--green-bg); }

  /* Action bar (new) */
  .action-bar { margin-left: auto; display: flex; gap: 6px; }
  .action-btn {
    padding: 5px 12px; font-size: 11px; font-family: var(--mono);
    background: var(--accent-bg); border: 1px solid var(--accent);
    color: var(--accent); border-radius: var(--radius-sm);
    cursor: pointer; white-space: nowrap; transition: background 0.15s, opacity 0.15s;
    text-decoration: none;
  }
  .action-btn:hover:not(:disabled):not(.disabled) { background: rgba(88,166,255,0.2); }
  .action-btn:disabled, .action-btn.disabled { opacity: 0.35; cursor: not-allowed; pointer-events: none; }
  .action-btn.muted { background: var(--bg3); border-color: var(--border); color: var(--text2); }
  .action-btn.muted:hover { color: var(--text); border-color: var(--border2); background: var(--bg4); }

  .view-tabs {
    display: flex; border-bottom: 1px solid var(--border);
    background: var(--bg2); padding: 0 20px; gap: 0;
  }
  .view-tab {
    padding: 9px 16px; font-size: 12px; font-family: var(--mono);
    cursor: pointer; color: var(--text3);
    border-bottom: 2px solid transparent; transition: color 0.15s;
    background: none; border-left: 0; border-right: 0; border-top: 0;
  }
  .view-tab:hover { color: var(--text2); }
  .view-tab.active { color: var(--accent); border-bottom-color: var(--accent); }

  .main-content { flex: 1; overflow-y: auto; padding: 20px; }
  .main-content::-webkit-scrollbar { width: 4px; }
  .main-content::-webkit-scrollbar-track { background: transparent; }
  .main-content::-webkit-scrollbar-thumb { background: var(--border); border-radius: 2px; }

  /* Meta cards */
  .meta-grid { display: grid; grid-template-columns: repeat(auto-fit, minmax(90px,1fr)); gap: 8px; margin-bottom: 20px; }
  .meta-card { background: var(--bg2); border: 1px solid var(--border); border-radius: var(--radius); padding: 10px 12px; }
  .meta-label { font-size: 10px; color: var(--text3); font-family: var(--mono); margin-bottom: 4px; }
  .meta-val { font-size: 13px; font-weight: 500; color: var(--text); font-family: var(--mono); }

  /* Problem sections */
  .prob-section { margin-bottom: 20px; }
  .prob-section-title {
    font-size: 12px; font-weight: 600; color: var(--text2);
    text-transform: uppercase; letter-spacing: 0.08em;
    margin-bottom: 10px; font-family: var(--mono);
    display: flex; align-items: center; gap: 8px;
  }
  .prob-section-title::after { content: ''; flex: 1; height: 1px; background: var(--border); }
  .prob-body { font-size: 14px; color: var(--text2); line-height: 1.8; }
  .prob-body img { max-width: 100%; border-radius: var(--radius); margin: 10px 0; display: block; }
  .prob-body p { margin-bottom: 8px; color: var(--text2); font-size: 14px; line-height: 1.8; }
  .prob-body ul, .prob-body ol { padding-left: 20px; color: var(--text2); font-size: 14px; line-height: 1.8; margin-bottom: 8px; }
  .prob-body li { margin-bottom: 4px; }
  .prob-body sub, .prob-body sup { font-size: 11px; }
  .prob-body strong, .prob-body b { color: var(--text); font-weight: 600; }
  .prob-body code { font-family: var(--mono); font-size: 12px; background: var(--bg3); padding: 1px 5px; border-radius: 3px; color: var(--accent); }

  /* IO grid */
  .io-pair { display: grid; grid-template-columns: 1fr 1fr; gap: 10px; margin-bottom: 12px; }
  .io-box { background: var(--bg2); border: 1px solid var(--border); border-radius: var(--radius); padding: 12px 14px; }
  .io-label { font-size: 10px; font-family: var(--mono); color: var(--text3); margin-bottom: 8px; font-weight: 500; }
  .io-box pre { font-size: 13px; color: var(--text); font-family: var(--mono); white-space: pre-wrap; line-height: 1.6; }

  /* Code */
  .code-wrap { background: var(--bg2); border: 1px solid var(--border); border-radius: var(--radius); overflow: hidden; }
  .code-header {
    display: flex; align-items: center; justify-content: space-between;
    padding: 8px 14px; border-bottom: 1px solid var(--border);
    background: var(--bg3); gap: 8px;
  }
  .code-lang { font-size: 11px; font-family: var(--mono); color: var(--text3); }
  .code-actions { display: flex; gap: 6px; align-items: center; }
  .code-status { font-size: 10px; font-family: var(--mono); color: var(--text3); }
  .copy-btn, .reset-btn, .seed-btn {
    font-size: 11px; font-family: var(--mono);
    color: var(--text3); background: none; border: 1px solid var(--border);
    border-radius: var(--radius-sm); padding: 3px 10px;
    cursor: pointer; transition: color 0.15s, border-color 0.15s;
  }
  .copy-btn:hover, .reset-btn:hover, .seed-btn:hover { color: var(--text); border-color: var(--border2); }
  .code-wrap pre {
    padding: 16px; font-size: 13px; color: var(--text);
    font-family: var(--mono); overflow-x: auto;
    white-space: pre; line-height: 1.7;
  }

  /* Editor (new) */
  .editor {
    width: 100%; min-height: 320px; resize: vertical;
    padding: 16px; font-size: 13px; color: var(--text);
    font-family: var(--mono); background: var(--bg2);
    border: 1px solid var(--border); border-radius: var(--radius);
    outline: none; line-height: 1.7;
  }
  .editor:focus { border-color: var(--border2); }
  .editor::placeholder { color: var(--text3); }

  /* Compare (new) */
  .compare-wrap { display: grid; grid-template-columns: 1fr 1fr; gap: 12px; }
  @media (max-width: 1100px) { .compare-wrap { grid-template-columns: 1fr; } }

  /* Java syntax */
  .kw { color: #ff7b72; }
  .cm { color: #8b949e; font-style: italic; }
  .str { color: #a5d6ff; }
  .num { color: #79c0ff; }
  .ann { color: #e3b341; }

  /* Toast (new) */
  .toast {
    position: fixed; bottom: 20px; left: 50%;
    transform: translateX(-50%);
    background: var(--bg3); border: 1px solid var(--border);
    color: var(--text); font-family: var(--mono); font-size: 12px;
    padding: 8px 16px; border-radius: var(--radius);
    opacity: 0; pointer-events: none; transition: opacity 0.2s;
    z-index: 100;
  }
  .toast.show { opacity: 1; }
  .toast.err { border-color: var(--danger); color: var(--danger); }

  .loading-msg { font-size: 12px; color: var(--text3); font-family: var(--mono); padding: 16px 0; }
  .err-msg { font-size: 12px; color: var(--danger); font-family: var(--mono); padding: 16px 0; }
</style>
```

- [ ] **Step 2.2: Manually verify the theme didn't break the skeleton**

```bash
python3 -m http.server 8000
```

Open `http://localhost:8000/index.html`. Expected: same skeleton as Task 1, but with
slightly different default font widths (Pretendard now applied). No console errors.

Stop the server.

- [ ] **Step 2.3: Commit**

```bash
git add index.html
git commit -m "style(viewer): port theme from baekjoon-viewer + add editor/action/compare styles"
```

---

## Task 3: Api object — repo auto-detect + tree fetch + ETag cache

**Files:**
- Modify: `index.html` (replace inline IIFE with the Api object + a smoke test boot)

- [ ] **Step 3.1: Add `Api` and a temporary smoke-test boot to the inline script**

In `index.html`, replace the entire `<script>...</script>` body with:

```html
<script>
(() => {
  'use strict';

  /* ========================================================
   * Repo identity — auto-detected from GitHub Pages URL,
   * with fallback for local development.
   * ======================================================== */
  const REPO = (() => {
    const { hostname, pathname } = window.location;
    if (hostname.endsWith('.github.io')) {
      const segs = pathname.split('/').filter(Boolean);
      return { owner: hostname.split('.')[0], repo: segs[0] || 'algorithm', branch: 'main' };
    }
    return { owner: 'bsy1343', repo: 'algorithm', branch: 'main' };
  })();

  /* ========================================================
   * Api — GitHub tree fetch with ETag cache + same-origin
   * file fetch with proper Korean/space encoding.
   * ======================================================== */
  const Api = {
    TREE_KEY: 'tree-cache',
    TREE_TTL_MS: 60 * 60 * 1000,

    async fetchTree({ force = false } = {}) {
      const cached = JSON.parse(localStorage.getItem(this.TREE_KEY) || 'null');
      const fresh = cached && (Date.now() - new Date(cached.fetchedAt).getTime() < this.TREE_TTL_MS);
      if (fresh && !force) return { tree: cached.tree, source: 'cache-fresh' };

      const url = `https://api.github.com/repos/${REPO.owner}/${REPO.repo}/git/trees/${REPO.branch}?recursive=1`;
      const headers = {};
      if (cached?.etag && !force) headers['If-None-Match'] = cached.etag;

      let res;
      try {
        res = await fetch(url, { headers });
      } catch (e) {
        if (cached) return { tree: cached.tree, source: 'offline-cache', error: e.message };
        throw new Error('네트워크 오류 + 캐시 없음: ' + e.message);
      }

      if (res.status === 304 && cached) {
        cached.fetchedAt = new Date().toISOString();
        localStorage.setItem(this.TREE_KEY, JSON.stringify(cached));
        return { tree: cached.tree, source: 'etag-304' };
      }
      if (res.status === 403) {
        if (cached) return { tree: cached.tree, source: 'rate-limited-cache' };
        throw new Error('GitHub API rate limit, 캐시 없음');
      }
      if (!res.ok) {
        if (cached) return { tree: cached.tree, source: 'error-cache', error: `HTTP ${res.status}` };
        throw new Error(`GitHub API 오류: HTTP ${res.status}`);
      }

      const data = await res.json();
      const next = {
        etag: res.headers.get('etag'),
        fetchedAt: new Date().toISOString(),
        tree: data.tree,
      };
      localStorage.setItem(this.TREE_KEY, JSON.stringify(next));
      return { tree: data.tree, source: 'fresh' };
    },

    encodePath(path) {
      return path.split('/').map(encodeURIComponent).join('/');
    },

    async fetchFile(path) {
      const res = await fetch(this.encodePath(path));
      if (!res.ok) throw new Error(`파일 로드 실패 (${res.status}): ${path}`);
      return res.text();
    },
  };

  /* ========================================================
   * Smoke-test boot (REMOVED in Task 4)
   * ======================================================== */
  (async () => {
    const root = document.querySelector('.sidebar .loading');
    try {
      const { tree, source } = await Api.fetchTree();
      const bojBlobs = tree.filter(x => x.path.startsWith('백준/') && x.type === 'blob');
      root.textContent = `트리 ${bojBlobs.length} blobs · 출처 ${source}`;
      console.log('[Api] tree sample:', bojBlobs.slice(0, 3));
    } catch (e) {
      root.textContent = `오류: ${e.message}`;
      root.style.color = '#f85149';
    }
  })();
})();
</script>
```

- [ ] **Step 3.2: Manually verify the API call works**

```bash
python3 -m http.server 8000
```

Open `http://localhost:8000/index.html`. Expected:
- Sidebar message changes to e.g. `트리 130 blobs · 출처 fresh` (or `cache-fresh` on reload).
- DevTools console shows three sample blob entries (paths like `백준/Silver/2579. ...`).
- Refresh the page once: source should become `cache-fresh` (since cache is < 1 hour old).
- localStorage should contain a `tree-cache` key with `etag`, `fetchedAt`, `tree[]`.

Stop the server.

- [ ] **Step 3.3: Commit**

```bash
git add index.html
git commit -m "feat(viewer): add Api object with GitHub tree fetch + ETag cache"
```

---

## Task 4: Parser + Sidebar — tier tabs, problem list, search

**Files:**
- Modify: `index.html` (add Parser, State, Sidebar; replace smoke-test boot with App.init)

- [ ] **Step 4.1: Add `Parser`, `State`, `Sidebar`, and the App init in place of the smoke-test**

In `index.html`, replace ONLY the `Smoke-test boot` IIFE block with the following content.
Keep `Api` and `REPO` as-is.

```js
  /* ========================================================
   * Parser — tree to problem list, README to meta + sections.
   * ======================================================== */
  const Parser = {
    PATH_RE: /^백준\/([^/]+)\/(\d+)\.\s*([^/]+?)\/(.+)$/,

    parseTree(tree) {
      const map = {};
      for (const item of tree) {
        if (item.type !== 'blob') continue;
        const m = item.path.match(this.PATH_RE);
        if (!m) continue;
        const [, tier, num, title, fname] = m;
        const key = `${tier}||${num}`;
        if (!map[key]) {
          map[key] = { tier, num, title: title.trim(), files: { inputs: [], outputs: [] } };
        }
        const fl = fname.toLowerCase();
        if (fl === 'readme.md') {
          map[key].files.readme = item.path;
        } else if (fl.endsWith('.java')) {
          const expected = `${map[key].title}.java`.toLowerCase();
          if (fl === expected) map[key].files.java = item.path;
          else if (!map[key].files.java) map[key].files.java = item.path;
        } else if (/^input\d*\.txt$/.test(fl)) {
          map[key].files.inputs.push(item.path);
        } else if (/^output\d*\.txt$/.test(fl)) {
          map[key].files.outputs.push(item.path);
        }
      }
      return Object.values(map).sort((a, b) => +a.num - +b.num);
    },

    tierColor(tier) {
      if (/^Gold/.test(tier)) return '#d29922';
      if (/^Platinum/.test(tier)) return '#3fb950';
      if (/^Silver/.test(tier)) return '#79c0ff';
      if (/^Bronze/.test(tier)) return '#f0883e';
      return '#484f58';
    },

    tierBadgeClass(tier) {
      if (/^Gold/.test(tier)) return 'badge-gold';
      if (/^Silver/.test(tier)) return 'badge-silver';
      if (/^Bronze/.test(tier)) return 'badge-bronze';
      if (/^Platinum/.test(tier)) return 'badge-green';
      return 'badge-default';
    },

    TIER_ORDER: ['Platinum', 'Gold', 'Silver', 'Bronze'],

    sortTiers(tiers) {
      return [...tiers].sort((a, b) => {
        const ia = this.TIER_ORDER.findIndex(t => a.startsWith(t));
        const ib = this.TIER_ORDER.findIndex(t => b.startsWith(t));
        return (ia < 0 ? 99 : ia) - (ib < 0 ? 99 : ib);
      });
    },
  };

  /* ========================================================
   * Util — html escape (used by sidebar/views)
   * ======================================================== */
  const esc = (s) => (s ?? '')
    .toString()
    .replace(/&/g, '&amp;')
    .replace(/</g, '&lt;')
    .replace(/>/g, '&gt;')
    .replace(/"/g, '&quot;');

  /* ========================================================
   * State — selected problem, current tab, drafts (localStorage)
   * ======================================================== */
  const State = {
    PREF_KEY: 'preferences',
    DRAFT_KEY: 'drafts',

    problems: [],
    currentProblem: null,
    currentTab: 'problem',

    pref: { tierFilter: 'ALL', searchQuery: '', currentTab: 'problem', compareMode: false },

    loadPref() {
      const raw = localStorage.getItem(this.PREF_KEY);
      if (raw) Object.assign(this.pref, JSON.parse(raw));
      this.currentTab = this.pref.currentTab || 'problem';
    },

    savePref() {
      localStorage.setItem(this.PREF_KEY, JSON.stringify(this.pref));
    },

    draftKey(problem) { return `${problem.tier}/${problem.num}`; },

    getDraft(problem) {
      const all = JSON.parse(localStorage.getItem(this.DRAFT_KEY) || '{}');
      return all[this.draftKey(problem)] || null;
    },

    setDraft(problem, code) {
      const all = JSON.parse(localStorage.getItem(this.DRAFT_KEY) || '{}');
      all[this.draftKey(problem)] = { code, updatedAt: new Date().toISOString() };
      localStorage.setItem(this.DRAFT_KEY, JSON.stringify(all));
    },

    deleteDraft(problem) {
      const all = JSON.parse(localStorage.getItem(this.DRAFT_KEY) || '{}');
      delete all[this.draftKey(problem)];
      localStorage.setItem(this.DRAFT_KEY, JSON.stringify(all));
    },

    hasDraft(problem) { return !!this.getDraft(problem); },
  };

  /* ========================================================
   * Sidebar — tier tabs + search box + problem list.
   * The element.innerHTML usage here is safe: all values
   * passed through esc() (HTML escape) before insertion.
   * ======================================================== */
  const Sidebar = {
    init() {
      const sb = document.querySelector('.sidebar');
      sb.innerHTML = `
        <div class="tier-tabs" id="tier-tabs"></div>
        <div class="search-box">
          <input id="search-inp" placeholder="문제 번호 / 제목 검색..." />
        </div>
        <div class="problem-list" id="problem-list">
          <div class="empty-sidebar">로딩 중...</div>
        </div>
      `;
      sb.querySelector('#search-inp').value = State.pref.searchQuery;
      sb.querySelector('#search-inp').addEventListener('input', (e) => {
        State.pref.searchQuery = e.target.value.trim();
        State.savePref();
        this.renderList();
      });
    },

    buildTabs() {
      const tiers = [...new Set(State.problems.map(p => p.tier))];
      const sorted = Parser.sortTiers(tiers);
      const all = ['ALL', ...sorted];
      const html = all.map(t =>
        `<div class="tier-tab${t === State.pref.tierFilter ? ' active' : ''}" data-tier="${esc(t)}">${esc(t)}</div>`
      ).join('');
      const el = document.getElementById('tier-tabs');
      el.innerHTML = html;
      el.querySelectorAll('.tier-tab').forEach(node => {
        node.addEventListener('click', () => {
          State.pref.tierFilter = node.dataset.tier;
          State.savePref();
          this.buildTabs();
          this.renderList();
        });
      });
    },

    renderList() {
      const q = State.pref.searchQuery.toLowerCase();
      let list = State.pref.tierFilter === 'ALL'
        ? State.problems
        : State.problems.filter(p => p.tier === State.pref.tierFilter);
      if (q) list = list.filter(p => p.num.includes(q) || p.title.toLowerCase().includes(q));

      const el = document.getElementById('problem-list');
      if (!list.length) {
        el.innerHTML = '<div class="empty-sidebar">결과 없음</div>';
        return;
      }
      el.innerHTML = list.map(p => {
        const dot = Parser.tierColor(p.tier);
        const isActive = State.currentProblem &&
          State.currentProblem.num === p.num && State.currentProblem.tier === p.tier;
        const ioCount = p.files.inputs.length;
        const draftMark = State.hasDraft(p) ? ' has-draft' : '';
        return `<div class="problem-item${isActive ? ' active' : ''}${draftMark}" data-tier="${esc(p.tier)}" data-num="${esc(p.num)}">
          <div class="pi-top">
            <div class="pi-tier-dot" style="background:${dot}"></div>
            <div class="pi-num">#${esc(p.num)}</div>
            <div class="pi-title">${esc(p.title)}</div>
          </div>
          <div class="pi-meta">${esc(p.tier)}${ioCount ? ' · 예제 ' + ioCount + '개' : ''}</div>
        </div>`;
      }).join('');
      el.querySelectorAll('.problem-item').forEach(node => {
        node.addEventListener('click', () => {
          App.selectProblem(node.dataset.tier, node.dataset.num);
        });
      });
    },
  };

  /* ========================================================
   * App — entry + wiring (full render in later tasks)
   * ======================================================== */
  const App = {
    async init() {
      State.loadPref();
      Sidebar.init();
      try {
        const { tree } = await Api.fetchTree();
        State.problems = Parser.parseTree(tree);
        Sidebar.buildTabs();
        Sidebar.renderList();
      } catch (e) {
        document.querySelector('#problem-list').innerHTML =
          `<div class="empty-sidebar" style="color:#f85149">오류: ${esc(e.message)}</div>`;
      }
    },

    selectProblem(tier, num) {
      const p = State.problems.find(x => x.tier === tier && x.num === num);
      if (!p) return;
      State.currentProblem = p;
      Sidebar.renderList();
      // Main render arrives in Task 5
      document.querySelector('.main').innerHTML =
        `<div style="padding:20px;color:#8b949e;font-family:var(--mono);font-size:12px">` +
        `selected: ${esc(p.tier)} / ${esc(p.num)} ${esc(p.title)}` +
        `<br>files: ${esc(JSON.stringify(p.files))}</div>`;
    },
  };

  document.addEventListener('DOMContentLoaded', () => App.init());
```

**Note on innerHTML safety:** every value interpolated into the template strings above
goes through the `esc()` HTML-escape helper (problem numbers, titles, tier names, error
messages). User input is limited to localStorage drafts which never appear in markup.
Tree data comes from GitHub API which is also escaped before insertion.

- [ ] **Step 4.2: Manually verify sidebar populates and selection works**

```bash
python3 -m http.server 8000
```

Open the page. Expected:
- Tier tabs at the top of the sidebar (e.g., "ALL", "Gold V", "Silver III", sorted in tier order).
- Problem items list below, each with a colored dot, number, title, tier text, "예제 N개" if I/O present.
- Click a tier tab — list filters to that tier; tab gets active underline.
- Type in the search box — list filters by number or title.
- Click a problem item — main area replaces with debug `selected: ... files: ...` line.
- Refresh page — previously selected tier filter and search query persist.

Stop the server.

- [ ] **Step 4.3: Commit**

```bash
git add index.html
git commit -m "feat(viewer): Parser + State + Sidebar with tier tabs, search, problem list"
```

---

## Task 5: ProblemView — meta cards + README rendering

**Files:**
- Modify: `index.html` (extend Parser with README helpers; add ProblemView)

- [ ] **Step 5.1: Extend Parser with README parsing helpers**

Insert into the `Parser` object (just after `sortTiers`):

```js
    parseReadmeMeta(md) {
      const meta = {};
      const lines = md.split('\n');
      for (let i = 0; i < lines.length; i++) {
        const l = lines[i];
        const mem = l.match(/메모리[:\s]+([\d,]+ KB)/);
        if (mem) meta.memory = mem[1];
        const tim = l.match(/시간[:\s]+([\d,]+ ms)/);
        if (tim) meta.time = tim[1];
        if (/^#+\s*분류/.test(l)) {
          const next = lines.slice(i + 1).find(x => x.trim());
          if (next) meta.category = next.trim();
        }
        if (/^#+\s*제출\s*일자/.test(l)) {
          const next = lines.slice(i + 1).find(x => x.trim());
          if (next) meta.date = next.trim();
        }
      }
      return meta;
    },

    parseReadmeSections(md) {
      const sections = {};
      const keys = ['문제 설명', '문제', '입력', '출력', '힌트', '노트', '제한'];
      let cur = null;
      for (const l of md.split('\n')) {
        const hm = l.match(/^#+\s+(.+)/);
        if (hm) {
          const ht = hm[1].trim();
          cur = keys.find(k => ht.includes(k)) || null;
          if (cur && !sections[cur]) sections[cur] = '';
          continue;
        }
        if (cur) sections[cur] += l + '\n';
      }
      return sections;
    },

    containsHtmlTags(text) {
      return /<(p|div|ul|ol|li|img|sub|sup|strong|b|br|table|tr|td|th|h[1-6]|pre|code)\b/i.test(text);
    },

    sanitizeHtml(html) {
      let clean = html
        .replace(/<script[\s\S]*?<\/script>/gi, '')
        .replace(/<style[\s\S]*?<\/style>/gi, '')
        .replace(/on\w+="[^"]*"/gi, '')
        .replace(/on\w+='[^']*'/gi, '');
      clean = clean.replace(/src="\/upload\//g, 'src="https://www.acmicpc.net/upload/');
      clean = clean.replace(/src='\/upload\//g, "src='https://www.acmicpc.net/upload/");
      return clean;
    },

    mdToHtml(md) {
      return md.split('\n').map(l => {
        if (/^[-*]\s/.test(l)) return `<li>${l.replace(/^[-*]\s*/, '')}</li>`;
        if (l.trim() === '') return '<br>';
        let t = l
          .replace(/\*\*(.+?)\*\*/g, '<strong>$1</strong>')
          .replace(/`(.+?)`/g, '<code>$1</code>');
        return `<p>${t}</p>`;
      }).join('');
    },
```

- [ ] **Step 5.2: Add `ProblemView` and update `App.selectProblem` to render the main area**

Add a new namespace block after `Sidebar`:

```js
  /* ========================================================
   * ProblemView — header (title + tier badge + action bar slot),
   * view tabs, meta cards + README body.
   * ======================================================== */
  const ProblemView = {
    renderShell(p) {
      const main = document.querySelector('.main');
      main.innerHTML = `
        <div class="main-header" id="main-header">
          <div class="main-title">${esc(p.num + '. ' + p.title)}</div>
          <span class="tier-badge ${Parser.tierBadgeClass(p.tier)}">${esc(p.tier)}</span>
          <div class="action-bar" id="action-bar"></div>
        </div>
        <div class="view-tabs" id="view-tabs">
          <button class="view-tab" data-tab="problem">문제</button>
          <button class="view-tab" data-tab="reference">모범답안</button>
          <button class="view-tab" data-tab="mine">내 풀이</button>
          <button class="view-tab" data-tab="io">예제 입출력</button>
        </div>
        <div class="main-content" id="main-content"></div>
      `;
      main.querySelectorAll('.view-tab').forEach(node => {
        node.addEventListener('click', () => {
          State.currentTab = node.dataset.tab;
          State.pref.currentTab = node.dataset.tab;
          State.savePref();
          this.renderActiveTab();
        });
      });
      this.activateTab(State.currentTab || 'problem');
    },

    activateTab(tab) {
      State.currentTab = tab;
      document.querySelectorAll('.view-tab').forEach(t => {
        t.classList.toggle('active', t.dataset.tab === tab);
      });
      this.renderActiveTab();
    },

    setContent(html) {
      document.getElementById('main-content').innerHTML = html;
    },

    async renderActiveTab() {
      const p = State.currentProblem;
      if (!p) return;
      if (State.currentTab === 'problem') return this.renderProblem(p);
      // Other tabs implemented in later tasks
      this.setContent(`<div class="loading-msg">탭 "${esc(State.currentTab)}" — 다음 task에서 구현됩니다.</div>`);
    },

    async renderProblem(p) {
      this.setContent('<div class="loading-msg">README 로딩 중...</div>');
      try {
        if (!p._readme && p.files.readme) {
          p._readme = await Api.fetchFile(p.files.readme);
        }
        if (!p._readme) {
          this.setContent('<div class="loading-msg">README 없음</div>');
          return;
        }
        const meta = Parser.parseReadmeMeta(p._readme);
        const sections = Parser.parseReadmeSections(p._readme);

        let html = '';

        // Meta cards
        if (Object.keys(meta).length) {
          html += '<div class="meta-grid">';
          if (meta.memory) html += `<div class="meta-card"><div class="meta-label">메모리</div><div class="meta-val">${esc(meta.memory)}</div></div>`;
          if (meta.time) html += `<div class="meta-card"><div class="meta-label">시간</div><div class="meta-val">${esc(meta.time)}</div></div>`;
          if (meta.category) html += `<div class="meta-card"><div class="meta-label">분류</div><div class="meta-val">${esc(meta.category)}</div></div>`;
          if (meta.date) html += `<div class="meta-card"><div class="meta-label">제출일</div><div class="meta-val">${esc(meta.date)}</div></div>`;
          html += '</div>';
        }

        // Section bodies
        const display = [
          ['문제 설명', '문제'],
          ['입력'],
          ['출력'],
          ['제한'],
          ['힌트'],
          ['노트'],
        ];
        for (const keys of display) {
          const key = keys.find(k => sections[k]?.trim());
          if (!key) continue;
          const body = sections[key].trim();
          const label = key === '문제 설명' ? '문제' : key;
          const rendered = Parser.containsHtmlTags(body)
            ? Parser.sanitizeHtml(body)
            : Parser.mdToHtml(body);
          html += `<div class="prob-section">
            <div class="prob-section-title">${esc(label)}</div>
            <div class="prob-body">${rendered}</div>
          </div>`;
        }

        if (!html) {
          // Fallback: render whole body when section parsing fails
          const body = p._readme.split('\n').filter(l => !l.startsWith('#') && !l.match(/^\*\*(메모리|시간|분류|제출)/)).join('\n').trim();
          const rendered = Parser.containsHtmlTags(body) ? Parser.sanitizeHtml(body) : Parser.mdToHtml(body);
          html = `<div class="prob-body">${rendered}</div>`;
        }

        this.setContent(html);
      } catch (e) {
        this.setContent(`<div class="err-msg">${esc(e.message)}</div>`);
      }
    },
  };
```

**Note on innerHTML safety:** README content goes through `Parser.sanitizeHtml` which
strips script and style tags plus inline event handlers. Plain-text fields use `esc()`.
Safe under our trust model (your own repo, no user-uploaded content).

- [ ] **Step 5.3: Replace the temporary debug `selectProblem` body**

In the existing `App.selectProblem` method, replace the entire body with:

```js
    selectProblem(tier, num) {
      const p = State.problems.find(x => x.tier === tier && x.num === num);
      if (!p) return;
      State.currentProblem = p;
      Sidebar.renderList();
      ProblemView.renderShell(p);
    },
```

- [ ] **Step 5.4: Manually verify problem rendering**

```bash
python3 -m http.server 8000
```

Open the page. Click a Silver III problem (e.g., 2579 계단 오르기). Expected:
- Main area shows title + tier badge + 4 view tabs.
- "문제" tab is active by default and shows meta cards + sections (문제, 입력, 출력) with proper HTML rendering.
- Click "모범답안", "내 풀이", "예제 입출력" tabs: each shows the placeholder.
- Reload the page: last-selected tab persists (saved to `State.pref.currentTab`).

Stop the server.

- [ ] **Step 5.5: Commit**

```bash
git add index.html
git commit -m "feat(viewer): ProblemView with meta cards + README HTML/markdown rendering"
```

---

## Task 6: CodeView — 모범답안 tab with java syntax highlight

**Files:**
- Modify: `index.html` (add Highlighter, CodeView reference half, Toast utility)

- [ ] **Step 6.1: Add `Highlighter`, `CodeView`, and `Toast`**

Add these blocks after `ProblemView`:

```js
  /* ========================================================
   * Highlighter — minimal Java syntax highlighter.
   * ======================================================== */
  const Highlighter = {
    KEYWORDS: ['public','private','protected','class','interface','extends','implements',
      'new','return','if','else','for','while','do','switch','case','break','continue','default',
      'import','package','static','final','void','int','long','double','float','boolean','char',
      'byte','short','String','null','true','false','this','super','try','catch','finally','throw',
      'throws','instanceof','abstract','synchronized','volatile','transient','native','enum',
      'var','ArrayList','LinkedList','HashMap','HashSet','Scanner','Arrays','Math','System','out'],

    java(code) {
      const kwRe = new RegExp(`\\b(${this.KEYWORDS.join('|')})\\b`, 'g');
      return esc(code)
        .replace(/\/\/[^\n]*/g, m => `<span class="cm">${m}</span>`)
        .replace(/\/\*[\s\S]*?\*\//g, m => `<span class="cm">${m}</span>`)
        .replace(/(&quot;(?:[^&]|&(?!quot;))*&quot;)/g, m => `<span class="str">${m}</span>`)
        .replace(/(@\w+)/g, m => `<span class="ann">${m}</span>`)
        .replace(/\b(\d+[lLdDfF]?)\b/g, m => `<span class="num">${m}</span>`)
        .replace(kwRe, m => `<span class="kw">${m}</span>`);
    },
  };

  /* ========================================================
   * CodeView — 모범답안 (this task) + 내 풀이 (Task 7)
   * + compare mode (Task 12).
   * ======================================================== */
  const CodeView = {
    async renderReference(p) {
      ProblemView.setContent('<div class="loading-msg">코드 로딩 중...</div>');
      if (!p.files.java) {
        ProblemView.setContent('<div class="loading-msg">.java 파일 없음</div>');
        return;
      }
      try {
        if (!p._java) p._java = await Api.fetchFile(p.files.java);
        ProblemView.setContent(this.referenceMarkup(p._java));
        document.getElementById('reference-copy').addEventListener('click', () => {
          navigator.clipboard.writeText(p._java).then(
            () => Toast.show('모범답안 복사 완료'),
            () => Toast.show('복사 실패. 코드를 수동으로 선택해 주세요.', { error: true })
          );
        });
      } catch (e) {
        ProblemView.setContent(`<div class="err-msg">${esc(e.message)}</div>`);
      }
    },

    referenceMarkup(code) {
      return `<div class="code-wrap">
        <div class="code-header">
          <span class="code-lang">Java · 모범답안</span>
          <div class="code-actions">
            <button class="copy-btn" id="reference-copy">복사</button>
          </div>
        </div>
        <pre>${Highlighter.java(code)}</pre>
      </div>`;
    },
  };

  /* ========================================================
   * Toast — bottom-center fade message.
   * ======================================================== */
  const Toast = {
    show(msg, { error = false, ms = 1800 } = {}) {
      let el = document.querySelector('.toast');
      if (!el) {
        el = document.createElement('div');
        el.className = 'toast';
        document.body.appendChild(el);
      }
      el.textContent = msg;
      el.classList.toggle('err', !!error);
      el.classList.add('show');
      clearTimeout(this._t);
      this._t = setTimeout(() => el.classList.remove('show'), ms);
    },
  };
```

- [ ] **Step 6.2: Wire `reference` tab into `ProblemView.renderActiveTab`**

Update the renderActiveTab body:

```js
    async renderActiveTab() {
      const p = State.currentProblem;
      if (!p) return;
      if (State.currentTab === 'problem') return this.renderProblem(p);
      if (State.currentTab === 'reference') return CodeView.renderReference(p);
      this.setContent(`<div class="loading-msg">탭 "${esc(State.currentTab)}" — 다음 task에서 구현됩니다.</div>`);
    },
```

- [ ] **Step 6.3: Manually verify the reference tab works**

```bash
python3 -m http.server 8000
```

Pick a problem with a `.java` file (e.g., 2579). Expected:
- Click "모범답안" tab — `.java` file content renders with syntax highlighting (keywords red, strings blue, numbers blue, comments grey).
- Click "복사" button — toast says "모범답안 복사 완료"; paste somewhere to confirm.

Stop the server.

- [ ] **Step 6.4: Commit**

```bash
git add index.html
git commit -m "feat(viewer): CodeView reference tab with Java syntax highlight"
```

---

## Task 7: CodeView — 내 풀이 editor + drafts + 초기화 + 시작

**Files:**
- Modify: `index.html` (add `renderMine` to CodeView, wire tab)

- [ ] **Step 7.1: Add `CodeView.renderMine`**

Insert into the `CodeView` object after `referenceMarkup`:

```js
    renderMine(p) {
      const draft = State.getDraft(p);
      const lastSaved = draft ? new Date(draft.updatedAt).toLocaleString('ko-KR') : null;
      const code = draft?.code ?? '';
      ProblemView.setContent(`
        <div class="code-wrap">
          <div class="code-header">
            <span class="code-lang">Java · 내 풀이</span>
            <div class="code-actions">
              <span class="code-status" id="mine-status">${lastSaved ? '저장됨 · ' + esc(lastSaved) : '저장된 풀이 없음'}</span>
              <button class="seed-btn" id="mine-seed">기존 풀이로부터 시작</button>
              <button class="reset-btn" id="mine-reset">초기화</button>
            </div>
          </div>
          <textarea class="editor" id="mine-editor" placeholder="여기에 새 풀이를 작성하세요. 입력 시마다 자동 저장됩니다."></textarea>
        </div>
      `);

      const editor = document.getElementById('mine-editor');
      const status = document.getElementById('mine-status');
      const seedBtn = document.getElementById('mine-seed');
      const resetBtn = document.getElementById('mine-reset');
      editor.value = code;

      // Auto-save on input (debounced 250ms)
      let timer;
      editor.addEventListener('input', () => {
        clearTimeout(timer);
        timer = setTimeout(() => {
          State.setDraft(p, editor.value);
          status.textContent = '저장됨 · ' + new Date().toLocaleString('ko-KR');
          Sidebar.renderList(); // refresh has-draft dot
        }, 250);
      });

      // Seed from reference solution
      seedBtn.addEventListener('click', async () => {
        if (editor.value.trim() && !confirm('현재 입력 내용이 모범답안으로 덮어써집니다. 계속할까요?')) return;
        try {
          if (!p._java && p.files.java) p._java = await Api.fetchFile(p.files.java);
          if (!p._java) { Toast.show('모범답안 .java가 없습니다', { error: true }); return; }
          editor.value = p._java;
          State.setDraft(p, editor.value);
          status.textContent = '저장됨 · ' + new Date().toLocaleString('ko-KR');
          Sidebar.renderList();
          Toast.show('모범답안에서 시드 완료');
        } catch (e) {
          Toast.show(e.message, { error: true });
        }
      });

      // Reset (clear draft)
      resetBtn.addEventListener('click', () => {
        if (!confirm('이 문제의 내 풀이를 삭제할까요? 되돌릴 수 없습니다.')) return;
        editor.value = '';
        State.deleteDraft(p);
        status.textContent = '저장된 풀이 없음';
        Sidebar.renderList();
        Toast.show('초기화 완료');
      });
    },
```

- [ ] **Step 7.2: Wire `mine` tab in `ProblemView.renderActiveTab`**

Update the renderActiveTab body:

```js
    async renderActiveTab() {
      const p = State.currentProblem;
      if (!p) return;
      if (State.currentTab === 'problem') return this.renderProblem(p);
      if (State.currentTab === 'reference') return CodeView.renderReference(p);
      if (State.currentTab === 'mine') return CodeView.renderMine(p);
      this.setContent(`<div class="loading-msg">탭 "${esc(State.currentTab)}" — 다음 task에서 구현됩니다.</div>`);
    },
```

- [ ] **Step 7.3: Manually verify the editor + drafts**

```bash
python3 -m http.server 8000
```

Open page, pick a problem, click "내 풀이" tab. Expected:
- Empty textarea, status "저장된 풀이 없음".
- Type some code; status updates to "저장됨 · ..." after 250ms; sidebar shows a blue dot next to the problem (has-draft).
- Switch to a different problem and back: code persists.
- Refresh the page: code persists across reloads.
- Click "기존 풀이로부터 시작" — confirm — editor fills with model solution; toast.
- Click "초기화" — confirm — editor empties; sidebar dot disappears; toast.
- Have draft for problem A and draft for problem B simultaneously: they don't overwrite each other.

Stop the server.

- [ ] **Step 7.4: Commit**

```bash
git add index.html
git commit -m "feat(viewer): CodeView 내 풀이 editor with debounced auto-save + seed + reset"
```

---

## Task 8: IOView — example input/output pairs

**Files:**
- Modify: `index.html` (add IOView, wire tab)

- [ ] **Step 8.1: Add `IOView`**

Add after `CodeView`:

```js
  /* ========================================================
   * IOView — example input/output pairs.
   * ======================================================== */
  const IOView = {
    async render(p) {
      ProblemView.setContent('<div class="loading-msg">예제 로딩 중...</div>');
      const inputs = [...p.files.inputs].sort();
      const outputs = [...p.files.outputs].sort();
      if (!inputs.length && !outputs.length) {
        ProblemView.setContent('<div class="loading-msg">예제 파일이 없습니다. 문제 본문의 "예제 입력/출력" 섹션을 참고하세요.</div>');
        return;
      }
      try {
        if (!p._inputs) p._inputs = await Promise.all(inputs.map(x => Api.fetchFile(x)));
        if (!p._outputs) p._outputs = await Promise.all(outputs.map(x => Api.fetchFile(x)));

        const max = Math.max(p._inputs.length, p._outputs.length);
        let html = '';
        for (let i = 0; i < max; i++) {
          const inp = p._inputs[i] ?? '(없음)';
          const out = p._outputs[i] ?? '(없음)';
          html += `<div class="io-pair">
            <div class="io-box"><div class="io-label">입력 ${i + 1}</div><pre>${esc(inp.trim())}</pre></div>
            <div class="io-box"><div class="io-label">출력 ${i + 1}</div><pre>${esc(out.trim())}</pre></div>
          </div>`;
        }
        if (p._inputs.length !== p._outputs.length) {
          html += `<div class="loading-msg">입력 ${p._inputs.length}개 · 출력 ${p._outputs.length}개 — 짝이 맞지 않는 항목은 "(없음)"으로 표기됩니다.</div>`;
        }
        ProblemView.setContent(html);
      } catch (e) {
        ProblemView.setContent(`<div class="err-msg">${esc(e.message)}</div>`);
      }
    },
  };
```

- [ ] **Step 8.2: Wire `io` tab in `ProblemView.renderActiveTab`**

Update the renderActiveTab body to its near-final form:

```js
    async renderActiveTab() {
      const p = State.currentProblem;
      if (!p) return;
      if (State.currentTab === 'problem') return this.renderProblem(p);
      if (State.currentTab === 'reference') return CodeView.renderReference(p);
      if (State.currentTab === 'mine') return CodeView.renderMine(p);
      if (State.currentTab === 'io') return IOView.render(p);
      this.setContent(`<div class="loading-msg">알 수 없는 탭: ${esc(State.currentTab)}</div>`);
    },
```

- [ ] **Step 8.3: Manually verify IO display**

```bash
python3 -m http.server 8000
```

Pick a problem with examples (e.g., 백준/Silver/15649. N과 M (1) — has 2 inputs, 3 outputs).
Click "예제 입출력". Expected:
- Three rows; the unmatched output3 shows on its own with "(없음)" on the left.
- Bottom note: "입력 2개 · 출력 3개 — 짝이 맞지 않는..."
- Pick a problem without examples — message "예제 파일이 없습니다..."

Stop the server.

- [ ] **Step 8.4: Commit**

```bash
git add index.html
git commit -m "feat(viewer): IOView for example input/output pairs"
```

---

## Task 9: ActionBar — testcase.ac registry + clipboard + new tab + BOJ link

**Files:**
- Modify: `index.html` (add ActionBar; populate the slot in main-header)

- [ ] **Step 9.1: Add `ActionBar`**

Add after `IOView`:

```js
  /* ========================================================
   * ActionBar — "반례 찾기" + "BOJ 원문" buttons in main-header.
   * Checks testcase.ac registry for the current problem,
   * caches result for 7 days. Disabled state for unregistered.
   * ======================================================== */
  const ActionBar = {
    REG_KEY: 'testcase-ac-registry',
    REG_TTL_MS: 7 * 24 * 60 * 60 * 1000,

    async ensureRegistry(num) {
      const cached = JSON.parse(localStorage.getItem(this.REG_KEY) || '{}');
      const fresh = cached.fetchedAt && (Date.now() - new Date(cached.fetchedAt).getTime() < this.REG_TTL_MS);
      if (fresh && (num in cached)) return cached[num];

      const url = `https://api.testcase.ac/api/problems/boj/${encodeURIComponent(num)}`;
      try {
        const res = await fetch(url);
        const ok = res.ok; // 200 = registered, 404 = not registered
        cached[num] = ok;
        cached.fetchedAt = new Date().toISOString();
        localStorage.setItem(this.REG_KEY, JSON.stringify(cached));
        return ok;
      } catch {
        return null; // unknown
      }
    },

    async render(p) {
      const slot = document.getElementById('action-bar');
      slot.innerHTML = `
        <button class="action-btn" id="ac-stress" disabled title="등록 여부 확인 중">반례 찾기 →</button>
        <a class="action-btn muted" id="ac-boj" href="https://www.acmicpc.net/problem/${esc(p.num)}" target="_blank" rel="noopener">BOJ 원문 →</a>
      `;
      const btn = slot.querySelector('#ac-stress');
      const registered = await this.ensureRegistry(p.num);
      if (registered === true) {
        btn.disabled = false;
        btn.title = 'testcase.ac에서 반례 찾기';
      } else if (registered === false) {
        btn.disabled = true;
        btn.title = 'testcase.ac에 등록되지 않은 문제';
        btn.classList.add('disabled');
      } else {
        // unknown (network error) — keep enabled for fallback
        btn.disabled = false;
        btn.title = 'testcase.ac 등록 여부 확인 실패. 직접 시도해 보세요.';
      }
      btn.addEventListener('click', async () => {
        const draft = State.getDraft(p);
        const code = draft?.code ?? '';
        const url = `https://next.testcase.ac/problems/boj/${encodeURIComponent(p.num)}`;
        if (!code.trim()) {
          window.open(url, '_blank', 'noopener');
          Toast.show('내 풀이가 비어있습니다 — 빈 채로 testcase.ac 열림');
          return;
        }
        try {
          await navigator.clipboard.writeText(code);
          Toast.show('코드 복사 완료 → testcase.ac 새 탭');
        } catch {
          Toast.show('코드 복사 실패. 수동으로 복사해 주세요.', { error: true });
        }
        window.open(url, '_blank', 'noopener');
      });
    },
  };
```

- [ ] **Step 9.2: Call `ActionBar.render` from `ProblemView.renderShell`**

At the end of `ProblemView.renderShell` (after `this.activateTab(...)`), add:

```js
      ActionBar.render(p);
```

- [ ] **Step 9.3: Manually verify the action bar**

```bash
python3 -m http.server 8000
```

- Pick a problem registered in testcase.ac (e.g., 1005, 2579 — confirmed registered earlier). Expected: "반례 찾기 →" button is enabled (blue background).
- Pick a problem NOT registered (most Silver problems): button is disabled (faded), tooltip says "testcase.ac에 등록되지 않은 문제".
- Click "반례 찾기 →" with a non-empty draft: clipboard contains the code; new tab opens to `next.testcase.ac/problems/boj/{num}`; toast confirms.
- Click "반례 찾기 →" with empty draft: tab still opens; toast says "내 풀이가 비어있습니다 ...".
- Click "BOJ 원문 →": new tab opens to `acmicpc.net/problem/{num}`.

Stop the server.

- [ ] **Step 9.4: Commit**

```bash
git add index.html
git commit -m "feat(viewer): ActionBar with testcase.ac registry check + clipboard copy"
```

---

## Task 10: Archive script — TDD with Node test

**Files:**
- Create: `scripts/archive-images.mjs`
- Create: `tests/archive-images.test.mjs`

This task uses real TDD because the script is a Node module, runnable with the
built-in `node --test` runner. Tests cover URL extraction, hash naming, and the
README scanning loop. The download itself is mocked.

- [ ] **Step 10.1: Write the failing test file**

Create `tests/archive-images.test.mjs`:

```js
import { test } from 'node:test';
import assert from 'node:assert/strict';
import { mkdtemp, writeFile, mkdir, rm } from 'node:fs/promises';
import { tmpdir } from 'node:os';
import { join } from 'node:path';

import {
  extractImageUrls,
  urlToLocalPath,
  collectImageUrls,
} from '../scripts/archive-images.mjs';

test('extractImageUrls: pulls https sources from img tags', () => {
  const html = `
    <p>some text</p>
    <img src="https://u.acmicpc.net/abc/img.png">
    <img alt="" src='https://upload.acmicpc.net/xyz/-/preview/' style="width:300px">
    <img src="/relative/should/be/ignored.png">
    <img src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/1/1.png">
  `;
  const urls = extractImageUrls(html);
  assert.deepEqual(urls.sort(), [
    'https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/1/1.png',
    'https://u.acmicpc.net/abc/img.png',
    'https://upload.acmicpc.net/xyz/-/preview/',
  ]);
});

test('urlToLocalPath: stable 8-char sha1 + extension', () => {
  const a = urlToLocalPath('https://u.acmicpc.net/abc/img.png');
  const b = urlToLocalPath('https://u.acmicpc.net/abc/img.png');
  assert.equal(a, b, 'same url should map to same path');
  assert.match(a, /백준\/\.assets\/[a-f0-9]{8}\.png$/);
});

test('urlToLocalPath: defaults to .png when extension missing/odd', () => {
  const p = urlToLocalPath('https://upload.acmicpc.net/xyz/-/preview/');
  assert.match(p, /백준\/\.assets\/[a-f0-9]{8}\.png$/);
});

test('urlToLocalPath: preserves common image extensions', () => {
  assert.match(urlToLocalPath('https://x/a.jpg'), /\.jpg$/);
  assert.match(urlToLocalPath('https://x/a.JPEG'), /\.jpeg$/);
  assert.match(urlToLocalPath('https://x/a.gif'), /\.gif$/);
  assert.match(urlToLocalPath('https://x/a.svg'), /\.svg$/);
});

test('collectImageUrls: walks 백준 tree and dedupes urls', async () => {
  const root = await mkdtemp(join(tmpdir(), 'boj-test-'));
  try {
    await mkdir(join(root, '백준', 'Silver', '111. A'), { recursive: true });
    await mkdir(join(root, '백준', 'Gold', '222. B'), { recursive: true });
    await writeFile(join(root, '백준', 'Silver', '111. A', 'README.md'),
      '<img src="https://x/1.png"> shared <img src="https://y/2.gif">');
    await writeFile(join(root, '백준', 'Gold', '222. B', 'README.md'),
      '<img src="https://x/1.png"> dup <img src="https://z/3.jpg">');

    const urls = await collectImageUrls({ rootDir: root });
    assert.deepEqual(urls.sort(), [
      'https://x/1.png',
      'https://y/2.gif',
      'https://z/3.jpg',
    ]);
  } finally {
    await rm(root, { recursive: true, force: true });
  }
});
```

- [ ] **Step 10.2: Run the test and confirm it fails**

```bash
node --test tests/archive-images.test.mjs
```

Expected: errors about missing imports — `Cannot find module ../scripts/archive-images.mjs`
or `does not provide an export named 'extractImageUrls'`. This is the desired failure
state because the implementation doesn't exist yet.

- [ ] **Step 10.3: Write the minimal implementation**

Create `scripts/archive-images.mjs`:

```js
#!/usr/bin/env node
import { readFile, writeFile, readdir, stat, mkdir } from 'node:fs/promises';
import { existsSync } from 'node:fs';
import { join, extname, dirname } from 'node:path';
import { fileURLToPath } from 'node:url';
import { createHash } from 'node:crypto';

const IMG_RE = /<img[^>]+src=["']([^"']+)["'][^>]*>/gi;
const KNOWN_EXTS = new Set(['.png', '.jpg', '.jpeg', '.gif', '.svg', '.webp', '.bmp']);

export function extractImageUrls(html) {
  const urls = new Set();
  for (const m of html.matchAll(IMG_RE)) {
    const src = m[1];
    if (/^https?:\/\//i.test(src)) urls.add(src);
  }
  return [...urls];
}

export function urlToLocalPath(url, { rootDir = '.' } = {}) {
  const hash = createHash('sha1').update(url).digest('hex').slice(0, 8);
  let ext = '.png';
  try {
    const u = new URL(url);
    const e = extname(u.pathname).toLowerCase();
    if (KNOWN_EXTS.has(e)) ext = e;
  } catch { /* default */ }
  return join(rootDir, '백준', '.assets', `${hash}${ext}`);
}

export async function collectImageUrls({ rootDir = '.' } = {}) {
  const bojDir = join(rootDir, '백준');
  if (!existsSync(bojDir)) return [];

  const urls = new Set();
  const tiers = await readdir(bojDir);
  for (const tier of tiers) {
    if (tier.startsWith('.')) continue;
    const tierPath = join(bojDir, tier);
    let s;
    try { s = await stat(tierPath); } catch { continue; }
    if (!s.isDirectory()) continue;

    const problems = await readdir(tierPath);
    for (const p of problems) {
      if (p.startsWith('.')) continue;
      const readme = join(tierPath, p, 'README.md');
      if (!existsSync(readme)) continue;
      const content = await readFile(readme, 'utf8');
      for (const u of extractImageUrls(content)) urls.add(u);
    }
  }
  return [...urls];
}

export async function loadIndex({ rootDir = '.' } = {}) {
  const indexFile = join(rootDir, '백준', '.assets', 'index.json');
  if (!existsSync(indexFile)) return {};
  return JSON.parse(await readFile(indexFile, 'utf8'));
}

export async function saveIndex(index, { rootDir = '.' } = {}) {
  const dir = join(rootDir, '백준', '.assets');
  await mkdir(dir, { recursive: true });
  await writeFile(join(dir, 'index.json'), JSON.stringify(index, null, 2) + '\n');
}

export async function downloadOne(url, { rootDir = '.' } = {}) {
  const localFull = urlToLocalPath(url, { rootDir });
  if (existsSync(localFull)) return relativeToRoot(localFull, rootDir);
  await mkdir(dirname(localFull), { recursive: true });
  const res = await fetch(url);
  if (!res.ok) throw new Error(`HTTP ${res.status}`);
  const buf = Buffer.from(await res.arrayBuffer());
  await writeFile(localFull, buf);
  return relativeToRoot(localFull, rootDir);
}

function relativeToRoot(absPath, rootDir) {
  const root = rootDir === '.' ? process.cwd() : rootDir;
  if (absPath.startsWith(root + '/')) return absPath.slice(root.length + 1);
  if (absPath.startsWith(root)) return absPath.slice(root.length);
  return absPath;
}

async function main() {
  const rootDir = process.cwd();
  const index = await loadIndex({ rootDir });
  const urls = await collectImageUrls({ rootDir });

  let downloaded = 0, cached = 0, failed = 0;
  for (const url of urls) {
    if (index[url]) { cached++; continue; }
    try {
      index[url] = await downloadOne(url, { rootDir });
      downloaded++;
      console.log(`  ok ${url}`);
    } catch (e) {
      failed++;
      console.error(`  fail ${url}: ${e.message}`);
    }
  }
  await saveIndex(index, { rootDir });
  console.log(`done: ${downloaded} downloaded, ${cached} cached, ${failed} failed`);
}

if (process.argv[1] && fileURLToPath(import.meta.url) === process.argv[1]) {
  main().catch(e => { console.error(e); process.exit(1); });
}
```

- [ ] **Step 10.4: Run tests and confirm they pass**

```bash
node --test tests/archive-images.test.mjs
```

Expected: 5 tests pass (`# pass 5`, `# fail 0`).

- [ ] **Step 10.5: Run the script for real and verify the side effects**

```bash
node scripts/archive-images.mjs
```

Expected output: `done: 12 downloaded, 0 cached, 0 failed` (or close — depends on
what's still reachable). Inspect:

```bash
ls -lah 백준/.assets/ | head -20
head 백준/.assets/index.json
```

- ~12 image files in `백준/.assets/` (sha1 prefix names)
- `index.json` mapping each URL to its `백준/.assets/<hash>.<ext>` relative path

Run the script a second time — expected: `0 downloaded, 12 cached, 0 failed`.

- [ ] **Step 10.6: Commit**

```bash
git add scripts/archive-images.mjs tests/archive-images.test.mjs 백준/.assets/
git commit -m "feat(archive): node script + tests for downloading README images"
```

---

## Task 11: ImageArchive viewer integration

**Files:**
- Modify: `index.html` (add ImageArchive object; rewrite img src before insertion)

- [ ] **Step 11.1: Add `ImageArchive` and load it on init**

Add a new namespace after `Toast`:

```js
  /* ========================================================
   * ImageArchive — load 백준/.assets/index.json once, then
   * rewrite img src in README HTML before insertion.
   * Falls back to original src on per-image failure (onerror).
   * ======================================================== */
  const ImageArchive = {
    map: null,

    async load() {
      try {
        const res = await fetch('백준/.assets/index.json');
        if (!res.ok) { this.map = {}; return; }
        this.map = await res.json();
      } catch {
        this.map = {};
      }
    },

    rewrite(html) {
      if (!this.map || !Object.keys(this.map).length) return html;
      return html.replace(/<img([^>]*)src=(["'])([^"']+)\2/gi, (m, attrs, q, url) => {
        const local = this.map[url];
        if (!local) return m;
        const safe = url.replace(/"/g, '&quot;');
        return `<img${attrs}src=${q}${local}${q} data-original-src="${safe}" onerror="this.onerror=null;this.src=this.dataset.originalSrc"`;
      });
    },
  };
```

- [ ] **Step 11.2: Use `ImageArchive.rewrite` inside `Parser.sanitizeHtml`**

In `Parser.sanitizeHtml`, change the return to apply rewrite as a final step:

```js
    sanitizeHtml(html) {
      let clean = html
        .replace(/<script[\s\S]*?<\/script>/gi, '')
        .replace(/<style[\s\S]*?<\/style>/gi, '')
        .replace(/on\w+="[^"]*"/gi, '')
        .replace(/on\w+='[^']*'/gi, '');
      clean = clean.replace(/src="\/upload\//g, 'src="https://www.acmicpc.net/upload/');
      clean = clean.replace(/src='\/upload\//g, "src='https://www.acmicpc.net/upload/");
      clean = ImageArchive.rewrite(clean);
      return clean;
    },
```

The onerror attribute we add comes AFTER our event-handler stripper. Order matters.

- [ ] **Step 11.3: Load the archive index in `App.init` before tree fetch**

Update `App.init`:

```js
    async init() {
      State.loadPref();
      Sidebar.init();
      await ImageArchive.load();
      try {
        const { tree } = await Api.fetchTree();
        State.problems = Parser.parseTree(tree);
        Sidebar.buildTabs();
        Sidebar.renderList();
      } catch (e) {
        document.querySelector('#problem-list').innerHTML =
          `<div class="empty-sidebar" style="color:#f85149">오류: ${esc(e.message)}</div>`;
      }
    },
```

- [ ] **Step 11.4: Manually verify image rewriting**

```bash
python3 -m http.server 8000
```

- Pick a problem with images in its README (e.g., Silver/2579 has u.acmicpc.net images).
- Open DevTools Network panel, refresh, switch to "문제" tab.
- Expected: image requests go to `백준/.assets/<hash>.<ext>`, not to `u.acmicpc.net`.
- Right-click an image, Inspect: `<img src="백준/.assets/...png" data-original-src="https://...">`.
- Temporarily rename one local image (`mv 백준/.assets/abc.png /tmp/`), reload: network shows the local 404, then a fallback request to the original `https://...` URL. Restore the file when done.

Stop the server.

- [ ] **Step 11.5: Commit**

```bash
git add index.html
git commit -m "feat(viewer): ImageArchive rewrites README img src to local paths with fallback"
```

---

## Task 12: Compare mode — side-by-side 모범답안 vs 내 풀이

**Files:**
- Modify: `index.html` (extend CodeView with compare mode; add toggle UI)

- [ ] **Step 12.1: Add `renderCompare` to `CodeView`**

Add into `CodeView` (after `renderMine`):

```js
    async renderCompare(p) {
      ProblemView.setContent('<div class="loading-msg">비교 화면 로딩 중...</div>');
      const draft = State.getDraft(p);
      if (!p.files.java) { ProblemView.setContent('<div class="loading-msg">.java 파일 없음</div>'); return; }
      if (!draft) { ProblemView.setContent('<div class="loading-msg">"내 풀이"가 없습니다. 먼저 작성해 주세요.</div>'); return; }
      try {
        if (!p._java) p._java = await Api.fetchFile(p.files.java);
        const left = `<div class="code-wrap">
          <div class="code-header"><span class="code-lang">모범답안</span></div>
          <pre>${Highlighter.java(p._java)}</pre>
        </div>`;
        const right = `<div class="code-wrap">
          <div class="code-header"><span class="code-lang">내 풀이</span><span class="code-status">${esc(new Date(draft.updatedAt).toLocaleString('ko-KR'))}</span></div>
          <pre>${Highlighter.java(draft.code)}</pre>
        </div>`;
        ProblemView.setContent(`<div class="compare-wrap">${left}${right}</div>`);
      } catch (e) {
        ProblemView.setContent(`<div class="err-msg">${esc(e.message)}</div>`);
      }
    },
```

- [ ] **Step 12.2: Add a "비교" view tab in `ProblemView.renderShell`**

In `ProblemView.renderShell`, replace the view-tabs block with:

```js
        <div class="view-tabs" id="view-tabs">
          <button class="view-tab" data-tab="problem">문제</button>
          <button class="view-tab" data-tab="reference">모범답안</button>
          <button class="view-tab" data-tab="mine">내 풀이</button>
          <button class="view-tab" data-tab="compare">비교</button>
          <button class="view-tab" data-tab="io">예제 입출력</button>
        </div>
```

And update `renderActiveTab` to its final form:

```js
    async renderActiveTab() {
      const p = State.currentProblem;
      if (!p) return;
      if (State.currentTab === 'problem')   return this.renderProblem(p);
      if (State.currentTab === 'reference') return CodeView.renderReference(p);
      if (State.currentTab === 'mine')      return CodeView.renderMine(p);
      if (State.currentTab === 'compare')   return CodeView.renderCompare(p);
      if (State.currentTab === 'io')        return IOView.render(p);
      this.setContent(`<div class="loading-msg">알 수 없는 탭: ${esc(State.currentTab)}</div>`);
    },
```

- [ ] **Step 12.3: Manually verify compare mode**

```bash
python3 -m http.server 8000
```

- Pick a problem with both reference and a typed draft. Click "비교" tab.
- Expected: side-by-side columns; left = 모범답안, right = 내 풀이; both syntax-highlighted.
- On a narrow window (< 1100px), columns stack vertically (per CSS media query).
- Pick a problem without a draft — message "내 풀이가 없습니다...".
- Pick a problem without `.java` — ".java 파일 없음".

Stop the server.

- [ ] **Step 12.4: Commit**

```bash
git add index.html
git commit -m "feat(viewer): compare tab — side-by-side reference vs my-solution"
```

---

## Task 13: Topbar — status chip + refresh button + offline banner

**Files:**
- Modify: `index.html` (extend topbar markup, add Topbar object)

- [ ] **Step 13.1: Replace the topbar contents with a chip + refresh button**

In the body, change `<header class="topbar">` to:

```html
<header class="topbar">
  <div class="topbar-logo">boj<span>.</span>study</div>
  <div class="topbar-spacer"></div>
  <span class="stat-chip" id="stat-chip"></span>
  <button class="topbar-btn" id="refresh-btn" title="GitHub 트리 강제 갱신">새로고침</button>
</header>
```

- [ ] **Step 13.2: Add a `Topbar` object that updates the chip and wires the button**

Add after `ImageArchive`:

```js
  /* ========================================================
   * Topbar — stat chip (problem count + tree source) + refresh.
   * ======================================================== */
  const Topbar = {
    init() {
      document.getElementById('refresh-btn').addEventListener('click', async () => {
        await App.reloadTree({ force: true });
      });
    },

    setChip(text, tone = '') {
      const el = document.getElementById('stat-chip');
      el.textContent = text;
      el.className = 'stat-chip' + (tone ? ' ' + tone : '');
    },
  };
```

- [ ] **Step 13.3: Wire chip updates + refresh into `App`**

Replace `App` body with:

```js
  const App = {
    async init() {
      State.loadPref();
      Sidebar.init();
      Topbar.init();
      await ImageArchive.load();
      await this.reloadTree();
    },

    async reloadTree({ force = false } = {}) {
      try {
        const { tree, source, error } = await Api.fetchTree({ force });
        State.problems = Parser.parseTree(tree);
        Sidebar.buildTabs();
        Sidebar.renderList();
        const sourceLabel = {
          'fresh': '갱신됨',
          'cache-fresh': '캐시',
          'etag-304': '캐시(검증)',
          'rate-limited-cache': '캐시(rate-limited)',
          'offline-cache': '캐시(오프라인)',
          'error-cache': '캐시(오류)',
        }[source] || source;
        const tone = ['rate-limited-cache', 'offline-cache', 'error-cache'].includes(source) ? 'warn' : '';
        Topbar.setChip(`${State.problems.length}문제 · ${sourceLabel}`, tone);
        if (error) console.warn('[App] tree fetch warning:', error);
      } catch (e) {
        Topbar.setChip(`오류: ${e.message}`, 'err');
      }
    },

    selectProblem(tier, num) {
      const p = State.problems.find(x => x.tier === tier && x.num === num);
      if (!p) return;
      State.currentProblem = p;
      Sidebar.renderList();
      ProblemView.renderShell(p);
    },
  };
```

- [ ] **Step 13.4: Manually verify the chip and refresh**

```bash
python3 -m http.server 8000
```

- On first load: chip shows e.g. "47문제 · 갱신됨".
- Reload page: chip shows "47문제 · 캐시".
- Click "새로고침": chip briefly says "갱신됨" or "캐시(검증)" depending on ETag.
- DevTools, Network panel, "Disable cache" + "Offline" mode + reload: chip shows "47문제 · 캐시(오프라인)" with warn (yellow) tone.
- DevTools, Application, Local storage, delete `tree-cache`, reload offline: chip shows "오류: 네트워크 오류 + 캐시 없음" with err (red) tone.

Stop the server.

- [ ] **Step 13.5: Commit**

```bash
git add index.html
git commit -m "feat(viewer): topbar status chip + force-refresh button + offline handling"
```

---

## Task 14: GitHub Pages enable + final smoke test

**Files:**
- None (deployment + final verification only)

- [ ] **Step 14.1: Enable GitHub Pages**

Visit `https://github.com/bsy1343/algorithm/settings/pages` in browser. Configure:

- Source: Deploy from a branch
- Branch: `main`
- Folder: `/` (root)
- Save

GitHub takes 1–3 minutes to publish. Watch the Actions tab for the `pages-build-deployment`
workflow to complete.

- [ ] **Step 14.2: Push the .assets/ and viewer**

If the previous task commits haven't been pushed yet:

```bash
git push origin main
```

- [ ] **Step 14.3: Verify the live site**

Open `https://bsy1343.github.io/algorithm/` in the browser. Expected:

- Page loads with the dark theme.
- Sidebar populates with BOJ problems.
- Click a problem, tabs work (문제 / 모범답안 / 내 풀이 / 비교 / 예제 입출력).
- Images in README load from `백준/.assets/...` (DevTools Network).
- "반례 찾기" button enabled for registered problems (e.g., 1005), disabled for others.
- "내 풀이" tab persists across reloads (localStorage).
- Topbar chip shows "47문제 · 갱신됨" or similar.

If GitHub Pages serves a 404 for `백준/.assets/index.json`, double-check that
`.nojekyll` exists at the repo root. Without it, dot-folders are excluded from the
Jekyll build.

- [ ] **Step 14.4: Run the final test suite**

```bash
node --test tests/
```

Expected: all archive-images tests pass.

- [ ] **Step 14.5: Final commit (if any pending changes)**

```bash
git status
# If any uncommitted tweaks remain:
# git add -A && git commit -m "chore: final cleanup"
git push origin main
```

- [ ] **Step 14.6: Manual smoke test on the live site**

Visit `https://bsy1343.github.io/algorithm/` from a different browser or
incognito (no localStorage) to verify cold-load behavior:

- Tree loads fresh from GitHub API.
- testcase.ac registry checks happen.
- Type a draft in "내 풀이", click "반례 찾기 →", testcase.ac opens with the code in clipboard. Paste in their editor and run.

If everything works on the live site, the implementation is complete.

---

## Self-Review

Spec coverage check:

| Spec section | Implemented in task |
|---|---|
| §1 개요 | Task 1 (skeleton), Task 14 (live deploy) |
| §2 목표 #1–6 | Task 4 (목록), Task 5 (README), Task 7 (드래프트), Task 9 (testcase.ac 위임), Task 10–11 (이미지 보존) |
| §3 Non-goals | Honored — no auto judging, no Spring Boot, no Cloudflare |
| §4 사용자 흐름 | All 5 steps covered (Tasks 4–9) |
| §5.1 배포 구조 | Tasks 1, 10, 14 |
| §5.2 외부 의존 | Tasks 3 (Api), 9 (testcase.ac), 14 (deploy) |
| §5.3 GitHub API 캐시 전략 | Task 3 + Task 13 (refresh button) |
| §5.4 이미지 로컬 아카이빙 | Task 10 (script + tests) + Task 11 (viewer integration) |
| §6.1 레이아웃 | Tasks 1–2 (CSS) + 5 (header/tabs) |
| §6.2 변경 사항 vs 기존 viewer | Task 5–7, 12 |
| §6.3 컴포넌트 분리 | Tasks 3–13 (Api, Parser, ImageArchive, Highlighter, State, Sidebar, ProblemView, CodeView, IOView, ActionBar, Topbar, App, Toast) |
| §7.1 파일 시스템 | Task 4 (PATH_RE) |
| §7.2 LocalStorage 스키마 | Task 3 (tree-cache), Task 4 (preferences), Task 7 (drafts), Task 9 (testcase-ac-registry) |
| §8 엣지 케이스 (12 cases) | Task 3 (rate limit, offline, network err), Task 5 (HTML/markdown 분기, sanitize), Task 8 (IO 짝 안 맞음), Task 9 (testcase.ac 미등록, 클립보드 권한 거부), Task 11 (index.json 없음, 이미지 로딩 실패), Task 13 (캐시 오래됨 + 새로고침) |
| §9 배포 | Task 1 (`.nojekyll`), Task 14 (GH Pages enable) |

No placeholders detected. All identifiers consistent across tasks (`State.draftKey`,
`Api.fetchTree`, `ImageArchive.rewrite`, `Parser.sanitizeHtml`, `Toast.show`, etc. used the
same way wherever they appear).

Type consistency: every method shown in a step matches its later call sites. No "added in
Task N but never defined" gaps. The `App.reloadTree` introduced in Task 13 supersedes the
earlier inline tree fetch in Task 4 — Task 13 explicitly replaces the App body, so the
plan transitions cleanly.

---

**Plan complete and saved to `docs/superpowers/plans/2026-04-27-boj-study-viewer.md`.**

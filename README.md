# algorithm

개인 알고리즘 학습 저장소.

- BaekjoonHub로 자동 commit되는 BOJ 풀이
- `index.html` — boj.study 학습 뷰어 (GitHub Pages)
- `data/jobs-latest.json` — IT 채용 공고 스냅샷 (매일 KST 00:00 자동 갱신)

---

## 사용 목적

**개인 학습 및 취업 준비용** — 비상업, 비공개 트래픽 (검색엔진 인덱싱 차단됨).

`data/jobs-latest.json`에 포함된 채용 공고는 각 회사 공식 채용 페이지에서 공개된 정보만 수집하며,
원본 페이지로 직접 링크합니다.

각 회사의 사이트 정책 (robots.txt) 을 사전 확인 후 통과한 사이트만 포함합니다.
매일 1회 정중한 페이스로 갱신 (`.github/workflows/fetch-jobs.yml`).

회사 측에서 데이터 수집 중단 요청 시 즉시 해당 회사를 `data/jobs-config.json`에서 비활성화합니다.

> **참고**: BOJ(acmicpc.net)는 2026-04-28 종료. 문제 데이터는 커뮤니티 아카이브
> [boja.mercury.kr](https://boja.mercury.kr) 에서 import (Bronze~Platinum, 23,813 문제).

---

## 구조

| 경로 | 역할 |
|---|---|
| `index.html` | 단일 정적 뷰어 — 풀이/즐겨찾기/캘린더 + 가상 스크롤 + MathJax |
| `백준/{Tier}/{id}. {title}/` | BOJ 문제 (BaekjoonHub 형식, README + .java + 예제 입출력 + 이미지) |
| `data/tree-cache.json` | 정적 파일 트리 (commit 시 pre-commit hook이 자동 갱신) |
| `data/jobs-config.json` | 채용 회사/필터 설정 (직접 편집) |
| `data/jobs-latest.json` | 채용 정보 결과 (자동 갱신) |

### 스크립트

| 파일 | 역할 |
|---|---|
| `scripts/import-from-boja.mjs` | boja.mercury.kr에서 누락된 문제 import |
| `scripts/localize-images-from-boja.mjs` | 깨진 BOJ 이미지를 boja에서 받아와 폴더에 sha1 파일명으로 저장 |
| `scripts/build-tree-cache.mjs` | 파일 트리 → `data/tree-cache.json` 빌드 (pre-commit에서 자동 호출) |
| `scripts/fetch-jobs.mjs` | 채용 정보 수집 (workflow) |
| `scripts/import-tier.mjs` | BOJ 직접 import (지금은 BOJ 죽어서 사용 X) |
| `scripts/archive-per-problem.mjs` | 이미지 자동 보관 (BOJ 죽어서 비활성화) |

### Workflows

| 파일 | 트리거 | 역할 |
|---|---|---|
| `fetch-jobs.yml` | 매일 KST 00:00 cron + 수동 | 채용 정보 갱신 후 commit |
| `build-tree-cache.yml` | 수동 dispatch만 | 정적 트리 강제 재빌드 (평소엔 pre-commit hook이 처리) |
| `archive-images.yml` | 수동 dispatch만 | BOJ 이미지 보관 (BOJ 죽어서 비활성화) |

### Local hooks

| 파일 | 역할 |
|---|---|
| `.githooks/pre-commit` | 백준/ 변경 commit 시 `tree-cache.json` 자동 빌드 + add |

설치: `git config core.hooksPath .githooks` (이미 설정됨).

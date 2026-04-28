# algorithm

개인 알고리즘 학습 저장소.

- BaekjoonHub로 자동 commit되는 BOJ 풀이
- `index.html` — boj.study 학습 뷰어 (GitHub Pages)
- `data/jobs-latest.json` — IT 백엔드 채용 공고 스냅샷 (3일마다 자동 갱신)

---

## 사용 목적

**개인 학습 및 취업 준비용** — 비상업, 비공개 트래픽 (검색엔진 인덱싱 차단됨).

`data/jobs-latest.json`에 포함된 채용 공고는 각 회사 공식 채용 페이지에서 공개된 정보만 수집하며,
원본 페이지로 직접 링크합니다.

각 회사의 사이트 정책 (robots.txt) 을 사전 확인 후 통과한 사이트만 포함합니다.
3일 1회 정중한 페이스로 갱신 (`.github/workflows/fetch-jobs.yml`).

회사 측에서 데이터 수집 중단 요청 시 즉시 해당 회사를 `data/jobs-config.json`에서 비활성화합니다.

---

## 구조

| 경로 | 역할 |
|---|---|
| `index.html` | 단일 정적 뷰어 — 풀이/즐겨찾기/캘린더 |
| `백준/{Tier}/{id}.{title}/` | BOJ 문제 (BaekjoonHub 형식) |
| `scripts/import-tier.mjs` | BOJ 문제 대량 import (수동) |
| `scripts/archive-per-problem.mjs` | 이미지 자동 보관 (workflow) |
| `scripts/fetch-jobs.mjs` | 채용 정보 수집 (workflow) |
| `data/jobs-config.json` | 회사/필터 설정 (직접 편집) |
| `data/jobs-latest.json` | 채용 정보 결과 (자동 갱신) |

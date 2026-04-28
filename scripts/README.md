# scripts/

이 폴더의 도구들이 어떻게 맞물리는지 한눈에 정리.

```
┌──────────────────────────────────────────────────────────────────┐
│  사용자 행동                       어떤 스크립트가 무엇을 하는가  │
├──────────────────────────────────────────────────────────────────┤
│                                                                  │
│  본인이 BOJ에서 새 문제 풀고                                     │
│  BaekjoonHub 익스텐션이 자동 commit                              │
│                  │                                               │
│                  ▼  push 시 GitHub Action 트리거                 │
│  ┌─────────────────────────────────────────────────────┐         │
│  │ archive-per-problem.mjs (자동, workflow가 호출)     │         │
│  │   • 빈 <img src=""> → BOJ에서 가져와 채움           │         │
│  │   • 절대 https 이미지 → 그 문제 폴더에 다운로드     │         │
│  │   • README의 src를 폴더 상대 URL로 갱신            │         │
│  │   • BaekjoonHub format이면 시간/통계/힌트 보강     │         │
│  │   • 봇이 결과 commit + push                         │         │
│  └─────────────────────────────────────────────────────┘         │
│                                                                  │
│  ─────────────────────────────                                   │
│                                                                  │
│  본인이 풀지 않은 문제도 사이트에 띄우고 싶을 때                 │
│                  │                                               │
│                  ▼  맥미니에서 수동 실행                          │
│  ┌─────────────────────────────────────────────────────┐         │
│  │ import-tier.mjs (수동)                              │         │
│  │   • all-tiers-meta.json 읽음 (23,755개 메타)        │         │
│  │   • 각 문제마다 BOJ 페이지 fetch                    │         │
│  │   • README + .java skeleton + input/output 생성     │         │
│  │   • BaekjoonHub와 동일한 폴더 형식 (U+2005)         │         │
│  │   • 폴더 이미 있으면 skip (resume 안전)             │         │
│  │                                                     │         │
│  │ 실행:                                               │         │
│  │   node scripts/import-tier.mjs                      │         │
│  │                                                     │         │
│  │ tier 한 단계씩:                                     │         │
│  │   TIER_FROM=1  TIER_TO=5  ...   # Bronze            │         │
│  │   TIER_FROM=6  TIER_TO=10 ...   # Silver            │         │
│  │   TIER_FROM=11 TIER_TO=15 ...   # Gold              │         │
│  │   TIER_FROM=16 TIER_TO=20 ...   # Platinum          │         │
│  └─────────────────────────────────────────────────────┘         │
│                  │                                               │
│                  ▼  본인이 commit + push 하면                    │
│      Action이 archive-per-problem.mjs 자동 실행해서              │
│      이미지까지 받아옴 (위 첫 흐름과 동일)                       │
│                                                                  │
└──────────────────────────────────────────────────────────────────┘
```

## 파일 구성

| 파일 | 역할 |
|---|---|
| **boj-lib.mjs** | 공유 라이브러리 (CLI 아님). BOJ 페이지 파싱, README 빌드, tier 변환 등. `import-tier.mjs`와 `archive-per-problem.mjs`가 import해서 씀. |
| **import-tier.mjs** | **수동 CLI** — 미해결 문제 대량 import. tier 범위 조절 가능. |
| **archive-per-problem.mjs** | **자동 CLI** — workflow가 호출. 이미지 다운로드 + README 갱신. 수동 실행도 가능. |
| **all-tiers-meta.json** | solved.ac에서 받아둔 23,755개 문제 메타 (제목/등급/태그). |

## 자주 쓰는 명령

```bash
# 새 문제 commit 후, 이미지 누락된 거 일괄 보정 (수동)
node scripts/archive-per-problem.mjs

# Bronze 5천 문제 import
TIER_FROM=1 TIER_TO=5 node scripts/import-tier.mjs

# 더 천천히 (BOJ 부담 줄이기)
DELAY_MS=1000 node scripts/import-tier.mjs

# 기존 README 새 형식으로 강제 갱신 (내가 만든 폴더만)
REFRESH_README=1 node scripts/import-tier.mjs
```

## Workflow

`.github/workflows/archive-images.yml`이 다음 시점에 `archive-per-problem.mjs`를 자동 실행:

- `백준/**/README.md` 변경 push
- `scripts/archive-per-problem.mjs` 또는 `scripts/boj-lib.mjs` 변경 push
- Actions 탭에서 "Run workflow" 수동 트리거

`if: github.actor != 'github-actions[bot]'` 가드로 봇이 자기 자신의 commit에 다시 트리거되지 않음 (무한 루프 방지).

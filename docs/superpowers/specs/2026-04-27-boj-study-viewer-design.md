# BOJ 학습 뷰어 설계서

**작성일:** 2026-04-27
**스코프:** algorithm repo의 BOJ(`백준/`) 풀이를 시각화하는 단일 정적 HTML
**상태:** 설계 검토 대기

---

## 1. 개요

`baekjoon-viewer.html`을 확장해, BaekjoonHub로 누적된 BOJ 풀이를 깔끔하게 복습하고
새 풀이를 작성·외부 채점기로 검증하는 **개인 학습용 정적 사이트**를 만든다.

자동 채점·반례 찾기 같은 실행 기반 기능은 외부 서비스(testcase.ac)로 위임하며,
사이트 자체는 데이터 표시 + 작업대 + 외부 링크 역할만 한다. 백엔드, 컨테이너,
Cloudflare Worker 등 운영 부담이 있는 인프라는 일절 도입하지 않는다.

---

## 2. 목표

1. 본인 algorithm repo의 `백준/` 폴더(Silver/Gold)를 시각화한다.
2. 각 문제마다 README, 기존 풀이(모범답안), 예제 input/output을 한 화면에서 본다.
3. 새 풀이를 브라우저 안에서 작성하고, 모범답안과 side-by-side로 비교한다.
4. 새 풀이의 실제 검증은 사용자가 직접 주도한다 — 예제는 육안 확인,
   반례 찾기는 testcase.ac로 새 탭 이동(코드는 클립보드 자동 복사).
5. 운영 부담 0: GitHub Pages 정적 호스팅. 외부 의존은 인덱싱용 GitHub API와
   testcase.ac 등록 여부 조회 두 곳뿐이며, 둘 다 캐시한다.
6. README 이미지를 로컬에 영구 보존한다 (BOJ 사이트 종료 대비).

---

## 3. Non-goals (의도적으로 만들지 않는 것)

- **자동 채점 / Piston·Judge0 통합**: 예제는 사용자가 육안으로 확인.
- **사이트 내 stress test 인라인 표시**: testcase.ac 새 탭으로 위임.
- **백엔드 / Spring Boot / Docker / Cloudflare Worker**: 인프라 0.
- **새 풀이 자동 commit / git push**: 채택은 사용자가 IDE에서 직접 처리.
- **프로그래머스 / 민코딩 / Softeer / Tip 폴더 표시**: BOJ만.
- **Private repo 지원**: public repo 전제. 토큰 입력 UI 제거.
- **사이트 내 예제 input/output 추가·수정·삭제**: GitHub Pages 쓰기 권한 없음.
- **사용자 인증 / 다중 사용자**: 본인 1명 전제.

---

## 4. 사용자 흐름

```
1) 사이트 진입 (https://bsy1343.github.io/algorithm/)
   └─ GitHub API 호출 1회로 백준/ 트리 fetch (ETag 캐시)
   └─ 사이드바에 tier별 문제 목록 렌더

2) 문제 선택
   └─ 같은 origin 상대 경로로 README.md, *.java, input*.txt, output*.txt fetch
   └─ 메인 영역에 메타카드 + 본문 + 모범답안 + 예제 IO 표시

3) "내 풀이" 탭에서 새 코드 작성
   └─ 키 입력 시마다 localStorage에 자동 저장 (문제 단위)
   └─ 모범답안과 side-by-side 비교 토글 가능

4) 검증 액션
   ├─ "예제로 확인" → 예제 input/output 강조 표시 → 사용자가 IDE에서 직접 실행 후 비교
   └─ "반례 찾기 →" → 코드 클립보드 복사 + testcase.ac 새 탭 (BOJ 등록된 문제만 활성)

5) 통과한 풀이 채택
   └─ 사용자가 IDE에서 .java 파일 덮어쓰고 git commit
   └─ 사이트는 다음 진입 시 새 모범답안을 자동으로 보여줌 (GitHub API 트리 재조회)
```

---

## 5. 아키텍처

### 5.1 배포 구조

```
algorithm/ (public GitHub repo, GitHub Pages 활성)
├─ index.html              ← 단일 HTML (모든 코드 인라인)
├─ baekjoon-viewer.html    ← 옛 viewer (참고용으로 보존)
├─ scripts/
│  └─ archive-images.mjs   ← 이미지 로컬 보존 스크립트 (수동 실행)
├─ 백준/
│  ├─ .assets/             ← 아카이브된 이미지 + 인덱스
│  │  ├─ index.json        ← URL → 로컬 경로 매핑
│  │  └─ <sha1>.<ext>      ← 다운로드된 이미지들
│  ├─ Silver/...           ← 데이터 (BaekjoonHub가 관리)
│  └─ Gold/...
```

`index.html` 하나가 진입점. 빌드 도구 없음. push만 하면 GitHub Pages가 자동 배포.
이미지 아카이브는 별개 스크립트로, 본인이 새 문제 풀었을 때만 수동 실행 (1회 ~수 초).

### 5.2 외부 의존

| 의존 | 호출 시점 | 용도 |
|---|---|---|
| `api.github.com/repos/{owner}/{repo}/git/trees/main?recursive=1` | 페이지 진입 1회 | 트리 인덱싱 (캐시 활용) |
| 같은 origin 상대 경로 fetch | 문제 선택 시 | 개별 파일 (README, .java, input/output) |
| `next.testcase.ac/problems/boj/{id}` | "반례 찾기" 클릭 | 새 탭 (코드 채점) |
| `acmicpc.net/problem/{id}` | "BOJ 원문" 클릭 | 새 탭 (참조용) |
| `api.testcase.ac/api/problems/boj/{id}` | 문제 선택 시 1회 (선택) | 등록 여부 확인 → 버튼 활성/비활성 |

토큰 0개. 인증 0개.

### 5.3 GitHub API 캐시 전략

```
1. 페이지 진입 → localStorage에서 캐시(`tree-cache`) 읽음
2. 캐시 없거나 1시간 초과 → ETag로 conditional GET
3. 304 Not Modified → 캐시 그대로 사용
4. 200 → 새 트리 + ETag 저장
```

평균적으로 한 사용자가 시간당 1~5회 호출 → 60req/hr 한도 안에서 충분.

### 5.4 이미지 로컬 아카이빙

**왜:** README의 `<img src>`가 BOJ 호스팅 도메인(`u.acmicpc.net`, `upload.acmicpc.net`,
`onlinejudgeimages.s3-ap-northeast-1.amazonaws.com`)을 직접 참조한다. BOJ가 종료되면
이미지도 함께 사라진다. 사이트 종료 전에 로컬로 복사해 둔다.

**아카이브 스크립트** (`scripts/archive-images.mjs`):

- Node 18+ ESM, 외부 의존성 0 (native `fetch`, `fs`, `crypto`)
- 실행: `node scripts/archive-images.mjs`
- 동작:
  1. `백준/**/README.md` 모두 스캔
  2. `<img ... src="https?://..."` 정규식으로 URL 추출
  3. 각 고유 URL에 대해:
     - SHA-1 해시 8자리 + 확장자로 로컬 경로 생성 (예: `백준/.assets/a3f2b1c8.png`)
     - 이미 존재하면 스킵 (idempotent)
     - 없으면 fetch 후 저장
  4. `백준/.assets/index.json`에 URL → 로컬 경로 매핑 저장
  5. 콘솔에 요약 출력 (다운로드 N개, 캐시 적중 M개, 실패 K개)
- 새 문제 풀어서 README가 추가되면 다시 실행 (idempotent하므로 중복 다운로드 없음)

**뷰어 동작:**

- 페이지 로드 시 `백준/.assets/index.json`을 1회 fetch (없어도 무시, 그냥 원본 URL 사용)
- README HTML 렌더링 직전에 모든 `<img src>` 속성을 검사
- index.json에 매핑이 있으면 로컬 경로로 치환
- 매핑 없으면 원본 URL 유지 (스크립트 미실행 상태에서도 BOJ 살아있는 동안은 정상 표시)

**용량 영향:** 현재 47문제 기준 고유 이미지 12장, 예상 총 용량 < 5 MB.
앞으로 새 문제 추가돼도 문제당 평균 0.3장 이하라 부담 없음.

---

## 6. UI 구조

### 6.1 레이아웃

```
┌──────────────────────────────────────────────────────────────┐
│ Topbar  (상태/통계칩만, owner/repo 입력 폼 제거)              │
├──────────┬───────────────────────────────────────────────────┤
│          │ Main Header                                       │
│ Sidebar  │  - 문제 번호 + 제목 + tier 배지                    │
│          │  - Action Bar: [반례 찾기 →] [BOJ 원문 →]          │
│  · Tier  ├───────────────────────────────────────────────────┤
│    탭     │ View Tabs                                         │
│          │  [문제] [모범답안] [내 풀이] [예제 입출력]          │
│  · 검색   ├───────────────────────────────────────────────────┤
│          │                                                   │
│  · 문제   │ Main Content (선택 탭에 따라)                     │
│    목록   │                                                   │
│          │                                                   │
└──────────┴───────────────────────────────────────────────────┘
```

기존 `baekjoon-viewer.html`의 레이아웃·스타일을 유지하되 다음을 추가/변경한다.

### 6.2 변경 사항 (vs 기존 viewer)

**제거:**
- Topbar의 owner/repo/token 입력 폼 (자동감지 또는 hardcode)

**유지 (그대로):**
- Sidebar tier 탭, 검색, 문제 목록 — 디자인·동작 동일
- 문제 탭 (README HTML 렌더링, 메타카드)
- 예제 입출력 탭 (input/output 페어)

**변경:**
- "내 풀이" 탭 = 코드 탭과 분리. 기존 코드 탭은 "모범답안"으로 명시
- 모범답안 탭에 **side-by-side 비교 토글** 추가 (`내 풀이`가 있을 때만)

**추가:**
- Main Header 우측에 **Action Bar**: "반례 찾기 →", "BOJ 원문 →" 두 버튼
  - "반례 찾기": testcase.ac에 등록된 문제만 활성 (`api.testcase.ac/api/problems/boj/{id}` 응답으로 판단)
  - 클릭 시: `navigator.clipboard.writeText(userCode)` → `window.open('https://next.testcase.ac/problems/boj/{id}', '_blank')`
  - 짧은 토스트로 "코드가 클립보드에 복사되었습니다" 안내
- "내 풀이" 탭:
  - `<textarea>` 기반 단순 에디터 (신택스 하이라이팅 없음)
  - 상단에 마지막 저장 시각, "초기화" 버튼
  - 빈 상태에서 "기존 풀이로부터 시작" 버튼 (모범답안을 기본 코드로 복사)

### 6.3 컴포넌트 분리 (한 파일 내 객체 단위)

`index.html`의 `<script>` 안에서 다음 객체로 책임 분리:

| 객체 | 책임 |
|---|---|
| `Api` | GitHub API 호출 + 트리 캐시, 파일 fetch (encodeURIComponent 처리) |
| `Parser` | README의 메타(메모리·시간·분류·제출일) + 섹션 추출 + 마크다운/HTML 판별 |
| `ImageArchive` | `백준/.assets/index.json` 로딩 + 렌더 직전 `<img src>` 로컬 경로 치환 |
| `Highlighter` | 자바 코드 신택스 하이라이트 (기존 `javaHL` 함수 그대로) |
| `State` | 선택 문제, 현재 탭, drafts(localStorage), 환경설정 |
| `Sidebar` | tier 탭, 검색, 문제 목록 렌더 + 클릭 핸들 |
| `ProblemView` | 메타카드 + 문제 본문 |
| `CodeView` | 모범답안/내 풀이 탭 + side-by-side 비교 모드 |
| `IOView` | 예제 input/output |
| `ActionBar` | 반례 찾기/BOJ 원문 버튼 + testcase.ac 등록 여부 lookup + 클립보드 복사 |
| `App` | 진입점, 이벤트 와이어링 |

각 객체는 자체 메서드로 dispose/render만 노출. 전역에 함수 흩뿌리지 않음.

---

## 7. 데이터 모델

### 7.1 파일 시스템 (입력)

```
백준/{tier}/{번호}. {제목}/
  ├─ README.md             (필수)
  ├─ {제목}.java           (모범답안, 필수)
  ├─ input1.txt            (선택, 예제 입력)
  ├─ output1.txt           (선택, 예제 출력)
  └─ inputN.txt / outputN.txt
```

트리 응답은 파일 단위(blob)이므로 전체 경로에서 다음 정규식으로 파싱한다.
기존 `baekjoon-viewer.html`이 이미 사용하는 패턴을 그대로 따른다.

```
/^백준\/([^/]+)\/(\d+)\.\s*([^/]+?)\/(.+)$/
       └ tier ┘ └번호┘    └ 제목 ┘  └파일명┘
```

Tier 값 예: `Silver III`, `Gold V` (BaekjoonHub가 만들어주는 형식).

### 7.2 LocalStorage 스키마

키별 스키마:

- `tree-cache`: `{ etag: string, fetchedAt: ISO8601, tree: GitHubTreeEntry[] }`
  - GitHub API의 트리 응답을 그대로 보관. ETag로 conditional GET용
- `drafts`: `{ [problemKey]: { code: string, updatedAt: ISO8601 } }`
  - `problemKey`는 `{tier}/{번호}` 형태 (예: `"Silver III/2579"`)
  - 같은 번호여도 tier 다르면 별개 draft
- `preferences`: `{ tierFilter, searchQuery, currentTab, compareMode }`
- `testcase-ac-registry`: `{ [problemNumber]: boolean, fetchedAt: ISO8601 }`
  - 7일마다 갱신 (등록 데이터 변동 거의 없음 가정)

값 예시:

```text
tree-cache.etag      = "W/\"abc123\""
drafts["Silver III/2579"].code = "import java.io.*; ..."
testcase-ac-registry["1005"]  = true
testcase-ac-registry["2579"]  = false
```

---

## 8. 엣지 케이스

| 상황 | 처리 |
|---|---|
| GitHub API 60req/hr 초과 | 마지막 캐시 사용 + 헤더에 "rate limit reached, 캐시 표시 중" 칩 |
| 네트워크 오프라인 | 캐시된 트리 + 캐시된 README/코드만 표시 (이전 방문 문제) |
| README가 마크다운만 / HTML만 / 혼합 | 기존 viewer의 `containsHtmlTags` 분기 그대로 |
| 한글·공백 폴더명 | 모든 fetch URL `encodeURIComponent` (기존 viewer 패턴 유지) |
| 예제 input/output 짝이 안 맞음 (input 2개·output 3개 등 실제 존재) | 짝 가능한 만큼만 표시, 남은 건 "짝 없음"으로 표기 |
| testcase.ac 등록 없는 문제 | "반례 찾기" 버튼 disabled + tooltip "testcase.ac에 등록되지 않았습니다" |
| testcase.ac API 호출 자체 실패 | 등록 여부 unknown 처리, 버튼은 활성 (사용자가 직접 가서 확인) |
| 클립보드 권한 거부 | 토스트로 "코드 복사 실패. 수동으로 복사해 주세요" + 코드 영역 자동 select |
| `*.java` 파일이 여러 개인 폴더 | 폴더명과 동일한 파일 우선, 없으면 사전순 첫 번째 |
| 새 문제 추가됐는데 캐시가 남아있음 | "새로고침" 버튼 (Topbar) → ETag 강제 우회 + 트리 재 fetch |
| `index.json` 없음 (스크립트 미실행) | 원본 URL 그대로 사용 (BOJ 살아있을 동안 정상 표시) |
| 아카이브된 이미지가 로딩 실패 | `<img onerror>`로 원본 URL fallback 시도 |
| 새 README에 처음 보는 이미지 URL | 다음 `archive-images.mjs` 실행 때 자동 추가 |

---

## 9. 배포

1. `index.html`을 algorithm repo 루트에 commit & push.
2. GitHub Settings → Pages → Source: `main` branch / `/` (root).
3. `https://bsy1343.github.io/algorithm/` 접속 시 자동으로 `index.html` 진입점.
4. 이후 push마다 자동 배포 (수 분 내 반영).

빌드 단계 없음. CI 없음. 별도 워크플로 없음.

---

## 10. 향후 확장 (선택, 본 스펙 외)

다음은 본 스펙 범위가 아니지만, 같은 정적 HTML 위에서 추후 추가 가능한 기능이다.

- **Cloudflare Worker proxy 추가**: testcase.ac CORS 우회 → 사이트 내 inline 결과 표시.
- **GitHub Action으로 manifest.json 생성**: GitHub API 의존 제거.
- **프로그래머스/민코딩/Softeer 폴더 표시**: 데이터 모델 동일, 정규식·tier 매핑만 확장.
- **Piston API로 가벼운 자동 채점**: 본인 input/output에 한해 자동 비교.

이 기능들은 v1 안정화 후 필요할 때만 도입한다. 현재는 명시적으로 제외.

---

## 11. 미해결 사항

본 스펙 작성 시점 기준 알려진 미해결 항목 없음.
구현 중 발견되면 본 문서를 업데이트한다.

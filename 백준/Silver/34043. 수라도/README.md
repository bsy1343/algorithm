# [Silver I] 수라도 - 34043

[문제 링크](https://www.acmicpc.net/problem/34043)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 459, 정답: 165, 맞힌 사람: 138, 정답 비율: 37.808%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>수라도의 호반우들은 무한한 정삼각형 격자에 서로 다른 $N$개의 색을 사용하여 각 색마다 정확히 $3$개의 정삼각형을 칠하는 게 가능한지 판단해야 한다. 이때 같은 색으로 색칠된 $3$개의 정삼각형이 반드시 아래의 두 그림 중 하나와 같은 형태를 이루어야 한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34043.%E2%80%85%EC%88%98%EB%9D%BC%EB%8F%84/0e4bc6d2.png" data-original-src="https://boja.mercury.kr/assets/problem/34043-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100px; height: 88px;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34043.%E2%80%85%EC%88%98%EB%9D%BC%EB%8F%84/42dfc768.png" data-original-src="https://boja.mercury.kr/assets/problem/34043-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 88px; width: 100px;"></p>

<p>추가로, 임의의 색칠된 정삼각형 칸에서 시작해 인접한 면을 통하여 색칠된 정삼각형 칸으로만 이동해 모든 색칠된 정삼각형 칸에 도달할 수 있어야 한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34043.%E2%80%85%EC%88%98%EB%9D%BC%EB%8F%84/d87c3282.png" data-original-src="https://boja.mercury.kr/assets/problem/34043-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 177px; width: 200px;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34043.%E2%80%85%EC%88%98%EB%9D%BC%EB%8F%84/de125ad0.png" data-original-src="https://boja.mercury.kr/assets/problem/34043-4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 177px; width: 200px;"></p>

<p style="text-align: center;">$N = 2$일 때 왼쪽은 조건을 만족하는 예시, 오른쪽은 만족하지 않는 예시이다.</p>

<p>호반우를 도와 수라도에서 깨달음을 얻어보자.</p>

### 입력

<p>첫째 줄에 서로 다른 색의 개수인 $N$이 주어진다. $(1 \leq N \leq 100\,000)$</p>

### 출력

<p>첫째 줄에 모든 색을 사용하여 조건을 만족하도록 격자 위의 정삼각형들을 칠할 수 있다면 <span style="color:#e74c3c;"><code>YES</code></span>를, 그렇지 않다면 <span style="color:#e74c3c;"><code>NO</code></span>를 출력한다.</p>
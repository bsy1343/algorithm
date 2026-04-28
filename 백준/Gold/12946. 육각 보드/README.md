# [Gold II] 육각 보드 - 12946

[문제 링크](https://www.acmicpc.net/problem/12946)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 2453, 정답: 672, 맞힌 사람: 496, 정답 비율: 26.667%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>크기가 N &times; N인 육각 보드가 주어진다. 아래 그림은 N = 1, 2, 3, 4인 경우의 그림이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12946.%E2%80%85%EC%9C%A1%EA%B0%81%E2%80%85%EB%B3%B4%EB%93%9C/3a01733b.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12946.%E2%80%85%EC%9C%A1%EA%B0%81%E2%80%85%EB%B3%B4%EB%93%9C/3a01733b.png" data-original-src="https://upload.acmicpc.net/178f50c1-48cc-4c06-b8fb-e72b49396348/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 972px; height: 366px;" /></p>

<p>육각 보드의 일부 칸을 색칠하려고 한다. 두 칸이 변을 공유하는 경우에는 같은 색으로 칠할 수 없다.</p>

<p>어떤 칸을 색칠해야 하는지 주어졌을 때, 필요한 색의 최소 종류를 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 N이 주어진다. (1 &le; N &le; 50)</p>

<p>둘째 줄부터 N개의 줄에는 어떤 칸을 색칠해야 하는지에 대한 정보가 주어진다.</p>

<p>i번째 줄의 j번째 문자는 (i, j)칸의 정보를 나타내고, &#39;-&#39;인 경우는 색칠하지 않는 것이고 &#39;X&#39;면 색칠해야 하는 것이다.</p>

### 출력

<p>첫째 줄에 필요한 색의 종류의 최솟값을 출력한다.&nbsp;</p>
# [Gold V] 트리 색칠하기 - 24230

[문제 링크](https://www.acmicpc.net/problem/24230)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 2414, 정답: 1000, 맞힌 사람: 808, 정답 비율: 41.288%

### 분류

그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색

### 문제 설명

<p>정점이&nbsp;$N$개인 트리가 있다. 정점에는 1부터 $N$까지 번호가 붙어있다. 트리의 루트는 항상 1번 정점이며 맨 처음에는 모든 정점이 하얀색으로 칠해져 있는 상태이다.</p>

<p>하나의 정점에 색칠하면 해당 정점 아래 있는 모든 정점이 같은 색으로 칠해진다. 색은 섞이지 않고 색칠할 때마다 그 색으로 덮어진다. 단, 하얀색으로 색칠할 수는 없다.</p>

<p>아래 그림처럼 정점 10개로 구성된 트리가 있다고 가정을 해보자.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24230.%E2%80%85%ED%8A%B8%EB%A6%AC%E2%80%85%EC%83%89%EC%B9%A0%ED%95%98%EA%B8%B0/743066dc.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/24230.%E2%80%85%ED%8A%B8%EB%A6%AC%E2%80%85%EC%83%89%EC%B9%A0%ED%95%98%EA%B8%B0/743066dc.png" data-original-src="https://upload.acmicpc.net/d60753e6-25d7-4baa-94c3-e99d84ed3d42/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 280px; height: 300px;" /></p>

<p style="text-align: center;">[그림 1] 하얀색으로 칠해져 있는 트리</p>

<p>3번 정점을 노란색으로 칠하면 그 아래 있는 정점 5, 6, 8, 9, 10 모두&nbsp;노란색으로 칠해진다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24230.%E2%80%85%ED%8A%B8%EB%A6%AC%E2%80%85%EC%83%89%EC%B9%A0%ED%95%98%EA%B8%B0/94e1b3f4.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/24230.%E2%80%85%ED%8A%B8%EB%A6%AC%E2%80%85%EC%83%89%EC%B9%A0%ED%95%98%EA%B8%B0/94e1b3f4.png" data-original-src="https://upload.acmicpc.net/6345e2aa-2c8a-4f59-a274-e9073c61e520/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 280px; height: 300px;" /></p>

<p style="text-align: center;">[그림 2] 정점 3에 노란색을 칠한 후 트리의 상태</p>

<p>그리고 정점 5에 파란색을 칠한다면 그 아래 있는 정점 8, 9, 10&nbsp;모두 파란색으로 칠해진다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24230.%E2%80%85%ED%8A%B8%EB%A6%AC%E2%80%85%EC%83%89%EC%B9%A0%ED%95%98%EA%B8%B0/a6e26cd6.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/24230.%E2%80%85%ED%8A%B8%EB%A6%AC%E2%80%85%EC%83%89%EC%B9%A0%ED%95%98%EA%B8%B0/a6e26cd6.png" data-original-src="https://upload.acmicpc.net/25b335ab-1493-4ca6-a4a0-87486da7e39d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 280px; height: 300px;" /></p>

<p style="text-align: center;">[그림 3] 정점 5에 파란색을 칠한 후 트리의 상태</p>

<p>입력으로 트리의 정보와 정점의 색&nbsp;정보가 주어진다. 색 정보는 음이 아닌 정수로 주어지며 값이&nbsp;0인 경우는 항상 하얀색을 의미한다.</p>

<p>하얀색을 제외한 색만 사용해서&nbsp;모든 정점을 주어진 색으로 칠하고 싶을 때 최소 몇 번 색을 칠해야 모든 정점을 원하는 색으로 칠할 수 있는지 구해보자.</p>

### 입력

<p>첫째 줄에 트리를 구성하는 정점의 개수 $N(1 &le; N &le; 200,000)$이 주어진다.</p>

<p>둘째 줄에 1번 정점부터 $N$번 정점까지 각 색&nbsp;정보&nbsp;$C_i (0 &le; C_i&nbsp;&le; N)$가 공백으로 구분되어&nbsp;주어진다.</p>

<p>셋째 줄부터 $N - 1$개의 줄에 걸쳐 연결된 두 정점 $a, b(1 &le;&nbsp;a, b &le; N$, $a &ne; b)$가 공백으로 구분되어 주어진다. &nbsp;</p>

<p><strong>모든 정점을 칠할 수 있는 입력만 주어진다.</strong></p>

### 출력

<p>하얀색을 제외한 색만 사용해서 모든 정점을 원하는 색으로 칠하기 위해 최소 몇 번 칠하면 되는지 출력한다.</p>
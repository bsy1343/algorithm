# [Platinum III] 도로 건설 - 14276

[문제 링크](https://www.acmicpc.net/problem/14276)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 91, 정답: 62, 맞힌 사람: 43, 정답 비율: 69.355%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>영선이가 살고있는 도시에는 총 N개의 집이 있고, 1번부터 N번까지 번호가 매겨져 있다. 현재 도시에 도로는 하나도 없다. 영선이는 아래 조건을 지키면서 총 M개의 양방향 도로(집과 집을 연결)를 만들려고 한다.</p>

<ul>
	<li>서로 다른 집 A와 B에 대해서, 0 &lt; |A-B| &le; K인 경우에만 도로를 만들 수 있다. 도로로 연결되어 있는 집은 도로와 인접해있다고 한다. 같은 집의 쌍에 대해서 여러 개의 도로를 만들 수 있다.</li>
	<li>모든 집은 짝수개의 도로와 인접해야 있어야 한다.</li>
</ul>

<p>N, M, K가 주어졌을 때, 도로를 만드는 방법의 수를 구하는 프로그램을 작성하시오. 두 집이 서로 다른 개수의 도로와 연결되어 있을 때 두 방법을 서로 다른 방법이라고 한다.</p>

### 입력

<p>첫째 줄에 N, M, K (1 &le; N &le; 30, 0 &le; M &le; 30, 1 &le; K &le; 8)이 주어진다.</p>

### 출력

<p>첫째 줄에 도로를 만드는 방법의 수를 1,000,000,007로 나눈 나머지를 출력한다.</p>

### 힌트

<p>예제 1의 경우 아래와 같이 도로를 건설하는 것이 가능하다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14276.%E2%80%85%EB%8F%84%EB%A1%9C%E2%80%85%EA%B1%B4%EC%84%A4/fe1e32f3.png" data-original-src="https://upload.acmicpc.net/796b26fd-fe92-4850-ac73-35316a9e6b13/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 328px; height: 250px;" /></p>

<p>예제 2의 경우 아래와 같이 도로를 건설하는 것이 가능하다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14276.%E2%80%85%EB%8F%84%EB%A1%9C%E2%80%85%EA%B1%B4%EC%84%A4/c5789054.png" data-original-src="https://upload.acmicpc.net/bb3ccc25-dd0e-4d87-800b-3dc530bb1800/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 419px; height: 350px;" /></p>
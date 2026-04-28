# [Platinum II] Simple Polygon - 23264

[문제 링크](https://www.acmicpc.net/problem/23264)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 9, 맞힌 사람: 8, 정답 비율: 42.105%

### 분류

애드 혹, 기하학, 해 구성하기

### 문제 설명

<p>You are given two integers, the number of vertices&nbsp;$N$ and area&nbsp;$A$. You need to construct a&nbsp;<a href="https://en.wikipedia.org/wiki/Simple_polygon" target="_blank">simple polygon</a>&nbsp;of&nbsp;$N$&nbsp;vertices such that the area of the polygon is exactly&nbsp;$\frac{A}{2}$, and all the vertices have non-negative integer coordinates with value up to&nbsp;$10^9$.</p>

<p>A simple polygon is one that:</p>

<ul>
	<li>Defines a closed area.</li>
	<li>Does not have self-intersections, even at a single point.</li>
	<li>No two consecutive edges form a straight angle.</li>
</ul>

### 입력

<p>The first line of the input gives the number of test cases, $T$.&nbsp;$T$&nbsp;lines follow. The first line of each test case contains two integers,&nbsp;$N$&nbsp;denoting the number of vertices and&nbsp;$A$, denoting double the required area of the polygon.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;$x$ is the test case number (starting from 1) and&nbsp;$y$&nbsp;is&nbsp;<code>IMPOSSIBLE</code>&nbsp;if it is not possible to construct a polygon with the given requirements and&nbsp;<code>POSSIBLE</code>&nbsp;otherwise.</p>

<p>If you output&nbsp;<code>POSSIBLE</code>, output&nbsp;$N$&nbsp;more lines with&nbsp;$2$&nbsp;integers each. The&nbsp;$i$-th line should contain two integers&nbsp;$X_i$&nbsp;and&nbsp;$Y_i$&nbsp;which denote the coordinates of the&nbsp;$i$-th vertex. For each&nbsp;$i$, the coordinates should satisfy the&nbsp;$0 \le X_i,Y_i &le; 10^9$&nbsp;constraints. Vertices of the polygon should be listed in consecutive order ($vertex_i$ should be adjacent to&nbsp;$vertex_{i-1}$&nbsp;and&nbsp;$vertex_{i+1}$&nbsp;in the polygon).</p>

<p>If there are multiple possible solutions, you can output any of them.</p>

### 제한

<ul>
	<li>$1 \le T \le 100$.</li>
	<li>$1 \le A \le 10^9$.</li>
</ul>
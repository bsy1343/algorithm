# [Platinum I] Inquiry II - 17790

[문제 링크](https://www.acmicpc.net/problem/17790)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 167, 정답: 72, 맞힌 사람: 65, 정답 비율: 48.872%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘, 트리, 비트마스킹, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>For an undirected, simple graph G = (V, E) we call a subset V&#39;&nbsp;&sube; V an independent set if no two elements of V&#39;&nbsp;are connected by an edge. An independent set of G is called a maximum independent set if there is no independent set in G with strictly more vertices. Given a specific kind of connected graph G, find the size of a maximum independent set of G.</p>

### 입력

<ul>
	<li>The input starts with one line, containing integers n (1 &le; n &le; 100), the number of vertices in the graph, and m (n &minus; 1 &le; m &le; n + 15), the number of edges in the graph.</li>
	<li>Then follow m lines, each containing integers a, b (1 &le; a, b &le; n) indicating that there is an edge between vertices a and b.</li>
</ul>

<p>The graph given by this input is guaranteed to be both simple and connected: there is at most one edge between each pair of vertices, there are no loops, and there is a path between each pair of vertices.</p>

### 출력

<ul>
	<li>Output the number of vertices in a maximum independent set of the input graph.</li>
</ul>
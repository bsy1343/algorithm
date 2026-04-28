# [Platinum III] Bipartite Graph Coloring - 19125

[문제 링크](https://www.acmicpc.net/problem/19125)

### 성능 요약

시간 제한: 12 초, 메모리 제한: 512 MB

### 통계

제출: 46, 정답: 16, 맞힌 사람: 15, 정답 비율: 42.857%

### 분류

이분 그래프, 브루트포스 알고리즘, 다이나믹 프로그래밍, 그래프 이론, 수학

### 문제 설명

<p>Bobo gets a bipartite graph with $n$ vertices (that is, a graph without odd cycles).</p>

<p>He colors each vertex into black or white, and then calculates the product of each edge&#39;s value. The value of an edge is determined by the colors of its two end points. Thus, there can be $2 \times 2 = 4$ different values associated to a given edge.</p>

<p>Now bobo would like to know the sum of products of all $2^n$ possible coloring, modulo $(10^9+7)$.</p>

### 입력

<p>The first line contains $2$ integers $n, m$ which denotes the number of vertices and edges ($2 \leq n \leq 40$, $1 \leq m \leq 100$).</p>

<p>Vertices are numbered by $1, 2, \dots, n$ for convenience.</p>

<p>Each of the following $m$ lines contains $6$ integers $a_i, b_i, v_{i, 00}, v_{i, 01}, v_{i, 10}, v_{i, 11}$, which denotes an edge between vertices $a_i$ and $b_i$ ($1 \leq a_i, b_i \leq n, 0 \leq v_{i, 00}, v_{i, 01}, v_{i, 10}, v_{i, 11} \leq 10^9$).</p>

<ul>
	<li>If vertices $a_i$ and $b_i$ are both white, the $i$-th edge&#39;s value is $v_{i, 00}$.</li>
	<li>If vertex $a_i$ is white and $b_i$ is black, the value is $v_{i, 01}$.</li>
	<li>If vertex $a_i$ is black and $b_i$ is white, the value is $v_{i, 10}$.</li>
	<li>If vertices $a_i$ and $b_i$ are both black, the value is $v_{i, 11}$.</li>
</ul>

### 출력

<p>A single integer denotes the sum.</p>
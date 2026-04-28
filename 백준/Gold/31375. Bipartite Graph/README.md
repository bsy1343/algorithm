# [Gold III] Bipartite Graph - 31375

[문제 링크](https://www.acmicpc.net/problem/31375)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 24, 맞힌 사람: 21, 정답 비율: 70.000%

### 분류

이분 그래프, 해 구성하기, 그래프 이론

### 문제 설명

<p>In this problem, you have to construct a bipartite graph which has the following properties:</p>

<ol>
	<li>The number of vertices in the first part is $d$.</li>
	<li>The number of vertices in the second part is $d - 2$.</li>
	<li>The number of edges is at most $3 d$.</li>
	<li>For all bipartite graphs constructed by removing two vertices from the first part, there is a perfect matching.</li>
</ol>

<p>Recall that a bipartite graph is a graph where the vertices are divided into two parts so that each edge connects a vertex from the first part and a vertex from the second part. A perfect matching is a collection of edges such that each vertex of the graph is an end of exactly one edge from that collection.</p>

### 입력

<p>The first line contains an integer $T$, the number of test cases ($1 \le T \le 100$). Each of the next $T$ lines contains an integer $d$, the number of vertices in the corresponding test case ($3 \le d \le 100$).</p>

### 출력

<p>For each test case, start by printing an integer $m$, the number of edges, on a separate line. On the next $m$ lines, print the edge descriptions. Each edge description is a pair of integers $u$ and $v$: the numbers of vertices of the first and the second part connected by that edge ($0 \le u &lt; d$, $0 \le v &lt; d - 2$).</p>

<p>The graph must not contain multiple edges.</p>

### 힌트

<p>You do not need to minimize the number of edges.</p>
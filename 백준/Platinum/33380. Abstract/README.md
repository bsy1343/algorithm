# [Platinum I] Abstract - 33380

[문제 링크](https://www.acmicpc.net/problem/33380)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 4, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

그래프 이론, 다이나믹 프로그래밍, 방향 비순환 그래프, 위상 정렬, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>You have a DAG (Directed Acyclic Graph) with $n$ nodes and $m$ edges. The graph has exactly one node $x$ that has no outgoing edges. The $i$-th node has an integer value $a_i$ in it.</p>

<p>Every second, the following happens:</p>

<ul>
	<li>For each node $i$, let $b_i=a_i$.</li>
	<li>For each node $i$, let $a_i=0$.</li>
	<li>For each node $i$, and each node $j$ such that there is an edge from $i$ to $j$, the value $b_i$ is added to $a_j$.</li>
	<li>The value $\left\lfloor \frac{b_x}{2} \right\rfloor$ is added to $a_x$.</li>
</ul>

<p>Find the first moment of time when all $a_i$ become $0$. Since the answer can be very large, output it modulo $998\,244\,353$.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ ($1\leq n\leq 10^4$; $1 \leq m \leq 10^5$): the number of vertices and edges in the graph.</p>

<p>The second line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($0 \leq a_i \leq 10^9$): the values in the vertices.</p>

<p>Each of the following $m$ lines contains two integers $u$ and $v$ ($1 \leq u, v \leq n$) which represent a directed edge from $u$ to $v$. </p>

<p>It is guaranteed that the graph is a DAG with no multi-edges, and there is exactly one node that has no outgoing edges.</p>

### 출력

<p>Print a line with a single integer: the first moment of time when all $a_i$ become $0$, modulo $998\,244\,353$.</p>

### 힌트

<p>Hi, so to me seems like a notorious coincidence. (Codeforces 1704E)</p>
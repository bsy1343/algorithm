# [Platinum V] Complete Tripartite - 30170

[문제 링크](https://www.acmicpc.net/problem/30170)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 25, 맞힌 사람: 23, 정답 비율: 54.762%

### 분류

그래프 이론, 그래프 탐색, 해싱

### 문제 설명

<p>You have a simple undirected graph consisting of $n$ vertices and $m$ edges. The graph doesn&#39;t contain self-loops, there is at most one edge between a pair of vertices. The given graph can be disconnected.</p>

<p>Let&#39;s make a definition.</p>

<p>Let $v_1$ and $v_2$ be two some nonempty subsets of vertices that do not intersect. Let $f(v_{1}, v_{2})$ be true if and only if all the conditions are satisfied:</p>

<ol>
	<li>There are no edges with both endpoints in vertex set $v_1$.</li>
	<li>There are no edges with both endpoints in vertex set $v_2$.</li>
	<li>For every two vertices $x$ and $y$ such that $x$ is in $v_1$ and $y$ is in $v_2$, there is an edge between $x$ and $y$.</li>
</ol>

<p>Create three vertex sets ($v_{1}$, $v_{2}$, $v_{3}$) which satisfy the conditions below;</p>

<ol>
	<li>All vertex sets should not be empty.</li>
	<li>Each vertex should be assigned to only one vertex set.</li>
	<li>$f(v_{1}, v_{2})$, $f(v_{2}, v_{3})$, $f(v_{3}, v_{1})$ are all true.</li>
</ol>

<p>Is it possible to create such three vertex sets? If it&#39;s possible, print matching vertex set for each vertex.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ ($3 \le n \le 10^{5}$, $0 \le m \le \text{min}(3 \cdot 10^{5}, \frac{n(n-1)}{2})$) --- the number of vertices and edges in the graph.</p>

<p>The $i$-th of the next $m$ lines contains two integers $a_{i}$ and $b_{i}$ ($1 \le a_{i} \lt b_{i} \le n$) --- it means there is an edge between $a_{i}$ and $b_{i}$. The graph doesn&#39;t contain self-loops, there is at most one edge between a pair of vertices. The given graph can be disconnected.</p>

### 출력

<p>If the answer exists, print $n$ integers. $i$-th integer means the vertex set number (from $1$ to $3$) of $i$-th vertex. Otherwise, print $-1$.</p>

<p>If there are multiple answers, print any.</p>

### 힌트

<p>In the first example, if $v_{1} = \{ 1 \}$, $v_{2} = \{ 2, 3 \}$, and $v_{3} = \{ 4, 5, 6 \}$ then vertex sets will satisfy all conditions. But you can assign vertices to vertex sets in a different way; Other answers like &quot;<code>2 3 3 1 1 1</code>&quot; will be accepted as well.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30170.%E2%80%85Complete%E2%80%85Tripartite/7a9b3503.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/30170.%E2%80%85Complete%E2%80%85Tripartite/7a9b3503.png" data-original-src="https://upload.acmicpc.net/c1e139bf-75cb-43f9-aa7f-c1d026446c5e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 281px; height: 311px;" /></p>

<p>In the second example, it&#39;s impossible to make such vertex sets.</p>
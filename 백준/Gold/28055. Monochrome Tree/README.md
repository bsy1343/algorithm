# [Gold II] Monochrome Tree - 28055

[문제 링크](https://www.acmicpc.net/problem/28055)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 162, 정답: 106, 맞힌 사람: 92, 정답 비율: 69.697%

### 분류

깊이 우선 탐색, 그래프 이론, 그래프 탐색, 그리디 알고리즘, 정렬, 트리

### 문제 설명

<p>A monochrome tree is a tree in which each vertex is colored either white or black. The score of a monochrome tree is equal to the number of unordered vertex pairs $(u, v)$ such that:</p>

<ul>
	<li>Both vertices $u$ and $v$ are colored black.</li>
	<li>$u$ is an ancestor of $v$, or $v$ is an ancestor of $u$.</li>
</ul>

<p>You are given a rooted tree of $n$ vertices whose root vertex is $1$. </p>

<p>For each $k$ from $0$ to $n$ (inclusive), you may color the given tree in such a way that there are exactly $k$ black vertices and $n - k$ white vertices. Among all the possible colorings, we denote the lowest score of a coloring as $c_k$.</p>

<p>Find $c_k$ for all $0 \leq k \leq n$.</p>

### 입력

<p>The first line contains a single integer $n$, the number of vertices in the given tree. ($1 \leq n \leq 2 \times 10^5$).</p>

<p>The $i$-th line of the following $n-1$ lines contain a single integer $p_{i+1}$ ($1 \leq p_{i+1} \leq n$, $p_{i+1} \neq i+1$), meaning that the parent of vertex $i+1$ is $p_{i+1}$.</p>

### 출력

<p>On the first and only line, print $n+1$ integers, the $i$-th of which denotes $c_{i-1}$. ($1 \leq i \leq n+1$)</p>

### 힌트

<p>Vertex $x$ is an ancestor of vertex $y$ $(x \neq y)$ if there is a sequence of vertices $\{x=a_1, a_2, \ldots a_k=y\}$ where $a_i$ is a parent of $a_{i+1}$ ($1 \leq i \leq k-1$).</p>
# [Platinum IV] Red-Black Tree - 23659

[문제 링크](https://www.acmicpc.net/problem/23659)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 107, 정답: 23, 맞힌 사람: 10, 정답 비율: 15.152%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Consider a binary rooted tree: a vertex is selected as the root, all edges go in the direction from the root, and each vertex has zero, one, or two children. We will say that each vertex has exactly two outgoing edges: in case it has less than two children, the remaining edges go into the void.</p>

<p>We will say a tree is <em>red-black</em> if the following conditions are satisfied:</p>

<ul>
	<li>Each vertex is colored either red or black.</li>
	<li>There is no edge in the tree which has two red endpoints. The void is considered black.</li>
	<li>Consider all paths along the edges which go from the root to the void. The number of black vertices is the same on all such paths.</li>
</ul>

<p>A similar coloring scheme can be used in binary search trees to make them balanced.</p>

<p>You are given a non-empty binary rooted tree. Color its vertices so that it becomes a red-black tree, or determine that it is impossible.</p>

### 입력

<p>The first line contains an integer $n$ ($1 \le n \le 500$), the number of vertices in the tree. The vertices are numbered by integers from $1$ to $n$.</p>

<p>The next line contains $n$ space-separated integers: $p_1$, $p_2$, $\ldots$, $p_n$ ($0 \le p_i \le n$). A number $p_i &gt; 0$ means that vertex $i$ is a child of vertex $p_i$. In case $p_i = 0$ means that $i$ is the root of the tree.</p>

<p>It is guaranteed that the input specifies a valid binary rooted tree: there is exactly one root, each vertex has from $0$ to $2$ children, and it is possible to arrive at any vertex by starting at the root and moving along the edges.</p>

### 출력

<p>If it is possible to color the tree so that it becomes a red-black tree, print any such coloring as a line of $n$ characters. The character at $i$-th position must be &quot;<code>R</code>&quot; if vertex $i$ is red, or &quot;<code>B</code>&quot; if it is black.</p>

<p>If it is not possible to color the tree, print &quot;<code>Impossible</code>&quot;.</p>
# [Platinum II] Find the MST for Grid - 23108

[문제 링크](https://www.acmicpc.net/problem/23108)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 21, 맞힌 사람: 20, 정답 비율: 100.000%

### 분류

그래프 이론, 정렬, 이분 탐색, 누적 합, 최소 스패닝 트리

### 문제 설명

<p>Consider a grid graph: the vertices are lined up into a grid of $H$ rows by $W$ columns. Let us denote the vertex in the $i$-th row and $j$-th column as $(i, j)$.</p>

<p>To define the weights of the graph edges, we will consider four non-decreasing sequences, $A$, $B$, $C$, and $D$, consisting of $H-1$, $W$, $H$, and $W-1$ positive integers, respectively:</p>

<ul>
	<li>there is a bidirectional edge connecting vertices $(i, j)$ and $(i+1, j)$ of weight $A_i + B_j$ for all $i$ and $j$ such that $1 \le i \le H-1$ and $1 \le j \le W$;</li>
	<li>there is a bidirectional edge connecting vertices $(i, j)$ and $(i, j+1)$ of weight $C_i + D_j$ for all $i$ and $j$ such that $1 \le i \le H$ and $1 \le j \le W-1$;</li>
	<li>the graph contains no other edges.</li>
</ul>

<p>Find the total weight of the edges in the minimal spanning tree of this graph.</p>

### 입력

<p>The first line of input contains two positive integers $H$ and $W$ ($2 \le H, W \le 10^5$).</p>

<p>The second line contains $H-1$ integers $A_i$: the elements of the sequence $A$.</p>

<p>The third line contains $W$ integers $B_i$: the elements of the sequence $B$.</p>

<p>The fourth line contains $H$ integers $C_i$: the elements of the sequence $C$.</p>

<p>The fifth line contains $W-1$ integers $D_i$: the elements of the sequence $D$.</p>

<p>It is guaranteed that $A_{i-1} \le A_{i}$, $B_{i-1} \le B_{i}$, $C_{i-1} \le C_{i}$, and $D_{i-1} \le D_{i}$ for $i&gt;1$, and additionally, $1 \le A_i, B_i, C_i, D_i \le 10^6$.</p>

### 출력

<p>Print the total weight of the edges in the minimal spanning tree of the given graph. Note that the answer may not fit into a 32-bit integer.</p>
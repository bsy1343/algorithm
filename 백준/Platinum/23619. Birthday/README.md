# [Platinum II] Birthday - 23619

[문제 링크](https://www.acmicpc.net/problem/23619)

### 성능 요약

시간 제한: 7 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 10, 정답: 4, 맞힌 사람: 4, 정답 비율: 40.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 비트 집합

### 문제 설명

<p>Malvina wants to give Buratino a birthday present --- an undirected graph $G = (V, E)$. Buratino is turning $k$, and Malvina wants to reflect this date in the graph by splitting it into $k$ parts, that is, by presenting the set of nodes of the graph $V$ as $k$ pairwise disjoint subsets $V_1$, $V_2$, $\ldots$, $V_k$. Naturally, in this partition, all of the subsets $V_i$ must be non-empty.</p>

<p>To demonstrate the connection between the past $k$ years, Malvina wants to split the graph in such a manner that for each of the edges $uv$, its end nodes $u$ and $v$ belonged to either the same or two adjacent subsets. Only subsets $V_i$ and $V_{i+1}$ are adjacent for every $i = 1, 2, \ldots k-1$.</p>

### 입력

<p>The first line of the input file contains two space-separated numbers $N$ and $k$ --- the number of nodes in the graph ($1$ $\le$ $N$ $\le$ $2\,000$) and the number of parts ($1$ $\le$ $k$ $\le$ $2\,000$) that the graph must be divided into.</p>

<p>The graph is defined in an adjacency matrix $G$. The following $N$ lines of the file each contain $N$ symbols. The $j$th symbol of the $i$th line equals &#39;<code>1</code>&#39; if there is an edge between the nodes $i$ and $j$, and &#39;<code>0</code>&#39; if there is no edge between these nodes. It is guaranteed that the matrix is symmetrical ($g_{i, j}$ = $g_{j, i}$), and that the matrix diagonal only contains zeroes ($g_{i, i}$ = $0$).</p>

### 출력

<p>In the first line of the output file, print &quot;<code>Yep</code>&quot;, if the graph can be split into $k$ parts in the desired manner. Next, print $k$ lines. The $i$th line ($i$ = $1$, $2$, $\ldots$, $k$) contains the description of the $i$th part: first, print the number of nodes in $V_i$, next print the indices of the nodes belonging to $V_i$, separated by spaces, numbered in the same order as in the input data. If there are several ways of splitting the graph, print any one of them.</p>

<p>If it is impossible to split the graph into $k$ parts in the desired way, print &quot;<code>Nope</code>&quot;.</p>
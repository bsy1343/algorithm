# [Platinum I] Edges, Colors and MST - 24657

[문제 링크](https://www.acmicpc.net/problem/24657)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 80, 정답: 43, 맞힌 사람: 40, 정답 비율: 53.333%

### 분류

자료 구조, 그래프 이론, 트리, 분리 집합, 최소 스패닝 트리, Heavy-light 분할

### 문제 설명

<p>There is an undirected simple connected graph $G$ with $N$ vertices and $M$ edges. The vertices of $G$ are numbered from 1 to $N$, and the edges are numbered from 1 to $M$. Edge $i$ connects vertices $u_i$ and $v_i$.</p>

<p>Given is a sequence $C = (c_1, c_2, \ldots, c_M)$ of length $M$, consisting of <code>0</code>s and <code>1</code>s. Edge $i$ is painted blue when $c_i=0$, and is painted red when $c_i=1$. The edges are colored in such a way that there are exactly $N-1$ red edges and they are forming a spanning tree of $G$.</p>

<p>Find the lexicographically smallest permutation $P = (p_1, p_2, \ldots, p_M)$ that satisfies the following condition: if, for each $i$, the weight of edge $i$ is $p_i$, then all the edges used in the minimal spanning tree of $G$ are red.</p>

<p>Note that the minimal spanning tree of $G$ is uniquely determined under those conditions.</p>

### 입력

<p>The first line of input contains two integers $N$ and $M$: the number of vertices and edges in graph $G$, respectively ($2 \le N \le 2 \cdot 10^5$, $N-1 \le M \le 2 \cdot 10^5$).</p>

<p>The following $M$ lines contain descriptions of the edges. Each description contains three integers $a_i$, $b_i$ and $c_i$ ($1 \le a_i, b_i \le N$, $0 \le c_i \le 1$): the vertices that are connected by this edge and the color of the edge (red if $c_i=1$ and blue otherwise).</p>

<p>You may assume that there are no multiple edges nor loops, that the given graph is connected, and that the red edges are forming a spanning tree of the given graph.</p>

### 출력

<p>Print $M$ integers that form the lexicographically smallest permutation $P$ that satisfies the following condition: if, for each $i$, the weight of edge $i$ is $p_i$, then all the edges used in the minimal spanning tree of $G$ are red.</p>
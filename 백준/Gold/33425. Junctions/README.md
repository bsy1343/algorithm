# [Gold II] Junctions - 33425

[문제 링크](https://www.acmicpc.net/problem/33425)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

그래프 이론, 최단 경로, 플로이드–워셜

### 문제 설명

<p>The streets and junctions of the Martian City can be represented as a weighted bidirectional complete graph where the $n$ junctions are the vertices and the streets are the edges. The weight of an edge is the length of the corresponding street.</p>

<p>For each edge $(a, b)$, determine whether there exists a pair of vertices $(x, y)$ such that all shortest paths from $x$ to $y$ pass through the edge $(a, b)$.</p>

### 입력

<p>The first line contains a positive integer $n$ ($1 \le n \le 500$) representing the number of junctions in the city.</p>

<p>Each of the next $n$ lines contains $n$ space-separated integers. Together, they form an $n \times n$ matrix. The number $a_{i, j}$ ($1 \leq a_{i, j} \leq 10^6$) in the $i$-th row and $j$-th column represents the length of the bidirectional street between junctions $i$ and $j$. Specifically, $a_{i, i} = 0$ and $a_{i, j} = a_{j, i}$.</p>

### 출력

<p>Output a binary matrix of size $n \times n$ without spaces. The entry in the $i$-th row and $j$-th column must be $1$ if the edge $(i, j)$ satisfies the conditions described in the problem, and $0$ otherwise.</p>

<p>In particular, output $0$ when $i = j$.</p>
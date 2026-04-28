# [Platinum II] Enigmatic Enumeration - 26028

[문제 링크](https://www.acmicpc.net/problem/26028)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 97, 정답: 36, 맞힌 사람: 34, 정답 비율: 39.535%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Your friend Cajsa had a graph with $n$ vertices, and she needed to find its shortest cycle. To do this, she just took a random sequence of vertices and luckily this happened to be a shortest cycle. &quot;What are the odds?&quot;, she asked herself and wrote another program to calculate this probability.</p>

<p>To do this, Cajsa needed an algorithm to count the number of shortest cycles in a graph. She uses a homemade randomized algorithm that runs in $\mathcal{O}(1)$. But you suspect that this algorithm is incorrect, because surely it would have to consider every vertex of the graph (right?). You think that Cajsa&#39;s algorithm just prints random numbers that happen to be correct on some small graphs.</p>

<p>In response to these doubts, Cajsa generated a bunch of graphs, and challenges you to check that her answers are correct.</p>

<p>You are given an undirected graph with $n$ vertices and $m$ edges, and your task is to count the number of shortest cycles in it.</p>

<p>A <em>cycle</em> in a graph is a path of <strong>distinct</strong> vertices where, additionally, there is an edge between the first and last vertices of the path. Two cycles are considered distinct if they don&#39;t consist of the same set of edges. Thus the cycles $3, 1, 2$ and $3, 2, 1$ are the same, and the cycles $1, 2, 3$ and $2, 3, 1$ are considered the same.</p>

### 입력

<p>The first line of input contains two integers $n$ and $m$ ($3 \leq n \leq 3000$, $3 \leq m \leq 6000$), the number of vertices and the number of edges.</p>

<p>The following $m$ lines each contain two integers $u_i$ and $v_i$ ($1 \leq u_i \neq v_i \leq n$), indicating that an undirected edge goes between $u_i$ and $v_i$. The graph will not contain duplicate edges or self-loops.</p>

<p>It is guaranteed that the graph contains at least one cycle. However, note that the graph does <em>not</em> have to be connected.</p>

### 출력

<p>Print one integer, the number of shortest cycles in the graph.</p>
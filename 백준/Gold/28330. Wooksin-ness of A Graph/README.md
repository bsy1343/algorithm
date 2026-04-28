# [Gold IV] Wooksin-ness of A Graph - 28330

[문제 링크](https://www.acmicpc.net/problem/28330)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 56, 정답: 34, 맞힌 사람: 26, 정답 비율: 55.319%

### 분류

해 구성하기, 자료 구조, 분리 집합, 그래프 이론, 그래프 탐색

### 문제 설명

<p>At the headquarters of algospot.com, Toivoa &ldquo;the chairman&rdquo; has been pestering Astein &ldquo;the slave&rdquo; for a new graph problem for so long. So Astein came up with the following problem.</p>

<p>Wooksin-ness(욱신함) of an undirected graph $G(V, E)$ is defined as the minimum number of additional edges in order to have a cycle in the graph. Stated formally, you can write it as:</p>

<p style="text-align: center;">$\min |E&#39; - E|$ $s.t.$ $E&#39; &supe; E$ and $G&#39;(V, E&#39;)$ has at least one cycle</p>

<p>However, loops (edges that start and end at the same vertex) and multiple edges between a single pair of vertices are not allowed.</p>

<p>Write a program that calculates Wooksin-ness of given graph.</p>

### 입력

<p>The input consists of $T$ test cases. The number of test cases $T$ is given in the first line of the input.</p>

<p>The first line of each test case contains two integers $V$ and $E$ ($1 &le; V &le; 100$, $0 &le; E &le; 1\,000$), where $V$ represents the number of vertices in the graph, and $E$ represents the number of edges. The vertices are numbered from $0$ to $V - 1$. The following $E$ lines will each contain two integers, which are the number of two vertices connected by an edge.</p>

<p>There will be no loops in the input data. There will be at most one edge between a pair of vertices.</p>

### 출력

<p>Print exactly one line for each test case. The line should contain an integer indicating the minimum number of additional edges we need to add to the graph to get a cycle. If this is impossible, print <code>-1</code> instead.</p>
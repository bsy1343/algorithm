# [Platinum III] Eulerian? - 23120

[문제 링크](https://www.acmicpc.net/problem/23120)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 32, 맞힌 사람: 28, 정답 비율: 57.143%

### 분류

그래프 이론, 무작위화, 오일러 경로

### 문제 설명

<p>This problem is interactive.</p>

<p>We have hidden from you an undirected graph $G$ on $n$ vertices. It is guaranteed to be connected and to not contain multiple edges or self-loops.</p>

<p>You can ask <strong>up to $60$ queries</strong> of the following form:</p>

<ul>
	<li>Consider a subset $S$ of all vertices of $G$. How many edges are there in the subgraph induced by $S$? In other words, how many edges in $G$ have both their endpoints in $S$?</li>
</ul>

<p>Your goal is to determine whether there exists an Eulerian cycle in this graph. An Eulerian cycle is a path in the graph that goes through every edge exactly once, and it starts and ends in the same vertex.</p>

<p>Note that <strong>graph $G$ is fixed before the start of interaction</strong>. In other words, the interactor is not adaptive.</p>

### 입력

<p>The first line contains a single integer $n$ ($3 \le n \le 10^4$), the number of vertices in $G$. It is guaranteed that $G$ has no more than $10^5$ edges, is connected, and does not contain multiple edges or self-loops.</p>

### 출력



### 힌트

<p>The hidden graph in the example is the graph with $3$ vertices and edges $(2, 1)$ and $(2, 3)$.</p>
# [Platinum I] Hamiltonian - 23123

[문제 링크](https://www.acmicpc.net/problem/23123)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 71, 정답: 24, 맞힌 사람: 23, 정답 비율: 35.385%

### 분류

해 구성하기, 그래프 이론

### 문제 설명

<p>You are given a positive integer $K \le 60$. Construct a graph with at most $20$ vertices with the following property: there are exactly $K$ unordered pairs of vertices $(u, v)$ such that there is a Hamiltonian path between $u$ and $v$ in this graph.</p>

<p>It can be shown that, under these constraints, the solution always exists.</p>

<p>Recall that a Hamiltonian path is a path between two vertices of a graph that visits each vertex exactly once.</p>

### 입력

<p>The only line of the input contains a single integer $K$ ($1 \le K \le 60$).</p>

### 출력

<p>On the first line, output two integers $n$ and $m$ ($2 \le n \le 20$, $0 \le m \le \frac{n(n-1)}{2}$), the number of vertices and the number of edges in your graph respectively.</p>

<p>In each of the next $m$ lines, output two integers $u$ and $v$ ($1 \le u, v \le n$, $u \neq v$), representing the edge $(u, v)$ of your graph. All edges have to be distinct.</p>
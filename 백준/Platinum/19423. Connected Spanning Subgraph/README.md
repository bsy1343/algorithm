# [Platinum I] Connected Spanning Subgraph - 19423

[문제 링크](https://www.acmicpc.net/problem/19423)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 17, 맞힌 사람: 17, 정답 비율: 51.515%

### 분류

수학, 그래프 이론, 애드 혹, 조합론, 홀짝성, 이분 그래프

### 문제 설명

<p>Bobo has a connected undirected graph $G$ with $n$ vertices and $m$ edges where vertices are conveniently labeled with $1, 2, \dots, n$.</p>

<p>Bobo chooses a non-empty subset of edges such that the graph with the chosen edges is still connected. He would like to know the number of such subsets modulo $2$.</p>

<p>Note that a graph is connected if, for any two vertices $a$ and $b$, there exists a path which connects $a$ and $b$.</p>

### 입력

<p>The input contains zero or more test cases, and is terminated by end-of-file. For each test case:</p>

<p>The first line contains two integers $n$ and $m$ ($2 \leq n \leq 2 \cdot 10^5$, $1 \leq m \leq 2 \cdot 10^5$).</p>

<p>The $i$-th of the following $m$ lines contains two integers $a_i$ and $b_i$ which denote an edge between vertices $a_i$ and $b_i$.</p>

<p>It is guaranteed that the sum of all $m$ does not exceed $2 \cdot 10^5$, and all the given graphs are connected.</p>

### 출력

<p>For each test case, output an integer which denotes the remainder modulo $2$.</p>
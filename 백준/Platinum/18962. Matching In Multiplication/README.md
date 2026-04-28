# [Platinum III] Matching In Multiplication - 18962

[문제 링크](https://www.acmicpc.net/problem/18962)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 18, 맞힌 사람: 18, 정답 비율: 46.154%

### 분류

수학, 그래프 이론, 조합론, 함수형 그래프

### 문제 설명

<p>In the mathematical discipline of graph theory, a <em>bipartite graph</em>&nbsp;is an undirected graph whose vertices can be divided into two disjoint sets $U$ and $V$ such that every edge connects some vertex in $U$ to some vertex in $V$. The vertex sets $U$ and $V$ are both independent sets, and are usually called the parts of the graph. Equivalently, a bipartite graph is a graph that does not contain any odd-length cycles.&nbsp; A <em>matching</em>&nbsp;in a graph is a set of edges without common vertices. A <em>perfect matching</em>&nbsp;is a matching such that each vertex is covered by an edge from the matching.</p>

<p>Little Q misunderstood the definition of bipartite graph. He thinks the size of $U$ is equal to the size of $V$, and for each vertex $p$ in $U$, there are exactly two edges from $p$. Based on such weighted graph, he defines the weight of a perfect matching as the product of weights of all the edges included in the matching, and the weight of a graph as the sum of all the perfect matchings&#39; weights.</p>

<p>Your task is to write a program to compute the weight of a weighted graph made by Little Q.</p>

### 입력

<p>The first line of the input contains an integer $n$ denoting the size of $U$ ($1 \leq n\leq 3 \cdot 10^5$). The vertices in $U$ and $V$ are labeled separately by the integers $1, 2, \ldots, n$.</p>

<p>In the next $n$ lines, the $i$-th line contains four integers $v_{i, 1}$, $w_{i, 1}$, $v_{i, 2}$ and $w_{i, 2}$ which mean that there is an edge between $U_i$ and $V_{v_{i, 1}}$ with weight $w_{i, 1}$, and there is another edge between $U_i$ and $V_{v_{i, 2}}$ with weight $w_{i, 2}$ ($1 \leq v_{i, j} \leq n$, $1 \leq w_{i, j} \leq 10^9$).</p>

<p>It is guaranteed that the given graph has at least one perfect matching, and there is at most one edge between every pair of vertices.</p>

### 출력

<p>Print a single line containing a single integer: the weight of the given graph. Since the answer may be very large, print it modulo $998\,244\,353$.</p>
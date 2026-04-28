# [Platinum I] Salaj - 19051

[문제 링크](https://www.acmicpc.net/problem/19051)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 23, 정답: 7, 맞힌 사람: 6, 정답 비율: 31.579%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Given two integers $V$ and $E$, we say that an array $A$ of length $E$ is a valid <em>connectivity history array</em>&nbsp;(CHA, for short) if there exists a directed graph with $V$ vertices and $E$ edges and a permutation $P$ of length $E$ such that, if we were to start with an empty graph on $V$ vertices and add edges in the order given by permutation $P$, then it is true for all $1 \le i \le E$ that $A[i]$ is the number of strongly connected components in the graph after adding the $P[i]$-th edge.</p>

<p>For example, for $V = 3$ and $E = 3$:</p>

<p>$A = [3, 3, 3]$ is a valid CHA because there exists the graph $\{(1, 2), (1, 3), (2, 3)\}$. Regardless of the edge order chosen, the graph will always have three strongly connected components.</p>

<p>$A = [3, 3, 1]$ is a valid CHA because there exists the graph $\{(1, 2), (2, 3), (3, 1)\}$. If we add the edges in exactly this order, the graph will have three strongly connected components after the first two edges, and a single strongly connected component after the third edge is added.</p>

<p>$A = [3, 2, 1]$ is not a valid CHA because there does not exist a graph with three edges on three vertices and an order of adding edges such that the number of strongly connected components decreases after each added edge.</p>

<p>Note that the graph is not allowed to contain self-loops or multiple edges (but if the edge $(x, y)$ exists, the edge $(y, x)$ may also exist).</p>

<p>You are given $Q$ queries, each consisting of a pair of integers $(V, \mathit{MAX})$. Your task is to count the number of valid CHAs for each pair $(V, E)$ such that $1 \le E \le \mathit{MAX}$.</p>

### 입력

<p>The first line contains a single integer $Q$, the number of queries ($Q \le 10$). In the next $Q$ lines, the $i$-th line describes the $i$-th query and contains three integers $V_i$, $\mathit{MAX}_i$ and $\mathit{MOD}_i$ ($1 \le V_i \le 50$, $1 \le \mathit{MAX}_i \le V \cdot (V - 1)$, $1 \le \mathit{MOD_i} \le 10^9$).</p>

### 출력

<p>Output $Q$ lines, one line per query. The $i$-th line must contain $\mathit{MAX}_i$ integers denoting the answers for the $i$-th query, taken modulo $\mathit{MOD}_i$. The $j$-th integer on the $i$-th line must denote the number of valid CHAs for the pair $(V_i, j)$.</p>
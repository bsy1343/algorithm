# [Platinum III] Buy and Delete - 31138

[문제 링크](https://www.acmicpc.net/problem/31138)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

그래프 이론, 그래프 탐색, 최단 경로, 데이크스트라

### 문제 설명

<p>Alice and Bob are playing a game on a directed graph $G$. There are $n$ vertices in $G$, labeled by $1,2,\dots,n$. Initially, there are no edges in $G$. Alice will first buy some direct edges from the shop and then add them into $G$. After that, Bob needs to delete edges until there are no edges in $G$. In a deletion round, Bob can delete a subset of edges $S$ from $G$, such that when only keeping edges in $S$, the graph is acyclic. Note that Alice can buy nothing, and in such a case the number of deletion rounds is $0$.</p>

<p>There are $m$ edges in the shop. Alice has $c$ dollars, so the total price of edges she will buy should not exceed $c$. Alice wants to maximize the number of deletion rounds while Bob wants to minimize it. Both Alice and Bob will play optimally. Please write a program to predict the number of deletion rounds. </p>

### 입력

<p>The input contains only a single case.</p>

<p>The first line of the input contains three integers $n,m$ and $c$ ($2 \leq n\leq 2\,000$, $1\leq m \leq 5\,000$, $1\leq c\leq 10^9$), denoting the number of vertices in $G$, the number of edges in the shop, and how many dollars Alice has.</p>

<p>In the next $m$ lines, the $i$-th line $(1 \le i \le m)$ contains three integers $u_i,v_i$ and $p_i$ ($1\leq u_i,v_i\leq n$, $u_i\neq v_i$, $1\leq p_i\leq 100\,000$), denoting a directed edge in the shop. Alice can pay $p_i$ dollars to buy it, and add an edge from vertex $u_i$ to vertex $v_i$ in $G$.</p>

### 출력

<p>Print a single line containing an integer, denoting the number of deletion rounds.</p>
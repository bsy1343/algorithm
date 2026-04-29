# [Platinum II] Colorful Trees - 32499

[문제 링크](https://www.acmicpc.net/problem/32499)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 93, 정답: 50, 맞힌 사람: 47, 정답 비율: 57.317%

### 분류

다이나믹 프로그래밍, 작은 집합에서 큰 집합으로 합치는 테크닉, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Given a tree with colored vertices, for each edge, how many pairs of vertices with the same color have that edge on the path between them? Note that since it’s a tree, each pair of nodes has exactly one path between them.</p>

### 입력

<p>The first line of input contains a single integer $n$ ($2≤n≤10^5$), which is the number of nodes in the tree. The nodes are numbered from $1$ to $n$.</p>

<p>Each of the next $n$ lines contains a single integer $c$ ($1≤c≤n$). These are the colors of the nodes, in order.</p>

<p>Each of the next $n-1$ lines contains two integers $a$ and $b$ ($1≤a&lt;b≤n$), denoting an undirected edge from node $a$ to node $b$.</p>

### 출력

<p>Output $n-1$ lines. On each line, output a single integer, which is the number of pairs of vertices with the same color that have that edge on the path between them. Output these answers for the edges in the order that they appear in the input.</p>
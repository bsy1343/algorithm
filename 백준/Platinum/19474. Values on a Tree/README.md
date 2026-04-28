# [Platinum III] Values on a Tree - 19474

[문제 링크](https://www.acmicpc.net/problem/19474)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 50, 정답: 18, 맞힌 사람: 8, 정답 비율: 34.783%

### 분류

수학, 그래프 이론, 그래프 탐색, 트리, 조합론, 트리의 지름

### 문제 설명

<p>You are given a tree with $n$ vertices. The length of each edge is exactly 1. For any non-empty subset $S$ of the vertices, $\mathit{value} (S)$ is equal to the maximum of $\mathit{dis} (u, v)$ over all pairs $(u, v) \in S$, where $\mathit{dis} (u, v)$ is equal to the distance between $u$ and $v$ in the tree.</p>

<p>It is easy to find that $\mathit{value} (S)$ satisfies $0 \le \mathit{value} (S) &lt; n$. For each $0 \le K \le n - 1$, print the number of the subsets $S$ such that $\mathit{value} (S) = K$.</p>

### 입력

<p>The first line of input contains an integer $n$ ($1 \le n \le 3000$), the number of vertices in the graph. Then $n - 1$ lines follow. Each of them contains two integers $u$ and $v$ which mean that there is an edge between $u$ and $v$ ($1 \le u, v \le n$). It is guaranteed that the given graph is a tree.</p>

### 출력

<p>Print a line containing exactly $n$ integers. The $i$-th integer must be the number of non-empty subsets $S$ which satisfy $\mathit{value} (S) = i - 1$. The answers may be very large, so print each answer modulo $998\,244\,353$.</p>
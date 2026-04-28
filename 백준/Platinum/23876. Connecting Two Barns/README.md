# [Platinum V] Connecting Two Barns - 23876

[문제 링크](https://www.acmicpc.net/problem/23876)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 787, 정답: 196, 맞힌 사람: 158, 정답 비율: 24.765%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 이분 탐색, 분리 집합

### 문제 설명

<p>Farmer John&#39;s farm consists of a set of $N$ fields $(1 \leq N \leq 10^5)$, conveniently numbered $1 \ldots N$. Between these fields are $M$ bi-directed paths $(0 \leq M \leq 10^5)$, each connecting a pair of fields.</p>

<p>The farm contains two barns, one in field 1 and the other in field $N$. Farmer John would like to ensure that there is a way to walk between the two barns along some series of paths. He is willing to build up to two new paths to accomplish this goal. Due to the way the fields are situated, the cost of building a new path between fields $i$ and $j$ is $(i-j)^2$.</p>

<p>Please help Farmer John determine the minimum cost needed such that barns $1$ and $N$ become reachable from each-other.</p>

### 입력

<p>Each input test case contains $T$ sub-cases ($1\le T\le 20$), all of which must be solved correctly to solve the input case.</p>

<p>The first line of input contains $T$, after which $T$ sub-test cases follow.</p>

<p>Each sub-test case starts with two integers, $N$ and $M$. Next, $M$ lines follow, each one containing two integers $i$ and $j$, indicating a path between two different fields $i$ and $j$. It is guaranteed that there is at most one path between any two fields, and that the sum of $N+M$ over all sub-test cases is at most $5 \cdot 10^5$.</p>

### 출력

Output $T$ lines. The $i$th line should contain a single integer giving the
minimum cost for the $i$th sub-test case.
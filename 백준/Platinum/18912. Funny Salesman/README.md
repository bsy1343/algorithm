# [Platinum I] Funny Salesman - 18912

[문제 링크](https://www.acmicpc.net/problem/18912)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 38, 정답: 20, 맞힌 사람: 20, 정답 비율: 71.429%

### 분류

자료 구조, 그리디 알고리즘, 트리

### 문제 설명

<p>You are given a tree, and each edge has a non-negative integer weight.</p>

<p>Let $d(u, v)$&nbsp;--- The maximum of the edge weights on the unique simple path between vertices $u$ and $v$.</p>

<p>Find the largest $\sum_{i=2}^n{2^{d(p_{i - 1}, p_i)}}$ among all permutations of vertices $p_1, p_2, \ldots, p_n$.</p>

### 입력

<p>The first line contains one integer $n$ ($2 \leq n \leq 100\,000$): the number of vertices in the tree.</p>

<p>Each of the next $n-1$ lines contains three integers $u,v,w$ ($1 \leq u, v \leq n, 0 \leq w \leq 30$), an edge in the tree with endpoints $u,v$ having weight $w$.</p>

### 출력

<p>Print one integer: the largest $\sum_{i=2}^n{2^{d(p_{i - 1}, p_i)}}$.</p>

### 힌트

<p>In the first example, one of the optimal permutations is $\{4, 5, 3, 2, 1\}$.</p>
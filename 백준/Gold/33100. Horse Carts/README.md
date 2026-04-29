# [Gold III] Horse Carts - 33100

[문제 링크](https://www.acmicpc.net/problem/33100)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 21, 정답: 20, 맞힌 사람: 20, 정답 비율: 95.238%

### 분류

그리디 알고리즘, 우선순위 큐, 자료 구조, 정렬

### 문제 설명

<p>You just found a cave filled with $N$ treasures (numbered from $1$ to $N$). Treasure $i$ has a weight of $W_i$ and a value of $V_i$.</p>

<p>Luckily, you also bring $M$ horse carts (numbered from $1$ to $M$) to help you carry the treasures. Each cart can only carry one treasure; cart $j$ can only carry a treasure with weight at most $S_j$.</p>

<p>Determine the maximum total value of treasures that you can take using your horse carts.</p>

### 입력

<p>The first line consists of two integers $N$ $M$ ($1 ≤ N, M ≤ 100\, 000$).</p>

<p>Each of the next $N$ lines consists of two integers $W_i$ $V_i$ ($1 ≤ W_i , V_i ≤ 10^6$).</p>

<p>The following line consists of $M$ integers $S_j$ ($1 ≤ S_j ≤ 10^6$).</p>

### 출력

<p>Output a single integer representing the maximum total value of treasures that you can take using your horse carts.</p>
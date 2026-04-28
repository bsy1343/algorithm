# [Platinum III] Candies - 31346

[문제 링크](https://www.acmicpc.net/problem/31346)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 93, 정답: 14, 맞힌 사람: 11, 정답 비율: 33.333%

### 분류

자료 구조, 그리디 알고리즘, 이분 탐색, 우선순위 큐, 매개 변수 탐색

### 문제 설명

<p>$n$ bobo are playing a game about candies. bobo are labeled  by $1, 2, \dots, n$ for convenience. Initially, the $i$-th bobo has $a_i$ candies in hand.</p>

<p>The game is played in $m$ rounds. In each round, the bobo who has the least number of candies currently is awarded with $x$ candies. If two or more bobo have the same number of candies, the bobo with the smallest label gets the prize.</p>

<p>The $1$-st bobo is their leader. So he can get at most $y$ more candies from some unknown source before the start of the game. Now he wonder the maximum number of candies he can have after the $m$ rounds.</p>

### 입력

<p>The first line contains $4$ integers $n, m, x, y$ ($1 \leq n, m \leq 200000, 1 \leq x, y \leq 10^9$).</p>

<p>The second line contains $n$ integers $a_1, a_2, \dots, a_n$ ($1 \leq a_i \leq 10^9$).</p>

### 출력

<p>A single integer denotes the maximum number of candies.</p>
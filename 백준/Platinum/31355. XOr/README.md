# [Platinum V] XOr - 31355

[문제 링크](https://www.acmicpc.net/problem/31355)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 73, 정답: 40, 맞힌 사람: 37, 정답 비율: 60.656%

### 분류

그리디 알고리즘

### 문제 설명

<p>bobo has a sequence of integers $a_1, a_2, \dots, a_n$. He decides to divide the sequence into exactly $m$ consecutive parts.</p>

<p>The cost of each part is its xor sum (bitwise exclusive-or), while the cost of division is bitwise or-sum of its parts&#39; costs.</p>

<p>Help bobo find the minimum cost.</p>

### 입력

<p>The first line contains $2$ integers $n, m$ ($1 \leq n \leq 200000, 1 \leq m \leq n$).</p>

<p>The second line contains $n$ integers $a_1, a_2, \dots, a_n$ ($0 \leq a_i \leq 10^9$).</p>

### 출력

<p>A single integer denotes the minimum cost.</p>
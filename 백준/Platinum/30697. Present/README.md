# [Platinum II] Present - 30697

[문제 링크](https://www.acmicpc.net/problem/30697)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 22, 맞힌 사람: 19, 정답 비율: 63.333%

### 분류

비트마스킹, 조합론, 자료 구조, 수학, 세그먼트 트리, 정렬, 두 포인터

### 문제 설명

<p>Catherine received an array of integers as a gift for March 8. Eventually she grew bored with it, and she started calculated various useless characteristics for it. She succeeded to do it for each one she came up with. But when she came up with another one --- <code>xor</code> of all pairwise sums of elements in the array, she realized that she couldn&#39;t compute it for a very large array, thus she asked for your help. Can you do it? Formally, you need to compute</p>

<p>$$\begin{align*} (a_1 + a_2) \oplus (a_1 + a_3) \oplus \ldots \oplus (a_1 + a_n) \oplus \\ \oplus (a_2 + a_3) \oplus \ldots \oplus (a_2 + a_n) \oplus \\ \ldots \\ \oplus (a_{n-1} + a_n) \\ \end{align*}$$</p>

### 입력

<p>The first line contains a single integer $n$ ($2 \leq n \leq 400\,000$) --- the number of integers in the array.</p>

<p>The second line contains integers $a_1, a_2, \ldots, a_n$ ($1 \leq a_i \leq 10^7$).</p>

### 출력

<p>Print a single integer --- xor of all pairwise sums of integers in the given array.</p>

### 힌트

<p>In the first sample case there is only one sum $1 + 2 = 3$.</p>

<p>In the second sample case there are three sums: $1 + 2 = 3$, $1 + 3 = 4$, $2 + 3 = 5$. In binary they are represented as $011_2 \oplus 100_2 \oplus 101_2 = 010_2$, thus the answer is 2.</p>

<p>$\oplus$ is the bitwise xor operation. To define $x \oplus y$, consider binary representations of integers $x$ and $y$. We put the $i$-th bit of the result to be 1 when exactly one of the $i$-th bits of $x$ and $y$ is 1. Otherwise, the $i$-th bit of the result is put to be 0. For example, $0101_2 \, \oplus \, 0011_2 = 0110_2$.</p>
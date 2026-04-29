# [Platinum I] Različitost - 32877

[문제 링크](https://www.acmicpc.net/problem/32877)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 8, 맞힌 사람: 8, 정답 비율: 25.000%

### 분류

누적 합, 비트마스킹, 수학

### 문제 설명

<p>Two infinite periodic sequences of integers, $a_i$ and $b_i$, are given, defined by their periods of lengths $n$ and $m$, respectively. This means that the natural numbers $n$ and $m$ are given, as well as the numbers $a_1, a_2, \dots , a_n$ and $b_1, b_2, \dots , b_m$, for which $a_i = a_{i+n}$ and $b_i = b_{i+m}$ hold for every natural number $i$.</p>

<p>Additionally, given a natural number $k$, we define the "diversity" of these two sequences as the sum $a_i \oplus b_i$ for each $i = 1, 2, \dots , k$. (Here, $\oplus$ denotes the bitwise exclusive OR operation, which produces ones in the positions where the binary digits of the two numbers differ. For example, $5 \oplus 3 = (101)_2 \oplus (011)_2 = (110)_2 = 6$.)</p>

<p>Your task is to calculate the diversity of the given sequences.</p>

### 입력

<p>In the first line, there are $n$, $m$, and $k$ ($1 ≤ n, m ≤ 2 \cdot 10^5$, $1 ≤ k ≤ 10^{18}$), which are the numbers from the task description.</p>

<p>In the second line, there are $n$ integers $a_1, \dots , a_n$ ($0 ≤ a_i ≤ 10^{18}$, $i = 1, 2, \dots , n$).</p>

<p>In the third line, there are $m$ integers $b_1, \dots , b_m$ ($0 ≤ b_i ≤ 10^{18}$, $i = 1, 2, \dots , m$).</p>

### 출력

<p>Because the answer can be very large, output the remainder of the answer when divided by $10^9 + 7$ in a single line.</p>
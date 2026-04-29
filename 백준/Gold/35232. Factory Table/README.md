# [Gold IV] Factory Table - 35232

[문제 링크](https://www.acmicpc.net/problem/35232)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 12, 정답: 10, 맞힌 사람: 10, 정답 비율: 83.333%

### 분류

수학

### 문제 설명

<p>You are playing the sandbox game Mathcraft. Each crafting table of level $k$ can produce all possible products obtained by multiplying two numbers between $1$ and $k$.</p>

<p>If you unroll the k-th crafting table, you get the array $[1\cdot 1, 1\cdot 2, \dots , 1\cdot k, 2\cdot 1, 2\cdot 2, \dots , 2\cdot k, \dots , k\cdot 1, k\cdot 2, \dots  , k \cdot k]$. For example, for $k = 4$, the unrolled table is $[1, 2, 3, 4, 2, 4, 6, 8, 3, 6, 9, 12, 4, 8, 12, 16]$.</p>

<p>Your friend Bob crafted a (contiguous) subarray of one unrolled crafting table. This subarray is $a_1, a_2, \dots , a_n$.</p>

<p>You want to know how skilled Bob is, so you want to find the minimum possible level of his crafting table. Specifically, you want to determine the smallest $k$ such that $a_1, a_2, \dots , a_n$ appears as a subarray of the $k$-th unrolled table.</p>

<p>An array $b$ is a subarray of an array $c$ if $b$ can be obtained from $c$ by deleting several (possibly zero or all) elements from the beginning and several (possibly zero or all) elements from the end.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 ≤ t ≤ 500$). The description of the test cases follows.</p>

<p>The first line of each test case contains a single integer $n$ ($2 ≤ n ≤ 100$) — the length of the array $a_1, a_2, \dots , a_n$.</p>

<p>The second line of each test case contains $n$ integers $a_1, a_2, \dots , a_n$ ($1 ≤ a_i ≤ 10^9$).</p>

<p>Note that there are no constraints on the sum of $n$ over all test cases.</p>

### 출력

<p>For each test case, output a single line containing an integer: the smallest crafting table level $k$ such that the array $a_1, a_2, \dots , a_n$ appears as a contiguous subarray of the $k$-th unrolled table. For the given input, such a $k$ always exists.</p>
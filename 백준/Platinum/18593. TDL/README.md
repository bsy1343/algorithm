# [Platinum V] TDL - 18593

[문제 링크](https://www.acmicpc.net/problem/18593)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 102, 정답: 44, 맞힌 사람: 33, 정답 비율: 37.931%

### 분류

브루트포스 알고리즘, 수학, 정수론

### 문제 설명

<p>For a positive integer n, let us denote function f(n, m) as the m-th smallest integer x such that x &gt; n and gcd(x, n) = 1. For example, f(5, 1) = 6 and f(5, 5) = 11.</p>

<p>You are given the values of m and (f(n, m) &minus; n) &oplus; n, where &ldquo;&oplus;&rdquo; denotes the bitwise XOR operation. Please write a program to find the smallest positive integer n such that (f(n, m) &minus; n) &oplus; n = k, or determine it is impossible.</p>

### 입력

<p>The first line of the input contains an integer T (1 &le; T &le; 10), denoting the number of test cases.</p>

<p>Each test case is denoted by a single line containing two integers k and m (1 &le; k &le; 10<sup>18</sup>, 1 &le; m &le; 100).</p>

### 출력

<p>For each test case, print a single line containing a single integer: the smallest value of n. If there is no solution, output &ldquo;-1&rdquo; instead.</p>
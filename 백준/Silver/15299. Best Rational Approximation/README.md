# [Silver II] Best Rational Approximation - 15299

[문제 링크](https://www.acmicpc.net/problem/15299)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 125, 정답: 37, 맞힌 사람: 29, 정답 비율: 31.183%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Many microcontrollers have no floating point unit but do have a (reasonably) fast integer divide unit. In these cases it may pay to use rational values to approximate floating point constants. For instance,</p>

<p style="text-align:center">355/113 = 3.1415929203539823008849557522124</p>

<p>is a quite good approximation to</p>

<p style="text-align:center">&pi; = 3.14159265358979323846</p>

<p>A best rational approximation, p/q, to a real number, x, with denominator at most M is a rational number, p/q (in lowest terms), with q &lt;= M such that, for any integers, a and b with b &lt;= M, and a and b relatively prime, p/q is at least as close to x as a/b:</p>

<p style="text-align:center">|x &ndash; p/q| &le; |x &ndash; a/b|</p>

<p>Write a program to compute the best rational approximation to a real number, x, with denominator at most M.</p>

### 입력

<p>The first line of input contains a single integer P, (1 &le; P &le; 1000), which is the number of data sets that follow. Each data set should be processed identically and independently.</p>

<p>Each data set consists of a single line of input. It contains the data set number, K, followed by the maximum denominator value, M (15 &le; M &le; 100000), followed by a floating-point value, x, (0 &le; x &lt; 1).</p>

### 출력

<p>For each data set there is a single line of output. The single output line consists of the data set number, K, followed by a single space followed by the numerator, p, of the best rational approximation to x, followed by a forward slash (/) followed by the denominator, q, of the best rational approximation to x.</p>
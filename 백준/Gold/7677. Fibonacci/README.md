# [Gold II] Fibonacci - 7677

[문제 링크](https://www.acmicpc.net/problem/7677)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 1469, 정답: 1036, 맞힌 사람: 941, 정답 비율: 73.920%

### 분류

수학, 정수론, 분할 정복을 이용한 거듭제곱, 피사노 주기

### 문제 설명

<p>In the Fibonacci integer sequence, F<sub>0</sub> = 0, F<sub>1</sub> = 1, and F<sub>n</sub> = F<sub>n&minus;1</sub> + F<sub>n&minus;2</sub> for n &ge; 2. For example, the first ten terms of the Fibonacci sequence are:</p>

<p>0, 1, 1, 2, 3, 5, 8, 13, 21, 34, . . .</p>

<p>An alternative formula&nbsp;for the Fibonacci sequence is</p>

<p>\[\begin{bmatrix} F_{ n+1 } &amp; F_{ n } \\ F_{ n } &amp; F_{ n-1 } \end{bmatrix}=\begin{bmatrix} 1 &amp; 1 \\ 1 &amp; 0 \end{bmatrix}^n\]</p>

<p>Given an integer n, your goal is to compute the last 4 digits of F<sub>n</sub>.</p>

### 입력

<p>The input test file will contain multiple test cases. Each test case consists of a single line containing n (where 0 &le; n &le; 1,000,000,000). The end-of-file is denoted by a single line containing the number -1.</p>

### 출력

<p>For each test case, print the last four digits of Fn. If the last four digits of Fn are all zeros, print &lsquo;0&rsquo;; otherwise, omit any leading zeros (i.e., print F<sub>n</sub> mod 10000).</p>
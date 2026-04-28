# [Platinum II] Polynomial - 11500

[문제 링크](https://www.acmicpc.net/problem/11500)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 185, 정답: 104, 맞힌 사람: 59, 정답 비율: 53.153%

### 분류

다이나믹 프로그래밍, 수학, 정수론

### 문제 설명

<p>A polynomial \(f(k)\) of degree \(t\) with integral coefficients is given as \(f(k) = c_0 + c_1k + c_2k^2 + \cdots + c_tk^t\), where the coefficients \(c_0, \dots, c_t\) are all integers. Here, we are interested in the sum \(S(n)\) of \(f(0)\), \(f(1)\), ..., and \(f(n)\) for any nonnegative integer \(n\). That is, \(S(n)\) is defined by:</p>

<p>\[S(n) = \sum_{k=0}^{n}{f(k)} = f(0) + f(1) + \cdots + f(n)\]</p>

<p>The sum \(S(n)\) is a polynomial, too, but is of degree \(t + 1\) and rational coefficients. It can thus be represented by:</p>

<p>\[S(n) = \frac{a_0}{b_0} + \frac{a_1}{b_1}n + \frac{a_2}{b_2}n^2 + \cdots + \frac{a_{t+1}}{b_{t+1}}n^{t+1}\]</p>

<p>where \(a_i\) and \(b_i\) are integers that are relatively prime for each \(i = 0, 1, \dots, t+1\) or equivalently, that have no common divisor greater than 1.</p>

<p>Given a polynomial \(f(k)\) of degree \(t\) with integeral coeffcients \(c_0, \dots, c_t\), your program is to compute \(S(n)\) for the given polynomial \(f(k)\) and to output the following value</p>

<p>\[\sum_{i=0}^{t+1}{\left| a_i \right| }\]</p>

<p>where the \(a_i\) are determined as above for such a representation of \(S(n) = \frac{a_0}{b_0} + \frac{a_1}{b_1}n + \frac{a_2}{b_2}n^2 + \cdots + \frac{a_{t+1}}{b_{t+1}}n^{t+1}\).</p>

<p>You may exploit the following known identity for polynomials: for any positive integer \(d\) and any real \(x\),</p>

<p>\[(x+1)^d - x^d = 1 + \binom{d}{1}x + \binom{d}{2}x^2 + \dots + \binom{d}{d-1}x^{d-1}\]</p>

<p>where \(\binom{d}{i} = \frac{d!}{i!(d-i)!}\) for any integer \(i\) with \(0 \le i \le d\).</p>

### 입력

<p>Your program is to read from standard input. The input consists of T test cases. The number of test cases T is given in the first line of the input. Each test case consists of only a single line containing a nonnegative integer \(t\) (\(0 \le t \le 25\)) and \(t+1\) following integers \(c_0, \dots, c_t\) with \(-10 \le c_0, \dots, c_t \le 10\) and \(c_t \ne 0\). This fully describes the input polynomial \(f(k) = c_0 + c_1k + c_2k^2 + \cdots + c_tk^t\) of degree \(t\) with coefficients \(c_0, \dots, c_t\).</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line for each test case. The line should contain an integer representing the value \(\sum_{i=0}^{t+1}{\left| a_i \right|}\).</p>
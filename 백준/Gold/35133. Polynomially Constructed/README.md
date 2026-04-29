# [Gold II] Polynomially Constructed - 35133

[문제 링크](https://www.acmicpc.net/problem/35133)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 18, 정답: 9, 맞힌 사람: 7, 정답 비율: 53.846%

### 분류

그리디 알고리즘, 미적분학, 수학

### 문제 설명

<p>You are given an integer $N$ and an array of <strong>integers</strong> $[y_1, y_2, \ldots, y_N]$ of size $N$.</p>

<p>You want to construct the following:</p>

<ul>
<li>a polynomial $P(x) = c_0 x^0 + c_1 x^1 + \ldots + c_d x^d$ where the coefficients are <strong>real numbers</strong>, and for some <em>degree</em> $d$;</li>
<li>an array of <strong>real numbers</strong> $[x_1, x_2, \ldots, x_N]$ of size $N$ such that $x_1 &lt; x_2 &lt; \ldots &lt; x_N$;</li>
</ul>

<p>and the construction satisfies $P(x_1) = y_1$, $P(x_2) = y_2$, $\ldots$, $P(x_N) = y_N$.</p>

<p>It can be proven that such a construction always exists. Your task is to find the minimum polynomial degree $d$ that you can construct.</p>

### 입력

<p>The first line contains an integer $N$ ($1 \leq N \leq 100000$). The second line contains $N$ integers representing $y_i$ ($-10^9 \leq y_i \leq 10^9$).</p>

### 출력

<p>Output the minimum degree $d$ in a single line.</p>

### 힌트

<p><em>Explanation of Sample 1:</em> We can construct a polynomial $\frac{29}{3} x^0 + 8x^1 + 0 x^2 - \frac{2}{3} x^3$, and array $[-2.81273..., -2, -1.24361..., 3.86937..., 3.91423...]$.</p>
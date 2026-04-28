# [Gold III] Plotting Polynomials - 10485

[문제 링크](https://www.acmicpc.net/problem/10485)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 26, 정답: 25, 맞힌 사람: 24, 정답 비율: 96.000%

### 분류

구현, 수학

### 문제 설명

<p>Graphical calculators have become popular among high school students. They allow functions to be plotted on&nbsp;screen with minimal efforts by the students. These calculators generally do not possess very fast processors. In this problem, you are asked to implement a method to speed up the plotting of a polynomial.</p>

<p>Given a polynomial p(x) = a<sub>n</sub>x<sup>n</sup> + ... + a<sub>1</sub>x + a<sub>0</sub> of degree n, we wish to plot this polynomial at the m integer points x = 0, 1, . . . , m&minus;1. A straightforward evaluation at these points requires mn multiplications and mn additions.</p>

<p>One way to speed up the computation is to make use of results computed previously. For example, if p(x) = a<sub>1</sub>x + a<sub>0</sub> and p(i) has already been computed, then p(i + 1) = p(i) + a<sub>1</sub>. Thus, each successive value of p(x) can be computed with one addition each.</p>

<p>In general, we can compute p(i + 1) from p(i) with n additions, after the appropriate initialization has been done. If we initialize the constants C<sub>0</sub>, C<sub>1</sub>, . . ., C<sub>n</sub> appropriately, one can compute p(i) using the following pseudocode:</p>

<pre>
p(0) = C_0; t_1 = C_1; ... t_n = C_n;
for i from 1 to m-1 do
     p(i)    = p(i-1)  + t_1;
     t_1     = t_1     + t_2;
     t_2     = t_2     + t_3;
              :
              :
     t_(n-1) = t_(n-1) + t_n;
end</pre>

<p>For example, if p(x) = a<sub>1</sub>x + a<sub>0</sub>, we can initialize C<sub>0</sub> = a<sub>0</sub> and C<sub>1</sub> = a<sub>1</sub>.</p>

<p>Your task is to compute the constants C<sub>0</sub>, C<sub>1</sub>, . . . , C<sub>n</sub> for the above pseudocode to give the correct values for p(i) at i = 0, . . . , m &minus; 1.</p>

### 입력

<p>The input consists of one case specified on a single line. The first integer is n, where 1 &le; n &le; 6. This is followed by n + 1 integer coefficients a<sub>n</sub>, . . . , a<sub>1</sub>, a<sub>0</sub>. You may assume that |a<sub>i</sub>| &le; 50 for all i, and a<sub>n</sub> &ne; 0.</p>

### 출력

<p>Print the integers C<sub>0</sub>, C<sub>1</sub>, . . . , C<sub>n</sub>, separated by spaces.</p>
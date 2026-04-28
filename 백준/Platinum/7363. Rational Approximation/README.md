# [Platinum III] Rational Approximation - 7363

[문제 링크](https://www.acmicpc.net/problem/7363)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 5, 정답: 3, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

수학, 구현, 정수론, 유클리드 호제법, 선형대수학, 가우스 소거법

### 문제 설명

<p>A polynomial p(x) of degree n can be used to approximate a function f(x) by setting the coeficients of p(x) to match the first n coeficients of the power series of f(x) (expanded about x = 0). For example,</p>

<p>\( \frac{1}{(1-x)} \approx 1 + x + x^2 + ... + x^n \)</p>

<p>Unfortunately, polynomials are &quot;nice&quot; and they do not work well when they are used to approximate functions that behave poorly (e.g. those with singularities). To overcome this problem, we can instead approximate functions by rational functions of the form p(x)/q(x), where p(x) and q(x) are polynomials. You have been asked by Approximate Calculation Machinery to solve this problem, so they can incorporate your solution into their approximate calculation software.</p>

<p>Given m, n, and the first m + n coeficients of the power series of f(x), we wish to compute two polynomials p(x) and q(x) of degrees at most m-1 and n-1, respectively, such that the power series expansion of q(x)f(x)-p(x) has 0 as its first m+n-1 coefficients, and 1 as its coefficient corresponding to the x<sup>m+n-1</sup> term. In other words, we want to find p(x) and q(x) such that</p>

<p>\( q(x)\cdot f(x) - p(x) = x^{m+n-1} + ... \)</p>

<p>where ... contains terms with powers of x higher than m+n-1. From this, f(x) can be approximated by p(x)/q(x).</p>

### 입력

<p>The input will consist of multiple cases. Each case will be specified on one line, in the form</p>

<p>m n f<sub>0</sub> f<sub>1</sub> ... f<sub>m+n-1</sub></p>

<p>where f<sub>i</sub> is the coefficient of x<sup>i</sup> in the power series expansion of f. You may assume that 1 &le; m, 1 &le; n &le; 4, 2 &le; m+n &le; 10, and f<sub>i</sub> are integers such that |f<sub>i</sub>|&le;5. The end of input will be indicated by a line containing m=n=0, and no coefficients for f. You may assume that there is a unique solution for the given input.</p>

### 출력

<p>For each test case, print two lines of output. Print the polynomial p(x) on the first line, and then q(x) on the second line. The polynomial p(x) should be printed as a list of pairs (p<sub>i</sub>,i) arranged in ascending order in i, such that p<sub>i</sub> is a non-zero coefficient for the term x<sup>i</sup>. Each non-zero coefficient p<sub>i</sub> should be printed as a/b, where b &gt; 0 and a/b is the coefficient expressed in lowest terms. In addition, if b = 1 then print only a (and omit b). If p(x) = 0, print a line containing only (0,0). Separate the pairs in the list by one space. The polynomial q(x) should be printed in the same manner. Insert a blank line between cases.</p>

### 힌트

<p>A polynomial p(x) of degree n can be written as p0 + p<sub>1&middot;</sub>x + p<sub>2</sub><span style="font-size:11px">&middot;</span>x<sup>2</sup> + ... + p<sub>n</sub><span style="font-size:11px">&middot;</span>x<sup>n</sup>, where pi&#39;s are integers in this problem.</p>

<p>A power series expansion of f(x) about 0 can be written as f<sub>0</sub> + f<sub>1</sub><span style="font-size:11px">&middot;</span>x + f<sub>2</sub><span style="font-size:11px">&middot;</span>x<sup>2 </sup>+ ..., where f<sub>i</sub>&#39;s are integers in this problem.</p>
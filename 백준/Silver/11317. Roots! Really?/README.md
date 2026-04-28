# [Silver V] Roots! Really? - 11317

[문제 링크](https://www.acmicpc.net/problem/11317)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 369, 정답: 101, 맞힌 사람: 95, 정답 비율: 35.055%

### 분류

수학

### 문제 설명

<p>A quadratic equation</p>

<p>\[ax^2 + bx + c = 0\]</p>

<p>has two solutions \(x_{+}\) and \(x_{&minus;}\), called roots, which are given by</p>

<p>\[x_{\pm} = \dfrac{-b \pm \sqrt{b^2 - 4ac}}{2a}\]</p>

<p>The two roots may be real or complex, and they may be identical or distinct. Given a quadratic equation and an interval [\(s\), \(t\)] (with \(s\) &le; \(t\)), we want to know if the equation has a real root in the interval [\(s\), \(t\)]. That is, is it the case that \(s\) &le; \(r\) &le; \(t\) where \(r\) is any of the roots \(x_{&minus;}\) or \(x_{+}\)?</p>

### 입력

<p>The first line of the input contains an integer, N, the number of test cases (1 &le; N &le; 1, 000). Then follows N lines, each containing five integers, \(a\), \(b\), \(c\), \(s\), and \(t\), with &minus;10<sup>7</sup> &le; \(a\), \(b\), \(c\), \(s\), \(t\) &le; 10<sup>7</sup> , \(a\)&nbsp;&ne; 0, and \(s\) &le;&nbsp;\(t\).</p>

### 출력

<p>For each of the N test cases, output &ldquo;Yes&rdquo; if the equation \(ax^2 + bx + c = 0\) has a real root in the interval [\(s\), \(t\)]. Output &ldquo;No&rdquo; otherwise.</p>
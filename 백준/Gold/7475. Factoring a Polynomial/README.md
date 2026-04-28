# [Gold III] Factoring a Polynomial - 7475

[문제 링크](https://www.acmicpc.net/problem/7475)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 38, 정답: 21, 맞힌 사람: 18, 정답 비율: 52.941%

### 분류

수학

### 문제 설명

<p>Recently Georgie has learned about polynomials. A polynomial in one variable can be viewed as a formal sum <em>a<sub>n</sub>x<sup>n</sup></em> + <em>a<sub>n&minus;1</sub>x<sup>n&minus;1</sup></em> + ... + <em>a<sub>1</sub>x</em> + <em>a<sub>0</sub></em>, where <em>x</em> is the formal variable and <em>a<sub>i</sub></em> are the coefficients of the polynomial. The greatest <em>i</em> such that <em>a<sub>i</sub></em> &ne;&nbsp;0 is called the degree of the polynomial. If <em>a<sub>i</sub></em> = 0 for all <sub>i</sub>, the degree of the polynomial is considered to be negative infinity. If the degree of the polynomial is zero or negative infinity, it is called trivial, otherwise it is called non-trivial.</p>

<p>What really impressed Georgie while studying polynomials was the fact that in some cases one can apply different algorithms and techniques developed for integer numbers to polynomials. For example, given two polynomials, one may sum them up, multiply them, or even divide one of them by the other.</p>

<p>The most interesting property of polynomials, at Georgie&rsquo;s point of view, was the fact that a polynomial, just like an integer number, can be factorized. We say that the polynomial is irreducible if it cannot be represented as the product of two or more non-trivial polynomials with real coefficients. Otherwise the polynomial is called reducible. For example, the polynomial x<sup>2</sup> &minus; 2x + 1 is reducible because it can be represented as (x &minus; 1)(x &minus; 1), while the polynomial x<sup>2</sup> + 1 is not. It is well known that any polynomial can be represented as the product of one or more irreducible polynomials.</p>

<p>Given a polynomial with integer coefficients, Georgie would like to know whether it is irreducible. Of course, he would also like to know its factorization, but such problem seems to be too difficult for him now, so he just wants to know about reducibility.</p>

### 입력

<p>The first line of the input file contains <em>n</em> &mdash; the degree of the polynomial (0 &le; <em>n</em> &le; 20). Next line contains <em>n</em> + 1 integer numbers, <em>a<sub>n</sub></em>, <em>a<sub>n&minus;1</sub></em>, ... , <em>a<sub>1</sub></em>, <em>a<sub>0</sub></em> &mdash; polynomial coefficients (&minus;1000 &le; <em>a<sub>i</sub></em> &le; 1000, <em>a<sub>n</sub></em> &ne;&nbsp;0).</p>

### 출력

<p>Output <code>YES</code> if the polynomial given in the input file is irreducible and <code>NO</code> in the other case.</p>
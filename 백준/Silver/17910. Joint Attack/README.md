# [Silver V] Joint Attack - 17910

[문제 링크](https://www.acmicpc.net/problem/17910)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 255, 정답: 140, 맞힌 사람: 113, 정답 비율: 52.558%

### 분류

수학, 구현, 정수론, 재귀, 유클리드 호제법

### 문제 설명

<p>General Torstein has sent the x-coordinate for the next joint attack and is expecting you to promptly follow his orders in order to avoid impeding doom. Unfortunately Torstein hates numbers with more than 2 digits and loves horizontal line segments, and has therefore sent the coordinate as a continued fraction, i.e.</p>

<p>\[&nbsp;x=x_0+\frac{1}{x_1+\frac{1}{\ldots}}\]</p>

<p>Your rocket launcher only accepts coordinates as reduced fractions, so you need to quickly compute the correct numbers to feed it in order to commence the attack. Hurry! Failure may have dire consequences!</p>

### 입력

<p>The first line of output is one integer n (1 &le; n &lt; 40), the number of coefficients in the continued fraction, followed by a line with n integers (1 &le; x<sub>i</sub> &lt; 100) the coefficients of x.</p>

### 출력

<p>The coordinate x as a reduced fraction. It is guaranteed that the numerator and denominator are both less than 10<sup>18</sup>.</p>
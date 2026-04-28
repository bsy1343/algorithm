# [Silver III] Polynomial Remains - 1716

[문제 링크](https://www.acmicpc.net/problem/1716)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 268, 정답: 155, 맞힌 사람: 91, 정답 비율: 63.636%

### 분류

수학

### 문제 설명

<p>Given the polynomial</p>

<p style="text-align: center;">a(x) = a<sub>n</sub>&nbsp;x<sup>n</sup>&nbsp;+ ... + a<sub>1</sub>&nbsp;x + a<sub>0</sub>,</p>

<p>compute the remainder r(x) when a(x) is divided by x<sup>k</sup>+1.</p>

### 입력

<p>The input consists of a number of cases. The first line of each case specifies the two integers n and k (0&nbsp;&le;&nbsp;n,&nbsp;k&nbsp;&le;&nbsp;10000). The next n+1 integers give the coefficients of a(x), starting from a<sub>0</sub>&nbsp;and ending with a<sub>n</sub>. The input is terminated if n = k = -1.</p>

### 출력

<p>For each case, output the coefficients of the remainder on one line, starting from the constant coefficient r<sub>0</sub>. If the remainder is 0, print only the constant coefficient. Otherwise, print only the first d+1 coefficients for a remainder of degree d. Separate the coefficients by a single space.</p>

<p>You may assume that the coefficients of the remainder can be represented by 32-bit integers.</p>
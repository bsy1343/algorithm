# [Platinum IV] Approximate Circle - 22598

[문제 링크](https://www.acmicpc.net/problem/22598)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 99, 정답: 37, 맞힌 사람: 16, 정답 비율: 34.043%

### 분류

가우스 소거법, 선형대수학, 수학, 통계학

### 문제 설명

<p>Consider a set of&nbsp;$n$&nbsp;points ($x_{1}$,&nbsp;$y_{1}$), ..., ($x_{n}$,$y_{n}$) on a Cartesian space. Your task is to write a program for regression to a circle&nbsp;$x^2&nbsp;+ y^2&nbsp;+ ax + by + c = 0$. In other words, your program should find a circle that minimizes the error. Here the error is measured by the sum over square distances between each point and the circle, which is given by:</p>

<p>$$\sum_{i=1}^{n}{(x_i^2 + y_i^2 + ax_i + by_i + c) ^2}$$</p>

### 입력

<p>The input begins with a line containing one integer $n$ (3 &le; $n$ &le; 40,000). Then $n$ lines follow. The $i$-th line contains two integers $x_{i}$ and $y_{i}$ (0 &le; $x_{i}$, $y_{i}$ &le; 1,000), which denote the coordinates of the $i$-th point.</p>

<p>You can assume there are no cases in which all the points lie on a straight line.</p>

### 출력

<p>Print three integers&nbsp;$a$,&nbsp;$b$&nbsp;and&nbsp;$c$, separated by space, to show the regressed function. The output values should be printed with three digits after the decimal point, and should not contain an error greater than 0.001.</p>
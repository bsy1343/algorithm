# [Gold III] Line of Best Fit - 5649

[문제 링크](https://www.acmicpc.net/problem/5649)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 108, 정답: 75, 맞힌 사람: 48, 정답 비율: 69.565%

### 분류

가우스 소거법, 선형대수학, 수학

### 문제 설명

<p>Finding a line of best fit for a set of data is one of fundamental problems in statistics and numerical analysis. The problem can be formulated as follows. Suppose our data consists of a set P of n points in a plane, denoted (x<sub>1</sub>, y<sub>1</sub>), (x<sub>2</sub>, y<sub>2</sub>), (x<sub>3</sub>, y<sub>3</sub>), ..., (x<sub>n</sub>, y<sub>n</sub>). Given a line L defined by the linear equation y = ax + b, we say that the error of L with respect to P is the sum of its squared &ldquo;distance&rdquo; to the points in P :</p>

<p>\[Error(L,P) = \sum_{i=1}^{n}{(y_i - ax_i - b)^2}\]</p>

<p>The least square approach is to find the line L which minimizes such error. Your task is to write a program to find the values a and b of the line L for a given set of points P.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5649.%E2%80%85Line%E2%80%85of%E2%80%85Best%E2%80%85Fit/eab21fa1.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5649/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:237px; width:249px" /></p>

<p style="text-align: center;">Figure 1. Example of points and a line of best fit</p>

### 입력

<p>the first line contains a positive integer n (1 &le; n &le; 1,000). The next n lines contain 2 integers: x<sub>i</sub> and y<sub>i</sub> in each line. |x<sub>i</sub>| &le; 10<sup>6</sup> and |y<sub>i</sub>| &le; 10<sup>6</sup></p>

### 출력

<p>The output contains the values a and b in two lines respectively. The numbers must be rounded to 3 decimal places.</p>
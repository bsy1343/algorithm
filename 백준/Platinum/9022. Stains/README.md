# [Platinum III] Stains - 9022

[문제 링크](https://www.acmicpc.net/problem/9022)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 50, 정답: 25, 맞힌 사람: 20, 정답 비율: 44.444%

### 분류

다이나믹 프로그래밍, 정렬, 볼록 껍질을 이용한 최적화

### 문제 설명

<p>Taeyeon has been using a rectangular carpet for a long time, thus the carpet has lots of indelible stains. Taeyeon decided to repair it by covering the stains with additional carpet patches. The shape of the patches is a diamond, which is a 45&deg;- rotated axis-aligned square, as illustrated in Figure 1 below. The cost of a patch is proportional to its area. Taeyeon wants to minimize the total cost of the patches used to cover the stains, i.e., minimize the sum of area of the patches used. Moreover, Taeyeon is full of artistic sensitivity, so she wants some pattern of the patches. For this, she will align the centers of the patches on a line as illustrated in Figure 1. Patches can overlap each other.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/9022/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-03%20%EC%98%A4%ED%9B%84%206.02.03.png" style="height:157px; width:400px" /><br />
Figure 1. Stains are black dots and the centers of the patches are the crosses. The thick line is the x-axis.</p>

<p>The figure above shows an example in which the nine stains can be covered by three patches with the minimum cost of 32.5(= 18+12.5+2).</p>

<p>The stains are given with integer coordinates. You should find a set of diamond-shape patches such that (1) every stain must be contained in the interior or on the boundary of some patch, (2) the centers of the patches must be on x-axis, and (3) the sum of area of the patches used must be minimized. You can assume that stains are all distinct and no stains lie on the x-axis.</p>

### 입력

<p>Your program is to read from standard input. The input consists of T test cases. The number of test cases T is given in the first line of the input. Each test case starts with integer n, the number of stains, where 1 &le; n &le; 10,000. Each of the following n lines contains two integers, representing x-coordinate and y-coordinate of the stains between -10<sup>6</sup> and +10<sup>6</sup>, inclusive.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line for each test case. The line should contain a real value, the minimum area of the patches used to cover the stains; you output only 1 digit after decimal point, simply ignore the ones from the 2nd digit after decimal point.</p>
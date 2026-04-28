# [Platinum IV] Go West - 18575

[문제 링크](https://www.acmicpc.net/problem/18575)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 58, 정답: 18, 맞힌 사람: 13, 정답 비율: 65.000%

### 분류

이분 탐색, 미적분학, 기하학, 수학

### 문제 설명

<p>Recently, the government of Byteland has signed an act called Go West. According to this act, every single Bytelandian can get a plot of land in the Far West free of charge!</p>

<p>The procedure of granting a plot is as follows. You are given a stick K millimeters long and a rope L millimeters long. The stick is inflexible, and the rope can be bent in any way. Next, you put the stick and the rope on the ground and measure the area S of the region that is surrounded by the stick and the rope. And then the government allocates a plot with an area of S square millimeters for you.</p>

<p>Formally, you have a segment with length K and a connected curve with length L. Place the segment and the curve on a plane. They split the plane into regions. Pick any finite region and calculate its area S. The curve may have any feasible shape, while the segment must remain intact. The figures can be rotated on the plane if necessary. You cannot change the length of the figures and cannot cut them into several pieces.</p>

<p>Naturally, you want the area of your Far Western plot to be as large as possible. Given K and L, find the maximum area S you can obtain.</p>

### 입력

<p>The first line contains a single integer T (1 &le; T &le; 10<sup>5</sup>), the number of test cases.</p>

<p>Then T test cases follow, one test case per line, each containing two integers K<sub>i</sub> and L<sub>i</sub> (1 &le; K<sub>i</sub> &le; 10<sup>5</sup>, 1 &le; L<sub>i</sub> &le; 10<sup>5</sup>) separated by a single space: the lengths of the stick and the rope, respectively.</p>

### 출력

<p>In the i-th line, print a single real number S<sub>i</sub>: the answer for the i-th test case. Your answer will be considered correct if its absolute or relative error does not exceed 10<sup>&minus;9</sup>.</p>
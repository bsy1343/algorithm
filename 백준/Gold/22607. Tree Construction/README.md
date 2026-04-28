# [Gold II] Tree Construction - 22607

[문제 링크](https://www.acmicpc.net/problem/22607)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 4, 맞힌 사람: 3, 정답 비율: 42.857%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Consider a two-dimensional space with a set of points (<var>x<sub>i</sub></var>,&nbsp;<var>y<sub>i</sub></var>) that satisfy&nbsp;<var>x<sub>i</sub></var>&nbsp;&lt;&nbsp;<var>x<sub>j</sub></var>&nbsp;and&nbsp;<var>y<sub>i</sub></var>&nbsp;&gt;&nbsp;<var>y<sub>j</sub></var>&nbsp;for all&nbsp;<var>i &lt; j</var>. We want to have them all connected by a directed tree whose edges go toward either right (<var>x</var>&nbsp;positive) or upward (<var>y</var>&nbsp;positive). The figure below shows an example tree.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/6f9e428e-f332-4010-81ab-a8644aea5536/-/preview/" /></p>

<p style="text-align: center;">Figure 1: An example tree</p>

<p>Write a program that finds a tree connecting all given points with the shortest total length of edges.</p>

### 입력

<p>The input begins with a line that contains an integer&nbsp;<var>n</var>&nbsp;(1 &le;&nbsp;<var>n</var>&nbsp;&le; 1000), the number of points. Then&nbsp;<var>n</var>&nbsp;lines follow. The&nbsp;<var>i</var>-th line contains two integers&nbsp;<var>x<sub>i</sub></var>&nbsp;and&nbsp;<var>y<sub>i</sub></var>&nbsp;(0 &le;&nbsp;<var>x<sub>i</sub></var>,&nbsp;<var>y<sub>i</sub></var>&nbsp;&le; 10000), which give the coordinates of the&nbsp;<var>i</var>-th point.</p>

### 출력

<p>Print the total length of edges in a line.</p>
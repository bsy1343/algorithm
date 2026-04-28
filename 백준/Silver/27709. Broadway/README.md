# [Silver II] Broadway - 27709

[문제 링크](https://www.acmicpc.net/problem/27709)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 6, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

기하학, 많은 조건 분기

### 문제 설명

<p>The Manhattan in the New York City has really a nice topology. So nice, it is often idealized to a rectangular grid. If you want to go from corner A = (A<sub>x</sub>, A<sub>y</sub>) to corner B = (B<sub>x</sub>, B<sub>y</sub>), the shortest way has length |A<sub>x</sub> &minus; B<sub>x</sub>| + |A<sub>y</sub> &minus; B<sub>y</sub>|. Or so they told you in school.</p>

<p>The truth is, the correct definition of a Manhattan metric has to involve the Broadway &ndash; a road that leads across the neatly aligned system of streets and avenues. In this problem we finally correct this horrible mistake made by the mathematical community.</p>

<p>Given the two corners A = (A<sub>x</sub>, A<sub>y</sub>),B = (B<sub>x</sub>, B<sub>y</sub>) and three rational numbers P, Q, R that describe the Broadway, your task is to find the length of the shortest path between points A and B.</p>

<p>The road network consists of the following roads:</p>

<ul>
	<li>For each integer Z, there is an avenue described by the equation x = Z.</li>
	<li>For each integer Z, there is a street described by the equation y = Z.</li>
	<li>The Broadway is described by the equation Px + Qy = R.</li>
</ul>

<p>When moving from A to B, we can only move along the roads and change roads at intersections.</p>

### 입력

<p>The first line of the input file contains an integer T specifying the number of test cases. Each test case is preceded by a blank line.</p>

<p>Each test case consists of one line containing seven numbers: four integers A<sub>x</sub>, A<sub>y</sub>, B<sub>x</sub>, B<sub>y</sub> specifying the points A = (A<sub>x</sub>, A<sub>y</sub>) and B = (B<sub>x</sub>, B<sub>y</sub>), and three rational numbers P, Q, R specifying the Broadway as explained above.</p>

### 출력

<p>For each test case output a single line containing the length of the shortest path from A to B. Output a sufficient number of decimal places. Your output will be judged as correct if it has an absolute or relative error at most 10<sup>&minus;9</sup>.</p>

### 제한

<section id="input">
<p>P, Q, R is given to exactly 10 decimal places.</p>
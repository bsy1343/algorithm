# [Platinum V] Point of view in Flatland - 4275

[문제 링크](https://www.acmicpc.net/problem/4275)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

구현, 기하학, 많은 조건 분기

### 문제 설명

<p>Everything is flat in Flatland. The planets are round but they are flat, that is, they are discs in a plane.</p>

<p>The centers of three planets in Flatland are given and their radii. Find the point in Flatland from which all three planets are visible at the same angle, that is, they appear to have the same size measured as angular diameter. Let&#39;s call such a point an&nbsp;<em>isoobservation</em>&nbsp;point. There can be at most two such points and we are interested in finding the one that gives the largest angular diameter of the planets.</p>

<p>To simplify the problem you may assume that:</p>

<ul>
	<li>The discs centers are not all collinear.</li>
	<li>The discs are totally disjoint.</li>
	<li>The discs are transparent and non-refractive. That is, a disc is visible and has the same apparent shape and size, whether or not there&#39;s another disc in front of it.</li>
	<li>The input data are such that the existence or non-existence of such a point is computable, even with slight rounding error. But use double-precision, eh?</li>
</ul>

### 입력

<p>Input consists of several cases, each case is presented at a single line. Each line has nine numbers, three for each disc. Each triple has <b>x</b> and <b>y</b> coordinates of the disc center and the radius <b>r</b> of that disc. The input is terminated by a line with nine zeros and this line should not be processed.</p>

### 출력

<p>For each case of input, print the&nbsp;<b>x</b>&nbsp;and&nbsp;<b>y</b>&nbsp;coordinates of the isoobservation point as described above in the format shown in the sample; but if there is no such point, print&nbsp;&nbsp;&nbsp;<code>No solution</code></p>
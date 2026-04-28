# [Silver III] Triangle Areas (Small) - 12705

[문제 링크](https://www.acmicpc.net/problem/12705)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 99, 정답: 49, 맞힌 사람: 41, 정답 비율: 51.899%

### 분류

브루트포스 알고리즘, 기하학, 해 구성하기

### 문제 설명

<p>Ten-year-old Tangor has just discovered how to compute the area of a triangle. Being a bright boy, he is amazed by how many different ways one can compute the area. He also convinced himself that, if all the points of the triangle have integer coordinates, then the triangle&#39;s area is always either an integer or half of an integer! Isn&#39;t that nice?</p>

<p>But today Tangor is trying to go in the opposite direction. Instead of taking a triangle and computing its area, he is taking an integer&nbsp;<strong>A</strong>&nbsp;and trying to draw a triangle of area&nbsp;<strong>A</strong>/2. He restricts himself to using only the integer points on his graph paper for the triangle&#39;s vertices.</p>

<p>More precisely, the sheet of graph paper is divided into an&nbsp;<strong>N</strong>&nbsp;by&nbsp;<strong>M</strong>&nbsp;grid of square cells. The triangle&#39;s vertices may only be placed in the corners of those cells. If you imagine a coordinate system on the paper, then these points are of the form (<strong>x</strong>,&nbsp;<strong>y</strong>), where&nbsp;<strong>x</strong>&nbsp;and&nbsp;<strong>y</strong>are integers such that&nbsp;0 &le;&nbsp;<strong>x</strong>&nbsp;&le;&nbsp;<strong>N</strong>&nbsp;and&nbsp;0 &le;&nbsp;<strong>y</strong>&nbsp;&le;&nbsp;<strong>M</strong>.</p>

<p>Given the integer&nbsp;<strong>A</strong>, help Tangor find three integer points on the sheet of graph paper such that the area of the triangle formed by those points is exactly&nbsp;<strong>A</strong>/2, if that is possible. In case there is more than one way to do this, any solution will make him happy.</p>

### 입력

<p>One line containing an integer&nbsp;<strong>C</strong>, the number of test cases in the input file.</p>

<p>The next&nbsp;<strong>C</strong>&nbsp;lines will each contain three integers&nbsp;<strong>N</strong>,&nbsp;<strong>M</strong>, and&nbsp;<strong>A</strong>, as described above.</p>

<p>Limits</p>

<ul>
	<li>0 &le;&nbsp;<strong>C</strong>&nbsp;&le; 1000</li>
	<li>1 &le;&nbsp;<strong>A</strong>&nbsp;&le; 10<sup>8</sup></li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 50</li>
	<li>1 &le;&nbsp;<strong>M</strong>&nbsp;&le; 50</li>
</ul>

### 출력

<p>For each test case, output one line. If there is no way to satisfy the condition, output&nbsp;</p>

<pre>
Case #k: IMPOSSIBLE
</pre>

<p>where k is the case number, starting from 1. Otherwise, output</p>

<pre>
Case #k: x<sub>1</sub> y<sub>1</sub> x<sub>2</sub> y<sub>2</sub> x<sub>3</sub> y<sub>3</sub>
</pre>

<p>where k is the case number and (x<sub>1</sub>, y<sub>1</sub>), (x<sub>2</sub>, y<sub>2</sub>), (x<sub>3</sub>, y<sub>3</sub>) are any three integer points on the graph paper that form a triangle of area&nbsp;<strong>A</strong>/2.</p>
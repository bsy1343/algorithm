# [Gold I] Rectangles - 22219

[문제 링크](https://www.acmicpc.net/problem/22219)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 74, 정답: 8, 맞힌 사람: 8, 정답 비율: 36.364%

### 분류

기하학, 누적 합, 스위핑

### 문제 설명

<p>There are given N rectangles on the plane. Rectangle sides are parallel to coordinate axis. These rectangles may overlap, coincide or be drawn inside one another. Their vertices have non-negative integer coordinates and x coordinates do not exceed x<sub>max</sub> and y coordinates do not exceed y<sub>max</sub>.</p>

<p>A segment is started in the point A(0, 0) and ended in point B. The coordinates of the point B (the other end of the segment) satisfy the following conditions:</p>

<ul>
	<li>The coordinates of B are integer numbers;</li>
	<li>The point B belongs either to the segment [(0, y<sub>max</sub>), (x<sub>max</sub>, y<sub>max</sub>)] or to the segment [(x<sub>max</sub>, 0), (x<sub>max</sub>, y<sub>max</sub>)];</li>
</ul>

<p>The segment AB might cross rectangles (we assume that crossing takes place even if only one rectangle vertex is crossed).</p>

<p>Write a program to find a point B for which the segment AB crosses as many rectangles as possible.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/20384ff3-46d5-4b4f-85d1-2aa7bab693a1/-/preview/" style="width: 413px; height: 276px;" /></p>

<p style="text-align: center;">Example with 8 rectangles. The segment AB crosses 5 of them.</p>

### 입력

<p>The first line of the input contains three integers: x<sub>max</sub>, y<sub>max</sub> (0 &lt; x<sub>max</sub>, y<sub>max</sub> &le; 10<sup>9</sup>) and N (1 &le; N &le; 10000). Each of the following N lines contains four integers: coordinates of the bottom left corner x<sub>bl</sub> and y<sub>bl</sub> and coordinates of the top right corner x<sub>tr</sub> and y<sub>tr</sub>. Neighbouring numbers are separated by single space character.</p>

### 출력

<p>On the first and only line of the output three integer numbers should be written. First &ndash; the maximum number of crossed rectangles followed x and y coordinates of point B. Neighbouring numbers must be separated by single space character.</p>

<p>If there are several solutions, find any one of them.</p>

### 힌트

<p>Another possible solution is <code>5 22 11</code></p>
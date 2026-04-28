# [Platinum III] Cave Crisis - 4484

[문제 링크](https://www.acmicpc.net/problem/4484)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 5, 맞힌 사람: 5, 정답 비율: 33.333%

### 분류

자료 구조, 기하학, 이분 탐색, 분리 집합

### 문제 설명

<p>R2D2 was exploring a tunnel when a cave-in suddenly occurred. Oh no, is he trapped?</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/4484/p4434.png" style="height:284px; width:841px" /></p>

<p>Figure1: Overhead view of the cave crisis from the third example test case.</p>

<p>From an overhead view, we can see all the obstacles (debris) on a two-dimensional Cartesian plane. The tunnel is w cm wide, bounded by the lines y = w / 2 and y = -w / 2. R2D2 starts at (0, 0), and has a perfectly circular footprint of radius r. The exit of the tunnel lies to the right of the line x = 1000. Between R2D2 and the exit lie a number of polygonal obstacles.</p>

<p>Is it possible for R2D2 to navigate between the obstacles and make it to the exit?</p>

### 입력

<p>The input file will contain multiple test cases. Each test case begins with a single line containing an even integer w (2 &le; w &le; 1000), the width of the tunnel, and an integer N&nbsp;(0 &le; N &le; 100), the number of obstacles. The next N lines each contain the description of a single obstacle. The i<sub>th</sub> obstacle is a simple polygon, specified on a single line containing an integer n<sub>i</sub> (3 &le; n<sub>i</sub> &le; 10), the number of vertices, followed by n<sub>i</sub> pairs of integers, x<sub>ij</sub> and y<sub>ij</sub> (0 &le; x<sub>ij</sub> &le; 1000 and -w/2 &le; y<sub>ij</sub> &le; w/2 for j = 1, ..., n<sub>i</sub> ), specifying the coordinates of the vertices in counterclockwise order. Note that obstacles in the input may touch or even overlap. However, you are guaranteed that R2D2&rsquo;s initial location will not touch or overlap any obstacle. The vertices of each polygon are unique, no two nonconsecutive edges of the polygon intersect (even at their endpoints), and each polygon is guaranteed to have nonzero area. The end-of-input is denoted by an invalid test case with w = N = 0 and should not be processed.</p>

<p>&nbsp;</p>

### 출력

<p>For each input test case, you must determine the maximum radius r &gt; 0 that R2D2 could have and still be able to plan a path from his starting location (0, 0) to the tunnel exit without overlapping with any of the obstacles. You should print either this maximum radius r (rounded to two decimal places) or the message &ldquo;impossible&rdquo; if no such radius exists.</p>
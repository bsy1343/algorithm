# [Gold I] Stone Smoothing - 25792

[문제 링크](https://www.acmicpc.net/problem/25792)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 14, 맞힌 사람: 8, 정답 비율: 25.000%

### 분류

수학, 기하학, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p><img alt="" src="https://upload.acmicpc.net/760d9ee2-0609-4197-9226-64279e2d44bd/-/preview/" style="width: 132px; height: 102px; float: right;" />You found a really sharp stone that could be described as a convex polygon. You decided to use some skills to make it smoother. You can &ldquo;smooth&rdquo; a corner (vertex) of the stone (polygon) by shaving it down some amount as long as you don&rsquo;t smooth down another corner at the same time, i.e., only one corner can be smoothed at a time.</p>

<p>Note that, when one vertex (corner) is smoothed, it is replaced by two new vertices. So, if desired, these new vertices (corners) can be smoothed.</p>

<p>To make the smoothest stone, you have to ensure that the largest exterior angle of the polygon is as small as possible, after smoothing a given stone a fixed number of times.</p>

<p>Geometry Refresher: An exterior angle of a polygon is an angle at a vertex of the polygon, outside the polygon, formed by one side and the extension of an adjacent side. In other words, if the side of a polygon is extended, the angle formed outside the polygon is the exterior angle.</p>

<p>Given the shape of the stone described using xy-coordinates and the number of times the stone could be smoothed, determine the smallest possible value for the largest resulting exterior angle.</p>

### 입력

<p>The first input line contains two integers, C and S (1 &le; C &le; 5,000; 1 &le; S &le; 10<sup>9</sup>), representing (respectively) the number of corners in the stone and the number of times the stone can be smoothed. Each of the following C input lines contains two integers, the ith of which are x<sub>i</sub> and y<sub>i</sub> (-100,000 &le; x<sub>i</sub>, y<sub>i</sub> &le; 100,000), representing the x coordinate and the y coordinate of the ith corner of the stone (the vertices of the polygon are given in clockwise order).</p>

### 출력

<p>Print on a single line by itself a single floating-point number: the minimum possible value for the largest exterior angle after performing all the smoothing. Answers within 10<sup>-6</sup> absolute or relative of the expected answers will be considered correct.</p>
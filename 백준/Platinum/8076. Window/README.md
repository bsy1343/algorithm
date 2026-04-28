# [Platinum II] Window - 8076

[문제 링크](https://www.acmicpc.net/problem/8076)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 6, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

그래프 이론, 그래프 탐색, 기하학, 너비 우선 탐색

### 문제 설명

<p>We have a polygon chosen in the cartesian coordinate system. Sides of the polygon are parallel to the axes of coordinates. Every two consecutive sides are perpendicular and coordinates of every vertex are integers. We have also given a window that is a rectangle whose sides are parallel to the axes of coordinates. The interior of the polygon (but not its periphery) is coloured red. What is the number of separate red fragments of the polygon that can be seen through the window?</p>

<p>Look at the figure below:</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8076.%E2%80%85Window/130cb279.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8076/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:300px; width:273px" /></p>

<p>There are two separate fragments of the polygon that can be seen through the window.</p>

<p>Write a program that:</p>

<ul>
	<li>reads descriptions of a window and a polygon from the standard input;</li>
	<li>computes the number of separate red fragments of the polygon that can be seen through the window;</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there are four integers x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub>&nbsp;from the range [0..10,000], separated by single spaces. The numbers x<sub>1</sub>, y<sub>1</sub>&nbsp;are the coordinates of the top-left corner of the window. The numbers x<sub>2</sub>, y<sub>2</sub>&nbsp;are the coordinates of the bottom-right corner of the window.</p>

<p>The next line of the input file contains one integer n, 4 &le; n &le; 5,000, which equals the number of vertices of the polygon. In the following n&nbsp;lines there are coordinates of polygon&#39;s vertices given in anticlockwise direction, i.e. the interior of the polygon is on the left side of its periphery when we move along the sides of the polygon according to the given order. Each line contains two integers x, y&nbsp;separated by a single space, 0 &le; x &le; 10,000, 0 &le; y &le; 10,000. The numbers in the (i+2)-nd line, 1 &le; i &le; n, are coordinates of the i-th vertex of the polygon.</p>

### 출력

<p>In the first and only line of the standard input there should be one integer &mdash; the number of separate red fragments of the polygon that can be seen through the window.</p>
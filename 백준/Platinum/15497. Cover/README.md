# [Platinum V] Cover - 15497

[문제 링크](https://www.acmicpc.net/problem/15497)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 81, 정답: 50, 맞힌 사람: 49, 정답 비율: 65.333%

### 분류

다이나믹 프로그래밍, 정렬

### 문제 설명

<p>You are given N points in the coordinate system. They need to be covered with one or more rectangles, such that the following conditions are met:</p>

<ul>
	<li>The sides of each rectangle are parallel with the coordinate axes,</li>
	<li>The center of each rectangle is in the origin, i.e. point (0, 0),</li>
	<li>Each given point is located either inside of the rectangle or on its boundaries.</li>
</ul>

<p>Of course, it is possible to cover all the points using only one rectangle, but this rectangle could have a very large surface area. Our goal is to find a selection of required rectangles such that the sum of their surface areas is minimal.</p>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 5000), the number of points.</p>

<p>Each of the following N lines contains two integers X and Y (-50 000 000 &le; X, Y &le; 50 000 000, XY &ne; 0), the coordinates of each point.</p>

### 출력

<p>You must output the required minimal sum of surface areas of the rectangles.</p>

### 힌트

<p><strong>Clarification of the first test case:</strong> ​We choose the rectangle whose opposite angles are the given points, since it meets the conditions from the task.</p>

<p><strong>Clarification of the second test case:</strong> ​We choose two rectangles with their centers in the origin. The first is of dimensions 50 x 20 and covers point (25, 10). The second is of dimensions 18 x 60 and&nbsp;covers the first two points. If we wanted to cover all the points using one rectangle, it would be of dimensions 50 x 60.</p>
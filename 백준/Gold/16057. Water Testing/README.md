# [Gold III] Water Testing - 16057

[문제 링크](https://www.acmicpc.net/problem/16057)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 135, 정답: 68, 맞힌 사람: 60, 정답 비율: 48.387%

### 분류

수학, 기하학, 다각형의 넓이, 픽의 정리

### 문제 설명

<p>You just bought a large piece of agricultural land, but you noticed that &ndash; according to regulations &ndash; you have to test the ground water at specific points on your property once a year. Luckily the description of these points is rather simple. The whole country has been mapped using a Cartesian Coordinate System (where (0, 0) is the location of the Greenwich Observatory). The corners of all land properties are located at integer coordinates according to this coordinate system. Test points for ground water have to be erected on every point inside a property whose coordinates are integers.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with a single integer n (3 &le; n &le; 100 000), the number of corner points of your property;</li>
	<li>n lines each containing two integers x and y (&minus;10<sup>6</sup> &le; x, y &le; 10<sup>6</sup>), the coordinates of each corner.</li>
</ul>

<p>The corners are ordered as they appear on the border of your property and the polygon described by the points does not intersect itself.</p>

### 출력

<p>The number of points with integer coordinates that are strictly inside your property.</p>
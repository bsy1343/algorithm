# [Gold III] Cut the Cake - 30223

[문제 링크](https://www.acmicpc.net/problem/30223)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 80, 정답: 32, 맞힌 사람: 28, 정답 비율: 80.000%

### 분류

브루트포스 알고리즘, 기하학, 다각형의 넓이

### 문제 설명

<p>Geometry Refresher:</p>

<ul>
	<li>A simple polygon is a polygon that does not intersect itself and has no holes. That is, it is a flat shape consisting of straight, non-intersecting line segments or &ldquo;sides&rdquo; that are joined pairwise to form a single closed path.</li>
	<li>A polygon is convex if every line that does not contain any edge intersects the polygon in at most two points.</li>
</ul>

<p>Given a cake in the shape of simple convex polygon, we would like to cut the cake into two pieces; the single cut (straight line) must go thru two of the polygon vertices. Find the two vertices that will make the two pieces as close (in area) as possible, i.e., the difference in the area for the two pieces is the minimum.</p>

### 입력

<p>The first input line contains an integer, n (4 &le; n &le; 100), indicating the number of vertices in the polygon. This is followed by n input lines. Each of these lines provides the x and y coordinates of a vertex in the polygon (the polygon vertices will be provided in a clockwise order). Assume that all of these input values are integers between 1 and 10<sup>3</sup>, inclusive. Also assume that all the vertices are distinct.</p>

### 출력

<p>Print the difference (in area) between the largest and smallest pieces, rounded to one decimal point, e.g., 0.74 should be printed as 0.7 and 0.75 should be printed as 0.8.</p>
# [Gold I] CS Building Blueprint - 34391

[문제 링크](https://www.acmicpc.net/problem/34391)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 10, 정답: 6, 맞힌 사람: 5, 정답 비율: 55.556%

### 분류

기하학, 많은 조건 분기

### 문제 설명

<p>Mines has recently received an influx of new students who are interested in studying Computer Science (the best major on campus, naturally). To accommodate this new influx, Mines has decided to build a new Computer Science building. The building architects designed the building to be a quadrilateral, but Blaster the Burro ate the blueprints! All they have left are coordinates of the four vertices of the building. Can you determine the shape of the building they designed?</p>

### 입력

<p>The input consists of four lines of space separated integers. The two integers on each line represent the $x$ and $y$ coordinates of a point in two-dimensional Cartesian space, respectively. The four points are guaranteed to form a convex quadrilateral (that is, all interior angles are strictly less than $180^\circ$), but the points may appear in any order. The $x$ and $y$ coordinates of each point are in the range $[-1\,000, 1\,000]$.</p>

### 출력

<p>The output should be a string describing the most specific classification of the shape that the four points form. You should classify the points as forming one of the following shapes, listed in increasing order of specificity:</p>

<ul>
	<li>Quadrilateral: a polygon with four edges and four vertices</li>
	<li>Kite: a quadrilateral with two pairs of adjacent sides with equal length</li>
	<li>Trapezoid: a quadrilateral with at least one pair of opposite sides that are parallel</li>
	<li>Parallelogram: a trapezoid with two pairs of opposite sides that are parallel</li>
	<li>Rhombus: a parallelogram with four sides of equal length</li>
	<li>Rectangle: a parallelogram with four right angles</li>
	<li>Square: a rectangle with four sides of equal length</li>
</ul>
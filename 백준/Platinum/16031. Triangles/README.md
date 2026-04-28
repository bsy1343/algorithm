# [Platinum I] Triangles - 16031

[문제 링크](https://www.acmicpc.net/problem/16031)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 199, 정답: 49, 맞힌 사람: 19, 정답 비율: 26.761%

### 분류

볼록 껍질, 자료 구조, 덱, 기하학, 정렬

### 문제 설명

<p>Byteland is a nice country with n (n &ge; 3) cities, represented as n distinct points on a 2D plane. The cities are numbered from 1 to n. As a tourist, you do not know the exact locations of the cities in Byteland. From a tourist magazine you learnt that no three cities are colinear.</p>

<p>The convex hull of a set of n points is a convex polygon with the smallest possible area such that all the n points are inside or on the border of this polygon. A convex polygon has all angles less than 180 degrees and&nbsp;cannot have self-intersections.</p>

<p>Your task is to find the number of vertices on the border of the convex hull of the set of Byteland cities. You may only ask questions for triples of different numbers of cities i, j, k (1 &le; i, j, k &le; n). Such a question concerns a triangle with vertices in cities i, j, k. The answer to the question indicates if traversing the vertices of the triangle in the order i, j, k is clockwise or counterclockwise.</p>

### 입력



### 출력



### 제한

<ul>
	<li>3 &le; n &le; 40 000.</li>
	<li>You may call is_clockwise at most 1 000 000 times.</li>
</ul>
# [Silver V] Triangles of a Square - 32842

[문제 링크](https://www.acmicpc.net/problem/32842)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 42, 정답: 35, 맞힌 사람: 31, 정답 비율: 83.784%

### 분류

기하학

### 문제 설명

<p>Ashley has given Brandon a square of side $2024$. She also has drawn a single line segment that connects two different sides of the square.</p>

<p>Brandon wants to draw some additional line segments such that it is possible to decompose the square into a set of disjoint triangles, where each triangle has sides that are either subsegments of the sides of the square, or subsegments of any drawn line segment.</p>

<p>Compute the minimum number of additional line segments Brandon needs to draw to make this possible.</p>

### 입력

<p>Imagine that the square is axis-aligned with its bottom-left corner at $(0, 0)$ and top-right corner at $(2024, 2024)$.</p>

<p>Input has a single line with four integers $x_1$, $y_1$, $x_2$, $y_2$ ($0 ≤ x_1, y_1, x_2, y_2 ≤ 2024$) specifying the coordinates of the end points of the line segment initially drawn by Ashley. One end point is at $(x_1, y_1)$ and the other end point is at $(x_2, y_2)$.</p>

<p>It is guaranteed the two end points are distinct. Both end points are on sides of the square. If the segment intersects a side of the square, it does so at exactly one point.</p>

### 출력

<p>Output a single integer, the minimum number of additional line segments Brandon needs to draw.</p>
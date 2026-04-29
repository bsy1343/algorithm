# [Platinum II] Fence Fee - 32554

[문제 링크](https://www.acmicpc.net/problem/32554)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 20, 맞힌 사람: 20, 정답 비율: 46.512%

### 분류

그래프 이론, 기하학, 평면 그래프

### 문제 설명

<p>The National Crop Protection Commission (NCPC) is dedicated to supporting local farmers by offering subsidies that are proportional to the area of their crop fields. Each farmer can have several crop fields, each uniquely shaped but geometrically defined as a polygon, bounded by fences that meet only at the corners.</p>

<p>In a classic display of political bureaucracy, and to incentivize well-shaped fields, the NCPC will subsidize each crop field based on the square of its area. This, to reward well-encapsulated fields. They now require a tool that calculates the sum of the squared areas of these polygons to ensure that the subsidies are distributed fairly.</p>

### 입력

<p>The first line contains an integer $F$ ($3 \leq F \leq 1000$), the number of fence line segments. The next $F$ lines contain four integers each, $x_1$, $y_1$, $x_2$, $y_2$ ($0 \leq x_1, y_1, x_2, y_2 \leq 1000$), representing a straight-line fence section.</p>

<p>No two fence line segments intersect. Since fencing is both expensive and tedious, you may assume that every fence line segment is necessary and serves to bound fields. All fences farmers have are connected.</p>

<p>In other words, the graph that consists of endpoints and fences is planar, connected, and has no bridges.</p>

### 출력

<p>Output a single line representing the sum of the squared areas of all the fields formed by the given fence sections. Your answer will be correct if it has an absolute or relative error of at most $10^{-6}$.</p>
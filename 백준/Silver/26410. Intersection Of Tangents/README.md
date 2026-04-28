# [Silver III] Intersection Of Tangents - 26410

[문제 링크](https://www.acmicpc.net/problem/26410)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 66, 정답: 37, 맞힌 사람: 34, 정답 비율: 61.818%

### 분류

애드 혹, 기하학

### 문제 설명

<p>In this problem polygons are assumed to have no self-touchings or self-intersections.</p>

<p>A <strong>tangent</strong> to a polygon is a straight <strong>line</strong> that contains at least one point on the boundary of the polygon, and none of its interior points.</p>

<p>You are given a polygon with integer vertex coordinates. The polygon is not necessarily convex. Find a point with integer coordinates such that there exist two tangents to this polygon which both pass through this point and intersect at 90$^{\circ}$. It is guaranteed that at least one solution exists. If there are multiple solutions, output any of them.</p>

### 입력

<p>The first line of input contains a single integer $n$ ($3 \leq n \leq 1000$) --- the number of vertices in the polygon.</p>

<p>$n$ lines follow describing the vertices of the polygon. $i$-th of them contains two integers $x_i$ and $y_i$ ($-10^8 \leq x_i, y_i \leq 10^8$) --- the coordinates of $i$-th vertex. The vertices are given in counter-clockwise order.</p>

<p>The polygon has no self-touchings or self-intersections. There are no three consecutive points which lie on the same line.</p>

<p>It is guaranteed that an answer exists.</p>

### 출력

<p>Output two integers $x$ and $y$ ($-10^9 \leq x, y \leq 10^9$) --- the coordinates of the point you found.</p>

### 힌트

<p>Images for samples and some random photo.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/52d43fd3-9e6f-4560-b12e-69eb28408b9a/-/preview/" /></p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/afb47d22-9120-45a6-8046-231679de2726/-/preview/" /></p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c3d92415-b41f-4d56-966a-ef0f52ff9f60/-/preview/" /></p>
# [Gold IV] Polylops - 4424

[문제 링크](https://www.acmicpc.net/problem/4424)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 18, 맞힌 사람: 15, 정답 비율: 62.500%

### 분류

애드 혹, 기하학, 구현

### 문제 설명

<p>Given the vertices of a non-degenerate polygon (no 180-degree angles, zero-length sides, or self-intersection - but not necessarily convex), you must determine how many distinct lines of symmetry exist for that polygon. A line of symmetry is one on which the polygon, when reflected on that line, maps to itself.</p>

<p>&nbsp;</p>

### 입력

<p>Input consists of a description of several polygons.</p>

<p>Each polygon description consists of two lines. The first contains the integer &quot;n&quot; (3&lt;=n&lt;=1000), which gives the number of vertices on the polygon. The second contains &quot;n&quot; pairs of numbers (an x- and a y-value), describing the vertices of the polygon in order. All coordinates are integers from -1000 to 1000.</p>

<p>Input terminates on a polygon with 0 vertices.</p>

### 출력

<p>For every polygon described, print out a line saying &quot;Polygon #x has y symmetry line(s).&quot;, where x is the number of the polygon (starting from 1), and y is the number of distinct symmetry lines on that polygon.</p>

<p>&nbsp;</p>
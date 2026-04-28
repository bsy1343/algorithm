# [Platinum I] Cut out - 22781

[문제 링크](https://www.acmicpc.net/problem/22781)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 4, 맞힌 사람: 4, 정답 비율: 17.391%

### 분류

볼록 껍질, 기하학, 3차원 기하학, 삼분 탐색

### 문제 설명

<p>You are given a 3-dimensional convex polyhedron, and required to find its cut vertical to z-axis that maximizes the area of the resulting section.</p>

### 입력

<p>There are multiple test cases in the input. Each test case begins with a single integer n (n &le; 20), the number of faces of the polyhedron. The following n lines are the description of the faces. Each line is given in the format below.</p>

<pre>
m x<sub>1</sub> y<sub>1</sub> z<sub>1</sub> x<sub>2</sub> y<sub>2</sub> z<sub>2</sub> . . . x<sub>m</sub> y<sub>m</sub> z<sub>m</sub></pre>

<p>m (3 &le; m &lt; 20) is the number of vertices of the polygonal face. x<sub>i</sub>, y<sub>i</sub> and z<sub>i</sub> are the integral coordinates of the i-th vertex (0 &le; x<sub>i</sub>, y<sub>i</sub>, z<sub>i</sub> &lt; 10000). The distance between every pair of vertices is greater than 0.01.</p>

<p>The end of input is indicated by a line containing only a single zero.</p>

<p>It is guaranteed that a set of polygons given as a test case forms a convex polyhedron.</p>

### 출력

<p>Output the area of the largest cutting plane in one line for each test case. The area may have an arbitrary number of digits after the decimal point, but should not contain an error greater than 10<sup>&minus;5</sup>.</p>
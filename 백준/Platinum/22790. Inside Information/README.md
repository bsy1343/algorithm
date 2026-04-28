# [Platinum III] Inside Information - 22790

[문제 링크](https://www.acmicpc.net/problem/22790)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 60, 정답: 8, 맞힌 사람: 4, 정답 비율: 12.500%

### 분류

문자열, 애드 혹, 기하학, 이분 탐색, 파싱, 볼록 다각형 내부의 점 판정

### 문제 설명

<p>You are given the vertices of a simple, convex polygon. &ldquo;Simple&rdquo; means that there are no crossing or overlapping edges. &ldquo;Convex&rdquo; means that, as you walk around the polygon, you keep moving consistently clockwise (or counterclockwise) relative to any point strictly inside the polygon. You are also given a set of points. Your task is to find the number of those points that are enclosed by the polygon. Points are &ldquo;enclosed&rdquo; if they are inside the polygon, or lie on an edge, or are coincident with a polygon vertex. All points and polygon vertices lie on an integer grid, with absolute coordinate values being less than 1000.</p>

### 입력

<p>There will be one or more data sets in the input file. Each data set contains:</p>

<ul>
	<li>First line: the number of vertices (n, with 3 &le; n &le; 100), and the number of points (m, with 1 &le; m &le; 100)</li>
	<li>Next n lines: x- and y-coordinates of polygon vertices in either clockwise or counterclockwise order.</li>
	<li>Next m lines: x- and y-coordinates of points.</li>
</ul>

<p>The last data set contains 0 0 for the first line, and is not to be processed.</p>

### 출력

<p>For each data set, print the number of the set, where the first set is set 1, and the number of points enclosed.</p>
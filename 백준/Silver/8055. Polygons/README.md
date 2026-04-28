# [Silver II] Polygons - 8055

[문제 링크](https://www.acmicpc.net/problem/8055)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 72, 정답: 26, 맞힌 사람: 21, 정답 비율: 42.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 게임 이론

### 문제 설명

<p>Two players take part in the game polygons. A convex polygon with n vertices divided by n-3 diagonals into n-2 triangles is necessary. These diagonals may intersect in vertices of the polygon only. One of the triangles is black and the remaining ones are white. Players proceed in alternate turns. Each player, when its turn comes, cuts away one triangle from the polygon. Players are allowed to cut off triangles along the given diagonals. The winner is the player who cuts away the black triangle.</p>

<p>NOTE: We call a polygon convex if a segment joining any two points of the polygon is contained in the polygon.</p>

<p>
Write a program which:</p>

<ul>
	<li>reads from the standard input the description of the polygon,</li>
	<li>verifies whether the player who starts the game has a winning strategy,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input contains an integer n, 4 &le; n &le; 50,000. This is the number of vertices in the polygon. The vertices of the polygon are numbered, clockwise, from 0 to n-1. The next n-2 lines comprise descriptions of triangles in the polygon. In the i+1-th line, 1 &le; i &le; n-2, there are three non-negative integers a, b, c separated by single spaces. Theses are numbers of vertices of the i-th triangle. The first triangle in a sequence is black.</p>

<p>&nbsp;</p>

### 출력

<p>The standard output should have one line with the word:</p>

<ul>
	<li>TAK (means &quot;yes&quot; in Polish), if the player, who starts the game has a winning strategy,</li>
	<li>NIE (means &quot;no&quot; in Polish), if he does not have a winning strategy.</li>
</ul>
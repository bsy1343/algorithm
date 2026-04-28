# [Platinum III] MONO - 2868

[문제 링크](https://www.acmicpc.net/problem/2868)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 38, 정답: 5, 맞힌 사람: 5, 정답 비율: 14.706%

### 분류

자료 구조, 스위핑

### 문제 설명

<p>Mirko soon realised that number sequences are not the best career choice, and went right back to letter-table business.</p>

<p>Mirko&rsquo;s table has R rows and C columns and consists of lowercase letters.&nbsp;</p>

<p>Each cell of the table is a square of equal size. We assign coordinates to vertices of those squares, so that upper-left corner of the table has coordinates (0, 0), upper-right (C,0), lower-left (0, R), and lower-right (C, R).</p>

<p>We say that polygon within the table is monoliteral if the following holds:&nbsp;</p>

<ol>
	<li>its vertices are from the described set of cell-square vertices,&nbsp;</li>
	<li>its edges are parallel to coordinate axes,&nbsp;</li>
	<li>all letters inside the polygon are equal.&nbsp;</li>
</ol>

<p>A simple polygon for which first two conditions are true (third one may or may not be true) is given. Mirko would like to know the number of monoliteral polygons that can be obtained by moving the given one up, down, left, or right or any combination thereof, but not rotating.&nbsp;</p>

### 입력

<p>The first line of input contains two space seperated integers R and C (1 &le; R, C &le; 500).&nbsp;</p>

<p>Each of the next R lines contains exactly C lowercase letters, this is Mirko&rsquo;s table.&nbsp;</p>

<p>The following line contains integer V (4 &le; V &le; 500), number of vertices of given polygon.&nbsp;</p>

<p>Each of the next V lines contains two integers X, Y (0 &le; X &le; C, 0 &le; Y &le; R). These are the coordinates of the vertices of the given polygon. Vertices are given in clockwise order.&nbsp;</p>

<p>The given polygon will satisfy conditions 1 and 2 from above.&nbsp;</p>

### 출력

<p>In the first and only line of output, print expected number of polygons.&nbsp;</p>
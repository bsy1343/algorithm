# [Platinum IV] Scaled Triangle (Small) - 12671

[문제 링크](https://www.acmicpc.net/problem/12671)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 9, 정답: 9, 맞힌 사람: 9, 정답 비율: 100.000%

### 분류

수학, 기하학, 선형대수학, 가우스 소거법

### 문제 설명

<p>You are given two triangle-shaped pictures. The second picture is a possibly translated, rotated and scaled version of the first. The two triangles are placed on the table, with the second one placed completely inside (possibly touching the boundary of) the first one. The second triangle is always scaled by a factor that is strictly between 0 and 1.</p>

<p>You need to process the picture, and for that you need a point in the picture which overlaps with the same point of the scaled picture. If there is more than one solution, you can return any of them. If there are no solutions, print &quot;No Solution&quot; (without the quotes) for that test case.</p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>N</strong>. Then for each test case, there will be two lines, each containing six space-separated integers -- the coordinates of one of the triangles -- in the format &quot;x<sub>1</sub>&nbsp;y<sub>1</sub>&nbsp;x<sub>2</sub>&nbsp;y<sub>2</sub>&nbsp;x<sub>3</sub>&nbsp;y<sub>3</sub>&quot;. The point (x<sub>1</sub>, y<sub>1</sub>) in the first triangle corresponds to the same corner of the picture as (x<sub>1</sub>, y<sub>1</sub>) in the second triangle, and similarly for (x<sub>2</sub>, y<sub>2</sub>) and (x<sub>3</sub>, y<sub>3</sub>).</p>

<p>Limits</p>

<ul>
	<li>1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 10.</li>
	<li>The coordinates of the points will be integer numbers between -10 000 and 10 000. The three points in each triangle will not be collinear.</li>
	<li>All tests will contain isosceles right-angle triangles. (i.e., the triangle&#39;s angles will be 45 degrees, 45 degrees, and 90 degrees.)</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>x</strong>: &quot; followed two real numbers representing the coordinates of the overlapping point separated by one space character, or the string &quot;No Solution&quot;. Answers with a relative or absolute error of at most 10<sup>-5</sup>&nbsp;will be considered correct.</p>
# [Gold III] Meltdown - 4171

[문제 링크](https://www.acmicpc.net/problem/4171)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

삼분 탐색

### 문제 설명

<p>A polygon is lowered at a constant speed of v metres per minute from the air into a liquid that dissolves it at a constant speed of c metres per minute from all sides. Given a point (x,y) inside the polygon that moves with the polygon, determine when the liquid reaches the point.</p>

<p>The border between air and liquid always has y-coordinate 0, and the liquid only eats away from the sides of the polygon in 2 dimensions. The polygon does not rotate as it is lowered into the liquid, and at time 0, it is not touching the liquid.</p>

<p>Unlike the polygon, which is flat (2-dimensional), the liquid exists in three dimensions. Therefore, the liquid seeps into cavities in the polygon. For example, if the polygon is &quot;cup-shaped&quot;, the liquid can get &quot;inside&quot; the cup, as in the diagram below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4171.%E2%80%85Meltdown/9bdaaddb.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4171.%E2%80%85Meltdown/9bdaaddb.png" data-original-src="https://www.acmicpc.net/upload/images2/Ddiag.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:125px; width:150px" /></p>

### 입력

<p>The input consists of several test cases.</p>

<p>The first line of each test case contains the five integers N, x, y, v, and c, where 3 &lt;= N &lt;= 30, -100 &lt;= x &lt;= 100, 1 &lt;= y &lt;= 100, and 1 &lt;= c &lt; v &lt;= 10.</p>

<p>The following N lines of the test case each contain one vertex of the polygon. The ith line contains the two integers x, y, where -100 &lt;= x &lt;= 100, 1 &lt;= y &lt;= 100.</p>

<p>The vertices of the polygon are given in counter-clockwise order. The border of the polygon does not intersect or touch itself, and the point (x,y) lies strictly inside the polygon&mdash;it does not lie on the border of the polygon.</p>

<p>Input is terminated by a line containing 0 0 0 0 0. These zeros are not a test case and should not be processed.</p>

### 출력

<p>For each test case, output the first time in minutes that the liquid reaches the specified point, rounded to four decimal places.</p>
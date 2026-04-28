# [Silver I] Munching - 6189

[문제 링크](https://www.acmicpc.net/problem/6189)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 319, 정답: 198, 맞힌 사람: 167, 정답 비율: 64.231%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Bessie loves her grass and loves to hurry to the barn for her evening milking session. She has partitioned the pasture into a rectilinear grid of R (1 &lt;= R &lt;= 100) rows and C (1 &lt;= C &lt;= 100) columns and marked the squares as grass or rocky (she can&#39;t eat rocks and won&#39;t even go into those squares). Bessie starts on her map at location R_b,C_b and wishes to munch her way, square by square, to the barn at location 1,1 by the shortest route possible. She moves from one square to any one of the potentially four adjacent squares.</p>

<p>Below is the original map [with rocks (&#39;*&#39;), grass (&#39;.&#39;), the barn (&#39;B&#39;), and Bessie (&#39;C&#39; for cow) at row 5, col 6] and a route map with the optimal route marked with munches (&#39;m&#39;):</p>

<pre>
           Map               Optimal Munched Route
        1 2 3 4 5 6  &lt;-col      1 2 3 4 5 6  &lt;-col
      1 B . . . * .           1 B m m m * .
      2 . . * . . .           2 . . * m m m
      3 . * * . * .           3 . * * . * m
      4 . . * * * .           4 . . * * * m
      5 * . . * . C           5 * . . * . m</pre>

<p>Bessie munched 9 squares.</p>

<p>Given a map, determine how many squares Bessie will eat on her shortest route to the barn (there&#39;s no grass to eat on the barn&#39;s square).</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: R and C</li>
	<li>Lines 2..R+1: Line i+1 describes row i with C characters (and no spaces) as described above</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the number of squares of grass that Bessie munches on the shortest route back to the barn</li>
</ul>
# [Gold IV] Trapped - 27099

[문제 링크](https://www.acmicpc.net/problem/27099)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 50, 정답: 20, 맞힌 사람: 20, 정답 비율: 45.455%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 격자 그래프

### 문제 설명

<p>Consider a maze marked with row and column numbers:</p>

<pre>
   1 2 3 4 5 6 7
  +-+-+-+-+-+-+-+
1 |           |
  + +-+-+-+-+-+ +
2 |             |
  + +-+-+-+-+-+ +
3 | |   |   | | |
  + +-+ + +-+ + +
4 | |     |     |
  +-+-+-+-+-+-+-+</pre>

<p>This maze has one exit (right hand side, first row).  It is possible to reach the exit from many locations in the maze but not all of them (for instance, row 4, column 2).</p>

<p>Your task is to decide how many cells are isolated from an exit.</p>

### 입력

<ul>
	<li>Line 1: two space-separated integers R,C (1 &le; R,C &le; 35) that tell the number of rows and columns for the maze</li>
	<li>Lines 2..2*R+2: An ASCII map of the matrix just as above.  Walls are marked by &#39;_&#39; and &#39;|&#39;.  Wall intersections (and potential wall intersections) are marked by &#39;+&#39;.</li>
</ul>

### 출력

<p>On a single line, output one integer that tells the number of cells from which one can not find a way to exit the maze.</p>
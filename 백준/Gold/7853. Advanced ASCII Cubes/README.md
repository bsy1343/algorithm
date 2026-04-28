# [Gold V] Advanced ASCII Cubes - 7853

[문제 링크](https://www.acmicpc.net/problem/7853)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 56, 정답: 53, 맞힌 사람: 46, 정답 비율: 97.872%

### 분류

구현

### 문제 설명

<p>The table surface is divided into N by M square cells. Some cubes are stacked one upon another over the cells, forming towers. For each cell the number of cubes stacked over it is given in the matrix A.</p>

<p>Your program must output the view of the table in ASCII graphics, where each cube is represented as shown below:&nbsp;</p>

<pre>
  +---+
 /   /|
+---+ |
|   | +
|   |/
+---+</pre>

<p>(here the characters used are &#39;<code>+</code>&#39;, &#39;<code>-</code>&#39;, &#39;<code>/</code>&#39;, &#39;<code>|</code>&#39;, their ASCII codes are ASCII 43, 45, 47, 124)</p>

<p>The dot (ASCII 46) must be used as a background.&nbsp;</p>

### 입력

<p>Input file contains integers N M, followed by matrix A, row-by-row. The first row describes the cube tower furthest from the viewer, left to right, and the last row &mdash; nearest to the viewer.&nbsp;</p>

### 출력

<p>Output file must contain a string representation of the table view, with minimal number of lines required to show all cubes. Each line must contain a string of equal length, which is the minimal width required to show all cubes.&nbsp;</p>

### 제한

<ul>
	<li>1 &le; N, M, A<sub>ij</sub> &le; 40</li>
</ul>
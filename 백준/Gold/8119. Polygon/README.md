# [Gold IV] Polygon - 8119

[문제 링크](https://www.acmicpc.net/problem/8119)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 21, 맞힌 사람: 18, 정답 비율: 94.737%

### 분류

깊이 우선 탐색, 그래프 이론, 그래프 탐색, 재귀

### 문제 설명

<p>We are given a convex polygon P&nbsp;of&nbsp;n&nbsp;sides (where 3 &lt; n &le; 5,000) and k&nbsp;its distinct diagonals not crossing one another inside the polygon. (The only point that two distinct diagonals may share is a vertex of the polygon.) Vertices of the polygon are numbered successively from 1&nbsp;to n&nbsp;counterclockwise. All the diagonals divide P&nbsp;into smaller convex polygons whose interiors do not intersect.</p>

<p>Four diagonals: 1-8, 8-3, 3-1 and 3-6 divide the polygon P&nbsp;shown in the picture below into two quadrilaterals and three triangles.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8119.%E2%80%85Polygon/121b27bd.gif" data-original-src="%EB%B0%B1%EC%A4%80/Gold/8119.%E2%80%85Polygon/121b27bd.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8119/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 323px; height: 326px;" /></p>

<p>Write a program that:</p>

<ul>
	<li>reads a description of the polygon P&nbsp;and its diagonals from the standard input,</li>
	<li>calculates the maximal number of sides of a polygon among the polygons created by the division of P&nbsp;by the given diagonals,</li>
	<li>writes the result in the standard output.</li>
</ul>

### 입력

<p>In each line of the standard input two positive integers separated by a single space are written.</p>

<p>In the first line there is the number of vertices n&nbsp;of the polygon and the number of diagonals k.</p>

<p>In each of the following k&nbsp;lines there is a description of one diagonal of the polygon in the form of a pair of positive integers. These integers are the numbers of the vertices of the polygon the diagonal joins. Just after the second number there is the end of the line.</p>

<p>The data in the standard input are written correctly and your program need not verify that.</p>

### 출력

<p>In the standard output one should write one positive integer - the maximal number of sides of a convex polygon created by the division of the given polygon P.</p>
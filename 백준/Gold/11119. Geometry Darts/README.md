# [Gold IV] Geometry Darts - 11119

[문제 링크](https://www.acmicpc.net/problem/11119)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 112, 정답: 42, 맞힌 사람: 39, 정답 비율: 38.235%

### 분류

구현, 기하학

### 문제 설명

<p>Bob and Hannah like to play darts. They are not very good at it, however, so finishing a round of 501 Darts will take an eternity. They therefore decide to throw away the dartboard completely and put geometric shapes on the wall instead, awarding points according to the number of shapes the dart penetrates. To reduce the complexity of scoring, they only use circles, triangles and rectangles.</p>

<p>A game consists of each person throwing 3 darts each, and your job is to find the winner of the game, given the shapes and the throws.</p>

### 입력

<p>The input will start with a line giving the total number of shapes, S. Then follow S lines describing the shapes, in either of the following formats:</p>

<p>C x y r, where (x, y) is the center of the circle, and r is the radius.<br />
R x<sub>1</sub> y<sub>1</sub> x<sub>2</sub> y<sub>2</sub>, where (x<sub>1</sub>, y<sub>1</sub>) and (x<sub>2</sub>, y<sub>2</sub>) are two corners of the rectangle with x<sub>1</sub> &lt; x<sub>2</sub> and y<sub>1</sub> &lt; y<sub>2</sub>.<br />
T x<sub>1</sub>&nbsp;y<sub>1</sub>&nbsp;x<sub>2</sub>&nbsp;y<sub>2</sub> x<sub>3</sub> y<sub>3</sub>, where (x<sub>i</sub>, y<sub>i</sub>) are the three corners of the triangle.&nbsp;</p>

<p>Then follows a line with N, the number of games Bob and Hannah play. Each game is described with six lines giving the x and y coordinates of the 6 throws, the first three by Bob and the last three by Hannah.</p>

<ul>
	<li>0 &lt; S &le; 1000</li>
	<li>0 &lt; N &le; 1000</li>
	<li>All rectangles have sides parallell to the x- and y-axis.</li>
	<li>For triangle specifications, the three points will never be collinear.</li>
	<li>All coordinates are given with double precision, with up to 6 decimals after the decimal points.</li>
	<li>All shapes are bounded by the rectangle defined by the two points (&minus;1000, &minus;1000) and (1000, 1000).</li>
	<li>All throws are guaranteed to be at least 10<sup>&minus;6</sup> away from any shape boundary.</li>
</ul>

### 출력

<p>Output the name of the winner on a separate line for each game, or Tied if there is a tie.</p>
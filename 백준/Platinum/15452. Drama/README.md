# [Platinum II] Drama - 15452

[문제 링크](https://www.acmicpc.net/problem/15452)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 13, 맞힌 사람: 11, 정답 비율: 91.667%

### 분류

다이나믹 프로그래밍, 생성 함수

### 문제 설명

<p>Vera has a grid with H rows and N columns. Rows are numbered 1 to H and columns are numbered 1 to N. Let the cell in the r-th row and c-th column be (r, c). Cells are coloured white or black. A colouring is a pyramid if:</p>

<ul>
	<li>Exactly N cells are black.</li>
	<li>(1, 1) is black.</li>
	<li>If (r, a) and (r, b) are black, then (r, k) is black for a &lt; k &lt; b.</li>
	<li>If (r, c) is black, then (r &minus; 1, c), if it exists, is black.</li>
	<li>If (r, c) is black and there is no k &lt; c such that (r, k) is black, then (r + 1, c), if it exists, is white.</li>
</ul>

<p>Two pyramids are different if there is a cell that is white in one pyramid and black in the other. Compute the number of different pyramids modulo 10<sup>9</sup> + 7.</p>

### 입력

<p>Line 1 contains integers H and N (1 &le; H, N &le; 10<sup>5</sup>).</p>

### 출력

<p>Print one line with one integer, the number of different pyramids modulo 10<sup>9</sup> + 7.</p>

### 힌트

<p>For the first example, the seven pyramids are:</p>

<pre>
###### ####.. ####.. #####. #####. #####. #####.
...... .##... ..##.. .#.... ..#... ...#.. ....#.</pre>
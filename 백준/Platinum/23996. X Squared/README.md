# [Platinum V] X Squared - 23996

[문제 링크](https://www.acmicpc.net/problem/23996)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 138, 정답: 41, 맞힌 사람: 39, 정답 비율: 31.707%

### 분류

애드 혹

### 문제 설명

<p>The hot new toy for this year is called &quot;X Squared&quot;. It consists of a square&nbsp;<b>N</b>&nbsp;by&nbsp;<b>N</b>&nbsp;grid of tiles, where&nbsp;<b>N</b>&nbsp;is odd. Exactly 2 &times;&nbsp;<b>N</b>&nbsp;- 1 of the tiles are labeled with an&nbsp;<code>X</code>, and the rest are blank (which we will represent with the&nbsp;<code>.</code>&nbsp;character). In each move of the game, the player can either choose and exchange two rows of tiles, or choose and exchange two columns of tiles. The goal of the game is to get all of the&nbsp;<code>X</code>&nbsp;tiles to be on the two main diagonals of the grid, forming a larger X shape, as in the following example for&nbsp;<b>N</b>&nbsp;= 5:</p>

<pre>
<code>X...X
.X.X.
..X..
.X.X.
X...X</code></pre>

<p>You are about to play with your X Squared toy, which is not yet in the goal state. You suspect that your devious younger sibling might have moved some of the tiles around in a way that has broken the game. Given the current configuration of the grid, can you determine whether it is possible to win or not?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each one begins with one line with an integer&nbsp;<b>N</b>, the size of the grid.&nbsp;<b>N</b>&nbsp;more lines with&nbsp;<b>N</b>&nbsp;characters each follow; the j-th character on the i-th of these lines is&nbsp;<code>X</code>&nbsp;if the tile in the i-th row and j-th column of the grid has an X, or&nbsp;<code>.</code>&nbsp;if that tile is blank.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is&nbsp;<code>POSSIBLE</code>&nbsp;if it is possible to win, and&nbsp;<code>IMPOSSIBLE</code>&nbsp;otherwise.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li><b>N</b>&nbsp;mod 2 = 1. (<b>N</b>&nbsp;is odd.)</li>
	<li>The grid has exactly 2 &times;&nbsp;<b>N</b>&nbsp;- 1&nbsp;<code>X</code>&nbsp;tiles and exactly&nbsp;<b>N</b><sup>2</sup>&nbsp;- 2 &times;&nbsp;<b>N</b>&nbsp;+ 1&nbsp;<code>.</code>&nbsp;tiles.</li>
	<li>The grid is not already in the goal state, as described in the problem statement.</li>
</ul>

### 힌트

<p>In Sample Case #1, one winning strategy is:</p>

<ol>
	<li>Swap the top row with the middle row.</li>
	<li>Swap the rightmost column with the middle column.</li>
</ol>

<pre>
 ..X    XX.    X.X
 XX. -&gt; ..X -&gt; .X.
 XX.    XX.    X.X
</pre>

<p>In Sample Case #2, no sequence of moves can turn the grid into the desired final configuration.</p>
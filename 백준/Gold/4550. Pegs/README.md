# [Gold III] Pegs - 4550

[문제 링크](https://www.acmicpc.net/problem/4550)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 51, 정답: 19, 맞힌 사람: 16, 정답 비율: 33.333%

### 분류

브루트포스 알고리즘, 자료 구조, 다이나믹 프로그래밍

### 문제 설명

<p>Peg games may be played on a variety of boards, but the goal is always the same, to end the game with as few pegs on the board as possible. This is accomplished by making a sequence of moves, where one peg &#39;jumps&#39; an adjacent peg to the empty space on the opposite side. Pegs which are jumped by other pegs are immediately removed.</p>

<p>Given the starting configuration of a peg board, your program should determine the number of pegs that will remain on the board if the player makes the best possible sequence of moves.</p>

<p>One standard peg board is a 5x5 cross (shown below with periods indicating empty peg holes and pound signs indicating non-playable space). Figure A shows an empty board. Figure B shows a board with five pegs, indicated by lower-case letter os. and Figure C shows the result of an optimal sequence of moves from Figure B&#39;s starting position. Note that this ends with 1 peg, the best possible result for any game. Also note that the optimal sequence of moves used to generate Figure C is not unique; there are at least two sets of moves that leave only one peg.</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<td>
			<pre>
#...#
.....
.....
.....
#...#
</pre>
			</td>
			<td>
			<pre>
#.o.#
..o..
oo.o.
.....
#...#
</pre>
			</td>
			<td>
			<pre>
#...#
.....
...o.
.....
#...#
</pre>
			</td>
		</tr>
	</tbody>
	<tfoot>
		<tr>
			<th>Figure A</th>
			<th>Figure B</th>
			<th>Figure C</th>
		</tr>
	</tfoot>
</table>

<p>Note that not all of the peg boards given to you will be the same shape! They will all be 5x5, and will all have at least one peg, at least one empty cell, and at least four non-playable spaces, but the layout may differ drastically from the above.</p>

### 입력

<p>Input to this problem will begin with a line containing a single integer n indicating the number of boards that require analysis. The following 5n lines contain the boards. Each board has a representation like that in the figure above, with a period (.) representing an empty space, lower case o representing a peg, and # representing a non-playable space.</p>

### 출력

<p>For each board in the input, print the message &quot;The best case ends with Y pegs.&quot; where Y is replaced with the number of pegs remaining after an optimal set of jumps.</p>
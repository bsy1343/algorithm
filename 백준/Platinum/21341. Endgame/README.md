# [Platinum I] Endgame - 21341

[문제 링크](https://www.acmicpc.net/problem/21341)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 329, 정답: 103, 맞힌 사람: 80, 정답 비율: 28.070%

### 분류

중간에서 만나기, 무작위화

### 문제 설명

<p>The boardgame Chaos is an exotic variant of Chess, played by two players in alternating turns on an $n\times n$ playing board. All pieces have the same set of $n$ valid moves which are agreed on ahead of the game.</p>

<p>In a single turn a player can pick exactly one of their pieces and perform one of the following actions:</p>

<ul>
	<li>Perform up to two valid moves using the chosen piece, capturing any piece that the chosen piece lands on along the way.</li>
	<li>Teleport the chosen piece to any cell on the board that is not already occupied by another piece.</li>
	<li>Leave the chosen piece untouched in its current cell.</li>
</ul>

<p>Having recently discovered Chaos, Alice and Bob are currently in the endgame of a very exciting match. Each player has a single piece left on the board and there are only two turns left, with Alice going next.</p>

<p>Having analysed the situation, she realises that the only way she can win is to capture Bob&#39;s piece in her turn. If that is not possible, Alice may be able to force a tie if she can teleport her piece to a cell that Bob cannot capture in his turn. Otherwise Bob will be able to win by capturing Alice&#39;s piece, no matter what she does in her turn. Help Alice determine her optimal outcome.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($2 \leq n \leq 10^5$), the size of the playing board and the number of valid moves.</li>
	<li>One line with two integers $a_x$ and $a_y$ ($1 \leq a_x, a_y \leq n$), the column and row in which Alice&#39;s piece is currently located.</li>
	<li>One line with two integers $b_x$ and $b_y$ ($1 \leq b_x, b_y \leq n$), the column and row in which Bob&#39;s piece is currently located.</li>
	<li>$n$ lines, the $i$th of which contains two integers $x_i$ and $y_i$ ($-n &lt; x_i, y_i &lt; n$) representing one of the valid moves. This moves the given piece $x_i$ columns to the right and $y_i$ rows up, provided this does not take the piece outside of the board.</li>
</ul>

<p>Columns are numbered $1$ to $n$ from left to right and rows are numbered $1$ to $n$ from bottom to top. All valid moves are distinct.</p>

### 출력

<p>If Alice can capture Bob&#39;s piece in her turn, output &quot;<code>Alice wins</code>&quot;.</p>

<p>If Alice can use her turn to force a tie by teleporting her piece to a cell that Bob cannot capture in his turn output &quot;<code>tie</code>&quot; followed by two integers $a&#39;_x$ and $a&#39;_y$, the location of any such cell. If there are multiple valid solutions, you may output any one of them.</p>

<p>Otherwise, if Bob is able to capture Alice&#39;s piece no matter what she does in her turn, output &quot;<code>Bob wins</code>&quot;.</p>
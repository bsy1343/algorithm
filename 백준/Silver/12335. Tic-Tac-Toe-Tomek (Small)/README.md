# [Silver IV] Tic-Tac-Toe-Tomek (Small) - 12335

[문제 링크](https://www.acmicpc.net/problem/12335)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 149, 정답: 106, 맞힌 사람: 88, 정답 비율: 73.333%

### 분류

구현

### 문제 설명

<p>Tic-Tac-Toe-Tomek is a game played on a 4 x 4 square board. The board starts empty, except that a single &#39;T&#39; symbol may appear in one of the 16 squares. There are two players: X and O. They take turns to make moves, with X starting. In each move a player puts her symbol in one of the empty squares. Player X&#39;s symbol is &#39;X&#39;, and player O&#39;s symbol is &#39;O&#39;.</p>

<p>After a player&#39;s move, if there is a row, column or a diagonal containing 4 of that player&#39;s symbols, or containing 3 of her symbols and the &#39;T&#39; symbol, she wins and the game ends. Otherwise the game continues with the other player&#39;s move. If all of the fields are filled with symbols and nobody won, the game ends in a draw. See the sample input for examples of various winning positions.</p>

<p>Given a 4 x 4 board description containing &#39;X&#39;, &#39;O&#39;, &#39;T&#39; and &#39;.&#39; characters (where &#39;.&#39; represents an empty square), describing the current state of a game, determine the status of the Tic-Tac-Toe-Tomek game going on. The statuses to choose from are:</p>

<ul>
	<li>&quot;X won&quot; (the game is over, and X won)</li>
	<li>&quot;O won&quot; (the game is over, and O won)</li>
	<li>&quot;Draw&quot; (the game is over, and it ended in a draw)</li>
	<li>&quot;Game has not completed&quot; (the game is not over yet)</li>
</ul>

<p>If there are empty cells, and the game is not over, you should output &quot;Game has not completed&quot;, even if the outcome of the game is inevitable.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each test case consists of 4 lines with 4 characters each, with each character being &#39;X&#39;, &#39;O&#39;, &#39;.&#39; or &#39;T&#39; (quotes for clarity only). Each test case is followed by an empty line.</p>

<p>Limits</p>

<ul>
	<li>The game board provided will represent a valid state that was reached through play of the game Tic-Tac-Toe-Tomek as described above.</li>
	<li><span style="line-height:1.6em">1 &le; </span><strong style="line-height:1.6em">T</strong><span style="line-height:1.6em"> &le; 10.</span></li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is one of the statuses given above. Make sure to get the statuses exactly right. When you run your code on the sample input, it should create the sample output exactly, including the &quot;Case #1: &quot;, the capital letter &quot;O&quot; rather than the number &quot;0&quot;, and so on.</p>

### 힌트

<p>Note</p>

<p>Although your browser might not render an empty line after the last test case in the sample input, in a real input file there would be one.</p>
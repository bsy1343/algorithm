# [Platinum I] Puzzle - 7051

[문제 링크](https://www.acmicpc.net/problem/7051)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 70, 정답: 9, 맞힌 사람: 7, 정답 비율: 14.286%

### 분류

애드 혹, 해 구성하기, 구현

### 문제 설명

<p>The king of Byteland has received a gift, a jigsaw puzzle. The puzzle consists of a board of size n&times;n. The field in the i-th row and j-th column (1 &le; i, j &le; n) has coordinates (i, j) and contains a piece with the number p(i, j), 1 &le; p(i, j) &le; n<sup>2</sup>. Each of the numbers 1 ... n<sup>2</sup> appears on exactly one of the pieces.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7051.%E2%80%85Puzzle/aa442a86.png" data-original-src="https://upload.acmicpc.net/aa71a13b-4c0c-4273-bb16-f9a60cc6fbb3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 218px; height: 225px;" /></p>

<p style="text-align: center;">Coordinates of the fields</p>

<p>To solve the puzzle, you have to put the pieces in order, so that for each 1 &le; i, j &le; n the field (i, j) contains the piece with number j + (i - 1)&nbsp;&times; n.</p>

<p>The following moves are allowed to solve the puzzle:</p>

<ul>
	<li>a cyclic shift of all pieces in a row a certain number of fields to the right,</li>
	<li>a cyclic shift of all pieces in a column a certain number of fields down.</li>
</ul>

<p>The king of Byteland managed to solve his puzzle, but he is not sure if he would be able to solve it starting from a different initial configuration. Help him to solve this problem.</p>

<p>Write a program that:</p>

<ul>
	<li>Reads from the standard input the description of the initial configurationof the puzzle.</li>
	<li>Finds out if the pieces on the board can be put in order using only the moves given above. If the solution is possible, the program should find the moves putting the pieces in order.</li>
	<li>Writes the result to the standard output.</li>
</ul>

### 입력

<p>In&nbsp;the first line of the standard input there is one integer n the size of the board side (2 &le; n &le; 200). The following n lines contain the description of the initial configuration. The line i + 1 contains n integers p(i, 1), p(i, 2), ..., p(i, n)separated by single spaces.</p>

### 출력

<p>If there is no solution, the program should write to the standard output only one line containing only one word <code>NO</code>.</p>

<p>If a solution exists, the first line should contain one integer m the number of moves leading to the solution of the puzzle. The number of moves in your&nbsp;solution must not exceed 400 000. The following m lines should contain the descriptions of the moves, one move per line.</p>

<p>Each such line should consist of a letter <code>R</code> (for shifting a row to the right)&nbsp;or <code>C</code> (for shifting a column down), a space, and two integers: k and l separated by a space; 1 &le; k &le; n, 1 &le; l &le; n &minus; 1. A line containing <code>R</code> k l describes a cyclic shift of the k-th row l fields to the right. Such a move leads to the following</p>

<p>board configuration:&nbsp;\[p&#39;(i,j) = \begin{cases} p(i,j+n-l) &amp; \text{if } i = k \text { and }j \le l\\ p(i, j-l) &amp; \text{if } i = k \text{ and } j &gt; l \\ p(i, j)) &amp; \text {if } i \ne k\end{cases}\] Similarly, a line containing <code>C</code> k l describes a cyclic shift of the k-th column filelds down.</p>

<p>If there are several possible solutions, your program should output anyon eof them.</p>

### 힌트

<p>The above sequence of moves gives the following sequence of configurations:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7051.%E2%80%85Puzzle/6a68b46b.png" data-original-src="https://upload.acmicpc.net/bdcafc34-d234-443f-9573-3fe3cf552d74/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 477px; height: 80px;" /></p>
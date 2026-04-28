# [Gold I] GAME - 3290

[문제 링크](https://www.acmicpc.net/problem/3290)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 30, 정답: 7, 맞힌 사람: 6, 정답 비율: 24.000%

### 분류

다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>Hal and Dave are playing an interesting game on a rectangular chess like board consisting of squares arranged in R rows and C columns. Here are the rules of the game:</p>

<ul>
	<li>There is only one piece on a board alternately moved by the players.</li>
	<li>One move of the piece consists of moving it to an adjacent square in one of following directions: down, right or diagonally right&ndash;down.</li>
	<li>Some squares on a board are &lsquo;forbidden&rsquo;, i.e. the piece cannot enter such squares.</li>
	<li>A square may contain at most one of the following: a hamburger, french fries, ice cream. A player who moves the piece to a square with a hamburger receives 1 point, with french fries 3 points and with ice cream 5 points.</li>
	<li>The game ends when a player who should make a move cannot make it (because piece would fall off of board or enter a forbidden square in all three directions).</li>
	<li>If at the end of a game both players have same number of points, then the one who cannot make a legal move lost that game.</li>
	<li>If at the end of a game players have different numbers of points, then the player with more points won the game.</li>
	<li>Both players have 0 points at the beginning of a game. Hal makes first move. The initial position of the piece is a square that is not forbidden and it does not contain any food.</li>
</ul>

<p>Since there is a finite number of sequence of moves finishing any given game, it can be proved that for any given initial position of the piece either Dave or Hal can win no matter how the other player plays, i.e. he has a winning strategy.</p>

<p>A board, positions of forbidden squares, positions of squares with food and some initial positions are given. Write a program that will determine for each given initial position which player has a winning strategy.</p>

### 입력

<p>The first line of input file contains two integers R, number of rows (2 &le; R &le; 100) and C, number of columns (2 &le; C &le; 100) of a board, separated by a space character.</p>

<p>Each of next R lines contains a sequence of C characters representing a corresponding row of the board. Forbidden squares are represented with &lsquo;#&rsquo; character. Squares containing food are represented with letters H (hamburger), F (french fries) and I (ice cream). Other squares are represented with a dot character (&lsquo;.&rsquo;).</p>

<p>The next line contains an integer N, 1 &le; N &le; 100, the number of given initial positions for which a program should find which player has a winning strategy.</p>

<p>Each of the following N lines contain two integers A (1 &le; A &le; R) and B (1 &le; B &le; C), separated with a space character, which determine a row and a column of an initial position of a piece.</p>

<p>Rows are numbered from up to down with number from 1 to R, and columns are numbered from left to right with numbers from 1 to C.</p>

### 출력

<p>Output file should contain N lines. The ith line should contain name of a player (i.e. DAVE or HAL) having a winning strategy for ith given initial position.</p>
# [Platinum III] Cow Checkers - 5981

[문제 링크](https://www.acmicpc.net/problem/5981)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 155, 정답: 52, 맞힌 사람: 43, 정답 비율: 34.400%

### 분류

게임 이론

### 문제 설명

<p>One day, Bessie decides to challenge Farmer John to a game of &#39;Cow Checkers&#39;. The game is played on an M*N (1 &lt;= M &lt;= 1,000,000; 1 &lt;= N &lt;= 1,000,000) checkerboard that initially contains a single checker piece on the checkboard square coordinates (X, Y) (0 &lt;= X &lt; M; 0 &lt;= Y &lt; N). The bottom leftmost square of the checkerboard has coordinates (0, 0), and the top rightmost square has coordinates (M-1, N-1). Bessie always moves first, and then the two players alternate turns. &nbsp;Each turn comprises one of three types of moves:</p>

<ol>
	<li>Move the checker piece to any square on the same row to the left of its current position.</li>
	<li>Move the checker piece to any square on the same column below its current position.</li>
	<li>Move the checker piece to any spot k squares below and k squares to the left of the current square (where k is any positive integer such that this new spot is still on the checkerboard).</li>
</ol>

<p>The first player unable to make a move (i.e., because the checker is at (0, 0)) loses. Given that Bessie always goes first, determine who will win the game if both play optimally.</p>

<p>Play and report the winner for T games (1 &lt;= T &lt;= 1,000) reading in a new X,Y starting value for each new game.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: M and N</li>
	<li>Line 2: A single integer: T</li>
	<li>Lines 3..T+2: Two space-separated integers: X and Y</li>
</ul>

### 출력

<p>Lines 1..T: Should contain either &quot;Farmer John&quot; or &quot;Bessie&quot; depending on who wins each &nbsp;game.</p>

<p>&nbsp;</p>

### 힌트

<p>Farmer John and Bessie are playing one game on a 3*3 checkerboard with the checker piece initially at (1, 1) (i.e. at the center of the board).</p>

<p>Bessie initially can only move the checker piece to either (1, 0) or (0, 1), or (0, 0). Bessie can immediately win by moving the piece to (0, 0).</p>
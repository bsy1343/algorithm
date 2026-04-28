# [Gold IV] Cow Digit Game - 6120

[문제 링크](https://www.acmicpc.net/problem/6120)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 118, 정답: 56, 맞힌 사람: 50, 정답 비율: 47.170%

### 분류

다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>Bessie is playing a number game against Farmer John, and she wants you to help her achieve victory.</p>

<p>Game i starts with an integer N_i (1 &lt;= N_i &lt;= 1,000,000). Bessie goes first, and then the two players alternate turns. On each turn, a player can subtract either the largest digit or the smallest non-zero digit from the current number to obtain a new number. For example, from 3014 we may subtract either 1 or 4 to obtain either 3013 or 3010, respectively. The game continues until the number becomes 0, at which point the last player to have taken a turn is the winner.</p>

<p>Bessie and FJ play G (1 &lt;= G &lt;= 100) games. Determine, for each game, whether Bessie or FJ will win, assuming that both play perfectly (that is, on each turn, if the current player has a move that will guarantee his or her win, he or she will take it).</p>

<p>Consider a sample game where N_i = 13. Bessie goes first and takes 3, leaving 10. FJ is forced to take 1, leaving 9. Bessie takes the remainder and wins the game.</p>

### 입력

<ul>
	<li>Line 1: A single integer: G</li>
	<li>Lines 2..G+1: Line i+1 contains the single integer: N_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..G: Line i contains &quot;YES&quot; if Bessie can win game i, and &quot;NO&quot; otherwise.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>For the first game, Bessie simply takes the number 9 and wins. For the second game, Bessie must take 1 (since she cannot take 0), and then FJ can win by taking 9.</p>

<p>&nbsp;</p>
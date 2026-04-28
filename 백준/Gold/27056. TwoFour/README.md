# [Gold III] TwoFour - 27056

[문제 링크](https://www.acmicpc.net/problem/27056)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 71, 정답: 17, 맞힌 사람: 5, 정답 비율: 20.000%

### 분류

다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>Bessie has a new two-person game: TwoFour. She has N (3 &le; N &le; 30) piles, each with a number of balls (0 &le; nballs &le; 4).  The total number of balls is 2*N.</p>

<p>To play, the players alternate taking turns, each of which comprises a single valid move.  A valid move consists of the following actions:</p>

<ul>
	<li>First, the player chooses two different piles.</li>
	<li>Second, she takes a single ball from one pile and moves it to the other pile. She can do this only if the number of balls in the second pile (including the new ball) is not greater than the number of balls remaining in the first pile after the ball is removed.</li>
</ul>

<p>The game ends when no more moves can be made. In fact, at the end of the game, every pile will contain exactly two balls.</p>

<p>The winner of the game is the player who &#39;owns&#39; most piles.  Ties are possible.  A player &#39;owns&#39; a pile if the pile has two balls and this resulted from the player&#39;s most recent move to or form that pile. Consider these examples:</p>

<ul>
	<li>If a player moves a ball from a pile of four balls to a pile of one ball, then she owns the second pile (with two balls).</li>
	<li>If a player moves a ball from a pile of three balls to a pile of zero balls, then she owns the first pile, now with two balls.</li>
	<li>If a player moves a ball from a pile of three balls to a pile of one ball, then she owns both piles (both with two balls).</li>
</ul>

<p>Ownership can change.  Consider that a player owns a pile with two balls. If the other chooses a pile with four balls and moves a ball to the pile with two, then the pile is no longer owned by anyone.</p>

<p>If, at the beginning of the game, some piles have two balls, then the piles are equally distributed among the two players with any extra pile being owned by player two.</p>

<p>Player 1 is the one who makes the first move.</p>

<p>Your program must decide, for an initial game state, who will be the winner or if the game ends in a tie when both players play as well as they can.  Your program will be presented with G (1 &le; G &le; 1000) game states.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and G.</li>
	<li>Lines 2..G+1: Each line contains N space-separated integers describing a game.  The first integer is the number of  balls in pile 1, the second integer is the number of balls in pile 2, and so on. Line 2 describes game 1, line 3 describes game 2, and so on.  Your program should compute the winner for this particular game.</li>
</ul>

### 출력

<ul>
	<li>Lines 1..G: The outcome of each game.  Line 1 gives the outcome of game 1, and so on.  The outcome is a single integer: 1 if the first player wins, 2 if the second player wins, and 0 if the game is a tie.</li>
</ul>
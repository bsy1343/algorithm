# [Platinum II] Splitting Pairs - 28155

[문제 링크](https://www.acmicpc.net/problem/28155)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 79, 정답: 47, 맞힌 사람: 43, 정답 비율: 62.319%

### 분류

애드 혹, 게임 이론

### 문제 설명

<p>Alice and Bob are playing a modified game of Nim. Initially, there are some non-empty piles of stones in front of them. They take turns, and Alice takes the first turn.</p>

<p>On a single turn, a player must do the following actions in order:</p>

<ul>
	<li>Remove some number of piles of stones --- at least one but no more than half the number of piles.</li>
	<li>Choose the same number of piles of remaining stones, and split each of those piles into two non-empty piles.</li>
</ul>

<p>Notice that after each valid move, there should be the same number of non-empty piles of stones as at the start of the game. A player who cannot perform all the actions on their turn loses the game.</p>

<p>You are given many games, and for each one, you&#39;d like to determine who would win if both players play optimally.</p>

### 입력

<p>The first line of input contains an integer $t$ ($1 \leq t \leq 1\,000$), which is the number of games Alice and Bob play.</p>

<p>Each game is represented on two lines. The first line of each game contains an integer $n$ ($2 \leq n \leq 50$), which is the number of piles of stones.</p>

<p>The next line of the game contains $n$ space-separated integers $s$ ($1 \leq s \leq 10^{12}$), which are the number of stones in each pile.</p>

### 출력

<p>Output $t$ lines. For each game, output a single line with a single integer, which is $1$ if Alice wins and $0$ if Bob wins. Assume Alice takes the first turn, and both players play optimally. Output the game results in the order the games appear in the input.</p>
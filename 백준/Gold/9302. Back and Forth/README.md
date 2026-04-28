# [Gold V] Back and Forth - 9302

[문제 링크](https://www.acmicpc.net/problem/9302)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 39, 정답: 16, 맞힌 사람: 13, 정답 비율: 43.333%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>The neighborhood kids have come up with another crazy game. Everybody runs back and forth within bounds, but they can only move in straight lines! The rules of the game are as follows:</p>

<ul>
	<li>Before the game starts, someone is chosen to be &ldquo;it.&rdquo;</li>
	<li>The game goes for a set amount of rounds, during which each player may take one step in their given direction.</li>
	<li>If more than two players land on a spot at one time, they all reverse their direction.</li>
	<li>If only two collide, then they will switch directions for the next step as follows. The one with the longer name starts moving in the direction that the other would. The one with the shorter name takes the reverse of the direction of the other player. (This only works because all of the kids in the neighborhood have different length names.)</li>
	<li>If a player&rsquo;s next step would put the player out of bounds, they reverse direction before taking their step.</li>
	<li>The winner is the person who ends up closest to the &ldquo;it&rdquo; player, with ties going to the person with the shorter name.</li>
</ul>

<p>John thinks that this game is silly, since he could predict the outcome just by knowing the initial configuration. He wants you to write a program to do just that so he can show the other kids and convince them to play better games.</p>

<p>Below is the representation of the first test case. Note that (0,0) is the bottom-left corner.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9302.%E2%80%85Back%E2%80%85and%E2%80%85Forth/1053c40b.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9302.%E2%80%85Back%E2%80%85and%E2%80%85Forth/1053c40b.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9302/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:307px; width:308px" /></p>

### 입력

<p>The first line of input is the number of test cases that follow. Each test case begins with a line containing integers M, N, and P: the field&rsquo;s width, its height (both measured in &ldquo;steps&rdquo;), and the number of players, respectively (M, N, P &lt; 10). The next P lines contain space-separated values, starting with the name of one kid, followed by the x and y coordinates of their starting position on the field and the direction in which they start (N, S, E, or W). No two kids will start in the same spot. The first of the kids listed is &ldquo;it&rdquo; for the game. The last line of the test case (&le; 1000) is the number of rounds to play.</p>

### 출력

<p>For each case output &ldquo;Case x:&rdquo; where x is the case number, on a single line, followed by a space, and the name of the winner for that test case.</p>
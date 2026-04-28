# [Gold III] Voracious Steve - 20358

[문제 링크](https://www.acmicpc.net/problem/20358)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 35, 정답: 15, 맞힌 사람: 10, 정답 비율: 37.037%

### 분류

다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>Steve and Digit bought a box containing a number of donuts. In order to divide them between themselves they play a special game that they created. The players alternately take a certain, positive number of donuts from the box, but no more than some fixed integer. Each player&rsquo;s donuts are gathered on the player&rsquo;s side. The player that empties the box eats his donuts while the other one puts his donuts back into the box and the game continues with the &ldquo;looser&rdquo; player starting. The game goes on until all the donuts are eaten. The goal of the game is to eat the most donuts. How many donuts can Steve, who starts the game, count on, assuming the best strategy for both players?</p>

<p>Write a program that:</p>

<ul>
	<li>reads the parameters of the game from the standard input,</li>
	<li>computes the number of donuts Steve can count on,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>The first and only line of the input contains exactly two integers n and m separated by a single space, 1 &le; m &le; n &le; 100 &mdash; the parameters of the game, where n is the number of donuts in the box at the beginning of the game and m is the upper limit on the number of donuts to be taken by one player in one move.</p>

### 출력

<p>The output contains exactly one integer equal to the number of donuts Steve can count on.</p>
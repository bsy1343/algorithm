# [Gold I] Street Checkers - 23943

[문제 링크](https://www.acmicpc.net/problem/23943)

### 성능 요약

시간 제한: 40 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 42, 정답: 24, 맞힌 사람: 19, 정답 비율: 61.290%

### 분류

많은 조건 분기, 수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>Alice and Bob are playing a new virtual reality team game - Street Checkers. The game is set on an insanely long street divided into tiles which are numbered from 0 to 10<sup>9</sup>(inclusive of both). At the start of the game, Alice and Bob are standing on tile number 0 and are given a random number X in range [<b>L</b>,&nbsp;<b>R</b>] (both ends are inclusive). Alice only jumps to odd numbered tiles, while Bob only jumps to even numbered tiles. If the number on the tile divides X, then the player landing on it has to color it with their favorite color. The game is over after tile X has been colored.</p>

<p>A game is considered interesting by both the players if the absolute difference between the number of tiles painted by each is not greater than 2. Help Alice and Bob find how many numbers in the interval [<b>L</b>,&nbsp;<b>R</b>] could make for an interesting game.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;lines follow each containing two integers&nbsp;<b>L</b>&nbsp;and&nbsp;<b>R</b>, the start and end of the interval used to generate the random number X.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the count of numbers in interval [<b>L</b>,&nbsp;<b>R</b>] which results in an interesting game for Alice and Bob.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<b>R</b>&nbsp;-&nbsp;<b>L</b>&nbsp;&le; 10<sup>5</sup>.</li>
</ul>

### 힌트

<p>For the first sample case, let us look at all the possible number in range [5, 10]:</p>

<ul>
	<li>5 - Alice would paint 2 tiles : {1, 5}, and Bob would not paint any tile. The game would be interesting since the absolute difference is 2.</li>
	<li>6 - Alice would paint 2 tiles : {1, 3}, and Bob would paint 2 tiles : {2, 6}. The game would be interesting since the absolute difference is 0.</li>
	<li>7 - Alice would paint 2 tiles : {1, 7}, and Bob would not paint any tile. The game would be interesting since the absolute difference is 2.</li>
	<li>8 - Alice would paint 1 tile : {1}, and Bob would paint 3 tiles : {2, 4, 8}. The game would be interesting since the absolute difference is 2.</li>
	<li>9 - Alice would paint 2 tiles : {1, 3, 9}, and Bob would not paint any tile. The game would not be interesting since the absolute difference is greater than 2.</li>
	<li>10 - Alice would paint 2 tiles : {1, 5}, and Bob would paint 2 tiles : {2, 10}. The game would be interesting since the absolute difference is 0.</li>
</ul>

<p>Thus, the answer for this test case is 5.</p>

<p>In the second sample case, we have only one number 102. Alice would paint 4 tiles : {1, 3, 17, 51} while Bob would paint 4 tiles : {2, 6, 34, 102}. The game would be interesting since the absolute difference is 0.</p>
# [Platinum III] Dinner Bet - 13960

[문제 링크](https://www.acmicpc.net/problem/13960)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 44, 맞힌 사람: 34, 정답 비율: 85.000%

### 분류

조합론, 다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>Cesar and Raul like betting and good food, in no particular order. They want to try out a new fancy restaurant and they decided to make a bet - they are going to play a game the loser pays for dinner.</p>

<p>They have a box with N balls. Each ball contains a distinct number between 1 and N. Then, the game proceeds with these steps:</p>

<ul>
	<li>Initially, each person picks C distinct numbers between 1 and N and writes them down on a separate card.&nbsp;</li>
	<li>In each round, D balls are drawn from the box uniformly at random. Cesar and Raul mark down the ball numbers that appear in their respective card. The D balls are then returned to the box.</li>
	<li>The game stops when a player is able to mark on the card all the numbers he chose. That player is the winner. If both players finish at the same time, it tis a draw and they will split the dinner.&nbsp;</li>
</ul>

<p>They are quite eager to try out this new restaurant and they&#39;re now wondering: how many rounds will the game last?</p>

<p>Given the number N of balls, the number aD of balls they sraw from the box in each round, the amount C of numbers in theis cards and the numbers they wrote down, find the expected number of rounds the game will last.</p>

### 입력

<p>The first line of the input consists of three space separated integers: N, D, and C. N is the number of balls, D is the number of balls drawn in each round, and C is the cards&#39; size. Each of the following two lines contains C space separated integers: the number Cesar and Raul wrote down, respectively.</p>

<ul>
</ul>

### 출력

<p>The output is the expected number of rounds of the game.</p>

<p>The result will be considered correct as long as the absolute error does not exceed 10<sup>-3</sup>.</p>

### 제한

<ul>
	<li>1 &le; N &le; 50 Number of balls in the box</li>
	<li>1 &le; D &le; min(10,N) Number of balls drawn in each round</li>
	<li>1 &le; C &le; min(10,N) Cards&#39; size</li>
</ul>
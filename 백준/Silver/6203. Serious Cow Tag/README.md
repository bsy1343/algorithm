# [Silver IV] Serious Cow Tag - 6203

[문제 링크](https://www.acmicpc.net/problem/6203)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 271, 정답: 91, 맞힌 사람: 80, 정답 비율: 35.398%

### 분류

구현, 기하학, 시뮬레이션

### 문제 설명

<p>Farmer John&#39;s N (1 &lt;= N &lt;= 1000) cows (conveniently numbered 1..N) are going to play a game of Serious Cow Tag. In Serious Cow Tag, each cow chooses a grid point in the pasture (-7500 &lt;= X &lt;= 7500, -7500 &lt;= Y &lt;= 7500) such that the distances between all pairs of cows are unique.</p>

<p>The cows play in turn, starting with cow #1 and continuing with cows #2, #3, and so on (as long as the cow is still in the game). When it is a cow&#39;s turn to play, she finds the nearest cow still playing, ambles over to that cow to tag her, and then returns to her original location. As soon as a cow is tagged, she is out of the game.</p>

<p>The game ends when only one cow remains, and she is declared the winner.</p>

<p>Farmer John is taking bets with neighboring farmers as to which cow will win, so he would like to know the winner in advance. Write a program that will read a description of the cows&#39; positions and determine the winner.</p>

### 입력

<ul>
	<li>Line 1: A single integer N, the number of cows</li>
	<li>Lines 2..N+1: Line i+1 contains two space-separated integers that describe the location of cow i.</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: The number of the winning cow.</li>
</ul>

### 힌트

<p>Cow 1 goes first and tags the nearest cow, cow 2. Cow 2 is eliminated so she does not get a turn. Cow 3 then tags the only remaining cow, cow 1. &nbsp;She is the last cow left, so she wins.</p>
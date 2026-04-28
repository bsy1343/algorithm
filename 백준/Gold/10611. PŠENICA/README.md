# [Gold IV] PŠENICA - 10611

[문제 링크](https://www.acmicpc.net/problem/10611)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 143, 정답: 37, 맞힌 사람: 33, 정답 비율: 29.730%

### 분류

많은 조건 분기, 구현, 시뮬레이션

### 문제 설명

<p>Our heroes, Mirko and Slavko, plant Christmas wheat every year on Saint Lucy&rsquo;s Day. It is well known that stalks of wheat grow at different speeds so, after a certain time, the wheat becomes quite messy. The guys are determined to solve this problem by playing the following game:</p>

<ul>
	<li>When it&rsquo;s Mirko&rsquo;s turn, he chooses a stalk of wheat with the minimal height and prolongs its height so it&rsquo;s of the same height as the first stalk longer than it.</li>
	<li>When it&rsquo;s Slavko&rsquo;s turn, he chooses a stalk of wheat with the maximal height and cuts it to be of the same height as the first stalk shorter than it.</li>
	<li>The game lasts while there are at least three stalks of different heights and the loser is the player who can&rsquo;t make his move.</li>
</ul>

<p>For given heights of all stalks of wheat and the assumption that Mirko is the one starting the game, determine the winner of the game and the height of the shortest and longest stalk when the game is finished.</p>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 10<sup>5</sup>), the number of wheat stalks. The second line of input contains N space separated integers that denote the heights of individual wheat stalks. The height of each stalk will be less than or equal to 10<sup>5</sup>.</p>

### 출력

<p>The first line of output must contain the word &ldquo;Mirko&rdquo; if Mirko is the winner of the game, or &ldquo;Slavko&rdquo; if Slavko is the winner of the game.</p>

<p>The second line of output must contain the height of the shortest and longest stalk when the game is finished.</p>

### 힌트

<p>Clarification of the first example: Mirko can&rsquo;t make his move because there are no three stalks of different heights. Therefore, Slavko is the winner.</p>
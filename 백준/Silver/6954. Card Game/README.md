# [Silver IV] Card Game - 6954

[문제 링크](https://www.acmicpc.net/problem/6954)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 37, 정답: 28, 맞힌 사람: 27, 정답 비율: 87.097%

### 분류

구현, 문자열, 시뮬레이션

### 문제 설명

<p>Write a program that will keep score for a simple two-player game, played with a deck of cards. There are $52$ cards in the deck; four of each of 13 possible names: <code>two</code>, <code>three</code>, <code>four</code>, <code>five</code>, <code>six</code>, <code>seven</code>, <code>eight</code>, <code>nine</code>, <code>ten</code>, <code>jack</code>, <code>queen</code>, <code>king</code>, <code>ace</code>. The cards labelled <code>jack</code>, <code>queen</code>, <code>king</code>, and <code>ace</code> are collectively known as high cards.</p>

<p>The deck is shuffled and placed face-down on the table. Player A turns over the top card and places it on a pile; then player B turns over the top card and places it on the pile. A and B alternate until the deck is exhausted. The game is scored as follows:</p>

<ul>
	<li>If a player turns over an <code>ace</code>, with at least $4$ cards remaining to be turned over, and none of the next $4$ cards is a high card, that player scores $4$ points</li>
	<li>If a player turns over a <code>king</code>, with at least $3$ cards remaining to be turned over, and none of the next $3$ cards is a high card, that player scores $3$ points</li>
	<li>If a player turns over a <code>queen</code>, with at least $2$ cards remaining to be turned over, and none of the next $2$ cards is a high card, that player scores $2$ points</li>
	<li>If a player turns over a <code>jack</code>, with at least $1$ card remaining to be turned over, and the next card is not a high card, that player scores $1$ point</li>
</ul>

### 입력

<p>The input will contain $52$ lines. Each line will contain the name of a card in the deck, in lowercase letters. The first line denotes the first card to be turned over; the next line the next card; and so on.</p>

### 출력

<p>Whenever a player scores, print <code>Player X scores n point(s).</code> where <code>X</code> is the name of the player (<code>A</code> or <code>B</code>) and $n$ is the number of points scored (<code>1</code>, <code>2</code>, <code>3</code>, or <code>4</code>). At the end of the game, print the total score for each player, on two lines:</p>

<pre>
Player A: n point(s).
Player B: m point(s).</pre>
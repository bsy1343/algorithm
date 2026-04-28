# [Gold II] The Game Of 31 - 6950

[문제 링크](https://www.acmicpc.net/problem/6950)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 9, 맞힌 사람: 9, 정답 비율: 45.000%

### 분류

다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>The game of 31 was a favourite of con artists who rode the railroads in days of yore. The game is played with a deck of $24$ cards: four labelled each of <code>1</code>, <code>2</code>, <code>3</code>, <code>4</code>, <code>5</code>, <code>6</code>. (That is, there are four cards labelled <code>1</code>, four cards labelled <code>2</code>, and so on.) Initially, all of the cards are spread, face up, on a table and the &quot;discard pile&quot; is empty. The players then take turns. During each turn, a player picks up one unused card from the table and lays it on the discard pile. The object of the game is to be the last player to lay a card such that the sum of the cards in the pile does not exceed $31$. Your task is to determine the eventual winner of a partially played game, assuming each player plays the remainder of the game using a perfect strategy.</p>

<p>For example, in the following game player $B$ wins:</p>

<ol>
	<li>Player $A$ plays <code>3</code>.</li>
	<li>Player $B$ plays <code>5</code>.</li>
	<li>Player $A$ plays <code>6</code>.</li>
	<li>Player $B$ plays <code>6</code>.</li>
	<li>Player $A$ plays <code>5</code>.</li>
	<li>Player $B$ plays <code>6</code>.</li>
</ol>

### 입력

<p>The first line of the input is the number of test cases. It is followed by one line for each test case. Each such line consists of a sequence of zero or more digits representing a partially completed game. The first digit is player $A$&#39;s move; the second player $B$&#39;s move; and so on. You are to complete the game using a perfect strategy for both players and to determine who wins.</p>

### 출력

<p>For each game, output <code>A</code> or <code>B</code> on a single line to indicate the eventual winner of the game.</p>
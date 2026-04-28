# [Platinum II] Merge Cards - 23924

[문제 링크](https://www.acmicpc.net/problem/23924)

### 성능 요약

시간 제한: 40 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 15, 맞힌 사람: 13, 정답 비율: 92.857%

### 분류

수학, 확률론, 기댓값의 선형성

### 문제 설명

<p>Panko is playing a game with&nbsp;<b>N</b>&nbsp;cards laid out in a row. The i-th card has the integer&nbsp;<b>A<sub>i</sub></b>&nbsp;written on it.</p>

<p>The game is played in&nbsp;<b>N</b>&nbsp;- 1 rounds. During each round Panko will pick an adjacent pair of cards and&nbsp;<i>merge</i>&nbsp;them. Suppose that the cards have the integers X and Y written on them. To merge two cards, Panko creates a new card with X + Y written on it. He then removes the two original cards from the row and places the new card in their old position. Finally Panko receives X + Y points for the merge. During each round Panko will pick a pair of adjacent cards uniformly at random amongst the set of all available adjacent pairs.</p>

<p>After all&nbsp;<b>N</b>&nbsp;- 1 rounds, Panko&#39;s total score is the sum of points he received for each merge. What is the&nbsp;<a href="https://en.wikipedia.org/wiki/Expected_value">expected value</a>&nbsp;of Panko&#39;s total score at the end of the game?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case begins with a line containing the integer&nbsp;<b>N</b>. A second line follows containing&nbsp;<b>N</b>&nbsp;integers, describing the initial row of cards. The i-th integer is&nbsp;<b>A<sub>i</sub></b>.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the expected total score at the end of the game.</p>

<p><code>y</code>&nbsp;will be considered correct if it is within an absolute or relative error of 10<sup>-6</sup>&nbsp;of the correct answer.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>A<sub>i</sub></b>&nbsp;&le; 10<sup>9</sup>&nbsp;for all i.</li>
</ul>

### 힌트

<p>In sample case #1,&nbsp;<b>N</b>&nbsp;= 3. The initial row of cards is&nbsp;<code>[2, 1, 10]</code>. In the first round, Panko has two choices, of which he will choose one at random.</p>

<ul>
	<li>If Panko merges the first pair (<code>2, 1</code>), then the row of cards becomes&nbsp;<code>[3, 10]</code>, adding 2 + 1 = 3 points to his total score. In the second round, there is only one pair remaining (<code>3, 10</code>). If he merges them, the row of cards becomes&nbsp;<code>[13]</code>, adding 3 + 10 = 13 points to his total score. Panko ends the game with 3 + 13 = 16 points.</li>
	<li>If Panko merges the second pair (<code>1, 10</code>), then the row of cards becomes&nbsp;<code>[2, 11]</code>, adding 1 + 10 = 11 points to his total score. In the second round, there is only one pair remaining (<code>2, 11</code>). If he merges them, the row of cards becomes&nbsp;<code>[13]</code>, adding 2 + 11 = 13 points to his total score. Panko ends the game with 11 + 13 = 24 points.</li>
</ul>

<p>Thus, the expected number of points Panko ends the game with is (16 + 24)/2 = 20.</p>

<p>In sample case #2,&nbsp;<b>N</b>&nbsp;= 5. The initial row of cards is&nbsp;<code>[19, 3, 78, 2, 31]</code>. There are too many possibilities to list here, so we will only go through one possible game:</p>

<ul>
	<li>In the first round, if Panko merges the pair (<code>78, 2</code>), then the row of cards becomes&nbsp;<code>[19, 3, 80, 31]</code>, adding 78 + 2 = 80 to his score.</li>
	<li>In the second round, if Panko merges the pair (<code>80, 31</code>), then the row of cards becomes&nbsp;<code>[19, 3, 111]</code>, adding 80 + 31 = 111 to his score.</li>
	<li>In the third round, if Panko merges the pair (<code>19, 3</code>), then the row of cards becomes&nbsp;<code>[22, 111]</code>, adding 19 + 3 = 22 to his score.</li>
	<li>In the fourth round, if Panko merges the pair (<code>22, 111</code>), then the row of cards becomes&nbsp;<code>[133]</code>, adding 22 + 111 = 133 to his score.</li>
</ul>

<p>At the end of the game explained above, Panko&#39;s total score is 80 + 111 + 22 + 133 = 346.</p>
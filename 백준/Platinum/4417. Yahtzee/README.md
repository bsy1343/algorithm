# [Platinum I] Yahtzee - 4417

[문제 링크](https://www.acmicpc.net/problem/4417)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 9, 맞힌 사람: 7, 정답 비율: 58.333%

### 분류

백트래킹, 비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 구현

### 문제 설명

<p>The game of Yahtzee involves 5 dice, which are thrown in 13 rounds. A score card contains 13 categories; each round may be scored in a category of the player&#39;s choosing, but each category may be scored only once in the game. The 13 categores are scored as follows:</p>

<ul>
	<li>ones - sum of all ones thrown</li>
	<li>twos - sum of all twos thrown</li>
	<li>threes - sum of all threes thrown</li>
	<li>fours - sum of all fours thrown</li>
	<li>fives - sum of all fives thrown</li>
	<li>sixes - sum of all sixes thrown</li>
	<li>chance - sum of all dice</li>
	<li>three of a kind - sum of all dice, provided at least three have same value</li>
	<li>four of a kind - sum of all dice, provided at least four have same value</li>
	<li>five of a kind - 50 points, provided all five dice have same value</li>
	<li>short straight - 25 points, provided four of the dice form a sequence (that is, 1,2,3,4 or 2,3,4,5 or 3,4,5,6)</li>
	<li>long straight - 35 points, provided all dice form a sequence (1,2,3,4,5 or 2,3,4,5,6)</li>
	<li>full house - 40 points, provided three of the dice are equal and the other two dice are also equal. (for example, 2,2,5,5,5)</li>
</ul>

<p>Each of the last six categories may be scored as 0 if the criteria are not met.</p>

<p>The score for the game is the sum of all 13 categories plus a bonus of 35 points if the sum of the first six categores is 63 or greater.</p>

<p>Your job is to compute the best possible score for a sequence of rounds.</p>

### 입력

<p>Each line of input contains 5 integers between 1 and 6, indicating the values of the five dice thrown in each round. There are 13 such lines for each game, and there may be any number of games in the input data.</p>

### 출력

<p>Your output should consist of a single line for each game containing 15 numbers: the score in each category (in the order given), the bonus score (0 or 35), and the total score. If there is more than categorization that yields the same total score, any one will do.</p>
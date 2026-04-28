# [Gold III] Cards Game - 24010

[문제 링크](https://www.acmicpc.net/problem/24010)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 25, 맞힌 사람: 21, 정답 비율: 63.636%

### 분류

애드 혹, 그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>Professor Shekhu was a famous scientist working in the field of game theory in the early days of computer science. Right now, he&#39;s working on a game which involves a box containing&nbsp;<b>N</b>&nbsp;distinct cards. The i-th of these cards has a red number written on one side, and a blue number written on the other side. Both of these numbers are positive integers. The game proceeds as follows:</p>

<ul>
	<li>The player starts with a total of 0 points. The objective of the game is to finish with the&nbsp;<i>lowest</i>&nbsp;possible total.</li>
	<li>As long as there are at least two cards remaining in the box, the player must repeat the following move:
	<ul>
		<li>Remove two cards of their choice from the box. Choose a red number&nbsp;<b>R</b>&nbsp;from one card and a blue number&nbsp;<b>B</b>&nbsp;from the other card.</li>
		<li>Add the value&nbsp;<b>R ^ B</b>&nbsp;to the total, where&nbsp;<b>^</b>&nbsp;denotes bitwise XOR operation.</li>
		<li>Return one of the two cards to the box, and remove the other from the game.</li>
	</ul>
	</li>
	<li>The game ends when there is only one card remaining in the box (and so it is impossible to make another move).</li>
</ul>

<p>Professor Shekhu has summoned his best student, Akki, to play this game. Can you help Akki find the minimum possible total, considering all possible ways in which he can play the game?</p>

### 입력

<p>The first line of the input contains an integer&nbsp;<b>T</b>, the number of test cases.&nbsp;<b>T</b>&nbsp;test cases follow; each test case consists of three lines: First line of the each test case will contain an integer&nbsp;<b>N</b>.</p>

<ol>
	<li>The first line contains a positive integer&nbsp;<b>N</b>: the number of cards in the box.</li>
	<li>The second line contains a list of&nbsp;<b>N</b>&nbsp;positive integers&nbsp;<b>R<sub>i</sub></b>; the i-th of these represents the red number on the i-th card.</li>
	<li>The third line contains a list of&nbsp;<b>N</b>&nbsp;positive integers&nbsp;<b>B<sub>i</sub></b>; the i-th of these represents the blue number on the i-th card.</li>
</ol>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the minimum possible total that Akki can attain, if he plays optimally.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>R<sub>i</sub></b>&nbsp;&le; 10<sup>9</sup>.</li>
	<li>1 &le;&nbsp;<b>B<sub>i</sub></b>&nbsp;&le; 10<sup>9</sup>.</li>
</ul>

### 힌트

<p>In Sample Case #1, Akki has only one move in which he picks up the available cards and has two options.</p>

<ol>
	<li>He can choose red number from the first card and blue number from the second card to add 1 ^ 3 = 2 to the total.</li>
	<li>He can choose red number from the second card and blue number from the first card to add 2 ^ 3 = 1 to the total.</li>
</ol>

<p>The second option is better and the answer is 1.</p>

<p>In Sample Case #2, one optimal strategy is to take the red number from first card and the blue number from second card, add 1 ^ 2 = 3 to the total, and return first card to the box. Then, take the red number from first card and the blue number from third card, add 1 ^ 3 = 2 to the total, and return either of the cards to the box. The final total is 5.</p>
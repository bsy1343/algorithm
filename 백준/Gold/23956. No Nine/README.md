# [Gold II] No Nine - 23956

[문제 링크](https://www.acmicpc.net/problem/23956)

### 성능 요약

시간 제한: 60 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 32, 정답: 20, 맞힌 사람: 19, 정답 비율: 76.000%

### 분류

다이나믹 프로그래밍, 자릿수를 이용한 다이나믹 프로그래밍, 수학, 정수론

### 문제 설명

<p>No Nine is a counting game that you can try when you are bored. In this game, you are only allowed to say numbers that are&nbsp;<i>legal</i>. A number is legal if and only if&nbsp;<u>all</u>&nbsp;of the following are true:</p>

<ul>
	<li>it is a natural number (i.e. in the set {1, 2, 3...})</li>
	<li>it does not contain the digit 9 anywhere in its base 10 representation</li>
	<li>it is not divisible by 9</li>
</ul>

<p>For example, the numbers 16 and 17 are legal. The numbers 18, 19, 17.2, and -17 are not legal.</p>

<p>On the first turn of the game, you choose and say a legal number&nbsp;<b>F</b>. On each subsequent turn, you say the next legal number. For example, if you played a game with&nbsp;<b>F</b>&nbsp;= 16, you would say 16, 17, 20, 21, and so on.</p>

<p>Alice is very good at this game and never makes mistakes. She remembers that she played a game in which the first number was&nbsp;<b>F</b>&nbsp;and the last number was&nbsp;<b>L</b>&nbsp;(when she got tired of the game and stopped), and she wonders how many turns were in the game in total (that is, how many numbers she said).</p>

### 입력

<p>The input starts with one line containing one integer&nbsp;<b>T</b>;&nbsp;<b>T</b>&nbsp;test cases follow. Each test case consists of a single line containing two integers&nbsp;<b>F</b>&nbsp;and&nbsp;<b>L</b>: the first and last numbers from the game, as described above.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1), and&nbsp;<code>y</code>&nbsp;is the number of the turns played in the game.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li><b>F</b>&nbsp;does not contain a&nbsp;<code>9</code>&nbsp;digit.</li>
	<li><b>F</b>&nbsp;is not divisible by 9.</li>
	<li><b>L</b>&nbsp;does not contain a&nbsp;<code>9</code>&nbsp;digit.</li>
	<li><b>L</b>&nbsp;is not divisible by 9.</li>
</ul>

### 힌트

<p>In Sample Case #1, the game lasted for 9 turns, and the numbers Alice said were: 16, 17, 20, 21, 22, 23, 24, 25, 26.</p>

<p>In Sample Case #2, the game lasted for 4 turns, and the numbers Alice said were: 88, 100, 101, 102.</p>
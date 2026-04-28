# [Platinum IV] gNumbers (Large) - 12071

[문제 링크](https://www.acmicpc.net/problem/12071)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 98, 정답: 48, 맞힌 사람: 31, 정답 비율: 43.056%

### 분류

수학, 다이나믹 프로그래밍, 정수론, 집합과 맵, 비트마스킹, 게임 이론, 소수 판정, 비트필드를 이용한 다이나믹 프로그래밍, 소인수분해

### 문제 설명

<p>Googlers are crazy about numbers and games, especially number games! Two Googlers, Laurence and Seymour, have invented a new two-player game based on &quot;gNumbers&quot;. A number is a gNumber if and only if the sum of the number&#39;s digits has no positive divisors other than 1 and itself. (In particular, note that 1 is a gNumber.)</p>

<p>The game works as follows: First, someone who is not playing the game chooses a starting number&nbsp;<strong>N</strong>. Then, the two players take turns. On a player&#39;s turn, the player checks whether the current number C is a gNumber. If it is, the player loses the game immediately. Otherwise, the player chooses a prime factor P of C, and keeps dividing C by P until P is no longer a factor of C. (For example, if the current number were 72, the player could either choose 2 and repeatedly divide by 2 until reaching 9, or choose 3 and repeatedly divide by 3 until reaching 8.) Then the result of the division becomes the new current number, and the other player&#39;s turn begins.</p>

<p>Laurence always gets to go first, and he hates to lose. Given a number&nbsp;<strong>N</strong>, he wants you to tell him which player is certain to win, assuming that both players play optimally.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow; each consists of a starting number&nbsp;<strong>N</strong>.</p>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the winner&#39;s name: either&nbsp;<code>Laurence</code>&nbsp;or&nbsp;<code>Seymour</code>.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &lt;&nbsp;<strong>N</strong>&nbsp;&le; 10<sup>15</sup>.</li>
</ul>

### 힌트

<p>In Case #1, 2 is already a gNumber, since the sum of its digits is 2, which has no positive divisors other than 1 and itself. So Laurence immediately loses, which means Seymour wins. The same is true for Case #2.</p>

<p>In Case #3, 4 is not a gNumber, since the sum of its digits is 4, which has a positive divisor other than 1 and itself (namely, 2). 4 has one prime factor (2), so Laurence must choose this factor and repeatedly divide 4 by it, which leaves him with 1. Then, Seymour begins his turn with 1, which is a gNumber. So he loses and Laurence wins.</p>
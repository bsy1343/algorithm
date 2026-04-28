# [Gold V] Less Money, More Problems (Small) - 12151

[문제 링크](https://www.acmicpc.net/problem/12151)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 38, 정답: 30, 맞힌 사람: 30, 정답 비율: 83.333%

### 분류

수학

### 문제 설명

<p>Up until today, the nation you live in has used&nbsp;<strong>D</strong>&nbsp;different positive integer denominations of coin for all transactions. Today, the queen got angry when a subject tried to pay his taxes with a giant sack of low-valued coins, and she just decreed that no more than&nbsp;<strong>C</strong>&nbsp;coins of any one denomination may be used in any one purchase. For instance, if&nbsp;<strong>C</strong>&nbsp;= 2 and the existing denominations are 1 and 5, it is possible to buy something of value 11 by using two 5s and one 1, or something of value 12 by using two 5s and two 1s, but it is impossible to buy something of value 9 or 17.<br />
<br />
You cannot directly challenge the queen&#39;s decree, but you happen to be in charge of the mint, and you&nbsp;<em>can</em>&nbsp;issue new denominations of coin. You want to make it possible for&nbsp;<em>any</em>item of positive value at most&nbsp;<strong>V</strong>&nbsp;to be purchased under the queen&#39;s new rules. (Note that this may not necessarily have been possible before the queen&#39;s decree.) Moreover, you want to introduce as few new denominations as possible, and your final combined set of pre-existing and new denominations may not have any repeats.<br />
<br />
What is the smallest number of new denominations required?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each consists of one line with three space-separated values&nbsp;<strong>C</strong>,&nbsp;<strong>D</strong>, and&nbsp;<strong>V</strong>, followed by another line with&nbsp;<strong>D</strong>&nbsp;distinct space-separated values representing the preexisting denominations, in ascending order.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>Each existing denomination &le;&nbsp;<strong>V</strong>.&nbsp;</li>
	<li><strong>C</strong>&nbsp;= 1.</li>
	<li>1 &le;&nbsp;<strong>D</strong>&nbsp;&le; 5.</li>
	<li>1 &le;&nbsp;<strong>V</strong>&nbsp;&le; 30.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the minimum number of new denominations required, as described above.</p>

### 힌트

<p>Note that Cases #3 and #4 are not within the limits for the Small dataset.<br />
<br />
In Case #1, it is already possible to make all the required values (1, 2, and 3) using at most one copy of each of the existing denominations.<br />
<br />
In Case #2, it suffices to add a denomination of either 3 or 4 -- whichever you choose, only one new denomination is required.<br />
<br />
In Case #3, the optimal solution is to add a denomination of 1.</p>
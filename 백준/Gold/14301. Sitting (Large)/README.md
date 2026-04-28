# [Gold III] Sitting (Large) - 14301

[문제 링크](https://www.acmicpc.net/problem/14301)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 90, 정답: 38, 맞힌 사람: 33, 정답 비율: 44.595%

### 분류

애드 혹

### 문제 설명

<p>The&nbsp;Codejamon&nbsp;game is on fire! Many players have gathered in an auditorium to fight for the World Championship. At the opening ceremony, players will sit in a grid of seats with&nbsp;R&nbsp;rows and&nbsp;C&nbsp;columns.</p>

<p>The competition will be intense, and the players are sensitive about sitting near too many of their future opponents! A player will feel too crowded if another player is seated directly to their left&nbsp;and&nbsp;another player is seated directly to their right. Also, a player will feel too crowded if one player is seated directly in front of them&nbsp;and&nbsp;another player is seated directly behind them.&nbsp;</p>

<p>What is the maximum number of players that can be seated such that no player feels too crowded?&nbsp;</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each test case consists of one line with two integers&nbsp;R&nbsp;and&nbsp;C: the number of rows and columns of chairs in the auditorium.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the maximum number of players that can be seated, as described in the problem statement.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;R&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;C&nbsp;&le; 100.</li>
</ul>

### 힌트

<p>In sample case #1, we can fill all seats, and no player will feel too crowded.</p>

<p>In sample case #2, each row has three seats. We can&#39;t put three players in a row, since that would make the middle player feel too crowded. One optimal solution is to fill each of the first two columns, for a total of four players.</p>

<p>In sample case #3, one optimal solution is to fill the first two rows and the last row, for a total of three players.</p>
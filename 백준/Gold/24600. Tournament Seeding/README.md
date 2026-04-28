# [Gold III] Tournament Seeding - 24600

[문제 링크](https://www.acmicpc.net/problem/24600)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 91, 정답: 48, 맞힌 사람: 47, 정답 비율: 63.514%

### 분류

그리디 알고리즘, 정렬, 두 포인터

### 문제 설명

<p>You are tasked with seeding a single-elimination tournament for a one-on-one game. The number of players who have registered for the tournament is exactly a power of two, and there will be exactly enough rounds in this tournament to decide a winner. Furthermore, each player has a unique numeric rating in the game known to you; when two players play against each other in a game, the player with the higher rating always wins. As the organizer of the tournament, you would like to make the tournament as exciting for players and spectators as possible. To do that, you wish the tournament to have the following properties:</p>

<ul>
	<li>The top two (highest rated) players are present in the final round of the tournament, the top four players are present in the semi-final round of the tournament, the top eight players are present in the quarter-final round, and so on. This saves the highest rated games for last.</li>
	<li>Subject to the above, as many games as possible are &quot;close.&quot; We define a game to be &quot;close&quot; if the difference between the two players&#39; ratings is less than or equal to some threshold.</li>
</ul>

<p>Given the number of rounds, the threshold for &quot;close&quot; games and the ratings of the players, what is the maximum number of &quot;close&quot; games that can happen subject to the above constraints?</p>

### 입력

<p>The first line of input contains two integers $n$ ($1 \leq n \leq 18$) and $k$ ($1 \leq k \leq 10^9$), where $n$ is the number of rounds of the tournament, and $k$ is the rating difference that makes a game &quot;close.&quot;</p>

<p>Each of the next $2^n$ lines contains a single integer $r$ ($1 \leq r \leq 10^9$) denoting the rating of each player. The ratings are guaranteed to be distinct.</p>

### 출력

<p>Output a single line with a single integer, which is the maximum number of &quot;close&quot; games possible in a tournament among these players satisfying the constraints described above.</p>
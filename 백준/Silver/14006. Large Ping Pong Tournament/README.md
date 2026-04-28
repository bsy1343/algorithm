# [Silver II] Large Ping Pong Tournament - 14006

[문제 링크](https://www.acmicpc.net/problem/14006)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 252, 정답: 98, 맞힌 사람: 85, 정답 비율: 39.171%

### 분류

정렬, 애드 혹

### 문제 설명

<p><strong>&quot;Don&#39;t underestimate my strength.&quot;</strong>&nbsp;- Dudu, 2015</p>

<p><strong>Note:</strong>&nbsp;This problem is identical to Small Ping Pong Tournament, but with larger bounds.</p>

<p>Dudu is enjoying his time in Thailand and has decided to compete in a local ping pong tournament.</p>

<p>For this tournament a game of ping pong occurs between two players. It lasts for a fixed amount of time, after which the player with more points is declared to be the winner. In the case of a tie an arm wrestling match is used to determine who wins.</p>

<p>The tournament starts with a total of 2<sup>N</sup>&nbsp;players, including Dudu, and proceeds in rounds. In each round, all K remaining players are formed into pairs to play games of ping pong. The loser of each game is eliminated, while the K/2 winners continue on to the next round. The last player remaining is declared the winner.</p>

<p>After the tournament, the organizers realized that the only information they recorded from the tournament is the total number of points each player scored. They didn&#39;t record who played with whom, and who won each game. In particular, they forgot to record who the winner was!</p>

<p>You are given the total points scored by each player across all of his games. You also know that Dudu is very strong, and never loses at arm wrestling. Determine whether it is possible for Dudu to have been the champion.</p>

### 입력

<p>The input will start with a line containing a single integer N. The following 2<sup>N</sup>&nbsp;lines will each contain an integer indicating the total number of points scored by some player. Dudu&#39;s score is given first.</p>

<p>0 &le; N &le; 18. All scores will be non-negative integers &le; 10<sup>9</sup>.</p>

### 출력

<p>Output &quot;YES&quot; if it possible for Dudu to have won the tournment, and output &quot;NO&quot; otherwise.</p>

### 힌트

<p>One way Dudu (Dudu is player 1) can win is:</p>

<h3>First Round</h3>

<ul>
	<li>Player 1 beats player 3: 4-3</li>
	<li>Player 2 beats player 4: 5-5 + arm wrestling</li>
</ul>

<p>Players 1 and 2 advance</p>

<h3>Second Round</h3>

<ul>
	<li>Player 1 beats player 2: 1-1 + arm wrestling</li>
</ul>

<p>Note that the total amount of points each player did is consistent with the input.</p>

<p>There are other ways Dudu might have won, but we only want to know if it is possible or not.</p>
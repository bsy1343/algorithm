# [Gold III] Game - 3801

[문제 링크](https://www.acmicpc.net/problem/3801)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

수학, 다이나믹 프로그래밍, 확률론

### 문제 설명

<p>Recently, there was an international volleyball championship. Speaking of volleyball, we are interested in the probability of winning of one or another team, if we know some information about the teams. Here are the rules of the game and the necessary information:</p>

<ul>
	<li>the match is played by two teams: A and B;</li>
	<li>the first team to win K games in a match, wins the match;</li>
	<li>each game consists of rounds; each round is won by one of the teams, and the team adds one point to its score for the current game;</li>
	<li>the first team to win L points in a game, wins the game;</li>
	<li>if team A serves the ball in a round, it has Pa% chance to win the round (and (100-Pa)% to loose it);</li>
	<li>if team B serves the ball in a round, it has Pb% chance to win the round (and (100-Pb)% to loose it);</li>
	<li>if a round is not the first in a game, the ball in the round is served by the team that won the last round;</li>
	<li>if a game is not the first in a match, the ball in the first round of the game is served by the team that did not served the ball in the first round of the previous game;</li>
	<li>both teams have an equal chance to serve the ball in the first round of the very first game of a match.</li>
</ul>

<p>So, for given values of Pa, Pb, K, and L, you have to compute the probability, as a percent, for team A to win the match.</p>

### 입력

<p>There is one number in the first line &ndash; the number of data sets. Each data set consists of a single line with four integers on it: Pa, Pb, K, and L (1&lt;= K&lt;=100, 1&lt;= L&lt;=100).</p>

### 출력

<p>For each test you must write on one line the required result with exactly one digit after the decimal point (the number should be rounded to the first digit after the decimal point).</p>
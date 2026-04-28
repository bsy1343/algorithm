# [Gold II] World Cup Fever - 25875

[문제 링크](https://www.acmicpc.net/problem/25875)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 8, 맞힌 사람: 8, 정답 비율: 26.667%

### 분류

그래프 이론, 그래프 탐색, 기하학, 최단 경로, 선분 교차 판정

### 문제 설명

<p>The 2018 World Cup was held recently in Russia. Some great soccer countries (e.g., Italy, Netherlands, Chile, USA) did not qualify for this World Cup. These countries have found out that they needed more effective passing.</p>

<p>Given the player positions for two teams, determine the minimum number of passes needed to get the ball from one player to another player. For the purposes of this problem, players do not change position, i.e., they do not move.</p>

<p>Player P<sub>1</sub> can pass the ball directly to P<sub>2</sub> if they are on the same team and no other player is in between the two players.</p>

<p>Let&rsquo;s assume:</p>

<ul>
	<li>P<sub>1</sub> and P<sub>2</sub> are on the same team</li>
	<li>P<sub>1</sub>, P<sub>2</sub>, P<sub>3</sub> form a line with P<sub>3</sub> between P<sub>1</sub> and P<sub>2</sub></li>
	<li>There are no other players on the line formed by P<sub>1</sub>, P<sub>2</sub>, P<sub>3</sub></li>
</ul>

<p>Then,</p>

<ul>
	<li>If P<sub>3</sub> is on the other team, P<sub>1</sub> cannot pass the ball directly to P<sub>2</sub>.</li>
	<li>If P<sub>3</sub> is on the same team, P<sub>1</sub> can pass the ball to P<sub>3</sub> to pass it to P<sub>2</sub>.</li>
</ul>

### 입력

<p>The first input line contains an integer, n (2 &le; n &le; 11), indicating the number of players on each team. The second input line contains 2n integers, providing the (x,y) coordinates for the n players on Team 1; the first integer on this input line is the x coordinate for Player 1, the second integer is the y coordinate for Player 1, the third integer is the x coordinate for Player 2, etc. The third input line provides (in a similar fashion) the (x,y) coordinates for the n players on Team 2. Assume that all coordinates are integers between 1 and 999 (inclusive) and that all players are on distinct locations, i.e., no two players occupy the same spot (point).</p>

<p>Assume Player 1 on Team 1 has the ball and wants to pass the ball to Player n on Team 1. Assume that any player can pass the ball any distance.</p>

### 출력

<p>The output consists of a single integer, indicating the minimum number of passes needed to get the ball from Player 1 on Team 1 to Player n on Team 1. If it is not possible to get the ball from Player 1 to Player n, print -1.</p>
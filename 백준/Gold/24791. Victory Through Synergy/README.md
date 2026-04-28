# [Gold V] Victory Through Synergy - 24791

[문제 링크](https://www.acmicpc.net/problem/24791)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 15, 맞힌 사람: 15, 정답 비율: 55.556%

### 분류

구현, 그래프 이론, 브루트포스 알고리즘

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24791.%E2%80%85Victory%E2%80%85Through%E2%80%85Synergy/8da16e5b.png" data-original-src="https://upload.acmicpc.net/497d6efc-b83a-4580-ad09-043a744fafe7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 187px; float: right;" />Johnny has been roped into a fantasy soccer league and needs your help to set up the best team.</p>

<p>He has a list of $10$ players that are on his fantasy team (no goalkeepers in this league). He also knows what country they&#39;re from, what league they play in, and what team they play for.</p>

<p>He doesn&#39;t know much about soccer, but he does know these things:</p>

<ol>
	<li>If two players are from the same country, a link between the two players will have a synergy score of $1$.</li>
	<li>If two players are in the same league, a link between the two players will have a synergy score of $1$.</li>
	<li>If two players are on the same team, a link between the two players will have a synergy score of $2$.</li>
	<li>If two players are from the same country and in the same league, a link between the two players will have a synergy score of $2$.</li>
	<li>If two players are from the same country and on the same team, a link between the two players will have a synergy score of $3$.</li>
</ol>

<p>A team can only be in one league and no two teams will have the same name unless they are the same team.</p>

<p>He has to place the players on his team into a formation of $10$ nodes which can be represented as an undirected graph. The illustration shows the first sample. Therefore, Johnny has to place a player in each node of the graph. Given a particular formation and the members of Johnny&#39;s team, output whether it is possible for Johnny to organize his team to get a perfect team.</p>

<p>A team is a perfect team if and only if every player is placed on a node with a synergy score that is greater or equal to the node&#39;s degree. A node&#39;s degree is the number of links to which it is linked in the formation. A player placed on a node in the formation derives synergy from all players placed on nodes to which the player is linked in the formation. &nbsp;Thus, a node&#39;s synergy score is the sum of the synergy scores of all links to which the node is connected.</p>

### 입력

<p>The input will contain $1$ test case. The first line of the input will have one integer $c$ ($0 \leq c \leq 45$). $c$ represents the number of edges in the formation. The next $c$ lines represent the connections between nodes represented as two integers $a$ ($0 \leq a &lt; 10$) and $b$ ($0 \leq b &lt; 10$), where $a$ is not equal to $b$. Then, the next $10$ lines will be the players on Johnny&#39;s team. Each line will contain four strings in the following order: player name, nation, league, team. These are guaranteed to be non-empty with no spaces, no longer than $15$ characters, and delimited by a single space between each piece of information.</p>

### 출력

<p>If a perfect team can be organized by Johnny, print <code>yes</code>. Otherwise, print <code>no</code>.</p>
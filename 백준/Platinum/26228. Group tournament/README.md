# [Platinum I] Group tournament - 26228

[문제 링크](https://www.acmicpc.net/problem/26228)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 3, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

그래프 이론, 최대 유량, 역추적

### 문제 설명

<p>In our capitalist-run, dog-eat-dog world money is everything, and big sports are no exception. All participating teams have already bought enough points for the next season, and all the local hockey federation has to do now is distribute the results of the upcoming games. However, some teams felt generous and apart from buying points also bought the results of some matches. Initially the federation officials thought it would only make their life easier: the more games are fixed, the less work. It was only later that they understood their wrong and asked us to be a part of their scheme and help them distribute the results of the games in the upcoming season.</p>

<p>The local hockey tournament follows a round scheme: $N$ teams participate, each team plays a game against each and every other team strictly once. Teams score points for games according to the following rules:</p>

<ul>
	<li>If the winning team is defined at the end of the regulation time of the match, it scores 3 points, and the other team gets none.</li>
	<li>If a game is tied after regulation time, overtime ensues. In this case the winner gets 2 points and the loser gets 1. The overtime is unlimited and lasts until someone scores a goal.</li>
</ul>

<p>Based on the tournament results, a team&#39;s score is calculated as the sum of its points earned in all games played.</p>

### 입력

<p>The first line of the input file contains an integer $N$ --- the number of tournament participants (2 $\leq$ $N$ $\leq$ 100). Teams are numbered from 1 to $N$.</p>

<p>The following $N$ lines of the file each contain $N$ symbols and are in essence a tournament table for the given moment of time.</p>

<p>The symbol $a_{ij}$ in the line $i$ and position $j$ denotes the result of a game scheduled to be played by team number $i$ against team number $j$ (1 $\leq$ $i$, $j$ $\leq$ $N$). It can be one of the following:</p>

<ul>
	<li><code>&#39;W&#39;</code> --- means that the team $i$ will win a match against $j$ in the regulation time</li>
	<li><code>&#39;w&#39;</code> --- the team $i$ will win in a match against $j$ in the overtime</li>
	<li><code>&#39;l&#39;</code> --- the team $i$ will lose to the team $j$ in the overtime</li>
	<li><code>&#39;L&#39;</code> --- the team $i$ will lose to the team $j$ in the regulation time</li>
	<li><code>&#39;.&#39;</code> --- if the result of the game between $i$ and $j$ is not yet determined</li>
	<li><code>&#39;#&#39;</code> --- if $i$ equals $j$, it means that there is no such game, i.e. a team cannot play against itself.</li>
</ul>

<p>It is guaranteed that the table is correct. More formally:</p>

<ul>
	<li>$a_{ij}$ = <code>&#39;#&#39;</code> for all $i$ = $j$</li>
	<li>if $a_{ij}$ = <code>&#39;.&#39;</code>, then $a_{ji}$ = <code>&#39;.&#39;</code></li>
	<li>$a_{ij}$ = <code>&#39;W&#39;</code> when and only when $a_{ji}$ = <code>&#39;L&#39;</code></li>
	<li>$a_{ij}$ = <code>&#39;w&#39;</code> when and only when $a_{ji}$ = <code>&#39;l&#39;</code></li>
</ul>

<p>The last line of the input file contains $N$ integers $p_i$ --- the number of points the $i$-th team must score (1 $\leq$ $i$ $\leq$ $N$).</p>

### 출력

<p>The output file must contain a completely filled tournament table in the same format as that in the input file.</p>

<p>It is guaranteed that a solution exists. If there are several solutions, print any of them.</p>
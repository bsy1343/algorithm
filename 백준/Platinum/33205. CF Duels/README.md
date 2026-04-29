# [Platinum II] CF Duels - 33205

[문제 링크](https://www.acmicpc.net/problem/33205)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 11, 정답: 9, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

그리디 알고리즘, 매개 변수 탐색

### 문제 설명

<p>Two football teams, each consisting of exactly $N$ players, from Chisinau, the capital of Moldova, hold a set of duels (Chisinau Football Duels). To make it interesting, they organize the football match-ups in the following $1$ vs $1$ format:</p>

<ul>
	<li>There will be a total of $N$ duels, each held in a different stadium.</li>
	<li>Each duel will have exactly one player from each of the two teams.</li>
	<li>Each player will take part in exactly one duel.</li>
	<li>Each stadium will provide a certain amount of prize money for the winner of the respective duel.</li>
	<li>The player with the higher skill level wins the duel. It is guaranteed that there is always a player with a higher skill level.</li>
</ul>

<p>The champion is the team that has obtained a strictly greater amount of prize money than the opponent team after all the matches. In case of an equal obtained prize money, there is no champion.</p>

<p>You are the manager of the first football team, and your job is to strategically assign your $N$ players to the $N$ duels.</p>

<p>As the manager of the first football team, you have the following information:</p>

<ul>
	<li>$N$ integers, representing the skill levels of your team's players</li>
	<li>$N$ integers, representing the skill levels of the opposing team's players</li>
</ul>

<p>As the manager, you also sent a scout to visit each stadium. The scout visits the stadiums in increasing order from $1$ to $N$, meaning he will visit stadium $1$ first, then stadium $2$, and will end at stadium $N$. After the scout visits stadium $i$, he will give you information regarding the skill level of the opposing team's duelist at stadium $i$.</p>

<p>Possibly, after the scout visits some stadiums, you can already foresee your team emerging as a champion. In other words, there is a possibility that, after your scout visits some stadiums, you will be certain that you can become the champion. <strong>You may still need to wait for the scout to visit the rest of the stadiums in order to be able to build an assignment for your team.</strong></p>

<p>Your task is to find out the minimal number of stadiums the scout has to visit for you to be certain about that your team securing the championship, or figure out that it's impossible to become the champion.</p>

### 입력

<p>The first line of input will contain the integer $N$ ($1 ≤ N ≤ 5 \cdot 10^4$), denoting the number of duels, players per team and stadiums.</p>

<p>The second line will contain $N$ integers $p_1 , p_2 , …, p_N$ ($1 ≤ p_i ≤ 10^6$), representing the prize money offered by stadiums $1, 2, \dots , N$, respectively.</p>

<p>The third line contains $N$ integers $b_1 , b_2 , \dots , b_N$ ($1 ≤ b_i ≤ 10^6$), $b_i$ representing the skill level reported by the scout of the opponent player in stadium $i$. (Note that this information already contains the skill levels of each of the players in the opponent team, so they are not given once again to remove redundancy).</p>

<p>The fourth line contains $N$ integers $a_1 , a_2 , \dots , a_N$ ($1 ≤ a_i ≤ 10^6$), representing the skill levels of the players in your team.</p>

### 출력

<p>Output a single integer - the minimum number of stadiums you need information about to be certain your team can be the champion.</p>

<p>Additionally, you should output $0$ in case you immediately know your team will be the champion in any case, or $-1$ if you can not find a winning strategy even after you have information of all the $N$ stadiums.</p>

### 제한

<ul>
	<li>$1 ≤ N ≤ 5 \cdot 10^4$.</li>
	<li>$1 ≤ a_i , b_i , p_i ≤ 10^6$ for all ($1 ≤ i ≤ N$).</li>
	<li>Additionally, the skill levels of all the players are distinct. In other words for any $(i, j)$ $a_i \ne b_j $ And for any $(i, j)$ ($i \ne j$) $a_i \ne a_j$ and $b_i \ne b_j$.</li>
</ul>
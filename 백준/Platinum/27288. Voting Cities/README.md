# [Platinum IV] Voting Cities - 27288

[문제 링크](https://www.acmicpc.net/problem/27288)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 71, 정답: 17, 맞힌 사람: 16, 정답 비율: 27.119%

### 분류

비트마스킹, 데이크스트라, 다이나믹 프로그래밍, 그래프 이론, 최단 경로

### 문제 설명

<p>The great Emperor, <em>Lord Pooty</em>, decided to retire and would like to hand over the crown to one of his many sons. In the spirit of democracy, he decided to do this with a vote! His kingdom consists of $N$ cities labelled from $0$ to $N - 1$. Of these $N$ cities, $K$ of them are voting cities where voting can be done. The $i$th voting city is $T_i$.</p>

<p>As a reponsible member of society, you decided that it is only right for you to do your civic duty. You are to travel to one of the designated voting cities to vote! There are $E$ roads that can be used. Road $j$ connects city $U_j$ to city $V_j$ <strong>in one direction</strong> and has a toll of $C_j$. Luckily, due to this event, local cities have opened a ticket system to reduce the cost of traveling.</p>

<p>There are $5$ different types of tickets to choose from, numbered from type $1$ to type $5$. A ticket of type $x$ will reduce the cost of the toll on a road by $(10x)\%$. In other words, the cost of the road will be multiplied by $\left(1 - \frac{x}{10}\right)$ if a ticket of type $x$ is used.</p>

<p>However, there are a few rules regarding the tickets. You cannot use more than one ticket on one road to stack the effects. You are only allowed to buy at most one of each ticket at the start of your journey. For example, you can choose to buy one type $1$ ticket and one type $2$ ticket but are not allowed to buy two type $2$ tickets. This is to prevent people from hoarding the tickets. You are only allowed to buy the tickets at the start of your journey.</p>

<p>You are a busy man and unfortunately, you do not know which city you may start your journey from, nor do you know the ticket prices. You have made a list of $Q$ possible situations, comprised of a starting city $S$ and ticket prices $P_1$, $P_2$, $P_3$, $P_4$ and $P_5$ for the $5$ tickets. <strong>It is possible that a certain ticket may not even be available, and in that case the ticket price will be $-1$.</strong></p>

<p>For each of these situations, find the minimum cost to one of the voting city if it is reachable by road. Do note that not every city is reachable from every other and you may have to walk..</p>

### 입력

<p>Your program must read from standard input.</p>

<p>The first line of input contains $3$ integers $N$, $E$ and $K$ representing the number of cities, number of roads and number of voting cities respectively. The second line contains $K$ integers, the $i$th one representing $T_i$, the $i$th voting city.</p>

<p>The next $E$ contain $3$ integers each. The $j$th of these lines consists of $U_j$, $V_j$ and $C_j$ respectively, representing a unidirectional road from $U_j$ to $V_j$ with cost $C_j$. <strong>It is guaranteed that $C_j$ is divisible by $10$.</strong></p>

<p>The next line contains a single integer $Q$, representing the number of situations to be considered.</p>

<p>The next $Q$ lines contain $6$ integers $S$, $P_1$, $P_2$, $P_3$, $P_4$ and $P_5$ representing the starting city and the prices of the tickets of type $1$ to type $5$ respectively. Note that the starting city and ticket prices can differ across the different situations provided.</p>

### 출력

<p>Your program must print to standard output.</p>

<p>Output $Q$ lines with $1$ integer on each line, representing the lowest cost to a voting city for each situation in the order provided in the input. If a path does not exist for a situation, print $-1$ instead.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 5000$</li>
	<li>$ 0 &le; E &le; 10000$</li>
	<li>$1 &le; Q &le; 100$</li>
	<li>$0 &le; K &le; N$</li>
	<li>$0 &le; T_i &lt; N$ for all $1 &le; i &le; K$</li>
	<li>$T_i \ne T_j$ for all $1 &le; i &lt; j &le; K$</li>
	<li>$1 &le; C_i &le; 10^9$ for all $1 &le; i &le; E$</li>
	<li>$C_i$ is a multiple of $10$ for all $1 &le; i &le; E$</li>
	<li>$0 &le; U_i , V_i &lt; N$ and $U_i \ne V_i$ for all $1 &le; i &le; E$</li>
	<li>$-1 &le; P_i &le; 10^9$ for all $1 &le; i &le; 5$</li>
</ul>
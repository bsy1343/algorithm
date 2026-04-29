# [Platinum I] Sweets - 33206

[문제 링크](https://www.acmicpc.net/problem/33206)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 34, 정답: 9, 맞힌 사람: 9, 정답 비율: 28.125%

### 분류

느리게 갱신되는 세그먼트 트리, 병렬 이분 탐색, 세그먼트 트리, 오일러 경로 테크닉, 이분 탐색, 자료 구조, 트리

### 문제 설명

<p>Sandu graduated from high school and decided to pursue his passion as a candy salesperson.</p>

<p>Balti, a city in Moldova, has $N$ markets, which are connected with streets between them. The marketplace has an interesting structure. Each market can be accessed from any other market by traveling through some number of streets, and there are exactly $N - 1$ streets. Also, Sandu is currently staying at market $1$. So, the markets form a rooted tree structure where market $1$ is the root.</p>

<p>Additionally, each market $i$ has a toughness level $t_i$ and a learning level $l_i$. Initially the learning level of each market is $0$, and Sandu has a selling skill level of $0$.</p>

<p>When Sandu visits market $i$, his selling skill level increases by $l_i$. Sandu has success at market $i$ if his selling skill level is at least $t_i$ (the market's toughness level). Note that Sandu's selling skill level increases as soon as he enters the market $i$, regardless of whether he was successful or not. This means his selling skill level increases before trying to do anything inside the market.</p>

<p>Also, as Balti is a really busy city, on each of the following $Q$ days there will be an event happening. On day $j$, event $j$ will happen. An event is described by two <strong>positive</strong> integers - $u_j$ and $x_j$ meaning that on day $j$, there will be an event at the market $u_j$ and the learning level for the corresponding market will be <strong>permanently</strong> increased by $x_j$. In other words, event $j$ means that on day $j$ the learning level will be increased by $x_j$ ($l_{u_j} := l_{u_j} + x_j$).</p>

<p>Sandu plans to visit some markets and sell candies in them. He will pick some market $k$ and will visit all markets on the path from the first market to market $k$, in that order. Sandu wants to succeed at as many markets as possible. He will continue his journey towards market $k$ regardless of whether he was successful or not. Additionally, every day, Sandu starts at market $1$ and his selling skill level resets, starting each day with a selling skill level of $0$.</p>

<p>For each day $j$, help Sandu find the largest number of markets he can be successful at, if he optimally picks the location of the final market of that day.</p>

### 입력

<p>The first line of input contains two integers $N$ and $Q$ ($1 ≤ N,Q ≤ 5 \cdot 10^5$).</p>

<p>The second line contains $N - 1$ integers that represent the rooted tree structure of the markets: $p_2 , \dots , p_N$, meaning that there exists an edge between $p_i$ and $i$, and $p_i$ is the parent of $i$.</p>

<p>Additionally for each $i$, the condition $1 ≤ p_i &lt; i$ is always satisfied.</p>

<p>The third line contains $N$ integers: $t_1 , t_2 , \dots , t_N$ ($0 ≤ t_i ≤ 10^9$) — the toughness level of the given markets.</p>

<p>Then, $Q$ lines follow, representing the events happening on day $j = 1, 2,...,Q$.</p>

<p>Line $j$ contains two integers — $u_j$ and $x_j$ describing the event for $j$ th day ($1 ≤ u_j ≤ N$, $1 ≤ x_j ≤ 10^9$).</p>

### 출력

<p>Output $Q$ lines - in the $j$-th line you should output the answer for $j$-th day.</p>

### 제한

<ul>
	<li>$1 ≤ N,Q ≤ 5 \cdot 10^5$.</li>
	<li>$1 ≤ p_i &lt; i$ is always satisfied.</li>
	<li>$0 ≤ t_i ≤ 10^9$ for all $i$ ($1 ≤ i ≤ N$).</li>
	<li>$1 ≤ u_j ≤ N$ for all $j$ ($1 ≤ j ≤ Q$).</li>
	<li>$1 ≤ x_j ≤ 10^9$ for all $j$ ($1 ≤ j ≤ Q$).</li>
</ul>
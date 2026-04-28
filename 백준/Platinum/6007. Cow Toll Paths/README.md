# [Platinum I] Cow Toll Paths - 6007

[문제 링크](https://www.acmicpc.net/problem/6007)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 78, 정답: 32, 맞힌 사람: 26, 정답 비율: 46.429%

### 분류

플로이드–워셜, 그래프 이론, 최단 경로

### 문제 설명

<p>Like everyone else, FJ is always thinking up ways to increase his revenue. To this end, he has set up a series of tolls that the cows will pay when they traverse the cowpaths throughout the farm.</p>

<p>The cows move from any of the N (1 &lt;= N &lt;= 250) pastures conveniently numbered 1..N to any other pasture over a set of M (1 &lt;= M &lt;= 10,000) bidirectional cowpaths that connect pairs of different pastures A_j and B_j (1 &lt;= A_j &lt;= N; 1 &lt;= B_j &lt;= N). FJ has assigned a toll L_j (1 &lt;= L_j &lt;= 100,000) to the path connecting pastures A_j and B_j.</p>

<p>While there may be multiple cowpaths connecting the same pair of pastures, a cowpath will never connect a pasture to itself. &nbsp;Best of all, a cow can always move from any one pasture to any other pasture by following some sequence of cowpaths.</p>

<p>In an act that can only be described as greedy, FJ has also assigned a toll C_i (1 &lt;= C_i &lt;= 100,000) to every pasture. The cost of moving from one pasture to some different pasture is the sum of the tolls for each of the cowpaths that were traversed plus a *single additional toll* that is the maximum of all the pasture tolls encountered along the way, including the initial and destination pastures.</p>

<p>The patient cows wish to investigate their options. They want you to write a program that accepts K (1 &lt;= K &lt;= 10,000) queries and outputs the minimum cost of trip specified by each query. Query i is a pair of numbers s_i and t_i (1 &lt;= s_i &lt;= N; 1 &lt;= t_i &lt;= N; s_i != t_i) specifying a starting and ending pasture.</p>

<p>Consider this example diagram with five pastures:</p>

<p>The &#39;edge toll&#39; for the path from pasture 1 to pasture 2 is 3. Pasture 2&#39;s &#39;node toll&#39; is 5.</p>

<p>To travel from pasture 1 to pasture 4, traverse pastures 1 to 3 to 5 to 4. This incurs an edge toll of 2+1+1=4 and a node toll of 4 (since pasture 5&#39;s toll is greatest), for a total cost of 4+4=8.</p>

<p>The best way to travel from pasture 2 to pasture 3 is to traverse pastures 2 to 5 to 3. This incurs an edge toll of 3+1=4 and a node toll of 5, for a total cost of 4+5=9.</p>

### 입력

<ul>
	<li>Line 1: Three space separated integers: N, M, and K</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer: C_i</li>
	<li>Lines N+2..N+M+1: Line j+N+1 contains three space separated integers: A_j, B_j, and L_j</li>
	<li>Lines N+M+2..N+M+K+1: Line i+N+M+1 specifies query i using two space-separated integers: s_i and &nbsp;t_i</li>
</ul>

### 출력

<ul>
	<li>Lines 1..K: Line i contains a single integer which is the lowest cost of any route from s_i to t_i</li>
</ul>
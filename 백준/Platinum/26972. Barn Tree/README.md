# [Platinum IV] Barn Tree - 26972

[문제 링크](https://www.acmicpc.net/problem/26972)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 535, 정답: 167, 맞힌 사람: 140, 정답 비율: 34.739%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그리디 알고리즘, 그래프 탐색, 트리, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍, 방향 비순환 그래프

### 문제 설명

<p>Farmer John&#39;s farm has $N$ barns ($2 \leq N \leq 2\cdot 10^5$) numbered $1 \dots N$. There are $N-1$ roads, where each road connects two barns and it is possible to get from any barn to any other barn via some sequence of roads. Currently, the $j$th barn has $h_j$ hay bales ($1\le h_j\le 10^9$).</p>

<p>To please his cows, Farmer John would like to move the hay such that each barn has an equal number of bales. He can select any pair of barns connected by a road and order his farmhands to move any positive integer number of bales less than or equal to the number of bales currently at the first barn from the first barn to the second.</p>

<p>Please determine a sequence of orders Farmer John can issue to complete the task in the minimum possible number of orders. It is guaranteed that a sequence of orders exists.</p>

### 입력

<p>The first line of input contains the value of $N.$</p>

<p>The second line of input contains the space-separated values of $h_j$ for $j = 1 \dots N$.</p>

<p>The final $N-1$ lines of input each contain two space-separated barn numbers $u_i \ v_i$, indicating that there is a bidirectional road connecting $u_i$ and $v_i$.</p>

### 출력

<p>Output the minimum possible number of orders, followed a sequence of orders of that length, one per line.</p>

<p>Each order should be formatted as three space-separated positive integers: the source barn, the destination barn, and the third describes the number of hay bales to move from the source to the destination.</p>

<p>If there are multiple solutions, output any.</p>

### 힌트

<p>In this example, there are a total of twelve hay bales and four barns, meaning each barn must have three hay bales at the end. The sequence of orders in the sample output can be verbally translated as below:</p>

<ol>
	<li>From barn $3$ to barn $2$, move $1$ bale.</li>
	<li>From barn $4$ to barn $2$, move $2$ bales.</li>
	<li>From barn $2$ to barn $1$, move $1$ bale.</li>
</ol>
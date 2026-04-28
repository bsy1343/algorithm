# [Platinum I] Tax - 31144

[문제 링크](https://www.acmicpc.net/problem/31144)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 깊이 우선 탐색, 최단 경로

### 문제 설명

<p>JB received his driver&#39;s license recently. To celebrate this fact, JB decides to drive to other cities in Byteland. There are $n$ cities and $m$ bidirectional roads in Byteland, labeled by $1,2,\dots,n$. JB is at the $1$-st city, and he can only drive on these $m$ roads. It is always possible for JB to reach every city in Byteland.</p>

<p>The length of each road is the same, but they are controlled by different engineering companies. For the $i$-th edge, it is controlled by the $c_i$-th company. If it is the $k$-th time JB drives on an edge controlled by the $t$-th company, JB needs to pay $k\times w_t$ dollars for tax.</p>

<p>JB is selecting his destination city. Assume the destination is the $k$-th city, he will drive from city $1$ to city $k$ along the shortest path, and minimize the total tax when there are multiple shortest paths. Please write a program to help JB calculate the minimum number of dollars he needs to pay for each possible destination.</p>

### 입력

<p>The input contains only a single case.</p>

<p>The first line of the input contains two integers $n$ and $m$ ($2 \leq n\leq 50$, $n-1\leq m \leq \frac{n(n-1)}{2}$), denoting the number of cities and the number of bidirectional roads.</p>

<p>The second line contains $m$ integers $w_1,w_2,\dots,w_m$ ($1\leq w_i\leq 10\,000$), denoting the base tax of each company.</p>

<p>In the next $m$ lines, the $i$-th line $(1 \le i \le m)$ contains three integers $u_i,v_i$ and $c_i$ ($1\leq u_i,v_i\leq n$, $u_i\neq v_i$, $1\leq c_i\leq m$), denoting  denoting an bidirectional road between the $u_i$-th city and the $v_i$-th city, controlled by the $c_i$-th company.</p>

<p>It is guaranteed that there are at most one road between a pair of city, and it is always possible for JB to drive to every other city.</p>

### 출력

<p>Print $n-1$ lines, the $k$-th ($1\leq k\leq n-1$) of which containing an integer, denoting the minimum number of dollars JB needs to pay when the destination is the $(k+1)$-th city.</p>
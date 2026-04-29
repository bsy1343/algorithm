# [Gold I] Beaverland - 34497

[문제 링크](https://www.acmicpc.net/problem/34497)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 9, 정답: 7, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 해 구성하기

### 문제 설명

<p>Busy Beaver wants to have a tour in Beaverland! Beaverland consists of $N$ cities and $M$ bidirectional roads between them. It is guaranteed that it is possible to travel between any pair of cities along the $M$ roads, and that all roads have length $1$.</p>

<p>So far, Busy Beaver has planned out his tour, and wishes to visit the cities $x_1, x_2, \dots, x_K$. He views his tour to be <em>interesting</em> if $$\mathrm{dist}(1,x_1) &lt; \mathrm{dist}(1,x_2) &lt; \dots &lt; \mathrm{dist}(1,x_K)$$ where $\mathrm{dist}(x, y)$ for two cities $x, y$ is equal to the length of the shortest path connecting the two cities.</p>

<p>However, it might not be the case that Busy Beaver's tour is currently interesting! To fix this, he can add up to $5 \cdot 10^5$ more roads between any pairs of cities. Each of the added roads is also bidirectional and has length $1$.</p>

<p>Determine whether it is possible to make Busy Beaver's tour interesting by adding some roads (possibly none). Additionally, if it is possible, provide any valid construction.</p>

### 입력

<p>Each test contains multiple test cases. The first line of input contains a single integer $T$ $(1 \leq T \leq 10^4)$, the number of test cases. The description of each test case follows.</p>

<p>The first line of each test case contains three integers $N,M,K$ ($1 \le K \le N, N-1 \le M \le 2 \cdot 10^5$) --- the total number of cities, roads, and the number of cities in Busy Beaver's tour, respectively.</p>

<p>The next line contains $K$ integers $x_1,x_2, \dots, x_K$ ($1 \le x_i \le N$, $x_i$ distinct) --- the cities that Busy Beaver plans to visit.</p>

<p>The $i$-th of the next $M$ lines contains two integers $u_i$ and $v_i$ ($1 \le u_i, v_i \le N$, $u_i \neq v_i$) --- indicating that there is a road between cities $u_i$ and $v_i$. It is guaranteed that there is at most $1$ edge between any two distinct cities.</p>

<p>The sum of $N$, the sum of $M$, and the sum of $K$ over all test cases all do not exceed $2 \cdot 10^5$.</p>

### 출력

<p>For each test case, if it is possible to make the tour interesting, the first line of output should contain an integer $L$ ($0 \leq L \leq 5 \cdot 10^5$) --- the number of added roads. Each of the next $L$ lines of output should then contain two integers $u_i,v_i$ ($1 \leq u_i , v_i \leq N$, $u_i \neq v_i$) representing a road to be added.</p>

<p>If there are multiple solutions, print any of them. Otherwise, if there is no solution, print a single integer $-1$ instead.</p>

<p><strong>Due to judging constraints, you may use at most $5 \cdot 10^5$ roads in total, over all test cases. It can be shown that this is enough to solve the problem.</strong></p>

### 힌트

<p>In the first test case, adding a road between cities $1, 2$ causes $dist(1,1) = 0, dist(1,2) = 1$, making the tour interesting.</p>

<p>In the second test case, it can be shown that the task is impossible.</p>

<p>In the third test case, by adding a road between cities $1, 3$ we have $dist(1,3) = 1, dist(1,5) = 2$, making the tour interesting.</p>

<p>In the fourth test case, the tour is already interesting, and no roads need to be added.</p>
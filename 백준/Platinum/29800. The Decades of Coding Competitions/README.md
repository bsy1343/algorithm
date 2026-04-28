# [Platinum III] The Decades of Coding Competitions - 29800

[문제 링크](https://www.acmicpc.net/problem/29800)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

자료 구조, 분리 집합, 그래프 이론

### 문제 설명

<p>It has been almost $15$ years since Sphinny became the premiere programming contestant by mastering the art of scheduling contests. She has grown alongside Coding Competitions and graduated into a programming contest organizer, and her Programming Club League (PCL) is the most popular sport in her city.</p>

<p>There are $\mathbf{N}$ bus stops in Sphinny&#39;s city, and $\mathbf{M}$ express bus routes. Each route bidirectionally connects two different bus stops, called their endpoints. Because of the popularity of PCL, the driver of each bus routes cheers for exactly one club.</p>

<p>Sphinny has to pick up the contest materials for the $j$-th contest at bus stop $\mathbf{P_j}$ and then the contest will be run in bus stop $\mathbf{C_j}$. She can only use the given bus routes to travel between them. Formally, a path for Sphinny to go from $\mathbf{P_j}$ to $\mathbf{C_j}$ is a list of bus routes such that each two consecutive routes have a common endpoint. Also the first route in the path has $\mathbf{P_j}$ as an endpoint and the last one has $\mathbf{C_j}$ as an endpoint. Notice that the same bus route can be used multiple times in a path. If Sphinny&#39;s path from $\mathbf{P_j}$ to $\mathbf{C_j}$ contains one or more bus routes whose driver cheers for club $c$, then club $c$ will join the contest. Otherwise, club $c$ will not join the contest. For organizational reasons, Sphinny needs the number of clubs in each contest to be an odd number.</p>

<p>Given the layout of Sphinny&#39;s city&#39;s bus routes and the contests&#39; details, find out for how many contests there exists a path for Sphinny to take that can ensure an odd number of clubs joining it.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow. The first line of each test case contains three integers $\mathbf{N}$, $\mathbf{M}$, and $\mathbf{Q}$: the number of bus stops, bus routes, and contests, respectively.</p>

<p>Then, $\mathbf{M}$ lines follow representing a different bus route each. The $i$-th of these lines contains three integers $\mathbf{U_i}$, $\mathbf{V_i}$, and $\mathbf{K_i}$, meaning that the $i$-th bus route connects bus stops $\mathbf{U_i}$ and $\mathbf{V_i}$ and its driver cheers for club $\mathbf{K_i}$.</p>

<p>Finally, the last $\mathbf{Q}$ lines represent a contest each. The $j$-th of these lines contains two integers $\mathbf{P_j}$ and $\mathbf{C_j}$, representing that materials for the $j$-th contest need to be picked up at bus stop $\mathbf{P_j}$ and the contest needs to be run at bus stop $\mathbf{C_j}$.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the number of contests for which Sphinny can find a path that ensures an odd number of clubs join it.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$1 \le \mathbf{U_i} \le \mathbf{N}$, for all $i$.</li>
	<li>$1 \le \mathbf{V_i} \le \mathbf{N}$, for all $i$.</li>
	<li>$\mathbf{U_i} \neq \mathbf{V_i}$, for all $i$</li>
	<li>$(\mathbf{U_i}, \mathbf{V_i}) \neq (\mathbf{U_j}, \mathbf{V_j})$ and $(\mathbf{U_i}, \mathbf{V_i}) \neq (\mathbf{V_j}, \mathbf{U_j})$, for all $i \neq j$. (No two bus routes have the same pair of endpoints.)</li>
	<li>$1 \le \mathbf{P_j} \le \mathbf{N}$, for all $j$.</li>
	<li>$1 \le \mathbf{C_j} \le \mathbf{N}$, for all $j$.</li>
	<li>$\mathbf{P_j} \neq \mathbf{C_j}$, for all $j$.</li>
</ul>
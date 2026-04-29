# [Platinum III] Watchdogs - 32583

[문제 링크](https://www.acmicpc.net/problem/32583)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 13, 맞힌 사람: 11, 정답 비율: 45.833%

### 분류

다이나믹 프로그래밍, 자료 구조, 최소 공통 조상, 트리, 트리에서의 다이나믹 프로그래밍, 희소 배열

### 문제 설명

<p>In a small town called Kocourkov, surrounded by hills and woods, a strange problem has appeared. The town, known for its cozy pubs and friendly people, had always been peaceful – until a problem with mice showed up.</p>

<p>But these weren’t just any mice. They were smart, quick and seemed to be everywhere at the same time. They had taken over the town’s favorite pubs, running through the rafters, nibbling on crumb, and causing a lot of trouble.</p>

<p>In Kocourkov, there are $N$ places and exactly $N - 1$ roads and it is possible to reach any place from any other place in Kocourkov via the roads. Each road connects a pair of places.</p>

<p>The town council held an emergency meeting in the largest pub U Nacpané Myši. They noticed that the mice are running across the city in a very particular pattern. Each mouse has exactly two lairs scattered across the city and runs only between its two lairs. Each lair is located in one of the places. It has also been observed that the mice are vulnerable about halfway through their usual path. Formally, if mouse’s lairs are in places $A$ and $B$ then the mouse is vulnerable at place $C$ if and only if $|d(C, A)−d(C, B)| ≤ 1$ and $C$ is on the path from $A$ to $B$. In this context, $d(X, Y )$ denotes the distance betwen places $X$ and $Y$ measured in the number of roads on a path from $X$ to $Y$. Therefore, there may be more than one place where a mouse is vulnerable and a mouse might also be vulnerable in its own lair. After long discussion, the ultimate solution was proposed. The town will place watchcats around the town. A watchcat can get rid of a mouse if the watchcat is on a place where the mouse is vulnerable. One watchcat can get rid of any number of mice. Watchcats are lazy, each of them will always sit on its chosen place, and it will not move away from it.</p>

<p>As purchasing watchcats is not cheap, the town council wants to minimize the amount of watchcats to buy. Help them with this task.</p>

### 입력

<p>First line of input consists of two numbers $N$, $K$ ($2 ≤ N ≤ 10^5$, $0 ≤ K ≤ 10^5$), the number of places in Kocourkov, and the number of mice present in Kocourkov.</p>

<p>The next $N - 1$ lines describe the road network in Kocourkov. Each of these lines contains two integers $U$, $V$ ($0 ≤ U, V ≤ N - 1$) indicating that the places $U$ and $V$ are connected by a direct road.</p>

<p>The next $K$ lines describe the pairs of lairs of the mice. On each of these lines, there are two numbers $P$, $Q$ ($0 ≤ P, Q ≤ N - 1$) representing the fact that a mouse has lairs in the places $P$ and $Q$. It is guaranteed that $P \ne Q$.</p>

### 출력

<p>Output a single number representing the minimal number of watchcats to distribute in Kocourkov which will guarantee that every mice is eventually caught.</p>
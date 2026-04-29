# [Platinum I] Bustling Busride - 35085

[문제 링크](https://www.acmicpc.net/problem/35085)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 2048 MB

### 통계

제출: 23, 정답: 14, 맞힌 사람: 14, 정답 비율: 60.870%

### 분류

그리디 알고리즘, 매개 변수 탐색, 세그먼트 트리, 이분 탐색, 자료 구조

### 문제 설명

<p>The university of Bithampton is served by exactly one bus line. On its way to the city centre, it serves several stops at which students may exit. Every student has a fixed bus stop where they want to exit.</p>

<p>It is Friday afternoon, $4$ PM, and as always, all the students want to go home, leading to quite a long queue at the bus stop. Fortunately, the bus line is served in regular intervals, with the first bus arriving at $4$ PM.</p>

<p>Whenever a bus arrives at the university, everyone in the queue tries to enter the bus, which makes the buses very crowded. This has led to numerous complaints where people tried to exit buses but were unable to because of the sheer amount of people. As a consequence, the bus company decided that at every stop which someone in the bus has as destination, everyone in the bus must exit it. Those who want to travel further enter again. For every time a passenger enters or exits the bus, the bus needs to wait $w$ seconds.</p>

<p>To offer the best service, the bus company wants to minimize the maximum time it takes anybody from 4 PM until they reach their destination. For each bus, the bus driver can decide how many people from the front of the queue enter the bus. The number of people that can enter a bus is unlimited. Help the bus drivers make the optimal decisions to achieve the company's goal.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with four integers $n$, $b$, $r$, and $w$ ($1\leq n, b \leq 10^5$, $1\leq r, w \leq 10^6$), the number of passengers, the number of bus stops, the time between the arrival of two buses at the university, and the delay for exiting and entering.</li>
<li>One line with \(b\) integers \(d_{i}\) (\(1 \le d_{i}, \sum d_{i} \leq 10^6\)), the travel time from the \((i-1)\)th bus stop to the \(i\)th bus stop (the \(0\)th bus stop is the university).</li>
<li>One line with \(n\) integers \(t_{i}\) (\(1 \leq t_{i} \leq b\)), indicating that the destination of the \(i\)th person in line is the $t_i$th bus stop.</li>
</ul>

<p>All times are given in seconds.</p>

### 출력

<p>Output the minimum number of seconds until every person in line has exited at their destination.</p>
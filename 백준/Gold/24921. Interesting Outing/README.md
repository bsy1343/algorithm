# [Gold III] Interesting Outing - 24921

[문제 링크](https://www.acmicpc.net/problem/24921)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 27, 정답: 16, 맞힌 사람: 15, 정답 비율: 60.000%

### 분류

브루트포스 알고리즘, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 트리

### 문제 설명

<p>You are hosting visitors from out of town, and want to take them out and show them the most interesting places in town.</p>

<p>There are $N$&nbsp;interesting sights you want to tour. You have identified $N-1$ interesting methods of transportation. Each method of transportation bidirectionally connects a pair of sights. Luckily, there is exactly one way to get from any interesting sight to another without using any transportation method more than once.</p>

<p>You know how much it would cost for the group to use each transportation method one time (you pay once per use). You can decide the starting and ending sights of the tour (they can be the same or different sights). You do not need to worry about the cost of getting to the starting point nor coming back from the ending point, only the cost of transportation between sights during the tour. What is the cheapest way to see all sights at least once each?</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$.&nbsp;$T$&nbsp;test cases follow. Each test case starts with a line containing a single integer&nbsp;$N$, the number of sights you want to tour. Then,&nbsp;$N-1$&nbsp;lines follow. The&nbsp;$i$-th of these lines contains three integers&nbsp;$A_i$,&nbsp;$B_i$, and&nbsp;$C_i$, representing that the&nbsp;$i$-th method of transportation can take your group from sight&nbsp;$A_i$&nbsp;to sight&nbsp;$B_i$&nbsp;or from sight&nbsp;$B_i$&nbsp;to sight&nbsp;$A_i$&nbsp;for a cost of&nbsp;$C_i$&nbsp;coins per usage.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;$x$ is the test case number (starting from 1) and&nbsp;$y$&nbsp;is an integer representing the minimum cost of a tour that visits each sight at least once.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>$1&le;A_i&lt;B_i&le;N$, for all $i$.</li>
	<li>It is possible to travel between any pair of sights using only the methods of transportation given in the input. (This and the previous limits imply the sights and transportation methods form an unrooted&nbsp;<a href="https://en.wikipedia.org/wiki/Tree_(graph_theory)" target="_blank">tree</a>.)</li>
	<li>$1&le;C_i&le;10^9$ for all $i$.</li>
</ul>

### 힌트

<p>In Sample Case #1 (as seen below), an optimal route (marked with a red line in the picture above) goes through the following sights:&nbsp;$2,3,1,3,4,5,4,6$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/6a950414-89c8-438a-ac60-d76ae6abb5e1/-/preview/" /></p>

<p>In Sample Case #2 (as seen above), the only change compared with the setup in Sample Case #1 is that the transportation between sights&nbsp;$1$&nbsp;and&nbsp;$3$&nbsp;got more expensive: from&nbsp;$10$&nbsp;to&nbsp;$35$. The route&nbsp;$2,3,1,3,4,5,4,6$&nbsp;costs&nbsp;$150$&nbsp;in this scenario and it is not optimal. The optimal route is&nbsp;$2,3,4,6,4,5,4,3,1$&nbsp;instead (also marked in red in the picture).</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/1bc374c7-9284-47ae-bb3f-abc6b26d00e8/-/preview/" /></p>

<p>Notice in Sample Case #3 that the answer may be larger than $2^{32}$.</p>
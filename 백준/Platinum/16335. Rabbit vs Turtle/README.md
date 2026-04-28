# [Platinum III] Rabbit vs Turtle - 16335

[문제 링크](https://www.acmicpc.net/problem/16335)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 84, 정답: 18, 맞힌 사람: 15, 정답 비율: 26.786%

### 분류

이분 탐색, 데이크스트라, 그래프 이론, 누적 합, 최단 경로

### 문제 설명

<p>A rabbit and a turtle decided to race each other. Since the turtle is from Craiova and the rabbit is from Ardeal, the turtle is obviously faster than the rabbit. Our goal is to help the rabbit win the race.</p>

<p>The race is held on a graph with N nodes and M edges. The race starts at node 1 and ends at node N. Both the rabbit and the turtle decided beforehand to select the path which they are going to use (each one of them with his own path). Therefore, they know the graph, the paths and also the time it takes for each one of them to cross each edge of the graph.</p>

<p>The turtle may be faster than the rabbit, but it&rsquo;s still a turtle (let&rsquo;s call it George). George selects some nodes on his path where he decides to sleep for a while. If at any moment in time he realizes that the rabbit cheats, George will stop sleeping and will go to the finish without any further rest.</p>

<p>The rabbit (let&rsquo;s call it Stan) has only one advantage. Stan has a great-great-great-. . . ...-great grandmother who is a fox, therefore he has a sly side. Stan does not intend to keep his promise about the path (but George does). At some point, his plan is to change the path he is initially assigned and take the shortest path to node N. The only problem is that he has to be smart about it. The moment George discovers that Stan is cheating, he will stop his sleeping activities, which is not good.</p>

<p>Stan can only change his path when he is in a node (obviously not when he is on an edge). He does not know George&rsquo;s sleeping schedule, but you do!!! Compute the number of moments when Stan can change his path such that he will win the race. The moment Stan cheats, George will discover immediately as long as he is not sleeping. If he is sleeping during that time, he will find out upon waking up.</p>

### 입력

<p>The first line contains two numbers N and M. The next M lines will describe the graph by (A, B, T, R): there is an edge from node A to node B. The turtle will cross the edge in T units of time, while the rabbit will do it in R units of time. The i-th such edge is considered to be the edge with index i.</p>

<p>The next line contains a number P T, the number of nodes in George&rsquo;s path. The next P T lines will describe the path by (edge index, sleep): the index of the next edge George is going to use and the number of time units he is going to sleep after using that edge. The sleeping value for the last edge is irrelevant since the turtle will already reach the finish.</p>

<p>The next line contains a number P R, the number of edges in Stan&rsquo;s initial path. The last line will contain P R values, the indices of edges Stan is going to use.</p>

### 출력

<p>The output contains on the first line one value: x, the number of moments (nodes on the path) when Stan can cheat. The second line contains x numbers in ascending order, the indices of the nodes where Stan can cheat.</p>

### 제한

<ul>
	<li>2 &le; N &le; 100.000</li>
	<li>1 &le; P R, P T &lt; 100.000</li>
	<li>1 &le; M &le; 200.000</li>
	<li>1 &le; T, R &le; 1.000.000.000</li>
	<li>0 &le; sleep &le; 1.000.000.000</li>
	<li>The edges from the input that describe the paths are given in the correct order.</li>
	<li>The nodes in the turtle&rsquo;s path do not repeat.</li>
	<li>The nodes in the rabbit&rsquo;s path do not repeat.</li>
	<li>If the rabbit and the turtle arrive at the finish in the same time, the rabbit wins.</li>
	<li>If the rabbit cheats in the exact moment when the turtle goes to sleep, the turtle will first fall asleep and only after waking up he will realize about the cheating.</li>
	<li>The rabbit is considered to cheat ONLY if he changes the direction of the path and the new path that he will take is strictly faster than the original one (otherwise, there is no point to cheat)</li>
	<li>The cheating path may have common nodes with the original path. The only restriction is that in the exact moment of cheating, the rabbit has to take a different node. He may even go back to the previous node if he has an edge that allows that.</li>
</ul>
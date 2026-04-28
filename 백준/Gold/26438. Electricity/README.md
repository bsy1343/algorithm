# [Gold IV] Electricity - 26438

[문제 링크](https://www.acmicpc.net/problem/26438)

### 성능 요약

시간 제한: 40 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 15, 맞힌 사람: 15, 정답 비율: 93.750%

### 분류

방향 비순환 그래프, 깊이 우선 탐색, 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Ben works as an engineer in a city with $\mathbf{N}$ electric junctions. These junctions form a network and can be visualised as a connected graph with $\mathbf{N}$ vertices and $\mathbf{N}-1$ edges. The city is facing a power outage, due to which none of the junctions are receiving electricity, and Ben is in charge of handling the situation.</p>

<p>Each junction has a fixed electric capacity. $\mathbf{A_i}$ is the electric capacity of the $i$-th junction. Due to resource constraints, Ben can provide electricity to <i>only one</i> junction, but other junctions can receive electricity depending on their connections and capacities. If the $i$-th junction receives electricity, then it will also get transmitted to all the junctions directly connected to the $i$-th junction whose capacity is <i>strictly less</i> than $\mathbf{A_i}$. Transmission stops if no eligible junction is present. Help Ben determine the maximum number of junctions that can receive electricity.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow.</p>

<p>The first line of each test case contains an integer $\mathbf{N}$ which represents the number of junctions in the city.</p>

<p>The next line contains $\mathbf{N}$ integers. The $i$-th integer is $\mathbf{A_i}$, which is the electric capacity of the $i$-th junction.</p>

<p>The next $\mathbf{N}-1$ lines each contain two integers $\mathbf{X_i}$ and $\mathbf{Y_i}$, meaning that the junctions $\mathbf{X_i}$ and $\mathbf{Y_i}$ are directly connected to each other.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the maximum number of junctions that can receive electricity.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$1 \le \mathbf{A_i} \le 10^9$, for all $i$.</li>
	<li>$1 \le \mathbf{X_i}, \mathbf{Y_i} \le \mathbf{N}$, for all $i$.</li>
	<li>All the junctions are part of a single connected network.</li>
</ul>
# [Gold V] Water Container System - 26429

[문제 링크](https://www.acmicpc.net/problem/26429)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 20, 맞힌 사람: 18, 정답 비율: 66.667%

### 분류

애드 혹, 너비 우선 탐색, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 물리학, 누적 합

### 문제 설명

<p>There is a water container system with $\mathbf{N}$ identical containers, which can be represented as a tree, where each container is a vertex. The containers are connected to each other with $\mathbf{N}-1$ bidirectional pipes. Two containers connected to each other are always placed on adjacent levels. Formally, if two containers $a$ and $b$ are connected to each other, then $|level_a - level_b | = 1$. Container $1$ is placed at the bottommost level. Each container is connected to exactly one container on the level below (the only exception is container $1$, which has no connections below it), but can be connected to zero or more containers on the level above. The maximum capacity of each container is $1$ liter, and initially all the containers are empty. Assume that the pipe has a capacity of $0$ liters. In other words, they do not store any water, but only allow water to pass through them in any direction.</p>

<p>Consider the following diagram which is an example of a water container system:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26429.%E2%80%85Water%E2%80%85Container%E2%80%85System/302ff579.png" data-original-src="https://upload.acmicpc.net/ca649fe5-41b6-429c-b3b1-9a4b98e8e2c8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 308px; height: 203px;" /></p>

<p>The first level of the system consists of a single container, container $1$ (root). Container $1$ is connected to container $2$ and container $3$, which are present in the above level, level $2$. Container $2$ is also connected to container $4$, which is present at level $3$.</p>

<p>You are given $\mathbf{Q}$ queries. Each query contains a single integer $i$ which represents a container. For each query, add an additional $1$ liter of water in container $i$.</p>

<p>The following diagram illustrates the flow of the water in the system in different conditions:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26429.%E2%80%85Water%E2%80%85Container%E2%80%85System/a834d4d3.png" data-original-src="https://upload.acmicpc.net/bb3805e6-b3fc-4c0b-b97b-cb372ca68fe7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 1084px; height: 854px;" /></p>

<p>In step $1$, after adding $1$ liter of water in container $3$, the water flows downward because the water containers at the lower level are still empty.</p>

<p>In step $2$, after adding $1$ liter of water in container $3$, the water flows downward, but as the container $1$ is already filled completely, the water is distributed evenly between water containers $2$ and $3$.</p>

<p>In step $3$, after adding $1$ liter of water in container $3$, the water containers $2$ and $3$ are completely filled.</p>

<p>In step $4$, after adding $1$ liter of water in container $3$, the water is pushed up to water container $4$, which is then completely filled.</p>

<p>As illustrated in the example above, containers at the same level will have the same amount of water. Find the number of water containers that are completely filled after processing all the queries.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow.</p>

<p>The first line of each test case contains the two integers $\mathbf{N}$ and $\mathbf{Q}$, where $\mathbf{N}$ is the number of containers and $\mathbf{Q}$ is the number of queries.</p>

<p>The next $\mathbf{N}-1$ lines contain two integers $i$ and $j$ ($1 \le i, j \le \mathbf{N}$, and $i &ne; j$) meaning that the $i$-th water container is connected to the $j$-th water container.</p>

<p>Each of the next $\mathbf{Q}$ lines contain a single integer $i$ ($1 \le i \le \mathbf{N}$) that represents the container to which $1$ liter of water should be added.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the number of water containers that are completely filled after processing all the queries.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$1 \le \mathbf{Q} \le \mathbf{N}$.</li>
	<li>It is guaranteed that the given water container system is a tree.</li>
</ul>
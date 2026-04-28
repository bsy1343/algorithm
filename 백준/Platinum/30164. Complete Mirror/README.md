# [Platinum II] Complete Mirror - 30164

[문제 링크](https://www.acmicpc.net/problem/30164)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 13, 맞힌 사람: 10, 정답 비율: 31.250%

### 분류

너비 우선 탐색, 센트로이드, 그래프 이론, 그래프 탐색, 트리

### 문제 설명

<p>You have given tree consist of $n$ vertices. Select a vertex as root vertex that satisfies the condition below.</p>

<ul>
	<li>For all vertices $v_{1}$ and $v_{2}$, if $distance$($root$, $v_{1}$) $= distance$($root$, $v_{2})$ then $degree$($v_{1}$) $= degree$($v_{2}$), where $degree$ means the number of vertices connected to that vertex, and $distance$ means the number of edges between two vertices.</li>
</ul>

<p>Determine and find if there is such root vertex in the tree. If there are multiple answers, find any of them.</p>

### 입력

<p>The first line contains a single integer $n$ ($1 \le n \le 10^{5}$) --- the number of vertices.</p>

<p>Each of the next $n-1$ lines contains two integers $v_{i}$ and $u_{i}$ ($1 \le v_{i} \lt u_{i} \le n$) --- it means there is an edge exist between $v_{i}$ and $u_{i}$. It is guaranteed that the graph forms tree.</p>

### 출력

<p>If there is such root vertex exists, print any of them. Otherwise, print $-1$.</p>

### 힌트

<p style="text-align: center;">This is the picture for the first example. $1$, $5$, $7$ also can be a valid answer. <img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30164.%E2%80%85Complete%E2%80%85Mirror/3d936cc2.png" data-original-src="https://upload.acmicpc.net/7e3e01b1-a196-407e-9cc5-1b42b8c26d85/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 304px; height: 272px;" /></p>

<p>This is the picture for the second example. You can see that it&#39;s impossible to find such root vertex.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30164.%E2%80%85Complete%E2%80%85Mirror/f417e379.png" data-original-src="https://upload.acmicpc.net/dfd00530-69e7-444d-ba27-98aa5dcf4180/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 197px;" /></p>
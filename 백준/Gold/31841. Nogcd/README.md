# [Gold I] Nogcd - 31841

[문제 링크](https://www.acmicpc.net/problem/31841)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 96, 정답: 37, 맞힌 사람: 34, 정답 비율: 39.080%

### 분류

수학, 그래프 이론, 그래프 탐색, 정수론, 깊이 우선 탐색

### 문제 설명

<p>Boss, if $N&le;30\, 000$, you should try to optimise the $N^2$ solution. <em>(Friedrich Nietzsche)</em></p>

<hr />
<p>Let $G$ be a undirected connected graph with $N$ nodes and $M$ edges. Label each of the $M$ edges with a <strong>distinct</strong> integer from $1$ to $M$. For each node with degree greater than $1$, the greatest common divisor of its incident edges&#39; labels should be $1$.</p>

### 입력

<p>The first line contains two integers $N$ and $M$.</p>

<p>The next $M$ lines contain two integers $u$ and $v$, representing two nodes that share an edge.</p>

### 출력

<p>Print $M$ lines, each containing three integers $u$, $v$ and $c$ corresponding to an edge with label $c$ between $u$ and $v$.</p>

### 제한

<ul>
	<li>$1&le;N&le;10^5$</li>
	<li>$1&le;M&le;220\, 000$</li>
	<li>There are no self-loops or multiple edges in the graph.</li>
</ul>
# [Platinum II] Hamiltonian Path - 23139

[문제 링크](https://www.acmicpc.net/problem/23139)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 48, 정답: 14, 맞힌 사람: 11, 정답 비율: 28.205%

### 분류

해 구성하기, 수학, 정수론

### 문제 설명

<p>You are given a directed graph of $n$ vertices numbered from $0$ to $n - 1$. You are also given two integers $p$ and $q$ such that $1 \leq p, q \leq n$.</p>

<p>The edges of the graph are constructed as follows: for every vertex $i$,</p>

<ul>
	<li>if $i + p &lt; n$, then there is an edge from $i$ to $i + p$;</li>
	<li>if $i - q \geq 0$, then there is an edge from $i$ to $i - q$.</li>
</ul>

<p>Obviously, the graph has exactly $(n - p) + (n - q)$ edges.</p>

<p>Find any Hamiltonian path in this graph, or determine that it does not exist.</p>

<p>Recall that a Hamiltonian path is a path that visits every vertex exactly once.</p>

### 입력

<p>The first line of input contains an integer $T$ ($1 \leq T \leq 10^4$), the number of test cases.</p>

<p>Each test case consists of a single line containing three integers: $n$, $p$, and $q$ ($1 \leq p, q \leq n \leq 10^6$).</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $10^6$.</p>

### 출력

<p>For each test case, print a single line containing $n$ integers that represent the order of vertices in a Hamiltonian path, or print $-1$ if it does not exist.</p>

<p>If there are multiple solutions, print any one of them.</p>
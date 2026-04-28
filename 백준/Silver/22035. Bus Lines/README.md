# [Silver IV] Bus Lines - 22035

[문제 링크](https://www.acmicpc.net/problem/22035)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 76, 정답: 48, 맞힌 사람: 41, 정답 비율: 67.213%

### 분류

그래프 이론, 해 구성하기

### 문제 설명

<p>After many years without any public transport, the town Krockholm will finally get a network of bus lines. The plans are still on the drawing board, but it has been decided that there shall be $n$ stations labelled $1$ to $n$, and $m$ bus lines where each line connects two stations. The only thing remaining is to decide which pairs of stations should be connected. One important requirement is that it should be possible to get from any station to any other. In addition to this, someone had the brilliant idea that the bus lines should be labelled by the sum of their endpoints. This means that all of these sums must be different.</p>

<p>You are given two integers $n$ and $m$. Construct a graph with $m$ edges and $n$ vertices labelled $1$ to $n$, such that:</p>

<ol>
	<li>The graph is connected.</li>
	<li>The sums of edge endpoints are distinct.</li>
</ol>

### 입력

<p>The input consists of a single line containing two integers $n$ and $m$ ($2 \leq n \leq 100$, $1 \leq m \leq 10^4$).</p>

### 출력

<p>If it is not possible to construct a graph with the given properties, print &quot;<code>-1</code>&quot;. Otherwise, print $m$ lines where the $i$&#39;th line contains two integers $a_i$, $b_i$, the endpoints of the $i$&#39;th edge. If there are many possible solutions, any one of them will be accepted.</p>
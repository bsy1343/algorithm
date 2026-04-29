# [Gold II] Divido Travel - 35134

[문제 링크](https://www.acmicpc.net/problem/35134)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

그래프 이론, 데이크스트라, 최단 경로

### 문제 설명

<p>There is a connected weighted graph with $N$ vertices, numbered from $1$ to $N$, and $M$ edges, numbered from $1$ to $M$. Edge $i$ connects vertex $U_i$ and vertex $V_i$ bidirectionally with weight $W_i$.</p>

<p>You want to travel from vertex $1$ to vertex $2$, then from vertex $2$ to vertex $3$. You are allowed to visit any vertex or any edge more than once. The cost of your entire travel is the sum of the weights you passed through.</p>

<p>There is, however, a catch, in which every time you pass through an edge, its weight will be halved then rounded up to the nearest integer. Formally, if its weight is previously $w$, then it will change into $\lceil \frac{w}{2} \rceil$ after you pass through it.</p>

<p>Calculate the minimum cost of your entire travel.</p>

### 입력

<p>The first line contains an integer $N$ and $M$ ($3 \leq N \leq 100000$; $N - 1 \leq M \leq 200000$). Each of the next $M$ lines contains $U_i$, $V_i$, and $W_i$ ($1 \leq U_i &lt; V_i \leq N$; $1 \leq W_i \leq 10^9$) describing an edge. The graph you are given contains no multi-edges.</p>

### 출력

<p>Output the cost of your entire travel in a single line.</p>

### 힌트

<p><em>Explanation of Sample 1:</em> The graph can be illustrated as follows.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35134.%E2%80%85Divido%E2%80%85Travel/812c6793.png" data-original-src="https://boja.mercury.kr/assets/problem/35134-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 156px; height: 125px;"></p>

<p>You can travel from vertex $1$ to vertex $2$ by traversing the vertices $1 \to 4 \to 5 \to 2$. The weights of the traversed edges are changed into $3$, $1$, and $1$ respectively.</p>

<p>Then, you travel from vertex $2$ to vertex $3$ by traversing the vertices $2 \to 5 \to 6 \to 3$. The cost of the entire travel is $5+1+2+1+1+1 = 11$.</p>
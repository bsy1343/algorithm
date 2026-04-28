# [Platinum III] Jellyfish - 20998

[문제 링크](https://www.acmicpc.net/problem/20998)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 80, 정답: 26, 맞힌 사람: 24, 정답 비율: 33.333%

### 분류

많은 조건 분기, 그래프 이론

### 문제 설명

<p>Everyone knows that at Jagiellonian University we do love plants a lot. We created hundreds of problems about trees, forests and even cacti! Unfortunately, problems about animals are not that popular. Today we want to prove that we love animals as well.</p>

<p>We say that a graph is a <em>jellyfish</em>, if it is a simple connected undirected graph with equal number of vertices and edges. You are given a jellyfish $J$ with $n$ vertices. For an arbitrary subset of vertices $S \subseteq J$, we say that $S$ is an <em>awesome</em> subset if for every $T \subseteq S$ there exists a <strong>connected</strong> subgraph of the jellyfish which contains every vertex from $T$ and does not contain any other vertex from $S$.</p>

<p>What is the maximum possible size of an awesome subset of $J$?</p>

### 입력

<p>The first line of input contains the number of test cases $z$. The descriptions of the test cases follow.</p>

<p>The first line of each test case contains one integer $n$ ($3 \leq n \leq 100\,000$) -- the number of vertices of the jellyfish.</p>

<p>The next $n$ lines contain two integers $u_i$, $v_i$ ($1 \leq u_i \neq v_i \leq n$) each, corresponding to the jellyfish edges. It is guaranteed that the given graph is a jellyfish, and every two vertices are connected by at most one edge.</p>

<p>The total number of vertices in all test cases does not exceed $10^6$.</p>

### 출력

<p>For each test case, output a single line which contains a single integer -- the maximum possible size of an awesome subset of the jellyfish.</p>
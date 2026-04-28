# [Gold III] Build the Graph - 19071

[문제 링크](https://www.acmicpc.net/problem/19071)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 84, 정답: 30, 맞힌 사람: 30, 정답 비율: 42.254%

### 분류

애드 혹, 조합론, 그래프 이론, 그리디 알고리즘, 수학

### 문제 설명

<p>For an undirected graph $G$ with $n$ nodes and $m$ edges, we can define the distance $\textit{dist} (i, j)$ as the length of the shortest path between nodes $i$ and $j$. The length of a path is equal to the number of edges in the path. If there is no path between $i$ and $j$, we set $\textit{dist} (i, j)$ equal to $n$.</p>

<p>Then, we can define $w_G$, the weight of the graph $G$, as $\sum_{i = 1}^n \sum_{j = 1}^n \text{dist} (i, j)$.</p>

<p>Now, given $n$ nodes and no edges initially, we will choose no more than $m$ pairs of nodes $(i, j)$ ($i \neq j$) and add an edge between the respective nodes for every chosen pair. This way, we can get an undirected graph $G$ with $n$ nodes and no more than $m$ edges.</p>

<p>Your task is to find the minimal possible value of $w_G$ after such construction.</p>

### 입력

<p>The first line of the input contains two integers $n$ and $m$ ($1 \leq n \leq 10^6$, $1 \leq m \leq 10^{12}$).</p>

### 출력

<p>Print a single line with a single integer: the minimum possible value of $w_G$.</p>

### 힌트

<p>In the example, we can choose to add edges $(1, 2)$, $(1, 4)$, $(2, 4)$, $(2, 3)$ and $(3, 4)$.</p>
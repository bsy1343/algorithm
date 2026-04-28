# [Platinum I] Graph Coloring 2 - 19467

[문제 링크](https://www.acmicpc.net/problem/19467)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 49, 정답: 12, 맞힌 사람: 10, 정답 비율: 76.923%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 부분집합의 합 다이나믹 프로그래밍, 그래프 이론

### 문제 설명

<p>You are given an undirected graph with $n$ vertices numbered $0$ through $n - 1$. Obviously, the set of vertices have $2^n - 1$ non-empty subsets. For a non-empty subset $S$, a proper coloring of $S$ is a way to assign each vertex in $S$ a color, so that no two vertices in $S$ with the same color are directly connected by an edge. Assume we used $k$ different kinds of colors in a proper coloring. The <em>chromatic number</em> of subset $S$ is the minimum possible $k$ among all the proper colorings of $S$.</p>

<p>Now your task is to compute the chromatic number of every non-empty subset of $n$ vertices.</p>

### 입력

<p>The first line contains an integer $T$. Then $T$ test cases follow.</p>

<p>The first line of each test case contains an integer $n$. Each of then next $n$ lines contains a string consisting of &#39;<code>0</code>&#39; and &#39;<code>1</code>&#39;. For $0 \le i \le n - 1$ and $0 \le j \le n - 1$, if the $j$-th character of the $i$-th line is &#39;<code>1</code>&#39;, then vertices $i$ and $j$ are directly connected by an edge, otherwise they are not directly connected.</p>

<p>The $i$-th character of the $i$-th line is always &#39;<code>0</code>&#39;. The $i$-th character of the $j$-th line is always the same as the $j$-th character of the $i$-th line.</p>

<p>For all test cases, $1 \le n \le 18$. There are no more than $100$ test cases with $1 \le n \le 10$, no more than $3$ test cases with $11 \le n \le 15$, and no more than $2$ test cases with $16 \le n \le 18$.</p>

### 출력

<p>For each test case, print an integer on a separate line. This integer is determined as follows: We define the identity number of subset $S$ as $\mathit{id} (S) = \sum_{v \in S} 2^v$. Let the chromatic number of $S$ be $f_{\mathit{id} (S)}$. You need to output $$\left(\sum\limits_{\mathit{id} (S) = 1}^{2^n - 1} f_{\mathit{id} (S)} \cdot 233^{\mathit{id} (S)}\right) \bmod 2^{32}\text{.}$$</p>

### 힌트

<p>For the first test case, $ans[1..15] = \{1, 1, 2, 1, 2, 2, 3, 1, 1, 1, 2, 2, 2, 2, 3\}$.</p>
# [Gold IV] Doesn't Contain Loops or Multiple Edges - 23676

[문제 링크](https://www.acmicpc.net/problem/23676)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 14, 맞힌 사람: 13, 정답 비율: 81.250%

### 분류

그래프 이론, 자료 구조, 그리디 알고리즘, 정렬, 집합과 맵

### 문제 설명

<p><strong>Coloring</strong> of a labeled undirected graph with $n$ vertices in $k$ colors is an assignment of colors to its vertices, such that each vertex receives an integer color $x$ ($1 \leq x \leq k$) and no two adjacent vertices have the same color. A coloring can be treated as an array of integers from $1$ to $k$ of length $n$, $i$-th element of which corresponds to the color of the $i$-th vertex of the graph.</p>

<p>Coloring $b$ is <strong>monotonic</strong> to coloring $a$ of the same graph if \uline{exactly} one of the following statements holds:</p>

<ol>
	<li>$\forall_{1 \leq i \leq n} a_i \leq b_i$</li>
	<li>$\forall_{1 \leq i \leq n} a_i \geq b_i$</li>
</ol>

<p>Note that a coloring is not monotonic to itself because in that case both statements above hold.</p>

<p>You are given a labeled undirected graph and its coloring $a$ in $k$ colors. Is there a coloring $b$ of the given graph in $k$ colors which is monotonic to $a$?</p>

### 입력

<p>The first line contains three integers $n$, $m$ and $k$ ($1 \leq n, m, k \leq 3 \cdot 10^5$), the number of vertices in the graph, the number of the edges in the graph and the number of colors, respectively.</p>

<p>The second line contains $n$ integers $a_i$ ($1 \leq c_i \leq k$), the colors of vertices.&nbsp;</p>

<p>$m$ lines follow. $i$-th of them contains two integers $u_i$ and $v_i$ ($1 \leq u_i &lt; v_i \leq n$), describing an edge between vertices $u_i$ and $v_i$.</p>

<p>The graph doesn&#39;t contain loops or multiple edges. It is guaranteed that the array $a$ describes a valid coloring of the given graph.</p>

### 출력

<p>Print <code>1</code> if there exists a coloring $b$ monotonic to $a$ and print <code>0</code> otherwise.</p>
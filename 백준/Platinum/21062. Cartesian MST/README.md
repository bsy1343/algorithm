# [Platinum III] Cartesian MST - 21062

[문제 링크](https://www.acmicpc.net/problem/21062)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 63, 정답: 33, 맞힌 사람: 32, 정답 비율: 74.419%

### 분류

자료 구조, 그래프 이론, 분리 집합, 최소 스패닝 트리

### 문제 설명

<p>Let $G$ and $H$ be two weighted undirected simple graphs. We define the <em>cartesian product</em> of the two graphs, $G \square H$, as the graph whose vertex set is the cartesian set product of the vertex sets of the two graphs $V(G) \times V(H)$ and in which there is an edge between vertices $(u_1, v_1)$ and $(u_2, v_2)$ if and only if:</p>

<ul>
	<li>$v_1 = v_2$ and there is an edge $(u_1, u_2)$ in $G$. In this case, the edge$((u_1, v_1), (u_2, v_2))$ in $G \square H$ has the same weight as the edge $(u_1, u_2)$ in $G$.</li>
	<li>or $u_1 = u_2$ and there is an edge $(v_1, v_2)$ in $H$. In this case, the edge$((u_1, v_1), (u_2, v_2))$ in $G \square H$ has the same weight as the edge $(v_1, v_2)$ in $H$.</li>
</ul>

<p>You are given two connected graphs $G$ and $H$. Compute the total weight of the minimum spanning tree of $G \square H$.</p>

### 입력

<p>The first line contains four integers $n_1, m_1, n_2, m_2$ ($2 \leq n_1, n_2 \leq 10^5$; $1 \leq m_1, m_2 \leq 10^5$): the number of vertices of $G$, the number of edges of $G$, the number of vertices of $H$, and the number of edges of $H$, respectively.&nbsp;</p>

<p>Each of the next $m_1$ lines contains three integers $u_i, v_i, w_i$ ($0 \leq u_i, v_i \leq n_1 - 1$; $1 \leq w_i \leq 10^8$), describing an edge of $G$ between vertices $u_i$ and $v_i$ with weight $w_i$.</p>

<p>Each of the next $m_2$ lines contains three integers $u_i, v_i, w_i$ ($0 \leq u_i, v_i \leq n_2 - 1$; $1 \leq w_i \leq 10^8$), describing an edge of $H$ between vertices $u_i$ and $v_i$ with weight $w_i$.</p>

<p>It is guaranteed that graphs $G$ and $H$ are simple and connected. Recall that a graph is <em>simple</em> if there are no edges between a vertex and itself, and there is at most one edge between any two vertices.</p>

### 출력

<p>Output one integer: the weight of the minimum spanning tree of $G \square H$.</p>
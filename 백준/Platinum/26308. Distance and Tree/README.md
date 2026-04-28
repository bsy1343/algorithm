# [Platinum V] Distance and Tree - 26308

[문제 링크](https://www.acmicpc.net/problem/26308)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 98, 정답: 41, 맞힌 사람: 34, 정답 비율: 47.887%

### 분류

자료 구조, 애드 혹, 세그먼트 트리, 해 구성하기, 트리를 사용한 집합과 맵

### 문제 설명

<p>Graph problems are popular in competitive programming, and problems related to distanceis and trees appear frequently. Let us start with some definitions.</p>

<p>A <em>set</em> is a collection of distinct elements. An <em>undirected simple graph</em> $G$ is a pair $(V, E)$, where $V$ is a set and $E$ is a set of unordered pairs of $V$&rsquo;s elements. For a graph $G = (V, E)$, we call $V$ as $G$&rsquo;s vertex set and $E$ as $G$&rsquo;s edge set. Elements in $V$ are vertices, and elements in $E$ are edges.</p>

<p>Let $u$ and $v$ be vertices in $V$. A path from $u$ to $v$ of length $k$ is a sequence of edges $e_1, e_2, \dots , e_k &isin; E$ such that there exists a sequence of distinct vertices, $v_1, \dots , v_{k+1}$, satisfying the following conditions.</p>

<ul>
	<li>$u = v_1$.</li>
	<li>$v = v_{k+1}$.</li>
	<li>$e_i = \{v_i , v_{i+1}\}$.</li>
</ul>

<p>If $p$ is a path from $u$ to $v$, then $u$ and $v$ are <em>connected</em> by $p$.</p>

<p>We can define distances and trees now. Given two vertices $u, v &isin; V$, the distance $&delta;(u, v)$ from $u$ to $v$ is $0$ if $u = v$. If there exists a path from $u$ to $v$, then $&delta;(u, v)$ is the minimum number of edges required to form a path from $u$ to $v$. Otherwise, $&delta;(u, v) = &infin;$. A <em>tree</em> is an undirected graph in which any distinct two vertices $u$ and $v$ are connected by exactly one path.</p>

<p>Danny gives you a sequence of non-negative integers $d_1, d_2, \dots , d_n$ and asks you to construct a tree $G_T = (V_T , E_T )$ satisfying the following conditions.</p>

<ul>
	<li>The vertex set $V_T = \{p_1, \dots , p_n\}$ is a set of points on a two dimensional Euclidean plane. For $1 &le; k &le; n$, the coordinate of $p_k$ is $(\cos{k&theta;}, \sin{k&theta;})$ where $&theta; = 2&pi; n$.</li>
	<li>For any two distinct edges $\{p_a, p_b\}$ and $\{q_a, q_b\}$ in $E_T$, the line segments $p_ap_b$ and $q_aq_b$ do not intersect unless those two edges share a common vertex (that is, $\{p_a, p_b\}&cap;\{q_a, q_b\} &ne; &empty;$).</li>
	<li>There exists a vertex $r$ such that $&delta;(r, p_k) = d_k$ for $1 &le; k &le; n$. We call $r$ as the root of $G_T$.</li>
</ul>

<p>If there exists such tree graph, please output the edge set $E_T$. Otherwise, output $-1$.</p>

### 입력

<p>The first line contains a positive integer $n$ indicating the number of vertices of the tree to be constructed. The second line contains $n$ non-negative integers $d_1, \dots , d_n$, the sequence given by Danny.</p>

### 출력

<p>If there does not exist such a tree $G_T$, output $-1$. Otherwise, output $n - 1$ lines to represent the edge set $E_T$. The $i$-th line should contain two space-separated integers $u_i$ and $v_i$. The $i$-th edge in $E_T$ should be $\{p_{u_i} , p_{v_i}\}$. If there are multiple solutions, you may output any of them.</p>

### 제한

<ul>
	<li>$2 &le; n &le; 100000$</li>
	<li>For $1 &le; k &le; n$, $0 &le; d_k &le; n - 1$.</li>
</ul>
# [Platinum II] Edge Coloring - 19527

[문제 링크](https://www.acmicpc.net/problem/19527)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 19, 정답: 8, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 이분 그래프

### 문제 설명

<p>You are given a simple connected undirected graph with $N$ vertices and $M$ edges. The $i$-th edge connects the vertices $a_i$ and $b_i$.</p>

<p>Initially, the edges are not colored. Takahashikun wants to color the $i$-th edge with the color $c_i$.</p>

<p>He can color the edges in the following way:</p>

<ul>
	<li>First he chooses a vertex, and he repeats zero or more steps.</li>
	<li>In each step, he chooses a vertex adjacent to the current vertex and moves to the chosen vertex along an edge. This edge is colored red or blue (the color is defined according to the rule below).</li>
	<li>In odd-indexed (1-based) steps he uses red. In even-indexed steps he uses blue.</li>
	<li>If he colors an already-colored edges, the color of the edge is updated to the new color.</li>
</ul>

<p>Determine if he can color all edges with correct colors.</p>

### 입력

<p>$N$ $M$<br />
$a_1$ $b_1$ $c_1$<br />
$a_2$ $b_2$ $c_2$<br />
$\vdots$<br />
$a_M$&nbsp;$b_M$ $c_M$</p>

### 출력

<p>Print &quot;<code>Yes</code>&quot;, if Takahashikun can color all edges with correct colors or &quot;<code>No</code>&quot; otherwise.</p>

### 제한

<ul>
	<li>$2 \leq N \leq 2000$</li>
	<li>$1 \leq M \leq 2000$</li>
	<li>$1 \leq a_i &lt; b_i \leq N$</li>
	<li>The pairs $(a_i, b_i)$ are pairwise distinct.</li>
	<li>$c_i$ is either an &#39;<code>r</code>&#39; (red) or a &#39;<code>b</code>&#39; (blue).</li>
	<li>The graph is connected.</li>
</ul>
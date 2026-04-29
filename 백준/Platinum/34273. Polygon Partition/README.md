# [Platinum I] Polygon Partition - 34273

[문제 링크](https://www.acmicpc.net/problem/34273)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 10, 정답: 9, 맞힌 사람: 9, 정답 비율: 100.000%

### 분류

애드 혹

### 문제 설명

<p>A simple polygon is a polygon that is not self-intersecting and does not contain any holes. You are given the $N$ vertices of a simple polygon, $v_1$, $v_2$, \ldots, $v_N$, where $v_i = (x_i, y_i)$, and $x_i$ and $y_i$ are the $x$-coordinate and $y$-coordinate of the $i^{\textrm{th}}$ vertex, respectively. The vertices are distinct and given in counterclockwise order (so there is an edge between each pair of consecutive vertices; there is also an edge from $v_N$ back to $v_1$).</p>

<p>The polygon's boundary does not pass through any <em>lattice points</em> (a lattice point is a point where both coordinates are integers). In addition, none of the $x_i$ or $y_i$ values are exactly an integer.</p>

<p>A <em>semi-integer point</em> is a point where exactly one of its coordinates is an integer. Let $\mathcal{P} = \left\{p_1, p_2, \ldots, p_k\right\}$ be all of the semi-integer points that lie on the boundary of the polygon. For each semi-integer point $p_i$ in $\mathcal{P}$, let $n_i$ be the floor of the non-integer coordinate of $p_i$. For a subset $\mathcal{S}$ of $\mathcal{P}$, let $\sigma(\mathcal{S})$ be the sum of the $n_i$ of the points in $\mathcal{S}$ (with $\sigma(\emptyset) = 0$). Does there exist a partition of $\mathcal{P}$ into two subsets $\mathcal{S}_1$ and $\mathcal{S}_2$ so that the $\sigma(\mathcal{S}_1) = \sigma(\mathcal{S}_2)$?</p>

<p>(Two sets $\mathcal{S}_1$ and $\mathcal{S}_2$ are a partition of $\mathcal{P}$ if $\mathcal{P} = \mathcal{S}_1 \cup \mathcal{S}_2$ and $\mathcal{S}_1 \cap \mathcal{S}_2 = \emptyset$. There are no other restrictions on $\mathcal{S}_1$ and $\mathcal{S}_2$ so long as these two conditions hold and $\sigma(\mathcal{S}_1) = \sigma(\mathcal{S}_2)$. In particular, empty sets are allowed, and the semi-integer points in each set <em>do not</em> have to be contiguous around the polygon boundary.)</p>

### 입력

<p>The first line of input contains one integer $N$ ($3 \leq N \leq 500$), the number of vertices of the polygon.</p>

<p>Each of the next $N$ lines contains two space-separated real numbers $x_i$ and $y_i$ ($-500 &lt; x_i, y_i &lt; 500$): the coordinates of the polygon vertices, in counterclockwise order. Each coordinate will have exactly $6$ digits after the decimal point and will not be exactly an integer.</p>

<p>It is guaranteed that the polygon does not self-intersect, that the vertices are distinct, and that the polygon boundary does not pass through any lattice points.</p>

### 출력

<p>If there is no solution, print $-1$ and no further output. </p>

<p>Otherwise, print a single integer $M$ on its own line: the number of semi-integer points in one of the two subsets in a valid partition of $\mathcal{P}$. On the next $M$ lines of output, print the values $n_i$ for the points in that subset, one per line. </p>

<p>If there are multiple valid partitions, you may choose any of them. You may print either of its two subsets, and you may list the subset's $n_i$ values in any order.</p>
# [Platinum II] Voronoi Diagram Again - 17166

[문제 링크](https://www.acmicpc.net/problem/17166)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 211, 정답: 54, 맞힌 사람: 52, 정답 비율: 30.952%

### 분류

기하학, 정렬, 스위핑

### 문제 설명

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/ee3b7001-c24a-413d-bb15-9d83259d3df4/-/preview/" /><br />
&nbsp;</p>

<p>In the 2-dimensional Cartesian coordinate system, we define the <strong>Voronoi Diagram</strong>&nbsp;of a non-empty set of points $S$, as a diagram that divides the plane by the criteria ``which point in the set $S$ is closest in this location?&quot;. More precisely, the Voronoi diagram of a given non-empty point set $\{P_1, P_2, \cdots, P_n\}$ is a collection of \textbf{regions}: A point $K$ is included in region $i$ if and only if $d(P_i, K) \le d(P_j, K)$ holds for all $1 \le j \le n$.&nbsp;</p>

<p>While the usual Voronoi Diagram uses Euclidean distance, we use Manhattan distance in this problem. $d(X, Y)$ denotes the \textbf{Manhattan} distance between point $X$ and $Y$. Manhattan distance between two points is the sum of the absolute differences of their $X$, $Y$ coordinates. Thus, the Manhattan distance between two points $(X_1, Y_1)$, $(X_2, Y_2)$ can be written as $|X_2 - X_1| + |Y_2 - Y_1|$.</p>

<p>For example, in the picture above, every location over the plane is colored by the closest point with such location. The points which belongs to a single region is colored by a light color indicating a region, and the points which belongs to more than one region forms lines and points colored black.</p>

<p>The region is unbounded if for any real number $R$, there exists point $P$ in the region such that $d(O, P) &gt; R$ where $O$ is the origin. You have to find the number of unbounded regions in the Voronoi Diagram.</p>

### 입력

<p>In the first line, the number of points consisting Voronoi diagram $N$ is given.</p>

<p>In the $i$-th line of next $N$ lines, two integers $x_i,\ y_i$ indicating $x$ and $y$ coordinate of $P_i$ are given. These are the points in the Voronoi diagram.&nbsp;</p>

### 출력

<p>Print a single integer, denoting the number of unbounded regions in the Voronoi Diagram.</p>

### 제한

<ul>
	<li>$1 \le N \le 250\,000$</li>
	<li>$-10^9 \le x_i,\ y_i \le 10^9$ ($1 \le i \le N$)</li>
	<li>All $N$ points are distinct.</li>
</ul>

### 힌트

<p>In example 2, overlapping region is indicated as subtractive mixing of two or more colors. All points with $(x \ge 5 \wedge&nbsp; y \le 1) \vee (x \le 1 \wedge y \ge 5)$ is included in all five region, and colored as darkest.</p>
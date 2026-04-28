# [Gold IV] Magic Cube - 31524

[문제 링크](https://www.acmicpc.net/problem/31524)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 15, 정답: 11, 맞힌 사람: 9, 정답 비율: 75.000%

### 분류

구현, 기하학, 시뮬레이션, 3차원 기하학

### 문제 설명

<p>Imagine you are holding an $n \times n \times n$ cube, which is split up into $n^3$ smaller cubes labeled from 1 to $n^3$. The orientation of the axes is left-to-right for the $x$-axis, back-to-front for the $y$-axis, and bottom-to-top for the $z$-axis. For example, a $2 \times 2 \times 2$ cube is labeled as such:</p>

<p>Bottom layer ($z=1$):</p>

<pre>
1 2 
3 4</pre>

<p>Top layer ($z=2$):</p>

<pre>
5 6 
7 8
</pre>

<p>In the context of a $2 \times 2 \times 2$ cube:</p>

<ul>
	<li>Cube 1 is at (1, 1, 1).</li>
	<li>Cube 2 is at (2, 1, 1).</li>
	<li>Cube 3 is at (1, 2, 1).</li>
	<li>Cube 5 is at (1, 1, 2).</li>
</ul>

<p>Each time you rotate the cube at slice $k$ along one of the $x$-, $y$-, and $z$- axes, you are rotating the $(k+1)$th layer along the corresponding axis, as well as all the layers after $k$ in the increasing direction of that axis.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/b22b18b0-94af-4460-a3a7-1b18c1d28808/-/preview/" style="width: 512px; height: 220px;" /></p>

### 입력

<p>The first line contains two integers, $n$ ($2 \leq n \leq 1\,000$) and $m$ ($1 \leq m \leq 2\,000$), the size of the cube and the number of operations.</p>

<p>Each of the next $m$ lines contains the information regarding an operation, and will be one of the following:</p>

<ul>
	<li><code>x</code>, $\theta$, $k$: Rotate slices $k+1$ through slice $n$ by $\theta$ degrees counterclockwise around the $x$-axis.</li>
	<li><code>y</code>, $\theta$, $k$: Rotate slices $k+1$ through slice $n$ by $\theta$ degrees counterclockwise around the $y$-axis.</li>
	<li><code>z</code>, $\theta$, $k$: Rotate slices $k+1$ through slice $n$ by $\theta$ degrees counterclockwise around the $z$-axis.</li>
	<li><code>q x y z</code>: This is a query operation. Output which cube is at location $(x, y, z)$.</li>
</ul>

<p>For the first three operations, it is guaranteed that $0 \leq k \leq n-1$ and $\theta \in \{90, 180, 270, 360\}$. For queries, $(x, y, z)$ denotes the query location and $1 \leq x, y, z \leq n$. It is guaranteed there will be at least one query. The cube does not reset between operations. That is, rotations are cumulative.</p>

### 출력

<p>For each query operation, output which cube is at the given location.</p>
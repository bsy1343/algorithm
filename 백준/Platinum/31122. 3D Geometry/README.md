# [Platinum III] 3D Geometry - 31122

[문제 링크](https://www.acmicpc.net/problem/31122)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

기하학, 포함 배제의 원리, 3차원 기하학

### 문제 설명

<p>An axis-aligned tetrahedron (also known as triangular pyramid) $DABC$ is a convex polyhedron in three dimension with vertices</p>

<ul>
	<li>$D: (x_1, y_1, z_1)$,</li>
	<li>$A: (x_2, y_1, z_1)$,</li>
	<li>$B: (x_1, y_2, z_1)$,</li>
	<li>$C: (x_1, y_1, z_2)$.</li>
</ul>

<p>Also, an axis-aligned cube $PQRSDEFG$ is a convex polyhedron with vertices</p>

<ul>
	<li>$P: (x_3, y_3, z_3)$,</li>
	<li>$Q: (x_3, y_3, z_4)$,</li>
	<li>$R: (x_3, y_4, z_3)$,</li>
	<li>$S: (x_3, y_4, z_4)$,</li>
	<li>$D: (x_4, y_3, z_3)$,</li>
	<li>$E: (x_4, y_3, z_4)$,</li>
	<li>$F: (x_4, y_4, z_3)$,</li>
	<li>$G: (x_4, y_4, z_4)$.</li>
</ul>

<p>Given an axis-aligned tetrahedron $DABC$ and an axis-aligned cube $PQRSDEFG$, find the volume of their intersection.</p>

### 입력

<p>The input consists of several test cases terminated by end-of-file. For each test case,</p>

<p>There are $4$ lines, and the $i$-th line contains three integers $x_i$, $y_i$, and $z_i$.</p>

### 출력

<p>For each test case, output a float which denotes the volume.</p>

<p>Your answer is considered correct if its absolute or relative error doesn&#39;t exceed $10^{-6}$.</p>

### 제한

<ul>
	<li>$-500 \leq x_i, y_i, z_i \leq 500$ for each $1 \leq i \leq 4$</li>
	<li>$x_1 \neq x_2$, $y_1 \neq y_2$, $z_1 \neq z_2$</li>
	<li>$x_3 \neq x_4$, $y_3 \neq y_4$, $z_3 \neq z_4$</li>
	<li>In each input, the number of test cases does not exceed $10^5$.</li>
</ul>
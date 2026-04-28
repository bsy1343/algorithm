# [Platinum I] Good Triangle - 30298

[문제 링크](https://www.acmicpc.net/problem/30298)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 68, 정답: 35, 맞힌 사람: 33, 정답 비율: 50.769%

### 분류

자료 구조, 기하학, 세그먼트 트리, 스위핑

### 문제 설명

<p>You are given $n$ distinct points on the two dimensional plane.</p>

<p>We define the distance between two points $P=(x_1, y_1)$ and $Q=(x_2, y_2)$ as $d(P, Q)=|x_1-x_2|+|y_1-y_2|$.</p>

<p>Let&#39;s say that three distinct points $U, V, W$ form a <em>good triangle</em> if there exists a point $T$ such that $d(U, T)=d(V, T)=d(W, T)$. Note that $T$ does not have to be a lattice point.</p>

<p>Find the number of <em>good triangle</em>s that can be formed by the given points.</p>

### 입력

<p>The first line of input contains $N$.</p>

<p>The $i$-th line of the next $N$ lines contains two space-separated integers $x_i, y_i$, meaning that the coordinate of the $i$-th point is $(x_i, y_i)$.</p>

### 출력

<p>Print one integer, the number of <em>good triangle</em>s that can be formed by the given points.</p>

### 제한

<ul>
	<li>$3 \leq N \leq 500\,000$</li>
	<li>$-10^9 \leq x_i, y_i \leq 10^9$ ($1 \leq i \leq N$)</li>
	<li>$(x_i, y_i) \neq (x_j, y_j)$ if $i\ne j$ ($1 \leq i, j \leq N$)</li>
	<li>All values in the input are integers.</li>
</ul>
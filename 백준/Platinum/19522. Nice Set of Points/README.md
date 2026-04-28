# [Platinum IV] Nice Set of Points - 19522

[문제 링크](https://www.acmicpc.net/problem/19522)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 34, 정답: 14, 맞힌 사람: 13, 정답 비율: 59.091%

### 분류

해 구성하기, 분할 정복, 기하학, 정렬

### 문제 설명

<p>Consider a set of points. You can move directly between two points if their x-coordinates are the same or their y-coordinates are the same. A set of points is called <em>nice</em> if for any two points in the set, the length of the shortest (direct or indirect) path is equal to the manhattan distance between them.</p>

<p>You are given $N$ points. The $i$-th point is at $(x_i, y_i)$.</p>

<p>You are allowed to add up to $10000 - N$ points. Convert the given set of points into a nice set.</p>

### 입력

<p>$N$<br />
$x_1$&nbsp; $y_1$<br />
$x_2$ $y_2$<br />
$\vdots$<br />
$x_N$ $y_N$</p>

### 출력

<p>Let $M (0 \leq M \leq 10000 - N)$ be the number of added points, and $(s_1, t_1), \ldots, (s_M, t_M)$ be their coordinates. After adding these $M$ points to the set, you get $N + M$ points. <strong>These $N+M$ points must be pairwise distinct</strong>, and this set must be nice. The coordinates must be integers.</p>

<p>Output the answer in the following format.</p>

<p>$M$<br />
$s_1$&nbsp;$t_1$<br />
$s_2$ $t_2$<br />
$\vdots$<br />
$s_N$ $t_M$</p>

<p>If there are multiple possible solutions, output any.</p>

### 제한

<ul>
	<li>$2 \leq N \leq 1000$</li>
	<li>$1 \leq x_i, y_i \leq 1000$</li>
	<li>The points are pairwise distinct.</li>
	<li>Under these constraints, it is guaranteed that at least one solution exists.</li>
	<li>All values in the input are integers.</li>
</ul>

### 힌트

<p>In Sample 1, if you add $(1, 2)$, you can move between $(1, 1)$ and $(2, 2)$ via $(1, 2)$.</p>
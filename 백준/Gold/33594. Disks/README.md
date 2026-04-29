# [Gold III] Disks - 33594

[문제 링크](https://www.acmicpc.net/problem/33594)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 39, 정답: 19, 맞힌 사람: 19, 정답 비율: 54.286%

### 분류

그래프 이론, 기하학, 이분 그래프

### 문제 설명

<p>You are given $n$ disks in the plane. The center of each disk has integer coordinates, and the radius of each disk is a positive integer. No two disks overlap in a region of positive area, but it is possible for disks to be tangent to each other.</p>

<p>Your task is to determine whether it is possible to change the radii of the disks in such a way that:</p>

<ul>
	<li>Disks that were tangent to each other remain tangent to each other.</li>
	<li>No two disks overlap in a region of positive area.</li>
	<li>The sum of all radii strictly decreases.</li>
</ul>

<p>The new radii are allowed to be arbitrary positive real numbers. The centers of the disks cannot be changed.</p>

### 입력

<p>The first line contains an integer $n$ ($1 ≤ n ≤ 1000$) — the number of disks.</p>

<p>The next $n$ lines contain three integers each. The $i$-th of such lines contains $x_i$, $y_i$ ($-10^9 ≤ x_i , y_i ≤ 10^9$), and $r_i$ ($1 ≤ r_i ≤ 10^9$) — the coordinates of the center, and the radius, of the $i$-th disk.</p>

### 출력

<p>Print <code>YES</code> if it is possible to change the radii in the desired manner. Otherwise, print <code>NO</code>.</p>
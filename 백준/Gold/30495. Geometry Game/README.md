# [Gold V] Geometry Game - 30495

[문제 링크](https://www.acmicpc.net/problem/30495)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 111, 정답: 39, 맞힌 사람: 39, 정답 비율: 38.614%

### 분류

기하학, 많은 조건 분기

### 문제 설명

<p>For the longest time you could keep your toddlers happy by letting them play with triangular, square, and circular wooden blocks that fit exactly through perfectly sized holes. After letting them play a bit too long, they completely mastered this game and are now bored, preventing you from fixing the bugs in your code.</p>

<p>Just now, they decided to reverse roles and started screaming planar coordinates at you, insisting that you determine which shape each four points make: kite, trapezium, parallelogram, rhombus, rectangle, square, or none of those. You do not have time for this, since your bugs still need fixing. Instead, you write a new program to answer your toddlers&#39; questions, ideally without bugs.</p>

<p>The definitions for the quadrilateral shapes are as follows:</p>

<ul>
	<li>A square has four right angles and four sides with equal lengths.</li>
	<li>A rectangle has four right angles.</li>
	<li>A rhombus has four sides with equal lengths.</li>
	<li>A parallelogram has two pairs of parallel sides.</li>
	<li>A trapezium has one pair of parallel sides.</li>
	<li>A kite has reflection symmetry across a diagonal.</li>
</ul>

<p> </p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>Four lines, each containing two integers $x$ and $y$ ($0\leq x,y\leq 10^9$), the coordinates of a point.</li>
</ul>

<p>The positive x-axis is oriented to the right and the positive y-axis is oriented upwards.</p>

<p>The four points are distinct, form a convex quadrilateral shape (i.e. all interior angles are strictly less than $180^\circ$), and are given in clockwise order.</p>

### 출력

<p>Output the <em>most restrictive</em> type of quadrilateral that the points form, which is the first one of &quot;<code>square</code>&quot;, &quot;<code>rectangle</code>&quot;, &quot;<code>rhombus</code>&quot;, &quot;<code>parallelogram</code>&quot;, &quot;<code>trapezium</code>&quot;, or &quot;<code>kite</code>&quot; that applies, or &quot;<code>none</code>&quot; otherwise.</p>
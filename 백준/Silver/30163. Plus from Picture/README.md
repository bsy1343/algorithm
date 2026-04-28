# [Silver III] Plus from Picture - 30163

[문제 링크](https://www.acmicpc.net/problem/30163)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 68, 정답: 40, 맞힌 사람: 35, 정답 비율: 59.322%

### 분류

구현

### 문제 설명

<p>You have a given picture with size $w \times h$. Determine if the given picture has a single &quot;<code>+</code>&quot; shape or not. A &quot;<code>+</code>&quot; shape is described below:</p>

<ul>
	<li>A &quot;<code>+</code>&quot; shape has one center nonempty cell.</li>
	<li>There should be some (at least one) consecutive non-empty cells in each direction (left, right, up, down) from the center. In other words, there should be a ray in each direction. </li>
	<li>All other cells are empty.</li>
</ul>

<p>Find out if the given picture has single &quot;<code>+</code>&quot; shape.</p>

### 입력

<p>The first line contains two integers $h$ and $w$ ($1 \le h$, $w \le 500$) --- the height and width of the picture.</p>

<p>The $i$-th of the next $h$ lines contains string $s_{i}$ of length $w$ consisting &quot;<code>.</code>&quot; and &quot;<code>*</code>&quot; where &quot;<code>.</code>&quot; denotes the empty space and &quot;<code>*</code>&quot; denotes the non-empty space.</p>

### 출력

<p>If the given picture satisfies all conditions, print &quot;<code>YES</code>&quot;. Otherwise, print &quot;<code>NO</code>&quot;.</p>

### 힌트

<p>In the first example, the given picture contains one &quot;<code>+</code>&quot;.</p>

<p>In the second example, two vertical branches are located in a different column.</p>

<p>In the third example, there is a dot outside of the shape.</p>

<p>In the fourth example, the width of the two vertical branches is $2$.</p>

<p>In the fifth example, there are two shapes.</p>

<p>In the sixth example, there is an empty space inside of the shape.</p>
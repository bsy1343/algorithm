# [Gold I] Simple Polygon - 19137

[문제 링크](https://www.acmicpc.net/problem/19137)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 46, 정답: 14, 맞힌 사람: 14, 정답 비율: 43.750%

### 분류

수학, 해 구성하기

### 문제 설명

<p>Although bobo is truly smart, he just like you to find a simple polygon for him. The polygon you are going to find should satisfy the following conditions.</p>

<ol>
	<li>The polygon is simple. That is to say, any two non-adjacent edges won&#39;t intersect or touch and any two adjacent edges have exactly one common point.</li>
	<li>Edges of the polygon are parallel to either $x$-axis or $y$-axis.</li>
	<li>The perimeter of the polygon equals to $l$, while the area equals to $s$.</li>
</ol>

### 입력

<p>First line of the input contains two integers $l$ and $s$ ($4 \leq l \leq 10^9, 1 \leq s \leq 10^9$).</p>

### 출력

<p>The first line contains an integer $n$, which denotes the number of vertices of the polygon you have found ($4 \leq n \leq 1000$).</p>

<p>Each of the following $n$ lines contains $2$ integers $x_i, y_i$, which denote the coordinates of points (in clockwise or counter-clockwise order) ($0 \leq x_i, y_i \leq 10^9$).</p>

<p>Any appropriate solution will get accepted.</p>

<p>If no such polygon can be found, simply print &quot;-1&quot;.</p>
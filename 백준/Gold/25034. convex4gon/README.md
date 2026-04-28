# [Gold IV] convex4gon - 25034

[문제 링크](https://www.acmicpc.net/problem/25034)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 23, 맞힌 사람: 22, 정답 비율: 78.571%

### 분류

브루트포스 알고리즘, 기하학, 많은 조건 분기

### 문제 설명

<p>There is a point set of $n$ distinct points on the $xy$-plane. ($0&lt;n&lt;30$) Every $x$- and $y$-coordinate is an integer whose absolute value is less than $1000$. No three distinct points from the point set lie on the same line. We want to count the number of the distinct convex quadrilaterals whose vertices are from the point set.</p>

<p>Write a function <u><code>convex4gon</code></u>:</p>

<ul>
	<li>input parameter: a <code>list</code>-type object <code>L</code> of length $n$ representing the point set

	<ul>
		<li>Each item of <code>L</code> represents a point from the point set, as a tuple of its $x$- and $y$-coordinates.</li>
		<li>Each item of <code>L</code> is a <code>tuple</code>-type object of length 2 whose items are <code>int</code>-type objects.</li>
	</ul>
	</li>
	<li>return value: the <code>int</code>-type object representing the number of the distinct convex quadrilaterals whose vertices are from the point set</li>
</ul>

### 입력



### 출력


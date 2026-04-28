# [Silver IV] lattice - 22290

[문제 링크](https://www.acmicpc.net/problem/22290)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 162, 정답: 97, 맞힌 사람: 75, 정답 비율: 55.556%

### 분류

수학, 기하학, 정수론, 유클리드 호제법

### 문제 설명

<p>Write a function <u><code>P1</code></u>:</p>

<ul>
	<li>A point $(x,y)$ is called a lattice point iff both $x$ and $y$ are integers.</li>
	<li>input parameter: integers <code>x1</code>, <code>y1</code>, <code>x2</code>, <code>y2</code>, <code>x3</code>, <code>y3</code>
	<ul>
		<li>Three points (<code>x1</code>,&nbsp;<code>y1</code>), (<code>x2</code>,&nbsp;<code>y2</code>), (<code>x3</code>,&nbsp;<code>y3</code>)&nbsp;are not on a same straight line.</li>
		<li>The absolute value of each input parameter is less than or equal to $2^{1024}$.</li>
	</ul>
	</li>
	<li>return value: the number of the lattice points (including vertexes) on the perimeter of the triangle with three vertexes (<code>x1</code>,&nbsp;<code>y1</code>), (<code>x2</code>,&nbsp;<code>y2</code>), (<code>x3</code>,&nbsp;<code>y3</code>)
	<ul>
		<li>For example, if a triangle has vertexes $(0,0),(2,2),(3,0)$ then its perimeter has 6 lattice points: $(0,0),(1,1),(2,2),(3,0),(2,0),(1,0)$.</li>
	</ul>
	</li>
</ul>

### 입력



### 출력


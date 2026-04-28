# [Silver III] Triangle - 17649

[문제 링크](https://www.acmicpc.net/problem/17649)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 44, 정답: 12, 맞힌 사람: 9, 정답 비율: 25.000%

### 분류

사칙연산, 브루트포스 알고리즘, 기하학, 구현, 수학

### 문제 설명

<p>In the plane are given N distinct points with coordinates that are decimal fractions. Write program that handles Q queries. Each query is given with two fractional numbers x and y. For each query, the program has to calculate the number of epsilon-isosceles triangles such that each of them has a vertex with coordinates - the point (x, y) and the other two vertices are two different points among the given N points.</p>

<p>We say that a triangle is epsilon-isosceles when the absolute value of the difference between the lengths of two of its sides is less than 0.0001 and for that triangle we do not require for a pair of its vertices to be necessarily non-coincident points and we do not require its three vertices to be necessarily non-collinear.</p>

### 입력

<p>The first line of the input contains the integers N and Q. Each of the next N lines of the input contains two decimal fractions - coordinates of the next given point. There are following Q lines, each containing two decimal fractions - the coordinates of a point in the next query.</p>

### 출력

<p>The program should output Q lines, each containing a single integer, equal to the answer to each of the queries printed in the order of the input.</p>

### 제한

<ul>
	<li>0 &lt; N &le; 1000</li>
	<li>0 &lt; Q &le; 1000</li>
</ul>

<p>The coordinates of all points are fractional numbers in the range [0; 1 000 000], written with a decimal point and with a maximum of 9 digits in the fractional part.</p>

<p>The tests are such that they do not have a triangle which can be counted in more than one way as epsilonisosceles, i.e., if we denote the lengths of the sides of the triangle with a, b and c , where a &ge; b &ge; c, it is not possible to have simultaneously a-b &lt; 0.0001 and b-c &lt; 0.0001.</p>

<p>The tests are such that the following definitions for an epsilon-isosceles triangle yield the same result:</p>

<ul>
	<li>The absolute value of the difference between the lengths of two of its sides is less than 0.0001</li>
	<li>The absolute value of the difference between the lengths of two of its sides is less than 0.0003</li>
	<li>The absolute value of the difference between the lengths of two of its sides is less than 0.00003</li>
</ul>

### 힌트

<p>For the point (5, 5) the epsilon-isosceles triangles are:</p>

<ul>
	<li>(5, 5), (0, 5), (5, 0)</li>
	<li>(5, 5), (3, 4), (4, 3)</li>
</ul>

<p>For the point (0, 0) the epsilon-isosceles triangles are:</p>

<ul>
	<li>(0, 0), (0, 5), (3, 4)</li>
	<li>(0, 0), (0.5), (4, 3)</li>
	<li>(0, 0), (0, 5), (5, 0)</li>
	<li>(0, 0), (3, 4), (4, 3)</li>
	<li>(0, 0), (3, 4), (5, 0)</li>
	<li>(0, 0), (4, 3), (5, 0)</li>
</ul>

<p>For the point (0, 9) there are no epsilon-isosceles triangles</p>
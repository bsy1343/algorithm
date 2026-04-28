# [Platinum V] Empty Cuboids - 8057

[문제 링크](https://www.acmicpc.net/problem/8057)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 8, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

자료 구조, 정렬, 기하학, 이분 탐색, 스위핑, 스택, 값 / 좌표 압축, 3차원 기하학

### 문제 설명

<p>We call a cuboid regular if:</p>

<ul>
	<li>one of its vertices is a point with coordinates (0,0,0),</li>
	<li>edges beginning in this vertex lay on positive semi-axes of the coordinate system,</li>
	<li>the edges are not longer than 10<sup>6</sup>.</li>
</ul>

<p>There is given a set A of points of space, which coordinates are integers from the interval [1,10^6]. We try to find a regular cuboid of maximal volume, which does not contain any of the points from the set A. A point belongs to the cuboid if it belongs to the inside of the cuboid, i.e. it is a point of the cuboid, but not of its wall.</p>

<p>Write a program which:</p>

<ul>
	<li>reads from the standard input coordinates of points from the set A,</li>
	<li>finds one of the regular cuboids of maximal volume, which does not contain any points from the set A,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input one non-negative integer n, n &le; 5,000, is written. It is the number of elements in the set A. In the following n lines of the input there are triples of integers from the interval [1,10<sup>6</sup>], which are coordinates (respectively x, y and z) of points from A. Numbers in each line are separated by single spaces.</p>

### 출력

<p>In the only line of the standard output there should be three integers separated by single spaces. These are coordinates (respectively x, y and z) of the vertex of the regular cuboid of maximal volume. We require that coordinates are positive.</p>
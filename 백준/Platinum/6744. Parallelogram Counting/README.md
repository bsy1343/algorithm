# [Platinum IV] Parallelogram Counting - 6744

[문제 링크](https://www.acmicpc.net/problem/6744)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 153, 정답: 53, 맞힌 사람: 21, 정답 비율: 22.340%

### 분류

수학, 자료 구조, 정렬, 기하학, 조합론, 해시를 사용한 집합과 맵

### 문제 설명

<p>There are n distinct points in the plane, given by their integer coordinates. Find the number of parallelograms whose vertices lie on these points. In other words, find the number of 4-element subsets of these points that can be written as {A, B, C, D} such that AB || CD, and BC || AD. No four points are in a straight line.&nbsp;</p>

<p>&nbsp;</p>

### 입력

<p>The first line of the input file contains a single integer t (1 &le;&nbsp;t &le; 10), the number of test cases. It is followed by the input data for each test case.<br />
The first line of each test case contains an integer n (1 &le; n &le; 1000). Each of the next n lines, contains 2 space-separated integers x and y (the coordinates of a point) with magnitude (absolute value) of no more than 1000000000.</p>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Output should contain t lines.</li>
	<li>Line i contains an integer showing the number of the parallelograms as described above for test case i.</li>
</ul>

<p>&nbsp;</p>
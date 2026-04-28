# [Silver III] gCube (Small) - 12076

[문제 링크](https://www.acmicpc.net/problem/12076)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 27, 정답: 25, 맞힌 사람: 22, 정답 비율: 91.667%

### 분류

수학

### 문제 설명

<p>Googlers are very interested in cubes, but they are bored with normal three-dimensional cubes and also want to think about other kinds of cubes! A &quot;D-dimensional cube&quot; has D dimensions, all of equal length. (D may be any positive integer; for example, a 1-dimensional cube is a line segment, and a 2-dimensional cube is a square, and a 4-dimensional cube is a hypercube.) A &quot;D-dimensional cuboid&quot; has D dimensions, but they might not all have the same lengths.</p>

<p>Suppose we have an&nbsp;<strong>N</strong>-dimensional cuboid. The&nbsp;<strong>N</strong>&nbsp;dimensions are numbered in order (0, 1, 2, ..., N - 1), and each dimension has a certain length. We want to solve many subproblems of this type:</p>

<ol>
	<li>Take all consecutive dimensions between the&nbsp;<strong>L<sub>i</sub></strong>-th dimension and&nbsp;<strong>R<sub>i</sub></strong>-th dimension, inclusive.</li>
	<li>Use those dimensions to form a D-dimensional cuboid, where D =&nbsp;<strong>R<sub>i</sub></strong>&nbsp;-&nbsp;<strong>L<sub>i</sub></strong>&nbsp;+ 1. (For example, if&nbsp;<strong>L<sub>i</sub></strong>&nbsp;= 3 and&nbsp;<strong>R<sub>i</sub></strong>&nbsp;= 6, we would form a 4-dimensional cuboid using the 3rd, 4th, 5th, and 6th dimensions of our&nbsp;<strong>N</strong>-dimensional cuboid.)</li>
	<li>Reshape it into a D-dimensional cube&nbsp;<strong>that has exactly the same volume as that D-dimensional cuboid</strong>, and find the edge length of that cube.</li>
</ol>

<p>Each test case will have&nbsp;<strong>M</strong>&nbsp;subproblems like this, all of which use the same original&nbsp;<strong>N</strong>-dimensional cuboid.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow.</p>

<p>Each test case begins with two integers&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>M</strong>;&nbsp;<strong>N</strong>&nbsp;is the number of dimensions and&nbsp;<strong>M</strong>&nbsp;is the number of queries. Then there is one line with&nbsp;<strong>N</strong>&nbsp;positive integers&nbsp;<strong>a<sub>i</sub></strong>, which are the lengths of the dimensions, in order. Then,&nbsp;<strong>M</strong>&nbsp;lines follow. In the ith line, there are two integers&nbsp;<strong>L<sub>i</sub></strong>&nbsp;and&nbsp;<strong>R<sub>i</sub></strong>, which give the range of dimensions to use for the ith subproblem.</p>

### 출력

<p>For each test case, output one line containing &quot;Case #x:&quot;, where x is the test case number (starting from 1). After that, output&nbsp;<strong>M</strong>&nbsp;lines, where the ith line has the edge length for the ith subproblem. An edge length will be considered correct if it is within an absolute error of 10<sup>-6</sup>&nbsp;of the correct answer.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>a<sub>i</sub></strong>&nbsp;&le; 10<sup>9</sup>.&nbsp;</li>
	<li>0 &le;&nbsp;<strong>L<sub>i</sub></strong>&nbsp;&le;&nbsp;<strong>R<sub>i</sub></strong>&nbsp;&lt;&nbsp;<strong>N</strong>.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10.</li>
	<li>1 &le;&nbsp;<strong>M</strong>&nbsp;&le; 10.</li>
</ul>
# [Gold IV] Product Triplets - 23983

[문제 링크](https://www.acmicpc.net/problem/23983)

### 성능 요약

시간 제한: 40 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 129, 정답: 37, 맞힌 사람: 26, 정답 비율: 27.660%

### 분류

브루트포스 알고리즘, 많은 조건 분기, 자료 구조, 해시를 사용한 집합과 맵, 수학, 집합과 맵

### 문제 설명

<p>Given&nbsp;<b>N</b>&nbsp;integers&nbsp;<b>A</b><sub>1</sub>,&nbsp;<b>A</b><sub>2</sub>, ...,&nbsp;<b>A</b><sub><b>N</b></sub>, count the number of triplets (x, y, z) (with 1 &le; x &lt; y &lt; z &le;&nbsp;<b>N</b>) such that at least one of the following is true:</p>

<ul>
	<li><b>A</b><sub>x</sub>&nbsp;=&nbsp;<b>A</b><sub>y</sub>&nbsp;&times;&nbsp;<b>A</b><sub>z</sub>, and/or</li>
	<li><b>A</b><sub>y</sub>&nbsp;=&nbsp;<b>A</b><sub>x</sub>&nbsp;&times;&nbsp;<b>A</b><sub>z</sub>, and/or</li>
	<li><b>A</b><sub>z</sub>&nbsp;=&nbsp;<b>A</b><sub>x</sub>&nbsp;&times;&nbsp;<b>A</b><sub>y</sub></li>
</ul>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each begins with one line containing an integer&nbsp;<b>N</b>: the number of integers in array&nbsp;<b>A</b>. The second line consists of&nbsp;<b>N</b>&nbsp;integers&nbsp;<b>A</b><sub>i</sub>; the i-th of these is the value of the i-th integer, as described above.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the number of triplets satisfying the condition given in the problem statement.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 30.</li>
	<li>0 &le;&nbsp;<b>A</b><sub>i</sub>&nbsp;&le; 2 &times; 10<sup>5</sup>, for all i.</li>
</ul>

### 힌트

<p>In Sample Case #1, the only triplet satisfying the condition given in the problem statement is (2, 4, 5). The triplet is valid since the second, fourth, and fifth integers are 2, 6, and 3, and 2 &times; 3 = 6.</p>

<p>In Sample Case #2, the six triplets satisfying the condition given in the problem statement are: (1, 2, 3), (1, 3, 4), (1, 4, 5), (1, 5, 6), (2, 3, 5), (2, 4, 6).</p>

<p>In Sample Case #3, make sure you only count the triplet (1, 2, 3) once.</p>

<p>In Sample Case #4, there is no triplet satisfying the condition given in the problem statement since the product of any pair of integers in the array will not be in the array.</p>
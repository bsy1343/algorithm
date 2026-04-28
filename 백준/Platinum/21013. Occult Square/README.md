# [Platinum V] Occult Square - 21013

[문제 링크](https://www.acmicpc.net/problem/21013)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 47, 정답: 23, 맞힌 사람: 21, 정답 비율: 56.757%

### 분류

수학, 해 구성하기

### 문제 설명

<p>A magic square is a square array of non-negative integers where the sums of the numbers on each row, each column, and both main diagonals are the same. An N &times; N occult square is a magic square with N rows and N columns with additional constraints:</p>

<ul>
	<li>The integers in the square are between 0 and N, inclusive.</li>
	<li>For all 1 &le; i &le; N, the number i appears at most i times in the square.</li>
	<li>There are at least two distinct positive integers in the square.</li>
</ul>

<p>For example, the following is a 5 &times; 5 occult square, where the sums of the numbers on each row, each column, and both main diagonals are 7:</p>

<pre>
0 0 0 3 4
2 4 0 0 1
0 0 3 4 0
5 0 0 0 2
0 3 4 0 0</pre>

<p>For a given prime number P, you are asked to construct a P &times; P occult square, or determine whether no such occult square exists.</p>

### 입력

<p>Input contains a prime number: P (2 &le; P &le; 1000) representing the number of rows and columns in the occult square.</p>

### 출력

<p>If there is no P &times; P occult square, simply output -1 in a line. Otherwise, output P lines, each contains P integers representing an occult square. The j<sup>th</sup> integer on the i<sup>th</sup> line is the integer on the i<sup>th</sup> row and the j<sup>th</sup> column in the occult square. You may output any P &times; P occult square.</p>
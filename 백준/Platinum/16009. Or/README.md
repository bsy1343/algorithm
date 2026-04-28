# [Platinum V] Or - 16009

[문제 링크](https://www.acmicpc.net/problem/16009)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 14, 맞힌 사람: 12, 정답 비율: 60.000%

### 분류

비트마스킹, 두 포인터

### 문제 설명

<p>Consider a positive integer X and an N by N matrix A with positive integer entries. Determine the minimum area of a continuous submatrix for which the bitwise or of all its elements equals X.</p>

### 입력

<p>The standard input contains on the first line integers X and N, separated by a space. On the following N lines there are N positive integers separated by spaces representing a matrix line</p>

### 출력

<p>The standard output will contain a positive integer representing the minimum area of the submatrix.</p>

### 제한

<ul>
	<li>2 &le; N &le; 500</li>
	<li>1 &le; A[i][j] &lt; 2<sup>31</sup></li>
	<li>The bitwise or of two positive integers is the integer whose i<sup>th</sup> bit equals 0 if and only if the i<sup>th</sup> bit of both integers is 0.</li>
	<li>It is guaranteed that for all input data there will always be a solution and the minimum area will be at least 2.</li>
</ul>
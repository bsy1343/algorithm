# [Bronze I] Statistics - 6177

[문제 링크](https://www.acmicpc.net/problem/6177)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 633, 정답: 332, 맞힌 사람: 295, 정답 비율: 53.832%

### 분류

정렬

### 문제 설명

<p>The cows have enrolled in elementary statistics and are having a tough time with their homework. Please help them.</p>

<p>Given a set of N (1 &lt;= N &lt;= 500) numbers, X_i (-5,000 &lt;= X_i &lt;= 5000), calculate two statistics:</p>

<ul>
	<li>The mean (sum of the numbers divided by N)</li>
	<li>The median (if N is odd, the middle number when the N numbers are sorted; if N is even, the mean of the two middle numbers when the N numbers are sorted)</li>
</ul>

<p>Your answer will be considered correct if it is within 0.002 of the official answer.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer: X_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: The mean of the input set</li>
	<li>Line 2: The median of the input set</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>(12+4+6+8+2)/5=6.4</p>

<p>Middle number of the set {2, 4, 6, 8, 12} is 6</p>
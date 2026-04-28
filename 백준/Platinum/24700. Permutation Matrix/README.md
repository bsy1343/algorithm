# [Platinum V] Permutation Matrix - 24700

[문제 링크](https://www.acmicpc.net/problem/24700)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 117, 정답: 63, 맞힌 사람: 53, 정답 비율: 58.242%

### 분류

해 구성하기

### 문제 설명

<p>You are given a positive integer $n$. Construct such matrix $2^n \times 2^n$ that:</p>

<ul>
	<li>The matrix contains distinct positive integers from $1$ to $2^{2n}$.</li>
	<li>The sums of elements all each submatrices of size $2^{n-1} \times 2^{n-1}$ are equal.</li>
</ul>

<p>A submatrix is a contiguous rectangle of elements in the original matrix.</p>

### 입력

<p>The first line contains an integer $n$ ($1 \le n \le 10$).</p>

### 출력

<p>On the very first line, print &quot;<code>YES</code>&quot; if the answer exists, or &quot;<code>NO</code>&quot; if not.</p>

<p>If the answer exists, print any such matrix on the next $2^n$ lines, with each line containing $2^n$ space-separated integers.</p>
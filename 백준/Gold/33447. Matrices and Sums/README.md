# [Gold II] Matrices and Sums - 33447

[문제 링크](https://www.acmicpc.net/problem/33447)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 28, 정답: 15, 맞힌 사람: 14, 정답 비율: 60.870%

### 분류

수학, 애드 혹, 해 구성하기

### 문제 설명

<p>Given a positive integer $n$, you should construct an $n \times n$ integer matrix $M$ satisfying the following conditions:</p>

<ul>
	<li>For all elements $M_{i,j}$ ($1 \le i, j \le n$), the absolute value $|M_{i,j}| \le 1$.</li>
	<li>The row and column sums $R_1, R_2, \ldots, R_n, C_1, C_2, \ldots, C_n$ are pairwise distinct, where $R_x = \sum_{i = 1}^{n} M_{x,i}$ and $C_x = \sum_{i = 1}^{n} M_{i,x}$.</li>
</ul>

<p>There may exist multiple solutions or no solution.</p>

### 입력

<p>The first line contains a single integer $n$ ($1 \le n \le 1000$).</p>

### 출력

<p>The first line must contain one string "<code>Yes</code>" (without quotes) if a solution exists, or "<code>No</code>" (without quotes) if there is no solution.</p>

<p>When a solution exists, print $n$ more lines, each containing $n$ integers, denoting the matrix $M$ you construct.</p>

<p>If multiple solutions exist, print any one of them.</p>

### 힌트

<ul>
	<li>In the first example, $R_1 = 1$, $R_2 = 0$, $C_1 = 2$, and $C_2 = -1$ are all distinct.</li>
	<li>In the second example, $R_1 = C_1$ always holds, so no solution exists.</li>
</ul>
# [Silver I] Profits - 5953

[문제 링크](https://www.acmicpc.net/problem/5953)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 314, 정답: 199, 맞힌 사람: 169, 정답 비율: 63.534%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The cows have opened a new business, and Farmer John wants to see how well they are doing. The business has been running for N (1 &lt;= N &lt;= 100,000) days, and every day i the cows recorded their net profit P_i (-1,000 &lt;= P_i &lt;= 1,000).</p>

<p>Farmer John wants to find the largest total profit that the cows have made during any consecutive time period. (Note that a consecutive time period can range in length from one day through N days.) Help him by writing a program to calculate the largest sum of consecutive profits.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer: P_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer representing the value of the maximum sum of profits for any consecutive time period.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>The maximum sum is obtained by taking the sum from the second through the sixth number (4, 9, -2, -5, 8) =&gt; 14.</p>

<p>&nbsp;</p>
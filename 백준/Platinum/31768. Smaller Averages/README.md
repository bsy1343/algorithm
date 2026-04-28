# [Platinum I] Smaller Averages - 31768

[문제 링크](https://www.acmicpc.net/problem/31768)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 83, 정답: 43, 맞힌 사람: 34, 정답 비율: 52.308%

### 분류

다이나믹 프로그래밍, 정렬, 누적 합, 두 포인터

### 문제 설명

<p>Bessie has two arrays of length $N$ ($1 \le N \le 500$). The $i$-th element of the first array is $a_i$ ($1 \le a_i \le 10^6$) and the $i$-th element of the second array is $b_i$ ($1 \le b_i \le 10^6$).</p>

<p>Bessie wants to split both arrays into <strong>non-empty</strong> subarrays such that the following is true.</p>

<ol>
	<li>Every element belongs in exactly 1 subarray.</li>
	<li>Both arrays are split into the same number of subarrays. Let the number of subarrays the first and second array are split into be $k$ (i.e. the first array is split into exactly $k$ subarrays and the second array is split into exactly $k$ subarrays).</li>
	<li>For all $1 \le i \le k$, the average of the $i$-th subarray on the left of the first array is <strong>less than or equal to</strong> the average of the $i$-th subarray on the left of the second array.</li>
</ol>

<p>Count how many ways she can split both arrays into non-empty subarrays while satisfying the constraints modulo $10^9+7$. Two ways are considered different if the number of subarrays are different or if some element belongs in a different subarray.</p>

### 입력

<p>The first line contains $N$.</p>

<p>The next line contains $a_1,a_2,...,a_N$.</p>

<p>The next line contains $b_1,b_2,...,b_N$.</p>

### 출력

<p>Output the number of ways she can split both arrays into non-empty subarrays while satisfying the constraints modulo $10^9+7$.</p>
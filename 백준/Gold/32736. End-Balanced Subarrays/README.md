# [Gold II] End-Balanced Subarrays - 32736

[문제 링크](https://www.acmicpc.net/problem/32736)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 23, 맞힌 사람: 23, 정답 비율: 85.185%

### 분류

누적 합, 수학, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>You are given an array $a$ of $n$ integers. A sub-array $[a_l, a_{l+1}, \cdots a_r]$ is considered <em>end-balanced</em> if $l&lt;r$ and $a_l + a_r = a_{l+1} + ... + a_{r-1}$.</p>

<p>For example, the subarrays $[4, 9, 5]$, $[-1, 3, 5, 9]$, and $[0, 0]$ are considered end-balanced, and the subarrays $[0]$, $[-2, -3, -5]$, and $[1, 1]$ are not.</p>

<p>How many subarrays of $a$ are end-balanced?</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 10^4$) --- the number of test cases. The description of the test cases follows.</p>

<p>The first line of each test case contains a single integer $n$ ($1 \le n \le 2\cdot 10^5$) --- the size of the array $a$.</p>

<p>The second line of each test case contains $n$ integers $a_1, a_2 \cdots a_n$ ($-10^9 \le a_i \le 10^9$) --- the elements of the array $a$.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $2\cdot 10^5$.</p>

### 출력

<p>For each test case, print a single integer --- the number of end-balanced subarrays of $a$.</p>

### 힌트

<p>The end-balanced subarrays in the first test case are:</p>

<ul>
	<li>$[a_1, a_2, a_3, a_4] = [1, 2, 3, 4]$</li>
	<li>$[a_2, a_3, a_4, a_5] = [2, 3, 4, 5]$</li>
</ul>

<p>The end-balanced subarrays in the second test case are:</p>

<ul>
	<li>$[a_1, a_2] = [0, 0]$</li>
	<li>$[a_2, a_3] = [0, 0]$</li>
	<li>$[a_1, a_2, a_3] = [0, 0, 0]$</li>
</ul>

<p>The end-balanced subarrays in the third test case are:</p>

<ul>
	<li>$[a_2, a_3] = [5, -5]$</li>
	<li>$[a_1, a_2, a_3, a_4] = [-10, 5, -5, 10]$</li>
</ul>
# [Platinum IV] Happy Subarrays - 26434

[문제 링크](https://www.acmicpc.net/problem/26434)

### 성능 요약

시간 제한: 25 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 53, 정답: 39, 맞힌 사람: 39, 정답 비율: 76.471%

### 분류

자료 구조, 누적 합, 스택

### 문제 설명

<p>Let us define $F(B, L, R)$ as the sum of a subarray of an array $B$ bounded by indices $L$ and $R$ (both inclusive). Formally, $F(B, L, R) = B_L + B_{L+1} + \cdots + B_R$.</p>

<p>An array $C$ of length $K$ is called a happy array if all the prefix sums of $C$ are non-negative. Formally, the terms $F(C, 1, 1), F(C, 1, 2), \dots, F(C, 1, K)$ are all non-negative.</p>

<p>Given an array $\mathbf{A}$ of $\mathbf{N}$ integers, find the result of adding the sums of all the happy subarrays in the array $\mathbf{A}$.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow.</p>

<p>Each test case begins with one line consisting an integer $\mathbf{N}$ denoting the number of integers in the input array $\mathbf{A}$. Then the next line contains $\mathbf{N}$ integers $\mathbf{A_1}, \mathbf{A_2}, \dots, \mathbf{A_N}$ representing the integers in given input array $\mathbf{A}$.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the result of adding the sums of all happy subarrays in the given input array $\mathbf{A}$.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$-800 \le \mathbf{A_i} \le 800$, for all $i$.</li>
</ul>
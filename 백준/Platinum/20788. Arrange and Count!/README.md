# [Platinum IV] Arrange and Count! - 20788

[문제 링크](https://www.acmicpc.net/problem/20788)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 49, 정답: 10, 맞힌 사람: 10, 정답 비율: 24.390%

### 분류

문자열, KMP

### 문제 설명

<p>Alice has a sequence $a_1,a_2,\dots,a_n$. She can rearrange the sequence using the following operation any number of times:</p>

<ul>
	<li>Select an integer $i$ ($1 \le i \le n$) and change the sequence to $a_i, a_{i-1}, \dots, a_1, a_n, a_{n-1}, \dots, a_{i+1}$.</li>
</ul>

<p>Alice would like to know the number of different sequences can be obtained modulo $(10^9+7)$.</p>

### 입력

<p>The input consists of several test cases terminated by end-of-file. For each test case:</p>

<p>The first line contains an integer $n$, the length of the sequence.</p>

<p>The second line contains $n$ integers $a_1, a_2, \dots, a_n$.</p>

### 출력

<p>For each test case, print an integer which denotes the result.</p>

### 제한

<ul>
	<li>$1 \leq n \leq 10^5$</li>
	<li>$1 \leq a_i \leq n$</li>
	<li>The sum of $n$ does not exceed $2 \times 10^6$.</li>
</ul>
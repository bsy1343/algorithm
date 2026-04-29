# [Gold II] Introduction to Number Theory - 34920

[문제 링크](https://www.acmicpc.net/problem/34920)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 95, 정답: 37, 맞힌 사람: 29, 정답 비율: 36.709%

### 분류

누적 합, 수학, 정렬, 정수론

### 문제 설명

<p>Busy Beaver has just learned about divisors and multiples in elementary school. Now, Busy Beaver challenges you with the following problem.</p>

<p>You are given a sequence $a$ of length $N$. Find any <strong>positive</strong> integer $X$ such that:</p>

<ul>
<li>For every $i$, $X$ is either a multiple or a divisor of $a_i$;</li>
<li>there exists at least one index $i$ such that $X$ is a multiple of $a_i$;</li>
<li>there exists at least one index $i$ such that $X$ is a divisor of $a_i$;</li>
</ul>

<p>or determine that no such integer exists.</p>

### 입력

<p>The first line contains a single integer $T$ ($1\leq T\leq 10^4$) --- the number of test cases.</p>

<p>The first line of each test case contains an integer $N$ ($2\le N\le 3 \cdot 10^5$) --- the length of the sequence $a$.</p>

<p>The second line of each test case contains $N$ integers $a_1, a_2, \dots, a_N$ ($1 \le a_i \le 10^9$).</p>

<p>The sum of $N$ across all test cases does not exceed $3 \cdot 10^5$.</p>

### 출력

<p>For each test case, output a single integer --- the value of $X$, or $-1$ if no such $X$ exists.</p>

<p>If there are multiple valid values for $X$, you may output any of them.</p>

### 힌트

<p>In the first test case, $6$ is a divisor of $36$ and $12$, and is a multiple of $2$.</p>

<p>In the second test case, $10$ is a divisor of all elements, and also a multiple of $10$.</p>

<p>In the third test case, there is no integer that satisfies the constraints.</p>
# [Gold II] Number Reduction - 34490

[문제 링크](https://www.acmicpc.net/problem/34490)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 31, 정답: 12, 맞힌 사람: 11, 정답 비율: 36.667%

### 분류

다이나믹 프로그래밍, 백트래킹, 브루트포스 알고리즘, 수학

### 문제 설명

<p>Busy Beaver is given a positive integer $k$ ($1 \le k \le 10^{18}$) written in base $10$. Then, he repeatedly performs the following operation:</p>

<p>Choose a digit in $k$ that is greater than $1$. If $k$ is divisible by that digit, divide $k$ by that digit. Repeat this process on the resulting number until either $1$ is reached or there are no more legal operations. Call $k$ <em>valid</em> if there exists a way to reduce it to $1$ via this operation.</p>

<p>Compute the number of $k$ in the range $1, \dots, N$ that are valid.</p>

### 입력

<p>The first line of input contains the given integer $N$ ($1 \le N \le 10^{18}$).</p>

### 출력

<p>Output a single line, with a single integer equivalent to the number of integers from $1$ to $N$ that have a way to reach $1$ using the operation.</p>

### 힌트

<p>In the first test case, all integers from $1$ to $9$ can be divided by themselves to reach $1$, so the answer is $9$.</p>

<p>In the second test case, all integers from $1$ to $9$ are valid, as mentioned in the first test case. $10$, $11$, and $13$ have no digits greater than $1$ that are divisors of themselves, and therefore cannot be reduced to $1$. However, $12$ can be divided by $2$ to get $6$, which can in turn be divided by $6$ to get $1$. Therefore, the numbers $1$ through $9$ and $12$ are valid, giving an answer of $10$.</p>
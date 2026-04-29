# [Platinum V] Grand Prix of Array Count - 33286

[문제 링크](https://www.acmicpc.net/problem/33286)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 31, 정답: 17, 맞힌 사람: 15, 정답 비율: 51.724%

### 분류

수학, 정수론, 제곱근 분할법

### 문제 설명

<p>An array $a$ of length $n$ is called <em>funny</em> if, for every pair of indices $(i, j)$ where $1 \le i, j \le n$, the following condition holds: if $i+j$ is an even number, then $a_{(i+j)/2} = \mathrm{gcd}(a_i, a_j)$. For example, an array $[6,2,2,2,4]$ is funny.</p>

<p>You are given two positive integers $n$ and $k$. Find the amount of funny arrays of length $n$ consisting only of integers between $1$ and $k$. As this number may be very large, output it modulo $10^9+7$.</p>

### 입력

<p>The only line contains two integers $n$ and $k$ ($5 \le n \le 10^{12}$, $2 \le k \le 10^{12}$).</p>

### 출력

<p>Print a single number: the answer to the problem modulo $10^9+7$.</p>

### 힌트

<p>In the first sample, there are $4$ funny arrays: $[1,1,1,1,1]$, $[1,1,1,1,2]$, $[2,1,1,1,1]$, $[2,2,2,2,2]$.</p>
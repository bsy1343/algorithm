# [Platinum IV] Junk or Joy - 24694

[문제 링크](https://www.acmicpc.net/problem/24694)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 60, 정답: 16, 맞힌 사람: 12, 정답 비율: 30.000%

### 분류

많은 조건 분기, 수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>You are given a positive integer $k$. Find the number of tuples of positive integers $(n, p, m)$ such that $n^2 - k \cdot p^m = 1$ and $p$ is a prime number, or report that an infinite number of such tuples exists.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 100$). Description of the test cases follows.</p>

<p>The only line of each test case contains a single integer $k$ ($1 \le k \le 10^9$).</p>

### 출력

<p>For each test case, print the number of positive integer tuples $(n, p, m)$ such that $n^2 - k \cdot p^m = 1$ and $p$ is a prime, or $-1$ if there&#39;s an infinite number of them.</p>

### 힌트

<p>In the first example test case, for $k = 5$, the only possible tuples are $(4, 3, 1)$, $(6, 7, 1)$, and $(9, 2, 4)$.</p>

<p>In the second example test case, for $k = 22$, no possible tuples exist.</p>
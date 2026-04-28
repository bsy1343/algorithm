# [Gold III] Joyful Numbers - 21069

[문제 링크](https://www.acmicpc.net/problem/21069)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 197, 정답: 91, 맞힌 사람: 62, 정답 비율: 40.523%

### 분류

수학, 정수론

### 문제 설명

<p>We say that an integer $n \geq 1$ is <em>joyful</em> if, by concatenating the digits $25$ to the right of $n$, we get a perfect square. For example, $2$ is a joyful number (as $225 = 15^2$) but $3$ is not (as $325$ is not a perfect square).</p>

<p>Given an integer $k$ such that $1 \leq k \leq 10^9$, count the number of distinct prime factors of the $k$-th joyful number.</p>

### 입력

<p>The first line contains one integer $t$, the number of test cases ($1 \leq t \leq 4 \cdot 10^3$).</p>

<p>Each test case is given on a separate line containing an integer $k$ ($1 \leq k \leq 10^9$).</p>

### 출력

<p>For each test case, print a line with a single integer: the number of distinct prime factors of the $k$-th joyful number.</p>

### 힌트

<p>The first joyful number is $2$, which has one distinct prime factor. The fourth joyful number is $20 = 2 \cdot 2 \cdot 5$, which has two distinct prime factors.</p>
# [Gold V] Divisibility Trick - 30599

[문제 링크](https://www.acmicpc.net/problem/30599)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 282, 정답: 182, 맞힌 사람: 137, 정답 비율: 68.500%

### 분류

수학, 애드 혹, 해 구성하기

### 문제 설명

<p>Dmitry has recently learned a simple rule to check if an integer is divisible by 3. An integer is divisible by 3 if the sum of its digits is divisible by 3.</p>

<p>Later he also learned that the same rule can be used to check if an integer is divisible by 9. An integer is divisible by 9 if the sum of its digits is divisible by 9.</p>

<p>Dmitry&#39;s elder sister Daria wants to trick him by showing that the same rule can be applied to any divisor $d$. To do this, she wants to show Dmitry an example of a positive integer $n$ such that $n$ is divisible by $d$, and the sum of the digits of $n$ is also divisible by $d$. Help her to find such a number.</p>

### 입력

<p>The only line contains a single integer $d$ ($1\le d\le 1000$).</p>

### 출력

<p>Print a positive integer $n$ divisible by $d$ such that the sum of its digits is also divisible by $d$.</p>

<p>The value of $n$ must consist of at most $10^6$ digits and must not have leading zeroes. It can be shown that such an integer always exists. If there are multiple answers, print any of them.</p>

### 힌트

<p>In the first example, $3$ is divisible by $3$, and its sum of digits, $3$, is also divisible by $3$.</p>

<p>In the second example, $1898$ is divisible by $13$, and its sum of digits, $1 + 8 + 9 + 8 = 26$, is also divisible by $13$.</p>

<p>In the third example, any positive integer satisfies the conditions.</p>
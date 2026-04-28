# [Gold II] Jealous Numbers - 3559

[문제 링크](https://www.acmicpc.net/problem/3559)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 62, 정답: 33, 맞힌 사람: 27, 정답 비율: 52.941%

### 분류

포함 배제의 원리, 수학, 정수론

### 문제 설명

<p>There is a trouble in Numberland, prime number $p$ is jealous of another prime number $q$. She thinks that there are more integer numbers between $a$ and $b$, inclusively, that are divisible by greater power of $q$ than that of $p$. Help $p$ to get rid of her feelings.&nbsp;</p>

<p>Let $\alpha(n, x)$ be maximal $k$ such that $n$ is divisible by $x^k$. Let us say that a number $n$ is $p$-dominating over~$q$ if $\alpha(n, p)&gt;\alpha(n, q)$. Find out for how many numbers between $a$ and $b$, inclusive are $p$-dominating over~$q$.</p>

### 입력

<p>The first line of the input file contains $a$, $b$, $p$ and $q$ ($1 \le a \le b \le 10^{18}$; $2 \le p, q \le 10^9$; $p \ne q$; $p$ and $q$ are prime).</p>

### 출력

<p>Output one number --- how many numbers $n$ between $a$ and $b$, inclusive, are $p$-dominating over $q$.</p>

### 힌트

<p>In the given example 3, 9, 15 and 18 are 3-dominating over 2.</p>
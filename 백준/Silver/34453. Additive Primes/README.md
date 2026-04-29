# [Silver IV] Additive Primes - 34453

[문제 링크](https://www.acmicpc.net/problem/34453)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 55, 정답: 46, 맞힌 사람: 39, 정답 비율: 81.250%

### 분류

소수 판정, 수학, 정수론

### 문제 설명

<p>A <strong>prime number</strong> is an integer $n$ ($n \ge 2$) such that $n$ cannot be formed as the product of two other integers smaller than $n$. In other words, a number is prime if its factors are only one and itself. An integer which is greater than $2$ and is not prime is called a <strong>composite number</strong>.</p>

<p>An <strong>additive prime</strong> in base-$10$ is a number which is both prime <em>and</em> the sum of its digits forms a prime number. For example, $23$ is an additive prime, since $23$ is prime, and $2 + 3 = 5$ is also prime, but $13$ is not, since $1 + 3 = 4$, and $4$ is not prime.</p>

### 입력

<p>Input consists of a single integer $n$ ($2 \le n \le 2^{31} - 1$).</p>

### 출력

<p>Output "<code>ADDITIVE PRIME</code>" if the number is an additive prime. Output "<code>PRIME, BUT NOT ADDITIVE</code>" if the number is prime, but not an additive prime. Output "<code>COMPOSITE</code>" otherwise.</p>
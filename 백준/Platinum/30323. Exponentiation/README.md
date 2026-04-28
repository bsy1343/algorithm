# [Platinum IV] Exponentiation - 30323

[문제 링크](https://www.acmicpc.net/problem/30323)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 448, 정답: 131, 맞힌 사람: 99, 정답 비율: 32.459%

### 분류

수학, 다이나믹 프로그래밍, 분할 정복을 이용한 거듭제곱

### 문제 설명

<p>Exponentiation is a mathematical operation that involves raising a base number to a certain exponent to obtain a result. In the expression $a^n$, where $a$ is the base and $n$ is the exponent, it means multiplying $a$ by itself $n$ times. The result of this operation is called the <u>exponentiation</u> of $a$ to the $n$-th power. For examples, $2^3=2 \times 2 \times 2=8$ and $5^2=5 \times 5=25$. In these examples, $2$ is the base, $3$ is the exponent in the first case, and $5$ is the base, and $2$ is the exponent in the second case. Exponentiation is a fundamental operation in mathematics and is commonly used in various contexts, such as solving equations, and cryptography.</p>

<p>In many cryptographic algorithms, particularly those based on number theory like RSA (Rivest-Shamir-Adleman) and Diffie-Hellman, modular exponentiation is a fundamental operation. Modular exponentiation involves raising a base to an exponent modulo a modulus. This operation is computationally intensive but relatively easy to perform, even for very large numbers.</p>

<p>Let $x+\frac{1}{x}= \alpha$ where $\alpha$ is a positive integer. Please write a program to compute $x^\beta + \frac{1}{x^\beta} \bmod m$ for given positive integers $\beta$ and $m$.</p>

### 입력

<p>The input has only one line, and it contains three space-separated positive integers $\alpha$, $\beta$ and $m$. $\alpha$, $\beta$ and $m$ are positive integers less than $2^{64}$.</p>

### 출력

<p>Outout $x^\beta + \frac{1}{x^\beta} \bmod m$. You may assume $x^\beta + \frac{1}{x^\beta}$ is an integer. If there are multiple solutions, you may output any of them in the range from $0$ to $m-1$.</p>

### 힌트

<p>$x$ can be a complex number. For example, $x$ is either $\frac{1 + \sqrt{3}i}{2}$ or $\frac{1 - \sqrt{3}i}{2}$ if $\alpha=1$. However, $x^\beta + \frac{1}{x^\beta}$ is always an integer in this problem.</p>
# [Gold IV] Modular Reverse Engineering - 20717

[문제 링크](https://www.acmicpc.net/problem/20717)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 65, 정답: 29, 맞힌 사람: 25, 정답 비율: 43.860%

### 분류

수학, 브루트포스 알고리즘, 정수론, 모듈로 곱셈 역원

### 문제 설명

<p>Sometimes, competitive programming questions whose outputs are rational numbers $\frac{p}{q}$ ask you to output the quantity $pq^{-1} \bmod m$ instead, for some prime modulus $m$. However, this quantity is difficult to debug when your program is giving you the wrong answer because calculating $q^{-1}$ is difficult to do by hand and the magnitude of the quantity can be very large for small rationals. For example, $1 \cdot 2^{-1} \bmod 97 = 49$.</p>

<p>To debug your solution quickly, you want to create a program that given $pq^{-1} \bmod m$ recovers the values of $p$ and $q$. The possible values for $p$ and $q$ are not unique, but to help you narrow it down, you know that $\frac{p}{q}$ (interpreted as an ordinary rational number) is in the range $[x, x + 1)$ for some integer $x$.</p>

<p>Given the three values $v$, $x$, and $m$, find the minimum possible $p$ and corresponding $q$ such that ($0 \leq p, q &lt; m$) $pq^{-1} \equiv v \bmod m$ and $x \leq \frac{p}{q} &lt; x + 1$.</p>

### 입력

<p>The input is a single line with three space-separated integers $v$, $x$, and $m$, where $3 \leq m \leq 10^6$, $1 \leq v &lt; m$, $0 \leq x &lt; m$, and $m$ is prime.</p>

### 출력

<p>Print the minimal integer $p$ and the corresponding $q$ such that $0 \leq p,q &lt; m$, $pq^{-1} \equiv v \bmod m$, and $x \leq \frac{p}{q} &lt; x + 1$. If there are multiple such $p$ and $q$, print the pair with the minimum value of $p$. If no such $p$ and $q$ exist, then print a single $-1$ instead.</p>
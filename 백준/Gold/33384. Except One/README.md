# [Gold III] Except One - 33384

[문제 링크](https://www.acmicpc.net/problem/33384)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 29, 정답: 22, 맞힌 사람: 19, 정답 비율: 76.000%

### 분류

분할 정복을 이용한 거듭제곱, 수학, 정수론

### 문제 설명

<p>You are given three integers $p$, $k$, $t$, where $p$ is a prime number.</p>

<p>The set $S$ is defined as follows: $S = \{x \mid x \in N, \ 1 \leq x \leq p - 1, \ x \neq k \}$.</p>

<p>Find the sum of the products of all $t$-element subsets of $S$, modulo $p$.</p>

### 입력

<p>The first line contains three integers $p$, $k$, $t$ ($p$ is a prime number; $1 \leq k \leq p-1$; $1 \leq t \leq p-2$; $p \leq 10^9$).</p>

### 출력

<p>Print the sum of the products of all $t$-element subsets of $S$, modulo $p$.</p>
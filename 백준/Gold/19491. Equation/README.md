# [Gold V] Equation - 19491

[문제 링크](https://www.acmicpc.net/problem/19491)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 86, 정답: 42, 맞힌 사람: 40, 정답 비율: 50.633%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>For a positive integer $n$, let $f(n)$ be the sum of squares of its digits in the decimal notation. Given are three integers $k, a, b$. Your task is to determine the number of such natural numbers $n$, that $a \le n \le b$ and $n$ is the solution of the equation \[ k\cdot f(n) = n. \]</p>

### 입력

<p>The first and only line of the input contains three integers of the task statement: $k, a, b$, ($1 \le k, a, b \le 10^{18}$, $a \le b$).</p>

### 출력

<p>Your program should output a single integer: the number of integral solutions of the given equation contained in the range $[a,b]$.</p>

### 힌트

<p>In the example, the only positive integers $n$ from the range $[5000,10000]$ satisfying the equation for $k=51$ are $7293$, $7854$ and $7905$.</p>
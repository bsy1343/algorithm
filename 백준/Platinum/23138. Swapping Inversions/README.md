# [Platinum IV] Swapping Inversions - 23138

[문제 링크](https://www.acmicpc.net/problem/23138)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 26, 정답: 17, 맞힌 사람: 16, 정답 비율: 66.667%

### 분류

수학, 자료 구조, 세그먼트 트리

### 문제 설명

<p>You are given a permutation $x$ of the integers from $1$ to $n$.</p>

<p>You want to sort this permutation by a sequence of operations. In one operation, you select two adjacent elements $x_i$ and $x_{i+1}$ such that $x_i &gt; x_{i+1}$ and swap them. When there are multiple choices of such $i$, you choose one of them with equal probability. When there is no such $i$, the process ends.</p>

<p>The cost of swapping $x_i$ and $x_{i+1}$ is $|x_i - x_{i+1}|$. Calculate the expected total cost of sorting the permutation modulo $10^9 + 7$.</p>

### 입력

<p>The first line of input contains an integer $n$ ($1 \leq n \leq 10^6$).</p>

<p>The second line contains $n$ integers $x_1, x_2, \ldots, x_n$ ($1 \leq x_i \leq n$). It is guaranteed that $x$ is a permutation of the integers from $1$ to $n$.</p>

### 출력

<p>Print a single line containing an integer: the expected total cost modulo $10^9 + 7$.</p>

<p>Formally, it can be shown that the expected total cost can be represented as a fraction $p / q$ for some coprime non-negative integers $p$ and $q$. For example, if the expected total cost is an integer, then we just have $q = 1$. You have to print the value $p \cdot q^{-1} \bmod (10^9 + 7)$.</p>
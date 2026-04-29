# [Gold I] Irreducible Fractions - 33341

[문제 링크](https://www.acmicpc.net/problem/33341)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

비트 집합, 수학, 유클리드 호제법, 정수론, 조합론

### 문제 설명

<p>Given an array $a$ consisting of $n$ positive integers, find the number of quadruples of distinct indices $(i, j, k, l)$ such that the following fraction is irreducible:</p>

<p>$$\frac{a_i \cdot a_j}{a_k \cdot a_l}\text{.}$$</p>

### 입력

<p>The first line contains an integer $n$ ($4 \leq n \leq 2000$) denoting the length of the array. The second line contains $n$ integers $a_i$ ($1 \leq a_i \leq 10^{12}$), the elements of the array.</p>

### 출력

<p>Output a single integer: the number of quadruples satisfying the given condition.</p>
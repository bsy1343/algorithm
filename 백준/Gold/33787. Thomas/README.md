# [Gold V] Thomas - 33787

[문제 링크](https://www.acmicpc.net/problem/33787)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 50, 정답: 37, 맞힌 사람: 31, 정답 비율: 70.455%

### 분류

비트마스킹, 애드 혹, 해 구성하기, 홀짝성

### 문제 설명

<p>You are given an integer $n$. Find the largest set of distinct binary strings of length $n$ such that no two strings in the set differ at exactly one index.</p>

<p>For example, for $n=5$, the strings $10001$ and $11001$ could not both be in the set, because they only differ in their second positions.</p>

### 입력

<p>The first and only line of the input contains one integer $n$ ($1 \leq n \leq 15$) --- the size of the binary strings in the set.</p>

### 출력

<p>The first line of output should contain a single integer $k$ ($0 \leq k \leq 2^n$) --- the number of strings in your set.</p>

<p>Each of the next $k$ lines should contain a single binary string of size $n$ --- one of the strings in your set. No two of these strings should be equal, or differ in exactly one position.</p>

<p>If there are multiple solutions, you may print any.</p>

### 힌트

<p>In the first sample case, we choose the set $\{0\}$, and in the second sample case, we choose the set $\{00, 11\}$. Neither of these sets contain two strings that differ in exactly one position, and we can show that they are both of maximal size for their given $n$.</p>
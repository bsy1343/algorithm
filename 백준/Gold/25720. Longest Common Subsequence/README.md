# [Gold IV] Longest Common Subsequence - 25720

[문제 링크](https://www.acmicpc.net/problem/25720)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 57, 정답: 23, 맞힌 사람: 14, 정답 비율: 38.889%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Given a sequence $s$ of length $n$ and a sequence $t$ of length $m$, find the length of the longest common subsequence of $s$ and $t$.</p>

### 입력

<p>There are multiple test cases. The first line of input contains an integer $T$ ($1\le T\le 10^3$), the number of test cases.</p>

<p>For each test case:</p>

<p>The only line contains seven integers: $n$, $m$, $p$, $x$, $a$, $b$, and $c$ ($1 \le n, m \le 10^6$, $0 \le x, a, b, c &lt; p\le 10^9$). Here, $n$ is the length of $s$, and $m$ is the length of $t$.</p>

<p>To avoid large input, you should generate the sequences as follows:</p>

<p>For each $i = 1, 2, \ldots, n$ in order, update $x$ to $(a x^2 + b x + c) \bmod p$, and then set $s_i$ to $x$. And then, for each $i = 1, 2, \ldots, m$ in order, update $x$ to $(a x^2 + b x + c) \bmod p$, and then set $t_i$ to $x$.</p>

<p>It is guaranteed that both the sum of $n$ and the sum of $m$ over all test cases do not exceed $10^6$.</p>

### 출력

<p>For each test case:</p>

<p>Output a single line with a single integer: the length of the longest common subsequence of $s$ and $t$.</p>

### 힌트

<p>In the first sample, $s=[3,13,183,905]$ and $t=[731,565,303]$.</p>

<p>In the second sample, $s=[0,0,0]$ and $t=[0,0,0,0]$.</p>
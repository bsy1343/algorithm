# [Platinum III] Subsequence Sums - 19073

[문제 링크](https://www.acmicpc.net/problem/19073)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 31, 맞힌 사람: 24, 정답 비율: 60.000%

### 분류

그리디 알고리즘

### 문제 설명

<p>Yuta has a sequence of $n$ positive integers $A_1, \ldots, A_n$, and their sum is $m$. For each subsequence $S$ of $A$, he calculated the sum of elements in this subsequence.</p>

<p>So, now Yuta has also got $2^n$ integers between $0$ and $m$. For each $i \in [0, m]$, let $B_i$ be the number of integers $i$ he got.</p>

<p>Yuta shows you the array $B_i$, and he asks you to restore $A_1, \ldots, A_n$. If there are several possibilities, find the lexicographically smallest possible sequence.</p>

### 입력

<p>The first line of the input contains two integers $n$ and $m$ ($1 \leq n \leq 50$, $1 \leq m \leq 10^4$).</p>

<p>The second line contains $m + 1$ integers $B_0, \ldots, B_m$ ($0 \leq B_i \leq 2^n$).</p>

### 출력

<p>Print a single line with $n$ integers $A_1, \ldots, A_n$.</p>

<p>It is guaranteed that there exists at least one solution. And if there are several possible solutions, print the <strong>lexicographically smallest</strong>&nbsp;one.</p>

### 힌트

<p>In the first example, $A$ is $[1, 2]$. $A$ has four subsequences $[]$, $[1]$, $[2]$ and $[1,2]$, and the sums for them are $0$, $1$, $2$ and $3$. So, $B = [1, 1, 1, 1]$.</p>
# [Silver I] A. Nihilation - 35166

[문제 링크](https://www.acmicpc.net/problem/35166)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 36, 정답: 20, 맞힌 사람: 18, 정답 비율: 52.941%

### 분류

수학, 애드 혹, 유클리드 호제법, 정수론, 해 구성하기

### 문제 설명

<p>You are given an array $A = [A_1, A_2, \ldots, A_N]$ consisting of $N$ positive integers.</p>

<p>In one operation, you can choose integers $m$ and $k$ such that $1 \leq k &lt; m \leq 10^9$ and set $A_i := (A_i \times k) \bmod m$ for $1 \leq i \leq N$.</p>

<p>What is the minimum number of operations needed to make all $A_i$ equal to $0$? Output any sequence of operations to be done. It can be proven that it is always possible to make all $A_i$ equal to $0$.</p>

### 입력

<p>Input begins with an integer $N$ ($1 \le N \le 100\,000$). The next line contains $N$ integers $A_i$ ($1 \le A_i \le 10^9$) representing the given array $A$.</p>

### 출력

<p>In the first line, output the minimum number $q$ of operations needed.</p>

<p>In the next $q$ lines, output two integers $m$ and $k$, representing the operation in the sequence of operations that makes all $A_i$ equal to $0$. If there are multiple such sequences, output any one of them.</p>
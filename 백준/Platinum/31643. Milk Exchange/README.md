# [Platinum II] Milk Exchange - 31643

[문제 링크](https://www.acmicpc.net/problem/31643)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 66, 정답: 50, 맞힌 사람: 48, 정답 비율: 81.356%

### 분류

자료 구조, 집합과 맵, 누적 합, 스택

### 문제 설명

<p>Farmer John's $N$ $(1 \leq N \leq 5 \cdot 10^5)$ cows are lined up in a circle.
The $i$th cow has a bucket with integer capacity $a_i$ $(1 \leq a_i \leq 10^9)$
liters. All buckets are initially full.

<p>Every minute, cow $i$ will pass all the milk in their bucket to cow $i+1$ for
$1\le i&lt;N$, with cow $N$ passing its milk to cow $1$. All exchanges happen
simultaneously (i.e., if a cow has a full bucket but gives away $x$ liters of
milk and also receives $x$ liters, her milk is preserved). If a cow's total milk
ever ends up exceeding $a_i$, then the excess milk will be lost.

<p>After each of $1, 2, \dots, N$ minutes, how much total milk is left among all
cows?

### 입력

The first line contains $N$. 

<p>The next line contains integers $a_1,a_2,...,a_N$.

### 출력

Output $N$ lines, where the $i$-th line is the total milk left among all cows
after $i$ minutes.
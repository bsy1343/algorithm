# [Gold IV] Purchasing Milk - 35340

[문제 링크](https://www.acmicpc.net/problem/35340)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 42, 정답: 20, 맞힌 사람: 18, 정답 비율: 56.250%

### 분류

그리디 알고리즘, 비트마스킹, 수학

### 문제 설명

<p>On National Milk Day, Farmer John is offering exclusive prices on buckets of milk! He has $N$ ($1 \leq N \leq 10^5$) deals numbered from $1$ to $N$. For the $i$'th deal, he is offering $2^{i-1}$ buckets of milk for $a_i$ ($1 \leq a_i \leq 10^9, a_i &lt; a_{i+1}$) moonies. The same deal may be taken any non-negative integer number of times.</p>

<p>You are thinking about $Q$ ($1 \leq Q \leq 10^4$) independent queries. For each query, you have an integer $x$ ($1 \leq x \leq 10^9$) in mind and wonder what is the minimum cost to purchase at least $x$ buckets of milk.</p>

### 입력

<p>The first line contains two integers $N$ and $Q$.</p>

<p>The following line contains $a_1, a_2, \ldots, a_N$.</p>

<p>Each of the following $Q$ lines contains an integer $x$, representing a query.</p>

### 출력

<p>For each query, output the minimum cost on a new line.</p>

<p><strong>Note that the large size of integers involved in this problem may require the use of 64-bit integer data types (e.g., a "long long" in C/C++).</strong></p>
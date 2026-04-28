# [Platinum I] Subsequence Sum Queries - 19333

[문제 링크](https://www.acmicpc.net/problem/19333)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 258, 정답: 55, 맞힌 사람: 44, 정답 비율: 24.444%

### 분류

다이나믹 프로그래밍, 분할 정복, 오프라인 쿼리

### 문제 설명

<p>You have an array $a$ containing $n$ integers and an integer $m$. You also have $q$ queries to answer. The $i$-th query is described as a pair of integers $(l_i, r_i)$. Your task is to calculate the number of such subsequences $a_{j_1}, a_{j_2}, \ldots, a_{j_k}$ that $l_i \le j_1 &lt; j_2 &lt; \ldots &lt; j_k \le r_i$ and $(a_{j_1} + a_{j_2} + \ldots + a_{j_k}) \bmod m = 0$. In other words, you need to calculate the number of subsequences of subarray $[a_{l_i}, a_{l_i + 1}, \ldots, a_{r_i}]$ such that the sum of elements in each subsequence is divisible by $m$.</p>

### 입력

<p>The first line contains two integers $n$ and $m$: the number of elements in $a$ and the modulo ($1 \le n \le 2 \cdot 10^5$, $1 \le m \le 20$).</p>

<p>The second line contains $n$ integers $a_i$: the elements of array $a$ ($0 \le a_i \le 10^9$).</p>

<p>The third line contains one integer $q$: the number of queries ($1 \le q \le 2 \cdot 10^5$).</p>

<p>Then $q$ lines follow. The $i$-th of these lines contains two integers $l_i$ and $r_i$ that describe the $i$-th query ($1 \le l_i \le r_i \le n$).</p>

### 출력

<p>Print $q$ lines. The $i$-th of them must contain the answer for the $i$-th query. Queries are indexed in the order they are given in the input. Since the answers can be very large, print them modulo $10^9 + 7$.</p>
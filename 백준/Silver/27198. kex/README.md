# [Silver II] kex - 27198

[문제 링크](https://www.acmicpc.net/problem/27198)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 96, 정답: 53, 맞힌 사람: 46, 정답 비율: 62.162%

### 분류

이분 탐색

### 문제 설명

<p>Consider the set of non-negative integers $A$. The minimum non-negative integer that does not occur in this set is considered, for example, in game theory, and is denoted as $\mathrm{mex}(A)$. For example, $\mathrm{mex}(\{0, 1, 2, 4, 5, 9\})=3$.</p>

<p>Ann has decided to generalize the concept of mex. Consider a positive integer $k$ and a set of non-negative integer $A$. Denote as $\mathrm{kex}(A,k)$ a non-negative integer that is $k$-th in ascending order among all integers that are not in $A$. For example, $\mathrm{kex}(\{0, 1, 2, 4, 5, 9\}, 2)=6$.</p>

<p>You must find $\mathrm{kex}(A, k_i)$ for the given set of integers $A$ and $q$ values of $k_i$.</p>

### 입력

<p>The first line of input contains two integers $n$ and $q$ ($1 \leq n, q \leq 10^5$) --- number of elements in $A$ and number of $\mathrm{kex}$ numbers, that you have to find.</p>

<p>In second line of input contains $n$ different not negative integers, each of which is at most $10^9$, --- elements of $A$.</p>

<p>In third line of input contains $q$ integers $k_i$  ($1\leq k_i \leq 10^9$).</p>

### 출력

<p>Print values: $\mathrm{kex}(A, k_1), \mathrm{kex}(A, k_2),\ldots, \mathrm{kex}(A,k_q)$.</p>
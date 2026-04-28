# [Platinum V] Three Arrays - 19324

[문제 링크](https://www.acmicpc.net/problem/19324)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 56, 정답: 34, 맞힌 사람: 32, 정답 비율: 60.377%

### 분류

이분 탐색, 두 포인터

### 문제 설명

<p>You are given three arrays: $a$ containing $n_a$ elements, $b$ containing $n_b$ elements and $c$ containing $n_c$ elements. These arrays are sorted in non-decreasing order: that is, for every $i$ such that $1 \le i &lt; n_a$ we have $a_i \le a_{i + 1}$, for every $j$ such that $1 \le j &lt; n_b$ we have $b_j \le b_{j + 1}$, and for every $k$ such that $1 \le k &lt; n_c$ we have $c_k \le c_{k + 1}$.</p>

<p>Your task is to calculate the number of triples $(i, j, k)$ such that $|a_i - b_j| \le d$, $|a_i - c_k| \le d$, and $|b_j - c_k| \le d$.</p>

### 입력

<p>The input contains one or more test cases. Each test case consists of four lines.</p>

<p>The first line of each test case contains four integers: $d$, $n_a$, $n_b$, and $n_c$ ($1 \le d \le 10^9$, $1 \le n_a, n_b, n_c \le 5 \cdot 10^5$).</p>

<p>The second line contains $n_a$ integers $a_1, a_2, \ldots, a_{n_a}$: the array $a$ ($-10^9 \le a_i \le 10^9$).</p>

<p>The third line contains $n_b$ integers $b_1, b_2, \ldots, b_{n_b}$: the array $b$ ($-10^9 \le b_i \le 10^9$).</p>

<p>The fourth line contains $n_c$ integers $c_1, c_2, \ldots, c_{n_c}$: the array $c$ ($-10^9 \le c_i \le 10^9$).</p>

<p>All arrays are sorted in non-decreasing order. The total sum of $n_a$ over all testcases does not exceed $5 \cdot 10^5$. The total sum of $n_b$ over all testcases does not exceed $5 \cdot 10^5$. The total sum of all $n_c$ over all testcases does not exceed $5 \cdot 10^5$. The test cases just follow one another without any special separators.</p>

### 출력

<p>For each test case, print a single integer: the number of triples $(i, j, k)$ such that $|a_i - b_j| \le d$, $|a_i - c_k| \le d$, and $|b_j - c_k| \le d$.</p>
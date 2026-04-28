# [Gold I] Leave Out All The Rest - 19086

[문제 링크](https://www.acmicpc.net/problem/19086)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 30, 정답: 16, 맞힌 사람: 15, 정답 비율: 53.571%

### 분류

애드 혹, 가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>You are given two integer arrays: an array $a$ of length $n$ and an array $b$ of length $m$. All integers in both arrays are <strong>pairwise distinct</strong>.</p>

<p>An <em>interleaving</em>&nbsp;of the two arrays is an array $c$ of size $n + m$ such that arrays $a$ and $b$ are its disjoint subsequences. Formally, there exist indices $i_1 &lt; i_2 &lt; \ldots &lt; i_n$ such that $c_{i_1} = a_1$, $c_{i_2} = a_2$, $\ldots$, $c_{i_n} = a_n$, and indices $j_1 &lt; j_2 &lt; \ldots &lt; j_m$ such that $c_{j_1} = b_1$, $c_{j_2} = b_2$, $\ldots$, $c_{j_m} = b_m$. For these indices, $i_x \neq j_y$ for all $x = 1, 2, \ldots, n$ and all $y = 1, 2, \ldots, m$.</p>

<p>It is clear that there are usually many ways to interleave arrays $a$ and $b$. Find such a way that maximizes the length of the longest increasing subsequence of $c$.</p>

### 입력

<p>The first line of input contains integer $n$ ($1 \le n \le 5 \cdot 10^5$) --- the length of array $a$.</p>

<p>The second line contains $n$ integers $a_i$ ($1 \le a_i \le 10^9$).</p>

<p>The third line of input contains integer $m$ ($1 \le m \le 5 \cdot 10^5$) --- the length of array $b$.</p>

<p>The fourth line contains $m$ integers $b_j$ ($1 \le b_j \le 10^9$).</p>

<p>It is guaranteed that the numbers in both arrays are pairwise distinct: $a_i \neq a_j$ for $i \neq j$, $b_i \neq b_j$ for $i \neq j$ and $a_i \neq b_j$ for all valid $i$ and $j$.</p>

### 출력

<p>Output one integer: the maximum length of the longest increasing subsequence in an interleaving of $a$ and $b$.</p>
# [Platinum III] Bayan Testing - 25767

[문제 링크](https://www.acmicpc.net/problem/25767)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 3, 맞힌 사람: 3, 정답 비율: 33.333%

### 분류

해 구성하기

### 문제 설명

<p>Let us recall a well-known problem (also called a &quot;bayan&quot; in Russian). You are given an array $a_1, a_2, \ldots, a_n$ of integers. Answer the queries: given a segment $[l, r]$ ($1 \leq l \leq r \leq n$), check if there exist two equal elements among $a_l, a_{l+1}, \ldots, a_r$.</p>

<p>Please help to make good tests for this well-known problem! You are given two integers $n$, $m$, and also $2m$ <strong>different</strong> segments $[l_i, r_i]$. Find any array $a_1, a_2, \ldots, a_n$ such that, for exactly $m$ queries, the answer is positive, and for exactly $m$ queries, the answer is negative. You should report if there is no such array.</p>

### 입력

<p>The first line contains a single integer $t$ ($1 \leq t \leq 10^5$) --- the number of test cases. Description of test cases follows.</p>

<p>The first line of each test case contains two integers $n$, $m$ ($2 \leq n \leq 2 \cdot 10^5$, $1 \leq m \leq 10^5$).</p>

<p>Each of the next $2m$ lines contains two integers $l_i$, $r_i$ ($1 \leq l_i \leq r_i \leq n$) --- the given segments. It is guaranteed that all segments are different.</p>

<p>It is guaranteed that the sum of $n$ for all test cases does not exceed $2 \cdot 10^5$ and the sum of $m$ for all test cases does not exceed $10^5$.</p>

### 출력

<p>For each test case, print the answer to the problem.</p>

<p>If such an array $a$ exists, print $n$ integers $a_1, a_2, \ldots, a_n$ ($1 \leq a_i \leq 10^9$). Otherwise, print a single integer $-1$.</p>

<p>If there are several possible answers, print any one of them.</p>

### 힌트

<p>Let us consider the third test case. In this case, $f(2, 2) = 0$, $f(2, 3) = 0$, $f(2, 4) = 0$, $f(2, 5) = 0$, $f(3, 3) = 0$, $f(3, 4) = 2$, $f(3, 5) = 2$, $f(4, 4) = 0$, $f(4, 5) = 2$, $f(5, 5) = 0$. So the answer is $6$.</p>
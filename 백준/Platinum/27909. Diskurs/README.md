# [Platinum II] Diskurs - 27909

[문제 링크](https://www.acmicpc.net/problem/27909)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 133, 정답: 67, 맞힌 사람: 56, 정답 비율: 56.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 비트마스킹

### 문제 설명

<p>You are given $n$ non negative integers $a_1, a_2, \dots , a_n$ less than $2^m$. For each of them you are to find the maximum possible <em>hamming distance</em> between it and some other element of the array $a$.</p>

<p>The <em>hamming distance</em> of two non negative integers is defined as the number of positions in the binary representation of these numbers in which they differ (we add leading zeros if necessary).</p>

<p>Formally, for each $i$ calculate: $$\max_{1 \le j \le n}hamming(a_i, a_j)$$</p>

### 입력

<p>The first line contains two integers $n$ and $m$ ($1 &le; n &le; 2^m$, $1 &le; m &le; 20$).</p>

<p>The second line contains $n$ numbers $a_i$ ($0 &le; a_i &lt; 2^m$)</p>

### 출력

<p>Output $n$ numbers seperated with spaces, where the $i$-th number is the maximum <em>hamming distance</em> between $a_i$ and some other number in $a$.</p>

### 힌트

<p>Clarification of the third example: The numbers $3$, $4$, $6$, $10$ can be represented as $0011$, $0100$, $0110$, $1010$, in binary. Numbers $3$ and $4$ differ at $3$ places, same as numbers $4$ and $10$. On the other hand, the number $6$ differs in at most $2$ places with all other numbers.</p>
# [Platinum II] Master Zhu and Instability - 19121

[문제 링크](https://www.acmicpc.net/problem/19121)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 8, 맞힌 사람: 8, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 비트마스킹

### 문제 설명

<p>Consider an array $A$ of length $N$. The <em>instability</em>&nbsp;of $A$ is defined as $$\sum\limits_{i = 1}^{N - 1} (|A[i + 1] - A[i]|)\text{.}$$</p>

<p>Master Zhu wants to stabilize an array. In order to do that, he wants to select an integer $X$ and change every element $A[i]$ to $(A[i] \oplus X)$. Here, $u \oplus v$ is the bitwise XOR of $u$ and $v$.</p>

<p>Find the smallest non-negative integer $X$ Master Zhu must choose to minimize the instability of a given array, and calculate the resulting instability.</p>

### 입력

<p>The first line of input contains an integer $N$ ($1 \le N \le 10^5$). Next line contains $N$ integers $A[i]$, indicating the elements of the array ($0 \le A[i] &lt; 2^{20}$).</p>

### 출력

<p>Print a single line containing two integers: the smallest non-negative integer $X$ which must be used in order to reach the minimum possible instability and the resulting instability itself.</p>
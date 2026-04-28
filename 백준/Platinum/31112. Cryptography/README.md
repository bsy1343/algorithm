# [Platinum V] Cryptography - 31112

[문제 링크](https://www.acmicpc.net/problem/31112)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 7, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

비트마스킹

### 문제 설명

<p>Given three arrays $f$, $g$, $h$ of length $2^m$, Bobo defines a cryptographic function $\mathrm{enc}(x, y) = (a, b)$ where</p>

<ul>
	<li>$a = y \oplus g[x \oplus f[y]]$,</li>
	<li>$b = x \oplus f[y] \oplus h[y \oplus g[x \oplus f[y]]]$.</li>
</ul>

<p>He also has $q$ questions $(a_1, b_1), \dots, (a_q, b_q)$.</p>

<p>For each $(a_i, b_i)$, find a pair of integers $(x, y)$ where $0 \leq x, y &lt; 2^m$ and $\mathrm{enc}(x, y) = (a_i, b_i)$. It is guaranteed that for each $(a_i, b_i)$, there exists a <strong>unique</strong> pair $(x, y)$ satisfying the condition.</p>

<p>Note: $\oplus$ denotes the bitwise exclusive-or, i.e., xor.</p>

### 입력

<p>The input consists of several test cases terminated by end-of-file. For each test case,</p>

<p>The first line contains two integers $m$ and $q$.</p>

<p>The second line contains $2^m$ integers $f[0], \dots, f[2^m - 1]$.</p>

<p>The third line contains $2^m$ integers $g[0], \dots, g[2^m - 1]$.</p>

<p>The forth line contains $2^m$ integers $h[0], \dots, h[2^m - 1]$.</p>

<p>For the following $q$ lines, the $i$-th line contains two integers $a_i$ and $b_i$.</p>

### 출력

<p>For each question, output two integers which denote the found $x$ and $y$.</p>

### 제한

<ul>
	<li>$1 \le m \leq 16$</li>
	<li>$1 \leq q \leq 10^5$</li>
	<li>$0 \leq f[i], g[i], h[i] &lt; 2^m$ for each $0 \leq i &lt; 2^m$</li>
	<li>$0 \leq a_i, b_i &lt; 2^m$ for each $1 \leq i \leq q$</li>
	<li>In each input, the sum of $2^m$ does not exceed $10^5$. The sum of $q$ does not exceed $10^5$.</li>
</ul>
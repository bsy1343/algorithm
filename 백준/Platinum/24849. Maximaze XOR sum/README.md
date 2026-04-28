# [Platinum II] Maximaze XOR sum - 24849

[문제 링크](https://www.acmicpc.net/problem/24849)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 38, 정답: 10, 맞힌 사람: 10, 정답 비율: 30.303%

### 분류

비트마스킹, 가우스 소거법, 선형대수학, 수학

### 문제 설명

<p>Let us use $\oplus$ as the symbol for the operation of <em>bitwise &quot;exclusive or&quot;</em> for integers. In C++ and Java it is denoted by the character &quot;<code>\char 94</code>&quot;, in Pascal and Python --- by the keyword &quot;<code>xor</code>&quot;. For example, $9 \oplus 3 = 1001_2 \oplus 11_2 = 1010_2 = 10$.</p>

<p>You are given two integer arrays $A$ and $B$ of length $n$. Let&#39;s denote $X(A)$ as the result of calculating bitwise &quot;exclusive or&quot; for all elements of the array: $X(A) = A_1 \oplus A_2 \oplus \ldots \oplus A_n$. Simiarly, let&#39;s denote $X(B) = B_1 \oplus B_2 \oplus \ldots \oplus B_n$.</p>

<p>For each $i$ from $1$ to $n$, it is allowed to swap elements $A_i$ and $B_i$. You must find out which elements should be swapped in order for the sum $X(A) + X(B)$ to be maximum possible.</p>

### 입력

<p>The first line contains an integer $n$ --- the size of the arrays ($1 \le n \le {10}^5$). The next line contains $n$ integers $A_i$ --- elements of the array $A$ ($0 \le A_i \le {10}^{18}$). The next line contains the array $B$ in the same format.</p>

### 출력

<p>The first line of output must contain the maximum possible sum $X(A) + X(B)$ and an integer $k$ --- the number of required swaps. The next line must contain $k$ different integers from $1$ to $n$ --- indices of the elements to be swapped.</p>

### 힌트

<p>In the example after the swap the arrays are $A = [2, 1]$ and $B = [1, 2]$.</p>

<p>$X(A) = 2 \oplus 1 = 10_2 \oplus 1_2 = 11_2 = 3$, $X(B) = 3$, $X(A) + X(B) = 6$.</p>
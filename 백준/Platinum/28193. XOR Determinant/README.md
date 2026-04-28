# [Platinum I] XOR Determinant - 28193

[문제 링크](https://www.acmicpc.net/problem/28193)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 8, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

가우스 소거법, 선형대수학, 수학

### 문제 설명

<p>You are given two arrays $b$ and $c$ of length $n$, consisting of non-negative integers. Construct $n \times n$ matrix $A$ as $A_{ij} = b_i \oplus c_j$. Find the determinant of $A$ modulo $998\,244\,353$.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains an integer $t$ ($1 \le t \le 1000$) --- the number of test cases. The descriptions of the $t$ test cases follow.</p>

<p>The first line of each test case contains one integer $n$ ($1 \le n \le 5000$).</p>

<p>The second line contains the array $b_1, b_2, \ldots, b_n$ ($0 \le b_i &lt; 2^{60}$).</p>

<p>The third line contains the array $c_1, c_2, \ldots, c_n$ ($0 \le c_i &lt; 2^{60}$).</p>

<p>The sum of $n$ over all test cases does not exceed $10\,000$.</p>

### 출력

<p>For each test case, print the determinant of matrix $A$ modulo $998\,244\,353$.</p>

### 힌트

<p>First test case:</p>

<p>$ \begin{vmatrix} 6 &amp; 3\\ 1 &amp; 4 \end{vmatrix} = 6 \cdot 4 - 1 \cdot 3 = 21 $</p>

<p>Second test case:</p>

<p>$ \begin{vmatrix} 23\,792\,195\,055\,071\,677 \end{vmatrix} = 23\,792\,195\,055\,071\,677 $</p>

<p>$23\,792\,195\,055\,071\,677 \bmod 998\,244\,353 = 214\,139\,910$</p>

<p>Third test case:</p>

<p>$ \begin{vmatrix} 0 &amp; 3 &amp; 2 &amp; 5 \\ 3 &amp; 0 &amp; 1 &amp; 6 \\ 2 &amp; 1 &amp; 0 &amp; 7 \\ 5 &amp; 6 &amp; 7 &amp; 0 \end{vmatrix} = 3 \cdot 3 \cdot 7 \cdot 7 - 3 \cdot 1 \cdot 7 \cdot 5 - 3 \cdot 6 \cdot 2 \cdot 7 - 2 \cdot 3 \cdot 7 \cdot 6 + 2 \cdot 6 \cdot 2 \cdot 6 - 2 \cdot 6 \cdot 1 \cdot 5 - 5 \cdot 3 \cdot 1 \cdot 7 - 5 \cdot 1 \cdot 2 \cdot 6 + 5 \cdot 1 \cdot 1 \cdot 5 = $</p>

<p>$ = 441 - 105 - 252 - 252 + 144 - 60 - 105 - 60 + 25 = -224 $</p>

<p>$(-224) \bmod 998\,244\,353 = 998\,244\,129$</p>
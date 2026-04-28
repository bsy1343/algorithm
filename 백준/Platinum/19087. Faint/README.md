# [Platinum I] Faint - 19087

[문제 링크](https://www.acmicpc.net/problem/19087)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 21, 맞힌 사람: 13, 정답 비율: 54.167%

### 분류

수학, 조합론

### 문제 설명

<p>Consider the set of integers $\{1, 2, \ldots, n\}$ and all its subsets of size $k$. Let us write each such subset as $a_1, a_2, \ldots, a_k$ where $a_1 &lt; a_2 &lt; \ldots &lt; a_k$. We write them down in lexicographical order row by row, obtaining a table with ${n \choose k}$ rows and $k$ columns. Let the $j$-th integer in the $i$-th row be $A_{i, j}$.</p>

<p>Your task is to calculate the sum of absolute differences between consecutive numbers in a given column. Formally, given a positive integer $m$ ($1 \le m \le k$), calculate the sum $$\sum\limits_{i = 1}^{{n \choose k} - 1} |A_{i, m} - A_{i + 1, m}|\text{.}$$ As the answer can be very large, print it modulo $10^9 + 7$.</p>

### 입력

<p>The only line of input contains three positive integers $n$, $k$ and $m$ ($1 \le n \le 10^6, 1 \le m \le k \le n$).</p>

### 출력

<p>Print a single line with a single integer: the answer to the problem modulo $10^9 + 7$.</p>

### 힌트

<p>In the first example, the table looks as follows.</p>

<p>$$\begin{array}{cc} 1 &amp; 2 \\ 1 &amp; 3 \\ 1 &amp; 4 \\ 2 &amp; 3 \\ 2 &amp; 4 \\ 3 &amp; 4 \\ \end{array}$$</p>

<p>The answer is $|2 - 3| + |3 - 4| + |4 - 3| + |3 - 4| + |4 - 4| = 4$.</p>
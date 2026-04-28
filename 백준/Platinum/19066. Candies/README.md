# [Platinum IV] Candies - 19066

[문제 링크](https://www.acmicpc.net/problem/19066)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 23, 맞힌 사람: 17, 정답 비율: 43.590%

### 분류

비트마스킹

### 문제 설명

<p>Rikka is poor at math. Yuta is worried about that, so he gives Rikka some math tasks to practice. One of them is described below.</p>

<p>There are $n$ children and $m$ kinds of candy. The $i$-th child has $A_i$ dollars, and the unit price of the $i$-th kind of candy is $B_i$. There is an infinite supply of candy of each kind.</p>

<p>Each child has her favorite candy, so she will buy this kind of candy as much as possible and will not buy any candy of other kinds. For example, if a child has $10$ dollars, and the unit price of her favorite candy is $4$ dollars, then she will buy two candies and go home with $2$ dollars left.</p>

<p>Yuta does not know any child&#39;s favorite candy. Now Yuta has $q$ queries, each of them consists of an integer $k$. For each query, Yuta wants to know the number of pairs $(i, j)$ ($1 \leq i \leq n$, $1 \leq j \leq m$) with the following property: if the $i$-th child&#39;s favorite candy is the $j$-th kind, she will take $k$ dollars home.</p>

<p>To make the problem easier, it is only required to calculate the answers modulo $2$. Help Rikka solve this problem for Yuta!</p>

### 입력

<p>The first line of the input contains three integers $n$, $m$ and $q$ ($1 \leq n, m, q \leq 5 \cdot 10^4$).</p>

<p>The second line contains $n$ integers $A_i$ ($1 \leq A_i \leq 5 \cdot 10^4$).</p>

<p>The third line contains $m$ integers $B_i$ ($1 \leq B_i \leq 5 \cdot 10^4$).</p>

<p>The fourth line contains $q$ integers $k_i$ which describe the queries ($0 \leq k_i &lt; \max (B_1, B_2, \ldots, B_m)$).</p>

<p>It is guaranteed that $A_i \neq A_j$ and $B_i \neq B_j$ for all $i \neq j$.</p>

### 출력

<p>For each query, print a single line with a single integer: the answer to the query modulo $2$.</p>
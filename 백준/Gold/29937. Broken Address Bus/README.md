# [Gold IV] Broken Address Bus - 29937

[문제 링크](https://www.acmicpc.net/problem/29937)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 7, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

비트마스킹, 다이나믹 프로그래밍

### 문제 설명

<p>The memory in Juku&#39;s computer has $N$ cells, addressed by numbers $0 \ldots N-1$. To read the value from a cell, you first have to put the cell&#39;s address on the <em>address bus</em>. The address bus consists of $16$ parallel wires---one for each bit of the address. E.g., to read the value at the address $19$, you first write $19$ out in binary---$19 = 2^4 + 2^1 + 2^0 = (10011)_2$---and then put voltage on wires $4$, $1$, and $0$. To read from the address $0$, you don&#39;t put voltage on any of the wires.</p>

<p>However, some wires are broken---when you put voltage on any of them, the memory chip will not register it. E.g, if the wire $0$ is broken, you cannot read from the address $7 = 2^2 + 2^1 + 2^0$ because it requires voltage on the wire $0$. On the other hand, you still can read from $6 = 2^2 + 2^1$.</p>

<p>Given the contents of the memory and the set of all intact wires, compute the sum of all the values you can read.</p>

### 입력

<p>The first line of input contains $N$ ($1 \le N \le 2^{16}$), the number of values in memory, and $Q$ ($1 \le Q \le 10^5$), the number of queries. The next $N$ lines contain the values in memory cells, from $0$ to $N-1$, one per line. Each value is a non-negative integer not larger than $10^9$. The last $Q$ lines contain the queries. Each query gives the address $X_i$ ($0 \le X_i &lt; 2^{16}$) that you get when you put voltage on all the wires that are not broken.</p>

### 출력

<p>The output must contain $Q$ lines, each with the answer to the corresponding query: the sum of the values that can be read from the memory if the set of working address bus wires is as given in the query parameter $X_i$.</p>

### 힌트

<p>In the query &#39;0&#39;, all wires are broken, and only the value $10$ at address $0$ is readable.</p>

<p>In the query &#39;15&#39;, the first $4$ wires are working and all values are readable.</p>

<p>In the last query, only the values $10$ and $1$ are readable.</p>
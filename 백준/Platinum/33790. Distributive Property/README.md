# [Platinum I] Distributive Property - 33790

[문제 링크](https://www.acmicpc.net/problem/33790)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 2048 MB

### 통계

제출: 14, 정답: 12, 맞힌 사람: 9, 정답 비율: 81.818%

### 분류

세그먼트 트리, 자료 구조

### 문제 설명

<p>You are given a set $S$ of $n$ distinct integers. You will also receive $q$ queries, each of one of the following two types:</p>

<ol>
	<li><strong>Query Type 1</strong> ($1$ $x$):

	<ul>
		<li>If $x$ is currently in the set $S$, remove it.</li>
		<li>Otherwise, add $x$ to the set.</li>
	</ul>
	</li>
	<li><strong>Query Type 2</strong> ($2$ $t$):
	<ul>
		<li>Print the cumulative <a href="https://en.wikipedia.org/wiki/Bitwise_operation#XOR">bitwise XOR</a> of $(x + t)$ over all $x \in S$. Formally, print $\displaystyle\bigoplus_{x \in S} (x + t)$.</li>
	</ul>
	</li>
</ol>

### 입력

<p>The first line of the input contains two integers $n$ and $q$ ($1 \leq n,q \leq 3 \cdot 10^5$) --- the initial size of the set and the number of queries, respectively.</p>

<p>The next line of the input will contain $n$ distinct integers $x_1, x_2 \cdots x_n$ ($0 \le x_i &lt; 2^{20}$) --- the initial set.</p>

<p>The next $q$ lines of the input will describe the queries. Each of them will contain a query of the form $1$ $x$ or $2$ $t$ ($0 \le x, t &lt; 2^{20}$), representing the query in the format described above.</p>

<p>It is guaranteed that there is at least one query of type $2$.</p>

### 출력

<p>For each query of type $2$, print the cumulative bitwise XOR of $(x+t)$ over all $x \in S$.</p>

### 힌트

<p>In the sample case, at the time of the first type $2$ query, we have $S = \{1, 6, 15\}$. Since $t = 0$ for this query, we print the value $$(1 + 0) \oplus (6 + 0) \oplus (15 + 0) = 1 \oplus 6 \oplus 15 = 8$$ At the time of the second type $2$ query, we have $S = \{1, 5, 10, 15\}$. Since $t = 3$ for this query, we print the value $$(1 + 3) \oplus (5 + 3) \oplus (10 + 3) \oplus (15 + 3) = 4 \oplus 8 \oplus 13 \oplus 18 = 19$$</p>
# [Platinum IV] Mex XOR - 35137

[문제 링크](https://www.acmicpc.net/problem/35137)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 12, 정답: 7, 맞힌 사람: 6, 정답 비율: 54.545%

### 분류

비트마스킹, 이분 탐색, 자료 구조, 집합과 맵

### 문제 설명

<p>You initially have an empty set $S$, and an integer $K$. You will then have to process $Q$ queries, each giving you an integer $X$, meaning that you will have to <strong>insert</strong> $X$ into $S$ if $X \notin S$, or <strong>remove</strong> $X$ from $S$ if $X \in S$.</p>

<p>After each query, you would like to know the following. Find the minimum of $\text{MEX}(\{s \oplus i : s \in S \})$ for all $0 \le i \le K$.</p>

<p>The operator $\oplus$ is the bitwise XOR operation, while $\text{MEX}$ is a function that returns the smallest non-negative integer that does not appear in the set. In particular, the $\text{MEX}$ of an empty set is $0$.</p>

### 입력

<p>The first line contains two integer $Q$ and $K$ ($1 \le Q \le 200000$; $0 \le K &lt; 2^{30}$).</p>

<p>Each of the next $Q$ lines contains an integer $X$ ($0 \le X &lt; 2^{30}$).</p>

### 출력

<p>Output $Q$ lines, representing the minimum $\text{MEX}$ value after each query. </p>

### 힌트

<p><em>Explanation of Sample 1:</em> After the first query, the set $S$ is $\{1\}$. We can see that $\text{MEX}(\{1 \oplus 0\}) = 0$, and this is the minimum possible value.</p>

<p>After the third query, the set $S$ is $\{0, 1, 2\}$. The values to consider are as follows:</p>

<ul>
<li>$\text{MEX}(\{0 \oplus 0, 1 \oplus 0, 2 \oplus 0\}) = \text{MEX}(\{0, 1, 2\}) = 3$.</li>
<li>$\text{MEX}(\{0 \oplus 1, 1 \oplus 1, 2 \oplus 1\}) = \text{MEX}(\{1, 0, 3\}) = 2$.</li>
<li>$\text{MEX}(\{0 \oplus 2, 1 \oplus 2, 2 \oplus 2\}) = \text{MEX}(\{2, 3, 0\}) = 1$.</li>
</ul>

<p>The minimum among them is $1$.</p>

<p>After the fourth query, the set $S$ is $\{0, 2\}$ and $\text{MEX}(\{0 \oplus 1, 2 \oplus 1\}) = 0$.</p>
# [Gold III] Missing Number Queries - 34462

[문제 링크](https://www.acmicpc.net/problem/34462)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 68, 정답: 21, 맞힌 사람: 14, 정답 비율: 28.571%

### 분류

비둘기집 원리, 애드 혹, 자료 구조, 집합과 맵

### 문제 설명

<p>Busy Beaver has an array of positive integers $a_1, \dots, a_N$, consisting of positive integers at most $N$. He needs to perform $Q$ operations on the array of two types:</p>

<ul>
	<li><code>1</code> $x$ $y$: Set $a_x \leftarrow y$.</li>
	<li><code>2</code> $l$ $r$: Output <strong>any</strong> integer in the range $[1, N]$ that is <em>not</em> found in $a_l, a_{l+1}, \dots, a_r$.</li>
</ul>

<p>Help answer all of Busy Beaver's queries! The input will be generated in such a way that an answer exists for all type <code>2</code> queries.</p>

### 입력

<p>The first line contains two positive integers $N$ and $Q$ ($2 \le N \le 2 \cdot 10^5$; $1 \le Q \le 2 \cdot 10^5$).</p>

<p>The second line contains $N$ integers $a_1, \dots, a_N$ ($1 \le a_i \le N$).</p>

<p>Each of the next $Q$ lines contains three positive integers: either <code>1</code> $x$ $y$ or <code>2</code> $l$ $r$ ($1 \le x, y \le N$; $1 \le l \le r \le N$).</p>

<p>Additional constraint on the input: there is at least one type <code>2</code> query, and every type <code>2</code> query has an answer.</p>

### 출력

<p>For each type <code>2</code> query, output a single line containing the answer. If there are multiple possible answers for a query, you may output any of them.</p>

### 힌트

<p>In the first query, the only integer from $1$ to $5$ missing from $[3, 5, 2, 1, 5]$ is $4$, so $4$ is the only possible answer.</p>

<p>After the second query, the array becomes $[3, 5, 2, 4, 5]$.</p>

<p>After the third query, the array becomes $[3, 5, 1, 4, 5]$.</p>

<p>The last query asks for an integer from $1$ to $5$ missing from $[1, 4, 5]$. Either $2$ or $3$ would be acceptable answers to this query.</p>
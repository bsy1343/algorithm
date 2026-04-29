# [Silver IV] P=NP - 34918

[문제 링크](https://www.acmicpc.net/problem/34918)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 105, 정답: 59, 맞힌 사람: 52, 정답 비율: 69.333%

### 분류

문자열, 애드 혹

### 문제 설명

<p>Busy Beaver has a string $A$ made up of characters <code>P</code> and <code>N</code>. He can perform two types of operations on $A$:</p>

<ul>
<li>Pick a substring<sup>1</sup> <code>P</code> and replace it with <code>NP</code>.</li>
<li>Pick a substring <code>NP</code> and replace it with <code>P</code>.</li>
</ul>

<p>Busy Beaver has a target string $B$. Determine if he can turn $A$ into $B$ after some number of operations.</p>

<hr>
<p><sup>1</sup>A substring of length $k$ is a contiguous sequence of $k$ adjacent characters of a string.</p>

### 입력

<p>The first line contains a single integer $T$ ($1 \leq T \leq 10^4$) --- the number of test cases.</p>

<p>The only line of each test case contains the strings $A$ and $B$ ($1 \leq |A|, |B| \leq 10^5$), consisting of characters <code>P</code> and <code>N</code>.</p>

<p>The sum of $|A|+|B|$ across all test cases does not exceed $2 \cdot 10^5$.</p>

### 출력

<p>For each test case, output <code>YES</code> if Busy Beaver can turn $A$ into $B$ using the operations above, and <code>NO</code> otherwise.</p>

### 힌트

<p>In the first test case, we can perform one operation to turn <code>P</code> into <code>NP</code>.</p>

<p>In the second test case, we can do two operations: <code>P<span style="color:#e74c3c;">NP</span>N</code> $\to$ <code>P<span style="color:#e74c3c;">P</span>N</code> and then <code><span style="color:#e74c3c;">P</span>PN</code> $\to$ <code><span style="color:#e74c3c;">NP</span>PN</code>.</p>

<p>In the third test case, we can show that it is not possible to turn <code>PP</code> into <code>NP</code> using any number of operations.</p>
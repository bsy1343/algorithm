# [Platinum II] Shortest Accepted Word - 19196

[문제 링크](https://www.acmicpc.net/problem/19196)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 8, 정답: 6, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

구현, 문자열, 파싱

### 문제 설명

<p>In this problem, we consider strings consisting of lowercase Latin letters &quot;<code>a</code>&quot;, &quot;<code>b</code>&quot; and &quot;<code>c</code>&quot;.</p>

<p>For this problem, let us define a <em>regular expression</em>&nbsp;recursively as follows:</p>

<ol>
	<li>A single character &quot;<code>$</code>&quot; is a regular expression accepting the empty string.</li>
	<li>Single characters &quot;<code>a</code>&quot;, &quot;<code>b</code>&quot; and &quot;<code>c</code>&quot; are regular expressions accepting strings &quot;<code>a</code>&quot;, &quot;<code>b</code>&quot; and &quot;<code>c</code>&quot;, respectively.</li>
	<li>If $P$ is a regular expression, &quot;<code>(</code>$P$<code>)</code>&quot; is also a regular expression accepting&nbsp; all strings accepted by $P$.</li>
	<li>If $P$ is a regular expression which is a <strong>direct</strong>&nbsp;result of applying any of the rules 1--4, its <em>iteration</em>, denoted as &quot;$P$<code>*</code>&quot;, is also a regular expression accepting strings of the form $s = u_1 u_2 \ldots u_k$ (a concatenation of zero or more strings) where $k$ is any non-negative integer and each string $u_i$ is accepted by $P$.</li>
	<li>If $P$ and $Q$ are regular expressions which are <strong>direct</strong>&nbsp;results of applying any of the rules 1--5, their <em>concatenation</em>, denoted simply as &quot;$P$<code>{}</code>$Q$&quot;, is also a regular expression accepting strings of the form $s = u v$ (a concatenation of $u$ and $v$, each of which may be empty) where the prefix $u$ is accepted by $P$ and the suffix $v$ is accepted by $Q$.</li>
	<li>If $P$ and $Q$ are regular expressions which are <strong>direct</strong>&nbsp;results of applying any of the rules 1--6, their <em>union</em>, denoted as &quot;$P$<code>|</code>$Q$&quot;, is also a regular expression accepting both strings accepted by $P$ and strings accepted by $Q$.</li>
</ol>

<p>The restrictions in rules 4--6 are imposed to prevent ambiguities and prioritize operations: when reading a regular expression, evaluate iteration, then concatenation, then union. Parentheses play the usual role of prioritizing operations enclosed in them. For example, the regular expression &quot;<code>a(bac|ac*)</code>&quot; is read as &quot;accept <code>a</code>&nbsp;followed by either (<code>b</code>&nbsp;followed by <code>a</code> followed by <code>c</code>) or (<code>a</code> followed by zero or more copies of <code>c</code>)&quot;.</p>

<p>Given a regular expression $r$, find the shortest string $s$ which is accepted by this regular expression $r$. If there are several such strings, find the lexicographicaly smallest one.</p>

### 입력

<p>The first line of input contains one integer $T$, the number of test cases ($1 \le T \le 300$).</p>

<p>Each of the next $T$ lines describes a single test case. Each test case description consists of a regular expression $r$ which is a string constructed by the above rules. Its length is from $1$ to $300$ characters.</p>

<p>The sum of all lengths of regular expressions is not greater than $300$.</p>

### 출력

<p>For each test case print a single line containing the shortest string accepted by the given regular expression $r$. If there is more than one such string, print the <strong>lexicographically smallest</strong>&nbsp;one.</p>

<p>If the answer is an empty string, print a single character &quot;<code>$</code>&quot; instead.</p>
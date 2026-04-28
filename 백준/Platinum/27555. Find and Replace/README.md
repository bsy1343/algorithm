# [Platinum I] Find and Replace - 27555

[문제 링크](https://www.acmicpc.net/problem/27555)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 208, 정답: 63, 맞힌 사람: 52, 정답 비율: 30.409%

### 분류

다이나믹 프로그래밍, 문자열, 트리, 재귀

### 문제 설명

<p>Bessie is using the latest and greatest innovation in text-editing software, miV! Its powerful find-and-replace feature allows her to find all occurrences of a lowercase English letter $c$ and replace each with a nonempty string of lowercase letters $s$. For example, given the string &quot;<code>ball</code>&quot;, if Bessie selects $c$ to be &#39;l&#39; and $s$ to be &quot;<code>na</code>&quot;, the given string transforms into &quot;<code>banana</code>&quot;.</p>

<p>Bessie starts with the string &quot;<code>a</code>&quot; and transforms it using a number of these find-and-replace operations, resulting in a final string $S$. Since $S$ could be massive, she wants to know, given $l$ and $r$ with $1\le l\le r\le \min(|S|,10^{18})$, what $S_{l\dots r}$ (the substring of $S$ from the $l$-th to the $r$-th character inclusive) is.</p>

<p>It is guaranteed that the sum of $|s|$ over all operations is at most $2\cdot 10^5$, and that $r-l+1\le 2\cdot 10^5$.</p>

### 입력

<p>The first line contains $l$, $r$, and the number of operations.</p>

<p>Each subsequent line describes one operation and contains $c$ and $s$ for that operation. All characters are in the range &#39;a&#39; through &#39;z&#39;.</p>

### 출력

Output the string $S_{l\dots r}$ on a single line.

### 힌트

<p>The string is transformed as follows:</p>

<p style="text-align: center;"><code>a</code> $\rightarrow$ <code>ab</code> $\rightarrow$ <code>bcb</code> $\rightarrow$ <code>bdeb</code> $\rightarrow$ <code>bbbdebbb</code></p>
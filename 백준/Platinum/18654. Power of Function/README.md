# [Platinum II] Power of Function - 18654

[문제 링크](https://www.acmicpc.net/problem/18654)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 19, 정답: 6, 맞힌 사람: 6, 정답 비율: 46.154%

### 분류

그리디 알고리즘

### 문제 설명

<p>Bob has a function</p>

<p>\[f(n) = \begin{cases} \frac{n}{k} &amp; \text{if }n \mod {k} = 0 \\ n - 1 &amp; \text{otherwise}\end{cases}\]</p>

<p>which is defined for all <strong>non-negative</strong> integers.</p>

<p>Denote the \(m\)-th power of this function as \(f^m(n)\) such that</p>

<p>\[f^m(n) = \begin{cases} f^{m-1}(f(n)) &amp; \text{if }m &gt; 0 \\ n &amp; \text{otherwise}\end{cases}\]</p>

<p>He would like to know the maximum possible integer \(m\) meeting the condition that there exists at least one integer \(n\) such that \(l \le n \le r\) and \(f^m(n) = 1\). Besides, please help him find out the minimum and the maximum \(n\) for the maximum possible \(m\) so that he could easily validate your answer is correct.</p>

### 입력

<p>The input contains several test cases. The first line contains an integer \(T\) indicating the number of test cases. The following describes all test cases. For each test case:</p>

<p>The only line contains three integers \(k\), \(l\), \(r\).</p>

### 출력

<p>For each test case, output a line containing &ldquo;Case #x: m a b&rdquo; (without quotes), where x is the test case number starting from 1, m is the maximum possible exponent, a is the minimum possible argument, and b is the maximum possible argument with respect to m.</p>

### 제한

<ul>
	<li>\(1 \le T \le 3 \times 10^5\)</li>
	<li>\(2 \le k \le 10^{18}\)</li>
	<li>\(1 \le l \le r \le 10^{18}\)</li>
	<li>It is guaranteed that solution exists for each test case.</li>
</ul>

### 힌트

<p>When \(k = 2, \{f(n)\}_{n=0}^{\infty} = \{0, 0, 1, 2, 2, 4, 3, 6, 4, 8, \dots\}\), and \(\{f^2(n)\}_{n=0}^{\infty} = \{0, 0, 0, 1, 1, 2, 2, 3, 2, 4, \dots\}\).</p>
# [Platinum II] Greatest Common Divisor - 26869

[문제 링크](https://www.acmicpc.net/problem/26869)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 15, 맞힌 사람: 14, 정답 비율: 77.778%

### 분류

수학, 정수론, 런타임 전의 전처리

### 문제 설명

<p>Gennady is an aspiring programmer. He is currently learning the Euclidean algorithm for computing the greatest common divisor of two positive integers.</p>

<p>Unfortunately, Gennady sometimes confuses the integer division operator (denoted by <code>div</code>) with the remainder operator (denoted by <code>mod</code>). As an example, $37$ <code>div</code> $10 = 3$ and $37$ <code>mod</code> $10 = 7$.</p>

<p>Here&#39;s Gennady&#39;s latest implementation of the Euclidean algorithm:</p>

<p>\begin{itemize}</p>

<ul>
	<li><em>Input: two positive integers $x$ and $y$.</em></li>
	<li><em>While $y &gt; 0$:</em>
	<ul>
		<li><em>Set $x = x$ <code>div</em> $y$, then swap $x$ and $y$.</code></li>
	</ul>
	</li>
	<li><em>Output: $x$.</em></li>
</ul>

<p>As you can see, if Gennady used the <code>mod</code> operator instead of the <code>div</code> operator, his implementation would be correct: the algorithm above would successfully find the greatest common divisor of $x$ and $y$. However, it turns out that even with this nasty bug the algorithm sometimes works correctly! </p>

<p>You are given an integer $n$. Gennady is interested in finding all input pairs $(x, y)$ such that $1 \le x, y \le n$, the algorithm finishes, and produces the correct output. Let $(x_1, y_1), (x_2, y_2), \ldots, (x_k, y_k)$ be all such pairs in lexicographic order (for all $1 \le i &lt; k$, either $x_i &lt; x_{i+1}$, or $x_i = x_{i+1}$ and $y_i &lt; y_{i+1}$).</p>

<p>You are also given $q$ queries. Query $i$ is a positive integer $p_i$, and you should print $x_{p_i}$ and $y_{p_i}$, or report that $p_i &gt; k$.</p>

### 입력

<p>The first line contains two integers $n$ and $q$ --- the upper bound on the input values and the number of queries ($1 \le n, q \le 2 \cdot 10^5$).</p>

<p>Each of the next $q$ lines contains a single integer $p_i$ ($1 \le p_i \le n^2$).</p>

### 출력

<p>For each query, print two integers. These integers must either be $x_{p_i}$ and $y_{p_i}$, denoting the $p_i$-th input pair in lexicographic order such that the algorithm finishes and produces a correct output, or <code>-1 -1</code> if there are less than $p_i$ such pairs.</p>
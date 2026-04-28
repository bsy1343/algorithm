# [Gold I] Sum of Product of Binomial Coefficients - 30354

[문제 링크](https://www.acmicpc.net/problem/30354)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 67, 정답: 57, 맞힌 사람: 44, 정답 비율: 89.796%

### 분류

수학, 조합론, 분할 정복을 이용한 거듭제곱

### 문제 설명

<p>You are given integers $N$ and $K$. For a positive integer $k$, $f(k)$ is defined as follows.</p>

<ul>
	<li>The Sum of $\binom{N}{a_1} \times \binom{a_1}{a_2} \times \cdots \times \binom{a_{k-1}}{a_k}$ for all integer sequences $(a_1, a_2, \dots, a_k)$ that satisfy the condition $N \ge a_1 \ge a_2 \ge \dots \ge a_k \ge 0$.</li>
</ul>

<p>Answer the remainder of $\sum_{k=1}^{K}{f(k)}$ divided by $998244353$.</p>

<p>For each input, solve $T$ test cases.</p>

<p>Note that $\binom{A}{B}$ represents &quot;the number of ways to select $B$ distinct items from $A$ items&quot; (i.e., the binomial coefficient).</p>

### 입력

<blockquote>
<p>$T$</p>

<p>$\text{case}_1$</p>

<p>$\vdots$</p>

<p>$\text{case}_T$</p>
</blockquote>

<p>Each test case is given in the following format.</p>

<blockquote>
<p>$N$ $K$</p>
</blockquote>

### 출력

<p>Output the remainder of $\sum_{k=1}^{K}{f(k)}$ divided by $998244353$ for each test case.</p>

### 제한

<ul>
	<li>All test cases consist of integers.</li>
	<li>$1 \le T \le 10^5$</li>
	<li>$0 \le N \le 10^9$</li>
	<li>$1 \le K \le 2 \times 10^5$</li>
	<li>The sum of $K$ in one test case does not exceed $2 \times 10^5$.</li>
</ul>
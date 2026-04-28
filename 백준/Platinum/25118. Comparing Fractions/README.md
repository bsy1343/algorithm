# [Platinum I] Comparing Fractions - 25118

[문제 링크](https://www.acmicpc.net/problem/25118)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 176, 정답: 37, 맞힌 사람: 32, 정답 비율: 22.222%

### 분류

수학, 구현, 애드 혹, 정수론, 유클리드 호제법

### 문제 설명

<blockquote>
<p><em>This problem is interactive. Refer to the Interaction section below for a better understanding.</em></p>
</blockquote>

<p>Today was the first class of CS999.</p>

<p>First, you have learned non-negative integer less than or equal to $4 \times 10^{18}$.<br />
You have also learned the addition, subtraction, and comparison of two integers.</p>

<p>The homework is to compare two fractions $\frac{A}{B}$ and $\frac{C}{D}$. Professor told you that you can solve homework only using classroom materials.</p>

<p>You are only allowed to use the following operations:</p>

<ul>
	<li><strong>Addition</strong>: For two integers $a$ and $b$, you can calculate $a+b$. The result should be less than or equal to $4 \times 10^{18}$.</li>
	<li><strong>Subtraction</strong>: For two integers $a$ and $b$, you can calculate $a-b$. The result should be non-negative.</li>
	<li><strong>Comparison</strong>: For two integers $a$ and $b$, you can know whether two elements are equal or which one is greater.</li>
</ul>

<p>By using these operations, you have to compare two fractions.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$1 \leq A, B, C, D \leq 10^9$</li>
</ul>

### 힌트

<h1>Interaction Protocol</h1>

<p>You cannot get $A$, $B$, $C$, nor $D$ directly in this problem.<br />
Instead, you can use some operations to a hidden array of length $10^6$; $X_1, X_2, \cdots, X_{10^6}$.</p>

<p>Initially, $X$ satisfies $X_1=A$, $X_2=B$, $X_3=C$, $X_4=D$, and $X_i=0$ for $i$ greater than $4$.</p>

<p>You can use the following commands to do operations:</p>

<ul>
	<li>To add two elements of $X$, print a string &quot;<code>+ i j k</code>&quot; ($1 \le i, j, k \le 10^6$). $X_i$ will be replaced with a value of $X_j+X_k$.<br />
	To perform this operation, $X_j + X_k$ must be less than or equal to $4 \times 10^{18}$. If not, you will receive a verdict of &quot;<code>Wrong Answer</code>&quot;. Nothing will be given to the input.</li>
	<li>To subtract two elements of $X$, print a string &quot;<code>- i j k</code>&quot; ($1 \le i, j, k \le 10^6$). $X_i$ will be replaced with a value of $X_j-X_k$.<br />
	To perform this operation, $X_j \ge X_k$ must be satisfied. If not, you will receive a verdict of &quot;<code>Wrong Answer</code>&quot;. Nothing will be given to the input.</li>
	<li>To compare two elements of $X$, print a string &quot;<code>&lt; i j</code>&quot; ($1 \le i, j \le 10^6$). A line containing one integer will be given to the input.&nbsp;
	<ul>
		<li>&quot;<code>-1</code>&quot; will be given when $X_i&lt;X_j$.</li>
		<li>&quot;<code>0</code>&quot; will be given when $X_i=X_j$.</li>
		<li>&quot;<code>1</code>&quot; will be given when $X_i&gt;X_j$.</li>
	</ul>
	</li>
</ul>

<p>After successfully comparing $\frac{A}{B}$ and $\frac{C}{D}$,</p>

<ul>
	<li>If $\frac{A}{B} &lt; \frac{C}{D}$, print &quot;<code>! -1</code>&quot;.</li>
	<li>If $\frac{A}{B} =&nbsp;\frac{C}{D}$, print &quot;<code>! 0</code>&quot;.</li>
	<li>If $\frac{A}{B} &gt;&nbsp;\frac{C}{D}$, print &quot;<code>! 1</code>&quot;.</li>
</ul>

<p>If you ask more than $200\,001$ commands or make an invalid query, the interactor will terminate immediately and your program will receive the verdict &quot;<code>Wrong Answer</code>&quot;.</p>

<h1>Scoring</h1>

<p>If your comparison is incorrect, your score will be $0$.</p>

<p>Otherwise, the score of the program will be graded with three factors:</p>

<ul>
	<li>$i_{max}$, the maximum index of the array $X$ you have used in operations.</li>
	<li>$n_{op}$, the number of operations you have done. Answer command will not be counted.</li>
	<li>$X_{max}$, the maximum number in the array $X$ during operations.</li>
</ul>
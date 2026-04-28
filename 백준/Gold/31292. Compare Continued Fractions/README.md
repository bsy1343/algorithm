# [Gold IV] Compare Continued Fractions - 31292

[문제 링크](https://www.acmicpc.net/problem/31292)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 22, 맞힌 사람: 14, 정답 비율: 38.889%

### 분류

수학

### 문제 설명

<p><em>In this problem, you have to compare two rational numbers represented by their continued fractions.</em></p>

<p>A <em>finite continued fraction</em> is a sequence $[a_{0}; a_{1}, a_{2}, \ldots, a_{n}]$. The following restrictions are applied:</p>

<ul>
	<li>$n$ is a non-negative finite integer,</li>
	<li>the elements $a_{0}$, $a_{1}$, $a_{2}$, $\ldots$, $a_{n}$ are integers,</li>
	<li>$a_{i} &gt; 0$ for each $i &gt; 0$,</li>
	<li>$a_{n} &gt; 1$ if $n &gt; 0$.</li>
</ul>

<p>These restrictions allow to establish a one-to-one correspondence between rational numbers and finite continued fractions: every rational number $x$ corresponds to the unique continued fraction $[a_{0}; a_{1}, a_{2}, \ldots, a_{n}]$ such that $$x = a_{0} + \frac {1} {a_{1} + \frac {1} {a_{2} + \frac {1} {\ddots + \frac {1} {a_{n}}}}}\text{.}$$ Thus, the following notation is used: $x = [a_{0}; a_{1}, a_{2}, \ldots, a_{n}]$. For example, $$\frac {17} {25} = 0 + \frac {1} {\frac {25} {17}} = 0 + \frac {1} {1 + \frac {8} {17}} = 0 + \frac {1} {1 + \frac {1} {\frac {17} {8}}} = \mathbf{0} + \frac {1} {\mathbf{1} + \frac {1} {\mathbf{2} + \frac {1} {\mathbf{8}}}}\text{,}$$ so we write $\frac {17} {25} = [0; 1, 2, 8]$.</p>

<p>Given the continued fractions for two rational numbers $x$ and $y$, find whether $x &lt; y$, $x = y$, or $x &gt; y$.</p>

### 입력

<p>The input consists of two lines. The first line contains the continued fraction for the rational number $x$. The second line contains the continued fraction for the rational number $y$.</p>

<p>Each continued fraction is given as a sequence of integers separated by single spaces. First goes an integer $n$, the length of the continued fraction ($0 \le n \le 100\,000$). It is followed by $(n + 1)$ integers which are the elements of the continued fraction: $a_{0}$, $a_{1}$, $a_{2}$, $\ldots$, $a_{n}$ ($|a_{i}| \le 10^{9}$). It is guaranteed that $a_{i} &gt; 0$ for each $i &gt; 0$ and $a_{n} &gt; 1$ if $n &gt; 0$.</p>

### 출력

<p>On the first line of output, print a single character: &quot;<code>&lt;</code>&quot; if $x &lt; y$, &quot;<code>=</code>&quot; if $x = y$, or &quot;<code>&gt;</code>&quot; if $x &gt; y$.</p>
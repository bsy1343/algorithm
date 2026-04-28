# [Silver III] Sequence Conversion - 25114

[문제 링크](https://www.acmicpc.net/problem/25114)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 434, 정답: 289, 맞힌 사람: 215, 정답 비율: 64.179%

### 분류

그리디 알고리즘, 애드 혹, 비트마스킹

### 문제 설명

<p>You are given two arrays of non-negative integers $a_1, a_2, \dots, a_N$ and $b_1, b_2, \dots, b_N$.</p>

<p>You can perform the following operation several times:</p>

<ul>
	<li>Choose a non-negative integer $x$ and an index $1 \leq i &lt; N$. Then change $a_i$ to $a_i \oplus x$ and change $a_{i+1}$ to $a_{i+1} \oplus x$.</li>
</ul>

<p>Expression $x \oplus y$ means <strong>bitwise xor</strong>&nbsp;of two numbers $x$ and $y$.<br />
In binary representation, if the $i$-th digit of x and y is equal, then the $i$-th digit of $x \oplus y$ is $0$, and if not, it is $1$.<br />
The given operation exists in all modern programming languages. For example, in <em>C++</em>&nbsp;and <em>Java</em>, it is represented&nbsp;as $x\ ^{\wedge}\ y$.</p>

<p>You want to convert $\{a_i\}$ to $\{b_i\}$ by performing the minimum number of operations.</p>

<p>Find the minimum number of operations to convert $\{a_i\}$ to $\{b_i\}$.</p>

<p>If you cannot convert $\{a_i\}$ to $\{b_i\}$ with the given operation, print $-1$.</p>

### 입력

<p>The first line contains an integer $N$, where $N$ denotes the length of the two sequences.</p>

<p>The second line contains $N$ space-separated non-negative integers $a_1, a_2, \dots, a_N$.</p>

<p>The third line contains $N$ space-separated non-negative integers $b_1, b_2, \dots, b_N$.</p>

### 출력

<p>Print $-1$, if it is impossible to change the sequence $\{a_i\}$ to $\{b_i\}$.</p>

<p>Otherwise, print the minimum number of operations needed to change the sequence $\{a_i\}$ to $\{b_i\}$.</p>

### 제한

<ul>
	<li>$1 \leq N \leq 10^6$</li>
	<li>$0 \leq a_i, b_i &lt; 2^{30}$ $(1 \le i \le N)$</li>
</ul>
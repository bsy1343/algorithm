# [Platinum II] Sequence Conversion 2 - 25117

[문제 링크](https://www.acmicpc.net/problem/25117)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 197, 정답: 42, 맞힌 사람: 34, 정답 비율: 22.819%

### 분류

이분 탐색, 다이나믹 프로그래밍, 정렬

### 문제 설명

<p>You are given an array of non-negative integers $a_1, a_2, \dots, a_N$.</p>

<p>You can perform the following operation several times:</p>

<ul>
	<li>Choose an index $i$. ($1 \leq i &lt;$ <em>length of the array) </em> 	Then, remove $a_i, a_{i+1}$ and replace them with $a_i \oplus a_{i+1}$. (The total length of the array decreases by 1)</li>
</ul>

<p>Expression $x \oplus y$ means <strong>bitwise xor</strong> of two numbers $x$ and $y$. In binary representation, if the $i$-th digit of x and y is equal, then the $i$-th digit of $x \oplus y$ is $0$, and if not, it is $1$.</p>

<p>The given operation exists in all modern programming languages. For example, in <em>C++</em> and <em>Java</em>, it is represented as $x\ ^{\wedge}\ y$.</p>

<p>You want to convert the given array into a <strong>zig-zag</strong> array.</p>

<p>We say an array of $m$ integers, $z_1, z_2, ..., z_{m}$, is a zig-zag array if no three consecutive elements in the array are either monotonically increasing or monotonically decreasing.</p>

<p>In other words, if there are three elements $z_i, z_{i+1}, z_{i+2}$ in the array such that $z_i \leq z_{i+1} \leq z_{i+2}$ or $z_i \geq z_{i+1} \geq z_{i+2}$, the array is <strong>not </strong>zig-zag. Otherwise, it is zig-zag array.</p>

<p>Find the minimum number of operations needed to convert $\{a_i\}$ into a <strong>zig-zag</strong> array.</p>

### 입력

<p>The first line contains an integer $N$, where $N$ denotes the length of the sequence.</p>

<p>The second line contains $N$ space-separated non-negative integers $a_1, a_2, \dots, a_N$.</p>

### 출력

<p>Print the minimum number of operations needed to change the sequence $\{a_i\}$ into a zig-zag array.</p>

### 제한

<ul>
	<li>$1 \leq N \leq 3\,000$</li>
	<li>$0 \leq a_i &lt; 2^{30}$ $(1 \le i \le N)$</li>
</ul>
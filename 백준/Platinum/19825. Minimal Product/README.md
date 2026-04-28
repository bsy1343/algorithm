# [Platinum V] Minimal Product - 19825

[문제 링크](https://www.acmicpc.net/problem/19825)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 66, 정답: 25, 맞힌 사람: 18, 정답 비율: 47.368%

### 분류

수학, 그리디 알고리즘, 정렬, 애드 혹

### 문제 설명

<p>You are given an array of integers $a_1,\dots,a_n$. Find two indices $i$ and $j$ such that $i&lt;j$, $a_i&lt;a_j$, and the product $a_i \cdot a_j$ is as small as possible.</p>

### 입력

<p>The input consists of several tests. The first line contains a single integer $t$ --- the number of tests ($1 \leq t \leq 10^4$). Each of the following $t$ lines describes one test.</p>

<p>Each test is generated using the following algorithm. The test is described by integers $n$, $l$, $r$, $x$, $y$, $z$, $b_1$, $b_2$ ($2 \leq n \leq 10^7$, $-2\cdot10^9 \leq l \leq r \leq 2\cdot10^9$, $0 \leq x,y,z,b_1,b_2 &lt; 2^{32}$), where $n$ is the length of the array.</p>

<p>First, the sequence $b_i$ of length $n$ is generated. Elements $b_1$ and $b_2$ are given. For $i&gt;2$ let $b_i=(b_{i-2}x+b_{i-1}y+z) \bmod 2^{32}$. For each $i$ between $1$ and $n$, $a_i=(b_i \bmod (r - l + 1)) + l$ (thus, $-2\cdot10^9 \leq a_i \leq 2\cdot10^9$).</p>

<p>It is recommended to use 64-bit integers to generate the sequence to avoid integer overflow.</p>

<p>The sum of $n$ in all tests does not exceed $2 \cdot 10^7$.</p>

### 출력

<p>For each test, print the smallest possible product $a_i \cdot a_j$ in a separate line. If there are no such $i$ and $j$ that $i&lt;j$ and $a_i&lt;a_j$, print &quot;<code>IMPOSSIBLE</code>&quot;.</p>

### 힌트

<p>Let us consider the generation of the array in the first test.</p>

<p>First, the sequence $b$ is generated.</p>

<ul>
	<li>$b_1 = 0$</li>
	<li>$b_2 = 3$</li>
	<li>$b_3 = (11\cdot 0 + 13\cdot 3 + 17)\bmod 2^{32}=56$</li>
	<li>$b_4 = (11\cdot 3 + 13\cdot 56 + 17)\bmod 2^{32}=778$</li>
</ul>

<p>Then it is used to generate $a$.</p>

<ul>
	<li>$a_1 = (0\bmod (5-(-5) + 1)) + (-5)=(0 \bmod 11) - 5 = -5$</li>
	<li>$a_2 = (3 \bmod 11) - 5 = -2$</li>
	<li>$a_3 = (56 \bmod 11) - 5 = -4$</li>
	<li>$a_4 = (778 \bmod 11) - 5 = 3$</li>
</ul>

<p>Thus, $a = [-5,-2,-4,3]$. The answer is $-5 \cdot 3=-15$.</p>

<p>In the second test the array is $[42,42,42,42,42]$.</p>
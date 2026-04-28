# [Platinum II] Identity Checker - 7636

[문제 링크](https://www.acmicpc.net/problem/7636)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 6, 맞힌 사람: 5, 정답 비율: 50.000%

### 분류

브루트포스 알고리즘, 자료 구조, 스택

### 문제 설명

<p>You likely have seen that x(sin<sup>2</sup>x + cos<sup>2</sup>x) &minus; x = 0, and you may have seen that sin(2x) &minus; 2 sin x cos x = 0. But did you know that tan (2x)(x &minus; x tan<sup>2</sup>x) &minus; 2x tan x = 0? Would you believe that sin (2x) &minus; 2 cos x = 0? That last one is false, but don&rsquo;t just take our word for it; you should write a program that determines whether an algebraic expression simplifies to zero (whenever it is defined).</p>

### 입력

<p>The input consists of multiple test cases, each on one line. Each test case starts with an integer N, the number of tokens that describes a formula. The next N tokens describe a formula in reverse polish notation. The notation works as follows. There is a stack that begins empty, and the following commands manipulate the contents of the stack:</p>

<ul>
	<li>&ldquo;<code>x</code>&rdquo; pushes the variable x to the stack.</li>
	<li>&ldquo;<code>sin</code>&rdquo;, &ldquo;<code>cos</code>&rdquo;, and &ldquo;<code>tan</code>&rdquo; replace the top element of the stack with its sin, cos, and tan, respectively.</li>
	<li>&ldquo;<code>+</code>&rdquo;, &ldquo;<code>-</code>&rdquo;, and &ldquo;<code>*</code>&rdquo; replace the top two elements of the stack (a on top, followed by b) with their sum (b + a), difference (b &minus; a), and product (b &lowast; a), respectively.</li>
</ul>

<p>You may assume that the input is valid, and results in a single item on the stack, which is the desired expression. The length of a line will be at most 300 characters. Function arguments can contain functions, so <code>x sin sin</code> is valid, but the recursion will not go any deeper than this. The input terminates with a line with N = 0.</p>

### 출력

<p>For each test case, print out a single line that contains &ldquo;Identity&rdquo; if the expression is always zero, and &ldquo;Not an identity&rdquo; otherwise (quotes added for clarity).</p>
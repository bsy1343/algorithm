# [Gold IV] Fibonacci Strings - 21352

[문제 링크](https://www.acmicpc.net/problem/21352)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 10, 맞힌 사람: 9, 정답 비율: 52.941%

### 분류

구현, 다이나믹 프로그래밍, 문자열, 애드 혹

### 문제 설명

<p>Aron likes Fibonacci numbers. He likes them so much he actually got bored of the numbers themselves and decided to invent other combinatorial objects based on them instead.</p>

<p>His first invention is the <em>Fibonacci string</em>. We call a string consisting of only letters $a$ and $b$, with exactly $n$ letters $a$ without any two consecutive letters $a$ a <em>Fibonacci string of the $n$:th order</em>.</p>

<p>Given a string $X$ of $a$:s and $b$:s, compute the sum of orders of all Fibonacci strings that are substrings of $X$. Note that if a string $X$ appears multiple times, its order should be counted once for every occurance.</p>

### 입력

<p>The sample judge reads input in the following format:</p>

<ul>
	<li>line $1$: <code>N</code></li>
	<li>line $2$: <code>X</code></li>
</ul>

### 출력

<p>The judge writes a single line containing the return value of <code>fibonacci(N, X)</code>.</p>

### 제한

<ul>
	<li>$1 \le N \le 100\,000$</li>
</ul>
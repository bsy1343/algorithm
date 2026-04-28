# [Platinum II] Perfect Triples - 30178

[문제 링크](https://www.acmicpc.net/problem/30178)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 27, 맞힌 사람: 24, 정답 비율: 63.158%

### 분류

수학, 비트마스킹

### 문제 설명

<p>Consider the infinite sequence $s$ of positive integers, created by repeating the following steps:</p>

<ol>
	<li>
	<p>Find the lexicographically smallest triple of positive integers $(a, b, c)$ such that</p>

	<ul>
		<li>$a \oplus b \oplus c = 0$, where $\oplus$ denotes the <a href="https://en.wikipedia.org/wiki/Bitwise_operation#XOR">bitwise XOR operation</a>.</li>
		<li>$a$, $b$, $c$ are not in $s$.</li>
	</ul>

	<p>Here triple of integers $(a_1, b_1, c_1)$ is considered to be lexicographically smaller than triple $(a_2, b_2, c_2)$ if sequence $[a_1, b_1, c_1]$ is lexicographically smaller than sequence $[a_2, b_2, c_2]$.</p>
	</li>
	<li>
	<p>Append $a$, $b$, $c$ to $s$ in this order.</p>
	</li>
	<li>
	<p>Go back to the first step.</p>
	</li>
</ol>

<p>You have integer $n$. Find the $n$-th element of $s$.</p>

<p>You have to answer $t$ independent test cases.</p>

<p>A sequence $a$ is lexicographically smaller than a sequence $b$ if in the first position where $a$ and $b$ differ, the sequence $a$ has a smaller element than the corresponding element in $b$.</p>

### 입력

<p>The first line contains a single integer $t$ ($1 \le t \le 10^5$) --- the number of test cases.</p>

<p>Each of the next $t$ lines contains a single integer $n$ ($1\le n \le 10^{16}$) --- the position of the element you want to know.</p>

### 출력

<p>In each of the $t$ lines, output the answer to the corresponding test case.</p>

### 힌트

<p>The first elements of $s$ are $1, 2, 3, 4, 8, 12, 5, 10, 15, \dots $</p>
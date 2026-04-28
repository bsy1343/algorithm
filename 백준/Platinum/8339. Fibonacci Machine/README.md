# [Platinum I] Fibonacci Machine - 8339

[문제 링크](https://www.acmicpc.net/problem/8339)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 212, 정답: 98, 맞힌 사람: 65, 정답 비율: 44.828%

### 분류

수학, 자료 구조, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>The Fibonacci numbers are defined as follows:</p>

<ul>
	<li>F(0) = 0</li>
	<li>F(1) = 1</li>
	<li>F(m) = F(m-1) + F(m-2) for m &ge; 2</li>
</ul>

<p>The Fibonacci machine operates on an n-element integer register sequence &lt;i<sub>1</sub>, i<sub>2</sub>, ..., i<sub>n</sub>&gt;&nbsp;which initially contains zeroes only. The machine provides two operations:</p>

<ul>
	<li>adding one to each register in interval [a, b], i.e. adding 1 to the numbers i<sub>a</sub>, i<sub>a+1</sub>, ..., i<sub>b</sub>.;</li>
	<li>calculating the sum of those Fibonacci numbers, the sequence numbers of which are stored in registers from the interval [a, b], i.e. calculating F(i<sub>a</sub>) + F(i<sub>a+1</sub>) + ... + F(i<sub>b</sub>).</li>
</ul>

<p>Your task is to write a simulator of the Fibonacci machine.</p>

### 입력

<p>The first line of the standard input contains two integers&nbsp;n&nbsp;and k&nbsp;(1 &le; n, k &le; 100,000), separated by a single space and representing the length of the sequence and the number of operations. Each of the following k&nbsp;lines contains a description of one operation. Such a description consists of a character&nbsp;<tt>D</tt>&nbsp;or&nbsp;<tt>S</tt>&nbsp;and two integers a&nbsp;and b&nbsp;(1 &le; a &le; b &le; n), separated by single spaces. The character&nbsp;<tt>D</tt>&nbsp;stands for adding of 1 to the interval [a, b], and the character&nbsp;<tt>S</tt>&nbsp;stands for calculating the sum of Fibonacci numbers the sequence numbers of which are from [a, b]. You may assume that at least one operation of type&nbsp;<tt>S</tt>appears in the sequence of operations.</p>

### 출력

<p>For each operation&nbsp;<tt>S</tt>&nbsp;write to the standard output exactly one line with the desired Fibonacci sum. Each result should be calculated modulo&nbsp;10<sup>9</sup> + 7.</p>

### 힌트

<p>After seven operations the sequence of registers becomes &lt;1, 3, 4, 3, 2&gt;. The result of the last query is equal to F(3) + F(4) = 5.</p>
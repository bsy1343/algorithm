# [Silver III] Crazy Malvika discovers Crazy Fibonacci function - 30155

[문제 링크](https://www.acmicpc.net/problem/30155)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 267, 정답: 109, 맞힌 사람: 70, 정답 비율: 33.654%

### 분류

수학

### 문제 설명

<p>Malvika was getting bored of the usual Fibonacci problems, and decided to add a little twist to it. She defined a new function f() with the following properties:</p>

<ul>
	<li>She&#39;ll give you two integers, A and B. f(1) is defined to be A and f(2) is B.</li>
	<li>And for all integers x &ge; 2, f(x) = f(x-1) + f(x+1).</li>
</ul>

<p>She&#39;ll give an integer N, and you have to find out what f(N) is. Output the answers modulo 10<sup>9</sup>+7.</p>

### 입력

<p>The first line of input contains a single integer T denoting number of test cases.</p>

<p>The only line of each test case contains three integers: A, B and N, denoting f(1), f(2) and the query.</p>

### 출력

<p>For each test case, output a line which contains a single integer, corresponding to f(N) for the given input.</p>

### 제한

<ul>
	<li>1 &le; T &le; 10<sup>5</sup></li>
	<li>-10<sup>9</sup> &le; A , B &le; 10<sup>9</sup></li>
	<li>1 &le; N &le; 10<sup>9</sup></li>
</ul>

### 힌트

<p>In the first test case, f(3) = 7, and so that is the output.</p>

<p>In the second test case, f(3) = -6 and the answer modulo 10<sup>9</sup>+7 is 1000000001.</p>
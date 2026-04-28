# [Silver II] Divisibility - 7668

[문제 링크](https://www.acmicpc.net/problem/7668)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 87, 정답: 64, 맞힌 사람: 58, 정답 비율: 78.378%

### 분류

수학, 문자열, 정수론

### 문제 설명

<p>On the planet Zoop, numbers are represented in base 62, using the digits</p>

<p>0, 1, . . . , 9, A, B, . . . , Z, a, b, . . . , z</p>

<p>where</p>

<ul>
	<li>A (base 62) = 10 (base 10)</li>
	<li>B (base 62) = 11 (base 10)</li>
	<li>. . .</li>
	<li>z (base 62) = 61 (base 10).</li>
</ul>

<p>Given the digit representation of a number x in base 62, your goal is to determine if x is divisible by 61.</p>

### 입력

<p>The input test file will contain multiple cases. Each test case will be given by a single string containing only the digits &lsquo;0&rsquo; through &lsquo;9&rsquo;, the uppercase letters &lsquo;A&rsquo; through &lsquo;Z&rsquo;, and the lowercase letters &rsquo;a&rsquo; through &rsquo;z&rsquo;. All strings will have a length of between 1 and 10000 characters, inclusive. The end-of-input is denoted by a single line containing the word &ldquo;end&rdquo;, which should not be processed.</p>

### 출력

<p>For each test case, print &ldquo;yes&rdquo; if the number is divisible by 61, and &ldquo;no&rdquo; otherwise.</p>

### 힌트

<p>In the first example, 1v3 = 1 &times; 62<sup>2</sup> + 57 &times; 62 + 3 = 7381, which is divisible by 61.</p>

<p>In the second example, 2P6 = 2 &times; 62<sup>2</sup> + 25 &times; 62 + 6 = 9244, which is not divisible by 61.</p>
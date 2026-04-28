# [Platinum V] Zagrade - 20051

[문제 링크](https://www.acmicpc.net/problem/20051)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 138, 정답: 41, 맞힌 사람: 34, 정답 비율: 29.060%

### 분류

자료 구조, 스택

### 문제 설명

<p>It is well known that the Central Intelligence Agency is tasked with gathering, processing and analyzing national security information. It is also suspected that they own quite large collections of commonly-used computer passwords and are developing some quite sophisticated tools that are capable of compromising password-protected computer systems.</p>

<p>The tables have turned, your task is to compromise the security of a CIA server. Good luck!</p>

<p>Naturally, they are well aware of typical patterns that humans produce while coming up with their passwords, so attempts such as <code>123456</code>, <code>password</code>, <code>1q2w3e4r</code> or <code>welcome</code> are futile. Luckily, we have uncovered certain pieces of information that might be of use to you.</p>

<p>Namely, their master password consists of exactly N characters, where N is an even number. Exactly half of those characters is equal to the open parenthesis (&#39;<code>(</code>&#39;), while the other half is equal to the closing parenthesis (&#39;<code>)</code>&#39;). Additionally, instead of the usual &quot;<em>forgot your password?</em>&quot; functionality, their engineers have decided to expose an API to the forgetful administrator. Using the API, an administrator can execute at most Q queries asking &quot;<em>whether the interval of the password from a-th to the b-th character is mathematically valid</em>&quot;.</p>

<p>The mathematical validity of a sequence of parentheses is defined inductively as:</p>

<ul>
	<li><code>()</code> is a mathematically valid sequence.</li>
	<li>If <code>A</code> is a mathematically valid sequence, then <code>(A)</code> is a mathematically valid sequence as well.</li>
	<li>If both <code>A</code> and <code>B</code>&nbsp;are mathematically valid sequences, then <code>AB</code> is also mathematically valid.</li>
</ul>

### 입력



### 출력


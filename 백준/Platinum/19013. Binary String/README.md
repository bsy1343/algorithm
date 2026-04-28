# [Platinum I] Binary String - 19013

[문제 링크](https://www.acmicpc.net/problem/19013)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 275, 정답: 63, 맞힌 사람: 17, 정답 비율: 13.281%

### 분류

무작위화

### 문제 설명

<p>This is an interactive problem.</p>

<p>The jury has a secret string which consists of exactly $1000$ binary digits. In each test for this problem, the string is fixed in advance and does not change. You have to find this string using queries.</p>

<p>In each query, you choose a segment $[a, b]$ ($1 \leq a \leq b \leq 1000$) to ask about. Then the jury flips a coin, and gives you one of the two values, each with probability of 50%:</p>

<ol>
	<li>The number of $1$s in the segment $[a, b]$;&nbsp;</li>
	<li>A value from $0$ to $b - a + 1$ which is <strong>not equal</strong>&nbsp;to the number of ones on this segment, chosen uniformly at random.</li>
</ol>

<p>You are <strong>not allowed</strong>&nbsp;to use the same query twice. All random values used in this problem are uniform and independent.</p>

### 입력



### 출력



### 힌트

<p>The example above is given only to demonstrate the format. In this example, the string has length $5$. In the real first test, as well as all other tests, the length of the string to guess is exactly $1000$.</p>
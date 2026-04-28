# [Silver IV] Palindromic Factors - 25085

[문제 링크](https://www.acmicpc.net/problem/25085)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 203, 정답: 116, 맞힌 사람: 101, 정답 비율: 57.062%

### 분류

수학, 구현, 정수론

### 문제 설명

<p>You are given a positive integer $A$. Find the number of factors of $A$ which are palindromes. A number is called a <a href="https://en.wikipedia.org/wiki/Palindromic_number" target="_blank">palindrome</a> if it remains the same when the digits in decimal representation are reversed. For instance, 121 is a palindrome, while 123 is not.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$. $T$ lines follow.</p>

<p>Each line represents a test case and contains a single integer $A$.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the number of factors of $A$ which are palindromes.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
</ul>

### 힌트

<p>In the first test case, $A$ has $4$ factors which are palindromes: $1$, $2$, $3$, and $6$.</p>

<p>In the second test case, $A$ has $3$ factors which are palindromes: $1$, $2$, and $5$.</p>

<p>In the third test case, $A$ has $7$ factors which are palindromes: $1$, $2$, $3$, $4$, $6$, $8$, and $9$.</p>

<p>In the fourth test case, $A$ has $6$ factors which are palindromes: $1$, $2$, $11$, $22$, $121$, and $242$.</p>
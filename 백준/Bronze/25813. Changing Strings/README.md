# [Bronze III] Changing Strings - 25813

[문제 링크](https://www.acmicpc.net/problem/25813)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 488, 정답: 359, 맞힌 사람: 329, 정답 비율: 75.286%

### 분류

구현, 문자열

### 문제 설명

<p>We love our UCF and we are going to change everything to UCF!</p>

<p>Given a string, change the string to UCF as follows:</p>

<ul>
	<li>Characters before the leftmost &ldquo;U&rdquo; in the string are changed to hyphen (&ldquo;-&rdquo;).</li>
	<li>Characters after the rightmost &ldquo;F&rdquo; in the string are changed to hyphen.</li>
	<li>Characters between the leftmost U and the rightmost F are changed to &ldquo;C&rdquo;.</li>
</ul>

<p>Assume the string will contain at least one &ldquo;U&rdquo;, at least one &ldquo;F&rdquo; after that U, and at least one character between the U and F.</p>

### 입력

<p>There is only one input line; it contains a string of uppercase letters. The string will have at least 3 and at most 50 characters.</p>

### 출력

<p>Print the input string converted to UCF.</p>
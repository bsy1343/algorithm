# [Gold I] Template for Search - 23523

[문제 링크](https://www.acmicpc.net/problem/23523)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 7, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 문자열

### 문제 설명

<p>You are required to find a palindome string with a minimal length which matches a given template for search. Palindrome is a string which can be read in the same way in both directions (forward and backward). An empty string is also a palindrome. The template can contain lower case latin letters corresponding to the same letters in a string, symbol &#39;<code>?</code>&#39; corresponding to an arbitrary latin letter and symbol &#39;<code>*</code>&#39; corresponding to a zero or more arbitrary latin letters.</p>

### 입력

<p>First line contains a string $s$ --- a template string. This string contains only lower case latin letters, symbols &#39;<code>?</code>&#39; and &#39;<code>*</code>&#39;.</p>

### 출력

<p>You are required to print a single line containing a palindrome string with a minimal length which matches a given template. The palindrome should contain only lower case latin letters. If there is no such palindrome, you are required to output &quot;<code>-1</code>&quot;. If there are multiple possible palindromes, you may output any of them.</p>

### 제한

<ul>
	<li>$ 1 \le |s| \le 500$</li>
</ul>
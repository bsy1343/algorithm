# [Platinum IV] Palindrome Free Strings - 24841

[문제 링크](https://www.acmicpc.net/problem/24841)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 162, 정답: 58, 맞힌 사람: 48, 정답 비율: 39.669%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>You are given a string $S$&nbsp;consisting of characters&nbsp;<code>0</code>,&nbsp;<code>1</code>, and&nbsp;<code>?</code>. You can replace each&nbsp;<code>?</code>&nbsp;with either&nbsp;<code>0</code>&nbsp;or&nbsp;<code>1</code>. Your task is to find if it is possible to assign each&nbsp;<code>?</code>&nbsp;to either&nbsp;<code>0</code>&nbsp;or&nbsp;<code>1</code>&nbsp;such that the resulting string has no&nbsp;<a href="https://en.wikipedia.org/wiki/Substring" target="_blank">substrings</a>&nbsp;that are&nbsp;<a href="https://en.wikipedia.org/wiki/Palindrome" target="_blank">palindromes</a>&nbsp;of length&nbsp;$5$&nbsp;or more.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$.&nbsp;$T$&nbsp;test cases follow.</p>

<p>Each test case consists of two lines.</p>

<p>The first line of each test case contains an integer&nbsp;$N$, denoting the length of the string&nbsp;$S$.</p>

<p>The second line of each test case contains a string&nbsp;$S$&nbsp;of length&nbsp;$N$.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where $x$ is the test case number (starting from 1) and&nbsp;$y$&nbsp;is&nbsp;<code>POSSIBLE</code>&nbsp;if there is a possible resulting string that has no palindromic substrings of length $5$&nbsp;or more, or&nbsp;<code>IMPOSSIBLE</code>&nbsp;otherwise.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>$S$ only consists of characters&nbsp;<code>0</code>,&nbsp;<code>1</code>&nbsp;and&nbsp;<code>?</code>.</li>
</ul>

### 힌트

<p>In Sample Case #1, to prevent the whole string from being a palindrome, the first and last question mark must be different characters.</p>

<p>If we replace first question mark with&nbsp;<code>0</code>&nbsp;and replace the last question mark with&nbsp;<code>1</code>, we get&nbsp;<code>1000?1001</code>. If the remaining&nbsp;<code>?</code>&nbsp;is replaced by&nbsp;<code>1</code>, we get <code>100011001</code>, then the first $5$&nbsp;characters form a palindrome of length&nbsp;$5$. Otherwise, we get&nbsp;<code>100001001</code>, the first&nbsp;$6$&nbsp;characters are a palindrome of length&nbsp;$6$.</p>

<p>If we replace first question mark with&nbsp;<code>1</code>&nbsp;we get <code>1001?0001</code>. If the remaining&nbsp;<code>?</code>&nbsp;is replaced by&nbsp;<code>1</code>, we get <code>100110001</code>, then the last&nbsp;$5$&nbsp;characters form a palindrome of length&nbsp;$5$. Otherwise, we get&nbsp;<code>100100001</code>, the last&nbsp;$6$&nbsp;characters are a palindrome of length&nbsp;$6$.</p>

<p>Hence, there is no way to get a valid string.</p>

<p>In Sample Case #2, one of the valid strings after replacing all the&nbsp;<code>?</code>&nbsp;is&nbsp;<code>10011</code>.</p>
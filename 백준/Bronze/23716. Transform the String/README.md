# [Bronze II] Transform the String - 23716

[문제 링크](https://www.acmicpc.net/problem/23716)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 310, 정답: 156, 맞힌 사람: 121, 정답 비율: 48.400%

### 분류

구현, 문자열

### 문제 설명

<p>You are given a string&nbsp;$S$&nbsp;which denotes a padlock consisting of lower case English letters. You are also given a string $F$ consisting of set of favorite lower case English letters. You are allowed to perform several operations on the padlock. In each operation, you can change one letter of the string to the one following it or preceding it in the alphabetical order. For example: for the letter&nbsp;<code>c</code>, you are allowed to change it to either&nbsp;<code>b</code>&nbsp;or&nbsp;<code>d</code>&nbsp;in an operation. The letters can be considered in a cyclic order, i.e., the preceding letter for letter&nbsp;<code>a</code>&nbsp;would be letter&nbsp;<code>z</code>. Similarly, the following letter for letter&nbsp;<code>z</code>&nbsp;would be letter&nbsp;<code>a</code>.</p>

<p>Your aim is to find the minimum number of operations that are required such that each letter in string&nbsp;$S$&nbsp;after applying the operations, is present in string $F$.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;$T$.&nbsp;$T$&nbsp;test cases follow.</p>

<p>Each test case consists of two lines.</p>

<p>The first line of each test case contains the string $S$.</p>

<p>The second line of each test case contains the string&nbsp;$F$.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where $x$ is the test case number (starting from 1) and&nbsp;$y$&nbsp;is the minimum number of operations that are required such that each letter in string&nbsp;$S$&nbsp;after applying the operations, is one of the characters in string&nbsp;$F$.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>$1&le;$ the length of $S&le;10^5$.</li>
	<li>$S$&nbsp;only consists of lower case English letters.</li>
	<li>$F$&nbsp;only consists of distinct lower case English letters.</li>
	<li>The letters in string&nbsp;$F$&nbsp;are lexicographically sorted.</li>
</ul>
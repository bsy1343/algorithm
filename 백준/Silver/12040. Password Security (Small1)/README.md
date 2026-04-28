# [Silver III] Password Security (Small1) - 12040

[문제 링크](https://www.acmicpc.net/problem/12040)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 100, 정답: 66, 맞힌 사람: 54, 정답 비율: 73.973%

### 분류

문자열, 해 구성하기, 무작위화

### 문제 설명

<p>You just bought your young nephew Andrey a complete set of 26 English wooden alphabet letters from A to Z. Because the letters come in a long, linear package, they appear to spell out a 26-letter message.</p>

<p>You use&nbsp;<strong>N</strong>&nbsp;different passwords to log into your various online accounts, and you are concerned that this message might coincidentally include one or more of them. Can you find any arrangement of the 26 letters, such that no password appears in the message as a continuous substring?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each consists of one line with an integer&nbsp;<strong>N</strong>, and then another line with&nbsp;<strong>N</strong>&nbsp;different strings of uppercase English letters&nbsp;<strong>P<sub>1</sub></strong>,&nbsp;<strong>P<sub>2</sub></strong>, ...,&nbsp;<strong>P<sub>N</sub></strong>, which are the passwords.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le; length of&nbsp;<strong>P<sub>i</sub></strong>&nbsp;&le; 26, for all i. (Each password is between 1 and 26 letters long.)</li>
	<li><strong>P<sub>i</sub></strong>&nbsp;&ne;&nbsp;<strong>P<sub>j</sub></strong>&nbsp;for all i &ne; j. (All passwords are different.</li>
	<li><strong>N</strong>&nbsp;= 1.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is a permutation of the entire uppercase English alphabet that contains no password as a continuous substring, or the word&nbsp;<code>IMPOSSIBLE</code>&nbsp;if there is no such permutation.</p>

### 힌트

<p>For each of the non-<code>IMPOSSIBLE</code>&nbsp;cases, the sample output shows only one possible answer. There are many valid answers for these inputs.</p>

<p>Note that only sample cases #1, #2, and #3 would appear in Small dataset 1. Any of the sample cases could appear in Small dataset 2.</p>
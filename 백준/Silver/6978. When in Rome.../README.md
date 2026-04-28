# [Silver I] When in Rome... - 6978

[문제 링크](https://www.acmicpc.net/problem/6978)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 59, 정답: 30, 맞힌 사람: 30, 정답 비율: 50.847%

### 분류

수학, 구현, 문자열

### 문제 설명

<p>If the Roman Empire had not fallen, then Rome would surely have discovered electricity and used electronic calculators; however, the Romans used Roman Numerals! Your task is to implement a simple Roman Calculator which accepts two Roman Numerals and outputs the sum in Roman Numerals. You may assume that numbers greater than 1000 will not occur in the input. Output numbers greater than 1000 are illegal and should generate the message&nbsp;<samp>CONCORDIA CUM VERITATE</samp>&nbsp;(In Harmony with Truth).</p>

### 입력

<p>The input consists of a number, indicating the number of test cases, followed by this many test cases. Each test case consists of a single line with two numbers in Roman Numerals separated by a&nbsp;<code>+</code>&nbsp;along with an&nbsp;<code>=</code>&nbsp;at the end. There are no separating spaces.</p>

### 출력

<p>For each test case the output is a copy of the input with the Roman Numeral that represents the sum. Outputs for different test cases are separated by a blank line.</p>

### 힌트

<h2>Roman Research</h2>

<p>The Roman Numerals used by the Romans evolved over many years, and so there are some variations in the way they are written. We will use the following definitions:</p>

<ol>
	<li>The following symbols are used:&nbsp;<code>I</code>&nbsp;for 1,&nbsp;<code>V</code>&nbsp;for 5,&nbsp;<code>X</code>&nbsp;for 10,&nbsp;<code>L</code>&nbsp;for 50,&nbsp;<code>C</code>&nbsp;for 100,&nbsp;<code>D</code>&nbsp;for 500, and&nbsp;<code>M</code>&nbsp;for 1000.</li>
	<li>Numbers are formed by writing symbols from 1. from left to right, as a sum, each time using the symbol for the largest possible value. The symbols&nbsp;<code>M</code>,&nbsp;<code>C</code>,&nbsp;<code>X</code>, or&nbsp;<code>I</code>&nbsp;may be used at most three times in succession. Only if this rule would be violated, you can use the following rule:
	<ul>
		<li>When a single&nbsp;<code>I</code>&nbsp;immediately precedes a&nbsp;<code>V</code>&nbsp;or&nbsp;<code>X</code>, it is subtracted. When a single&nbsp;<code>X</code>&nbsp;immediately precedes an&nbsp;<code>L</code>&nbsp;or&nbsp;<code>C</code>, it is subtracted. When a single&nbsp;<code>C</code>&nbsp;immediately precedes a&nbsp;<code>D</code>&nbsp;or&nbsp;<code>M</code>, it is subtracted.</li>
	</ul>
	</li>
</ol>

<p>For example:&nbsp;<code>II</code>&nbsp;= 2;&nbsp;<code>IX</code>&nbsp;= 9;&nbsp;<code>CXIII</code>&nbsp;= 113;&nbsp;<code>LIV</code>&nbsp;= 54;&nbsp;<code>XXXVIII</code>&nbsp;= 38;&nbsp;<code>XCIX</code>&nbsp;= 99.</p>
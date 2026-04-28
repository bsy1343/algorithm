# [Gold II] The Equation - 23948

[문제 링크](https://www.acmicpc.net/problem/23948)

### 성능 요약

시간 제한: 15 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 61, 정답: 27, 맞힌 사람: 22, 정답 비율: 51.163%

### 분류

그리디 알고리즘, 비트마스킹

### 문제 설명

<p>The laws of the universe can be represented by an array of&nbsp;<b>N</b>&nbsp;non-negative integers. The i-th of these integers is&nbsp;<b>A<sub>i</sub></b>.</p>

<p>The universe is&nbsp;<i>good</i>&nbsp;if there is a non-negative integer k such that the following equation is satisfied: (<b>A<sub>1</sub></b>&nbsp;xor k) + (<b>A<sub>2</sub></b>&nbsp;xor k) + ... (<b>A<sub><b>N</b></sub></b>&nbsp;xor k) &le;&nbsp;<b>M</b>, where xor denotes the&nbsp;<a href="https://en.wikipedia.org/wiki/Bitwise_operation#XOR">bitwise exclusive or</a>.</p>

<p>What is the largest value of k for which the universe is good?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case begins with a line containing the two integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>M</b>, the number of integers in&nbsp;<b>A</b>&nbsp;and the limit on the equation, respectively.</p>

<p>The second line contains&nbsp;<b>N</b>&nbsp;integers, the i-th of which is&nbsp;<b>A<sub>i</sub></b>, the i-th integer in the array.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the largest value of k for which the universe is good, or&nbsp;<code>-1</code>&nbsp;if there is no such k.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>N</b>&nbsp;&le; 1000.</li>
</ul>

### 힌트

<p>In sample case #1, the array contains&nbsp;<b>N</b>&nbsp;= 3 integers and&nbsp;<b>M</b>&nbsp;= 27. The largest possible value of k that gives a good universe is 12 ((8 xor 12) + (2 xor 12) + (4 xor 12) = 26).</p>

<p>In sample case #2, the array contains&nbsp;<b>N</b>&nbsp;= 4 integers and&nbsp;<b>M</b>&nbsp;= 45. The largest possible value of k that gives a good universe is 14 ((30 xor 14) + (0 xor 14) + (4 xor 14) + (11 xor 14) = 45).</p>

<p>In sample case #3, the array contains&nbsp;<b>N</b>&nbsp;= 1 integer and&nbsp;<b>M</b>&nbsp;= 0. The largest possible value of k that gives a good universe is 100 (100 xor 100 = 0).</p>

<p>In sample case #4, there is no value of k that gives a good universe, so the answer is -1.</p>
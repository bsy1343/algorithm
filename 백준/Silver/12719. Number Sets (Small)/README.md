# [Silver I] Number Sets (Small) - 12719

[문제 링크](https://www.acmicpc.net/problem/12719)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 108, 정답: 79, 맞힌 사람: 71, 정답 비율: 76.344%

### 분류

구현, 수학, 정수론, 소수 판정

### 문제 설명

<p>You start with a sequence of consecutive integers. You want to group them into sets.</p>

<p>You are given the interval, and an integer&nbsp;<strong>P</strong>. Initially, each number in the interval is in its own set.</p>

<p>Then you consider each pair of integers in the interval. If the two integers share a prime factor which is at least&nbsp;<strong>P</strong>, then you merge the two sets to which the two integers belong.</p>

<p>How many different sets there will be at the end of this process?</p>

### 입력

<p>One line containing an integer&nbsp;<strong>C</strong>, the number of test cases in the input file.</p>

<p>For each test case, there will be one line containing three single-space-separated integers&nbsp;<strong>A</strong>,&nbsp;<strong>B</strong>, and&nbsp;<strong>P</strong>.&nbsp;&nbsp;<strong>A</strong>&nbsp;and&nbsp;<strong>B</strong>&nbsp;are the first and last integers in the interval, and&nbsp;<strong>P</strong>&nbsp;is the number as described above.</p>

<p>Limits</p>

<ul>
	<li>1 &lt;=&nbsp;<strong>C</strong>&nbsp;&lt;= 10</li>
	<li>1 &lt;=&nbsp;<strong>A</strong>&nbsp;&lt;=&nbsp;<strong>B</strong>&nbsp;&lt;= 1000</li>
	<li>2 &lt;=&nbsp;<strong>P</strong>&nbsp;&lt;=&nbsp;<strong>B</strong></li>
</ul>

<div>&nbsp;</div>

### 출력

<p>For each test case, output one line containing the string &quot;Case #X: Y&quot; where X is the number of the test case, starting from 1, and Y is the number of sets.</p>
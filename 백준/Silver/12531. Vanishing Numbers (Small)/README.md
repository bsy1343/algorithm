# [Silver III] Vanishing Numbers (Small) - 12531

[문제 링크](https://www.acmicpc.net/problem/12531)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 122, 정답: 32, 맞힌 사람: 20, 정답 비율: 27.778%

### 분류

임의 정밀도 / 큰 수 연산, 구현

### 문제 설명

<p>There is a pool of numbers which are arbitrary decimal fractions from the interval (0, 1). In the first round of the game the middle third of the interval disappears, and the numbers from this interval are eliminated from the pool. In the next rounds the middle thirds of each of the remaining intervals disappear. In the first round the the interval&nbsp;[1/3, 2/3]&nbsp;is eliminated and in the second round the two intervals&nbsp;[1/9, 2/9]&nbsp;and&nbsp;[7/9, 8/9]&nbsp;are eliminated, and so on. The endpoints of each removed interval are removed as well.</p>

<p>Your role is to sort the pool of numbers in the order that they are eliminated. If some numbers are never eliminated, list them last. In case of a tie, list the smaller numbers first.</p>

### 입력

<p>The first line of input will contain&nbsp;<strong>T</strong>, the number of test cases.&nbsp;<strong>T</strong>&nbsp;test cases will follow. Each one will start with a line containing an integer&nbsp;<strong>N</strong>.&nbsp;<strong>N</strong>&nbsp;numbers will follow, one per line. Each number will start with &quot;0.&quot;, followed by one or more decimal digits. Each number will be larger than zero and will not have any trailing zeros.</p>

<h3>Limits</h3>

<ul>
	<li><strong>T</strong>&nbsp;&le; 100</li>
	<li><strong>N</strong>&nbsp;&le; 100</li>
	<li>Each number will have at most 5 digits after the decimal point.</li>
</ul>

<div>&nbsp;</div>

### 출력

<p>For each test case, print the line &quot;Case #<strong>x</strong>:&quot;, where&nbsp;<strong>x</strong>&nbsp;is the number of the test case, starting with 1. After that line, list the numbers, one per line, in order of elimination.</p>

### 힌트

<p>In case #1, 0.5 is eliminated in the first round because it falls into the interval&nbsp;[1/3, 2/3]. After the first round, there are two intervals remaining:&nbsp;(0, 1/3)&nbsp;and&nbsp;(2/3, 1). The number 0.12 is eliminated in round 2 because it falls into the interval&nbsp;[1/9, 2/9].</p>
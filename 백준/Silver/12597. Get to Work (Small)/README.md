# [Silver IV] Get to Work (Small) - 12597

[문제 링크](https://www.acmicpc.net/problem/12597)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 123, 정답: 84, 맞힌 사람: 52, 정답 비율: 67.532%

### 분류

구현, 그리디 알고리즘, 정렬

### 문제 설명

<p>You work for a company that has&nbsp;<strong>E</strong>&nbsp;employees working in town&nbsp;<strong>T</strong>. There are&nbsp;<strong>N</strong>&nbsp;towns in the area where the employees live. You want to ensure that everyone will be able to make it to work. Some of the employees are drivers and can drive&nbsp;<strong>P</strong>&nbsp;passengers. A capacity of&nbsp;<code>P == 1</code>&nbsp;indicates that the driver can only transport themselves to work. You want to ensure that everyone will be able to make it to work and you would like to minimize the number of cars on the road.</p>

<p>You want to calculate the number of cars on the road, with these requirements:</p>

<ul>
	<li>Every employee can get to town&nbsp;<strong>T</strong>.</li>
	<li>The only way an employee may travel between towns is in a car belonging to an employee.</li>
	<li>Employees can only take rides from other employees that live in the same town.</li>
	<li>The minimum number of cars is used.</li>
</ul>

<p>Find whether it is possible for everyone to make it to work, and if it is, how many cars will end up driving to the office.</p>

### 입력

<p>One line containing an integer&nbsp;<strong>C</strong>, the number of test cases in the input file.</p>

<p>For each test case there will be:</p>

<ul>
	<li>One line containing the integer&nbsp;<strong>N</strong>, the number of towns in your area and the integer&nbsp;<strong>T</strong>, the town where the office is located.</li>
	<li>One line containing the integer&nbsp;<strong>E</strong>, the number of employees.</li>
	<li><code>E</code>&nbsp;lines, one for each employee, each containing:
	<ul>
		<li>An integer H &gt;= 1, the home town of the employee, followed by</li>
		<li>An integer P &gt;= 0, the number of passengers they can drive. If the employee is not licensed to drive the number will be 0.</li>
	</ul>
	</li>
</ul>

<p>Limits</p>

<ul>
	<li>1 &le; T &le; N</li>
	<li>1 &le; H &le; N</li>
	<li>0 &le; P &le; 6</li>
	<li>C = 50</li>
	<li>1 &le; N &le; 10</li>
	<li>1 &le; E &le; 100</li>
</ul>

### 출력

<ul>
	<li><strong>C</strong>&nbsp;lines, one for each test case in the order they occur in the input file, each containing the string &quot;Case #<strong>X</strong>: &quot; where&nbsp;<strong>X</strong>&nbsp;is the number of the test case, starting from 1, followed by:
	<ul>
		<li>The string&nbsp;<strong>IMPOSSIBLE</strong>, if there are not enough drivers for everyone to commute;&nbsp;<strong>OR</strong></li>
		<li><strong>N</strong>&nbsp;space-separated integers, one for each town from&nbsp;<strong>1</strong>&nbsp;to&nbsp;<strong>N</strong>, which indicate the number of vehicles commuting from the town.</li>
	</ul>
	</li>
</ul>
# [Silver IV] Sherlock and Parentheses (Large) - 14315

[문제 링크](https://www.acmicpc.net/problem/14315)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 90, 정답: 74, 맞힌 사람: 67, 정답 비율: 82.716%

### 분류

수학, 그리디 알고리즘, 조합론

### 문제 설명

<p>Sherlock and Watson have recently enrolled in a computer programming course. Today, the tutor taught them about the balanced parentheses problem. A string&nbsp;<code>S</code>&nbsp;consisting only of characters&nbsp;<code>(</code>&nbsp;and/or&nbsp;<code>)</code>&nbsp;is&nbsp;balanced&nbsp;if:</p>

<ul>
	<li>It is the empty string, or:</li>
	<li>It has the form&nbsp;<code>(</code>S<code>)</code>, where S is a balanced string, or:</li>
	<li>It has the form S<sub>1</sub>S<sub>2</sub>, where S<sub>1</sub>&nbsp;is a balanced string and S<sub>2</sub>&nbsp;is a balanced string.</li>
</ul>

<p>Sherlock coded up the solution very quickly and started bragging about how good he is, so Watson gave him a problem to test his knowledge. He asked Sherlock to generate a string S of&nbsp;L + R&nbsp;characters, in which there are a total of&nbsp;L&nbsp;left parentheses&nbsp;<code>(</code>&nbsp;and a total of&nbsp;R&nbsp;right parentheses&nbsp;<code>)</code>. Moreover, the string must have as many different balanced non-empty substrings as possible. (Two substrings are considered different as long as they start or end at different indexes of the string, even if their content happens to be the same). Note that S itself does not have to be balanced.</p>

<p>Sherlock is sure that once he knows the maximum possible number of balanced non-empty substrings, he will be able to solve the problem. Can you help him find that maximum number?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each test case consists of one line with two integers:&nbsp;L&nbsp;and&nbsp;R.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the answer, as described above.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;L&nbsp;&le; 10<sup>5</sup>.</li>
	<li>0 &le;&nbsp;R&nbsp;&le; 10<sup>5</sup>.</li>
	<li>1 &le;&nbsp;L + R&nbsp;&le; 10<sup>5</sup>.</li>
</ul>

### 힌트

<p>In Case 1, the only possible string is&nbsp;<code>(</code>. There are no balanced non-empty substrings.</p>

<p>In Case 2, the optimal string is&nbsp;<code>()</code>. There is only one balanced non-empty substring: the entire string itself.</p>

<p>In Case 3, both strings&nbsp;<code>()()(</code>&nbsp;and&nbsp;<code>(()()</code>&nbsp;give the same optimal answer.</p>

<p>For the case&nbsp;<code>()()(</code>, for example, the three balanced substrings are&nbsp;<code>()</code>&nbsp;from indexes 1 to 2,&nbsp;<code>()</code>&nbsp;from indexes 3 to 4, and&nbsp;<code>()()</code>&nbsp;from indexes 1 to 4.</p>
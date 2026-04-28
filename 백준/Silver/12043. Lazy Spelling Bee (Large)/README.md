# [Silver IV] Lazy Spelling Bee (Large) - 12043

[문제 링크](https://www.acmicpc.net/problem/12043)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 262, 정답: 169, 맞힌 사람: 133, 정답 비율: 60.731%

### 분류

수학, 문자열, 조합론

### 문제 설명

<p>In the Lazy Spelling Bee, a contestant is given a target word W to spell. The contestant&#39;s answer word A is acceptable if it is the same length as the target word, and the i-th letter of A is either the i-th, (i-1)th, or (i+1)th letter of W, for all i in the range of the length of A. (The first letter of A must match either the first or second letter of W, since the 0th letter of W doesn&#39;t exist. Similarly, the last letter of A must match either the last or next-to-last letter of W.) Note that the target word itself is always an acceptable answer word.</p>

<p>You are preparing a Lazy Spelling Bee, and you have been asked to determine, for each target word, how many distinct acceptable answer words there are. Since this number may be very large, please output it modulo 1000000007 (10<sup>9</sup>&nbsp;+ 7).</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow; each consists of one line with a string consisting only of lowercase English letters (<code>a</code>&nbsp;through&nbsp;<code>z</code>).</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le; length of each string &le; 1000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the number of distinct acceptable answer words, modulo 10<sup>9</sup>&nbsp;+ 7.</p>

### 힌트

<p>In sample case #1, the acceptable answer words are&nbsp;<code>aa</code>,&nbsp;<code>ag</code>,&nbsp;<code>ga</code>, and&nbsp;<code>gg</code>.</p>

<p>In sample case #2, the only acceptable answer word is&nbsp;<code>aa</code>.</p>
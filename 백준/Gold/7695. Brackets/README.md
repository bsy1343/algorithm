# [Gold II] Brackets - 7695

[문제 링크](https://www.acmicpc.net/problem/7695)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 59, 정답: 35, 맞힌 사람: 27, 정답 비율: 69.231%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>We give the following inductive definition of a &ldquo;regular brackets&rdquo; sequence:</p>

<ul>
	<li>the empty sequence is a regular brackets sequence,</li>
	<li>if s is a regular brackets sequence, then (s) and [s] are regular brackets sequences, and</li>
	<li>if a and b are regular brackets sequences, then ab is a regular brackets sequence.</li>
	<li>no other sequence is a regular brackets sequence</li>
</ul>

<p>For instance, all of the following character sequences are regular brackets sequences:</p>

<pre>
(), [], (()), ()[], ()[()]</pre>

<p>while the following character sequences are not:</p>

<pre>
(, ], )(, ([)], ([(]</pre>

<p>Given a brackets sequence of characters a<sub>1</sub>a<sub>2</sub>...a<sub>n</sub>, your goal is to find the length of the longest regular brackets sequence that is a subsequence of s. That is, you wish to find the largest m such that for indices i<sub>1</sub>, i<sub>2</sub>, . . . , i<sub>m</sub> where 1 &le; i<sub>1</sub> &lt; i<sub>2</sub> &lt; . . . &lt; i<sub>m</sub> &le; n, a<sub>i<sub>1</sub></sub> a<sub>i<sub>2</sub></sub> . . . a<sub>i<sub>m</sub></sub> is a regular brackets sequence.</p>

### 입력

<p>The input test file will contain multiple test cases. Each input test case consists of a single line containing only the characters (, ), [, and ]; each input test will have length between 1 and 100, inclusive. The end-of-file is marked by a line containing the word &ldquo;end&rdquo; and should not be processed.</p>

### 출력

<p>For each input case, the program should print the length of the longest possible regular brackets subsequence on a single line.</p>

### 힌트

<p>Given the initial sequence ([([]])], the longest regular brackets subsequence is [([])].</p>
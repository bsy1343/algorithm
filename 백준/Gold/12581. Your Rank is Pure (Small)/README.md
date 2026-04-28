# [Gold V] Your Rank is Pure (Small) - 12581

[문제 링크](https://www.acmicpc.net/problem/12581)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 23, 맞힌 사람: 22, 정답 비율: 66.667%

### 분류

비트마스킹, 브루트포스 알고리즘, 다이나믹 프로그래밍

### 문제 설명

<blockquote><em>Pontius</em>: You know, I like this number 127, I don&#39;t know why.<br />
<em>Woland</em>: Well, that is an object so pure. You know the&nbsp;<em>prime numbers</em>.<br />
<em>Pontius</em>: Surely I do. Those are the objects possessed by our ancient masters hundreds of years ago. Oh, yes, why then? 127 is indeed a prime number as I was told.<br />
<em>Woland</em>: Not... only... that. 127 is the 31st prime number; then, 31 is itself a prime, it is the 11th; and 11 is the 5th; 5 is the 3rd; 3, you know, is the second; and finally 2 is the 1st.<br />
<em>Pontius</em>: Heh, that is indeed... purely prime.</blockquote>

<p>The game can be played on any subset&nbsp;<code>S</code>&nbsp;of positive integers. A number in&nbsp;<code>S</code>&nbsp;is considered pure with respect to&nbsp;<code>S</code>&nbsp;if, starting from it, you can continue taking its rank in&nbsp;<code>S</code>, and get a number that is also in&nbsp;<code>S</code>, until in finite steps you hit the number 1, which is not in&nbsp;<code>S</code>.</p>

<p>When&nbsp;<strong>n</strong>&nbsp;is given, in how many ways you can pick&nbsp;<code>S</code>, a subset of {2, 3, ..., n}, so that&nbsp;<strong>n</strong>&nbsp;is pure, with respect to&nbsp;<code>S</code>? The answer might be a big number, you need to output it modulo 100003.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;lines follow. Each contains a single integer&nbsp;<strong>n</strong>.</p>

<h3>Limits</h3>

<ul>
	<li><strong>T</strong>&nbsp;&le; 100.</li>
	<li>2 &le;&nbsp;<strong>n</strong>&nbsp;&le; 25.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the answer as described above.</p>
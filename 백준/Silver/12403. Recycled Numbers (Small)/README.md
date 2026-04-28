# [Silver II] Recycled Numbers (Small) - 12403

[문제 링크](https://www.acmicpc.net/problem/12403)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 41, 맞힌 사람: 36, 정답 비율: 94.737%

### 분류

구현

### 문제 설명

<p>Do you ever become frustrated with television because you keep seeing the same things, recycled over and over again? Well I personally don&#39;t care about television, but I do sometimes feel that way about numbers.</p>

<p>Let&#39;s say a pair of distinct positive integers (<em>n</em>,&nbsp;<em>m</em>) is&nbsp;<em>recycled</em>&nbsp;if you can obtain&nbsp;<em>m</em>&nbsp;by moving some digits from the back of&nbsp;<em>n</em>&nbsp;to the front without changing their order. For example, (12345, 34512) is a recycled pair since you can obtain 34512 by moving 345 from the end of 12345 to the front. Note that&nbsp;<em>n</em>&nbsp;and&nbsp;<em>m</em>&nbsp;must have the same number of digits in order to be a recycled pair. Neither&nbsp;<em>n</em>&nbsp;nor&nbsp;<em>m</em>&nbsp;can have leading zeros.</p>

<p>Given integers&nbsp;<strong>A</strong>&nbsp;and&nbsp;<strong>B</strong>&nbsp;with the same number of digits and no leading zeros, how many distinct recycled pairs (<em>n</em>,&nbsp;<em>m</em>) are there with&nbsp;<strong>A</strong>&nbsp;&le;&nbsp;<em>n</em>&nbsp;&lt;&nbsp;<em>m</em>&nbsp;&le;&nbsp;<strong>B</strong>?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case consists of a single line containing the integers&nbsp;<strong>A</strong>&nbsp;and&nbsp;<strong>B</strong>.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 50.</li>
	<li><strong>A</strong>&nbsp;and&nbsp;<strong>B</strong>&nbsp;have the same number of digits.</li>
	<li>1 &le;&nbsp;<strong>A</strong>&nbsp;&le;&nbsp;<strong>B</strong>&nbsp;&le; 1000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1), and y is the number of recycled pairs (<em>n</em>,&nbsp;<em>m</em>) with&nbsp;<strong>A</strong>&nbsp;&le;&nbsp;<em>n</em>&nbsp;&lt;&nbsp;<em>m</em>&nbsp;&le;&nbsp;<strong>B</strong>.</p>
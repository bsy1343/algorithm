# [Silver III] Pretty Good Proportion (Small) - 12121

[문제 링크](https://www.acmicpc.net/problem/12121)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 88, 정답: 51, 맞힌 사람: 40, 정답 비율: 56.338%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>I have a sequence of&nbsp;<strong>N</strong>&nbsp;binary digits. I am looking for a substring with just the right proportion of 0s and 1s, but it may not exist, so I will settle for something that&#39;s just pretty good.</p>

<p>Can you find a substring where the fraction of 1s is as close as possible to the given fraction&nbsp;<strong>F</strong>? Output the earliest possible index at which such a substring starts.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each one starts with a line containing&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>F</strong>.&nbsp;<strong>F</strong>&nbsp;will be a decimal fraction between 0 and 1 inclusive, with exactly 6 digits after the decimal point. The next line contains&nbsp;<strong>N</strong>&nbsp;digits, each being either 0 or 1.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<strong>F</strong>&nbsp;&le; 1</li>
	<li><strong>F</strong>&nbsp;will have exactly 6 digits after the decimal point.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 1000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the 0-based index of the start of the substring with the fraction of 1s that is as close as possible to&nbsp;<strong>F</strong>. If there are multiple possible answers, output the smallest correct value.</p>

### 힌트

<p>In Case #1, there is no substring that has exactly a 1-proportion of exactly&nbsp;666667/1000000. The closest we can get is&nbsp;2/3. The input string has 5 substrings that achieve it -- 3 substrings of length 3 that start at indices 5, 7, and 8 (101, 101, and 011); as well as two substrings of length 6 that start at indices 5 and 6 (101011 and 010111). The smallest of these indices is 5.</p>
# [Platinum V] Albocede DNA (Large) - 12073

[문제 링크](https://www.acmicpc.net/problem/12073)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 14, 맞힌 사람: 14, 정답 비율: 41.176%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The DNA of the Albocede alien species is made up of 4 types of nucleotides:&nbsp;<code>a</code>,&nbsp;<code>b</code>,&nbsp;<code>c</code>, and&nbsp;<code>d</code>. Different Albocedes may have different sequences of these nucleotides, but any Albocede&#39;s DNA sequence obeys all of the following rules:</p>

<ul>
	<li>It contains at least one copy of each of&nbsp;<code>a</code>,&nbsp;<code>b</code>,&nbsp;<code>c</code>, and&nbsp;<code>d</code>.</li>
	<li>All&nbsp;<code>a</code>s come before all&nbsp;<code>b</code>s, which come before all&nbsp;<code>c</code>s, which come before all&nbsp;<code>d</code>s.</li>
	<li>There are exactly as many&nbsp;<code>&#39;a&#39;</code>s as&nbsp;<code>&#39;c&#39;</code>s.</li>
	<li>There are exactly as many&nbsp;<code>&#39;b&#39;</code>s as&nbsp;<code>&#39;d&#39;</code>s.</li>
</ul>

<p>For example,&nbsp;<code>abcd</code>&nbsp;and&nbsp;<code>aabbbccddd</code>&nbsp;are valid Albocede DNA sequences.&nbsp;<code>acbd</code>,&nbsp;<code>abc</code>, and&nbsp;<code>abbccd</code>&nbsp;are not.</p>

<p>The Albocede-n is an evolved species of Albocede. The DNA sequence of an Albocede-n consists of one or more valid Albocede DNA sequences, concatenated together end-to-end. For example,&nbsp;<code>abcd</code>&nbsp;and&nbsp;<code>aaabcccdaabbbccdddabcd</code>&nbsp;are valid Albocede-n DNA sequences. (Observe that a valid Albocede-n DNA sequence is not necessarily also a valid Albocede DNA sequence.)</p>

<p>From one of your alien expeditions, you retrieved an interesting sequence of DNA made up of only&nbsp;<code>a</code>s,&nbsp;<code>b</code>s,&nbsp;<code>c</code>s, and&nbsp;<code>d</code>s. You are interested in how many of the different&nbsp;<a href="https://en.wikipedia.org/wiki/Subsequence" style="color: rgb(85, 26, 139);" target="_blank">subsequences</a>&nbsp;of that sequence would be valid Albocede-n DNA sequences. (Even if multiple different selections of nucleotides from the sequence produce the same valid subsequence, they still all count as distinct subsequences.) Since the result may be very large, please find it modulo 1000000007 (10<sup>9</sup>&nbsp;+ 7).</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>. Each of the next&nbsp;<strong>T</strong>&nbsp;lines contains a string&nbsp;<strong>S</strong>&nbsp;that consists only of the characters&nbsp;<code>a</code>,&nbsp;<code>b</code>,&nbsp;<code>c</code>, and&nbsp;<code>d</code>.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 20.</li>
	<li>1 &le;&nbsp;<strong>length of S</strong>&nbsp;&le; 500.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the output of the x<sup>th</sup>&nbsp;test case.</p>
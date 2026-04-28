# [Gold III] JJOOII 2 - 18432

[문제 링크](https://www.acmicpc.net/problem/18432)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 198, 정답: 148, 맞힌 사람: 127, 정답 비율: 73.410%

### 분류

이분 탐색, 두 포인터

### 문제 설명

<p>Bitaro received a string S of length N for his birthday present. String S consists of three kinds of characters, <code>J</code>, <code>O</code> and <code>I</code>.</p>

<p>For each positive integer K, we will call the string which consists of K <code>J</code>&rsquo;s, K <code>O</code>&rsquo;s, and K <code>I</code>&rsquo;s in this order <strong>JOI-string of level K</strong>. For example, <code>JJOOII</code> is a JOI-string of level 2.</p>

<p>Bitaro likes a JOI-string of level K, so he is going to make a JOI-string of level K from string S by using the following three operations any number of times in arbitrary order:</p>

<ul>
	<li><strong>Operation 1</strong> Bitaro deletes the first character of S.</li>
	<li><strong>Operation 2</strong> Bitaro deletes the last character of S.</li>
	<li><strong>Operation 3</strong> Bitaro deletes a character of S which is neither the first nor the last.</li>
</ul>

<p>Because using Operation 3 is time-consuming, Bitaro wants to make a JOI-string of level K with as small number of Operation 3 as possible.</p>

<p>Write a program which, given a string S of length N and a positive integer K, prints the smallest number of Operation 3 required to make a JOI-string of level K from S . If it is impossible to make a JOI-string of level K with the operations, print &minus;1 instead.</p>

### 입력

<p>Read the following data from the standard input. N and K are integers. S is a string.</p>

<pre>
N K
S</pre>

### 출력

<p>Write one line to the standard output. The output should contain the smallest number of Operation 3 required to make a JOI-string of level K from S . If it is impossible to make a JOI-string of level K, print &minus;1 instead.</p>

### 제한

<ul>
	<li>3 &le; N &le; 200 000.</li>
	<li>1 &le; K &le; N/3.</li>
	<li>S is a string of length N which consists of <code>J</code>, <code>O</code>&nbsp;and <code>I</code>.</li>
</ul>
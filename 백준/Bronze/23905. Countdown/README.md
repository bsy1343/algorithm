# [Bronze I] Countdown - 23905

[문제 링크](https://www.acmicpc.net/problem/23905)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 841, 정답: 301, 맞힌 사람: 188, 정답 비율: 35.140%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Avery has an array of&nbsp;<b>N</b>&nbsp;positive integers. The i-th integer of the array is&nbsp;<b>A<sub>i</sub></b>.</p>

<p>A contiguous subarray is an&nbsp;<i>m-countdown</i>&nbsp;if it is of length m and contains the integers m, m-1, m-2, ..., 2, 1 in that order. For example,&nbsp;<code>[3, 2, 1]</code>&nbsp;is a 3-countdown.</p>

<p>Can you help Avery count the number of&nbsp;<b>K</b>-countdowns in her array?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case begins with a line containing the integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>K</b>. The second line contains&nbsp;<b>N</b>&nbsp;integers. The i-th integer is&nbsp;<b>A<sub>i</sub></b>.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the number of&nbsp;<b>K</b>-countdowns in her array.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>2 &le;&nbsp;<b>K</b>&nbsp;&le;&nbsp;<b>N</b>.</li>
	<li>1 &le;&nbsp;<b>A<sub>i</sub></b>&nbsp;&le; 2 &times; 10<sup>5</sup>, for all i.</li>
</ul>

### 힌트

<p>In sample case #1, there are two 3-countdowns as highlighted below.</p>

<ul>
	<li>1 2 3 7 9&nbsp;<b>3 2 1</b>&nbsp;8 3 2 1</li>
	<li>1 2 3 7 9 3 2 1 8&nbsp;<b>3 2 1</b></li>
</ul>

<p>In sample case #2, there are no 2-countdowns.</p>

<p>In sample case #3, there is one 6-countdown as highlighted below.</p>

<ul>
	<li>100 7&nbsp;<b>6 5 4 3 2 1</b>&nbsp;100</li>
</ul>
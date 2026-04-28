# [Gold I] Boring Numbers - 23926

[문제 링크](https://www.acmicpc.net/problem/23926)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 62, 정답: 33, 맞힌 사람: 30, 정답 비율: 61.224%

### 분류

수학, 구현

### 문제 설명

<p>Ron read a book about boring numbers. According to the book, a positive number is called boring if all of the digits at even positions in the number are even and all of the digits at odd positions are odd. The digits are enumerated from left to right starting from 1. For example, the number 1478 is boring as the odd positions include the digits {1, 7} which are odd and even positions include the digits {4, 8} which are even.</p>

<p>Given two numbers&nbsp;<b>L</b>&nbsp;and&nbsp;<b>R</b>, Ron wants to count how many numbers in the range [<b>L</b>,&nbsp;<b>R</b>] (<b>L</b>&nbsp;and&nbsp;<b>R</b>&nbsp;inclusive) are boring. Ron is unable to solve the problem, hence he needs your help.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case consists of a single line with two numbers&nbsp;<b>L</b>&nbsp;and&nbsp;<b>R</b>.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the count of boring numbers.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
</ul>

### 힌트

<p>In Sample Case #1, the numbers in the range are {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15} out of which {5, 7, 9, 10, 12, 14} are boring, hence the answer is 6.</p>

<p>In Sample Case #2, the numbers in the range are {120, 121, 122, 123, 124, 125} out of which {121, 123, 125} are boring, hence the answer is 3.</p>

<p>In Sample Case #3, the numbers in the range are {779, 780, 781, 782, 783} out of which {781, 783} are boring, hence the answer is 2.</p>
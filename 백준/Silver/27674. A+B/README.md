# [Silver V] A+B - 27674

[문제 링크](https://www.acmicpc.net/problem/27674)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 416, 정답: 229, 맞힌 사람: 209, 정답 비율: 61.652%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Our first problem today is as easy as <em>a</em> + <em>b</em>.</p>

<p>You are given a string of digits. Rearrange those digits to build two nonnegative integers <em>a</em> and <em>b</em> such that the sum <em>a</em> + <em>b</em> is as large as possible.</p>

<p>Each number must consist of at least one digit. Leading zeros are not allowed, but the number zero consisting of a single digit 0 is allowed. You have to use each digit exactly as many times as it occurs in the given input string.</p>

### 입력

<p>The first line of the input file contains an integer <em>t</em> specifying the number of test cases. Each test case is preceded by a blank line. Each test case consists of a single line containing one string of digits. If there are more than 2 digits in the string, not all of them are zeros.</p>

### 출력

<p>For each test case, output a single line with a single integer: the largest sum that can be achieved.</p>

### 힌트

<p>The first two test cases could appear in the easy input file <code>a1.in</code>, the other two could only appear in the hard input file <code>a2.in</code>.</p>

<p>One optimal arrangement of digits for each example test case: 10+0, 71+5, 1+2, and 44444+4.</p>
# [Platinum V] Town - 27680

[문제 링크](https://www.acmicpc.net/problem/27680)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 5, 맞힌 사람: 5, 정답 비율: 45.455%

### 분류

수학, 구현, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>You are standing in a town with infinitely many houses. Currently, the houses do not have any house numbers. You were given the task to fix this.</p>

<p>You have a box with plastic digits. For each <em>i</em> between 0 and 9, inclusive, there are <em>d</em><sub><em>i</em></sub> copies of the digit <em>i</em> in your box. You can number a house by sticking the appropriate digits to its wall. For example, on the house number 474 you will use two digits 4 and one digit 7.</p>

<p>You have decided that you will number the houses sequentially, starting from 1. How many houses can you number before you run out of digits?</p>

<p>You are given the counts <em>d</em><sub>0</sub>, &hellip;, <em>d</em><sub>9</sub> of the digits in your box. Find the largest <em>x</em> such that you are able to write the numbers 1 through <em>x</em> using your set of digits.</p>

### 입력

<p>The first line of the input file contains an integer <em>t</em> specifying the number of test cases. Each test case is preceded by a blank line. Each test case consists of a single line containing 10 nonnegative integers &ndash; the counts of digits 0 through 9.</p>

### 출력

<p>For each test case, output a single line with the answer to the test case.</p>

### 힌트

<p>With the digits you have, you are able to build the numbers 1 through 10. Once you do so, you will be left with three digits: one 1, one 4, and one 7. This is not enough to construct the number 11.</p>
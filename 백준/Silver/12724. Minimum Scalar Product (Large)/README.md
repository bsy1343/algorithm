# [Silver IV] Minimum Scalar Product (Large) - 12724

[문제 링크](https://www.acmicpc.net/problem/12724)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 528, 정답: 293, 맞힌 사람: 266, 정답 비율: 56.356%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>You are given two vectors v<sub>1</sub>=(x<sub>1</sub>,x<sub>2</sub>,...,x<sub>n</sub>) and v<sub>2</sub>=(y<sub>1</sub>,y<sub>2</sub>,...,y<sub>n</sub>). The scalar product of these vectors is a single number, calculated as x<sub>1</sub>y<sub>1</sub>+x<sub>2</sub>y<sub>2</sub>+...+x<sub>n</sub>y<sub>n</sub>.&nbsp;</p>

<p>Suppose you are allowed to permute the coordinates of each vector as you wish. Choose two permutations such that the scalar product of your two new vectors is the smallest possible, and output that minimum scalar product.</p>

### 입력

<p>The first line of the input file contains integer number&nbsp;<strong>T</strong>&nbsp;- the number of test cases. For each test case, the first line contains integer number&nbsp;<strong>n</strong>. The next two lines contain&nbsp;<strong>n</strong>integers each, giving the coordinates of v<sub>1</sub>&nbsp;and v<sub>2</sub>&nbsp;respectively.</p>

<p>Limits</p>

<ul>
	<li><strong>T</strong>&nbsp;= 10</li>
	<li>100 &le;&nbsp;<strong>n</strong>&nbsp;&le; 800</li>
	<li>-100000 &le;&nbsp;<strong>x</strong><sub>i</sub>,&nbsp;<strong>y</strong><sub>i</sub>&nbsp;&le; 100000</li>
</ul>

### 출력

<p>For each test case, output a line</p>

<pre>
Case #<strong>X</strong>: <strong>Y</strong></pre>

<p>where&nbsp;<strong>X</strong>&nbsp;is the test case number, starting from 1, and&nbsp;<strong>Y</strong>&nbsp;is the minimum scalar product of all permutations of the two given vectors.</p>
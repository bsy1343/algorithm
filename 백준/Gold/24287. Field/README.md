# [Gold IV] Field - 24287

[문제 링크](https://www.acmicpc.net/problem/24287)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 88, 정답: 33, 맞힌 사람: 29, 정답 비율: 44.615%

### 분류

이분 탐색, 누적 합

### 문제 설명

<p>You are given a field which is a square table N x N filled with non-negative integers. Write a program field that calculates the minimum number M, such that all squares of size M x M that cover the whole number of cells in the field have their sum greater than or equal to K. The boundary of the square may lie on the boundary of the field.</p>

### 입력

<p>The first line of the standard input contains two integers separated by a space - N and K. The next N lines of the input contain N integers each, which represent the elements of the field.</p>

### 출력

<p>The program should send to the standard output one line, containing only one integer equal to the found minimum value of M or -1, if no such value exists.</p>

### 제한

<ul>
	<li>1 &le; N &le; 5000</li>
	<li>0 &le; each element in the field &le; 50</li>
	<li>1 &le; K &le; 2&sdot;10<sup>9</sup></li>
</ul>

### 힌트

<p>For M=1 the 1x1 square:</p>

<pre>
2</pre>

<p>has a sum of just 2 &lt; 10.</p>

<p>For M=2 the 2x2 square:</p>

<pre>
0 7
0 2</pre>

<p>has a sum of 9 &lt; 10. For M=3 each 3x3 square has a sum &ge; 10.</p>

<p>Thus M=3 is the minimal M such that each square of size M x M has a sum of at least 10.</p>
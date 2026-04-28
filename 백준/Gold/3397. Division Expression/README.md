# [Gold V] Division Expression - 3397

[문제 링크](https://www.acmicpc.net/problem/3397)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 60, 정답: 40, 맞힌 사람: 34, 정답 비율: 70.833%

### 분류

수학, 애드 혹, 정수론, 유클리드 호제법

### 문제 설명

<p>Division expression is an arithmetic expression of the form</p>

<p style="text-align: center;">x<sub>1</sub>/x<sub>2</sub>/x<sub>3</sub>/.../x<sub>k</sub></p>

<p>where x<sub>i</sub> is a positive integer, for i,(1 &le; i &le; k). Division expression is evaluated from the left to the right. For instance the value of the expression</p>

<p style="text-align: center;">1/2/1/2</p>

<p>is 1/4. One can put parentheses into expression in order to change its value. For example the value of the expression</p>

<p style="text-align: center;">(1/2)/(1/2)</p>

<p>is 1. We are given a division expression E. Is it possible to put some parentheses into E to get an expression E&#39;&nbsp;whose value is an integer number.</p>

<p>Task: Write a program that for each data set from a sequence of several data sets:</p>

<ul>
	<li>reads an expression E from the input,</li>
	<li>verifies whether it is possible to put some parentheses in E to get a new expression E&#39;&nbsp;whose value is an integer number,</li>
	<li>writes the result to the output.</li>
</ul>

### 입력

<p>The first line of the input contains one positive integer d,(d &le; 5). This is the number of data sets. The data sets follow. The first line of each data set contain an integer n,(2 &le; n &le; 10000). This is the number of integers in the expression. Each of the following n lines contains exactly one positive integer not greater than 1 000 000 000. The ith number is the ith integer in the expression.</p>

### 출력

<p>For each i,(1 &le; i &le; d) your program should write to the ith line of the output one word <code>YES</code>, if the ith input expression can be transformed into an expression whose value is an integer number, and the word <code>NO</code> in the other case.</p>
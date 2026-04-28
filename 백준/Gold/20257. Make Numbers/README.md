# [Gold V] Make Numbers - 20257

[문제 링크](https://www.acmicpc.net/problem/20257)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 56, 정답: 49, 맞힌 사람: 47, 정답 비율: 87.037%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Peter is a math teacher at an elementary school. To familiarize students with three basic arithmetic operations plus (+), minus (&minus;) and times (&times;), he gives a simple arithmetic puzzle as homework. The puzzle is that you are given 4 digits, and you are told to build as many non-negative integers as possible using just those 4 digits and at least one of the three basic arithmetic operations. For example, you are given 1,1,2,1 as the digits, and then you can build 32 non-negative integers as Table 1.</p>

<p style="text-align: center;">Table 1: Numbers made by 1,1,2,1.</p>

<table class="table table-bordered tr-center td-center" style="width:100%;">
	<tbody>
		<tr>
			<td>0 = 2 &minus; 1 &minus; 1 &times; 1</td>
			<td>1 = 2 + 1 &minus; 1 &minus; 1</td>
			<td>2 = 2 + 1 &minus; 1 &times; 1</td>
			<td>3 = 2 + 1 + 1 &minus; 1</td>
			<td>4 = 2 + 1 + 1 &times; 1</td>
			<td>5 = 2 + 1 + 1 + 1</td>
			<td>8 = 11 &minus; 2 &minus; 1</td>
			<td>9 = 11 &minus; 2 &times; 1</td>
		</tr>
		<tr>
			<td>10 = 12 &minus; 1 &minus; 1</td>
			<td>11 = 12 &minus; 1 &times; 1</td>
			<td>12 = 12 + 1 &minus; 1</td>
			<td>13 = 12 + 1 &times; 1</td>
			<td>14 = 12 + 1 + 1</td>
			<td>19 = 21 &minus; 1 &minus; 1</td>
			<td>20 = 21 &minus; 1 &times; 1</td>
			<td>21 = 21 + 1 &minus; 1</td>
		</tr>
		<tr>
			<td>22 = 21 + 1 &times; 1</td>
			<td>23 = 21 + 1 + 1</td>
			<td>32 = 21 + 11</td>
			<td>109 = 111 &minus; 2</td>
			<td>111 = 112 &minus; 1</td>
			<td>112 = 112 &times; 1</td>
			<td>113 = 112 + 1</td>
			<td>120 = 121 &minus; 1</td>
		</tr>
		<tr>
			<td>121 = 121 &times; 1</td>
			<td>122 = 121 + 1</td>
			<td>132 = 12 &times; 11</td>
			<td>210 = 211 &minus; 1</td>
			<td>211 = 211 &times; 1</td>
			<td>212 = 211 + 1</td>
			<td>222 = 111 &times; 2</td>
			<td>231 = 21 &times; 11</td>
		</tr>
	</tbody>
</table>

<p>To check whether the student&rsquo;s answer includes all possible integers, Peter needs to know the total number of non-negative integers that can be built for the puzzle. Please write a program to help Peter compute the total number.</p>

### 입력

<p>The input file contains 4 integers separated by a space in a line, which indicates the given digits.</p>

### 출력

<p>Output the total number of non-negative integers that can be built.</p>

### 제한

<ul>
	<li>The expressions are composed by concatenating the 4 given digits and at least one operation in {+, &minus;, &times;}. The given digits are the elements in {1, 2, 3, . . . 9}.</li>
	<li>The given digits are partitioned into several groups and the digits in each group are concatenated as a number in arbitrarily permutation order.</li>
	<li>The symbol &minus; can only be treated as a minus operator.</li>
	<li>The operations + and &minus; have equal precedence.</li>
	<li>The operation &times; has higher precedence than + and &minus;.</li>
	<li>Operations with the highest precedence are evaluated first, and operations with equal precedence are evaluated from left to right.</li>
</ul>
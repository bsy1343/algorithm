# [Gold IV] Class Packing - 5797

[문제 링크](https://www.acmicpc.net/problem/5797)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 15, 맞힌 사람: 15, 정답 비율: 62.500%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 스위핑

### 문제 설명

<p>Amelia-Bedelia, the principal of the local primary school, is tired of handling the annual confusing problem on the first day of every school year. She wants her computer to solve the problem for her.</p>

<p>The problem is that Amelia-Bedelia finds out, on the first day of school, the number of pupils enrolled in each year from Kindergarten to year 6. She needs to put the pupils in classes in such a way that she uses the smallest number of teachers while adhering to the following Department of Education rules:</p>

<ul>
	<li>classes with kindergarten to year 2 pupils must have a size of 20 or less,</li>
	<li>classes with year 3 and year 4 pupils must have a size of 25 or less,</li>
	<li>classes with year 5 and year 6 pupils must have a size of 30 or less,</li>
	<li>a class can only have pupils from one grade or two consecutive grades; for example, a class with Kindergarten and year 1 pupils must have a size of 20 or less, while a class with year 4 and year 5 pupils must have a size of 25 or less.</li>
	<li>one teacher must be assigned to one, and only one, class.</li>
</ul>

<p>Your task is to write a program that reads the enrolment numbers and computes the minimum number of teachers required.&nbsp;</p>

### 입력

<p>The input consists of a number of test cases. The description for each test case consists of seven non-negative integers on a line by themselves. The integers represent the number of pupils enrolled from Kindergarten to year 6 in that order. All integers have values less than 200, and a single space separates the integers.&nbsp;</p>

<p>A line with seven zeroes terminates the input and is not be processed.</p>

### 출력

<p>The output consists of a single line, for each test case, which contains a single integer that represents the minimum number of teachers required.</p>
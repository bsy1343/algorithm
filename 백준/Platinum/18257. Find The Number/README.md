# [Platinum IV] Find The Number - 18257

[문제 링크](https://www.acmicpc.net/problem/18257)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 74, 정답: 16, 맞힌 사람: 14, 정답 비율: 34.146%

### 분류

수학, 정수론, 이분 탐색, 유클리드 호제법, 포함 배제의 원리

### 문제 설명

<p>ABC University has k departments. Each department is assigned a department number. There are many students in each department. The university assigns roll numbers to each student such that the number is divisible by the department number. For example if department number is 5, the students can only get roll numbers 5, 10, 15, etc. The purpose is to identify the department of a student easily from his roll number. So if a number is divisible by more than one department number, then that number will not be assigned to any student (so that there will not be any ambiguity). For example if we have departments 5 and 7, then 35, 70, 105, etc are not used because they are divisible by both numbers.</p>

<p>Everything was going fine until one day, someone hacked into the University database and erased the roll number column in the students table! The Database administrator knows that,</p>

<ul>
	<li>All valid roll numbers (the valid roll numbers are numbers divisible by one and only one department number) less than 10<sup>15</sup> were there in the Database.</li>
	<li>All the records were sorted by roll number before the hacker erased them, and the hacking did not change the order of records</li>
</ul>

<p>Now given the position (1 based index) of the record in the database, can you find out the roll number corresponding to that record quickly?</p>

### 입력

<p>The first line contains one integer t, the number of testcases (1 &le; t &le; 50).</p>

<p>This will be followed by t test cases, each containing 2 lines.</p>

<ul>
	<li>The first line of each test case gives two numbers k and n separated by space.</li>
	<li>The second line contains k space separated integers specifying the department numbers of each department.</li>
</ul>

### 출력

<p>For each test case print the roll number corresponding to the nth record in the database. Output of each test-case should be on a separate line.</p>

### 제한

<ul>
	<li>1 &le; k &le; 12</li>
	<li>The department numbers will be between 2 and 10<sup>5</sup> (range inclusive of both ends).</li>
	<li>n will fit into a 32 bit signed integer.</li>
	<li>The input will be such that, the answer will always be less than 10<sup>15</sup>.</li>
	<li>There will not be two departments with same number.</li>
	<li>One department number will not be divisible by another.</li>
</ul>

### 힌트

<p>In the first test-case the roll number sequence will be 2, 3, 4, 8, etc (Note that 6 is not a valid roll number). So the 4th number in this sequence is 8.</p>
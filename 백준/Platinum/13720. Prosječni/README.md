# [Platinum V] Prosječni - 13720

[문제 링크](https://www.acmicpc.net/problem/13720)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 118, 정답: 58, 맞힌 사람: 48, 정답 비율: 57.143%

### 분류

수학, 애드 혹, 해 구성하기

### 문제 설명

<p>Slavko is bored, so he&rsquo;s filling out an N N table with positive integers. &times;</p>

<p>He&rsquo;s particularly happy if he manages to fill out the table so that the following conditions are<br />
met:</p>

<ul>
	<li>The average of the numbers in each row is an integer that is located in the same row.</li>
	<li>The average of the numbers in each column is an integer that is located in the same column.</li>
	<li>All numbers in the table are different.</li>
</ul>

<p>Help Slavko find a table that will make him happy.&nbsp;</p>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 100).&nbsp;</p>

### 출력

<p>Output N lines, in each line output N integers separated by space.<br />
Let the jth number in the ith line correspond to the value that Slavko will write down in the ith row and jth column of the table.</p>

<p>All numbers must be greater than 0 and smaller than 1 000 000 000.<br />
If there are multiple solutions, output any.<br />
If there is no solution, output -1.&nbsp;</p>

### 힌트

<p>The averages of individual rows are, respectively: 2, 5, 8.<br />
The averages of individual columns are, respectively: 4, 5, 6.<br />
Since the average of each row is located in the correspoding row and the average of each column is<br />
located in the corresponding column, the output table will make Slavko happy.&nbsp;</p>
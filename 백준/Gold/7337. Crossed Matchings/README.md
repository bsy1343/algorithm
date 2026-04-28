# [Gold IV] Crossed Matchings - 7337

[문제 링크](https://www.acmicpc.net/problem/7337)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 21, 정답: 15, 맞힌 사람: 11, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>There are two rows of positive integer numbers. We can draw one line segment between any two equal numbers, with values r, if one of them is located in the first row and the other one is located in the second row. We call this line segment an r-matching segment. The following figure shows a 3-matching and a 2-matching segment.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/7337/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-22%20%EC%98%A4%EC%A0%84%2010.38.05.png" style="height:76px; width:140px" /></p>

<p>We want to find the maximum number of matching segments possible to draw for the given input, such that:</p>

<ol>
	<li>Each a-matching segment should cross exactly one b-matching segment, where a &ne; b .</li>
	<li>No two matching segments can be drawn from a number. For example, the following matchings are not allowed.</li>
</ol>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/7337/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-22%20%EC%98%A4%EC%A0%84%2010.38.11.png" style="height:63px; width:180px" /></p>

<p>Write a program to compute the maximum number of matching segments for the input data. Note that this number is always even.</p>

### 입력

<p>The first line of the file is the number M, which is the number of test cases (1 &le; M &le; 10). Each test case has three lines. The first line contains N<sub>1</sub> and N<sub>2</sub>, the number of integers on the first and the second row respectively. The next line contains N<sub>1</sub> integers which are the numbers on the first row. The third line contains N<sub>2</sub> integers which are the numbers on the second row. All numbers are positive integers less than 100.</p>

<p>&nbsp;</p>

### 출력

<p>Output file should have one separate line for each test case. The maximum number of matching segments for each test case should be written in one separate line.</p>
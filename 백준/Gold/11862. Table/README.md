# [Gold II] Table - 11862

[문제 링크](https://www.acmicpc.net/problem/11862)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 66, 정답: 25, 맞힌 사람: 25, 정답 비율: 42.373%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>Let N be a positive integer. Integers 1, 2, 3, ..., 2N are divided into three sets A, B and C. Write a program table, which calculates the number of ways to fill the table with two rows and N columns so that:</p>

<ul>
	<li>Each cell of the table contains a single integer;</li>
	<li>The integers of the set A should be written on the first row of the table;</li>
	<li>The integers of the set B should be written on the second row of the table;</li>
	<li>The integers of the set C can be written on any table row;</li>
	<li>The numbers in each row of the table should form an increasing sequence;</li>
	<li>The numbers in each column of the table should form an increasing sequence.</li>
</ul>

<p>For example, if N = 4 , A = {2, 3} , B = {4, 7, 8} and C = {1, 5, 6} , then there are exactly two tables of required type.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11862.%E2%80%85Table/faa38f61.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11862/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:61px; width:304px" /></p>

### 입력

<p>On the first row of the standard input is given the integer N (1 &lt; N &le; 35). On the second row are given M &ndash; the number of integers of the set A , and integers of the set A (0 &le; M &le; N). On the third row are given K &ndash; the number of integers of the set B, and integers of the set B (0 &le; K &le; N).&nbsp;</p>

### 출력

<p>The program should print on the standard output a single line holding the result.&nbsp;</p>
# [Gold IV] Median Weight Bead - 6747

[문제 링크](https://www.acmicpc.net/problem/6747)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 51, 정답: 30, 맞힌 사람: 29, 정답 비율: 64.444%

### 분류

그래프 이론, 그래프 탐색, 집합과 맵, 너비 우선 탐색, 최단 경로, 깊이 우선 탐색, 플로이드–워셜

### 문제 설명

<p>There are N beads which of the same shape and size, but with different weights. N is an odd number and the beads are labeled as 1, 2, ..., N. Your task is to find the bead whose weight is median (the ((N+1)/2)th among all beads). &nbsp;The following comparison has been performed on some pairs of beads:<br />
A scale is given to compare the weights of beads. We can determine which one is heavier than the other between two beads. As the result, we now know that some beads are heavier than others. We are going to remove some beads which cannot have the medium weight.&nbsp;</p>

<p>For example, the following results show which bead is heavier after M comparisons where M=4 and N=5.</p>

<ol>
	<li>Bead 2 is heavier than Bead 1.</li>
	<li>Bead 4 is heavier than Bead 3.</li>
	<li>Bead 5 is heavier than Bead 1.</li>
	<li>Bead 4 is heavier than Bead 2.</li>
</ol>

<p>From the above results, though we cannot determine exactly which is the median bead, we know that Bead 1 and Bead 4 can never have the median weight: Beads 2, 4, 5 are heavier than Bead 1, and Beads 1, 2, 3 are lighter than Bead 4. Therefore, we can remove these two beads.</p>

<p>Write a program to count the number of beads which cannot have the median weight.</p>

### 입력

<p>The first line of the input file contains a single integer t (1 &le; t &le; 11), the number of test cases, followed by the input data for each test case. The input for each test case will be as follows:<br />
The first line of input data contains an integer N (1&le;N&le;99) denoting the number of beads, and M denoting the number of pairs of beads compared. In each of the next M lines, two numbers are given where the first bead is heavier than the second bead.</p>

<p>&nbsp;</p>

### 출력

<p>There should be one line per test case. Print the number of beads which can never have the medium weight.<br />
&nbsp;</p>

<p>&nbsp;</p>
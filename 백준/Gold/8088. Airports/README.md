# [Gold III] Airports - 8088

[문제 링크](https://www.acmicpc.net/problem/8088)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 60, 정답: 30, 맞힌 사람: 23, 정답 비율: 45.098%

### 분류

그래프 이론, 그리디 알고리즘, 정렬, 해 구성하기

### 문제 설명

<p>There are n&nbsp;towns with their own airports in the country X. We know the maximal capacities of the airports &mdash; the airport in the town M<sub>i</sub>&nbsp;can have at most d<sub>i</sub>&nbsp;connections with other towns. The task is to design the net of air connections among the towns in such a way that the town M<sub>i</sub>&nbsp;has exactly d<sub>i</sub>&nbsp;connections with other towns. We assume that connections are two-way and that each pair of towns has at most one connection between them.</p>

<p>Write a program that:</p>

<ul>
	<li>reads the number of towns n&nbsp;and the numbers d<sub>i</sub>&nbsp;from the standard input,</li>
	<li>designs the net of air connections in such a way that for every i, 1 &le; i &le; n, the town M<sub>i</sub>&nbsp;has exactly d<sub>i</sub>&nbsp;connections with other towns,</li>
	<li>writes the list of all connections to the standard output.</li>
</ul>

<p>We assume that for the given data a solution exists. If there exists more than one solution the program should find only one. It can happen that there is no connection (even indirect) between a pair of cities.</p>

### 입력

<p>In the first line of the standard input there is written one integer n, 3 &le; n &le; 500, which is the number of towns. In the following n&nbsp;lines there are written positive integers d<sub>i</sub>&nbsp;(one integer in each line).</p>

### 출력

<p>Your program should write all the connections of the created net to the standard output. The description of each connection consists of two positive integers separated by a single space. These integers are the numbers of two connected towns. Each description should be placed in a separate line. The numbers of towns in a line can be written in an arbitrary order. Similarly, the order of connections is not important.</p>
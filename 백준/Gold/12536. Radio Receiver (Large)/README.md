# [Gold III] Radio Receiver (Large) - 12536

[문제 링크](https://www.acmicpc.net/problem/12536)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 87, 정답: 25, 맞힌 사람: 24, 정답 비율: 40.678%

### 분류

정렬, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>You have a radio receiver and want to receive&nbsp;<strong>N</strong>&nbsp;messages. Each message is transmitted at a predetermined time measured in seconds since the epoch. Also each message is transmitted from a predetermined position representing the displacement in meters from the origin (you are in 1-dimensional space). Your radio is capable of receiving any message that is transmitted no farther than&nbsp;<strong>D</strong>&nbsp;meters from your current position, where&nbsp;<strong>D</strong>is a nonnegative real number.</p>

<p>You can start at any position of your choice and move at the rate of at most one meter per second. The action of receiving a message itself takes no time. Your task is to find the smallest&nbsp;<strong>D</strong>&nbsp;that allows you to get all messages.</p>

### 입력

<p>The first line of input gives the number of test cases,&nbsp;<strong>C</strong>.&nbsp;<strong>C</strong>&nbsp;test cases follow. For each test case there will be:</p>

<ul>
	<li>One line containing the integer&nbsp;<strong>N</strong>, the number of messages.</li>
	<li><strong>N</strong>&nbsp;lines corresponding to the&nbsp;<strong>N</strong>&nbsp;messages where each of them contains 2 integers&nbsp;<strong>P</strong>&nbsp;and&nbsp;<strong>T</strong>&nbsp;separated by one space.&nbsp;<strong>P</strong>&nbsp;is the position where the message is transmitted from and&nbsp;<strong>T</strong>&nbsp;is the time when this message is transmitted (The messages will have distinct transmission times).</li>
</ul>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 100</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 1000</li>
	<li>0 &le;&nbsp;<strong>P</strong>&nbsp;&le; 10<sup>9</sup></li>
	<li>0 &le;&nbsp;<strong>T</strong>&nbsp;&le; 10<sup>9</sup></li>
</ul>

<div>&nbsp;</div>

<p>&nbsp;</p>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>x</strong>: &quot;, where&nbsp;<strong>x</strong>&nbsp;is the number of the test case, followed by the minimum value&nbsp;<strong>D</strong>&nbsp;that allows you to get all messages. Answers with a relative or absolute error of at most 10<sup>-9</sup>&nbsp;will be considered correct.</p>

### 힌트

<p>Here is one possible scenario with&nbsp;<strong>D</strong>&nbsp;= 6&nbsp;for test case #1. Start at position 13 and time 2 to get message 0. Then walk to the right to position 14, arriving at time 3 to get message 1. Then walk left to position 6, arriving at time 11 to get message 2.</p>
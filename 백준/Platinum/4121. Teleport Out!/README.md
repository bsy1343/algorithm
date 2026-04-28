# [Platinum V] Teleport Out! - 4121

[문제 링크](https://www.acmicpc.net/problem/4121)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 6, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

너비 우선 탐색, 이분 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>You are in a rectangular maze and you would like to leave the maze as quickly as possible. The maze is a rectangular grid of square locations. Some locations are blocked. Some other locations are exits. If you arrive at an exit location, you can immediately leave the maze.</p>

<p>You may walk one step at a time, onto one of the locations adjacent to your current location. Two locations are adjacent if they share a side. That is, you can only move one step North, South, East or West. Of course, you cannot step off the maze, and you cannot step onto a blocked location.</p>

<p>In addition, at any step, you may choose to use your teleport device. This device will send you to a random non-blocked location inside the maze with uniform probability (including, possibly, the one where you currently are standing!). If the device happens to send you onto a spot that is also an exit, then you leave the maze immediately. Hooray!</p>

<p>The only way to leave the maze is by moving onto an exit (either by teleport or walking), you may not walk off the boundary of the maze. Write a program to calculate the expected number of steps you need in order to leave the maze. Assume that you would choose your actions (movements and using teleport device) optimally in order to minimize the expected number of steps to leave the maze. Using the teleport device is considered one step.&nbsp;</p>

### 입력

<p>There will be multiple test cases. Each test case starts with a line containing two positive integers R and C (R &lt;= 200, C &lt;= 200). Then, the next R lines each contain C characters, representing the locations of the maze. The characters will be one of the following:</p>

<ul>
	<li>E: represents an exit, there will be at least one E in every maze.</li>
	<li>Y: represents your initial location, there will be exactly one Y in every maze.</li>
	<li>X: represents a blocked location.</li>
	<li>.: represents an empty space.</li>
</ul>

<p>You may move/teleport onto any location that is marked E, Y or ..</p>

<p>The end of input is marked by a line with two space-separated 0&rsquo;s.&nbsp;</p>

### 출력

<p>For each test case, print one line containing the minimum expected number of steps required to leave the maze, given that you make your choices optimally to minimize this value. Print your result to 3 decimal places. Do not print any blank lines between outputs.</p>
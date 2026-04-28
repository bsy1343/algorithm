# [Gold V] Cube IV (Small) - 12182

[문제 링크](https://www.acmicpc.net/problem/12182)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 71, 정답: 46, 맞힌 사람: 35, 정답 비율: 67.308%

### 분류

다이나믹 프로그래밍, 그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 깊이 우선 탐색, 백트래킹

### 문제 설명

<p>Vincenzo decides to make cube IV but only has the budget to make a square maze. Its a perfect maze, every room is in the form of a square and there are 4 doors (1 on each side of the room). There is a big number written in the room. A person can only move from one room to another if the number in the next room is larger than the number in his current room by 1. Now, Vincenzo assigns unique numbers to all the rooms (1, 2, 3, .... S<sup>2</sup>) and then places S<sup>2</sup>&nbsp;people in the maze, 1 in each room where S is the side length of the maze. The person who can move maximum number of times will win. Figure out who will emerge as the winner and the number of rooms he will be able to move.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case consists of&nbsp;<strong>S</strong>&nbsp;which is the side length of the square maze. Then S<sup>2</sup>&nbsp;numbers follow like a maze to give the numbers that have been assigned to the rooms.</p>

<pre>
1 2 9
5 3 8
4 6 7
</pre>

<ul>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: r d&quot;, where x is the test case number (starting from 1), r is the room number of the person who will win and d is the number of rooms he could move. In case there are multiple such people, the person who is in the smallest room will win.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>S</strong>&nbsp;&le; 10</li>
</ul>
# [Platinum V] ARTUR - 11589

[문제 링크](https://www.acmicpc.net/problem/11589)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 202, 정답: 50, 맞힌 사람: 38, 정답 비율: 21.714%

### 분류

그래프 이론, 기하학, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>You have most definitely heard the legend of King Arthur and the Knights of the Round Table. Almost all versions of this story proudly point out that the roundness of the Round Table is closely related to Arthur&rsquo;s belief of equality among the Knights. That is a lie! In fact, Arthur&rsquo;s choice of table is conditioned by his childhood traumas.</p>

<p>In fact, Arthur was forced to clean up quadratic tables from a young age after a tournament in pick-up sticks<sup>1</sup> had been played on them. After the tournament, typically there would be a bunch of sticks on the table that do not touch each other. In the spirit of the game, the organizers issued strict regulations for the table cleaners. More precisely, the sticks on the table need to be removed one by one in a way that the cleaners pull them in the shortest way towards the edge of the table closest to where they are currently sitting. They also mustn&rsquo;t rotate or touch the other sticks while doing this (not even in the edge points).</p>

<p>In this task, we will represent the table in the coordinate system with a square that has opposite points in the coordinates (0,0) and (10 000, 10 000), whereas the sticks will be represented with straight line segments that lie within that square. We will assume that Arthur is sitting at the edge of the table lying on the x-axis. Then the movement of the stick comes down to translating the line segment along the shortest path towards the x-axis until the stick falls off the table (as shown in the image). It is your task to help Arthur determine the order of stick movements that meets the requirements from the previous paragraph.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11589/1.png" style="height:336px; width:463px" /></p>

<p><sup>1</sup>A game that involves carefully moving sticks.</p>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 5 000), the number of sticks on the table. Each of the following N lines contains four integers x1, y1, x2, y2 (0 &le; x1, y1, x2, y2 &le; 10 000) that denote the edge points of a stick.</p>

### 출력

<p>The first and only line of output must contain space-separated stick labels in the order which they need to be taken off the table. A stick&rsquo;s label corresponds to its position in the input sequence.</p>

<p>If there are multiple possible solutions, output any of them.</p>

### 힌트

<p>Clarification of the first example: The example corresponds to the image from the task. Another possible solution is 2 1 4 3.</p>
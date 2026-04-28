# [Gold III] PRIPREME - 10612

[문제 링크](https://www.acmicpc.net/problem/10612)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 32 MB

### 통계

제출: 51, 정답: 39, 맞힌 사람: 35, 정답 비율: 83.333%

### 분류

그리디 알고리즘

### 문제 설명

<p>Ante and Goran are preparing N teams of young ambitious students for a student programming competition of students from University of Zagreb. Both of them have one algorithm they have to explain to each team. Of course, both can&rsquo;t work with the same team at the same time and none of them can work with multiple teams simultaneously.</p>

<p>You are given the time it takes for each team to understand and implement an algorithm. Each algorithm lecture has to be done without interruption. Determine the minimal time required for Ante and Goran to do their lectures!</p>

<p>For additional explanation, consult the sample tests clarifications.</p>

### 입력

<p>The first line of input contains the integer N, the number of teams.</p>

<p>The following line contains N space separated integers, where the ith integer denotes the time required for the ith team to understand and implement an algorithm.</p>

<p>All numbers in the input will belong to the interval [1, 3 &middot; 10<sup>5</sup>].</p>

### 출력

<p>The first and only line of output must contain the required number from the task.</p>

### 힌트

<p>Clarification of the first example: Each team needs 2 units of time to understand and implement an algorithm. One of the possible schedules is that Ante gives his lectures to team 1, team 2 and team 3, respectively, and Goran to team 3, team 1 and team 2, respectively.</p>

<p>Clarification of the second example: One of the optimal schedules is that Ante gives lectures to team 2, team 3 and team 1, respectively, but with a pause lasting 1 unit of time between team 3 and team 1. Goran will give lectures to team 1, team 3 and team 2, respectively</p>
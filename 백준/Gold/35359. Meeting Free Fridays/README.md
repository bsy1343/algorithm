# [Gold II] Meeting Free Fridays - 35359

[문제 링크](https://www.acmicpc.net/problem/35359)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 6, 정답: 4, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>It’s Friday! You can’t wait to enjoy all $t$ minutes of the day.</p>

<p>But as you look at your calendar, you see that you have $n$ meetings scheduled, each occupying a contiguous interval of time during the day. You would like to attend as many meetings as you can, but at the same time you don’t want to be stuck in meetings all day, so you decide that for at least $k$ minutes of the day, you must not be in a meeting.</p>

<p>What is the maximum number of meetings you can attend in full while ensuring that at least $k$ minutes of your day are meeting-free? You can only attend one meeting at a time, but you may attend a new meeting if it starts exactly when the previous one ends.</p>

### 입력

<p>The first line of input contains three integers $n$, $t$, and $k$ ($1 \leq n \leq 5\, 000$, $1 \leq k \leq t \leq 10^9$), where $n$ is the number of meetings, $t$ is the number of minutes in the day, and $k$ is the number of minutes you want to be meeting-free. Each of the next $n$ lines contains two integers $s$ and $e$ ($0 \leq s &lt; e \leq t$), describing the start and end times of a meeting. The times are given in minutes since the beginning of the day.</p>

### 출력

<p>Output a single integer, the maximum number of meetings you can attend while ensuring that at least $k$ minutes of the day are meeting-free.</p>
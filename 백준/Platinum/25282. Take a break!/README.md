# [Platinum V] Take a break! - 25282

[문제 링크](https://www.acmicpc.net/problem/25282)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 187, 정답: 74, 맞힌 사람: 46, 정답 비율: 43.396%

### 분류

그리디 알고리즘, 정렬, 누적 합

### 문제 설명

<p>Some call you lazy, others (yourself included) call you a break optimizer.</p>

<p>You have been tasked with a large number of chores around your house. The tasks vary greatly in difficulty---some literally only take a second, like putting a fork the dishwasher; others require a lot more effort, like cleaning the drain.</p>

<p>Each task has a <em>difficulty</em>, which is the number of seconds it takes you to complete the task when you are fully rested. Whenever you complete a task and directly start another, its completion time doubles. Formally, completing a task with difficulty $d$ after $i$ tasks before it, without any intervening breaks, takes $ d \cdot 2^i $ seconds.</p>

<p>However, whenever you take a solid break of at least one hour, you become fully rested. (Shorter breaks don&rsquo;t do anything for you.)</p>

<p>For instance, here are two (suboptimal) ways of scheduling the four tasks in sample $3$:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/2b1a98a4-acf0-4ab8-9bbe-5a8c413ba5de/-/preview/" style="width: 512px; height: 168px;" /></p>

<p>In both schedules, task 3 takes $2^2\cdot 1000=4000$ seconds.</p>

<p>You have to complete all tasks, in any order. You begin fully rested. What is the shortest time to complete all tasks, including breaks?</p>

### 입력

<p>The first line contains the number $1 \leq n \leq 100\,000$ of tasks to complete. The second line consists of $n$ integers $d_1, \ldots , d_n$, the difficulty of each task in seconds, where $1 \leq d_i \leq 28\,800$.</p>

### 출력

<p>Output a single integer, the minimal time in seconds it takes for you to complete all tasks, including your breaks.</p>
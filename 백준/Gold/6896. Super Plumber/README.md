# [Gold III] Super Plumber - 6896

[문제 링크](https://www.acmicpc.net/problem/6896)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 5, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You are to write a program to play a video game in which Super Plumber (SP) navigates an obstacle course collecting prizes on the way to rescuing The Princess (TP).</p>

<p>The obstacle course is an $m$ by $n$ grid. SP starts at the bottom-left corner and makes his way to TP in the bottom-right corner. Some of the grid locations are occupied by obstacles through which SP cannot pass. Others are occupied by gold coins valued between $1.00 and $9.00.</p>

<p>The game is a traditional scroll game, which means that SP can move only to the right, up, or down. SP moves one grid location at a time, always to an adjacent location with no obstacle. He cannot occupy any location which he previously occupied - if he moves up, he cannot move down until he moves right; if he moves down he cannot move up until he moves right. SP collects the gold coins at locations he visits. You are to find the maximum possible total value of coins that SP can collect while rescuing TP.</p>

### 입력

<p>Input has several test cases. The first line of each test case contains $m$ and $n$, both integers not less than $2$ or greater than $100$. The grid is then given as $m$ lines with $n$ characters each. An obstacle is denoted by an asterisk (<code>*</code>); a coin is denoted by a digit (<code>1</code> through <code>9</code>); an empty location is denoted by a period (<code>.</code>).</p>

<p>It is always possible for SP to rescue TP. A line containing <code>0 0</code> follows the last test case.</p>

### 출력

<p>Output one line for each test case giving the amount of money that SP can collect. The sample input below contains two test cases. For the first case, SP can collect \$27.00 with the following sequence of moves: <em>Up</em>, <em>Right</em>, <em>Down</em>, <em>Right</em>, <em>Right</em>, <em>Right</em>, <em>Right</em>, <em>Up</em>, <em>Right</em>, <em>Right</em>, <em>Down</em>, <em>Right</em>, <em>Right</em>. For the second case, SP can collect \$34.00 with the following sequence: <em>Up</em>, <em>Right</em>, <em>Down</em>.</p>
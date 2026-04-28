# [Silver IV] Rock, Scissors, Paper - 4340

[문제 링크](https://www.acmicpc.net/problem/4340)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 134, 정답: 77, 맞힌 사람: 42, 정답 비율: 54.545%

### 분류

구현, 그래프 이론, 시뮬레이션, 격자 그래프

### 문제 설명

<p>Bart&#39;s sister Lisa has created a new civilization on a two-dimensional grid. At the outset each grid location may be occupied by one of three life forms: Rocks, Scissors, or Papers. Each day, differing life forms occupying horizontally or vertically adjacent grid locations wage war. In each war, Rocks always defeat Scissors, Scissors always defeat Papers, and Papers always defeat Rocks. At the end of the day, the victor expands its territory to include the loser&#39;s grid position. The loser vacates the position.</p>

<p>Your job is to determine the territory occupied by each life form after n days.</p>

### 입력

<p>The first line of input contains t, the number of test cases. Each test case begins with three integers not greater than 100: r and c, the number of rows and columns in the grid, and n. The grid is represented by the r lines that follow, each with c characters. Each character in the grid is R, S, or P, indicating that it is occupied by Rocks, Scissors, or Papers respectively.</p>

### 출력

<p>For each test case, print the grid as it appears at the end of the nth day. Leave an empty line between the output for successive test cases.</p>
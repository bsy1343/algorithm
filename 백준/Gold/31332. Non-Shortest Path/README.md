# [Gold IV] Non-Shortest Path - 31332

[문제 링크](https://www.acmicpc.net/problem/31332)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 12, 맞힌 사람: 11, 정답 비율: 42.308%

### 분류

애드 혹, 백트래킹, 브루트포스 알고리즘

### 문제 설명

<p><em>In this problem, you have to travel from one corner of a checkered $4 \times 4$ field to the opposite corner using any simple path which is not the shortest one.</em></p>

<p>There is a checkered field on a plane consisting of $4 \times 4$ cells. Each cell of the field is either empty or fully occupied by a wall.</p>

<p>Robot Aurelius is passing a test to measure the intelligence level by solving various problems on that field. He has already completed the parts which involved searching for an arbitrary path and the shortest path between a pair of cells.</p>

<p>The next task requires Aurelius to walk from the upper left corner of the field to the lower right corner by moving through empty cells. A single step consists in moving from the current cell to any other cell which shares a side with the current one. The path must be simple, that is, for each cell, the robot can not visit that cell more than once. Additionally, the length of the path must be strictly greater than the length of the shortest path between the corners on the given field. The length of the path is the number of steps on that path.</p>

<p>Write a program that will help robot Aurelius accomplish the task.</p>

### 입력

<p>The input contains one or more test cases. Each test case is given on four lines. Each of these lines describes one row of the field and contains exactly four characters defining the cells of that row. An empty cell is denoted by character &quot;<code>.</code>&quot; (dot, ASCII code 46), and a wall is denoted by character &quot;<code>#</code>&quot; (hash, ASCII code 35). Consecutive test cases are separated by a line consisting of four characters &quot;<code>-</code>&quot; (dash, ASCII code 45).</p>

<p>It is guaranteed that the upper left cell and the lower right cell are empty. Additionally, it is guaranteed that all test cases in a single input are distinct.</p>

### 출력

<p>For each test case, print a line defining the required path. The line must consist of characters corresponding to the commands for moving to an adjacent cell in the order of their execution: &quot;<code>D</code>&quot; to move down, &quot;<code>U</code>&quot; to move up, &quot;<code>L</code>&quot; to move left, and &quot;<code>R</code>&quot; to move right. If there are several possible paths, print any one of them. If there is no path with the required properties, print the number &quot;<code>-1</code>&quot; instead of the path.</p>

### 힌트

<p>The example contains three test cases.</p>

<p>In the first test case, the length of the shortest path is six steps: the only shortest path is &quot;<code>DRRRDD</code>&quot;. Other than that, there are three simple paths which are not the shortest: these are the paths &quot;<code>DDRURRDD</code>&quot; and &quot;<code>DRRURDDD</code>&quot; of length $8$, and the path &quot;<code>DDRURURDDD</code>&quot; of length $10$. Any of them can be printed.</p>

<p>In the second test case, there are eight possible simple paths, but they all have the same length, and thus all are the shortest paths.</p>

<p>In the third test case, there is no path from the upper left corner of the field to the lower right one consisting of empty cells.</p>
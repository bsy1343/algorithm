# [Gold III] Segments - 6885

[문제 링크](https://www.acmicpc.net/problem/6885)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 30, 정답: 22, 맞힌 사람: 22, 정답 비율: 73.333%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You are to find the length of the shortest path from the top to the bottom of a grid covering specified points along the way.</p>

<p>More precisely, you are given an n by n grid, rows 1..n and columns 1..n (1 &le; n &le; 20000). On each row i, two points L(i) and R(i) are given where 1 &le; L(i) &le; R(i) &le; n. You are to find the shortest distance from position (1, 1), to (n, n) that visits all of the given segments in order. In particular, for each row i, all the points</p>

<p style="text-align: center;">(i,L(i)),(i,L(i) + 1),(i,L(i) + 2), ...,(i, R(i)),</p>

<p>must be visited. Notice that one step is taken when dropping down between consecutive rows. Note that you can only move left, right and down (you cannot move up a level). On finishing the segment on row n, you are to go to position (n, n), if not already there. The total distance covered is then reported.</p>

### 입력

<p>The first line of input consists of an integer n, the number of rows/columns on the grid. On each of the next n lines, there are two integers L(i) followed by R(i) (where 1 &le; L(i) &le; R(i) &le; n).</p>

### 출력

<p>The output is one integer, which is the length of the (shortest) path from (1, 1) to (n, n) which covers all intervals L(i), R(i).</p>
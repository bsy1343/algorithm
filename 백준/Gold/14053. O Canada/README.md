# [Gold III] O Canada - 14053

[문제 링크](https://www.acmicpc.net/problem/14053)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 12, 맞힌 사람: 10, 정답 비율: 62.500%

### 분류

수학

### 문제 설명

<p>In this problem, a grid is an N-by-N array of cells, where each cell is either red or white.</p>

<p>Some grids are similarto other grids. Grid A is similar to grid B if and only if A can be transformed into B by some sequence of changes. A change consists of selecting a 2-by-2 square in the grid and flipping the colour of every cell in the square. (Red cells in the square will become white; white cells in the square will become red.)</p>

<p>You are given G grids. Count the number of pairs of grids which are similar. (Formally, number the grids from 1 to G, then count the number of tuples (i, j) such that 1 &le; i &lt; j &le; G and grid i is similar to grid j.)</p>

### 입력

<p>The first line of input contains N (2 &le; N &le; 10), the size of the grids. The second line contains G (2 &le; G &le; 10000), the number of grids. The input then consists of N &middot; G lines, where each line contains N characters, where each character is either R or W, indicating the colour (red or white) for that element in the grid. Moreover, after the first two lines of input, the next N lines describe the first grid, the following N lines describe the second grid, and so on.</p>

### 출력

<p>Output the number of pairs of grids which are similar.</p>
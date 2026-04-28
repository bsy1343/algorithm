# [Gold II] King Slime - 22591

[문제 링크](https://www.acmicpc.net/problem/22591)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 10, 맞힌 사람: 9, 정답 비율: 81.818%

### 분류

자료 구조, 그리디 알고리즘, 분리 집합

### 문제 설명

<p>There is a grid of size W &times; H surrounded by walls. Some cells in the grid are occupied by slimes. The slimes want to unite with each other and become a &ldquo;King Slime&rdquo;.</p>

<p>In each move, a slime can move to east, west, south and north direction until it enters a cell occupied by another slime or hit the surrounding wall. If two slimes come together, they unite and become a new slime.</p>

<p>Your task is write a program which calculates the minimum number of moves that all the slimes unite and become a King Slime. Suppose slimes move one by one and they never move simultaneously</p>

### 입력

<p>The first line contains three integers N (2 &le; N &le; 40, 000), W and H (1 &le; W, H &le; 100, 000), which denote the number of slimes, the width and the height of the grid respectively.</p>

<p>The following N lines describe the initial coordinates of the slimes. The i-th line contains two integers x<sub>i</sub> (1 &le; x<sub>i</sub> &le; W) and y<sub>i</sub> (1 &le; y<sub>i</sub> &le; H), which indicate the coordinates of the i-th slime . All the coordinates are 1-based.</p>

<p>You may assume that each cell is occupied by at most one slime initially.</p>

### 출력

<p>Output the minimum number of moves that all the slimes unite and become a King Slime.</p>
# [Platinum III] Three-way Branch - 11704

[문제 링크](https://www.acmicpc.net/problem/11704)

### 성능 요약

시간 제한: 7 초, 메모리 제한: 64 MB

### 통계

제출: 21, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

수학, 다이나믹 프로그래밍, 분할 정복을 이용한 거듭제곱

### 문제 설명

<p>There is a grid that consists of W &times; H cells. The upper-left-most cell is (1, 1). You are standing on the cell of (1, 1) and you are going to move to cell of (W, H). You can only move to adjacent lower-left, lower or lower-right cells.</p>

<p>There are obstructions on several cells. You can not move to it. You cannot move out the grid, either. Write a program that outputs the number of ways to reach (W, H) modulo 1,000,000,009. You can assume that there is no obstruction at (1, 1).</p>

### 입력

<p>The first line contains three integers, the width W, the height H, and the number of obstructions N. (1 &le; W &le; 75, 2 &le; H &le; 10<sup>18</sup>, 0 &le; N &le; 30) Each of following N lines contains 2 integers, denoting the position of an obstruction (x<sub>i</sub>, y<sub>i</sub>).</p>

<p>The last test case is followed by a line containing three zeros.</p>

### 출력

<p>For each test case, print its case number and the number of ways to reach (W, H) modulo 1,000,000,009.</p>
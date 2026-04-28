# [Gold I] Character Grid - 23105

[문제 링크](https://www.acmicpc.net/problem/23105)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 70, 정답: 42, 맞힌 사람: 32, 정답 비율: 65.306%

### 분류

애드 혹, 해 구성하기, 백트래킹

### 문제 설명

<p>This is an output-only problem.</p>

<p>Your task is to build a square grid with side length $N \ge 13$ and fill it with lowercase English letters such that the following property is held.</p>

<p>Let us denote the character at $i$-th row and $j$-th column as $c_{i,j}$.</p>

<p>Consider $N^2 \cdot (N-1) / 2$ strings of the form $A_{i,j,p} = c_{i,j} c_{i,j+1} \ldots c_{i,j+p}$ for every $1 \le i \le N$ and every $1 \le j, p \le N-1$ such that $j + p \le N$.</p>

<p>Consider also $N^2 \cdot (N-1) / 2$ strings of the form $B_{i,j,p} = c_{i,j} c_{i+1,j} \ldots c_{i+p,j}$ for every $1 \le j \le N$ and every $1 \le i, p \le N-1$ such that $i + p \le N$.&nbsp;</p>

<p>All those $N^2 \cdot (N-1)$ strings have to be pairwise distinct.</p>

### 입력

<p>There is no input.</p>

### 출력

<p>Print the answer in the following format: first print the $N$ ($13 \le N \le 100$). Then print the square grid as $N$ lines; $i$-th line shall contain one string of $N$ characters, representing the $i$-th row of the grid.</p>

<p>If there are several correct solutions, any one of them will be accepted.</p>

### 힌트

<p>For the answer from the sample, the grid property is held, but the grid size is too small to be accepted as a solution.</p>
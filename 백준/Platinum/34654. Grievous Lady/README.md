# [Platinum IV] Grievous Lady - 34654

[문제 링크](https://www.acmicpc.net/problem/34654)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 181, 정답: 59, 맞힌 사람: 54, 정답 비율: 40.299%

### 분류

그리디 알고리즘, 백트래킹, 해 구성하기

### 문제 설명

<p>You are given a grid of size $N \times M$. Your task is to color each cell of the grid with one of four colors: $1$, $2$, $3$, or $4$.</p>

<p>There is only one rule: any two adjacent cells must have different colors. Two cells are considered adjacent if they share a common edge.</p>

<p>Some cells in the grid may already be colored. These pre-colored cells are located only on the border of the grid. You must color all the remaining empty cells to create a complete grid that satisfies the rule.</p>

### 입력

<p>The first line of the input contains a single integer $T$, the number of test cases.</p>

<p>The first line of each test case contains two integers $N$ and $M$.</p>

<p>The next $N$ lines describe the initial state of the grid. Each line contains $M$ space-separated integers. A value of $0$ represents an empty cell, while values from $1$ to $4$ represent a cell colored with that specific color.</p>

### 출력

<p>For each test case, output $N$ lines representing the completed grid.</p>

<p>Each line should contain $M$ space-separated integers, where each integer is a color from $1$ to $4$.</p>

<p>If multiple solutions exist, you may print any one of them.</p>

### 제한

<ul>
<li>$1 \le T \le 8\,000$</li>
<li>$5 \le N, M \le 2 \cdot 10^5$</li>
<li>The sum of $N \times M$ over all test cases does not exceed $2 \cdot 10^5$.</li>
<li>In the initial grid, any non-zero cells are located only on the border (the first or last row, or the first or last column)</li>
<li>It is guaranteed that a solution always exists for the given input.</li>
</ul>
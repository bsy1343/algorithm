# [Platinum II] Eight-Connected Figures - 35022

[문제 링크](https://www.acmicpc.net/problem/35022)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 11, 정답: 4, 맞힌 사람: 4, 정답 비율: 50.000%

### 분류

(분류 없음)

### 문제 설명

<p><em>This is an interactive problem.</em></p>

<p>An infinite square grid is hidden from you. Every cell is identified by a pair of integers $(x, y)$ and is <strong>randomly</strong> colored either black or white with $50\%$ probability for each color, independently of other cells.</p>

<p>Two cells are considered <em>adjacent</em> if they share an edge or a corner. Thus, every cell $(x, y)$ has $8$ adjacent cells: $(x-1, y-1)$, $(x-1, y)$, $(x-1, y+1)$, $(x, y-1)$, $(x, y+1)$, $(x+1, y-1)$, $(x+1, y)$, and $(x+1, y+1)$.</p>

<p>A set of cells $S$ is called <em>8-connected</em> if for any two cells in $S$, there exists a path between them using only cells from $S$, where consecutive cells in the path are adjacent.</p>

<p>In one query, you can learn the color of any cell on the grid. Your task is to find an 8-connected set of $n$ cells such that all cells in the set have the same color.</p>

<p>You need to solve $t$ test cases. In each test case, the grid is colored randomly and independently of the other test cases.</p>

<p>You are allowed to make at most $30\,000$ queries <strong>in total</strong> over all test cases.</p>

### 입력

<p>The first line contains two integers $t$ and $n$, denoting the number of test cases and the required size of the 8-connected set ($1 \le t \le 50$; $2 \le n \le 300$).</p>

### 출력



### 힌트

<p>In the example, the queries and the responses are separated by empty lines for clarity. In the actual interaction between your program and the interactor, there will be no empty lines.</p>

<p>Your solution will be evaluated on at most $60$ test files.</p>
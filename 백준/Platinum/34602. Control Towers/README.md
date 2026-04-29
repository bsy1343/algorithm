# [Platinum IV] Control Towers - 34602

[문제 링크](https://www.acmicpc.net/problem/34602)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 37, 정답: 30, 맞힌 사람: 29, 정답 비율: 80.556%

### 분류

누적 합, 수학, 조합론

### 문제 설명

<p>You are an architect tasked with designing the new airport in your city. After you have completed your design, you just realize you forgot to allocate spaces for the control towers.</p>

<p>The layout of the new airport can be represented by a 2D grid of $r$ rows and $c$ columns, with the rows numbered from $1$ to $r$ (top to bottom) and the columns numbered from $1$ to $c$ (left to right). The cell in row $i$ and column $j$ is denoted by $(i, j)$. Each cell can either be occupied or empty.</p>

<p>You need to place four control towers (numbered from $1$ to $4$), each in a different empty cell. To allow easier communication between different towers, for all $k = 1, 2, 3$, you want tower $k$ and tower $k + 1$ to be placed either in the same row or in the same column.</p>

<p>You want to calculate the number of ways to place the control towers to satisfy the requirements above. Two ways are considered different if there exists $k$ where control tower $k$ is placed in different cells.</p>

### 입력

<p>The first line of input contains two integers $r$ and $c$ ($1 ≤ r, c ≤ 2000$). Each of the next $r$ lines contains a string of $c$ characters. The $j$-th character in the $i$-th line is <code>#</code> if cell $(i, j)$ is occupied; otherwise, it is <code>.</code> (dot).</p>

### 출력

<p>Output the number of ways to place the control towers to satisfy the requirements above.</p>
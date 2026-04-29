# [Platinum IV] Rectangular Pool - 35139

[문제 링크](https://www.acmicpc.net/problem/35139)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

구현

### 문제 설명

<p>You are the owner of a land that can be represented as a grid $G$ of size $N \times M$, with rows numbered from $1$ to $N$, and columns numbered from $1$ to $M$. Define $G_{i, j}$ as the cell of the grid on the row $i$ and column $j$. Each cell of $G$ has either of the following terrains: puddle represented as <code>.</code> and dirt represented as <code>#</code>. A connected component of puddles are defined as a <strong>pool</strong>. A connected component is a set of cells such that any two cells in the set are connected by traversing between cells that share a side.</p>

<p>Your land is very bizarre that, for the next $Q$ days, exactly one cell will change its type. Formally, suppose cell at row $R$ and column $C$ change its type. If the cell $G_{R, C}$ is a puddle, it will transform into dirt; if the cell is dirt, it will transform into a puddle.</p>

<p>You have an abnormal obsession to rectangles, so you will get sick if a pool is not rectangular. A rectangular pool is defined as follows: let $r_{min}$, $r_{max}$, $c_{min}$, and $c_{max}$ as the minimum row number, maximum row number, minimum column number, and maximum column number of all puddles in the pool respectively, then there are exactly $(r_{max} - r_{min} + 1) \times (c_{max} - c_{min} + 1)$ puddles in the pool.</p>

<p>At the end of each day, determine if there exists any non-rectangular pool in your land!</p>

### 입력

<p>The first line contains two integers $N$ and $M$ ($1 \le N \le M \le 1000$). Each of the next $N$ lines contains $M$ characters of either <code>.</code> or <code>#</code>, where the character at $i$-th row and $j$-th column represents the type of cell $G_{i, j}$.</p>

<p>The next line contains an integer $Q$ ($1 \le Q \le 300\,000$). Each of the next $Q$ lines contains two integers $R$ and $C$ ($1 \le R \le N$; $1 \le C \le M$) meaning that the cell $G_{R, C}$ change its type.</p>

### 출력

<p>Output $Q$ lines representing the existence of non-rectangle pool at the end of each day. Each of the lines contains either <code>RECTANGLES</code> if all pools are rectangular, or <code>NO</code> if there exists a non-rectangular pool.</p>

### 힌트

<p><em>Explanation of Sample 1:</em> The following are the states of the land after each day:</p>

<pre>#...#   #.#.#   #.#.#
#...#   #...#   #.#.#
#####   #####   #####
#.#.#   #.#.#   #.#.#
#####   #####   #####</pre>

<p>After the first day, all three pools are rectangular pools. After the second day, the pool formed by cells $(1, 2)$, $(1, 4)$, $(2, 2)$, $(2, 3)$, $(2, 4)$ is not rectangular. All pools are rectangular again after the third day.</p>
# [Platinum V] Snake Move - 33433

[문제 링크](https://www.acmicpc.net/problem/33433)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 10, 정답: 5, 맞힌 사람: 5, 정답 비율: 50.000%

### 분류

0-1 너비 우선 탐색, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 데이크스트라, 최단 경로

### 문제 설명

<p>Putata is playing a famous snake game on his laptop, where a snake moves around on a grid of size $n \times m$. There may be obstacles in some cells of the grid. The snake can be represented as a sequence of coordinate pairs that determine where its body is located: $(x_1, y_1), (x_2, y_2), \ldots, (x_k, y_k)$. Here, $k$ denotes the length of the snake. The head of the snake is at $(x_1, y_1)$, the tail is at $(x_k, y_k)$, and neighboring parts of the body are located in cells that share a side.</p>

<p>In this game, the snake is programmed with a series of commands represented as a string. There are 5 types of commands that you can use:</p>

<ul>
	<li>'<code>L</code>': Command the snake to move one step left. The head will then move to $(x_1, y_1 - 1)$.</li>
	<li>'<code>R</code>': Command the snake to move one step right. The head will then move to $(x_1, y_1 + 1)$.</li>
	<li>'<code>U</code>': Command the snake to move one step up. The head will then move to $(x_1 - 1, y_1)$.</li>
	<li>'<code>D</code>': Command the snake to move one step down. The head will then move to $(x_1 + 1, y_1)$.</li>
	<li>'<code>S</code>': Shorten the length of the snake by one. The tail of the body will be erased. The length will become $k - 1$. Note that you can not do this when $k = 1$.</li>
</ul>

<p>When the head moves, each part of the body also moves accordingly. Specifically, the $i$-th part of the body ($2 \leq i \leq k$) moves to the position where the $(i - 1)$-st part was before the command. The snake can not move into a cell with an obstacle, and can not move outside the grid. Besides, the snake cannot collide with itself. So you should guarantee that no two parts of the body will share the same location.</p>

<p>Consider the following corner case: The head is at $(x_1, y_1)$, and the tail is at $(x_k, y_k)$. If the head is moving to $(x_1', y_1')$, then it is <strong>allowed</strong> to move to $(x_1', y_1') = (x_k, y_k)$: if we think about a real-world scenario, the head moves into the cell just as the tail moves out. In a similar fashion, it is <strong>allowed</strong> to swap the head and the tail by using a single command when $k = 2$.</p>

<p>You will be given the map of the grid and the body sequence of the snake. Let $f(i, j)$ denote the minimum number of commands that Putata needs to use such that the head of the snake will arrive at $(i, j)$, or $0$ if it is impossible. You have to calculate:</p>

<p>$$\left(\sum_{i = 1}^n\sum_{j = 1}^m f(i, j)^2\right) \bmod 2^{64}\text{.}$$</p>

### 입력

<p>The first line of the input contains three integers $n$, $m$ and $k$ ($1 \leq n, m \leq 3000$, $1 \leq k \leq \min\{nm, 10^5\}$) denoting the size of the grid and the length of the snake.</p>

<p>In the next $k$ lines, the $i$-th line contains two integers $x_i$ and $y_i$ ($1 \leq x_i \leq n$, $1 \leq y_i \leq m$, $|x_i - x_{i+1}| + |y_i - y_{i+1}| = 1$) denoting the location of the $i$-th part of the body. It is guaranteed that all the $k$ pairs $(x_i, y_i)$ are pairwise distinct. It is also guaranteed that each part is in a cell without an obstacle.</p>

<p>In the next $n$ lines, the $i$-th line contains a string of length $m$. If cell $(i, j)$ is empty, the $j$-th character in the $i$-th of these lines is '<code>.</code>'. If cell $(i, j)$ is occupied by an obstacle, the character is '<code>#</code>'.</p>

### 출력

<p>Print a single line containing an integer: the answer to the problem.</p>
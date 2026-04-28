# [Platinum IV] Toy - 32043

[문제 링크](https://www.acmicpc.net/problem/32043)

### 성능 요약

시간 제한: 1.35 초, 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 24, 맞힌 사람: 23, 정답 비율: 54.762%

### 분류

너비 우선 탐색, 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색

### 문제 설명

<p>For creating a task for CEOI 2024, Ben was given a toy as a present from the scientific committee. The toy is a puzzle which can be imagined as a $H \times W$ grid containing a metal object consisting of two parts: A horizontal $1\times K$ part and a vertical $L \times 1$ part, which are loosely attached to each other. Neither of the parts can be rotated in any way, but each can be slid vertically or horizontally independently of the other one, as long as they always overlap on exactly one square.</p>

<p>Furthermore, the grid contains several obstacles. No part of the metal object can move through an obstacle. Worse yet, the parts also cannot move outside the grid, not even partially. Ben&#39;s task is to move the metal object from a designated starting location to a (possibly) different location so that both parts overlap on a designated target square.</p>

<p>However, Ben has been playing with the toy for a while and he has not yet been able to solve the task. In fact, he has gained a suspicion that the organizers have played a prank on him and have given him an unsolvable puzzle. He thus asks for your help by telling him whether the puzzle is solvable or not.</p>

### 입력

<p>The first line of the input contains four space-separated integers $W$, $H$, $K$ and $L$ &mdash; the width and the height of the puzzle, the width of the horizontal part and the height of the vertical part, respectively. The second line contains four integers $x_h$, $y_h$, $x_v$ and $y_v$ &mdash; the coordinates of the leftmost square occupied by the horizontal part and the coordinates of the topmost square occupied by the vertical part.</p>

<p>The rows are numbered from $0$ to $H-1$ from top to bottom and columns are numbered $0$ to $W-1$ from left to right. The $x$ coordinate denotes the column number and $y$ coordinate denotes the row number.</p>

<p>The next $H$ lines contain $W$ characters each, representing the grid. The character <code>.</code> represents an empty square, the character <code>X</code> represents an obstacle and the character <code>*</code>represents the target square.</p>

<p>It is guaranteed that the initial position of the metal object is valid, i.e., that the two parts overlap on exactly one square and the two parts neither overlap with an obstacle nor stick out from the grid.</p>

<p>There is a single target square, i.e., a single occurrence of the <code>*</code>symbol in the toy, which might overlap with the initial position of the metal object.</p>

### 출력

<p>Print a single line containing <code>YES</code> if it is possible to move the metal object to the target square, <code>NO</code> otherwise.</p>

### 제한

<ul>
	<li>$2 \leq W, H \leq 1\,500$</li>
	<li>$2 \leq K \leq W$, $2 \leq L \leq H$</li>
	<li>$0 \leq x_h \leq W - K$, $0 \leq y_h \leq H - 1$</li>
	<li>$0 \leq x_v \leq W - 1$, $0 \leq y_v \leq H - L$</li>
</ul>
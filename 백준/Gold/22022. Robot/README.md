# [Gold II] Robot - 22022

[문제 링크](https://www.acmicpc.net/problem/22022)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 18, 맞힌 사람: 18, 정답 비율: 37.500%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>There is a robot which is placed on a field modeled as a $n&nbsp;\times m$ grid. Some of these grid cells are walls.</p>

<p>The robot accepts 4 types of instructions: <code>up</code>, <code>down</code>, <code>left</code>, <code>right</code>.</p>

<p>Suppose the robot is currently at the coordinate $(x, y)$. Then the effect of executing the instructions will be as follows:</p>

<ul>
	<li><code>up</code> : If $x = 0$ or $(x - 1, y)$ is a wall, the robot does not move. Else, the robot moves to $(x - 1, y)$</li>
	<li><code>down</code> : If $x = n - 1$ or $(x + 1, y)$ is a wall, the robot does not move. Else, the robot moves to $(x + 1, y)$</li>
	<li><code>left</code> : If $y = 0$ or $(x, y - 1)$ is a wall, the robot does not move. Else the robot moves to $(x, y - 1)$</li>
	<li><code>right</code>: If $y = m - 1$ or $(x, y + 1)$ is a wall, the robot does not move. Else the robot moves to $(x, y + 1)$.</li>
</ul>

<p>You know that the starting position of the robot is either $(a, b)$ or $(c, d)$. Find a sequence of at most q instructions such that the robot always ends up at $(0, 0)$ when the robot starts from either $(a, b)$ or $(c, d)$. It can be proven that there exists a solution for all inputs satisfying the problem constraint.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$1 \le&nbsp;n \le 10$</li>
	<li>$1 \le m \le 10$</li>
	<li>$0 \le a \le n -&nbsp;1$</li>
	<li>$0 \le b \le m - 1$</li>
	<li>$0 \le c \le n - 1$</li>
	<li>$0 \le d \le m - 1$</li>
	<li>$g[0][0] = g[a][b] = g[c][d] = 0$</li>
	<li>There exists a finite sequence of instructions to move the robot from $(a, b)$ to $(0, 0)$</li>
	<li>There exists a finite sequence of instructions to move the robot from $(c, d)$ to $(0, 0)$</li>
	<li>$q = 700$</li>
</ul>
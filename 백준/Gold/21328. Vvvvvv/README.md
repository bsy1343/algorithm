# [Gold II] Vvvvvv - 21328

[문제 링크](https://www.acmicpc.net/problem/21328)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 7, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>Platform games is an old video game genre, where you move across platforms hanging in the air. Vvvvvv is a platform game where you cannot jump, but instead are able to switch between regular gravity, which causes you to fall downwards, and anti-gravity, which causes you to fall upwards. There are only three buttons in the game: the gravitational switch (G), the go-left-button (V) and the go-right-button (H).</p>

<p>Your task is to find a sequence of button presses which takes you through a maze-like level with platforms and walls, from a given start position to a given final position. In order to receive full points, the sequence needs to be as short as possible.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/a23f33b5-fd9c-4120-9351-7b6cf78166d9/-/preview/" style="width: 512px; height: 469px;" /></p>

<p style="text-align: center;">Figure 1:&nbsp;The path given by the button presses given in the second sample.</p>

### 입력

<p>The first line of the input consists of three integers $W$, $H$, and $N$: the width of the level, the height of the level, and the number of line segments. Thereafter follows $N$ lines, each with four integers $x_1$, $y_1$, $x_2$, $y_2$, where $0 \le x_1, x_2 \le W$ and $0 \le y_1, y_2 \le H$. Each of these lines describe a line segments with end points $(x_1, y_1)$ and $(x_2, y_2)$. Every line segment is either horizontal or vertical, i.e. either $y_1=y_2$ or $x_1=x_2$ holds. The integer coordinate system can be said to divide the rectangular level into a grid, where the button V takes you one square to the left and H takes you one square to the right. If you are not standing on a platform after the movement you will fall (upwards or downwards) until you reach another platform. It is not possible to move to the left or right while falling. If you fall or walk out of the level, you lose the game. This also happens if you try to walk through a wall.</p>

<p>The start position is the lower left square, closest to the point (0, 0), with downwards gravity. The final position is the square in the upper right corner, closest to the point (W, H). There will always be a line segment under the start position and above the final position.</p>

### 출력

<p>If there is a solution, the program should print a string containing a letter for each button press (chosen from G, V and H). The sequence should take you from the start position to the final position, and has to be shorter than $10000$ characters. You can arrive to the ending position with gravity in either direction, but you need to have stopped falling (see the third example below).</p>

<p>If there is no solution, the program should print the string <code>&quot;Inte&quot;</code> (without the quotation marks).</p>

### 제한

<ul>
	<li>$W,H \le 100$</li>
	<li>$N \le 5000$</li>
	<li>The sequence needs to be as short as possible.</li>
</ul>
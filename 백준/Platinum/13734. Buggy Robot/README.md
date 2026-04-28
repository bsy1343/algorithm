# [Platinum IV] Buggy Robot - 13734

[문제 링크](https://www.acmicpc.net/problem/13734)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 150, 정답: 49, 맞힌 사람: 45, 정답 비율: 31.915%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 0-1 너비 우선 탐색

### 문제 설명

<p>There is a robot in a 2D grid.  The grid consists of obstacles, and there is exactly one cell that is the exit.  The robot will exit the grid if it ever reaches the exit cell.  Empty cells are denoted as &#39;<code>.</code>&#39;, the robot&#39;s initial position is denoted as &#39;<code>R</code>&#39;, obstacles are denoted as &#39;<code>#</code>&#39;, and the exit is denoted as &#39;<code>E</code>&#39;.</p>

<p>You can program the robot by sending it a series of commands.  The series of commands is a string consisting of characters &#39;<code>L</code>&#39; (move one square left), &#39;<code>U</code>&#39; (move one square up), &#39;<code>R</code>&#39; (move one square right), or &#39;<code>D</code>&#39; (move one square down). If the robot would run into an obstacle or off the edge of the grid, it will ignore the command (but it will continue onto future commands, if there are any).</p>

<p>Your friend sent a series of commands to the robot, but unfortunately, the commands do not necessarily take the robot to the exit.</p>

<p>You would like to fix the string so that the robot will touch the exit square. (Note: once the robot reaches the exit, it stops, even if there are more commands in the string.)</p>

<p>You can fix the string with a sequence of operations. There are two operations: inserting a command or deleting a command. What is the minimum number of operations you would need to fix the program?</p>

### 입력

<p>The first line of the input contains the two integers $N$ and $M$, $1 \le N, M \le 50$, which are the width and height of the grid.</p>

<p>The next $N$ lines will contain a string of exactly $M$ characters, each of which is &#39;.&#39; (empty), &#39;<code>R</code>&#39; (the robot), &#39;<code>#</code>&#39; (an obstacle), or &#39;<code>E</code>&#39;, the exit. There will be exactly one &#39;<code>R</code>&#39; and one &#39;<code>E</code>&#39; in the grid, and it will always be possible to navigate the robot to the exit.</p>

<p>The last line contains a string $s$ ($1 \leq |s| \leq 50$) of commands. The string $s$ will consist only of &#39;<code>L</code>&#39;, &#39;<code>R</code>&#39;, &#39;<code>U</code>&#39;, and &#39;<code>D</code>&#39;.</p>

### 출력

<p>Print one line containing the single integer indicating the minimum number of operations necessary to fix the command string so that the robot makes it to the exit.</p>
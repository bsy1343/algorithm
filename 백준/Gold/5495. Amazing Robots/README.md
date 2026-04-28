# [Gold II] Amazing Robots - 5495

[문제 링크](https://www.acmicpc.net/problem/5495)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 2, 맞힌 사람: 2, 정답 비율: 33.333%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 격자 그래프, 역추적

### 문제 설명

<p>You are the proud owner of two robots that are located in separate rectangular mazes. Square (1, 1) in a maze is the square in the upper-left corner, which is the north-west corner. Maze i (i = 1, 2) has a set of G<sub>i</sub> (0 &le; G<sub>i</sub> &le; 10) guards trying to capture the robots by patrolling back and forth on a straight patrol path. Your goal is to determine a sequence of commands such that the robots exit the mazes without either robot being captured by a guard.</p>

<p>At the beginning of each minute, you broadcast the same command to both robots. Each command is a direction (north, south, east, or west). A robot moves one square in the direction of the command, unless the robot would collide with a wall, in which case the robot does not move for that minute. A robot exits the maze by walking out of it. A robot ignores commands after it has exited its maze.</p>

<p>Guards move one square at the beginning of each minute, at the same time as the robots. Each guard begins at a given square facing a given direction and moves forward one square per minute until the guard has moved one fewer square than the number of squares in his patrol path. The guard then turns around instantaneously and walks in the opposite direction back to his starting square, where he turns around again and repeats his patrol path until each robot has exited its maze.</p>

<p>A guard&rsquo;s patrol will not require the guard to walk through walls or exit the maze. Although guard patrols may overlap, no two guards will ever collide: they will never occupy the same square at the end of a minute, and they will not exchange squares with each other during a minute. A guard in a maze will not start in the same square as the robot in that maze.</p>

<p>A guard captures a robot if the guard occupies the same square at the end of a minute as the robot, or if the guard and the robot exchange squares with each other during a minute.</p>

<p>Given two mazes (each no larger than 20x20) along with the initial square of each robot and the patrol paths of the guards in each maze, determine a sequence of commands for which the robots exit without being caught by the guards. Minimize the time it takes for the later robot to exit its maze. If the robots exit at different times, the time at which the earlier robot exited does not matter.</p>

### 입력

<p>The first set of lines describes the first maze and its occupants. Subsequently, the second set of lines describes the second maze and its occupants.</p>

<ul>
	<li>The first line of input contains two space-separated integers, R<sub>1</sub> and C<sub>1</sub>, the number of rows and columns in maze 1.</li>
	<li>The next R<sub>1</sub> lines each contain C<sub>1</sub> characters specifying the maze layout. The robot&#39;s starting square is specified by an &lsquo;X&rsquo;. A &lsquo;.&rsquo; represents an open space and &lsquo;#&rsquo; represents a wall. Each maze will contain exactly one robot.</li>
	<li>Following the maze layout is a single line with a single integer G<sub>1</sub>, the number of guards in the first maze (0 &le; G<sub>1</sub> &le; 10).</li>
	<li>Each of the next G<sub>1</sub> lines describes a guard&rsquo;s patrol as three integers and a character, separated by single spaces. The first two integers specify the row and column of the starting square of the guard. The third integer specifies the number of squares (2&hellip;4) in the guard&#39;s patrol path. The character specifies the initial direction the guard is facing: &lsquo;N&rsquo;, &lsquo;S&rsquo;, &lsquo;E&rsquo;, or &lsquo;W&rsquo; (north, south, east, and west, respectively).</li>
</ul>

<p>The description of the second maze follows the description of the first, in the same format but with potentially different values.</p>

### 출력

<p>The first line of the output should contain a single integer K (K &le; 10000), the number of commands for both robots to exit the maze without being captured. If such a sequence of commands exists, the shortest sequence will have no more than 10000 commands. The next K lines are the sequence of commands, each containing a single character from the set {&lsquo;N&rsquo;, &lsquo;S&rsquo;, &lsquo;E&rsquo;, &lsquo;W&rsquo;}. If no such sequence exists, output a single line containing &ldquo;-1&rdquo;.</p>

<p>Both robots should exit their mazes by the end of the commands. The last command should cause at least one of the robots to exit its maze. If multiple sequences of commands cause the robots to exit in the minimum time, any will be accepted.</p>
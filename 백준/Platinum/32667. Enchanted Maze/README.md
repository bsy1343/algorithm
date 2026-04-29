# [Platinum III] Enchanted Maze - 32667

[문제 링크](https://www.acmicpc.net/problem/32667)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 72, 정답: 15, 맞힌 사람: 13, 정답 비율: 20.000%

### 분류

격자 그래프, 구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 많은 조건 분기, 비트마스킹

### 문제 설명

<p>Mila and her twin brother Liam have been trapped by an evil witch.  The witch put the twins at different locations in a maze, and they must find their way out of the maze before she releases her pet dragon. The twins have asked you to help them escape the maze in the least amount of time.</p>

<p>To make things even more difficult, the witch has placed a curse on the twins.  Although the twins can attempt to move in any of the four compass directions (North, South, East, West), they must attempt to move in the same direction at the same time.  For example, if Mila attempts to walk North for a step, Liam must also attempt to walk North at the same time.  Each attempted move by the twins takes one second to complete, regardless of whether the move was successful or not.</p>

<p>The maze is represented by a rectangular grid, where each location can be one of the following types:</p>

<ul>
	<li>Start (<code>S</code>): the starting positions of the twins.  There are exactly two starting locations, one for each twin.</li>
	<li>Exit (<code>E</code>): the twins escape if they are both at exit locations at the same time.  There are exactly two exit locations.</li>
	<li>Open (<code>.</code>): the twins may freely move in and out of this location.</li>
	<li>Fixed Obstacle (<code>#</code>): the twins may not move into this location.</li>
	<li>Bottomless pit (<code>*</code>): a twin moving into a pit is lost forever.</li>
	<li>Raised obstacle (<code>A, B, C, D</code>): these obstacles can be lowered by stepping on the corresponding switch.</li>
	<li>Lowered obstacle (<code>a, b, c, d</code>): these locations are considered open, but they can be raised by stepping on the corresponding switch.</li>
	<li>Switch (<code>1, 2, 3, 4</code>): switches that control the obstacles. Switch 1 controls obstacles labelled <code>A</code> and <code>a</code>, switch 2 controls obstacles labelled <code>B</code> and <code>b</code>, switch 3 controls obstacles labelled <code>C</code> and <code>c</code>, and switch 4 controls obstacles labelled <code>D</code> and <code>d</code>.  There is at most one switch of each label, but each switch may control more than one obstacle.</li>
</ul>

<p>The twins may not be in the same location at the same time.  If a twin attempts to move into a fixed or raised obstacle, the twin will instead remain stationary.  A twin that moves outside of the boundary of the maze is lost forever.  They are also allowed to enter and leave the starting and exit locations throughout their journey.</p>

<p>A switch is triggered when a twin moves onto a switch.  When a switch is triggered, the corresponding obstacles are raised (if currently lowered) or lowered (if currently raised).  The switch is not triggered if a twin is already on the switch and remains stationary after an attempted move.</p>

<p>If a twin attempts to move into a raised obstacle at the same time the other twin steps on the corresponding switch, the obstacle is still considered raised and is only lowered at the end of the move.  A twin may not move onto a switch if the other twin is moving onto or remaining stationary at a corresponding lowered obstacle at the same time.</p>

### 입력

<p>The first line of input contains two integers, $2 \leq R \leq 10$ and $2 \leq C \leq 10$, specifying the number of rows and columns in the maze. The next R lines each contains C characters.  All possible characters are specified above.  It is always possible for the twins to escape the maze.</p>

### 출력

<p>Output the least number of seconds required for the twins to escape. </p>
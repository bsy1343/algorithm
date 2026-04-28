# [Gold I] Pokémon Ice Maze - 17921

[문제 링크](https://www.acmicpc.net/problem/17921)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 7, 맞힌 사람: 7, 정답 비율: 58.333%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>You are hired as a level designer for the next Pok&eacute;mon series, with games called <em>Ice</em>&nbsp;and <em>Fire</em>. For the first of these two games, players have to get through a maze in an icy cave. The cave is represented as a grid, with each square of the grid being either ice, gravel or an obstacle.</p>

<p>The player will start at a square, and then make a number of moves, each move represented by one of the four cardinal directions. The maze behaves in the following way. Assume that the square the player is trying to move into is an obstacle. In this case, the player does not move. If the square the player is moving into is gravel, the player successfully moves to the square and will stand still on the square. If the square is ice however, the player will first be transferred into that square, and then repeat the procedure again in the same direction. This means the player will glide on the ice until either colliding with an obstacle or reaching a square filled with gravel. Gliding on ice counts only as one move.</p>

<p>You have almost finished your level design. In the maze, there is a goal square that you wish to reach. You still have to choose a square to be the starting point of the player. Since you do not want the level to be too easy, you want to make sure the number of moves needed to get from the starting point to the goal is sufficiently high.</p>

<p>Can you compute the minimum number of <em>moves</em>&nbsp;needed to get from each point in the maze to the goal? Note that move may result in the player traveling multiple squares if gliding on the ice.</p>

### 입력

<p>The first line of the input contains the two integers $3 \le C \le 1\,000$ and $3 \le R \le 1\,000$, the number of columns and rows that the maze consists of.</p>

<p>The next $R$ lines contains $C$ characters each, describing the maze. Each square in the maze is represented by one of the following characters:</p>

<ul>
	<li>a period (<code>.</code>) represents a gravel square</li>
	<li>a pound sign (<code>#</code>) represents an obstacl</li>
	<li>an underscore (<code>_</code>) represents an ice square</li>
	<li>an M (<code>M</code>) represents the goal in the maze, which is also covered in gravel</li>
</ul>

<p>The edges of the maze are always surrounded by obstacle squares.</p>

### 출력

<p>Output $R$ lines with $C$ integers each, one for each square, containing the number of moves needed to reach the goal.</p>

<p>If it is not possible to reach the target from a square, output $-1$ instead for that square.</p>
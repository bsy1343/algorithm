# [Platinum III] Short Coding - 21928

[문제 링크](https://www.acmicpc.net/problem/21928)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 63, 정답: 39, 맞힌 사람: 35, 정답 비율: 59.322%

### 분류

구현, 그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 해 구성하기, 시뮬레이션, 깊이 우선 탐색, 백트래킹

### 문제 설명

<p>You participate in a project to explore an asteroid called <em>Yokohama 2020</em>. A maze-like space in its underground was found by a survey a couple of years ago. The project is to investigate the maze more in detail using an exploration robot.</p>

<p>The shape of the maze was fully grasped by a survey with ground penetrating radars. For planning the exploration, the maze is represented as a grid of cells, where the first cell of the first row is the upper left corner of the grid, and the last cell of the last row is the lower right corner.</p>

<p>Each of the grid cell is either vacant, allowing robot&rsquo;s moves to it from an adjacent vacant cell, or filled with rocks, obstructing such moves. The entrance of the maze is located in a cell in the uppermost row and the exit is in a cell in the lowermost row.</p>

<p>The exploration robot is controlled by a program stored in it, which consists of sequentially numbered lines, each containing one of the five kinds of commands described below. The register <code>pc</code> specifies the line number of the program to be executed. Each command specifies an action of the robot and a value to be set to <code>pc</code>.</p>

<p>The robot starts at the entrance of the maze facing downwards, and the value of <code>pc</code> is set to 1. The program commands on the lines specified by <code>pc</code> are executed repetitively, one by one, until the robot reaches the exit of the maze.</p>

<p>When the value of <code>pc</code> exceeds the number of lines of the program by its increment, it is reset to 1. The robot stops on reaching the exit cell, which is the goal of the project.</p>

<p>As the capacity of the program store for the robot is quite limited, the number of lines of the program should be minimal. Your job is to develop a program with the fewest possible number of lines among those which eventually lead the robot to the exit.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<pre>
n m
s<sub>1</sub>
.
.
.
s<sub>n</sub></pre>

<p>The first line contains two integers n (2 &le; n &le; 10) and m (2 &le; m &le; 10). The maze is represented as a grid with n rows and m columns. The next n lines describe the grid. Each of the lines&nbsp;contains a string of length m corresponding to one grid row. The i-th character of the j-th string, either &lsquo;<code>.</code>&rsquo;, &lsquo;<code>#</code>&rsquo;, &lsquo;<code>S</code>&rsquo; or &lsquo;<code>G</code>&rsquo;, describes the i-th cell of the j-th row. &lsquo;<code>.</code>&rsquo; means that the cell is vacant and the robot in one of the four adjacent cells can move to it. &lsquo;<code>#</code>&rsquo; means that the cell is filled obstructing the robot&rsquo;s moves to it. &lsquo;<code>S</code>&rsquo; means that the cell is the entrance, and &lsquo;<code>G</code>&rsquo; means that the cell is the exit. These cells are vacant, of course.</p>

<p>It is known that a program exists that leads the robot to the exit.</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th>command</th>
			<th>description</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><code>GOTO l</code></td>
			<td>Set l to <code>pc</code>. The command parameter l is a positive integer less than or equal to the number of lines of the program.</td>
		</tr>
		<tr>
			<td><code>IF-OPEN l</code></td>
			<td>If there is a vacant adjacent cell in its current direction, set l to <code>pc</code>; otherwise, that is, facing a filled cell or a border of the grid, increment <code>pc</code> by one. The command parameter l is a positive integer less than or equal to the number of lines of the program.</td>
		</tr>
		<tr>
			<td><code>FORWARD</code></td>
			<td>If there is a vacant adjacent cell in its current direction, move there; otherwise, stay in the current cell. In either case, increment <code>pc</code> by one.</td>
		</tr>
		<tr>
			<td><code>LEFT</code></td>
			<td>Turn 90 degrees to the left without changing the position, and increment <code>pc</code> by one.</td>
		</tr>
		<tr>
			<td><code>RIGHT</code></td>
			<td>Turn 90 degrees to the right without changing the position, and increment <code>pc</code> by one.</td>
		</tr>
	</tbody>
</table>

### 출력

<p>The first line of the output should have the number of lines of the program. The commands in the program lines should follow, one per each line, in the order of their line numbers. When the command has a parameter, output only one space between the command name and the parameter.</p>

<p>If more than one appropriate program has the fewest lines, whichever is acceptable.</p>
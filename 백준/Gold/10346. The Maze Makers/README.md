# [Gold II] The Maze Makers - 10346

[문제 링크](https://www.acmicpc.net/problem/10346)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 37, 정답: 23, 맞힌 사람: 17, 정답 비율: 85.000%

### 분류

구현, 그래프 이론, 그래프 탐색, 비트마스킹, 깊이 우선 탐색

### 문제 설명

<p>The Maze Makers is a publisher of puzzle books.&nbsp; One of their most popular series is maze books.&nbsp; They have a program that generates rectangular two-dimensional mazes like the one shown in <strong>Figure&nbsp;1</strong>.&nbsp; The rules for these mazes are: (1) A maze has exactly two exterior cell walls missing, opening to two distinct terminal cells, (2) starting from any one cell, all other cells are reachable, (3) between any two cells in the maze there is exactly one simple path. Formally, a path is a sequence of cells where each cell and its successor on the path share an edge without a wall. A <em>simple </em>path is a path that never repeats a cell.&nbsp;</p>

<p>The Maze Maker program uses hexadecimal digits to encode the walls and passages of a maze.&nbsp; For each cell in the maze there is a corresponding hex digit.&nbsp; As shown in <strong>Figure 2</strong>, the 1&#39;s and 0&#39;s in the 4 digit binary representation of a hex digit correspond to the walls (1&#39;s) and passages (0&#39;s) for each cell in the maze.&nbsp; For example, the binary encoding for the hex digit B is 1011.&nbsp; Starting at the top of the cell and moving clockwise around it, this digit represents a cell with a wall at the top, a passage to the right and walls at the bottom and to the left.&nbsp; A path between two maze cells successively moves one cell up, down, left or right, going through passages only.</p>

<table align="center" class="table table-bordered">
	<tbody>
		<tr>
			<td><img alt="2D-Maze" src="%EB%B0%B1%EC%A4%80/Gold/10346.%E2%80%85The%E2%80%85Maze%E2%80%85Makers/90aef092.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/10346.%E2%80%85The%E2%80%85Maze%E2%80%85Makers/90aef092.png" data-original-src="https://www.acmicpc.net/upload/images2/fig_01.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width:200px" /><br />
			&nbsp;
			<p><strong>Figure 1:</strong> Sample Maze</p>
			</td>
			<td><img alt="Hex Code for Walls and Passageways" src="%EB%B0%B1%EC%A4%80/Gold/10346.%E2%80%85The%E2%80%85Maze%E2%80%85Makers/07e3fa1d.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/10346.%E2%80%85The%E2%80%85Maze%E2%80%85Makers/07e3fa1d.png" data-original-src="https://www.acmicpc.net/upload/images2/fig_02.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width:200px" /><br />
			&nbsp;
			<p><strong>Figure 2:</strong> Hex Code for Walls<br />
			and Passageways</p>
			</td>
			<td><img alt="Maze with Cell	  Labels" src="%EB%B0%B1%EC%A4%80/Gold/10346.%E2%80%85The%E2%80%85Maze%E2%80%85Makers/d5ac76ad.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/10346.%E2%80%85The%E2%80%85Maze%E2%80%85Makers/d5ac76ad.png" data-original-src="https://www.acmicpc.net/upload/images2/fig_03.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width:200px" /><br />
			&nbsp;
			<p><strong>Figure 3:</strong> Maze with Cell Labels</p>
			</td>
		</tr>
	</tbody>
</table>

<p><strong>Figure 3</strong> shows the sample maze with the hexadecimal labels in each cell.&nbsp; For example, the hexadecimal digit E in the top-right cell indicates that it has a wall above it, to its right, below it, yet a passageway to its left. The hexadecimal digit 8 to its left indicates that its cell has only a wall above it. The inputs will always be self-consistent, in that the hexadecimal digits in neighboring cells will agree on whether they share a wall or passageway, and each input will always have precisely two terminal cells, each with one missing exterior wall.</p>

<p>Our sample maze is a legitimate maze in that all cells are reachable and there is a unique simple path between any pairs of cells in the maze. Your goal is to write a program that reads the hexadecimal descriptions of a potential maze and tests to determine if it is legitimate. If there is a problem, your program must report only the <em>first</em> problem, as detailed below in the section titled &quot;Output&quot;.</p>

### 입력

<p>The input consists of the descriptions of one or more candidate mazes.&nbsp; Each maze description will start with two integers, H and W, indicating the height and width of the maze, respectively, such that 1 &le; H &le; 50 and 2 &le; W &le; 50. Following this first line will be H rows of hexadecimal digits, with each row consisting of W digits.&nbsp; The input is terminated with a line displaying a pair of zeros.</p>

### 출력

<p>&nbsp;For each candidate maze, the program should output the first one of the following statements that applies:</p>

<blockquote>NO SOLUTION<br />
UNREACHABLE CELL<br />
MULTIPLE PATHS<br />
MAZE OK</blockquote>

<p>The classification statements are defined formally as follows:</p>

<blockquote>NO SOLUTION - There is no path through the interior of the maze between the two exterior openings.<br />
<br />
UNREACHABLE CELL - There is at least one cell in the maze that is not reachable by following passageways from either of the openings in the exterior walls of the maze.<br />
<br />
MULTIPLE PATHS - There exists a pair of cells in the maze that have more than one simple path between them. Two simple paths are considered to be distinct if any part of the paths differ.<br />
<br />
MAZE OK - None of the above problems exist.</blockquote>

<p>Note well that for the second case given in the following examples, there is no path between the start and finish and there is an unreachable cell; the correct output should simply be NO SOLUTION, because that error message is listed first in the above list. Similarly, in the fourth example given, UNREACHABLE&nbsp;CELL is reported because that error has priority over the multiple paths.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10346.%E2%80%85The%E2%80%85Maze%E2%80%85Makers/fe8ab057.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/10346.%E2%80%85The%E2%80%85Maze%E2%80%85Makers/fe8ab057.png" data-original-src="https://www.acmicpc.net/upload/images2/mazes.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:959px; width:674px" /></p>
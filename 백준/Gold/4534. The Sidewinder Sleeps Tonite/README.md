# [Gold IV] The Sidewinder Sleeps Tonite - 4534

[문제 링크](https://www.acmicpc.net/problem/4534)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 9, 맞힌 사람: 9, 정답 비율: 75.000%

### 분류

그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>Slitherlink is a type of logic puzzle made popular by Nikoli, the same Japanese puzzle company that has made Sudoku popular the world over. Like most good logic puzzles, it has a set of very basic rules that can nonetheless result in devilishly difficult (and delightful!) puzzling experiences.</p>

<p>The rules of Slitherlink are as follows:</p>

<p>A Slitherlink board is made up of a lattice of dots; in this problem, it will be a regular rectangular lattice.<br />
Some of the boxes (or cells) defined by the lattice have numbers within them; with a regular rectangular lattice, the numbers will be between 0 and 3 inclusive.<br />
The goal of a Slitherlink puzzle is to connect adjacent dots (horizontally or vertically, like the sides of boxes) so that there is a single loop that never crosses itself, with no line segments that are not part of the loop (no &quot;dangling&quot; segments or other, separate loops) such that every cell that has a number has exactly that many sides as segments of the loop.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4534.%E2%80%85The%E2%80%85Sidewinder%E2%80%85Sleeps%E2%80%85Tonite/59271ac5.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4534.%E2%80%85The%E2%80%85Sidewinder%E2%80%85Sleeps%E2%80%85Tonite/59271ac5.png" data-original-src="https://www.acmicpc.net/upload/images2/slitherlink.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:197px; width:390px" /></p>

<p style="text-align: center;">Left: Unsolved 5x5 Puzzle, Right: Solved 5x5 Puzzle</p>

<p>Given a supposedly solved Slitherlink puzzle, your task will be to determine whether or not it is indeed legitimately solved.</p>

### 입력

<p>Input to this problem will begin with a line containing a single integer N (1 &le; N &le; 100) indicating the number of data sets. Each data set consists of the following components:</p>

<ul>
	<li>A line containing two integers H, W (1 &le; H,W &le; 20) representing the height and width of the Slitherlink puzzle by the number of cells (not dots!) per edge;</li>
	<li>A series of 2H + 1 lines representing the Slitherlink puzzle, using the following non-whitespace characters:
	<ul>
		<li>0, 1, 2, 3, ?: The numbers written inside a given cell. A ? represents an empty cell, as in the example graphic above.</li>
		<li>#: A dot in the lattice.</li>
		<li>-, |: A horizontal or vertical line segment.</li>
		<li>.: An empty adjacency between two dots in the lattice.</li>
	</ul>
	</li>
</ul>

<p>Note that all Slitherlink puzzles will be fully represented; that is, there is no internal whitespace on a given line to represent empty cells or adjacencies.</p>

### 출력

<p>For each data set, print &quot;VALID&quot; if the solution is a valid solution to the given Slitherlink, or &quot;INVALID&quot; if the solution is not valid.</p>
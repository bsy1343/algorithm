# [Silver III] 3-Puzzle - 34388

[문제 링크](https://www.acmicpc.net/problem/34388)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 30, 정답: 17, 맞힌 사람: 15, 정답 비율: 53.571%

### 분류

구현, 많은 조건 분기, 브루트포스 알고리즘

### 문제 설명

<p>Your friend needs help solving a $15$-Puzzle, so to warm up, you solve the $3$-Puzzle instead. A $3$-Puzzle consists of a $2 \times 2$ grid containing $3$ tiles numbered $1$ through $3$ and one empty space. The goal is to slide the tiles around so that they are in ascending row-major order and the empty space is on the bottom right like this:</p>

<table class="table table-bordered td-center table-center-10">
	<tbody>
		<tr>
			<td>$1$</td>
			<td>$2$</td>
		</tr>
		<tr>
			<td>$3$</td>
			<td> </td>
		</tr>
	</tbody>
</table>

<p>Given the starting position of a $3$-Puzzle, find the minimum number of moves it takes to solve the puzzle. Here's an example of how sample input $1$ can be solved in $3$ moves:</p>

<p>Starting position:</p>

<table class="table table-bordered td-center table-center-10">
	<tbody>
		<tr>
			<td>$2$</td>
			<td> </td>
		</tr>
		<tr>
			<td>$1$</td>
			<td>$3$</td>
		</tr>
	</tbody>
</table>

<p>After $1$ move:</p>

<table class="table table-bordered td-center table-center-10">
	<tbody>
		<tr>
			<td> </td>
			<td>$2$</td>
		</tr>
		<tr>
			<td>$1$</td>
			<td>$3$</td>
		</tr>
	</tbody>
</table>

<p>After $2$ moves:</p>

<table class="table table-bordered td-center table-center-10">
	<tbody>
		<tr>
			<td>$1$</td>
			<td>$2$</td>
		</tr>
		<tr>
			<td> </td>
			<td>$3$</td>
		</tr>
	</tbody>
</table>

<p>After $3$ moves:</p>

<table class="table table-bordered td-center table-center-10">
	<tbody>
		<tr>
			<td>$1$</td>
			<td>$2$</td>
		</tr>
		<tr>
			<td>$3$</td>
			<td> </td>
		</tr>
	</tbody>
</table>

### 입력

<p>The input will consist of exactly $2$ lines, each containing exactly $2$ characters.</p>

<p>Each character is either a number $1$ through $3$ (representing one of the tiles) or a dash (<code>-</code>) (the empty space).</p>

<p>The puzzle state represented by the input is guaranteed to be a solvable configuration.</p>

### 출력

<p>Output a singe integer, indicating the minimum number of moves required to solve the puzzle from the provided starting position, or $0$ if it's already in the solved position.</p>
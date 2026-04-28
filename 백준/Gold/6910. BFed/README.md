# [Gold III] BFed - 6910

[문제 링크](https://www.acmicpc.net/problem/6910)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 6, 맞힌 사람: 4, 정답 비율: 40.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>For this problem, you will write an interpreter for an extremely simple programming language. The language does have a name, but for various, ahem, reasons, we shall call it BF.</p>

<p>A BF program operates on a simple $1$-dimensional array of memory cells; there is a pointer to a &quot;current&quot; memory cell. In &quot;vanilla&quot; BF, this array has a size of $30\,000$, and each cell is an $8$-bit integer - that is, cells store values in the range of $0$-$255$. Incrementing a cell with a value of $255$ wraps around to $0$; decrementing a cell with a value of $0$ wraps around to $255$. All cells are initially set to $0$, and the pointer initially points to the leftmost cell.</p>

<p>The BF program consists of a string. Each character can be one of $8$ &quot;commands&quot;:</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th>Command</th>
			<th>Description</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><code>&gt;</code></td>
			<td>move the pointer right one cell</td>
		</tr>
		<tr>
			<td><code>&lt;</code></td>
			<td>move the pointer left one cell</td>
		</tr>
		<tr>
			<td><code>+</code></td>
			<td>increment the current cell by $1$</td>
		</tr>
		<tr>
			<td><code>-</code></td>
			<td>decrement the current cell by $1$</td>
		</tr>
		<tr>
			<td><code>[</code></td>
			<td>skips ahead to the matching <code>]</code> IF the current cell contains $0$</td>
		</tr>
		<tr>
			<td><code>]</code></td>
			<td>returns to the matching <code>[</code> UNLESS the current cell contains $0$</td>
		</tr>
		<tr>
			<td><code>.</code></td>
			<td>outputs the current cell as a character</td>
		</tr>
		<tr>
			<td><code>,</code></td>
			<td>inputs one character into the current cell</td>
		</tr>
	</tbody>
</table>

<p>You do not need to implement the <code>,</code> command.</p>

<p>You should ignore any characters in the BF program except in the first $7$ commands listed above. The program ends when there are no more characters to be processed.</p>

<p>Interestingly enough, these commands are powerful enough that a BF program can (given sufficient memory, time and programming patience) perform any computation that any other programming language can do!</p>

### 입력

<p>Your interpreter will be given a BF program in standard input. It may span multiple lines. The program will be terminated by a hash mark <code>#</code>.</p>

<p>You may assume that no programs will be given to your interpreter that are invalid, run unreasonably long (or forever), or crash off the left or right end of the array. No input will be longer than $10\,000$ characters.</p>

### 출력

<p>Your interpreter should print the output from the execution of the BF program. Do not print any characters other than the ones from the program.</p>
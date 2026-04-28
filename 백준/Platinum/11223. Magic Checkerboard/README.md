# [Platinum IV] Magic Checkerboard - 11223

[문제 링크](https://www.acmicpc.net/problem/11223)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 76, 정답: 23, 맞힌 사람: 20, 정답 비율: 28.986%

### 분류

(분류 없음)

### 문제 설명

<p>Consider an n &times; m checkerboard. On each cell of the checkerboard, place a positive integer. The values in each column of the checkerboard must be in strictly increasing order from top to bottom, and the values in each row of the checkerboard must be in strictly increasing order from left to right.</p>

<table class="table table-bordered" style="width:20%">
	<tbody>
		<tr>
			<td style="text-align:center; width:5%">1</td>
			<td style="text-align:center; width:5%">2</td>
			<td style="text-align:center; width:5%">3</td>
			<td style="text-align:center; width:5%">4</td>
		</tr>
		<tr>
			<td style="text-align:center">3</td>
			<td style="text-align:center">4</td>
			<td style="text-align:center">5</td>
			<td style="text-align:center">6</td>
		</tr>
		<tr>
			<td style="text-align:center">5</td>
			<td style="text-align:center">6</td>
			<td style="text-align:center">7</td>
			<td style="text-align:center">8</td>
		</tr>
		<tr>
			<td style="text-align:center">7</td>
			<td style="text-align:center">8</td>
			<td style="text-align:center">9</td>
			<td style="text-align:center">10</td>
		</tr>
	</tbody>
</table>

<p>A Magic Checkerboard has an additional constraint. The cells that share only a corner must have numbers of different parity (Even vs Odd). Note that the following checkboard is invalid, because 2 and 4 share only a corner and have the same parity:</p>

<table class="table table-bordered" style="width:10%">
	<tbody>
		<tr>
			<td style="text-align:center; width:5%">1</td>
			<td style="text-align:center; width:5%">2</td>
		</tr>
		<tr>
			<td style="text-align:center">4</td>
			<td style="text-align:center">6</td>
		</tr>
	</tbody>
</table>

<p>The first 4 &times; 4 example is a valid Magic Checkboard. Given a partially filled magic checkboard, can you fill the remaining locations on the checkboard, so that the sum of all values is as small as possible?</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. Each input starts with a line with two space-separated integers n and m (1 &le; n, m &le; 2 000), representing the number of rows (n) and the number of columns (m) of the checkerboard. Each of the next n lines will contain m space-separated integers c (0 &le; c &le; 2 000), representing the contents of the checkerboard. Zero is used for cells without numbers that you must fill in. You may use any positive integers to fill in the cells without numbers, so long as you form a valid Magic Checkerboard. You are not limited to numbers &le; 2 000, and the numbers are not required to be unique.</p>

### 출력

<p>Output a single integer representing the minimum sum possible by replacing the 0 cells with positive integers to form a valid Magic Checkerboard. Output &minus;1 if it is not possible to replace the 0 cells to meet the constraints of a Magic Checkerboard.</p>
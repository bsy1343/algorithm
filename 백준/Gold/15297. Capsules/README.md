# [Gold IV] Capsules - 15297

[문제 링크](https://www.acmicpc.net/problem/15297)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 7, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

백트래킹, 브루트포스 알고리즘

### 문제 설명

<p>At some point or another, most computer science students have written a standard Sudoku solving program. This is yet another &ldquo;put numbers in a grid&rsquo;&rsquo; puzzle.&nbsp;</p>

<p>Numbers are placed in the grid so that each outlined region contains the numbers 1 to n, where n is the number of squares in the region. The same number can never touch itself, not even diagonally.</p>

<table class="table" style="width:100%">
	<tbody>
		<tr>
			<td style="text-align:center; width:50%"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15297.%E2%80%85Capsules/ff22fa20.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/15297.%E2%80%85Capsules/ff22fa20.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15297/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:92px; width:131px" /></td>
			<td style="text-align:center; width:50%"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15297.%E2%80%85Capsules/11940149.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/15297.%E2%80%85Capsules/11940149.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15297/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:91px; width:131px" /></td>
		</tr>
		<tr>
			<td style="text-align:center; width:50%">Incomplete Grid</td>
			<td style="text-align:center; width:50%">Solution Grid</td>
		</tr>
	</tbody>
</table>

<p>For this problem, you will write a program that takes as input an incomplete puzzle grid and outputs the puzzle solution grid.</p>

### 입력

<p>The first line of input contains a single decimal integer P, (1 &le; P &le; 100), which is the number of data sets that follow. Each data set should be processed identically and independently.</p>

<p>Each data set starts with a line containing the data set number K, (1 &le; K &le; 100), the number of rows in the input grid R, (1 &le; R &le; 7), and the number of columns in the input grid C, (1 &le; C &le; 7), separated by spaces. The next R lines contain a representation of the incomplete input grid, one row per line. The value in each cell is represented by either the digit already in that cell or a &lsquo;-&rsquo; for an initially empty cell.</p>

<p>This grid is followed by a description of the separate regions in the grid. The first of these lines specifies the total number of regions. This is followed by one line for each region that specifies the cells contained in that region. Each region description consists of a decimal number N, specifying the number of cells in the region, followed by N cell descriptions separated by spaces. Each cell description consists of a left parenthesis, followed the cell&rsquo;s row index, followed by a comma, followed by the cell&rsquo;s row number, followed by a right parenthesis.</p>

### 출력

<p>For each data set, the output consists of the data set number, K, on a line by itself. This is followed by R lines containing C digits (separated by single spaces) showing the solution grid for the corresponding input data set.</p>
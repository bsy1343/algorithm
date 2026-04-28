# [Gold II] Cash Cow - 9441

[문제 링크](https://www.acmicpc.net/problem/9441)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 115, 정답: 52, 맞힌 사람: 42, 정답 비율: 42.857%

### 분류

구현, 그래프 이론, 그래프 탐색, 시뮬레이션, 너비 우선 탐색

### 문제 설명

<p>Years before Candy Crush became the wildly popular game that may lead developer Saga to a multi-billion dollar IPO, there was an online game named Cash Cow, which remains part of the Webkinz platform.</p>

<p>This single-player game has a board with 12 rows and 10 columns, as shown in Figure&nbsp;1. We label the rows 1 through 12, starting at the bottom, and the columns <em>a</em> through <em>j</em>, starting at the left. Each grid location can either have a colored circle or be empty. (We use uppercase characters to denote distinct colors, for example with B=blue, R=red, and Y=yellow.) On each turn, the player clicks on a circle. The computer determines the largest &quot;cluster&quot; to which that circle belongs, where a cluster is defined to include the initial circle, any of its immediate horizontal and vertical neighbors with matching color, those circles&#39; neighbors with matching colors, and so forth. For example, if a user were to click on the blue circle at cell (h10) in Figure&nbsp;1, its cluster consists of those cells shown with empty circles in Figure&nbsp;2.</p>

<table class="table table-bordered" style="height:204px; text-align:center; width:406px">
	<tbody>
		<tr>
			<td><img src="%EB%B0%B1%EC%A4%80/Gold/9441.%E2%80%85Cash%E2%80%85Cow/655142fe.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9441.%E2%80%85Cash%E2%80%85Cow/655142fe.png" data-original-src="https://www.acmicpc.net/upload/images2/original.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td><img src="%EB%B0%B1%EC%A4%80/Gold/9441.%E2%80%85Cash%E2%80%85Cow/ad504471.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9441.%E2%80%85Cash%E2%80%85Cow/ad504471.png" data-original-src="https://www.acmicpc.net/upload/images2/during_h10.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td><img src="%EB%B0%B1%EC%A4%80/Gold/9441.%E2%80%85Cash%E2%80%85Cow/6468098d.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9441.%E2%80%85Cash%E2%80%85Cow/6468098d.png" data-original-src="https://www.acmicpc.net/upload/images2/after_h10.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
		</tr>
		<tr>
			<td>Figure 1</td>
			<td>Figure 2</td>
			<td>Figure 3</td>
		</tr>
		<tr>
			<td colspan="3">Processing a click on cell h10.</td>
		</tr>
	</tbody>
</table>

<p>The player&#39;s turn is processed as follows. If the indicated grid cell belongs to a cluster of only one or two circles (or if there is no circle at that cell), the turn is wasted. Otherwise, with a cluster of 3 or more circles, all circles in the cluster are removed from the board. Remaining circles are then compacted as follows:</p>

<ol>
	<li>Circles fall vertically, to fill in any holes in their column.</li>
	<li>If one or more columns have become empty, all remaining columns slide leftward (with each nonempty column remaining intact), such that they are packed against the left edge of the board.</li>
</ol>

<p>For example, Figure&nbsp;3 shows the board after the cluster of Figure&nbsp;2 was removed after the click on (h10).</p>

<p>As another example, Figure&nbsp;4 below, portrays the processing of a subsequent click on cell (j1). During that turn, column&nbsp;(e) becomes empty, and the resulting columns (f) through (j) slide to become columns (e) through (i), respectively. Figure&nbsp;5 provides one further example in which several columns are compacted.</p>

<table class="table table-bordered" style="height:204px; text-align:center; width:406px">
	<tbody>
		<tr>
			<td><img src="%EB%B0%B1%EC%A4%80/Gold/9441.%E2%80%85Cash%E2%80%85Cow/6468098d.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9441.%E2%80%85Cash%E2%80%85Cow/6468098d.png" data-original-src="https://www.acmicpc.net/upload/images2/after_h10.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td><img src="%EB%B0%B1%EC%A4%80/Gold/9441.%E2%80%85Cash%E2%80%85Cow/8c22e48f.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9441.%E2%80%85Cash%E2%80%85Cow/8c22e48f.png" data-original-src="https://www.acmicpc.net/upload/images2/during_j1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td><img src="%EB%B0%B1%EC%A4%80/Gold/9441.%E2%80%85Cash%E2%80%85Cow/357767e0.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9441.%E2%80%85Cash%E2%80%85Cow/357767e0.png" data-original-src="https://www.acmicpc.net/upload/images2/after_j1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
		</tr>
		<tr>
			<td colspan="3">Figure 4: Processing a click on cell j1.</td>
		</tr>
	</tbody>
</table>

<table class="table table-bordered" style="height:204px; text-align:center; width:406px">
	<tbody>
		<tr>
			<td><img src="%EB%B0%B1%EC%A4%80/Gold/9441.%E2%80%85Cash%E2%80%85Cow/357767e0.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9441.%E2%80%85Cash%E2%80%85Cow/357767e0.png" data-original-src="https://www.acmicpc.net/upload/images2/after_j1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td><img src="%EB%B0%B1%EC%A4%80/Gold/9441.%E2%80%85Cash%E2%80%85Cow/92fc80b9.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9441.%E2%80%85Cash%E2%80%85Cow/92fc80b9.png" data-original-src="https://www.acmicpc.net/upload/images2/during_g2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td><img src="%EB%B0%B1%EC%A4%80/Gold/9441.%E2%80%85Cash%E2%80%85Cow/695f6c1c.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9441.%E2%80%85Cash%E2%80%85Cow/695f6c1c.png" data-original-src="https://www.acmicpc.net/upload/images2/after_g2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
		</tr>
		<tr>
			<td colspan="3">Figure 5: Processing a click on cell g2.</td>
		</tr>
	</tbody>
</table>

### 입력

<p>The input will consist of multiple games, each played with a new board. For each game, the input begins with a number <em>T</em> that denotes the number of turns that the player will be making, with 1 &le; <em>T</em> &le; 20. Following that will be an initial board configuration, which always has 12 rows and 10 columns per row, with uppercase letters used to denote distinct colors. There will never be empty cells within the initial board. Following the presentation of the initial board will be <em>T</em> additional lines of input, each designating a cell of the grid; we rely on the coordinate system illustrated in the above figures, with a lowercase letter, from <code>a</code> to <code>j</code>, denoting a column and a number from 1 to 12 that denotes a row. We note that if a player clicks on a grid cell that does not currently have any circle, that turn is simply wasted.</p>

<p>The end of the entire input will be designated by a line with the number 0.</p>

### 출력

<p>For each game, output a single line designating the the number of circles that remain on the board after all of the player&#39;s turns are processed.</p>
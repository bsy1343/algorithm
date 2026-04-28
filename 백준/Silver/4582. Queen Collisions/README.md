# [Silver III] Queen Collisions - 4582

[문제 링크](https://www.acmicpc.net/problem/4582)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 51, 정답: 32, 맞힌 사람: 26, 정답 비율: 57.778%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 구현, 집합과 맵

### 문제 설명

<table class="table table-bordered" style="height:277px; text-align:center; width:567px">
	<tbody>
		<tr>
			<td><img alt="no collisions" src="%EB%B0%B1%EC%A4%80/Silver/4582.%E2%80%85Queen%E2%80%85Collisions/83c611fa.png" data-original-src="https://www.acmicpc.net/upload/images2/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:201px; width:198px" /></td>
			<td><img alt="5x5 4 collisions" src="%EB%B0%B1%EC%A4%80/Silver/4582.%E2%80%85Queen%E2%80%85Collisions/ffa2b1e3.png" data-original-src="https://www.acmicpc.net/upload/images2/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:147px; width:143px" /></td>
			<td><img alt="size 8, 5 collisions" src="%EB%B0%B1%EC%A4%80/Silver/4582.%E2%80%85Queen%E2%80%85Collisions/ccf7a9d7.png" data-original-src="https://www.acmicpc.net/upload/images2/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:227px; width:223px" /></td>
		</tr>
		<tr>
			<td>Figure 1</td>
			<td>Figure 2</td>
			<td>Figure 3</td>
		</tr>
	</tbody>
</table>

<p>Lots of time has been spent by computer science students dealing with queens on a chess board. &nbsp;Two queens on a chessboard collide if they lie on the same row, column or diagonal, and there is no piece between them. &nbsp;Various sized square boards and numbers of queens are considered. &nbsp;For example, Figure 1, with a 7 x 7 board, contains 7 queens with no collisions. &nbsp;In Figure 2 there is a 5 x 5 board with 5 queens and 4 collisions. &nbsp;In Figure 3, a traditional 8 x 8 board, there are 7 queens and 5 collisions.&nbsp;</p>

<p>On an n x n board, queen positions are given in Cartesian coordinates (x, y) &nbsp;where x is a column number, 1 to n, and y is a row number, 1 to n. &nbsp;Queens at distinct positions (x1, y1) and (x2, y2) lie on the same diagonal if (x1- x2) and (y1- y2) have the same magnitude. &nbsp;They lie on the same row or column if x1= x2 or y1= y2, respectively. &nbsp;In each of these cases the queens have a collision if there is no other queen directly between them on the same diagonal, row, or column, respectively. &nbsp;For example, in Figure 2, the collisions are between the queens at (5, 1) and (4, 2), (4, 2) and &nbsp;(3, 3), (3, 3) and (2, 4), and &nbsp;finally (2, 4) and (1, 5). &nbsp;In Figure 3, the collisions are between the queens at (1, 8) and (4, 8), (4, 8) and (4, 7), (4, 7) and (6, 5), &nbsp;(7, 6) and (6, 5), and &nbsp;finally (6, 5) and (2, 1). &nbsp;Your task is to count queen collisions.</p>

<p>In many situations there are a number of queens in a regular pattern. For instance in Figure 1 there are 4 queens in a line at (1,1), (2, 3), (3, 5), and (4, 7). &nbsp;Each of these queens after the first at (1, 1) is one to the right and 2 up from the previous one. &nbsp;Three queens starting at (5, 2) follow a similar pattern. &nbsp;Noting these patterns can allow the positions of a large number of queens to be stated succinctly.</p>

### 입력

<p>The input will consist of one to twenty data sets, followed by a line containing only 0.</p>

<p>The first line of a dataset contains blank separated positive integers n g, where n indicates an n x n board size, and g is the number of linear patterns of queens to be described, where n &nbsp;&lt; 30000, and g &lt; 250. &nbsp;The next g lines each contain five blank separated integers, k x y s t, representing a linear pattern of k queens at locations (x + i*s, y +i*t), for i = 0, 1, ..., k-1. &nbsp;The value of k is positive. &nbsp;If k is 1, then the values of s and t are irrelevant, and they will be given as 0. &nbsp;All queen positions will be on the board. &nbsp;The total number of queen positions among all the linear patterns will be no more than n, and all these queen positions will be distinct.</p>

### 출력

<p>There is one line of output for each data set, containing only the number of collisions between the queens.</p>

<p>The sample input data set corresponds to the configuration in the Figures. &nbsp;</p>

<p>Take some care with your algorithm, or else your solution may take too long.</p>
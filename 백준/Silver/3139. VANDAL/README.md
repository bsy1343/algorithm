# [Silver II] VANDAL - 3139

[문제 링크](https://www.acmicpc.net/problem/3139)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 74, 정답: 24, 맞힌 사람: 23, 정답 비율: 37.705%

### 분류

수학, 많은 조건 분기

### 문제 설명

<p>In an effort to make his village a great tourist attraction, Mirko has drawn a big (N&times;N) white-gray chessboard on his village hall.&nbsp;</p>

<p>The rows and columns on the chessboard are numbered 1 to N. The bottom-left cell has coordinates (1, 1) and is colored grey. The diagonals of types 1 and 2 are numbered 1 through 2N-1, like in the following figure (with N=4).&nbsp;</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/3139.%E2%80%85VANDAL/de3cc664.png" data-original-src="https://upload.acmicpc.net/088d805b-f7f4-4e9c-bdea-7dec12dcb88e/-/crop/307x306/0,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 154px; height: 153px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/3139.%E2%80%85VANDAL/59d71a54.png" data-original-src="https://upload.acmicpc.net/088d805b-f7f4-4e9c-bdea-7dec12dcb88e/-/crop/305x306/359,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 153px; height: 153px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/3139.%E2%80%85VANDAL/69385b7f.png" data-original-src="https://upload.acmicpc.net/088d805b-f7f4-4e9c-bdea-7dec12dcb88e/-/crop/303x306/715,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 152px; height: 153px;" /></td>
		</tr>
		<tr>
			<td>Rows and columns</td>
			<td>Type 1 diagonals</td>
			<td>Type 2 diagonals</td>
		</tr>
	</tbody>
</table>

<p>The chessboard became a great attraction, but what Mirko didn&#39;t expect was that other people would become jealous of his creation. He was unpleasantly surprised when he saw that during the night a hooligan (vandal) ruined all the work he had done on the chessboard with just four brush strokes &ndash; he painted black all the cells in one row, one column, one diagonal of type 1 and one of type 2!&nbsp;</p>

<p>Before the workday begins, and the tourists rush to the village, he has to repaint all the cells the vandal painted, so that the chessboard looks exactly the same as before the incident.&nbsp;</p>

<p>Write a program that calculates the total number of cells that need to be repainted, and how many of them need to be painted white and grey.&nbsp;</p>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 10 000 000), the dimension of the chessboard.&nbsp;</p>

<p>The second line of input contains four integers. Those numbers represent, in order, the row, column, diagonal of type 1, and the diagonal of type 2 which the vandal painted in black.&nbsp;</p>

### 출력

<p>On the first line of output, output the total number of cells that need to be repainted.&nbsp;</p>

<p>On the second line, output how many of the cells need to be painted grey and how many white.&nbsp;</p>
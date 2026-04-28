# [Silver III] Flow Layout - 4632

[문제 링크](https://www.acmicpc.net/problem/4632)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 25, 맞힌 사람: 24, 정답 비율: 96.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>A flow layout manager takes rectangular objects and places them in a rectangular window from left to right. If there isn&#39;t enough room in one row for an object, it is placed completely below all the objects in the first row at the left edge, where the order continues from left to right again. Given a set of rectangular dimensions and a maximum window width, you are to write a program that computes the dimensions of the final window after all the rectangles have been placed in it.</p>

<p>For example, given a window that can be at most 35 units wide, and three rectangles with dimensions 10 x 5, &nbsp;20 x 12, and 8 x 13, the flow layout manager would create a window that looked like the figures below after each rectangle was added.</p>

<table class="table">
	<tbody>
		<tr>
			<td><img alt="insert 10x5 rectangle" src="%EB%B0%B1%EC%A4%80/Silver/4632.%E2%80%85Flow%E2%80%85Layout/1a3cb46b.gif" data-original-src="%EB%B0%B1%EC%A4%80/Silver/4632.%E2%80%85Flow%E2%80%85Layout/1a3cb46b.gif" data-original-src="https://www.acmicpc.net/upload/images2/fig1a.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td><img alt="insert 20x12 rectangle" src="%EB%B0%B1%EC%A4%80/Silver/4632.%E2%80%85Flow%E2%80%85Layout/eacc9041.gif" data-original-src="%EB%B0%B1%EC%A4%80/Silver/4632.%E2%80%85Flow%E2%80%85Layout/eacc9041.gif" data-original-src="https://www.acmicpc.net/upload/images2/fig1b.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
			<td><img alt="insert 8x13 rectangle" src="%EB%B0%B1%EC%A4%80/Silver/4632.%E2%80%85Flow%E2%80%85Layout/9d0bb5a9.gif" data-original-src="%EB%B0%B1%EC%A4%80/Silver/4632.%E2%80%85Flow%E2%80%85Layout/9d0bb5a9.gif" data-original-src="https://www.acmicpc.net/upload/images2/fig1c.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></td>
		</tr>
	</tbody>
</table>

<p>The final dimensions of the resulting window are 30 x 25, since the width of the first row is 10+20 = 30 and the combined height of the first and second rows is 12+13 = 25.</p>

### 입력

<p>The input consists of one or more sets of data, followed by a final line containing only the value 0. Each data set starts with a line containing an integer, m, 1 &le; m &le; 80, which is the maximum width of the resulting window. This is followed by at least one and at most 15 lines, each containing the dimensions of one rectangle, width first, then height. The end of the list of rectangles is signaled by the pair -1 -1, which is not counted as the dimensions of an actual rectangle. Each rectangle is between 1 and 80 units wide (inclusive) and between 1 and 100 units high (inclusive).</p>

### 출력

<p>For each input set print the width of the resulting window, followed by a space, then the lowercase letter &quot;x&quot;, followed by a space, then the height of the resulting window.</p>
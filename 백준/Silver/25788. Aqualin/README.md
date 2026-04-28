# [Silver I] Aqualin - 25788

[문제 링크](https://www.acmicpc.net/problem/25788)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 21, 맞힌 사람: 21, 정답 비율: 91.304%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 플러드 필

### 문제 설명

<p>The board game Aqualin is played on an n &times; n grid, where each grid cell is filled with a piece. Each piece is an animal of a particular color, i.e., each piece represents two properties: animal type and animal color. For simplicity, we assign letters &#39;A&#39; through &#39;Z&#39; for animal types and number the different colors 1 to n.</p>

<p>After each of the n<sup>2</sup> cells of the grid are filled, the game is scored. There are two teams.</p>

<p>The first team gets points for the largest connected component of animals of the same type that are size 2 or greater. Specifically, for each of the largest connected components of the same type of animals, the first player gets 1 + 2 + &hellip; + (c-1) points, where c is the number of animals in the component. For example, if there are connected components of 3 starfish (&#39;A&#39;), 4 octopi (&#39;B&#39;), 1 whale (&#39;C&#39;), and 2 starfish (&#39;A&#39;), then points would be awarded for only the first two groups of animals. Note that no score is awarded to a component of size 1 and, when there are several connected components of the same animal type, only the largest connected component is awarded points. Thus, in the case discussed above, the first team would get 1 + 2 = 3 points for the starfish, and 1 + 2 + 3 = 6 points for the octopi, for a total of 9 points. A connected component of animals is the set of animals you can reach directly or indirectly by traveling up, down, left or right in the grid by only going through animals of the same type.</p>

<p>The second team gets points for the largest connected component of animals of the same color. The scoring is the same as previously described, based on component size.</p>

<p>Here is an example 5 &times; 5 grid, filled out. In each cell, an ordered pair (x, y) indicates that the animal in that cell is of type x, color y.</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<td>(B,3)</td>
			<td>(A,1)</td>
			<td>(C,1)</td>
			<td>(A,2)</td>
			<td>(A,5)</td>
		</tr>
		<tr>
			<td>(B,4)</td>
			<td>(B,1)</td>
			<td>(B,5)</td>
			<td>(E,4)</td>
			<td>(E,3)</td>
		</tr>
		<tr>
			<td>(C,3)</td>
			<td>(C,2)</td>
			<td>(B,2)</td>
			<td>(D,2)</td>
			<td>(E,2)</td>
		</tr>
		<tr>
			<td>(A,3)</td>
			<td>(C,4)</td>
			<td>(A,4)</td>
			<td>(E,5)</td>
			<td>(D,1)</td>
		</tr>
		<tr>
			<td>(D,3)</td>
			<td>(C,5)</td>
			<td>(D,4)</td>
			<td>(D,5)</td>
			<td>(E,1)</td>
		</tr>
	</tbody>
</table>

<p>First, let&#39;s consider the score by animal type. There are two animals of type &#39;A&#39; in the top right corner for a score of 1. All five animals of type &#39;B&#39; are connected (look at top left) for a score of 10. Four animals of type &#39;C&#39; are connected, starting from the animal (C, 3) for a score of 6. Two animals of type &#39;D&#39; are connected, (D, 4) and (D, 5), for a score of 1. Three animals of type &#39;E&#39; are connected, (E, 4), (E, 3) and (E, 2), for a score of 3. The total score for the first team is 1 + 10 + 6 + 1 + 3 = 21.</p>

<p>There are three animals of color 1 connected at the top for a score of 3. Note that there are 2 other animals of color 1 connected in the bottom right corner, but this score doesn&#39;t count because we only count the largest connected component of a single type (or color) of an animal. There are 4 animals of color 2 connected (all on row 3) for a score of 6. There are 3 animals of color 3 connected (all on column 1) for a score of 3. There are 3 animals of color 4 connected, (C, 4), (A, 4) and (D, 4), for a score of 3. There are 2 animals of color 5 connected, (E, 5) and (D, 5), for a score of 1. The total score for the second team is 3 + 6 + 3 + 3 + 1 = 16.</p>

<p>Note: In the given example, there are five animal types and five animal colors. Although each of the 25 possible animal type/color combinations appeared exactly once in this example, this is not guaranteed to be true for all input grids. That is, some animal type/color combinations may appear more than once and some animal type/color combinations may not appear at all.</p>

<p>Given the contents of the grid at the end of a game, determine the score for both teams.</p>

### 입력

<p>The first input line contains a single integer: n (2 &le; n &le; 26), indicating the number of rows and columns in the game grid. Each of the following n input lines provides the contents of one row in the grid. Each row is represented by n terms, each term providing the type x (&#39;A&#39; &le; x &le; &#39;Z&#39;) and color y (1 &le; y &le; n) of the corresponding animal on the grid. Assume that the input rows start in column one and there is exactly one space separating different values on these input lines.</p>

### 출력

<p>Print, on a line by itself, the score for the first team, followed by a space, followed by the score for the second team.</p>
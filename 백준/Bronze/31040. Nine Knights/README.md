# [Bronze II] Nine Knights - 31040

[문제 링크](https://www.acmicpc.net/problem/31040)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 127, 정답: 95, 맞힌 사람: 77, 정답 비율: 73.333%

### 분류

구현

### 문제 설명

<p>In the game of chess, knights are underwhelming and unique. No other piece in chess moves like the knight in its &#39;L&#39; shaped pattern. The Knight moves in an L shape in any direction. We can say that it either moves two squares sideways and then one square up or down, or two squares up or down, and then one square sideways.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/31040.%E2%80%85Nine%E2%80%85Knights/a71c5bf3.png" data-original-src="https://upload.acmicpc.net/7e40759e-b018-4c58-a564-5422c81e6326/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 253px;" /></p>

<p style="text-align: center;">Figure 1: The highlighted squares show all possible moves for a knight.</p>

<p>The Knight changes the colour of the square it stands on with each move. Therefore, if it starts off on a light coloured square, when it has finished its move it will land on a dark coloured square. In the diagram the Knight can move to any of the red squares.</p>

<p>The formula for the maximum number of knights on a board are</p>

<blockquote>
<table border="0" class="table table-bordered">
	<tbody>
		<tr>
			<td rowspan="2">number of knights =</td>
			<td><code>(1/2)((n^2)+1) for n &gt; 1 &amp;&amp; n mod 2 == 1</code></td>
		</tr>
		<tr>
			<td><code>(1/2)(n^2) for n &gt; 2 &amp;&amp; n mod 2 == 0</code></td>
		</tr>
	</tbody>
</table>
</blockquote>

<p>In the nine knights puzzle, nine knights are positioned on a <code>5</code> by <code>5</code> board, even though you can fit a maximum of thirteen. The knights are placed so that they can coexist without attacking one another. The board below shows an invalid solution :</p>

<pre>
...k.
...k.
k.k..
.k.k.
k.k.k</pre>

<p>A solution is valid if and only if there are exactly nine knights on the board and no two knights are attacking one another.</p>

<p>Given the description of a chess board, your job is to determine whether or not it represents a valid solution to the nine knights puzzle.</p>

### 입력

<p>First line is the number of test cases. Followed will be that many number of <code>5 x 5</code> board configurations. Input lines will consist of only the characters &#39;.&#39; and &#39;k&#39;. The &#39;.&#39; character represents an empty space on the board, and the &#39;k&#39; character represents a knight. There is no blank line between boards in the input.</p>

### 출력

<p>Print a single line for each test case. Print the word &quot;valid&quot; if the given chess board is a valid solution to the nine knights problem. Otherwise, print &quot;invalid&quot;.</p>
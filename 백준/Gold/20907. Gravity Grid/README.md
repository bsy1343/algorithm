# [Gold I] Gravity Grid - 20907

[문제 링크](https://www.acmicpc.net/problem/20907)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 124, 정답: 41, 맞힌 사람: 36, 정답 비율: 37.895%

### 분류

구현, 자료 구조, 시뮬레이션, 분리 집합

### 문제 설명

<p>Alice and Bob are playing a generalized version of <em>Connect Four</em>. In their game, the board consists of $w$ columns of height $h$ and the goal is to be the first player to complete a row of $k$ tiles of equal colour, either vertically, horizontally or diagonally. The two players alternate dropping their tiles into one of the columns, with Alice using red tiles and going first and Bob using yellow tiles and going second. Once a tile is dropped, it falls down to the bottommost available position, making that position no longer available. Once a column has $h$ tiles in it, it becomes full and the players can no longer drop their tiles there.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20907.%E2%80%85Gravity%E2%80%85Grid/ff601842.png" data-original-src="https://upload.acmicpc.net/c61fe533-7ab2-4960-ad27-e67296dc1c48/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 95px;" /></p>

<p>Figure G.1:&nbsp;Visualisation of the sample cases, showing the state of the game after 0, 3, 8 and 12 moves, respectively. Alice&#39;s tiles are shown in red, Bob&#39;s tiles in yellow.</p>

<p>As Alice and Bob found it quite challenging to keep track of the winning condition, they just kept playing until the board was completely filled with tiles. They recorded a log of the moves they made and asked you to tell them who won the game, and on what turn they did so. If neither player managed to complete a row, the game ends in a draw, so report that instead.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with three integers $h$, $w$ and $k$ ($h, w \ge 1, h \cdot w \le 250\,000, 1 \le k \le \max(h,w)$). The columns are numbered from $1$ to $w$.</li>
	<li>One line with $h\cdot w$ integers $a_1,\dots,a_{h\cdot w}$ ($1 \le a_i \le w$ for each $i$), where $a_i$ is the index of the column that the $i$th tile was dropped in. Odd indices correspond to Alice&#39;s moves and even indices correspond to Bob&#39;s moves. Each column appears exactly $h$ times in this list.</li>
</ul>

### 출력

<p>Output the winner of the game (<code>A</code> for Alice or <code>B</code> for Bob), followed by the number of moves needed to decide the winner. If the game ends in a draw, output <code>D</code> instead.</p>
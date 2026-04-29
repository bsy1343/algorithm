# [Platinum I] Game of Annihilation - 32922

[문제 링크](https://www.acmicpc.net/problem/32922)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 19, 정답: 10, 맞힌 사람: 10, 정답 비율: 83.333%

### 분류

게임 이론, 구현, 누적 합

### 문제 설명

<p>Two players are playing a game on a tape divided into cells that is infinite to the right. The cells are numbered with $1, 2, 3, \ldots$ from left to right. Each cell $x$ is adjacent to cells $x - 1$ and $x + 1$, except for cell $1$, which is only adjacent to cell $2$.</p>

<p>There is a finite number of red chips (the first player's chips) and blue chips (the second player's chips) on the tape. Each cell contains either several red chips, or several blue chips, or no chips at all.</p>

<p>The players take turns. On their turn, a player can either skip the turn or take one of their chips and move it to an adjacent cell. If there are no opponent's chips in the adjacent cell, the turn ends; if there is at least one opponent's chip there, one chip from each player is removed from that cell --- thus, at the end of the turn, there will still be no two chips of different colors in the same cell.</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32922.%E2%80%85Game%E2%80%85of%E2%80%85Annihilation/7d5eb966.png" data-original-src="https://boja.mercury.kr/assets/problem/32922-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 190px; height: 160px;"></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32922.%E2%80%85Game%E2%80%85of%E2%80%85Annihilation/f4d57124.png" data-original-src="https://boja.mercury.kr/assets/problem/32922-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 192px; height: 160px;"></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32922.%E2%80%85Game%E2%80%85of%E2%80%85Annihilation/672ea2e4.png" data-original-src="https://boja.mercury.kr/assets/problem/32922-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 191px; height: 160px;"></td>
		</tr>
		<tr>
			<td>Moving to an empty cell</td>
			<td>Moving to a cell with your own chips</td>
			<td>Moving to a cell with your opponent's chips</td>
		</tr>
	</tbody>
</table>

<p>If both players run out of chips, the game ends in a draw. If only one player runs out of chips, they are declared the loser, and their opponent is declared the winner. Finally, if after $10^{100}$ turns the game has not ended, it is forcibly concluded and declared a draw.</p>

<p>You are given the initial setup of the tape. Determine who will win with perfect play from both players, and find any optimal first move for the first player.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 10^4$). The description of the test cases follows.</p>

<p>The first line of each test case contains a single integer $n$, denoting the number of cells that initially contain at least one chip ($2 \le n \le 2 \cdot 10^5$).</p>

<p>The $i$-th of the following $n$ lines contains two integers $x_i$, $m_i$, and a character $c_i$, denoting the coordinate of the $i$-th non-empty cell from the left, the number of chips in it, and the color of these chips ($1 \le x_1 &lt; x_2 &lt; \cdots &lt; x_n \le 10^6$; $1 \le m_i \le 10^6$; $c_i \in \{\mathtt{R}, \mathtt{B}\}$). There is at least one chip of each color on the tape.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $2 \cdot 10^5$.</p>

### 출력

<p>For each test case, print:</p>

<ul>
	<li>"<code>First</code> $x$ $d$", if the first player (moving red chips) will win;</li>
	<li>"<code>Second</code>", if the second player (moving blue chips) will win;</li>
	<li>"<code>Draw</code> $x$ $d$", if the outcome of the game will be a draw.</li>
</ul>

<p>In the first and third cases, $x$ $d$ specifies any winning or drawing move, respectively --- that is, a move after which, with perfect play from the second player, there remains a possibility to win or draw the game. Here, $x$ is the coordinate of the red chip that the first player should move, and $d \in \{$<code>-</code>, <code>+</code>$\}$ is the direction of the move ('<code>-</code>' means the chip should be moved to cell $x - 1$, and '<code>+</code>' means the chip should be moved to cell $x + 1$). If $d$ is '<code>-</code>', then $x$ must be greater than $1$. If you suggest that the first player skips their turn, print "<code>0 0</code>" instead of "$x$ $d$".</p>

<p>You can print each letter in upper- or lowercase: for instance, the strings "<code>First</code>", "<code>FIRST</code>", "<code>fiRST</code>" will be considered equivalent by the checker.</p>

### 힌트

<p>In the last test case, there is only one possible move besides "<code>1 +</code>", namely, "<code>0 0</code>" (skip the turn). It is a drawing move, though; hence, it will not be accepted.</p>
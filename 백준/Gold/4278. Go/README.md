# [Gold III] Go - 4278

[문제 링크](https://www.acmicpc.net/problem/4278)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>Go is played on a square board with an odd number of vertical and horizontal lines. The usual board sizes are 9x9, 13x13 and 19x19. But we&#39;ll assume the size in nxn for 3 &le; n &le; 19.</p>

<p>Black and White alternately play stones on the intersection between two lines. Black starts. At any time one player may pass - not play a stone - but if both players pass the game ends. We&#39;ll denote playing a stone by P(x,y) where P is either B (for Black) or W (for White) and (1-n)/2 &le; x,y &amp;le (n-1)/2 gives the grid position of the stone to be played. The centre intersection of the board has coordinates (0,0).</p>

<p>The rules of Go are reasonably straightforward, but the nuances of strategy make it an extremely challenging game. You are to use the following rules.</p>

<ul>
	<li>Black plays first.</li>
	<li>Black and White alternate; at each turn a player may place a stone or may pass. The game ends when Black and White pass consecutively.</li>
	<li>A stone may be played only on an unoccupied intersection.</li>
	<li>If one player P places a stone so that his or her stones (along with the edge of the board) completely surround a connected area occupied by stones belonging to the other player, Q, Q&#39;s stones are said to be captured and removed from the board. More precisely, two intersections are connected if they are horizontally or vertically (but not diagonally) adjacent. Stones in an area are completely surrounded if no stone is connected with a vacant intersection.</li>
	<li>If P places a stone that causes Q&#39;s stones to be captured, P&#39;s stone is not captured.</li>
	<li>A connected area surrounded by P&#39;s stones which contains none of Q&#39;s stones is said to be owned by P.</li>
	<li>The score for player P is the number of vacant intersections owned by P in the final board configuration plus the number of Q&#39;s stones captured by P at any time during the game.</li>
</ul>

### 입력

<p>The input consists of several test cases. Each test case begins with a line containing n - the size of the board - and m - the number of stones placed in the game. m lines follow, each giving a placement in the format above. Note that m counts only stone placements - passes may result in two consecutive placements by the same player. You may assume that each move is legal. A line containing 0 0 follows the last test case.</p>

### 출력

<p>For each test case, output a line with two numbers: Black&#39;s score followed by White&#39;s score.</p>
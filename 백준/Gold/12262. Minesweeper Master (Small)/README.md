# [Gold IV] Minesweeper Master (Small) - 12262

[문제 링크](https://www.acmicpc.net/problem/12262)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 21, 맞힌 사람: 20, 정답 비율: 57.143%

### 분류

해 구성하기, 백트래킹

### 문제 설명

<p><em>Minesweeper</em>&nbsp;is a computer game that became popular in the 1980s, and is still included in some versions of the&nbsp;<em>Microsoft Windows</em>&nbsp;operating system. This problem has a similar idea, but it does not assume you have played&nbsp;<em>Minesweeper</em>.</p>

<p>In this problem, you are playing a game on a grid of identical cells. The content of each cell is initially hidden. There are&nbsp;<strong>M</strong>&nbsp;mines hidden in&nbsp;<strong>M</strong>&nbsp;different cells of the grid. No other cells contain mines. You may click on any cell to reveal it. If the revealed cell contains a mine, then the game is over, and you lose. Otherwise, the revealed cell will contain a digit between 0 and 8, inclusive, which corresponds to the number of neighboring cells that contain mines. Two cells are neighbors if they share a corner or an edge. Additionally, if the revealed cell contains a 0, then all of the neighbors of the revealed cell are automatically revealed as well, recursively. When all the cells that don&#39;t contain mines have been revealed, the game ends, and you win.</p>

<p>For example, an initial configuration of the board may look like this (&#39;*&#39; denotes a mine, and &#39;c&#39; is the first clicked cell):</p>

<p>* . . * . . . * * .</p>

<p>. . . . * . . . . .</p>

<p>. . c . . * . . . .&nbsp;</p>

<p>. . . . . . . .&nbsp;* .&nbsp;</p>

<p>. . . . . . . . . .&nbsp;</p>

<p>There are no mines adjacent to the clicked cell, so when it is revealed, it becomes a 0, and its 8 adjacent cells are revealed as well. This process continues, resulting in the following board:</p>

<p>* . . * &nbsp;. . . * * .&nbsp;</p>

<p>1 1 1 2 *&nbsp;. . . . .&nbsp;</p>

<p>000 1 2 * . . . .</p>

<p>0000 1 1 1 1 *.</p>

<p>0000000 1 . .</p>

<p>At this point, there are still un-revealed cells that do not contain mines (denoted by &#39;.&#39; characters), so the player has to click again in order to continue the game.</p>

<p>You want to win the game as quickly as possible. There is nothing quicker than winning in one click. Given the size of the board (<strong>R</strong>&nbsp;x&nbsp;<strong>C</strong>) and the number of hidden mines&nbsp;<strong>M</strong>, is it possible (however unlikely) to win in one click? You may choose where you click. If it is possible, then print any valid mine configuration and the coordinates of your click, following the specifications in the&nbsp;<em>Output</em>&nbsp;section. Otherwise, print &quot;Impossible&quot;.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> lines follow. Each line contains three space-separated integers: <strong>R</strong>, <strong>C</strong>, and <strong>M</strong>.</p>

<p>Limits</p>

<ul>
	<li>0 &le; <strong>M</strong> &lt; <strong>R</strong> * <strong>C</strong>.</li>
	<li>1 &le; <strong>T</strong> &le; 230.</li>
	<li>1 &le; <strong>R</strong>, <strong>C</strong> &le; 5.</li>
</ul>

### 출력

<p>For each test case, output a line containing &quot;Case #x:&quot;, where x is the test case number (starting from 1). On the following <strong>R</strong> lines, output the board configuration with <strong>C</strong> characters per line, using &#39;.&#39; to represent an empty cell, &#39;*&#39; to represent a cell that contains a mine, and &#39;c&#39; to represent the clicked cell.</p>

<p>If there is no possible configuration, then instead of the grid, output a line with &quot;Impossible&quot; instead. If there are multiple possible configurations, output any one of them.</p>
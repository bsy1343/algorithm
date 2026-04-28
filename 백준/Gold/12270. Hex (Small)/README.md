# [Gold III] Hex (Small) - 12270

[문제 링크](https://www.acmicpc.net/problem/12270)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 14, 맞힌 사람: 10, 정답 비율: 47.619%

### 분류

(분류 없음)

### 문제 설명

<p>This problem was inspired by a board game called Hex, designed independently by Piet Hein and John Nash. It has a similar idea, but does not assume you have played Hex.</p>

<p>This game is played on an&nbsp;<strong>N</strong>x<strong>N</strong>&nbsp;board, where each cell is a hexagon. There are two players: Red side (using red stones) and Blue side (using blue stones). The board starts empty, and the two players take turns placing a stone of their color on a single cell within the overall playing board. Each player can place their stone on any cell not occupied by another stone of any color. There is no requirement that a stone must be placed beside another stone of the same color. The player to start first is determined randomly (with equal probability among the two players).</p>

<p>The upper side and lower sides of the board are marked as red, and the other two sides are marked as blue. The goal of the game is to form a connected path of one player&#39;s stones connecting the two sides of the board that have that player&#39;s color. The first player to achieve this wins. Note that the four corners are considered connected to both colors.</p>

<p>The game ends immediately when one player wins.</p>

<p>Given a game state, help someone new to the game determine the status of a game board. Say one of the following:</p>

<ul>
	<li>&quot;<strong>Impossible</strong>&quot;: If it was impossible for two players to follow the rules and to have arrived at that game state.</li>
	<li>&quot;<strong>Red wins</strong>&quot;: If the player playing the red stones has won.</li>
	<li>&quot;<strong>Blue wins</strong>&quot;: If the player playing the blue stones has won.</li>
	<li>&quot;<strong>Nobody wins</strong>&quot;: If nobody has yet won the game. Note that a game of Hex can&#39;t end without a winner!</li>
</ul>

<p>Note that in any impossible state, the only correct answer is &quot;Impossible&quot;, even if red or blue has formed a connected path of stones linking the opposing sides of the board marked by his or her colors.&nbsp;</p>

<p>Here&#39;s a an example game on a 6x6 gameboard where blue won. Blue was the first player to move, and placed a blue stone at cell marked as 1. Then Red placed at cell 2, then blue at cell 3, etc. After the 11th stone is placed, blue wins.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12270.%E2%80%85Hex%E2%80%85(Small)/ead28445.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12270/images-58.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:185px; width:320px" /></p>

### 입력

<p>The first line of input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each test case start with the size of the side of the board, <strong>N</strong>. This is followed by a board of <strong>N</strong> rows and <strong>N</strong> columns consisting of only &#39;B&#39;, &#39;R&#39; and &#39;.&#39; characters. &#39;B&#39; indicates a cell occupied by blue stone, &#39;R&#39; indicates a cell occupied by red stone, and &#39;.&#39; indicates an empty cell.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li><span style="line-height:1.6em">1 &le; </span><strong style="line-height:1.6em">N</strong><span style="line-height:1.6em"> &le; 10.</span></li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the status of the game board. It can be &quot;Impossible&quot;, &quot;Blue wins&quot;, &quot;Red wins&quot; or &quot;Nobody wins&quot; (excluding the quotes). Note that the judge is case-sensitive, so answers of &quot;impossible&quot;, &quot;blue wins&quot;, &quot;red wins&quot; and &quot;nobody wins&quot; will be judged incorrect.</p>
# [Gold V] Rotate (Large) - 12584

[문제 링크](https://www.acmicpc.net/problem/12584)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 33, 맞힌 사람: 33, 정답 비율: 89.189%

### 분류

브루트포스 알고리즘, 구현, 시뮬레이션

### 문제 설명

<p>In the exciting game of Join-<strong>K</strong>, red and blue pieces are dropped into an&nbsp;<strong>N</strong>-by-<strong>N</strong>&nbsp;table. The table stands up vertically so that pieces drop down to the bottom-most empty slots in their column. For example, consider the following two configurations:</p>

<table style="border-collapse:collapse; border-width:0pt; color:rgb(0, 0, 0); font-family:arial,sans-serif; font-size:small; margin:0px; padding:0px; vertical-align:top">
	<tbody>
		<tr>
			<td style="vertical-align:top">
			<pre>
    <strong>- Legal Position -</strong>

          .......
          .......
          .......
          ....R..
          ...RB..
          ..BRB..
          .RBBR..
</pre>
			</td>
			<td style="vertical-align:top">
			<pre>
   <strong>- Illegal Position -</strong>

          .......
          .......
          .......
          .......
   Bad -&gt; ..BR...
          ...R...
          .RBBR..
</pre>
			</td>
		</tr>
	</tbody>
</table>

<p>In these pictures, each &#39;.&#39; represents an empty slot, each &#39;R&#39; represents a slot filled with a red piece, and each &#39;B&#39; represents a slot filled with a blue piece. The left configuration is legal, but the right one is not. This is because one of the pieces in the third column (marked with the arrow) has not fallen down to the empty slot below it.</p>

<p>A player wins if they can place at least&nbsp;<strong>K</strong>&nbsp;pieces of their color in a row, either horizontally, vertically, or diagonally. The four possible orientations are shown below:</p>

<table style="border-collapse:collapse; border-width:0pt; color:rgb(0, 0, 0); font-family:arial,sans-serif; font-size:small; margin:0px; padding:0px; vertical-align:top">
	<tbody>
		<tr>
			<td style="vertical-align:top">
			<pre>
      <strong>- Four in a row -</strong>

     R   RRRR    R   R
     R          R     R
     R         R       R
     R        R         R
</pre>
			</td>
			<td style="vertical-align:top">&nbsp;</td>
		</tr>
	</tbody>
</table>

<p>In the &quot;Legal Position&quot; diagram at the beginning of the problem statement, both players had lined up two pieces in a row, but not three.</p>

<p>As it turns out, you are right now playing a very exciting game of Join-<strong>K</strong>, and you have a tricky plan to ensure victory! When your opponent is not looking, you are going to rotate the board 90 degrees clockwise onto its side. Gravity will then cause the pieces to fall down into a new position as shown below:</p>

<table style="border-collapse:collapse; border-width:0pt; color:rgb(0, 0, 0); font-family:arial,sans-serif; font-size:small; margin:0px; padding:0px; vertical-align:top">
	<tbody>
		<tr>
			<td style="vertical-align:top">
			<pre>
    <strong>- Start -</strong>

     .......
     .......
     .......
     ...R...
     ...RB..
     ..BRB..
     .RBBR..
</pre>
			</td>
			<td style="vertical-align:top">
			<pre>
   <strong>- Rotate -</strong>

     .......
     R......
     BB.....
     BRRR...
     RBB....
     .......
     .......
</pre>
			</td>
			<td style="vertical-align:top">
			<pre>
   <strong>- Gravity -</strong>

     .......
     .......
     .......
     R......
     BB.....
     BRR....
     RBBR...
</pre>
			</td>
		</tr>
	</tbody>
</table>

<p>Unfortunately, you only have time to rotate once before your opponent will notice.</p>

<p>All that remains is picking the right time to make your move. Given a board position, you should determine which player (or players!) will have&nbsp;<strong>K</strong>&nbsp;pieces in a row after you rotate the board clockwise and gravity takes effect in the new direction.</p>

<h3>Notes</h3>

<ul>
	<li>You can rotate the board only once.</li>
	<li>Assume that gravity only takes effect after the board has been rotated completely.</li>
	<li>Only check for winners after gravity has finished taking effect.</li>
</ul>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow, each beginning with a line containing the integers&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>K</strong>. The next&nbsp;<strong>N</strong>&nbsp;lines will each be exactly&nbsp;<strong>N</strong>&nbsp;characters long, showing the initial position of the board, using the same format as the diagrams above.</p>

<p>The initial position in each test case will be a legal position that can occur during a game of Join-<strong>K</strong>. In particular, neither player will have already formed&nbsp;<strong>K</strong>&nbsp;pieces in a row.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>3 &le;&nbsp;<strong>K</strong>&nbsp;&le;&nbsp;<strong>N</strong>.</li>
	<li>3 &le;&nbsp;<strong>N</strong>&nbsp;&le; 50.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1), and y is one of &quot;Red&quot;, &quot;Blue&quot;, &quot;Neither&quot;, or &quot;Both&quot;. Here, y indicates which player or players will have&nbsp;<strong>K</strong>&nbsp;pieces in a row after you rotate the board.</p>
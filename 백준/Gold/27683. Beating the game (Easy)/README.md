# [Gold III] Beating the game (Easy) - 27683

[문제 링크](https://www.acmicpc.net/problem/27683)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 7, 맞힌 사람: 5, 정답 비율: 45.455%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>You have probably heard about or played the game &ldquo;<a href="http://gabrielecirulli.github.io/2048/">2048</a>&rdquo;. (No! Don&rsquo;t click the link now, bookmark it and go there after the contest!) The game is usually played on a 4 &times; 4 grid. Some cells of the grid contain tiles that have positive powers of 2 written on them. When the player chooses a direction, the tiles shift in that direction. If two equal tiles collide, they merge into a tile with their sum (the next power of 2).</p>

<p>There are also many derivatives of this game, with Fibonacci numbers, subatomic particles, or even Doge and Flappy Bird. Your friends are all raving about a new version that is played on a one-dimensional strip. This version is described below.</p>

<p>The game is played on an 1 &times; <em>n</em> strip of cells. As usual, some of its cells are empty and some contain tiles with positive powers of two. Each move consists of three parts:</p>

<ul>
	<li>
	<p>First, the player chooses a direction &ndash; either left or right.</p>
	</li>
	<li>
	<p>Next, all tiles move in the chosen direction as far as they can. If a tile collides with another tile that has the same number, they merge together.</p>
	</li>
	<li>
	<p>If at least one tile moved or merged with another one in the previous step, a new tile randomly appears on one of the currently empty cells. The number on the new tile is usually a 2, but occasionally a 4.</p>
	</li>
</ul>

<p>The game ends when there is no move that would change the game state.</p>

<p>Moves and merges</p>

<p>When the player chooses a direction for tile movement, all tiles move in that direction one after another, starting with the tile that is closest to the target boundary. Whenever a tile collides into another tile that also has the same integer, the two tiles merge into one tile that has the sum of their numbers. The merged tile will occupy the cell that is closer to the target boundary, and cannot merge again in the current turn. All further collisions with the new tile are ignored.</p>

<p>Below are some examples to clarify these rules.</p>

<p>In our first example, the left diagram shows the original state and the right diagram the state after a move to the left (after all collisions are resolved and before the new random tile appears). Note that the two 4s did not merge into an 8.</p>

<pre>
<code>  +---+---+---+---+---+---+---+---+     +---+---+---+---+---+---+---+---+
  | 2 |   | 2 | 2 | 2 |   |   | 2 |     | 4 | 4 | 2 |   |   |   |   |   |
  +---+---+---+---+---+---+---+---+     +---+---+---+---+---+---+---+---+</code></pre>

<p>Our second example shows a move to the right from the same initial situation. Note that different pairs of tiles merged this time &ndash; the ones closer to the right boundary.</p>

<pre>
<code>  +---+---+---+---+---+---+---+---+     +---+---+---+---+---+---+---+---+
  | 2 |   | 2 | 2 | 2 |   |   | 2 |     |   |   |   |   |   | 2 | 4 | 4 |
  +---+---+---+---+---+---+---+---+     +---+---+---+---+---+---+---+---+</code></pre>

<p>For our final example, consider the situation shown in the left diagram below. In this situation, you can still move to the right &ndash; even though there is no space for the tiles to move, two of them can merge.</p>

<p>The result of a move to the right is shown in the right diagram below. Note that the two 8s did not merge, as one of them was created by a merge in this move. Also note that the 2 did shift to the right after the two tiles with 4 merged into an 8.</p>

<pre>
<code>  +---+---+---+---+---+---+---+---+     +---+---+---+---+---+---+---+---+
  |   |   |   |   | 2 | 4 | 4 | 8 |     |   |   |   |   |   | 2 | 8 | 8 |
  +---+---+---+---+---+---+---+---+     +---+---+---+---+---+---+---+---+</code></pre>

<p>The player scores points for merging tiles. Merging two tiles with values <em>x</em>/2 into a new tile with value <em>x</em> is worth <em>x</em> points.</p>

<p>Pseudorandom generator</p>

<p>If at least one tile moved or merged with another one, a new tile randomly appears on one of the currently empty cells. Let <code>num_empty</code> be the number of currently empty cells. (Since at least one tile moved or merged, it must be at least 1.) The new tile&rsquo;s position and value is chosen with the following pseudocode:</p>

<pre>
<code>pos = random() % num_empty

if (random() % 10) == 0:
    new_value = 4
else:
    new_value = 2

add_new_tile(cell = currently_empty_cells[pos], value = new_value)</code></pre>

<p>In the pseudocode, <code>currently_empty_cells</code> is a list of all cells that are currently empty, from left to right. For example, if <code>pos</code> is 0 and <code>new_value</code> is 2, a new tile with the number 2 is created on the <em>leftmost</em> currently empty cell. The <code>%</code> symbol is the modulo operator.</p>

<p>To generate the values returned by <code>random()</code>, the game uses a deterministic pseudorandom generator: the <a href="http://en.wikipedia.org/wiki/Subtract_with_carry">subtraction with carry</a> generator with values (<em>r</em>, <em>s</em>, <em>m</em>) = (43, 22, 2<sup>32</sup>).</p>

<p>You know the initial seed of the pseudorandom generator: values <em>x</em><sub>0</sub> through <em>x</em><sub>42</sub>. Each of the following values is generated using this formula:</p>

<p style="text-align: center;">&forall;i &ge; 43: x<sub>i</sub> = (x<sub>i&minus;s</sub> &minus; x<sub>i&minus;r</sub> &minus; c(i &minus; 1)) mod m</p>

<p>In the above formula, &ldquo;mod&rdquo; is the mathematical modulo operator that always returns a value between 0 and <em>m</em> &minus; 1, inclusive. The function <em>c</em>(<em>i</em>) is equal to 1 if <em>i</em> &ge; 43 and <em>x</em><sub><em>i</em> &minus; <em>s</em></sub> &minus; <em>x</em><sub><em>i</em> &minus; <em>r</em></sub> &minus; <em>c</em>(<em>i</em> &minus; 1) &lt; 0, and 0 otherwise.</p>

<p>The values <em>x</em><sub>43</sub>, <em>x</em><sub>44</sub>, &hellip; are the output of the pseudorandom generator. That is, the first call to <code>random()</code> returns the value <em>x</em><sub>43</sub>, and so on.</p>

<p>(You can check your implementation with this: If you set <em>x</em><sub>0</sub>, <em>x</em><sub>1</sub>, &hellip;, <em>x</em><sub>42</sub> to be x<sub>i</sub> = (999999999i<sup>3</sup>) mod m, the next three generated values should be 1050500563, 4071029865 and 4242540160.)</p>

<p>You decided to use your knowledge of the pseudorandom generator to cheat and defeat your friends by getting the highest score you possibly can.</p>

<p>You are given the current state of a rather long strip, the values <em>x</em><sub>0</sub> through <em>x</em><sub>42</sub>, and a sequence of attempted moves. Your task is to simulate the moves and output the game&rsquo;s final state.</p>

### 입력

<p>The first line of the input file contains an integer <em>t</em> &le; 50 specifying the number of test cases. Each test case is preceded by a blank line.</p>

<p>The first line of each test case contains an integer <em>n</em>, the length of the strip. For the easy subproblem B1 we have 2 &le; <em>n</em> &le; 1000, for the hard subproblem B2 we have 2 &le; <em>n</em> &le; 9.</p>

<p>The second line contains <em>n</em> integers, each of them either 0 (denoting an empty cell) or a power of two between 2 and 2<sup>62</sup>, inclusive (denoting a tile with that number). These describe the current state from the left to the right. In the hard subproblem B2, <em>n</em> &minus; 1 of these integers are 0 and the remaining one is either 2 or 4.</p>

<p>The third line contains 43 integers: <em>x</em><sub>0</sub>, <em>x</em><sub>1</sub>, &hellip;, <em>x</em><sub>42</sub>. Each of them is between 0 and <em>m</em> &minus; 1 (inclusive) and we chose them randomly.</p>

<p>The fourth line contains an integer <em>a</em> (1 &le; <em>a</em> &le; 5000): the number of attempted moves.</p>

<p>The fifth line contains a string of <em>a</em> characters. Each of these characters is either &lsquo;<code>l</code>&rsquo; (representing a move to the left) or &lsquo;<code>r</code>&rsquo; (move to the right).</p>

### 출력

<p>For each test case, output a single line with <em>n</em> space-separated numbers &ndash; the state of the strip after performing all the moves, in the same format as in the input. (Note that some of the numbers in the output may be rather large.)</p>
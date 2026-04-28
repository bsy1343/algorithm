# [Gold II] Pebbling odometer 2 - 20108

[문제 링크](https://www.acmicpc.net/problem/20108)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 78, 정답: 32, 맞힌 사람: 28, 정답 비율: 40.000%

### 분류

해 구성하기

### 문제 설명

<p>Leonardo invented the original odometer: a cart which could measure distances by dropping pebbles as the cart&#39;s wheels turned. Counting the pebbles gave the number of turns of the wheel, which allowed the user to compute the distance travelled by the odometer. As computer scientists, we have added software control to the odometer, extending its functionalities. Your task is to program the odometer under the rules specified below.</p>

<p><strong>Operation grid</strong></p>

<p>The odometer moves on an imaginary square grid of 256 &times; 256 unit cells. Each cell can contain at most 15 pebbles and is identified by a pair of coordinates (row, column), where each coordinate is in the range 0, &hellip;, 255. Given a cell (i, j), the cells adjacent to it are (if they exist) (i - 1, j), (i + 1, j), (i, j - 1) and (i, j + 1). Any cell laying on the first or last row, or on the first or last column, is called a border. The odometer always starts at cell (0, 0) (the north-west corner), facing north.</p>

<p><strong>Basic commands</strong></p>

<p>The odometer can be programmed using the following commands.</p>

<ul>
	<li><code>left</code> &mdash; turn 90 degrees to the left (counter clockwise) and remain in the current cell (e.g. if it was facing south before, then it will face east after the command).</li>
	<li><code>right</code> &mdash; turn 90 degrees to the right (clockwise) and remain in the current cell (e.g. if it was facing west before, then it will face north after the command).</li>
	<li><code>move</code> &mdash; move one unit forwards (in the direction the odometer is facing) into an adjacent cell. If no such cell exists (i.e. the border in that direction has been already reached) then this command has no effect.</li>
	<li><code>get</code> &mdash; remove one pebble from the current cell. If the current cell has no pebbles, then the command has no effect.</li>
	<li><code>put</code> &mdash; add one pebble to the current cell. If the current cell already contains 15 pebbles, then the command has no effect. The odometer never runs out of pebbles.</li>
	<li><code>halt</code> &mdash; terminate the execution.</li>
</ul>

<p>The odometer executes the commands in the order they are given in the program. The program must contain at most one command per line. Empty lines are ignored. The symbol <code>#</code> indicates a comment; any text that follows, up to the end of the line, is ignored. If the odometer reaches the end of the program, execution is terminated.</p>

<p><strong>Example 1</strong></p>

<p>Consider the following program for the odometer. It takes the odometer to the cell (0, 2), facing east. (Note that the first <code>move</code> is ignored, because the odometer is on the north-west corner facing north.)</p>

<pre>
move # no effect
right
# now the odometer is facing east
move
move</pre>

<p><strong>Labels, borders and pebbles</strong></p>

<p>To alter the flow of the program depending on the current status, you can use labels, which are case-sensitive strings of at most 128 symbols chosen from <code>a</code>, &hellip;, <code>z</code>, <code>A</code>, &hellip;, <code>Z</code>, <code>0</code>, &hellip;, <code>9</code>. The new commands concerning labels are listed below. In the descriptions below, <em><code>L</code></em> denotes any valid label.</p>

<ul>
	<li><code><em>L</em>:</code> (i.e. <em><code>L</code></em> followed by a colon &lsquo;<code>:</code>&rsquo;) &mdash; declares the location within a program of a label <em><code>L</code></em>. All declared labels must be unique. Declaring a label has no effect on the odometer.</li>
	<li><code>jump <em>L</em></code> &mdash; continue the execution by unconditionally jumping to the line with label <em><code>L</code></em>.</li>
	<li><code>border <em>L</em></code> &mdash; continue the execution jumping to the line with label <em><code>L</code></em>, if the odometer is on a border facing the edge of the grid (i.e. a <code>move</code> instruction would have no effect); otherwise, the execution continues normally and this command has no effect.</li>
	<li><code>pebble <em>L</em></code> &mdash; continue the execution jumping to the line with label <code><em>L</em></code>, if the current cell contains at least one pebble; otherwise, the execution continues normally and this command has no effect.</li>
</ul>

<p><strong>Example 2</strong></p>

<p>The following program locates the first (westmost) pebble in row 0 and stops there; if there are no pebbles in row 0, it stops on the border at the end of the row. It uses two labels <code>leonardo</code> and <code>davinci</code>.</p>

<pre>
right
leonardo:
pebble davinci # pebble found
border davinci # end of the row
move
jump leonardo
davinci:
halt</pre>

<p>The odometer starts by turning to its right. The loop begins with the label declaration <code>leonardo:</code> and ends with the <code>jump leonardo</code> command. In the loop, the odometer checks for the presence of a pebble or the border at the end of the row; if not so, the odometer makes a <code>move</code> from the current cell (0, j) to the adjacent cell (0, j + 1) since the latter exists. (The <code>halt</code> command is not strictly necessary here as the program terminates anyway.)</p>

<p>You should submit a program in the odometer&#39;s own language, as described above, that makes the odometer behave as expected. Each subtask (see below) specifies a behavior the odometer is required to fulfill and the constraints the submitted solution must satisfy. The constraints concern the two following matters.</p>

<ul>
	<li>Program size &mdash; the program must be short enough. The size of a program is the number of commands in it. Label declarations, comments and blank lines are not counted in the size.</li>
	<li>Execution length &mdash; the program must terminate fast enough. The execution length is the number of performed steps: every single command execution counts as a step, regardless of whether the command had an effect or not; label declarations, comments and blank lines do not count as a step.</li>
</ul>

<p>In Example 1, the program size is 4 and the execution length is 4. In Example 2, the program size is 6 and, when executed on a grid with a single pebble in cell (0, 10), the execution length is 43 steps: right, 10 iterations of the loop, each iteration taking 4 steps (<code>pebble davinci; border davinci; move; jump leonardo</code>), and finally, <code>pebble davinci</code> and <code>halt</code>.</p>

<p>At the beginning there are x pebbles in cell (0, 0) and y in cell (0, 1), whereas all the other cells are empty. Remember that there can be at most 15 pebbles in any cell. Write a program that terminates with the odometer in cell (0, 0) if x &le; y, and in cell (0, 1) otherwise.&nbsp;The cell (0, 0) must contain exactly x pebbles and cell (0, 1) must contain exactly y pebbles.</p>

### 입력



### 출력



### 제한

<ul>
	<li>program size &le; 200</li>
	<li>execution length &le; 2 000.</li>
</ul>
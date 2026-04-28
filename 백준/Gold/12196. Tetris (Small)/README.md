# [Gold IV] Tetris (Small) - 12196

[문제 링크](https://www.acmicpc.net/problem/12196)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 61, 정답: 27, 맞힌 사람: 24, 정답 비율: 42.105%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Tetris is a famous video game that almost everyone has played it. In this problem, you need to simulate a simplified version of it.</p>

<p>In our version, the game is played in a&nbsp;<b>W</b>&nbsp;by&nbsp;<b>H</b>&nbsp;field with gravity. At the beginning, the field is empty. Then the tetrominos start to fall from above top of the field to bottom of the field, one by one. Each tetromino will stop as soon as it touches some other tetrominos or bottom of the field.</p>

<p>One interesting feature of the game is called &quot;line clearing&quot;. A line will be cleared as soon as it is filled by tetrominos. More than one line may be cleared at a time. For example:</p>

<pre>
<code>  |..............|      |..............|      |..............|
  |.............o|      |..............|      |..............|
  |.............o|      |..............|      |..............|
  |.............o|      |..............|      |..............|
  |.............o|      |..............|      |..............|
  |..xx..........| --&gt;  |..xx..........| --&gt;  |..............|
  |xxxxxxxxxxxxx.|      |xxxxxxxxxxxxxo|      |..............|
  |xxxxxxxxxxxxx.|      |xxxxxxxxxxxxxo|      |..xx..........|
  |xx..xxxxxxxxx.|      |xx..xxxxxxxxxo|      |xx..xxxxxxxxxo|
  |xxxxxxxxxxx...|      |xxxxxxxxxxx..o|      |xxxxxxxxxxx..o|
  ----------------      ----------------      ----------------

  Falling               Stopped               Cleared 2 lines
</code></pre>

<p>Note that in this simplified version, the &quot;floating&quot; tetromino blocks won&#39;t continue to fall after lines are cleared. This is why the top-most two squares will keep in such position. Consequently, cascade clearing won&#39;t happen, even though it would happen in the original version of Tetris.</p>

<p>The game ends when all the given tetrominos are placed, or the current tetromino cannot be placed due to the height limit of the field is reached.</p>

<p>In this problem, each tetromino will has its type, rotation and falling position told by the input. They will start to fall from the&nbsp;<b>above</b>&nbsp;of the field. Your goal is to simulate and get the final result of each play.</p>

### 입력

<p>We have 7 types of tetromino:</p>

<pre>
<code>1   2   3   4   5   6   7

x    x  x    x  xx  x    x
xx  xx  x    x  xx  x   xxx
 x  x   xx  xx      x
                    x
</code></pre>

<p>Rotation of a tetromino is represented by a number&nbsp;<b>r</b>.&nbsp;<b>r</b>&nbsp;can be 0, 1, 2 or 3. Rotation is counterclockwise. For example:</p>

<pre>
<code>r=0   r=1  r=2   r=3

  x     x   xxx   x
 xxx   xx    x    xx
        x         x

 x     xx   x     xx
 xx   xx    xx   xx
  x          x
</code></pre>

<p>The horizontal falling position is represented by a number&nbsp;<b>x</b>. It is the coordinate of the lower left square of a tetromino&#39;s bounding box. Here&nbsp;<b>x</b>&nbsp;starts from 0.</p>

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>. For each test case, the first line of input has 3 integers,&nbsp;<b>W, H, N</b>.&nbsp;<b>W</b>&nbsp;is the width,&nbsp;<b>H</b>&nbsp;is the height and&nbsp;<b>N</b>&nbsp;is the number of blocks that are going to fall.</p>

<p>Then&nbsp;<b>N</b>&nbsp;lines below, each line has 3 integers,&nbsp;<b>t<sub>i</sub>, r<sub>i</sub>, x<sub>i</sub></b>.&nbsp;<b>t<sub>i</sub></b>&nbsp;tells the tetromino type.&nbsp;<b>r<sub>i</sub></b>&nbsp;is the rotation of this tetromino.&nbsp;<b>x<sub>i</sub></b>&nbsp;is the horizontal falling position of this tetromino. It is guaranteed that&nbsp;<b>x<sub>i</sub></b>&nbsp;will make the tetromino inside the field, horizontally.</p>

### 출력

<p>For each test case, first output one line containing &quot;Case #i:&quot;, where&nbsp;<b>i</b>&nbsp;is the test case number (starting from 1). And then, if the game ends before the&nbsp;<b>N</b>&nbsp;blocks, output &quot;Game Over!&quot;(without quotes). Otherwise, output the game field&#39;s final state, which should have&nbsp;<b>H</b>&nbsp;lines, each has&nbsp;<b>W</b>&nbsp;characters. Each character can be &#39;.&#39; or &#39;x&#39;.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le;&nbsp;100</li>
	<li>1 &le;&nbsp;<b>t<sub>i</sub></b>&nbsp;&le;&nbsp;7</li>
	<li>0 &le;&nbsp;<b>r<sub>i</sub></b>&nbsp;&lt; 4</li>
	<li>4 &le;&nbsp;<b>W</b>&nbsp;&le;&nbsp;20</li>
	<li>1 &le;&nbsp;<b>H</b>&nbsp;&le;&nbsp;20</li>
	<li>0 &le;&nbsp;<b>N</b>&nbsp;&le;&nbsp;100</li>
</ul>
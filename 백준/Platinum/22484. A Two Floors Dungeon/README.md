# [Platinum V] A Two Floors Dungeon - 22484

[문제 링크](https://www.acmicpc.net/problem/22484)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 18, 맞힌 사람: 16, 정답 비율: 72.727%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>It was the last day of the summer camp you strayed into the labyrinth on the way to Komaba Campus, the University of Tokyo. The contest has just begun. Your teammates must impatiently wait for you. So you have to escape from this labyrinth as soon as possible.</p>

<p>The labyrinth is represented by a grid map. Initially, each grid except for walls and stairs is either on the first floor or on the second floor. Some grids have a switch which can move up or down some of the grids (the grids on the first floor move to the second floor, and the grids on the second floor to the first floor). In each step, you can take one of the following actions:</p>

<ul>
	<li>
	<p>Move to an adjacent grid (includes stairs) on the same floor you are now in.</p>
	</li>
	<li>
	<p>Move to another floor (if you are in the stairs grid).</p>
	</li>
	<li>
	<p>Operate the switch (if you are in a grid with a switch).</p>
	</li>
</ul>

<p>Luckily, you have just found a map of the labyrinth for some unknown reason. Let&#39;s calculate the minimum step to escape from the labyrinth, and go to the place your teammates are waiting!</p>

### 입력

<p>The format of the input is as follows.</p>

<pre>
<var>W</var> <var>H</var>
<var>M<sub>11</sub>M<sub>12</sub>M<sub>13</sub>...M<sub>1W</sub></var>
<var>M<sub>21</sub>M<sub>22</sub>M<sub>23</sub>...M<sub>2W</sub></var>
........
<var>M<sub>H1</sub>M<sub>H2</sub>M<sub>H3</sub>...M<sub>HW</sub></var>
<var>S</var>
<var>MS<sub>111</sub>MS<sub>112</sub>MS<sub>113</sub>...MS<sub>11W</sub></var>
<var>MS<sub>121</sub>MS<sub>122</sub>MS<sub>123</sub>...MS<sub>12W</sub></var>
........
<var>MS<sub>1H1</sub>MS<sub>1H2</sub>MS<sub>1H3</sub>...MS<sub>1HW</sub></var>
<var>MS<sub>211</sub>MS<sub>212</sub>MS<sub>213</sub>...MS<sub>21W</sub></var>
<var>MS<sub>221</sub>MS<sub>222</sub>MS<sub>223</sub>...MS<sub>22W</sub></var>
........
<var>MS<sub>2H1</sub>MS<sub>2H2</sub>MS<sub>2H3</sub>...MS<sub>2HW</sub></var>
<var>MS<sub>S11</sub>MS<sub>S12</sub>MS<sub>S13</sub>...MS<sub>S1W</sub></var>
<var>MS<sub>S21</sub>MS<sub>S22</sub>MS<sub>S23</sub>...MS<sub>S2W</sub></var>
........
<var>MS<sub>SH1</sub>MS<sub>SH2</sub>MS<sub>SH3</sub>...MS<sub>SHW</sub></var>
</pre>

<p>The first line contains two integers <var>W</var> (<var>3 &le; W &le; 50</var>) and <var>H</var> (<var>3 &le; H &le; 50</var>). They represent the width and height of the labyrinth, respectively. The following <var>H</var> lines represent the initial state of the labyrinth. Each of <var>M<sub>ij</sub></var> is one of the following symbols:</p>

<ul>
	<li>&#39;#&#39; representing a wall,</li>
	<li>&#39;|&#39; representing stairs,</li>
	<li>&#39;_&#39; representing a grid which is initially on the first floor,</li>
	<li>&#39;^&#39; representing a grid which is initially on the second floor,</li>
	<li>a lowercase letter from &#39;a&#39; to &#39;j&#39; representing a switch the grid has, and the grid is initially on the first floor,</li>
	<li>an uppercase letter from &#39;A&#39; to &#39;J&#39; representing a switch the grid has, and the grid is initially on the second floor,</li>
	<li>&#39;%&#39; representing the grid you are initially in (which is initially on the first floor) or</li>
	<li>&#39;&amp;&#39; representing the exit of the labyrinth (which is initially on the first floor).</li>
</ul>

<p>The next line contains one integer <var>S</var> (<var>0 &le; S &le; 10</var>), and then the following <var>SH</var> lines represent the information of the switches. Each of <var>MS<sub>kij</sub></var> is one of:</p>

<ul>
	<li>&#39;#&#39; if <var>M<sub>ij</sub></var> is a &#39;#&#39;,</li>
	<li>&#39;|&#39; if <var>M<sub>ij</sub></var> is a &#39;|&#39;,</li>
	<li>&#39;*&#39; if the grid is moved by the switch represented by the <var>k</var>-th alphabet letter, or</li>
	<li>&#39;.&#39; otherwise.</li>
</ul>

<p>Note that the grid which contains a switch may be moved by operating the switch. In this case, you will move together with the grid. You may assume each of the &#39;%&#39; (start) and &#39;&amp;&#39; (goal) appears exacyly once, that the map is surround by walls, and that each alphabet in the map is any of the letters from &#39;A&#39; (or &#39;a&#39;) to <var>S</var>-th alphabet letter.</p>

### 출력

<p>Print the minimum step to reach the goal in one line. If there is no solution, print &quot;-1&quot;.</p>
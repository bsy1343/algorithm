# [Gold V] Asteroids! - 9986

[문제 링크](https://www.acmicpc.net/problem/9986)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 56, 정답: 26, 맞힌 사람: 22, 정답 비율: 44.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<blockquote>
<p>You&#39;re in space.<br />
You want to get home.<br />
There are asteroids.<br />
You don&#39;t want to hit them.</p>
</blockquote>

### 입력

<p>Input to this problem will consist of a (non-empty) series of up to 100 data sets. Each data set will be formatted according to the following description, and there will be no blank lines separating data sets.</p>

<p>A single data set has 5 components:</p>

<ol>
	<li>Start line - A single line, &quot;START N&quot;, where 1 &lt;= N &lt;= 10.</li>
	<li>Slice list - A series of N slices. Each slice is an N x N matrix representing a horizontal slice through the asteroid field. Each position in the matrix will be one of two values:
	<ul>
		<li>&#39;O&#39; - (the letter &quot;oh&quot;) Empty space</li>
		<li>&#39;X&#39; - (upper-case) Asteroid present</li>
	</ul>
	</li>
	<li>Starting Position - A single line, &quot;A B C&quot;, denoting the &lt;A,B,C&gt; coordinates of your craft&#39;s starting position. The coordinate values will be integers separated by individual spaces.</li>
	<li>Target Position - A single line, &quot;D E F&quot;, denoting the &lt;D,E,F&gt; coordinates of your target&#39;s position. The coordinate values will be integers separated by individual spaces.</li>
	<li>End line - A single line, &quot;END&quot;</li>
</ol>

<p>The origin of the coordinate system is &lt;0,0,0&gt;. Therefore, each component of each coordinate vector will be an integer between 0 and N-1, inclusive.</p>

<ul>
	<li>The first coordinate in a set indicates the column. Left column = 0.</li>
	<li>The second coordinate in a set indicates the row. Top row = 0.</li>
	<li>The third coordinate in a set indicates the slice. First slice = 0.</li>
</ul>

<p>Both the Starting Position and the Target Position will be in empty space.</p>

### 출력

<p>For each data set, there will be exactly one output set, and there will be no blank lines separating output sets.</p>

<p>A single output set consists of a single line. If a route exists, the line will be in the format &quot;X Y&quot;, where X is the same as N from the corresponding input data set and Y is the least number of moves necessary to get your ship from the starting position to the target position. If there is no route from the starting position to the target position, the line will be &quot;NO ROUTE&quot; instead.</p>

<p>A move can only be in one of the six basic directions: up, down, left, right, forward, back. Phrased more precisely, a move will either increment or decrement a single component of your current position vector by 1.</p>
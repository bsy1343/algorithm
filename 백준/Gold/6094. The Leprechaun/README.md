# [Gold IV] The Leprechaun - 6094

[문제 링크](https://www.acmicpc.net/problem/6094)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 19, 맞힌 사람: 19, 정답 비율: 73.077%

### 분류

브루트포스 알고리즘, 누적 합

### 문제 설명

<p>Imagine Bessie&#39;s surprise as she spied a leprechaun prancing through the north pasture. Being no one&#39;s fool, she charged at the leprechaun at captured him with her prehensile hooves.</p>

<p>&quot;One wish, bovine one. That&#39;s all I have for cows,&quot; he said.</p>

<p>&quot;Riches,&quot; Bessie said dreamily. &quot;The opportunity for riches.&quot;</p>

<p>Leprechauns never grant precisely the easiest form of their captor&#39;s wishes. As the smoke cleared from the location of a loud explosion, a shimmering donut spun slowly over the verdant green fields.</p>

<p>&quot;I have made you a torus,&quot; the leprechaun cooed. &quot;And on that torus is an N x N matrix (1 &lt;= N &lt;= 200) of integers in the range -1,000,000..1,000,000 that will determine the magnitude of your riches. You must find the sequence of contiguous integers all in one row, one column, or on one diagonal that yields the largest sum from among all the possible sequences on the torus.&quot;</p>

<p>Bessie pondered for a moment and realized that the torus was a device for &quot;wrapping&quot; the columns, rows, and diagonals of a matrix so that one could choose contiguous elements that &quot;wrapped around&quot; the side or top edge.</p>

<p>Bessie will share the matrix with you. &nbsp;Determine the value of the largest possible sum (which requires choosing at least one matrix element).</p>

<p>By way of example, consider the 4 x 4 matrix on the left below that has all the elements from one exemplary &quot;wrapped&quot; diagonal marked:</p>

<pre>
           8  6  6* 1           8  6* 6  1
          -3  4  0  5*         -3  4  0  5
           4* 2  1  9           4  2  1  9*
           1 -9* 9 -2           1 -9  9*-2</pre>

<p>The marked diagonal of the right-hand matrix includes two nines (the highest available number) and a six for a total of 24. This is the best possible sum for this matrix and includes only three of the four possible elements on its diagonal.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Line i+1 contains N space-separated integers that compose row i of the matrix</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the largest possible sum computable using the rules above</li>
</ul>

<p>&nbsp;</p>
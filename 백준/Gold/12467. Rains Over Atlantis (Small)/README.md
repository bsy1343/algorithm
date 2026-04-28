# [Gold I] Rains Over Atlantis (Small) - 12467

[문제 링크](https://www.acmicpc.net/problem/12467)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 22, 맞힌 사람: 14, 정답 비율: 53.846%

### 분류

구현, 자료 구조, 그래프 이론, 그래프 탐색, 시뮬레이션, 너비 우선 탐색, 우선순위 큐

### 문제 설명

<p>Rains fall on the isle of Atlantis, and will erode all the land to nothingness. What you want to know, so that you can organize the evacuation, is how soon it will happen.</p>

<p>You have a map of Atlantis. The map is a square grid, and each square contains the height of the land in that square, in metres, above sea level. All squares outside the map have height 0; all squares with height 0 are water, and all squares with larger heights are land. There are no squares with lower height.</p>

<p>Water can&nbsp;<em>flow</em>&nbsp;from a source square to a target square if the source square and target square share an edge, and if the height of the water in the target square is lower than or equal to the height of water in the source square.</p>

<p>It&#39;s raining very quickly, which means that if there is nowhere for the rain water in a square to flow, water in that square will accumulate until there is a square to which the rain water can flow. Squares that are not on the map can accept any amount of flow. For example, the following map:</p>

<pre>
5 9 9 9 9 9
0 8 9 0 2 5
3 9 9 9 9 9
</pre>

<p>Will quickly fill up with water. We&#39;ll call the height of water in each square, plus the height of the land, the&nbsp;<em>water level</em>. It will be:</p>

<pre>
5 9 9 9 9 9
0 8 9 <strong>5 5</strong> 5
3 9 9 9 9 9
</pre>

<p>Note that the 0 in the middle of the land, although it&#39;s water, is not connected to the outside of the map and so just accumulates water. The 0 on the border of the land, however, is connected to the outside of the map, and so the water from the 8 can flow through it to the outside.</p>

<p>&nbsp;</p>

<p>The direction in which water flows is determined by the water level. If there are multiple possible squares where water could flow from one particular source square, the water from that source will flow to the square with the lowest water level (ties don&#39;t matter, as you will see).</p>

<p>Now the erosion begins. Each day, a square is eroded&mdash;its height decreases&mdash;depending on how water is flowing from it. If water is flowing from S to T, then S&#39;s height decreases by&nbsp;<code>min(WaterLevel(S) - WaterLevel(T),&nbsp;<strong>M</strong>)</code>. All erosion happens at exactly the same time, at the end of the day. For example, with&nbsp;<strong>M</strong>=5, the map above will erode to:</p>

<pre>
0 4 4 4 4 4
0 3 5 0 2 0
0 4 4 4 4 4
</pre>

<p>After a day&#39;s erosion, excess water will flow away: squares with water level higher than a neighbour&#39;s water level will lose water until they are of the same height. Water will also accumulate in the same way that it did on the first day. After the first day, this map&#39;s water level will become:</p>

<pre>
0 4 4 4 4 4
0 3 5 <strong>2</strong> 2 0
0 4 4 4 4 4
</pre>

<p>After another day of erosion, the map will look like:</p>

<pre>
0 0 0 0 0 0
0 0 2 0 0 0
0 0 0 0 0 0
</pre>

<p>...and the Atlanteans will need to escape in a big hurry. Your task is to determine how many days it will take for all the heights to erode to 0.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case begins with a line containing three space-separated integers:&nbsp;<strong>H</strong>,&nbsp;<strong>W</strong>&nbsp;and&nbsp;<strong>M</strong>. The first two denote the size of the map, while the third is the maximum amount a square can erode in one day, as described above.&nbsp;&nbsp;<strong>H</strong>&nbsp;lines follow, each of which contains&nbsp;<strong>W</strong>&nbsp;space-separated integers. The i<sup>th</sup>&nbsp;integer on the j<sup>th</sup>&nbsp;line denotes the height of the square at (i, j).</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 40.</li>
	<li>1 &le;&nbsp;<strong>H</strong>,&nbsp;<strong>W</strong>&nbsp;&le; 10.</li>
	<li>1 &le;&nbsp;<strong>M</strong>&nbsp;&le; 100.</li>
	<li>0 &le; all heights &le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the number of days it takes to erode all the island.</p>

### 힌트

<p>In the second case, the water height looks like:&nbsp;<br />
<code>3 8 10 11 10 8<br />
7&nbsp;<strong>7 7</strong>&nbsp;12 8 8<br />
6 9 11 9 8 4</code></p>

<p>After one day the island looks as follows:&nbsp;<br />
<code>0 5 7 8 7 5<br />
4 5 2 9 8 5<br />
3 6 8 6 5 1</code></p>

<p>And after the second day:&nbsp;<br />
<code>0 2 4 5 4 2<br />
1 4 2 6 5 2<br />
0 3 5 3 2 0</code></p>

<p>And the third day:&nbsp;<br />
<code>0 0 1 2 1 0&nbsp;<br />
0 1 2 3 2 0&nbsp;<br />
0 0 2 0 0 0&nbsp;</code></p>

<p>After the fourth day, things are looking desperate for the Atlanteans:&nbsp;<br />
<code>0 0 0 0 0 0&nbsp;<br />
0 0 1 0 0 0&nbsp;<br />
0 0 0 0 0 0&nbsp;</code></p>

<p>Finally, on the fifth day the last square erodes away. Atlantis lasted for five days; they probably shouldn&#39;t have built their city out of brown sugar.</p>
# [Silver II] Watersheds (Small) - 12657

[문제 링크](https://www.acmicpc.net/problem/12657)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 112, 정답: 81, 맞힌 사람: 71, 정답 비율: 83.529%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 분리 집합

### 문제 설명

<p>Geologists sometimes divide an area of land into different regions based on where rainfall flows down to. These regions are called&nbsp;<em>drainage basins</em>.</p>

<p>Given an elevation map (a 2-dimensional array of altitudes), label the map such that locations in the same drainage basin have the same label, subject to the following rules.</p>

<ul>
	<li>From each cell, water flows down to at most one of its 4 neighboring cells.</li>
	<li>For each cell, if none of its 4 neighboring cells has a lower altitude than the current cell&#39;s, then the water does not flow, and the current cell is called a&nbsp;<em>sink</em>.</li>
	<li>Otherwise, water flows from the current cell to the neighbor with the lowest altitude.</li>
	<li>In case of a tie, water will choose the first direction with the lowest altitude from this list: North, West, East, South.</li>
</ul>

<p>Every cell that drains directly or indirectly to the same sink is part of the same drainage basin. Each basin is labeled by a unique lower-case letter, in such a way that, when the rows of the map are concatenated from top to bottom, the resulting string is lexicographically smallest. (In particular, the basin of the most North-Western cell is always labeled &#39;a&#39;.)</p>

### 입력

<p>The first line of the input file will contain the number of maps,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;maps will follow, each starting with two integers on a line --&nbsp;<strong>H</strong>&nbsp;and&nbsp;<strong>W</strong>&nbsp;-- the height and width of the map, in cells. The next&nbsp;<strong>H</strong>&nbsp;lines will each contain a row of the map, from north to south, each containing&nbsp;<strong>W</strong>&nbsp;integers, from west to east, specifying the altitudes of the cells.</p>

<p>Limits</p>

<ul>
	<li><strong>T</strong>&nbsp;&le; 100;</li>
	<li>1 &le;&nbsp;<strong>H</strong>,&nbsp;<strong>W</strong>&nbsp;&le; 10;</li>
	<li>0 &le; altitudes &lt; 10.</li>
	<li>There will be at most two basins.</li>
</ul>

### 출력

<p>For each test case, output 1+<strong>H</strong>&nbsp;lines. The first line must be of the form</p>

<pre>
Case #<strong>X</strong>:</pre>

<p>where&nbsp;<strong>X</strong>&nbsp;is the test case number, starting from 1. The next&nbsp;<strong>H</strong>&nbsp;lines must list the basin labels for each of the cells, in the same order as they appear in the input.</p>

### 힌트

<p>In Case #1, the upper-right and lower-left corners are sinks. Water from the diagonal flows towards the lower-left because of the lower altitude (5 versus 6).</p>
# [Platinum IV] Bacteria (Large) - 12568

[문제 링크](https://www.acmicpc.net/problem/12568)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 17, 맞힌 사람: 16, 정답 비율: 34.043%

### 분류

애드 혹, 자료 구조, 분리 집합, 그래프 이론, 그래프 탐색

### 문제 설명

<p>A number of bacteria lie on an infinite grid of cells, each bacterium in its own cell.</p>

<p>Each second, the following transformations occur (all simultaneously):&nbsp;</p>

<ol>
	<li>If a bacterium has no neighbor to its north and no neighbor to its west, then it will die.</li>
	<li>If a cell has no bacterium in it, but there are bacteria in the neighboring cells to the north and to the west, then a new bacterium will be born in that cell.</li>
</ol>

<p>Upon examining the grid, you note that there are a positive, finite number of bacteria in one or more rectangular regions of cells.</p>

<p>Determine how many seconds will pass before all the bacteria die.</p>

<p>Here is an example of a grid that starts with 6 cells containing bacteria, and takes 6 seconds for all the bacteria to die. &#39;1&#39;s represent cells with bacteria, and &#39;0&#39;s represent cells without bacteria.</p>

<p>&nbsp;</p>

<pre>
000010
011100
010000
010000
000000

000000
001110
011000
010000
000000

000000
000110
001100
011000
000000

000000
000010
000110
001100
000000

000000
000000
000010
000110
000000

000000
000000
000000
000010
000000

000000
000000
000000
000000
000000</pre>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing&nbsp;<strong>C</strong>, the number of test cases.</li>
</ul>

<p>Then for each test case:</p>

<ul>
	<li>One line containing&nbsp;<strong>R</strong>, the number of rectangles of cells that initially contain bacteria.</li>
	<li><strong>R</strong>&nbsp;lines containing four space-separated integers&nbsp;<strong>X</strong><sub>1</sub>&nbsp;<strong>Y</strong><sub>1</sub>&nbsp;<strong>X</strong><sub>2</sub>&nbsp;<strong>Y</strong><sub>2</sub>. This indicates that all the cells with X coordinate between X<sub>1</sub>&nbsp;and X<sub>2</sub>, inclusive, and Y coordinate between Y<sub>1</sub>&nbsp;and Y<sub>2</sub>, inclusive, contain bacteria.</li>
</ul>

<p>The rectangles may overlap.</p>

<p>North is in the direction of decreasing Y coordinate.&nbsp;<br />
West is in the direction of decreasing X coordinate.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>R</strong>&nbsp;&le; 1000&nbsp;</li>
	<li>1 &le;&nbsp;<strong>X<sub>1</sub></strong>&nbsp;&le;&nbsp;<strong>X<sub>2</sub></strong>&nbsp;&le; 1000000&nbsp;</li>
	<li>1 &le;&nbsp;<strong>Y<sub>1</sub></strong>&nbsp;&le;&nbsp;<strong>Y<sub>2</sub></strong>&nbsp;&le; 1000000&nbsp;</li>
	<li>The number of cells initially containing bacteria will be at most 1000000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #N: T&quot;, where N is the case number (starting from 1), and T is the number of seconds until the bacteria all die.</p>
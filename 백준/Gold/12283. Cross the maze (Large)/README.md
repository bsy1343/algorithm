# [Gold III] Cross the maze (Large) - 12283

[문제 링크](https://www.acmicpc.net/problem/12283)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 22, 맞힌 사람: 20, 정답 비율: 71.429%

### 분류

구현, 그래프 이론, 시뮬레이션, 격자 그래프

### 문제 설명

<p>Edison, a robot, does not have a right hand or eyes. As a brave robot, <strong>he always puts his left hand on the wall no matter he walks or turns around</strong>. Because he thinks it is too dangerous, Edison does not walk backward.</p>

<p>Assume that Edison has found himself in a square-shaped maze of <strong>N</strong>x<strong>N</strong> square cells which is surrounded by walls from the outside. In the maze, some of the cells are also walls. Edison can only move between two empty cells in four directions, north, south, west and east. In order to get out of the maze, he drafts a plan. He uses his left hand to lean on the wall and goes by following the wall.</p>

<p>Here is the question, is Edison able to get out of the maze in at most 10,000 steps? If he can make it, output the path. By getting out of the maze, he only needs to be in the exit cell. If the starting cell is the same as the exit, Edison won&#39;t need to move and can directly get out of the maze.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each test case starts with an integer <strong>N</strong>. <strong>N</strong> is the size of the maze. The following <strong>N</strong> lines, each line contains <strong>N</strong> characters which may be &#39;.&#39; or &#39;#&#39;. &#39;.&#39; is an empty cell, &#39;#&#39; is a wall. Followed by a line which contains four integers: <strong>sx</strong>, <strong>sy</strong>, <strong>ex</strong>, <strong>ey</strong>. (<strong>sx</strong>, <strong>sy</strong>) means that Edison is standing on row <strong>sx</strong> and column <strong>sy</strong> as his starting cell, (<strong>ex</strong>, <strong>ey</strong>) is the exit of the maze. (<strong>sx</strong>, <strong>sy</strong>) is guaranteed to be at one of the 4 corners of the maze, and Edison can only touch the wall on 4 adjacent cells(not 8) initially. (<strong>ex</strong>, <strong>ey</strong>) can be anywhere in the maze. Note that the top-left corner is at position (1,1).</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 30.</li>
	<li>1 &le; <strong>sx</strong>, <strong>sy</strong>, <strong>ex</strong>, <strong>ey</strong> &le; <strong>N</strong>.</li>
	<li>The starting cell and the exit of the maze will always be an empty cell. And the starting cell and the exit of the maze won&#39;t be the same.</li>
	<li><span style="line-height:1.6em">2 &le; </span><strong style="line-height:1.6em">N</strong><span style="line-height:1.6em"> &le; 100.</span></li>
</ul>

### 출력

<p>For each test case, output a line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is &quot;Edison ran out of energy.&quot; (without the quotes) if Edison can&#39;t reach the exit of the maze in at most 10,000 steps, otherwise y should be the number of steps followed by another line which contains y characters to describe the path (each character should be E for east, S for south, W for west or N for north). There is no character to represent the turning around. We don&#39;t care about the turning around steps, please only output the path of how Edison will cross the maze.</p>

### 힌트

<p>Note:&nbsp;</p>

<p>In the 2nd test case after moving 1 cell down from his starting cell, Edison will still be able to lean on the wall at the cell (1,2) by his left hand.&nbsp;</p>

<p>In the third test case, due to Edison can&#39;t touch the wall at cell (2,2) initially, so he has to go east in his first step.</p>
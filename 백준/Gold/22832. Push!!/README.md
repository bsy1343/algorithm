# [Gold II] Push!! - 22832

[문제 링크](https://www.acmicpc.net/problem/22832)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 10, 맞힌 사람: 9, 정답 비율: 90.000%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Mr. Schwarz was a famous powerful pro wrestler. He starts a part time job as a warehouseman. His task is to move a cargo to a goal by repeatedly pushing the cargo in the warehouse, of course, without breaking the walls and the pillars of the warehouse.</p>

<p>There may be some pillars in the warehouse. Except for the locations of the pillars, the floor of the warehouse is paved with square tiles whose size fits with the cargo. Each pillar occupies the same area as a tile.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22832.%E2%80%85Push!!/ae299c8c.png" data-original-src="https://upload.acmicpc.net/562c13cc-76db-4958-b005-1d249b30fd48/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 362px; height: 411px;" /></p>

<p>Initially, the cargo is on the center of a tile. With one push, he can move the cargo onto the center of an adjacent tile if he is in proper position. The tile onto which he will move the cargo must be one of (at most) four tiles (i.e., east, west, north or south) adjacent to the tile where the cargo is present.</p>

<p>To push, he must also be on the tile adjacent to the present tile. He can only push the cargo in the same direction as he faces to it and he cannot pull it. So, when the cargo is on the tile next to a wall (or a pillar), he can only move it along the wall (or the pillar). Furthermore, once he places it on a corner tile, he cannot move it anymore.</p>

<p>He can change his position, if there is a path to the position without obstacles (such as the cargo and pillars) in the way. The goal is not an obstacle. In addition, he can move only in the four directions (i.e., east, west, north or south) and change his direction only at the center of a tile.</p>

<p>As he is not so young, he wants to save his energy by keeping the number of required pushes as small as possible. But he does not mind the count of his pedometer, because walking is very light exercise for him.</p>

<p>Your job is to write a program that outputs the minimum number of pushes required to move the cargo to the goal, if ever possible.</p>

### 입력

<p>The input consists of multiple maps, each representing the size and the arrangement of the warehouse. A map is given in the following format.</p>

<pre>
w h
d<sub>11</sub> d<sub>12</sub> d<sub>13</sub> &middot;&middot;&middot; d<sub>1w</sub>
d<sub>21</sub> d<sub>22</sub> d<sub>23</sub> &middot;&middot;&middot; d<sub>2w</sub>
...
d<sub>h1</sub> d<sub>h2</sub> d<sub>h3</sub> &middot;&middot;&middot; d<sub>hw</sub></pre>

<p>The integers w and h are the lengths of the two sides of the floor of the warehouse in terms of widths of floor tiles. w and h are less than or equal to 7. The integer d<sub>ij</sub> represents what is initially on the corresponding floor area in the following way.</p>

<ul>
	<li>0:nothing (simply a floor tile)</li>
	<li>1:a pillar</li>
	<li>2:the cargo</li>
	<li>3:the goal</li>
	<li>4:the warehouseman (Mr. Schwarz)</li>
</ul>

<p>Each of the integers 2, 3 and 4 appears exactly once as d<sub>ij</sub> in the map. Integer numbers in an input line are separated by at least one space character. The end of the input is indicated by a line containing two zeros.</p>

### 출력

<p>For each map, your program should output a line containing the minimum number of pushes. If the cargo cannot be moved to the goal, &minus;1 should be output instead.</p>
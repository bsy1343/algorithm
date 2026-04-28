# [Gold IV] Mirror Illusion - 22842

[문제 링크](https://www.acmicpc.net/problem/22842)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 9, 맞힌 사람: 9, 정답 비율: 81.818%

### 분류

수학, 구현, 기하학, 시뮬레이션

### 문제 설명

<p>A rich man has a square room with mirrors for security or just for fun. Each side of the room is eight meters wide. The floor, the ceiling and the walls are not special; however, the room can be equipped with a lot of mirrors on the walls or as vertical partitions.</p>

<p>Every mirror is one meter wide, as tall as the wall, double-sided, perfectly reflective, and ultimately thin.</p>

<p>Poles to x mirrors are located at the corners of the room, on the walls and inside the room. Their locations are the 81 lattice points at intervals of one meter. A mirror can be fixed between two poles which are one meter distant from each other. If we use the sign &quot;<code>+</code>&quot; to represent a pole, the overview of the room can be illustrated as follows.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/41bd6c79-b789-445f-b2f1-c3afa8dff2f1/-/preview/" style="width: 169px; height: 171px;" /></p>

<p>Let us denote a location on the floor by (x, y) in a rectangular coordinate system. For example, the rectangular coordinates of the four corners of the room are (0,0), (8,0), (0,8) and (8,8), respectively. The location (x, y) is in the room if and only if the conditions 0 &le; x &le; 8 and 0 &le; y &le; 8 are satisfied. If i and j are integers satisfying the conditions 0 &le; i &le; 8 and 0 &le; j &le; 8, we can denote by (i, j) the locations of poles.</p>

<p>One day a thief intruded into this room possibly by breaking the ceiling. He stood at (0.75, 0.25) and looked almost toward the center of the room. Precisely speaking, he looked toward the point (1, 0.5) of the same height as his eyes. So what did he see in the center of his sight? He would have seen one of the walls or himself as follows.</p>

<ul>
	<li>If there existed no mirror, he saw the wall at (8, 7.5).</li>
	<li>If there existed one mirror between two poles at (8, 7) and (8, 8), he saw the wall at (7.5, 8). (Let us denote the line between these two poles by (8, 7)-(8, 8).)</li>
	<li>If there were four mirrors on (8, 7)-(8, 8), (7, 8)-(8, 8), (0, 0)-(0, 1) and (0, 0)-(1, 0), he saw himself at (0.75, 0.25).</li>
	<li>If there were four mirrors on (2, 1)-(2, 2), (1, 2)-(2, 2), (0, 0)-(0, 1) and (0, 0)-(1, 0), he saw himself at (0.75, 0.25).</li>
</ul>

<p>Your job is to write a program that reports the location at which the thief saw one of the walls or himself with the given mirror arrangements.</p>

### 입력

<p>The input contains multiple data sets, each representing how to equip the room with mirrors. A data set is given in the following format.</p>

<pre>
n
d<sub>1</sub> i<sub>1</sub> j<sub>1</sub>
d<sub>2</sub> i<sub>2</sub> j<sub>2</sub>
. . .
d<sub>n</sub> i<sub>n</sub> j<sub>n</sub></pre>

<p>The first integer n is the number of mirrors, such that 0 &le; n &le; 144. The way the k-th (1 &le; k &le; n) mirror is fixed is given by d<sub>k</sub> and (i<sub>k</sub>, j<sub>k</sub>). d<sub>k</sub> is either &#39;<code>x</code>&#39; or &#39;<code>y</code>&#39;, which gives the direction of the mirror. If d<sub>k</sub> is &#39;<code>x</code>&#39;, the mirror is fixed on (i<sub>k</sub>, j<sub>k</sub>)-(i<sub>k</sub> + 1, j<sub>k</sub>). If dk is &#39;<code>y</code>&#39;, the mirror is fixed on (i<sub>k</sub>, j<sub>k</sub>)-(i<sub>k</sub>, j<sub>k</sub> + 1). The end of the input is indicated by a negative integer.</p>

### 출력

<p>For each data set, your program should output the location (x, y) at which the thief saw one of the walls or himself. The location should be reported in a line containing two integers which are separated by a single space and respectively represent x and y in centimeter as the unit of length. No extra lines nor spaces are allowed.</p>
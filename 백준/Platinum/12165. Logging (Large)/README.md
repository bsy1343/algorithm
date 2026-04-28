# [Platinum II] Logging (Large) - 12165

[문제 링크](https://www.acmicpc.net/problem/12165)

### 성능 요약

시간 제한: 15 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 220, 정답: 89, 맞힌 사람: 35, 정답 비율: 27.559%

### 분류

정렬, 기하학, 두 포인터, 각도 정렬

### 문제 설명

<p>A certain forest consists of&nbsp;<strong>N</strong>&nbsp;trees, each of which is inhabited by a squirrel.</p>

<p>The&nbsp;<strong>boundary</strong>&nbsp;of the forest is the convex polygon of smallest area which contains every tree, as if a giant rubber band had been stretched around the outside of the forest.</p>

<p>Formally, every tree is a single point in two-dimensional space with unique coordinates (<strong>X<sub>i</sub></strong>,&nbsp;<strong>Y<sub>i</sub></strong>), and the boundary is the convex hull of those points.</p>

<p>Some trees are&nbsp;<strong>on the boundary</strong>&nbsp;of the forest, which means they are on an edge or a corner of the polygon. The squirrels wonder how close their trees are to being on the boundary of the forest.</p>

<p>One at a time, each squirrel climbs down from its tree, examines the forest, and determines the minimum number of trees that would need to be cut down for its own tree to be on the boundary. It then writes that number down on a log.</p>

<p>Determine the list of numbers written on the log.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow; each consists of a single line with an integer&nbsp;<strong>N</strong>, the number of trees, followed by&nbsp;<strong>N</strong>&nbsp;lines with two space-separated integers&nbsp;<strong>X<sub>i</sub></strong>&nbsp;and&nbsp;<strong>Y<sub>i</sub></strong>, the coordinates of each tree. No two trees will have the same coordinates.</p>

<h3>Limits</h3>

<ul>
	<li>-10<sup>6</sup>&nbsp;&le;&nbsp;<strong>X<sub>i</sub></strong>,&nbsp;<strong>Y<sub>i</sub></strong>&nbsp;&le; 10<sup>6</sup>.</li>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 14.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 3000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x:&quot;, followed by&nbsp;<strong>N</strong>&nbsp;lines with one integer each, where line&nbsp;<strong>i</strong>&nbsp;contains the number of trees that the squirrel living in tree&nbsp;<strong>i</strong>would need to cut down.</p>

### 힌트

<p>In the first sample case, there are four trees forming a square, and a fifth tree inside the square. Since the first four trees are already on the boundary, the squirrels for those trees each write down 0. Since one tree needs to be cut down for the fifth tree to be on the boundary, the fifth squirrel writes down 1.</p>
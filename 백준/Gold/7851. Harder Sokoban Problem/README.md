# [Gold I] Harder Sokoban Problem - 7851

[문제 링크](https://www.acmicpc.net/problem/7851)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 9, 맞힌 사람: 9, 정답 비율: 47.368%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>The game of sokoban is played in a rectangular labirinth of <i>N</i> by <i>N</i> cells with each cell either empty, denoted by &#39;<code>.</code>&#39; character (ASCII 46), or occupied by wall, denoted by &#39;<code>#</code>&#39; character (ASCII 35). There is also a single destination cell, denoted by &#39;<code>*</code>&#39; character (ASCII 42).</p>

<p>One player and one container are located in the empty cells of the labirinth. The player can move between the empty cells in horizontal or vertical direction. If the cell where the player tries to move is occupied by container, the container is &quot;pushed&quot; to the next cell in the same direction. That next cell must, of course, be empty.</p>

<p>The objective of the game is well-known: to place the container in the destination cell with the minimum number of moves. Your task, however, is different: given the field, select starting position for the player and the container so as to maximize the required number of moves.</p>

### 입력

<p>First line of input contains number <i>N</i> -- the field size. The following <i>N</i> lines consist of <i>N</i> characters each -- representation the field. The input field always contains at least one empty cell adjacent to the destination cell.</p>

### 출력

<p>Output file must contain a single integer -- the maximal number of moves.</p>

### 제한

<ul>
	<li>2 &le; <i>N</i> &le; 25</li>
</ul>
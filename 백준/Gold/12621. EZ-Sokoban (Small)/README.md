# [Gold II] EZ-Sokoban (Small) - 12621

[문제 링크](https://www.acmicpc.net/problem/12621)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 17, 맞힌 사람: 13, 정답 비율: 48.148%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로

### 문제 설명

<p>Sokoban is a famous Japanese puzzle game. Sokoban is Japanese for &quot;warehouse keeper&quot;. In this game, your goal is to push boxes to their designated locations in the warehouse. To push a box, the area behind the box and in front of the box must be empty. This is because you stand behind the box when pushing and you can push only one box at a time. You cannot push a box out of the board and you cannot stand outside the board when pushing a box.</p>

<p>For example, in this picture:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12621.%E2%80%85EZ-Sokoban%E2%80%85(Small)/31aa5c34.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12621.%E2%80%85EZ-Sokoban%E2%80%85(Small)/31aa5c34.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12621/images-22.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Box 1 can be pushed in any of the four directions because the four spaces adjacent to it are empty. Box 2 can only be pushed east or west; it cannot be pushed north or south because the space to its south is not empty. Box 3 cannot be pushed in any direction. Box 4 can only be pushed east or west because there is a wall south of it.</p>

<p>Sokoban was proved to be a P-Space complete problem, but we deal with an easier variation here. In our variation of Sokoban, boxes have strong magnets inside and they have to stick together&nbsp;<em>almost</em>&nbsp;all the time. Under &quot;stable&quot; conditions, all boxes should be connected, edge to edge. This means that from any box we can get to any other box by going through boxes that share an edge. If you push a box and boxes are no longer connected, you are in &quot;dangerous mode&quot;. In dangerous mode, the next push must make the boxes connected again.</p>

<p>For example, in this picture:</p>

<p><img src="%EB%B0%B1%EC%A4%80/Gold/12621.%E2%80%85EZ-Sokoban%E2%80%85(Small)/f4e46137.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12621.%E2%80%85EZ-Sokoban%E2%80%85(Small)/f4e46137.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12621/images-23.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="border:0px; height:164px; vertical-align:middle; width:183px" /></p>

<p>The situation is stable, since all 4 boxes are connected, edge to edge. Let&#39;s assume that you decided to push the northmost box west:</p>

<p><img src="%EB%B0%B1%EC%A4%80/Gold/12621.%E2%80%85EZ-Sokoban%E2%80%85(Small)/5e4d37bb.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12621.%E2%80%85EZ-Sokoban%E2%80%85(Small)/5e4d37bb.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12621/images-24.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="border:0px; vertical-align:middle" /></p>

<p>Now, we are in dangerous mode since the northmost box is not connected to any other boxes. The next push must return us to a stable position. For example, we can push that northmost box south:</p>

<p><img src="%EB%B0%B1%EC%A4%80/Gold/12621.%E2%80%85EZ-Sokoban%E2%80%85(Small)/3a03bd92.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12621.%E2%80%85EZ-Sokoban%E2%80%85(Small)/3a03bd92.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12621/images-25.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="border:0px; vertical-align:middle" /></p>

<p>Making the boxes stable again.</p>

<p>A Sokoban puzzle consists of a board, initial configuration of the boxes and the final configuration (where we want the boxes to be at the end). Given an EZ-Sokoban puzzle, find a solution that makes the minimum number of box moves, or decide that it can&#39;t be solved. The final and initial configurations will not be in &quot;dangerous&quot; mode.</p>

<p>To simplify things, we will assume that you, the warehouse keeper, can jump at any time to any empty spot on the board.</p>

### 입력

<p>The first line in the input file contains the number of cases,&nbsp;<strong>T</strong>.&nbsp;</p>

<p>Each case consists of several lines. The first line contains&nbsp;<strong>R</strong>&nbsp;and&nbsp;<strong>C</strong>, the number of rows and columns of the board, separated by one space. This is followed by&nbsp;<strong>R</strong>&nbsp;lines. Each line contains&nbsp;<strong>C</strong>&nbsp;characters describing the board:</p>

<ul>
	<li>&#39;.&#39; is an empty spot</li>
	<li>&#39;#&#39; is a wall</li>
	<li>&#39;x&#39; is a goal (where a box should be at the end)</li>
	<li>&#39;o&#39; is a box</li>
	<li>&#39;w&#39; is a both a box and a goal</li>
</ul>

<p>The number of boxes will be equal to the number of goals.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 50</li>
	<li>1 &le;&nbsp;<strong>R</strong>,<strong>C</strong>&nbsp;&le; 12</li>
	<li>1 &le; the number of boxes &le; 2</li>
</ul>

### 출력

<p>For each test case, output</p>

<pre>
Case #X: K</pre>

<p>where&nbsp;<strong>X</strong>&nbsp;is the test case number, starting from 1, and&nbsp;<strong>K</strong>&nbsp;is the minimum number of box moves that are needed to solve the puzzle or&nbsp;<strong>-1</strong>&nbsp;if it cannot be solved.</p>

<div>&nbsp;</div>
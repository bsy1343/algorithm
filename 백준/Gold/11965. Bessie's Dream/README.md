# [Gold II] Bessie's Dream - 11965

[문제 링크](https://www.acmicpc.net/problem/11965)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1409, 정답: 256, 맞힌 사람: 181, 정답 비율: 20.291%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로, 데이크스트라

### 문제 설명

<p>After eating too much fruit in Farmer John&#39;s kitchen, Bessie the cow is getting some very strange dreams! In her most recent dream, she is trapped in a maze in the shape of an \(N \times M\) grid of tiles (\(1 \le N, M \le 1,000\)). She starts on the top-left tile and wants to get to the bottom-right tile. When she is standing on a tile, she can potentially move to the adjacent tiles in any of the four cardinal directions.</p>

<p>But wait! Each tile has a color, and each color has a different property! Bessie&#39;s head hurts just thinking about it:</p>

<ul>
	<li>If a tile is <strong>red</strong>, then it is impassable.</li>
	<li>If a tile is <strong>pink</strong>, then it can be walked on normally.</li>
	<li>If a tile is <strong>orange</strong>, then it can be walked on normally, but will make Bessie smell like oranges.</li>
	<li>If a tile is <strong>blue</strong>, then it contains piranhas that will only let Bessie pass if she smells like oranges.</li>
	<li>If a tile is <strong>purple</strong>, then Bessie will slide to the next tile in that direction (unless she is unable to cross it). If this tile is also a purple tile, then Bessie will continue to slide until she lands on a non-purple tile or hits an impassable tile. Sliding through a tile counts as a move. <strong>Purple tiles will also remove Bessie&#39;s smell.</strong></li>
</ul>

<p>(If you&#39;re confused about purple tiles, the example will illustrate their use.)</p>

<p>Please help Bessie get from the top-left to the bottom-right in as few moves as possible.</p>

### 입력

<p>The first line has two integers \(N\) and \(M\), representing the number of rows and columns of the maze.</p>

<p>The next \(N\) lines have \(M\) integers each, representing the maze:</p>

<ul>
	<li>The integer &#39;0&#39; is a red tile</li>
	<li>The integer &#39;1&#39; is a pink tile</li>
	<li>The integer &#39;2&#39; is an orange tile</li>
	<li>The integer &#39;3&#39; is a blue tile</li>
	<li>The integer &#39;4&#39; is a purple tile</li>
</ul>

<p>The top-left and bottom-right integers will always be &#39;1&#39;.</p>

### 출력

<p>A single integer, representing the minimum number of moves Bessie must use to cross the maze, or -1 if it is impossible to do so.</p>

### 힌트

<p>In this example, Bessie walks one square down and two squares to the right (and then slides one more square to the right). She walks one square up, one square left, and one square down (sliding two more squares down) and finishes by walking one more square right. This is a total of 10 moves (DRRRULDDDR).</p>
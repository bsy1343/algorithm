# [Gold IV] Panda Hunting Treasure Box - 25790

[문제 링크](https://www.acmicpc.net/problem/25790)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 61, 정답: 19, 맞힌 사람: 13, 정답 비율: 29.545%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 격자 그래프

### 문제 설명

<p>Our favorite treasure hunter, Panda, has been dropped in a two-dimensional maze with several treasure boxes. Each maze cell is either empty or has one treasure box in it. The treasure boxes contain money and no two boxes have the same amount, i.e., they are all distinct amounts. Panda can have only one of these boxes and, obviously, he would prefer the one with the highest amount but he may not have enough energy to get to the cell containing that box so Panda may have to settle for a lower amount.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25790.%E2%80%85Panda%E2%80%85Hunting%E2%80%85Treasure%E2%80%85Box/fb679cf3.png" data-original-src="https://upload.acmicpc.net/6d7093ea-b895-4e95-9ca5-b51d28e08d2d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 166px; height: 123px; float: right;" />Panda starts with some energy. The picture to the right shows the energy needed for Panda to move into any of the eight neighboring cells (note that the boundary cells in the maze have fewer than eight neighbors).</p>

<p>To illustrate the energy needed for movements, if Panda wants to move up, it requires 2 units of energy; if he wants to move down, it requires 6 units of energy.</p>

<p>If Panda moves into a cell with a treasure box, that box is what he gets, i.e., the journey is over even if Panda still has some energy left to make more moves. And, obviously, Panda can make a move only if he has enough energy for that move. When Panda makes a move, his energy will go down accordingly to that move.</p>

<p>You are to determine the highest amount Panda can get. Note that Panda does not have to use all his energy, i.e., it is ok if Panda still has some energy left when he gets a treasure box.</p>

### 입력

<p>The first input line contains five integers:</p>

<ul>
	<li>R<sub>m</sub> (2 &le; R<sub>m</sub> &le; 500), indicating the number of rows in the maze;</li>
	<li>C<sub>m</sub> (2 &le; C<sub>m</sub> &le; 500), indicating the number of columns in the maze;</li>
	<li>R<sub>p</sub> (1 &le; R<sub>p</sub> &le; R<sub>m</sub>), indicating the row number of Panda&rsquo;s starting position;</li>
	<li>C<sub>p</sub> (1 &le; C<sub>p</sub> &le; C<sub>m</sub>), indicating the column number of Panda&rsquo;s starting position; and</li>
	<li>E<sub>p</sub> (1 &le; E<sub>p</sub> &le; 10<sup>6</sup>), indicating Panda&rsquo;s starting energy.</li>
</ul>

<p>Assume that Panda&rsquo;s starting position is valid (i.e., it is in the maze) and that cell does not contain a treasure box.</p>

<p>Each of the next R<sub>m</sub> input lines contains C<sub>m</sub> integers (each integer between 0 and 10<sup>6</sup>, inclusive). Each input line describes one row in the maze, providing the cell contents. A zero indicates there is no treasure box in that cell; non-zero indicates a treasure box (the amount in the box). Assume that there is at least one treasure box in the maze and that Panda has enough starting energy to reach one treasure box.</p>

### 출력

<p>Print the highest amount Panda can get.</p>
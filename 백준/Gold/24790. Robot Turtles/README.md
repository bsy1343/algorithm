# [Gold I] Robot Turtles - 24790

[문제 링크](https://www.acmicpc.net/problem/24790)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 10, 맞힌 사람: 10, 정답 비율: 83.333%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 데이크스트라

### 문제 설명

<p><img alt="" src="https://upload.acmicpc.net/999c8635-19c4-4b11-b39a-63c0770b4ce8/-/preview/" style="width: 300px; height: 303px; float: right;" />Robot Turtles is one of Theta&#39;s favorite games. In this game, kindergarteners learn how to &quot;code&quot; by creating programs that move a turtle from a starting field to a diamond. Robot Turtles is reportedly the most successful game funded by the Kickstarter incubator.</p>

<p>Players must develop a program consisting of &quot;instructions&quot; that brings a turtle from a starting location to a goal (a diamond). &nbsp;An adult will then &quot;execute&quot; this program by moving the turtle based on the given instructions.</p>

<p>Robot Turtles is played on an $8 \times 8$ board. There is one turtle (marked with the letter <code>T</code>), which always starts out at the bottom-left field, facing right. &nbsp;The board contains empty squares (marked as <code>.</code>), castles made out of rock (<code>C</code>), and castles made out of ice (<code>I</code>). The diamond is marked with a <code>D</code>. The turtle may move only onto empty squares and the square on which the diamond is located.</p>

<p>A turtle program contains $4$ kinds of instructions, marked by a single letter.</p>

<ul>
	<li><code>F</code> The turtle moves one field forward in the direction it is facing. If the turtle faces a castle or the border of the board, a program error occurs.</li>
	<li><code>R</code> The turtle turns $90$ degrees to the right (the turtle will just turn and stay on the same field).</li>
	<li><code>L</code> The turtle turns $90$ degrees to the left (the turtle will just turn and stay on the same field).</li>
	<li><code>X</code> The turtle fires a laser in the direction it is facing. If the square it is facing contains an ice castle, the ice castle will melt and the square will turn into an empty square. Otherwise, a program error occurs. The turtle will not move or change direction. It is a program error to fire the laser at empty squares, rock castles&nbsp; or outside the board.</li>
</ul>

### 입력

<p>The input consists of $8$ lines, which represents the board, with each line representing one row. The turtle will always start out at the bottom-left. There will be exactly $1$ diamond. There will be no more than $10$ ice castles.</p>

### 출력

<p>Output the shortest valid turtle program whose execution (without program error) brings the turtle from the starting location to the diamond! If there are multiple such programs of equal length, you may output any of them!</p>

<p>Output <code>no solution</code> if it is not possible for the turtle to reach the diamond!</p>
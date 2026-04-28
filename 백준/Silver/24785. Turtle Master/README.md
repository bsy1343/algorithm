# [Silver I] Turtle Master - 24785

[문제 링크](https://www.acmicpc.net/problem/24785)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 68, 정답: 40, 맞힌 사람: 32, 정답 비율: 54.237%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Robot Turtles is one of Theta&#39;s favorite games. In this game, kindergarteners learn how to &quot;code&quot; by creating programs that move a turtle from a starting field to a diamond. Robot Turtles is reportedly the most successful game funded by the Kickstarter incubator.</p>

<p>In the actual board game, an adult plays the role of the &quot;turtle master,&quot; which is the person that plays the role of a CPU to execute the program. As you can imagine, this is a pretty boring task that cries out for automation: in this problem, you are asked to write a program that automates the task of the turtle master.</p>

<p>Robot Turtles is played on an $8 \times 8$ board. There is one turtle (marked with the letter <code>T</code>), which always starts out at the bottom-left field, facing right. &nbsp;The board contains empty squares (marked as <code>.</code>), castles made out of rock (<code>C</code>), and castles made out of ice (<code>I</code>). The diamond is marked with a <code>D</code>. The turtle may move only onto empty squares and the square on which the diamond is located.</p>

<p>A turtle program contains $4$ kinds of instructions, marked by a single letter.</p>

<ul>
	<li><code>F</code> The turtle moves one field forward in the direction it is facing. If the turtle faces a castle or the border of the board, a program error occurs.</li>
	<li><code>R</code> The turtle turns $90$ degrees to the right (the turtle will just turn and stay on the same field).</li>
	<li><code>L</code> The turtle turns $90$ degrees to the left (the turtle will just turn and stay on the same field).</li>
	<li><code>X</code> The turtle fires a laser in the direction it is facing. If the square it is facing contains an ice castle, the ice castle will melt and the square will turn into an empty square. Otherwise, a program error occurs. The turtle will not move or change direction. It is a program error to fire the laser at empty squares, rock castles&nbsp; or outside the board.</li>
</ul>

### 입력

<p>The input consists of $9$ lines. The first $8$ lines contains the board, each line representing the squares in a row of the board. The turtle will always be at the bottom-left. There will be exactly $1$ diamond. The $9^{\text{th}}$ line contains the program the turtle master is asked to execute.</p>

### 출력

<p>Output <code>Diamond!</code> if the entire program can be executed without program error and if the turtle is on the diamond square after the program has been executed. Output <code>Bug!</code> if a program error occurred, or if the turtle does not end up on the diamond square!</p>
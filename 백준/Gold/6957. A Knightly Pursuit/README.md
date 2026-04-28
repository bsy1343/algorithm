# [Gold III] A Knightly Pursuit - 6957

[문제 링크](https://www.acmicpc.net/problem/6957)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 6, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

그래프 이론, 그래프 탐색

### 문제 설명

<p>In chess, game pieces move about an $8 \times 8$ chessboard in a fashion defined by their type. The object of the game is to capture opposing pieces by landing on their squares, and eventually trapping the king piece.</p>

<p>In our version of the game, we shall use a variable sized board with only $2$ pieces on it: A white pawn which moves relentlessly towards the top row of the chessboard one square at a time per move; and a black knight which can move from its current location in any of up to eight ways: two squares up or down and one square left or right, or one square up or down and two squares left or right. The knight must remain on the board at all times; any move that would take it off the board is therefore disallowed. In the diagram below, the knight&#39;s position is labelled $K$ and its possible moves are labelled $1$ to $8$.</p>

<pre>
. . . . . . .
. . 8 . 1 . .
. 7 . . . 2 .
. . . K . . .
. 6 . . . 3 .
. . 5 . 4 . .
. . . . . . .</pre>

<p>The pawn moves first; then the knight and pawn alternate moves. The knight tries to land either on the square occupied by the pawn (a win) or on the square immediately above the pawn (a stalemate). If the pawn reaches the top row of the board the game ends immediately and the knight loses (a loss).</p>

<p>Write a program to determine whether the knight can win and, if it can, the minimum number of moves it must make to do so. If the knight cannot win, your program should determine if it can cause a stalemate and, if it can, the minimum number of moves it must make to do so. Finally if the knight cannot win or cause a stalemate, your program should compute the number of moves the knight makes before the pawn wins.</p>

<p>The first line of input contains a positive integer, $n$, the number of games to analyze. For each game there are six lines of input:</p>

<ul>
	<li>$r$, the number of rows in the chessboard $(3 \le r &lt; 100)$</li>
	<li>$c$, the number of columns in the chessboard $(2 \le c &lt; 100)$</li>
	<li>$pr$, the row of the starting position of the pawn $(1 \le pr \le r)$</li>
	<li>$pc$, the column of the starting position of the pawn $(1 \le pc \le c)$</li>
	<li>$kr$, the row of the starting position of the knight $(1 \le kr \le r)$</li>
	<li>$kc$, the column of the starting position of the knight $(1 \le kc \le c)$</li>
</ul>

<p>The pawn and the knight will have different starting positions. Row $1$ is at the bottom of the board and Row $r$ is at the top of the board. Column $1$ is at the left and column $c$ is at the right.</p>

### 입력



### 출력


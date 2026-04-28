# [Platinum IV] Maze Tac Toe - 21817

[문제 링크](https://www.acmicpc.net/problem/21817)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 100, 정답: 43, 맞힌 사람: 39, 정답 비율: 48.148%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 비트마스킹, 깊이 우선 탐색

### 문제 설명

<p>Bessie the cow enjoys solving mazes. She also enjoys playing tic-tac-toe (or rather, the cow version of tic-tac-toe, described shortly). Farmer John has found a new way for her to play both games at the same time!</p>

<p>First, cow tic-tac-toe: instead of placing X&#39;s and O&#39;s on a $3 \times 3$ grid, the cows of course play with M&#39;s and O&#39;s on a $3 \times 3$ grid. During one&#39;s turn, one can place either an &#39;M&#39; or an &#39;O&#39; on any empty grid cell (this is another difference from standard tic-tac-toe, where one player always plays &#39;X&#39; and other other always plays &#39;O&#39;). The winner of cow tic-tac-toe is the first player to spell &#39;MOO&#39;, either horizontally, vertically, or diagonally. Backwards is fine, so for example a player could win by spelling &#39;OOM&#39; across one row of the board. Just as in standard tic-tac-toe, it is possible to reach a board state where no winners occur. A move in cow tic-tac-toe is usually specified by 3 characters, either &#39;Mij&#39; or &#39;Oij&#39;, where $i$ and $j$ are each in the range $1 \ldots 3$ and specify the row and column in which to place the corresponding &#39;M&#39; or &#39;O&#39;.</p>

<p>To challenge Bessie, Farmer John has designed a square maze consisting of a grid of $N \times N$ cells ($3 \leq N \leq 25$). Some cells, including all of the border cells, contain large haybales, preventing Bessie from moving onto any such cell. Bessie can move freely among all the other cells in the maze, by taking steps in the 4 usual directions north, south, east, and west. Some cells contain a piece of paper on which a move in cow tic-tac-toe is written. While Bessie moves around in the maze, any time she steps on such a cell, she must make the corresponding move in a game of cow tic-tac-toe that she is simultaneously playing while she moves through the maze (unless the corresponding cell in the cow tic-tac-toe game is already occupied, in which case she takes no action). She has no opponent in this game of cow tic-tac-toe, but some of the cells in the maze may be adversarial to her goal of eventually spelling &#39;MOO&#39;.</p>

<p>If Bessie stops playing cow tic-tac-toe immediately upon winning, please determine the number of distinct winning tic-tac-toe board configurations she can possibly generate by moving appropriately through the maze.</p>

### 입력

<p>The first line of input contains $N$.</p>

<p>The maze is specified by the next $N$ lines, each containing $3N$ characters. Each cell described by a block of 3 characters, which is either &#39;###&#39; for a wall, &#39;...&#39; for an empty space, &#39;BBB&#39; for a non-wall containing Bessie, and a cow tic-tac-toe move for a non-wall cell that forces Bessie to make the corresponding move. Exactly one cell will be &#39;BBB&#39;.</p>

### 출력

<p>Please print the number of distinct winning cow tic-tac-toe board configurations (possibly 0) that Bessie can generate via movement in the maze, stopping after she wins.</p>

### 힌트

<p>In this example, there are 8 possible winning board configurations that Bessie can ultimately reach:</p>

<pre>
O.M
.O.
MOM

O..
.O.
.OM

O.M
.O.
.OM

O..
.O.
MOM

O..
...
OOM

..M
.O.
OOM

...
.O.
OOM

...
...
OOM
</pre>

<p>To explain one of these, take this case:</p>

<pre>
O..
...
OOM
</pre>

<p>Here, Bessie might first visit the O11 cell, then move to the lower corridor visiting O32, M33, and O31. The game then stops, since she has won (so for example she would not be able to visit the M11 cell north of her current position on the O31 cell).</p>
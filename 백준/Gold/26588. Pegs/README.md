# [Gold IV] Pegs - 26588

[문제 링크](https://www.acmicpc.net/problem/26588)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

백트래킹, 브루트포스 알고리즘, 그래프 이론, 그래프 탐색

### 문제 설명

<p>There is a game called peg solitaire that requires the player to remove all of the pegs from the game board except for one. A peg can be removed by moving a peg from one side of it to the opposite side, but there must be an open space to move the peg to. When the outside peg is moved, the peg that it &#39;hopped&#39; over is removed (similar to checkers). If the hops and removals are done correctly, there should be only one peg remaining at the end of the game. This game is very difficult, but you decide that you can use your computer to solve it for you! Given a peg solitaire board, write a program to tell you if it is possible to solve the game of peg solitaire.</p>

### 입력

<p>The first line will contain a single integer n that indicates the number of data sets that follow. Each data set will start with two integers, r c representing the number of rows and columns in each board, respectively. The next r lines will represent the map. The character &lsquo;.&rsquo; denotes a blank space on the board and &lsquo;@&rsquo; is a peg. Pegs can only be moved over another peg and into the blank space next to it.</p>

### 출력

<p>If the board is solvable, print Solvable!</p>

<p>If the board is not solvable, print Impossible.</p>

<p>The board is solvable if it is possible to get down to only one peg remaining on the board.</p>
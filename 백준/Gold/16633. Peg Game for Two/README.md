# [Gold III] Peg Game for Two - 16633

[문제 링크](https://www.acmicpc.net/problem/16633)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 12, 맞힌 사람: 12, 정답 비율: 92.308%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘, 게임 이론

### 문제 설명

<p>Jacquez and Alia&rsquo;s parents take them on many road trips. To keep themselves occupied, they play a triangular peg game, meant for one player. In the original game, one player has an equilateral triangle containing 15 holes (five holes per side of the triangle). Initially one hole is empty and the remaining 14 are filled with pegs. The player moves by picking up a peg to &ldquo;jump&rdquo; it over another peg, landing on an empty hole. Jumps must be in straight lines (horizontally or diagonally). The peg that is jumped over is removed. The goal of this game is to leave just one peg on the board. Figure J.1 shows the result of a jump in this game.</p>

<pre style="text-align: center;">
X                   X
X X                 X O
X X X      --&gt;      X O X
X O X X             X X X X
X X X X X           X X X X X</pre>

<p>Figure J.1: One possible move in the original game. On the left is an initial board, where X represents a peg and O represents an empty hole. The jump moves the right peg in the second (from top) row diagonally down and to the left, over the middle peg of the third row, which is removed.</p>

<p>Ultimately, Jacquez and Alia have gotten bored of playing this game individually. They decide to invent a version that they could play together. In the new version, each peg has a positive point value, and they alternate turns. During a player&rsquo;s turn, they must make a jump if one is available. The score for a jump is the product of the two pegs involved in the jump.</p>

<p>The total score of a player is the sum of the scores of their jumps. The game ends when a player has no possible jumps to make. Each player&rsquo;s goal is to maximize their own total score minus their opponent&rsquo;s total score (at the end of the game). For example, Jacquez would prefer to win with a score of 100 to Alia&rsquo;s score of 60 (with a differential of 40), than to win with a score of 1 000 to Alia&rsquo;s score of 998 (with a smaller differential of only 2). Similarly, Alia wants to win by as much as possible over Jacquez.</p>

<p>For this version of the game, we can display the game state by replacing each X shown above with a corresponding value for that peg, and using a value of 0 (zero) for each of the open holes. Figure J.2 shows an example move.</p>

<pre style="text-align: center;">
3                   3
1 6                 1 0
1 7 8      --&gt;      1 0 8
5 0 3 4             5 6 3 4
9 3 2 1 9           9 3 2 1 9</pre>

<p>Figure J.2: One possible move in the new game, jumping the peg with value 6 over the peg with value 7. This move is worth 6 &middot; 7 = 42 for Jacquez (since he moves first). The values are from the first sample input.</p>

<p>Jacquez has had some trouble winning. Write a program to calculate the best he can do, assuming that he starts and both players play optimally.</p>

### 입력

<p>The input consists of five lines, describing the initial state of the board. The i<sup>th</sup> (1 &le; i &le; 5) line contains i space separated integers, representing the pegs and holes on the i<sup>th</sup> row. Each of these integers is&nbsp;between 0 and 100, inclusive. A value of 0 represents a hole while the rest of the values represent pegs. It is possible for two different pegs to have the same value. Of the 15 input values it is guaranteed that exactly one is 0, thus all input boards start with exactly one hole.</p>

### 출력

<p>Output the value of Jacquez&rsquo;s score minus Alia&rsquo;s score at the end of the game, assuming Jacquez starts and both players play optimally.</p>
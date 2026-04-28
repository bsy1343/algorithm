# [Platinum II] Four Colors - 19203

[문제 링크](https://www.acmicpc.net/problem/19203)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

그래프 이론, 그리디 알고리즘, 그래프 탐색, 애드 혹, 트리, 깊이 우선 탐색, 게임 이론, 최소 공통 조상

### 문제 설명

<p>This is an interactive problem.</p>

<p>Fred and Fiona are tired of playing tic-tac-toe at boring lessons, so they have invented the new game. The board for the game is a connected undirected graph without cycles, also known as a tree. Players alternate their turns, Fred moves first. The players use pencils of four colors for the game: red, green, blue and yellow, we will denote colors by integers from 1 to 4.</p>

<p>Initially all vertices of the tree are uncolored. Each move the current player chooses some uncolored vertex and colors it with one of the four possible colors in such way that no two vertices connected by an edge have the same color.</p>

<p>If the current player has no moves because all vertices are colored already, or there is no vertex that can be correctly colored, the game ends and the winner is determined in the following way. If all vertices are colored, Fred wins, if there is an uncolored vertex, Fiona wins.</p>

<p>Friends have played many games, and Fiona has noticed that Fred always wins. After a thought she understood that there is a winning strategy for Fred that he has found. Can you do the same?</p>

### 입력



### 출력



### 힌트

<p>Input is formatted to show which output makes response to the corresponding input. There will be no empty lines in real interaction.</p>

<p>In the given example the judges&#39; program makes the last move (either &quot;5 1&quot;, &quot;5 2&quot; or &quot;5 4&quot;) but doesn&#39;t report it to your program, because after that the game is over and your program has won.</p>
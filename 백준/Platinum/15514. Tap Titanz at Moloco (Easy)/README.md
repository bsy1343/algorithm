# [Platinum II] Tap Titanz at Moloco (Easy) - 15514

[문제 링크](https://www.acmicpc.net/problem/15514)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 140, 정답: 54, 맞힌 사람: 52, 정답 비율: 50.980%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Some Moloco employees play clicker games like &#39;Tap Titanz&#39;.</p>

<p>In Tap Titanz, a player is given an <em>n</em>-by-<em>n</em> chessboard whose cells are either black or white. Two cells are said to be adjacent if they share an edge. We say that two cells are connected if there is a path from one cell to the other consisting only of adjacent cells of the same color (hence the two cells must be of the same color).&nbsp;</p>

<p>When the player taps on one of the cells, the tap changes the color of the cell being tapped on as well as its adjacent cells of the same color, and their adjacent cells of the same color, and so on. More formally, if the player taps on a cell, the cell and all the other cells to which it is connected will have their color changed instantly.&nbsp;</p>

<p>The goal of this game is to tap as few times as possible, while making all cells to have the same color (either black or white).&nbsp;</p>

### 입력

<p>The first line contains an integer <em>n</em> between 1 and 15, inclusive.</p>

<p>The following <em>n</em> lines describe the chessboard where <em>i</em>+1th row contains a string of length <em>n</em> that describes the <em>i</em>th row of the chessboard. Each string consists only of &#39;B&#39; or &#39;W&#39; for Black or White denoting the color of a cell.</p>

### 출력

<p>Your output should contain a single integer which is the minimum number of taps required to make all cells to have the same color.</p>
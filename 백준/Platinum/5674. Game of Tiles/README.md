# [Platinum I] Game of Tiles - 5674

[문제 링크](https://www.acmicpc.net/problem/5674)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 9, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

애드 혹, 이분 탐색, 게임 이론, 이분 매칭

### 문제 설명

<p>The Game of Tiles is a game for two players played over a rectangular board in the form of a table of R rows and C columns of square cells called tiles. At the beginning of the game, some of the tiles may be painted black and the rest remain white. Then, Player 1 and Player 2 alternate turns making a move and the first one that cannot make a valid move loses the game. The first move of the game is done by Player 1 and consists of choosing a white tile and writing the number 1 on it. After that, each subsequent move i consists of writing number i on an unused white tile that is adjacent horizontally or vertically (but not diagonally) to the tile numbered i &minus; 1. Note that Player 1 always writes odd numbers and Player 2 always writes even numbers.</p>

<p>The following figure shows three examples of possible configurations of a board with R = 3 and C = 4 during a game. On the left it shows the initial configuration. On the center it shows an intermediate state, where cells in gray mark the possible moves for Player 2. And on the right it shows the configuration when the game is won by Player 2, who chose the appropriate move.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5674.%E2%80%85Game%E2%80%85of%E2%80%85Tiles/5265c645.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/5674.%E2%80%85Game%E2%80%85of%E2%80%85Tiles/5265c645.png" data-original-src="https://www.acmicpc.net/upload/images2/got.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:96px; width:446px" /></p>

<p>Your task is to write a program that given the initial configuration of the board, determines which player will win, if both of them play optimally.</p>

### 입력

<p>Each test case is described using several lines. The first line contains two integers R and C representing respectively the number of rows and columns of the board (1 &le; R, C &le; 50). The i-th of the next R lines contains a string B<sub>i</sub> of C characters that describes the i-th row of the initial board. The j-th character of B<sub>i</sub> is either &ldquo;.&rdquo; (dot) or the uppercase letter &ldquo;X&rdquo;, representing that the tile at row i and column j is respectively white or black. Within each test case at least one of the tiles is white.</p>

### 출력

<p>For each test case output a line with an integer representing the number of the player (1 or 2) who will win the game if both of them play optimally.</p>
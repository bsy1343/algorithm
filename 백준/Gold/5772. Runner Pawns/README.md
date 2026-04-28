# [Gold IV] Runner Pawns - 5772

[문제 링크](https://www.acmicpc.net/problem/5772)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 8, 정답 비율: 61.538%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>The &ldquo;Runner Pawns&rdquo; game is a variant of classic Chess for a single player. It uses a board similar to the chess board, divided in 8x8 squares. As in chess, each square can contain only one piece at a time. The pieces are a number of pawns (the &ldquo;Runner Pawns&rdquo;), and a single horse, which is the only piece under command of the player. The objective is to capture all pawns before they get to the last row and become kings.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5772.%E2%80%85Runner%E2%80%85Pawns/e0c529a7.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/5772.%E2%80%85Runner%E2%80%85Pawns/e0c529a7.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5772/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:142px; width:135px" /></p>

<p style="text-align:center">Possible movements of the horse</p>

<p>Horse moves are said to be in &lsquo;L&rsquo; shape, since a horse must always move two squares in one direction and one square in the perpendicular direction. The figure above illustrates horse movements, where the character &lsquo;H&rsquo; indicates the horse current position, and the character &lsquo;&bull;&rsquo; indicates possible final positions. Notice that in the representation used black and white squares of the chess board are not distinguished.</p>

<pre>
01 02 03 04 05 06 07 08
09 10 11 12 13 14 15 16
17 18 19 20 21 22 23 24
25 26 27 28 29 30 31 32
33 34 35 36 37 38 39 40
41 42 43 44 45 46 47 48
49 50 51 52 53 54 55 56
57 58 59 60 61 62 63 64</pre>

<p>A board with cells numbered</p>

<p>From position 22, the horse can move to positions 05, 07, 12, 16, 28, 32, 37 or 39. From position 57, the horse can move to positions 42 or 51.&nbsp;</p>

<p>Pawns&rsquo; moves are a bit different from chess, since they can only move one square forward, and all of them move at the same time. They never move on a diagonal. Squares of the board are numbered from 1 to 64, as shown above. Pawns move in vertical direction from top to bottom, so that squares numbered 57 to 64 are the pawns&rsquo; goal.</p>

<p>Each round of the game is composed by one move of the horse followed by a simultaneous move of all pawns not yet captured.</p>

<p>In order to capture a pawn, the player has to move the horse to a square where a pawn is. A captured pawn leaves the board, and only the remaining ones will move ahead in the next round. To win the game, the player has to capture all pawns. If a pawn gets to the last row, it becomes a king. Then the horse has only one more move to capture it. If it doesn&rsquo;t, the king moves and it means that the game is over and the player loses. Moreover, if the horse moves to a square that will be occupied by a pawn at the next move of the pawns, the horse is captured by the pawn and the player loses.</p>

<p>Your task is to write a program that analyses a &ldquo;Runner Pawns&rdquo; diagram and answer whether there is a sequence of movements for the horse to win. If it is possible, your program should determine the minimum number of moves needed by the horse to capture all pawns.</p>

### 입력

<p>The input contains several instances of the problem, one per line. Each instance starts with an integer P representing the number of pawns (0 &le; P &le; 8), followed by P integers (1 &le; A1 , A2 , ... AP &le; 64) that describe the initial position of each pawn, followed by an integer H (1 &le; H &le; 64) representing the starting position of the horse. The end of input is indicated by a line containing P = 0.</p>

### 출력

<p>For each instance of the problem in the input your program must print a single line, containing the answer to the problem. If there is a sequence of moves for the horse to capture all pawns before a surviving king moves (and without the horse being captured by a pawn) then the program should print the length of the minimum sequence of moves that make it possible. Otherwise your program should print the word &lsquo;impossible&rsquo;.</p>
# [Silver II] Brattleship (Large) - 12148

[문제 링크](https://www.acmicpc.net/problem/12148)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 92, 정답: 53, 맞힌 사람: 49, 정답 비율: 62.821%

### 분류

수학, 애드 혹

### 문제 설명

<p>You&#39;re about to play a simplified &quot;battleship&quot; game with your little brother. The board for this game is a rectangular grid with&nbsp;<strong>R</strong>&nbsp;rows and&nbsp;<strong>C</strong>&nbsp;columns. At the start of the game, you will close your eyes, and you will keep them closed until the end of the game. Your little brother will take a single rectangular 1 x&nbsp;<strong>W</strong>&nbsp;ship and place it&nbsp;<strong>horizontally</strong>&nbsp;somewhere on the board. The ship must always fit entirely on the board, with each cell of the ship occupying exactly one of the grid&#39;s cells, and it can never be rotated.<br />
<br />
In each turn of the game, you name a cell on the board, and your little brother tells you whether that is a hit (one of the cells occupied by the ship) or a miss. (Your little brother doesn&#39;t say&nbsp;<em>which</em>&nbsp;part of the ship was hit -- just that the cell you named has a part of the ship in it.) You have perfect memory, and can keep track of all the information he has given you. Once you have named all of the cells occupied by the ship, the game is over (the ship is sunk), and your score is the number of turns taken. Your goal is to minimize your score.<br />
<br />
Although the ship is not supposed to be moved once it is placed, you know that your little brother, who is a brat, plans to cheat by changing the location of the ship whenever he wants, as long as the ship remains horizontal and completely on the board, and the new location is consistent with all the information he has given so far. For example, for a 1x4 board and 1x2 ship, your little brother could initially place the ship such that it overlaps the leftmost two columns. If your first guess was row 1, column 2, he could choose to secretly move the ship to the rightmost two columns, and tell you that (1, 2) was a miss. If your next guess after that was (1, 3), though, then he could not say that was also a miss and move the ship back to its original location, since that would be inconsistent with what he said about (1, 2) earlier.<br />
<br />
Not only do you know that your little brother will cheat, he knows that you know. If you both play optimally (you to minimize your score, him to maximize it), what is the lowest score that you can&nbsp;<strong>guarantee</strong>&nbsp;you will achieve, regardless of what your little brother does?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;lines follow, each with three space-separated integers&nbsp;<strong>R</strong>,&nbsp;<strong>C</strong>, and&nbsp;<strong>W</strong>: the number of rows and columns of the board, followed by the width of the ship.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>W</strong>&nbsp;&le;&nbsp;<strong>C</strong>.</li>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>R</strong>&nbsp;&le; 20.</li>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 20.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the minimum score you can guarantee.</p>

### 힌트

<p>In Case #1, the board has one row and four columns, and the ship takes up one row and two columns. One optimal strategy is for you to start by naming cell (1, 2):<br />
<br />
If your little brother says it is a hit, then the other cell of the 1x2 ship must be in either (1, 1) or (1, 3), and you just have to name both. If you happen to correctly name the cell where the other part of the ship is, your little brother will just reposition the ship so that (1, 2) is still hit, but your guess is a miss. Notice that your little brother can still move the ship even after it has been hit, as long as the new position is not inconsistent with the information he has already given.<br />
<br />
If your little brother says it is a miss, then the only remaining consistent scenario is that the ship is in (1, 3) and (1, 4), and your little brother will be unable to change this from now on; you just need to name those two cells.<br />
<br />
So no matter what your little brother does after you say (1, 2), you can finish the game in two more moves after that, for a total of three moves.<br />
<br />
Moreover, a three-move solution is optimal, because it is impossible to guarantee a finish in only two moves: without loss of generality, pick a first move. No matter what you pick, there is still a 1x2 area open and your little brother can just move the ship there and claim that you missed. It is impossible for you to sink that ship, which has not yet been hit, with only one more move.<br />
<br />
In Case #2, the ship completely fills in the board and so your little brother has only one place to put it. All you have to do is name every cell.<br />
<br />
In Case #3, your little brother can always move the 1x1 ship to a cell you have not tried yet, so you must name all 10 cells, only finally getting a hit (and immediately sinking the ship) on the last one.</p>
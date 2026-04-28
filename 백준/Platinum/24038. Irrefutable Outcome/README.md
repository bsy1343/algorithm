# [Platinum IV] Irrefutable Outcome - 24038

[문제 링크](https://www.acmicpc.net/problem/24038)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 8, 맞힌 사람: 7, 정답 비율: 50.000%

### 분류

많은 조건 분기, 게임 이론, 그리디 알고리즘

### 문제 설명

<p>Izabella and Olga are playing a game alternating turns. Izabella plays first. The game starts with all game pieces arranged in a single row. The pieces come in two colors: indigo and orange. During Izabella&#39;s turns, she must choose and remove an indigo piece that is either the leftmost or rightmost piece remaining. During Olga&#39;s turns, she must choose and remove an orange piece that is either the leftmost or rightmost piece remaining. If at any point one of the players does not have a legal move (possibly because there are no pieces remaining), that player loses the game, and the other player is awarded&nbsp;$1$ point plus&nbsp;$1$&nbsp;additional point for each piece that remains on the board.</p>

<p>We use an uppercase letter&nbsp;<code>I</code>&nbsp;to represent indigo pieces and an uppercase letter&nbsp;<code>O</code>&nbsp;to represent orange pieces. Suppose, for example, that they play with the following starting board:&nbsp;<code>IOIOOOII</code>.</p>

<p>On her first turn, Izabella can choose to remove either the leftmost or rightmost pieces, as both are indigo. Suppose she chooses the leftmost. Then, the board would become&nbsp;<code>OIOOOII</code>. Then, Olga would have no choice but to remove the new leftmost piece, as the rightmost piece is not orange, leaving&nbsp;<code>IOOOII</code>. Izabella can choose again, and this time she chooses the rightmost piece, leaving&nbsp;<code>IOOOI</code>&nbsp;for Olga&#39;s turn. At this point, Olga has no valid move, so Izabella won. Since there are&nbsp;$5$&nbsp;pieces remaining, Izabella wins&nbsp;$1+5=6$&nbsp;points in total.</p>

<p>Each player plays optimally trying to win and to maximize their own score. A player that cannot guarantee a win plays to minimize the opponent&#39;s score.</p>

<p>Given the starting board, can you find out who wins and what is their score?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;$T$.&nbsp;$T$&nbsp;lines follow. Each line represents a test case and contains a string&nbsp;$B$&nbsp;representing the status of the board. The&nbsp;$i$-th character in&nbsp;$B$&nbsp;is&nbsp;<code>I</code>&nbsp;if the&nbsp;$i$-th piece from the left is indigo and&nbsp;<code>O</code>&nbsp;if it is orange.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y&nbsp;z</code>, where&nbsp;$x$&nbsp;is the test case number (starting from 1),&nbsp;$y$&nbsp;is the initial of the winner (<code>I</code>&nbsp;for Izabella or&nbsp;<code>O</code>&nbsp;for Olga), and&nbsp;$z$&nbsp;is the score the winner gets.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>Each character of&nbsp;$B$ is either an uppercase letter&nbsp;<code>I</code>&nbsp;or an uppercase letter&nbsp;<code>O</code>.</li>
</ul>

### 힌트

<p>In Sample Case #1, Izabella can do better than the example in the statement. If she starts by removing the rightmost piece, Olga has no possible moves and Izabella wins with $7$&nbsp;pieces remaining. Izabella wins&nbsp;$1+7=8$&nbsp;points in total.</p>

<p>In Sample Case #2, Izabella cannot even make her first move, so Olga wins!</p>

<p>In Sample Case #3, neither player has a choice on what to play, and Olga wins after all pieces are exhausted, so she gets only&nbsp;$1$&nbsp;point.</p>

<p>In Sample Case #4, all pieces are exhausted at the end of the game too, but it is Izabella who comes out with the win.</p>
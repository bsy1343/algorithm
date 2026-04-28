# [Silver IV] The Worm Turns - 7359

[문제 링크](https://www.acmicpc.net/problem/7359)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 60, 정답: 45, 맞힌 사람: 30, 정답 비율: 83.333%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Worm is an old computer game. There are many versions, but all involve maneuvering a &quot;worm&quot; around the screen, trying to avoid running the worm into itself or an obstacle.</p>

<p>We&#39;ll simulate a very simplified version here. The game will be played on a 50 x 50 board, numbered so that the square at the upper left is numbered (1, 1). The worm is initially a string of 20 connected squares. Connected squares are adjacent horizontally or vertically. The worm starts stretched out horizontally in positions (25, 11) through (25, 30), with the head of the worm at (25, 30). The worm can move either East (E), West (W), North (N) or South (S), but will never move back on itself. So, in the initial position, a W move is not possible. Thus the only two squares occupied by the worm that change in any move are its head and tail. Note that the head of the worm can move to the square just vacated by the worm&#39;s tail.</p>

<p>You will be given a series of moves and will simulate the moves until either the worm runs into itself, the worm runs off the board, or the worm successfully negotiates its list of moves. In the first two cases you should ignore the remaining moves in the list.</p>

### 입력

<p>There will be multiple problems instances. The input for each problem instance will be on two lines. The first line is an integer n (&lt;100) indicating the number of moves to follow. (A value of n = 0 indicates end of input.) The next line contains n characters (either E, W, N or S), with no spaces separating the letters, indicating the sequence of moves.</p>

<p>&nbsp;</p>

### 출력

<p>Generate one line of output for each problem instance. The output line should be one of the follow three:</p>

<ul>
	<li>The worm ran into itself on move m.</li>
	<li>The worm ran off the board on move m.</li>
	<li>The worm successfully made all m moves.</li>
</ul>

<p>Where m is for you to determine and the first move is move 1.</p>
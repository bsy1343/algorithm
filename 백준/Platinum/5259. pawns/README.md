# [Platinum IV] pawns - 5259

[문제 링크](https://www.acmicpc.net/problem/5259)

### 성능 요약

시간 제한: 0.2 초, 메모리 제한: 64 MB

### 통계

제출: 27, 정답: 7, 맞힌 사람: 4, 정답 비율: 16.667%

### 분류

구현, 그래프 이론, 그래프 탐색, 시뮬레이션, 너비 우선 탐색, 비트마스킹

### 문제 설명

<p>&ldquo;Pawns&rdquo; is a game that takes place on a board of a length of N and width of 1. The board is divided into N squares having the side 1, numbered 1, 2, ..., N from left to right. Each of the N squares (positions) of the board can be at some point empty or taken by a pawn. The pawns may be white or black. The initial position is given for each pawn on the board. The pawns can be moved according to the following rules:</p>

<ul>
	<li>A white pawn in two ways:
	<ul>
		<li>it can take the left position adjacent to its current position, if it is empty;</li>
		<li>it can be moved two squares to the left if the left adjacent position is taken by another pawn and the next to the left is free (the pawn can &ldquo;jump&rdquo; over its left neighbour)</li>
	</ul>
	</li>
	<li>A black pawn in two ways:
	<ul>
		<li>it can take the right position adjacent to its current position, if it is empty;</li>
		<li>it can be moved two squares to the right if the right adjacent position is taken by another pawn and the next to the right is free (the pawn can &ldquo;jump&rdquo; over its right neighbour)</li>
	</ul>
	</li>
</ul>

<p>After a pawn is moved, its must remain on the game board. You must bear in mind that if a pawn can be moved at some point, it can be moved only in one way.</p>

<p>To complete the game means to bring the white pawns to the front positions of the board and the black pawns to the back positions (white pawns will take positions 1, 2, &hellip;, without leaving any empty positions inbetween; black pawns will take positions N, N-1, &hellip;, without leaving any empty positions in-between)</p>

<p>Knowing the initial positions of the pawns on the board, you are to find the minimum number of moves needed to complete the game and the moves themselves. It is guaranteed that the initial positions are given so as to complete the game after a finite number of moves.</p>

### 입력

<p>The input contains integer N in the first line, representing the length of the board. The second line of the file contains N integers belonging to the set {0, 1, 2}, separated by one space. 0 means an empty position, 1 means a position taken by a white pawn and 2 means a position taken by a black pawn. The first number on the second line corresponds to the first position on the board, the second number corresponds to the second position and so on.</p>

### 출력

<p>The output will contain integer X on the first line representing the number of moves needed to complete the game. On the second line there will be X integers separated by a space. These represent the moves in the order in which they are to be performed. A movement is indicated by the number of the position of the pawn to be moved.</p>

### 제한

<ul>
	<li>2 &le; N &le; 13;</li>
	<li>For each test there is at least one white pawn and at least one black pawn;</li>
</ul>

### 힌트

<p>In the example above the initial configuration and the configuration after each move are illustrated as follows:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5259.%E2%80%85pawns/fb9bbece.png" data-original-src="https://upload.acmicpc.net/88c4c6bc-aafd-45b5-9da7-19d033e6aaa9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 245px; height: 241px;" /></p>
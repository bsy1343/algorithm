# [Platinum III] King (Small) - 12685

[문제 링크](https://www.acmicpc.net/problem/12685)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 25, 맞힌 사람: 22, 정답 비율: 66.667%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 게임 이론, 스프라그–그런디 정리

### 문제 설명

<p>Alice and Bob want to play a game. The game is played on a chessboard with&nbsp;<strong>R</strong>&nbsp;rows and&nbsp;<strong>C</strong>&nbsp;columns, for a total of&nbsp;<strong>RC</strong>&nbsp;squares. Some of these squares are burned.</p>

<p>A king will be placed on an unburned square of the board, and Alice and Bob will make successive moves with the king.</p>

<p>In a move, the player must move the king to any of its 8 neighboring squares, with the following two conditions:</p>

<ul>
	<li>The destination square must not be burned</li>
	<li>The king must never have been in the destination square before.</li>
</ul>

<p>If a player can&#39;t make a move, he or she loses the game. Alice will move first; you need to determine who will win, assuming both players play optimally.</p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>N</strong>.</p>

<p><strong>N</strong>&nbsp;test cases follow. The first line of each case will contain two integers,&nbsp;<strong>R</strong>&nbsp;and&nbsp;<strong>C</strong>. The next&nbsp;<strong>R</strong>&nbsp;lines will contain strings of length&nbsp;<strong>C</strong>, representing the&nbsp;<strong>C</strong>&nbsp;squares of each row. Each string will contain only the characters &#39;.&#39;, &#39;#&#39; and &#39;K&#39;:</p>

<ul>
	<li>&#39;#&#39; means the square is burned;</li>
	<li>&#39;.&#39; means the square is unburned, and unoccupied; and</li>
	<li>&#39;K&#39; means the king is in that cell at the beginning of the game.</li>
</ul>

<p>There will be only one &#39;K&#39; character in each test case.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100</li>
	<li>1 &le;&nbsp;<strong>R</strong>,&nbsp;<strong>C</strong>&nbsp;&le; 4</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>X</strong>: &quot; (where&nbsp;<strong>X</strong>&nbsp;is the case number, starting from 1) followed by A if Alice wins, or B if Bob wins.</p>
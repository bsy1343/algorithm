# [Platinum IV] Millenium Leapcow - 27050

[문제 링크](https://www.acmicpc.net/problem/27050)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 6, 맞힌 사람: 6, 정답 비율: 40.000%

### 분류

방향 비순환 그래프, 다이나믹 프로그래밍, 그래프 이론, 구현, 위상 정렬

### 문제 설명

<p>The cows have revised their game of leapcow. They now play in the middle of a huge pasture upon which they have marked a grid that bears a remarkable resemblance to a chessboard of N rows and N columns (3 &le; N &le; 365).</p>

<p>Here&#39;s how they set up the board for the new leapcow game:</p>

<ul>
	<li>First, the cows obtain N x N squares of paper. They write the integers from 1 through N x N, one number on each piece of paper.</li>
	<li>Second, the &#39;number cow&#39; places the papers on the N x N squares in an order of her choosing.</li>
</ul>

<p>Each of the remaining cows then tries to maximize her score in the game.</p>

<ul>
	<li>First, she chooses a starting square and notes its number.</li>
	<li>Then, she makes a &#39;knight&#39; move (like the knight on a chess board) to a square with a higher number. If she&#39;s particularly strong, she leaps to the that square; otherwise she walks.</li>
	<li>She continues to make &#39;knight&#39; moves to higher numbered squares until no more moves are possible.</li>
</ul>

<p>Each square visited by the &#39;knight&#39; earns the competitor a single point. The cow with the most points wins the game.</p>

<p>Help the cows figure out the best possible way to play the game.</p>

### 입력

<ul>
	<li>Line 1: A single integer: the size of the board</li>
	<li>Lines 2.. ...: These lines contain space-separated integers that tell the contents of the chessboard. The first set of lines (starting at the second line of the input file) represents the first row on the chessboard; the next set of lines represents the next row, and so on. To keep the input lines of reasonable length, when N &gt; 15, a row is broken into successive lines of 15 numbers and a potentially shorter line to finish up a row. Each new row begins on its own line.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer that is the winning cow&#39;s score; call it W.</li>
	<li>Lines 2..W+1: Output, one per line, the integers that are the starting square, the next square the winning cow visits, and so on through the last square. If a winning cow can choose more than one path, show the path that would be the &#39;smallest&#39; if the paths were sorted by comparing their respective &#39;square numbers&#39;.</li>
</ul>
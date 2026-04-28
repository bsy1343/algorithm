# [Gold IV] Towers of Hanoi Grid - 25938

[문제 링크](https://www.acmicpc.net/problem/25938)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 31, 맞힌 사람: 28, 정답 비율: 56.000%

### 분류

수학, 애드 혹

### 문제 설명

<p>Towers of Hanoi is a rather famous problem for computer scientists as it is an excellent exercise in recursion. For those of you unfamiliar, here is the classic problem. You are given three pegs. On the first peg, there are d disks placed in decreasing order of size (as placed on the peg). The objective of the game is to move the entire tower from the first peg to the last peg. In each move, you are only allowed to move a single disk from the top of one stack to another stack. For the entire game, no disk of larger size is ever allowed to be placed on top of a disk of smaller size. The goal of the puzzle is to move the tower in the minimum number of moves.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25938.%E2%80%85Towers%E2%80%85of%E2%80%85Hanoi%E2%80%85Grid/2a6473b9.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/25938.%E2%80%85Towers%E2%80%85of%E2%80%85Hanoi%E2%80%85Grid/2a6473b9.png" data-original-src="https://upload.acmicpc.net/3bd5b53a-623c-4ca6-a631-d7ad01b39070/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 419px; height: 141px;" /></p>

<p>In our problem, we will instead have an n &times; n grid of pegs. The rows are numbered top to bottom from 1 to n, while the columns are similarly labeled, from left to right, 1 to n. The original tower is placed on the top left peg (1, 1). The goal is to move the tower to the bottom right peg (n, n) in the minimum number of moves possible.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25938.%E2%80%85Towers%E2%80%85of%E2%80%85Hanoi%E2%80%85Grid/980b5d49.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/25938.%E2%80%85Towers%E2%80%85of%E2%80%85Hanoi%E2%80%85Grid/980b5d49.png" data-original-src="https://upload.acmicpc.net/4c245a47-2d26-4b0f-afbb-1b91d88a12ae/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 518px; height: 368px;" /></p>

<p>Our game will have some different but related rules:</p>

<ul>
	<li>For a peg (r, c) at row r and column c, you may only move the top-most disk from peg (r, c) to peg (r + 1, c) or peg (r, c + 1), in a single move and only if such a pair of pegs exists.</li>
	<li>Only pegs (1, 1) and/or (n, n) may have more than one disk at any time; all other pegs may contain at most one disk.</li>
	<li>You can choose any peg for each move.</li>
	<li>You still may never place a larger disk on a smaller disk.</li>
</ul>

<p>Given the number of disks on the starting peg and the number n described above, determine the minimum number of moves to solve our Tower of Hanoi Grid puzzle.</p>

### 입력

<p>The first input line contains a positive integer, g, indicating the number of grids to solve. The grids are on the following g input lines, one grid per line. Each grid is described by two integers d and n (2 &le; d &le; 100, 2 &le; n &le; 100), representing the number of disks and the dimensions of the grid, respectively.</p>

### 출력

<p>For each grid, output &ldquo;Grid #d: v&rdquo; where v is the minimum number of moves to solve the Tower of Hanoi Grid puzzle. If it is not possible to move the disks from peg (1,1) to peg (n, n), output &ldquo;impossible&rdquo; (without quotes) for v. Leave a blank line after the output for each grid.</p>
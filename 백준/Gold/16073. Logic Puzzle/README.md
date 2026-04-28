# [Gold V] Logic Puzzle - 16073

[문제 링크](https://www.acmicpc.net/problem/16073)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 97, 정답: 63, 맞힌 사람: 61, 정답 비율: 64.211%

### 분류

구현

### 문제 설명

<p>While browsing a kiosk at a recent trip, you bought a magazine filled with various kinds of logic puzzles. After a while of solving, however, you start to get a bit bored of the puzzles. Still wanting to complete all the puzzles in the magazine, you start wondering about ways to solve some of them algorithmically.</p>

<p>The puzzle you are currently trying to solve is called Mosaic, and it is quite similar to the classic Minesweeper video game:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/16073.%E2%80%85Logic%E2%80%85Puzzle/7bcf78d8.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/16073.%E2%80%85Logic%E2%80%85Puzzle/7bcf78d8.png" data-original-src="https://upload.acmicpc.net/6765c456-ce04-4d09-83de-69c9ca3b4e05/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 396px; height: 163px;" /></p>

<p style="text-align: center;">Figure L.1: Illustration of the first sample</p>

<p>You are given a two-dimensional grid of cells, initially all white, and you have to color some of the cells in black. You are also given a grid of clue numbers, which extends beyond the borders of the puzzle grid by one cell in each direction. The number in a cell indicates (exactly) how many cells in the 3 &times; 3 block centered at this cell need to be colored in black. You may not color any cells outside of the original grid.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with two integers h, w (1 &le; h, w &le; 100), the height and width of the puzzle;</li>
	<li>h + 2 lines, each with w + 2 integers c<sub>1</sub>, . . . , c<sub>w+2</sub> (0 &le; c<sub>i</sub> &le; 9), the clue numbers.</li>
</ul>

### 출력

<p>If the given clue numbers are inconsistent, output impossible. Otherwise, output h lines with w characters each, the solution to the puzzle. Use X for black cells and . for white cells. If there are multiple solutions, any of them will be accepted.</p>
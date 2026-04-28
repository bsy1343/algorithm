# [Gold III] Simply Sudoku - 21159

[문제 링크](https://www.acmicpc.net/problem/21159)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 20, 맞힌 사람: 18, 정답 비율: 64.286%

### 분류

구현

### 문제 설명

<p>Sudoku puzzles come in all different shapes and difficulty levels. Traditionally a Sudoku puzzle is a $9\times9$ grid. Initially, some of the cells are filled in with numbers and some are empty. The goal is to fill in each cell with a number in the range $1$ -- $9$ subject to the following restrictions:</p>

<ul>
	<li>Each digit $1$ -- $9$ must appear once in each row</li>
	<li>Each digit $1$ -- $9$ must appear once in each column</li>
	<li>Each digit $1$ -- $9$ must appear once in each $3\times3$ sub-grid</li>
</ul>

<p>The difficulty of a Sudoku puzzle can vary widely. The easiest puzzles can be solved with the following two simple techniques:</p>

<ul>
	<li><strong>Single Value Rule:</strong>&nbsp;search for squares which only have one possible value that can be put there.</li>
	<li><strong>Unique Location Rule:</strong>&nbsp;within any row, column or sub-grid search for a value that can only be placed in one of the nine locations.</li>
</ul>

<p>Consider the partially solved Sudoku puzzle shown in Figure 1. &nbsp;The Single Value Rule applies to grid square A$7$ where $8$ is the only value that can be placed there. &nbsp;The Unique Location Rule can be used to put a $5$ in square B$3$ as it is the only location in row $3$ where a $5$ can be placed.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21159.%E2%80%85Simply%E2%80%85Sudoku/b19c5360.png" data-original-src="https://upload.acmicpc.net/3ac610d9-58c3-4bf2-b937-f9cdb8e5fb09/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 413px;" /></p>

<p style="text-align: center;">Figure 1:&nbsp;Sample Input $1$</p>

<p>The easiest Sudoku puzzles can be solved with only these two rules; harder puzzles use techniques like swordfish, x-wings and BUGs.</p>

<p>For this problem you will be given a Sudoku puzzle and must determine if it is an easy puzzle, i.e., whether it can be solved by just using the Single Value and Unique Location rules.</p>

### 입력

<p>Input consists of a single Sudoku puzzle given over nine lines. &nbsp;Each line contains $9$ values in the range $0$ to $9$, where a $0$ indicates a blank in the puzzle.</p>

### 출력

<p>Output the word <code>Easy</code> followed by the solved Sudoku puzzle if it is an easy puzzle. &nbsp;The puzzle should be printed on nine lines with a single space separating values on a line. &nbsp;If the puzzle is not easy output <code>Not easy</code> followed by as much of the Sudoku puzzle as can be solved using the two rules described above. &nbsp;Use the same format for the partial solution as for the complete solution using a &#39;<code>.</code>&#39; instead of a digit for a unfilled square.</p>
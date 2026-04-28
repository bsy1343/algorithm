# [Gold III] Minesweeper - 7624

[문제 링크](https://www.acmicpc.net/problem/7624)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 5, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

백트래킹

### 문제 설명

<p>In the game of minesweeper, you are shown a grid. Some cells in the grid contain mines. If you think that a cell does not contain a mine, you can reveal that cell. If the cell contained a mine, you lose, but if not, then you learn how many neighboring cells, including diagonals, also contain mines.</p>

<p>Given a minesweeper grid, determine which cells must contain mines and which cells cannot contain mines.</p>

### 입력

<p>The first line of input is two integers, the width and height of the grid. The remainder of the input is an image of the grid. A cell containing a digit is revealed, which means that it contains no mine and that the number of adjacent mines (including diagonals) is that digit. A cell containing a period is not revealed.</p>

<p>The grid is at most 30 columns by 16 rows. This problem is, in general, hard, so we will not give input in which the number of possible arrangements of mines adjacent to revealed cells is more than a few tens of thousands. We also guarantee that there is at least one valid arrangement of mines.</p>

### 출력

<p>Output an image of the grid. Each revealed cell should have its digit printed, cells that must contain mines are marked by &ldquo;*,&rdquo; and cells that cannot contain mines but are not revealed are marked by a space.</p>
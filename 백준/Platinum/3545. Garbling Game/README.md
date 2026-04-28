# [Platinum II] Garbling Game - 3545

[문제 링크](https://www.acmicpc.net/problem/3545)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

임의 정밀도 / 큰 수 연산, 자료 구조, 희소 배열

### 문제 설명

<p>Pavel had invented a new game with a matrix of integer numbers. He takes r &times; c matrix with r rows and c columns that is filled with numbers from 1 to rc left to right and top to bottom (1 is written in the upper-left corner, rc is written in the lower-right corner). Then he starts to rearrange the numbers is the matrix by following the rules that are explained below and writes down a sequence of numbers on a separate piece of paper. He calls it garbling of the matrix.</p>

<p>The rules of rearrangement are defined by garbling map that is (r &minus; 1) &times; (c &minus; 1) matrix of letters L, R, and N. Initial 4 &times; 5 matrix and the sample 3 &times; 4 garbling map for it are shown below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3545.%E2%80%85Garbling%E2%80%85Game/f622315b.png" data-original-src="https://www.acmicpc.net/upload/images3/grabling.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:102px; width:338px" /></p>

<p>Pavel garbles the matrix in a series of turns. On his first turn Pavel takes the number in the first row and the first column (it is put in parenthesis on the above picture for clarity) and writes it down.</p>

<p>Having written down the number he performs one garbling turn:</p>

<p>Pavel looks at the letter in the garbling map that corresponds to the position of the number he had just written down (one the first turn it is the letter in the upper-left corner). Depending on the letter in the garbling map the 2 &times; 2 block of the matrix whose upper-left corner contains the number he had just written (highlighted in the above picture) is rearranged in the following way:</p>

<ul>
	<li>R &mdash; the block is rotated clockwise.</li>
	<li>L &mdash; the block is rotated counterclockwise.</li>
	<li>N &mdash; Pavel does not change the matrix on this turn.</li>
</ul>

<p>On the second turn Pavel takes the number in the first row and second column, writes it down, and performs the garbling turn, and so on. In c &minus; 1 turns he finishes the first row and moves to the second row and so on he proceeds left to right and top to bottom. In (r &minus; 1)(c &minus; 1) turns he had written down (r&minus;1)(c&minus;1) numbers and garbled the whole matrix, so he starts again in the upper-left corner continuing garbling the matrix from left to right and top to bottom.</p>

<p>The matrices below show the effect of the first four turns with the sample garbling map.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3545.%E2%80%85Garbling%E2%80%85Game/95e93775.png" data-original-src="https://www.acmicpc.net/upload/images3/garbling2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:83px; width:681px" /></p>

<p>The following sequence of numbers is written down in the first 4 turns: 1 7 7 9. On 5th turn the number from the second row and the first column is written, but the matrix remains unchanged, since the second row and the first column of the garbling map contains N. In six turns Pavel gets 1 7 7 9 1 8.</p>

<p>Given the garbling map and the number of moves Pavel makes in this game, find out how many times each number gets written down by Pavel. You need to provide the answer modulo 10<sup>5</sup>.</p>

### 입력

<p>The first line of the input file contains three integer numbers &mdash; r, c, and n, where r, c (2 &le; r, c &le; 300) are the dimensions of the initial matrix, n (0 &le; n &lt; 10100) is the number of turns Pavel makes.</p>

<p>The following r &minus; 1 lines contain garbling map with c &minus; 1 characters R, L, or N on a line.</p>

### 출력

<p>Write to the output file rc lines with one integer number per line. On i-th line write the number of times number i gets written down by Pavel modulo 10<sup>5</sup> while he makes his n turns.</p>
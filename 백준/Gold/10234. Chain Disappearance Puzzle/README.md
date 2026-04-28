# [Gold I] Chain Disappearance Puzzle - 10234

[문제 링크](https://www.acmicpc.net/problem/10234)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 11, 정답: 11, 맞힌 사람: 10, 정답 비율: 100.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>We are playing a puzzle. An upright board with <i>H</i> rows by 5 columns of cells, as shown in the figure below, is used in this puzzle. A stone engraved with a digit, one of 1 through 9, is placed in each of the cells. When three or more stones in horizontally adjacent cells are engraved with the same digit, the stones will disappear. If there are stones in the cells above the cell with a disappeared stone, the stones in the above cells will drop down, filling the vacancy.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10234.%E2%80%85Chain%E2%80%85Disappearance%E2%80%85Puzzle/fc17e9fc.png" data-original-src="https://upload.acmicpc.net/618a4b2a-61ae-4bd7-a867-6459641d734a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 287px; height: 277px;" /></p>

<p>The puzzle proceeds taking the following steps.</p>

<ol>
	<li>When three or more stones in horizontally adjacent cells are engraved with the same digit, the stones will disappear. Disappearances of all such groups of stones take place simultaneously.</li>
	<li>When stones are in the cells above the emptied cells, these stones drop down so that the emptied cells are filled.</li>
	<li>After the completion of all stone drops, if one or more groups of stones satisfy the disappearance condition, repeat by returning to the step 1.</li>
</ol>

<p>The score of this puzzle is the sum of the digits on the disappeared stones.</p>

<p>Write a program that calculates the score of given configurations of stones.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10234.%E2%80%85Chain%E2%80%85Disappearance%E2%80%85Puzzle/afc62512.png" data-original-src="https://upload.acmicpc.net/34124431-67ee-4647-8c3d-d5e5bdccdad6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 804px; height: 661px;" /></p>

### 입력

<p>The input consists of multiple datasets. Each dataset is formed as follows.</p>

<blockquote>
<p>Board height <i>H</i></p>

<p>Stone placement of the row 1</p>

<p>Stone placement of the row 2</p>

<p>...</p>

<p>Stone placement of the row <i>H</i></p>
</blockquote>

<p>The first line specifies the height ( <i>H </i>) of the puzzle board (1 &le; <i>H</i> &le; 10). The remaining <i>H</i> lines give placement of stones on each of the rows from top to bottom. The placements are given by five digits (1 through 9), separated by a space. These digits are engraved on the five stones in the corresponding row, in the same order.</p>

<p>The input ends with a line with a single zero.</p>

### 출력

<p>For each dataset, output the score in a line. Output lines may not include any characters except the digits expressing the scores.</p>
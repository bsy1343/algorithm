# [Gold II] Grid Coloring - 33724

[문제 링크](https://www.acmicpc.net/problem/33724)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 108, 정답: 44, 맞힌 사람: 44, 정답 비율: 42.308%

### 분류

이분 탐색, 자료 구조, 집합과 맵

### 문제 설명

<p>President K is designing a pattern represented by a grid with $N$ rows and $N$ columns. To achieve this, he has decided to paint each cell with a color represented by an integer number. Let us refer to the cell in the $i$-th row ($1 ≤ i ≤ N$) and $j$-th column ($1 ≤ j ≤ N$) as cell $(i, j)$.</p>

<p>Currently, the cells in the first column and first row are already painted. Specifically, cell $(i, 1)$ ($1 ≤ i ≤ N$) is painted with color $A_i$ and cell $(1, j)$ ($1 ≤ j ≤ N$) is painted with color $B_j$. Note that $A_1 = B_1$.</p>

<p>For the remaining unpainted cells, President K is going to paint them by the following procedure:</p>

<ul>
	<li>For each $i = 2, 3, \dots , N$ in order, paint the cells in the $i$-th row as follows:
	<ul>
		<li>For each $j = 2, 3, \dots , N$ in order, paint cell $(i, j)$ with the color that has the larger number between:
		<ul>
			<li>The color of cell $(i - 1, j)$, and</li>
			<li>The color of cell $(i, j − 1)$.</li>
		</ul>
		</li>
		<li>If both colors have the same number, paint the cell with that color.</li>
	</ul>
	</li>
</ul>

<p>President K would like to determine the color that is painted on the largest number of cells after all $N^2$ cells have been painted, as well as the number of cells painted with that color.</p>

<p>Write a program that, given the size of the grid and the color information for the first column and first row, determines the color number painted on the largest number of cells and the number of cells painted with that color. If multiple colors are painted on the largest number of cells, output the largest color number among them.</p>

### 입력

<p>Read the following data from the standard input.</p>

<blockquote>
<p>$N$</p>

<p>$A_1$ $A_2$ $\cdots$ $A_N$</p>

<p>$B_1$ $B_2$ $\cdots$ $B_N$</p>
</blockquote>

### 출력

<p>Write one line to the standard output containing two integers separated by a space:</p>

<ol>
	<li>The color number that is painted on the largest number of cells, and</li>
	<li>The number of cells painted with that color.</li>
</ol>

<p>If multiple colors are painted on the largest number of cells, output the largest color number among them.</p>

### 제한

<ul>
	<li>$2 ≤ N ≤ 200\, 000$.</li>
	<li>$1 ≤ A_i ≤ 10^9$ ($1 ≤ i ≤ N$).</li>
	<li>$1 ≤ B_j ≤ 10^9$ ($1 ≤ j ≤ N$).</li>
	<li>$A_1 = B_1$.</li>
	<li>Given values are all integers.</li>
</ul>
# [Silver III] Flip and Turn - 3634

[문제 링크](https://www.acmicpc.net/problem/3634)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 71, 정답: 16, 맞힌 사람: 15, 정답 비율: 22.388%

### 분류

애드 혹, 구현

### 문제 설명

<p>Let us define a set of operations on a rectangular matrix of printable characters.&nbsp;</p>

<p>A matrix $A$ with $m$ rows (1-st index) and $n$ columns (2-nd index) is given. The resulting matrix $B$ is defined as follows.&nbsp;</p>

<ul>
	<li>Transposition by the main diagonal (operation identifier is &#39;<code>1</code>&#39;): $B_{j,i}=A_{i,j}$</li>
	<li>Transposition by the second diagonal (&#39;<code>2</code>&#39;): $B_{n-j+1,m-i+1}=A_{i,j}$</li>
	<li>Horizontal flip (&#39;<code>H</code>&#39;): $B_{m-i+1,j}=A_{i,j}$</li>
	<li>Vertical flip (&#39;<code>V</code>&#39;): $B_{i,n-j+1}=A_{i,j}$</li>
	<li>Rotation by 90 (&#39;<code>A</code>&#39;), 180 (&#39;<code>B</code>&#39;), or 270 (&#39;<code>C</code>&#39;) degrees clockwise; 90 degrees case: $B_{j,m-i+1}=A_{i,j}$</li>
	<li>Rotation by 90 (&#39;<code>X</code>&#39;), 180 (&#39;<code>Y</code>&#39;), or 270 (&#39;<code>Z</code>&#39;) degrees counterclockwise; 90 degrees case: $B_{n-j+1,i}=A_{i,j}$</li>
</ul>

<p>You are given a sequence of no more than $100\,000$ operations from the set. Apply the operations to the given matrix and output the resulting matrix.</p>

### 입력

<p>At the first line of the input file there are two integer numbers --- $m$ and $n$ ($0 &lt; m,n \le 300$). Then there are $m$ lines with $n$ printable characters per line (we define a printable character as a symbol with ASCII code from 33 to 126 inclusive). There will be no additional symbols at these lines.</p>

<p>The next line contains the sequence operations to be performed, specified by their one-character identifiers. The operations should be performed from left to right.</p>

### 출력

<p>Two integer numbers, the number of rows and columns in the output matrix. Then the output matrix must follow, in the same format as the input one.</p>
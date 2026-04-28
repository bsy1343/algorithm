# [Gold V] Spreadsheet - 6894

[문제 링크](https://www.acmicpc.net/problem/6894)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 7, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

그래프 이론, 그래프 탐색, 구현, 시뮬레이션

### 문제 설명

<p>A spreadsheet consists of a number of &quot;cells&quot; set in a rectangular grid. Each is addressed with one letter from $A$ to $J$ (giving the row) and one number from $1$ to $9$ (giving the column). Thus the upper-left cell of the spreadsheet is $A1$, and the lower-right cell is $J9$.</p>

<p>Every cell has a value, and this can be specified in one of two ways:</p>

<ol>
	<li>as an integer from $0$ to $1000$</li>
	<li>as a sum of the values of up to $10$ other cells</li>
</ol>

<p>Cell values may be interdependent (that is, $A1$&#39;s sum may depend on $B6$ which depends on $C9$), but a cell whose value depends on itself, directly or indirectly, is undefined (e.g., $A1$ depending on $G8$ depending on $A1$). Also, a cell whose value depends on an undefined cell is itself undefined. You are given the specification for all the cells in the spreadsheet. Compute and output the values of all of the cells.</p>

### 입력

<p>Input will consist of $10$ lines, one per spreadsheet row. Each line contains 9 descriptions of a cell, which will be either an integer between $0$ and $1\,000$, or a sum of $1$ to $10$ distinct cell names separated by a <code>+</code> symbol (e.g. <code>A1+B5+D3</code>).</p>

### 출력

<p>Output $10$ lines, with $9$ numbers per line, giving the value of every cell in the spreadsheet; if the cell is undefined, print an asterisk (<code>*</code>) in place of its value. No cell&#39;s final value will exceed $1\,000\,000\,000$.</p>
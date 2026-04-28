# [Silver II] Dynamic Grid (Small) - 12050

[문제 링크](https://www.acmicpc.net/problem/12050)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 195, 정답: 141, 맞힌 사람: 125, 정답 비율: 78.125%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 플러드 필

### 문제 설명

<p>We have a grid with&nbsp;<strong>R</strong>&nbsp;rows and&nbsp;<strong>C</strong>&nbsp;columns in which every entry is either 0 or 1. We are going to perform&nbsp;<strong>N</strong>&nbsp;operations on the grid, each of which is one of the following:</p>

<ul>
	<li>Operation M: Change a number in one cell of the grid to 0 or 1</li>
	<li>Operation Q: Determine the number of different&nbsp;<em>connected regions</em>&nbsp;of 1s. A connected region of 1s is a subset of cells that are all 1, in which any cell in the region can be reached from any other cell in the region by traveling between cells along edges (<strong>not</strong>&nbsp;corners).</li>
</ul>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each test case starts with one line with two integers,&nbsp;R&nbsp;and&nbsp;C, which represent the number of rows and columns in the grid. Then, there are&nbsp;R&nbsp;lines of&nbsp;C&nbsp;characters each, in which every character is either&nbsp;0&nbsp;or&nbsp;1. These lines represent the initial state of the grid.</p>

<p>The next line has one integer,&nbsp;N, the number of operations to perform on the grid.&nbsp;N&nbsp;more lines follow; each has one operation. All operation Ms will be of the form&nbsp;M x y z, meaning that the cell at row x and column y should be changed to the value z. All operation Qs will be of the form&nbsp;Q.</p>

### 출력

<p>For each test case, output one line containing &quot;Case #x:&quot;, where x is the test case number (starting from 1). Then, for every operation Q in the test case, in order, output one line containing the number of connected regions of 1s.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 10.</li>
	<li>1 &le;&nbsp;<strong>R, C</strong>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<strong>x</strong>&nbsp;&lt;&nbsp;<strong>R</strong>.</li>
	<li>0 &le;&nbsp;<strong>y</strong>&nbsp;&lt;&nbsp;<strong>C</strong>.</li>
	<li>0 &le;&nbsp;<strong>z</strong>&nbsp;&le; 1.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10.</li>
</ul>
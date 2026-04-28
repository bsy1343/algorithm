# [Platinum IV] Hamiltonian Tour - 25087

[문제 링크](https://www.acmicpc.net/problem/25087)

### 성능 요약

시간 제한: 25 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 39, 정답: 22, 맞힌 사람: 18, 정답 비율: 60.000%

### 분류

해 구성하기, 깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Hamilton is a Canadian city near Toronto, and a nice place to take a walking tour.</p>

<p>In this problem, Hamilton is represented by a grid of unit cells with $2R$ rows and&nbsp;$2C$&nbsp;columns, where each cell is either empty (represented by&nbsp;<code>*</code>) or contains a building (represented by&nbsp;<code>#</code>). The cell on the&nbsp;$i$-th row and&nbsp;$j$-th column is represented by&nbsp;$A_{i,j}$ where&nbsp;$1&le;i&le;2R$&nbsp;and&nbsp;$1&le;j&le;2C$. It is not possible to enter cells containing buildings and you can only move to an adjacent cell that shares a side with the current cell (not just a corner). The grid is such that if it is divided evenly into $2&times;2$&nbsp;blocks of unit cells, then in each of those blocks, either all four cells are empty, or all four cells are occupied by a building. Let us represent the block formed by&nbsp;$A_{2i-1,2j-1}$, $A_{2i-1,2j}$, $A_{2i,2j-1}$,&nbsp;and&nbsp;$A_{2i,2j}$&nbsp;cells as&nbsp;$B_{i,j}$&nbsp;where&nbsp;$1&le;i&le;R$&nbsp;and&nbsp;$1&le;j&le;C$.</p>

<p>Grace is a tourist in Hamilton and wants to visit all the empty cells in Hamilton. Grace is currently in cell $A_{1,1}$. Visiting the same cell twice could be boring for her. Hence, Grace wants to visit each of the empty cells exactly once and finally end in cell&nbsp;$A_{1,1}$. Can you help Grace by providing a string (consisting of directional moves {<code>N</code>,&nbsp;<code>E</code>,&nbsp;<code>S</code>,&nbsp;<code>W</code>} representing the unit moves to the north, east, south, or west respectively) which Grace can follow to visit every empty cell once and end again in&nbsp;$A_{1,1}$.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;$T$.&nbsp;$T$&nbsp;test cases follow. The first line of each test case contains two integers&nbsp;$R$&nbsp;and&nbsp;$C$. The next&nbsp;$R$&nbsp;lines of each test case contains&nbsp;$C$&nbsp;characters each.</p>

<p>The&nbsp;$j$-th character on the&nbsp;$i$-th of these lines represents the block&nbsp;$B_{i,j}$ formed by the following four cells:&nbsp;$A_{2i-1,2j-1}$, $A_{2i-1,2j}$, $A_{2i,2j-1}$,&nbsp;and&nbsp;$A_{2i,2j}$. If $B_{i,j}=$&nbsp;<code>#</code>, all four of the cells in $B_{i,j}$ are occupied by a building. Otherwise, if $B_{i,j}=$&nbsp;<code>*</code>, all four of the cells in&nbsp;$B_{i,j}$ are empty.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;$x$&nbsp;is the test case number (starting from 1) and&nbsp;$y$&nbsp;is the answer to the problem as follows.</p>

<p>If there is no solution to the problem,&nbsp;$y$&nbsp;should be&nbsp;<code>IMPOSSIBLE</code>. Otherwise,&nbsp;$y$&nbsp;should be a sequence of characters from the set {<code>N</code>,&nbsp;<code>E</code>,&nbsp;<code>S</code>,&nbsp;<code>W</code>}, representing the unit moves (to the north, east, south, or west respectively) in a valid route, starting from&nbsp;$A_{1,1}$, as described in the statement above.</p>

<p>Note that your last move should take you to&nbsp;$A_{1,1}$; this move does not count as visiting the same cell twice.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>$1&le;R&le;200$.</li>
	<li>$1&le;C&le;200$.</li>
	<li>All characters in the grid are from the set {<code>#</code>,<code>*</code>}.</li>
	<li>The first character of the first line of the input grid for each test case is a&nbsp;<code>*</code>&nbsp;character, i.e.&nbsp;$B_{1,1}=$<code>*</code>.</li>
</ul>
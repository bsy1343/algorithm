# [Platinum II] Pipes - 4169

[문제 링크](https://www.acmicpc.net/problem/4169)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

구현, 다이나믹 프로그래밍, 그래프 이론, 비트마스킹, 최대 유량, 비트필드를 이용한 다이나믹 프로그래밍, 이분 매칭

### 문제 설명

<p>After writing a solver for the &quot;moveable maze&quot; game last week, you have grown tired of it. After all, you already know the optimal solution. To entertain yourself, you find another puzzle game called &quot;Pipes&quot;, and play that for a while. On one puzzle, you have not been able to find a solution by hand, and you think that there is no solution. You decide to write a program to tell you whether this is the case.</p>

<p>The game is played on a grid with R rows and C columns. Each square of the grid contains a black dot in the centre and black lines in the direction of some, none, or all of its north, east, south, and west neighbouring squares, with the following restriction: if two opposite directions both have lines, then at least one of the other two directions has a line as well. In other words, it is forbidden for a square to consist of a straight line.</p>

<p>The objective of the game is to rotate each square, as many times as you like, such that for each square, if it has a line going in a compass direction (that is, north, east, south, or west), then it has a neighbour in that compass direction and that neighbour has a line going in the opposite compass direction. In other words, each edge in the grid should either have a line on both sides or neither side.</p>

<p>Your task is to determine whether a given grid has a solution.</p>

### 입력

<p>The input consists of several test cases.</p>

<p>The first line of each test case contains the two integers R and C, separated by spaces, with 1 &lt;= R,C &lt;= 12.</p>

<p>The following R lines of input each contain one row of the grid, from north to south. Each of these lines contains exactly C strings of letters, separated by spaces, that correspond to squares of the grid, from west to east. Their format is as follows:</p>

<ul>
	<li>If the string is the single character x, then the square does not contain a line to any of its neighbours.</li>
	<li>Otherwise, the string contains some of the characters N, E, S, W, which indicate that a black line extends from this square&#39;s centre in the direction of its north, east, south, or west neighbour, respectively. No character will appear in the string more than once.</li>
</ul>

<p>Input is terminated by a line containing 0 0. These zeros are not a test case and should not be processed.</p>

### 출력

<p>For each test case, output SOLVABLE if there is a solution to the puzzle, and UNSOLVABLE otherwise.</p>
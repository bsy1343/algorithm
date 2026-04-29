# [Platinum IV] Lines of X - 33644

[문제 링크](https://www.acmicpc.net/problem/33644)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 11, 정답: 10, 맞힌 사람: 9, 정답 비율: 90.000%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍, 수학, 조합론, 포함 배제의 원리

### 문제 설명

<p>Tic-tac-toe is boring. The optimal strategy is simple to work out. But what about a generalization to an $N \times N$ board. That also does not seem interesting, and you probably won’t convince anyone to play with you. So you decide to have your own fun with such grids.</p>

<p>Given a $N \times N$ grid $G$ where each cell contains a single <code>X</code>, <code>O</code>, or <code>.</code> (the latter meaning the space is empty), you want to calculate the number of ways one can fill out the empty cells in $G$ so that there is at least one line that is all <code>X</code>. The lines of the grid are the $N$ rows, the $N$ columns, and the $2$ diagonals.</p>

<p>More precisely, compute the number of $N \times N$ grids $H$ that have the following properties:</p>

<ul>
	<li>$H$ contains only <code>X</code> or <code>O</code> entries, no empty cells.</li>
	<li>The only cells where $G$ and $H$ can differ is at the empty cells in $G$.</li>
	<li>At least one row, column, or diagonal line of $H$ only contains <code>X</code>.</li>
</ul>

### 입력

<p>The first line of input contains a single integer $N$ ($2≤N≤8$) indicating the dimensions of the grid. The next $N$ lines describe the rows of the grid, each row is a string of length exactly $N$ containing only characters <code>.</code>, <code>O</code>, <code>X</code>.</p>

### 출력

<p>Output a single number indicating the number of ways to fill out the <code>.</code> characters in the grid with either <code>O</code> or <code>X</code> so that the resulting grid has at least one line with all characters being <code>X</code>.</p>
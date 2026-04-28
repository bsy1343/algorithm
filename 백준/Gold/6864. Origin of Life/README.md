# [Gold I] Origin of Life - 6864

[문제 링크](https://www.acmicpc.net/problem/6864)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

구현, 다이나믹 프로그래밍, 그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Conway&rsquo;s Game of Life is not really a game, but a cellular automaton &mdash; a set of rules describing interactions among adjacent cells on a grid. In our game, we have an n by m rectangular grid of cells identified by integer coordinates (x,y).</p>

<p>The game progresses through a series of steps; at each step a new generation is computed from the current generation. The game begins with the first generation. In any given generation, which we shall call the current generation, each cell is either live or dead. In the next generation, each cell&rsquo;s status may change, depending on the status of its immediate neighbours in the current generation. Two distinct cells (x<sub>1</sub>, y<sub>1</sub>) and (x<sub>2</sub>, y<sub>2</sub>) are immediate neighbours if they are horizontally, vertically, or diagonally adjacent; that is, if |x<sub>1</sub> - x<sub>2</sub>| &le; 1 and |y<sub>1</sub> - y<sub>2</sub>| &le; 1. Each cell that is not on the border of the grid has eight immediate neighbours.</p>

<p>There are three integer parameters (a, b, c) which affect the game. The rules of the game are:</p>

<ul>
	<li>If a live cell has fewer than a live neighbours in the current generation it dies of loneliness. That is, it is dead in the next generation.</li>
	<li>If a live cell has more than b live neighbours in the current generation it dies of overcrowding. That is, it is dead in the next generation.</li>
	<li>If a dead cell has more than c live neighbours in the current generation it is born. That is, it is live in the next generation.</li>
	<li>Otherwise, a cell&rsquo;s status is unchanged from the current generation to the next.</li>
</ul>

<p>This process continues indefinitely. Eventually, a generation may be repeated in which case life goes on forever. Or all the cells may die. Similarly, if we explore previous generations that may have led to the current one, we may find one that is necessarily a first generation; that is, it could not have been created from a previous generation by following the rules. Such a generation is known as a Garden of Eden.</p>

<p>Given the game parameters and the current generation, you are to determine whether or not the game might have started with a Garden of Eden. If so, output the number of steps necessary to reach the current generation from the Garden of Eden. If there are several possible answers, find the smallest. If there is none, output -1.</p>

### 입력

<p>There are m+1 lines of input in total. The first line of input contains the game parameters, which are five integers m, n, a, b, c each separated by one space. The constraints are 1 &le; m &le; 4, 1 &le; n &le; 5, 1 &le; a &lt; b &le; 8, 1 &le; c &le; 8. The next m lines each contain a string of n characters representing a row of the current generation. In the string, an asterisk (&ldquo;*&rdquo;) indicates live while a period (&ldquo;.&rdquo;) indicates dead.</p>

### 출력


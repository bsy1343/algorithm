# [Gold III] Petoris - 22698

[문제 링크](https://www.acmicpc.net/problem/22698)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 10, 정답: 6, 맞힌 사람: 6, 정답 비율: 60.000%

### 분류

구현, 브루트포스 알고리즘, 시뮬레이션, 비트마스킹

### 문제 설명

<p>You are playing a puzzle game named&nbsp;<i>petoris</i>. It is played with a board divided into square grids and square tiles each of which fits to a single grid.</p>

<p>In each step of the game, you have a board partially filled with tiles. You also have a block consisting of several tiles. You are to place this block somewhere on the board or to discard it, under the following restrictions on placement:</p>

<ul>
	<li>the block can be rotated, but cannot be divided nor flipped;</li>
	<li>no tiles of the block can collide with any tiles existing on the board; and</li>
	<li>all the tiles of the block need to be placed inside the board.</li>
</ul>

<p>Your task is to write a program to find the maximum score you can earn in this step. Here, the score is the number of the horizontal lines fully filled with tiles after the block is placed, or -1 in case of discard.</p>

### 입력

<p>The first line of the input is&nbsp;<i>N</i>, the number of data sets. Then&nbsp;<i>N</i>&nbsp;data sets follow.</p>

<p>Each data set consists of lines describing a block and a board. Each description (both for a block and a board) starts with a line containing two integer&nbsp;<i>H</i>&nbsp;and&nbsp;<i>W</i>, the vertical and horizontal dimension. Then&nbsp;<i>H</i>&nbsp;lines follow, each with&nbsp;<i>W</i>&nbsp;characters, where a &lsquo;#&rsquo; represents a tile and &lsquo;.&rsquo; a vacancy. You can assume that 0 &lt;&nbsp;<i>H</i>&nbsp;&le; 64 and 0 &lt;&nbsp;<i>W</i>&nbsp;&le; 64. Each block consists of one or more tiles all of which are connected. Each board contains zero or more tiles, and has no horizontal line fully filled with tiles at the initial state.</p>

### 출력

<p>For each data set, print in a single line the maximum possible score.</p>
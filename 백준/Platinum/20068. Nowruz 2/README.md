# [Platinum V] Nowruz 2 - 20068

[문제 링크](https://www.acmicpc.net/problem/20068)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 49, 정답: 13, 맞힌 사람: 13, 정답 비율: 72.222%

### 분류

해 구성하기, 그래프 이론, 그래프 탐색

### 문제 설명

<p>It is few days to Nowruz (Persian new year), and grandpa has invited his family to his garden. There are $k$ kids among the guests. To make the gathering more fun for the kids, grandpa is going to run a game of hide-and-seek.</p>

<p>The garden can be represented by an $m \times n$ grid of unit cells. Some (possibly zero) cells are blocked by rocks, and the remaining cells are called&nbsp;<em>free</em>. Two cells are called&nbsp;<em>neighbors</em>&nbsp;if they share an edge. That is, each cell has up to 4 neighbors: two in the horizontal direction, and two in the vertical direction. Grandpa wants to turn his garden into a maze. For this purpose, he can block some free cells by planting bushes in them. The cells where he plants the bushes are no longer free.</p>

<p>A maze must have the following property. For each pair $a$ and $b$ of free cells in the maze there must be exactly one&nbsp;<em>simple path</em>&nbsp;between them. A simple path between cells $a$ and $b$ is a sequence of free cells in which the first cell is $a$, the last cell is $b$, all cells are distinct, and each two consecutive cells are neighbors.</p>

<p>A kid can hide in a cell if and only if that cell is free and has&nbsp;<em>exactly</em>&nbsp;one free neighbor. No two kids can hide in the same cell.</p>

<p>You are given the map of the garden as input. Your task is to help grandpa create a maze in which many kids can hide.</p>

<p>This is an output-only task with partial scoring. You are given $10$ input files, each describing grandpa&#39;s garden. For each input file you should submit an output file with a map of a maze. For each output file you will get points based on the number of kids that can hide in your maze.</p>

<p>You are not supposed to submit any source code for this task.</p>

### 입력

<p>Each input file describes one grid representing a garden and gives the number of kids $k$ invited by grandpa. The format is as follows:</p>

<ul>
	<li>line $1$: $\;\; m \;\; n \;\; k$</li>
	<li>line $1+i$ (for $1 \leq i \leq m$): row $i$ of the grid, which is a string of length $n$, consisting of the following characters (without any whitespace):
	<ul>
		<li>&#39;<code>.</code>&#39;: a free cell,</li>
		<li>&#39;<code>#</code>&#39;: a rock.</li>
	</ul>
	</li>
</ul>

### 출력

<ul>
	<li>line $i$ (for $1 \leq i \leq m$): row $i$ of the maze (the garden, after bushes are planted). It is a string of length $n$, consisting of the following characters (without any whitespace):
	<ul>
		<li>&#39;<code>.</code>&#39;: a free cell,</li>
		<li>&#39;<code>#</code>&#39;: a rock,</li>
		<li>&#39;<code>X</code>&#39;: a bush. (Note that the letter X must be in uppercase.)</li>
	</ul>
	</li>
</ul>
# [Gold III] Key Task - 3439

[문제 링크](https://www.acmicpc.net/problem/3439)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 71, 정답: 32, 맞힌 사람: 26, 정답 비율: 44.828%

### 분류

너비 우선 탐색, 비트마스킹, 그래프 이론, 그래프 탐색, 최단 경로

### 문제 설명

<p>The Czech Technical University is rather old &mdash; you already know that it celebrates 300 years of its existence in 2007. Some of the university buildings are old as well. And the navigation in old buildings can sometimes be a little bit tricky, because of strange long corridors that fork and join at absolutely unexpected places.</p>

<p>The result is that some first-graders have often difficulties finding the right way to their classes. Therefore, the Student Union has developed a computer game to help the students to practice their orientation skills. The goal of the game is to find the way out of a labyrinth. Your task is to write a verification software that solves this game.</p>

<p>The labyrinth is a 2-dimensional grid of squares, each square is either free or filled with a wall. Some of the free squares may contain doors or keys. There are four different types of keys and doors: blue, yellow, red, and green. Each key can open only doors of the same color.</p>

<p>You can move between adjacent free squares vertically or horizontally, diagonal movement is not allowed. You may not go across walls and you cannot leave the labyrinth area. If a square contains a door, you may go there only if you have stepped on a square with an appropriate key before.</p>

### 입력

<p>The input consists of several maps. Each map begins with a line containing two integer numbers R and C (1 &le; R, C &le; 100) specifying the map size. Then there are R lines each containing C characters. Each character is one of the following:</p>

<table class="table table-bordered" style="width:50%">
	<thead>
		<tr>
			<th colspan="2">Character</th>
			<th>Meaning</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>Hash mark</td>
			<td><code>#</code></td>
			<td>Wall</td>
		</tr>
		<tr>
			<td>Dot</td>
			<td><code>.</code></td>
			<td>Free square</td>
		</tr>
		<tr>
			<td>Asterisk</td>
			<td><code>*</code></td>
			<td>Your position</td>
		</tr>
		<tr>
			<td>Uppercase letter</td>
			<td><code>B</code> <code>Y</code> <code>R</code> <code>G</code></td>
			<td>Blue, yellow, red, or green door</td>
		</tr>
		<tr>
			<td>Lowercase letteR</td>
			<td><code>b</code> <code>y</code> <code>r</code> <code>g</code></td>
			<td>Blue, yellow, red, or green key</td>
		</tr>
		<tr>
			<td>Uppercase X</td>
			<td><code>X</code></td>
			<td>ExistExit</td>
		</tr>
	</tbody>
</table>

<p>Note that it is allowed to have</p>

<ul>
	<li>more than one exit,</li>
	<li>no exit at all,</li>
	<li>more doors and/or keys of the same color, and</li>
	<li>keys without corresponding doors and vice versa.</li>
</ul>

<p>You may assume that the marker of your position (&ldquo;<code>*</code>&rdquo;) will appear exactly once in every map. There is one blank line after each map. The input is terminated by two zeros in place of the map size.</p>

### 출력

<p>For each map, print one line containing the sentence &ldquo;Escape possible in S steps.&rdquo;, where S is the smallest possible number of step to reach any of the exits. If no exit can be reached, output the string &ldquo;The poor student is trapped!&rdquo; instead.</p>

<p>One step is defined as a movement between two adjacent cells. Grabbing a key or unlocking a door does not count as a step.</p>
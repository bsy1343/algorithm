# [Gold IV] Corn Maze - 5980

[문제 링크](https://www.acmicpc.net/problem/5980)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 491, 정답: 146, 맞힌 사람: 110, 정답 비율: 25.463%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 격자 그래프

### 문제 설명

<p>This past fall, Farmer John took the cows to visit a corn maze. But this wasn&#39;t just any corn maze: it featured several gravity-powered teleporter slides, which cause cows to teleport instantly from one point in the maze to another. The slides work in both directions: a cow can slide from the slide&#39;s start to the end instantly, or from the end to the start. If a cow steps on a space that hosts either end of a slide, she must use the slide.</p>

<p>The outside of the corn maze is entirely corn except for a single exit.</p>

<p>The maze can be represented by an N x M (2 &le; N &le;&nbsp;300; 2 &le; M &le; 300) grid. Each grid element contains one of these items:</p>

<ul>
	<li>Corn (corn grid elements are impassable)</li>
	<li>Grass (easy to pass through!)</li>
	<li>A slide endpoint (which will transport a cow to the other endpoint)</li>
	<li>The exit</li>
</ul>

<p>A cow can only move from one space to the next if they are adjacent and neither contains corn. Each grassy space has four potential neighbors to which a cow can travel. It takes 1 unit of time to move from a grassy space to an adjacent space; it takes 0 units of time to move from one slide endpoint to the other.</p>

<p>Corn-filled spaces are denoted with an octothorpe (#). Grassy spaces are denoted with a period (.). Pairs of slide endpoints are denoted with the same uppercase letter (A-Z), and no two different slides have endpoints denoted with the same letter. The exit is denoted with the equals sign (=).</p>

<p>Bessie got lost. She knows where she is on the grid, and marked her current grassy space with the &#39;at&#39; symbol (@). What is the minimum time she needs to move to the exit space?</p>

<p>Consider the following grid, with N=5 and M=6:</p>

<pre>
            ###=##
            #.W.##
            #.####
            #.@W##
            ######</pre>

<p>A single slide has endpoints denoted by an uppercase W. Her optimal strategy is to move right to the slide endpoint in 1 time, take the slide in 0 time to the other endpoint, and move right and up in 2 more time to end on the exit. &nbsp;This requires a total of 3 time, the minimum.</p>

### 입력

<ul>
	<li>Line 1: Two space separated integers: N and M</li>
	<li>Lines 2..N+1: Line i+1 describes row i of the maze: M characters (no spaces)</li>
</ul>

### 출력

<ul>
	<li>Line 1: An integer, corresponding to the shortest time that Bessie needs to exit the maze.</li>
</ul>
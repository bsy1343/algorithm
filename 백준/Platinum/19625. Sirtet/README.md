# [Platinum I] Sirtet - 19625

[문제 링크](https://www.acmicpc.net/problem/19625)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 58, 정답: 14, 맞힌 사람: 14, 정답 비율: 50.000%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>In a fancy new zero-person video game, Sirtet, the game is a rectangular grid with N rows and M columns. Before the game begins, some grid cells are blank (denoted as <code>.</code>) and others are filled (denoted as <code>#</code>). The filled squares represent a set of objects, and the filled squares that are adjacent (horizontally or vertically) should be considered to be part of the same rigid object. For example, this initial grid:</p>

<pre style="text-align: center;">
..#.
##.#
.##.
#...
#...</pre>

<p>has four objects, shown below:</p>

<pre style="text-align: center;">
##     #    #     #
&nbsp;##    #           </pre>

<p>When the game begins, the objects fall straight down the grid, all at the same speed. Each object continues to fall straight down until it either touches the bottom row, or has some part of it land directly on top of another object, at which point it stops. What will be the final state of the grid?</p>

### 입력

<p>The first line contains two space-separated positive integers N and M (N &middot; M &le; 10<sup>6</sup>).</p>

<p>The following N lines contain M characters each, describing the initial state of the grid. If the j-th column of the i-th row of the grid contains a block, the corresponding character in the input will be a <code>#</code>, otherwise it will be a <code>.</code> character.</p>

### 출력

<p>Output N lines contain M characters each, describing the final state of the grid. If the j-th column&nbsp;of the i-th row of the grid contains a block, the corresponding character in the input will be a <code>#</code>, otherwise it will be a <code>.</code> character.</p>
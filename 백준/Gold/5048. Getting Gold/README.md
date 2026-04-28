# [Gold IV] Getting Gold - 5048

[문제 링크](https://www.acmicpc.net/problem/5048)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 166, 정답: 77, 맞힌 사람: 65, 정답 비율: 53.279%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>We&rsquo;re building an old-school back-to-basics computer game. It&rsquo;s a very simple text based adventure game where you walk around and try to find treasure, avoiding falling into traps. The game is played on a rectangular grid and the player gets very limited information about her surroundings.</p>

<p>The game will consist of the player moving around on the grid for as long as she likes (or until she falls into a trap). The player can move up, down, left and right (but not diagonally). She will pick up gold if she walks into the same square as the gold is. If the player stands next to (i.e., immediately up, down, left, or right of) one or more traps, she will &ldquo;sense a draft&rdquo; but will not know from what direction the draft comes, or how many traps she&rsquo;s near. If she tries to walk into a square containing a wall, she will notice that there is a wall in that direction and remain in the position where she was.</p>

<p>For scoring purposes, we want to show the player how much gold she could have gotten safely. That is, how much gold can a player get playing with an optimal strategy and always being sure that the square she walked into was safe. The player does not have access to the map and the maps are randomly generated for each game so she has no previous knowledge of the game.</p>

### 입력

<p>The first line of input contains two positive integers W and H, neither of them smaller than 3 or larger than 50, giving the width and the height of the map, respectively. The next H lines contain W characters each, giving the map. The symbols that may occur in a map are as follows:</p>

<ul>
	<li>P &ndash; the player&rsquo;s starting position&nbsp;</li>
	<li>G &ndash; a piece of gold</li>
	<li>T &ndash; a trap</li>
	<li># &ndash; a wall</li>
	<li>. &ndash; normal floor</li>
</ul>

<p>There will be exactly one &rsquo;P&rsquo; in the map, and the border of the map will always contain walls.</p>

### 출력

<p>Output the number of pieces of gold the player can get without risking falling into a trap.</p>
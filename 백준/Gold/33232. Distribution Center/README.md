# [Gold III] Distribution Center - 33232

[문제 링크](https://www.acmicpc.net/problem/33232)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 9, 정답: 8, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

격자 그래프, 그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Sokoban is the best employee at your town's biggest distribution center. He likes his job because it is simple, albeit a bit physically intensive. Everyday he is pushing crates to some possbile destinations from where they will be loaded in trucks. Unfortunately, Sokoban's youth is behind him, so he starts to feel the effects of the physical labour. Therfore, he came up with an algorithm to help him move the crates optimally: the Fast Pushing Crates (FPC) algorithm. For the algorithm to be complete, he needs a bit of help from you.</p>

<p>His algorithm receives as input the layout of the distribution center, as a grid, and returns the steps he needs to take to efficiently push the crates. In his algorithm, he needs to find out which squares in the grid are <em>dead squares</em>. We call a square a dead square if it is a wall or if it is impossible to push a crate from that square to any of the destinations (even if Sokoban could teleport to any location).</p>

<p>Given the layout of the distribution center, help Sokoban find out which squares are dead squares.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A line with two integers $r$ and $c$ ($1\leq r,c\leq 10^3$), the number of rows and columns of the grid.</li>
	<li>$r$ lines, each containing $c$ characters, where:
	<ul>
		<li>A '<code>\#</code>' represents a wall. It is guaranteed that the grid is surrounded by walls.</li>
		<li>A '<code>D</code>' represents a destination. There can be any number of them, including $0$.</li>
		<li>A '<code>.</code>' represents an empty square.</li>
	</ul>
	</li>
</ul>

### 출력

<p>Output $r$ lines, each containing $c$ characters, where the $i$th character of the $j$th line is:</p>

<ul>
	<li>'<code>X</code>' if the square at position $(i,j)$ is a dead square.</li>
	<li>'<code>O</code>' otherwise.</li>
</ul>
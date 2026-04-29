# [Silver II] Light Up - 32504

[문제 링크](https://www.acmicpc.net/problem/32504)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 69, 정답: 50, 맞힌 사람: 48, 정답 비율: 75.000%

### 분류

격자 그래프, 구현, 그래프 이론, 그래프 탐색, 시뮬레이션

### 문제 설명

<p>Light Up is a pencil puzzle. Your job will not be to play Light Up, but simply to judge whether a player’s solution is correct.</p>

<p>The game is played on a square grid. Some of the cells are blocked, and some of the blocked cells have a number from $0$ to $4$. The player must place light bulbs in open cells. Each light bulb can light all of the open cells above, below, left, and right (but not diagonally) until the light reaches the edge of the grid or a blocked cell. The player must place light bulbs so that:</p>

<ul>
	<li>Every open cell is lit.</li>
	<li>No two light bulbs can shine on each other.</li>
	<li>Any blocked cell with a number in it must have exactly that number of light bulbs immediately adjacent above, below, left, or right. Diagonals do not count.</li>
</ul>

<p>The following is an example grid with its solution:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32504.%E2%80%85Light%E2%80%85Up/988890bc.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32504-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<p>Given a grid with light bulbs placed, determine whether it is, in fact, a solution. Note that if a grid has no open cells, and does not violate any other constraints, it is trivially solved.</p>

### 입력

<p>The first line of input contains a single integer $n$ ($1≤n≤30$), which is the number of rows and columns in the grid.</p>

<p>Each of the next $n$ lines contains exactly $n$ characters from the set {‘<code>.</code>’,‘<code>X</code>’,‘<code>?</code>’,‘<code>0</code>’,‘<code>1</code>’,‘<code>2</code>’,‘<code>3</code>’,‘<code>4</code>’}. This is the grid, with ‘<code>.</code>’ representing an open cell, ‘<code>X</code>’ representing a blocked cell, ‘<code>?</code>’ representing a light bulb, and the numbers ‘<code>0</code>’,‘<code>1</code>’,‘<code>2</code>’,‘<code>3</code>’,‘<code>4</code>’ representing a blocked cell with a constraint on the number of adjacent light bulbs.</p>

### 출력

<p>Output a single integer, which is $1$ if the input is a valid solution, and $0$ otherwise.</p>
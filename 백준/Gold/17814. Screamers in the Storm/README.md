# [Gold IV] Screamers in the Storm - 17814

[문제 링크](https://www.acmicpc.net/problem/17814)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>As you might remember from your first years in school, the human race invented beer brewing at least about 7000 years ago. The total amount of beer consumed from those times must be monumental and surely the rate of consumption is not going to shrink in the coming millennia.</p>

<p>To celebrate these facts, we invite you to implement a game, seemingly unrelated to beer brewing. It is quite possible, however, that after a successful implementation you might feel a little dizzy, just as if you have had a little bit more than your daily dose of beer...</p>

<p>The game is played on a rectangular M &times; N grid consisting of square tiles of different types.</p>

<p><strong>Animals and food</strong></p>

<p>There is some number of animals on the grid, each animal occupies exactly one tile.</p>

<p>Grass grows, sheep eat grass, wolves eat sheep, and both wolves and sheep can die of starvation.</p>

<p><strong>Turns and animal actions</strong></p>

<p>Each turn consists of actions in the following order:</p>

<ol>
	<li>All animals on the grid move. Each wolf moves to a neighbouring tile in the east (to the right). If the wolf&rsquo;s move is not possible, the wolf moves to the westernmost tile in its row. Each sheep moves to a neighbouring tile in the south (down). If the sheep&rsquo;s move is not possible, the sheep moves to the northernmost tile in its column.</li>
	<li>If a wolf and a sheep occupy the same tile, the wolf eats the sheep and the tile is changed to a Soil with carcass tile.</li>
	<li>If a sheep is located on a Soil with grass tile, the sheep eats the grass and the tile is changed to a Soil tile.</li>
	<li>If a wolf hasn&rsquo;t eaten in any of the last 10 turns including the current turn, it dies and the tile is changed to a Soil with carcass tile.</li>
	<li>If a sheep didn&rsquo;t eat in any of the last 5 turns including the current turn, it dies and the tile is changed to a Soil with carcass tile.</li>
</ol>

<p><strong>Types of tiles and their changes</strong></p>

<p>There are three types of tiles. The type of a tile may be changed in the course of the game.</p>

<ol>
	<li>Soil tile: After 3 turns after the beginning of the game or after 3 turns after the tile became a Soil tile, the tile becomes a Soil with grass tile.</li>
	<li>Soil with grass tile: If the grass is eaten by a sheep, the tile immediately becomes a Soil tile. The grass will grow again at the tile after 3 turns.</li>
	<li>Soil with carcass tile: Whenever an animal dies on a tile of any type, the tile immediately becomes a Soil with carcass tile. Animals can still move to this tile, but the grass will never grow on this tile again. As the game progresses, more carcasses may accumulate on the tile.</li>
</ol>

### 입력

<p>First line of the input contains three integers T, N and M (1 &le; T &le; 100, 1 &le; M, N &le; 20), where T is the number of turns, M is the number of rows and N is the number of columns of the grid. The following M lines contain N characters each. Characters denote the types of tiles:</p>

<ul>
	<li><code>.</code> (dot character) denotes a Soil tile</li>
	<li><code>S</code> denotes a Soil tile with a sheep on it</li>
	<li><code>W</code> denotes a Soil tile with a wolf on it</li>
</ul>

### 출력

<p>Output M lines each containing N characters describing the state of the grid after the end of the T-th turn. If there is an animal on a tile, output:</p>

<ul>
	<li><code>W</code> for a tile with a wolf on it</li>
	<li><code>S</code> for a tile with a sheep on it</li>
</ul>

<p>Otherwise, output:</p>

<ul>
	<li><code>*</code> for a Soil with carcass tile</li>
	<li><code>#</code> for a Soil with grass tile</li>
	<li><code>.</code> (dot character) for a Soil tile</li>
</ul>
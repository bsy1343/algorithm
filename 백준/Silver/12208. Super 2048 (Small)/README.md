# [Silver I] Super 2048 (Small) - 12208

[문제 링크](https://www.acmicpc.net/problem/12208)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 335, 정답: 201, 맞힌 사람: 170, 정답 비율: 61.151%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>2048 is a famous single-player game in which the objective is to slide tiles on a grid to combine them and create a tile with the number 2048.</p>

<p>2048 is played on a simple 4 x 4 grid with tiles that slide smoothly when a player moves them. For each movement, the player can choose to move all tiles in 4 directions, left, right, up, and down, as far as possible at the same time. If two tiles of the same number collide while moving, they will merge into a tile with the total value of the two tiles that collided.&nbsp;<strong>In one movement, one newly created tile can not be merged again and always is merged with the tile next to it along the moving direction first.</strong>&nbsp;E.g. if the three &quot;2&quot; are in a row &quot;2 2 2&quot; and the player choose to move left, it will become &quot;4 2 0&quot;, the most left 2 &quot;2&quot; are merged.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/12208.%E2%80%85Super%E2%80%852048%E2%80%85(Small)/6e8b5f40.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12208/images-68.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:242px; width:567px" /></p>

<p>The above figure shows how 4 x 4 grid varies when player moves all tiles &#39;right&#39;.</p>

<p>Alice and Bob accidentally find this game and love the feel when two tiles are merged. After a few round, they start to be bored about the size of the board and decide to extend the size of board to&nbsp;<strong>N</strong>&nbsp;x&nbsp;<strong>N</strong>, which they called the game &quot;Super 2048&quot;.</p>

<p>The big board then makes them dazzled (no zuo no die -_-| ). They ask you to write a program to help them figure out what the board will be looked like after all tiles move to one specific direction on a given board.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. The first line of each test case gives the side length of the board, <strong>N</strong>, and the direction the tiles will move to, <strong>DIR</strong>. <strong>N</strong> and <strong>DIR</strong> are separated by a single space. <strong>DIR</strong> will be one of four strings: &quot;left&quot;, &quot;right&quot;, &quot;up&quot;, or &quot;down&quot;.</p>

<p>The next <strong>N</strong> lines each contain <strong>N</strong> space-separated integers describing the original state of the board. Each line represents a row of the board (from top to bottom); each integer represents the value of a tile (or 0 if there is no number at that position).</p>

<p>Limits</p>

<ul>
	<li>Each number in the grid is either 0 or a power of two between 2 and 1024, inclusive.</li>
	<li><span style="line-height:1.6em">1 &le; </span><strong style="line-height:1.6em">T</strong><span style="line-height:1.6em"> &le; 20&nbsp;</span></li>
	<li>1 &le; <strong>N</strong> &le; 4&nbsp;</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x:&quot;, where x is the test case number (starting from 1). Then output <strong>N</strong> more lines, each containing <strong>N</strong> space-separated integers which describe the board after the move in the same format as the input.</p>
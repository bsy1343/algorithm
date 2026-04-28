# [Platinum I] Dots and Boxes - 13292

[문제 링크](https://www.acmicpc.net/problem/13292)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 11, 맞힌 사람: 11, 정답 비율: 84.615%

### 분류

이분 매칭, 최대 유량, 구현, 그래프 이론

### 문제 설명

<p>Alice and Bob are playing Dots and Boxes. The game is played on an N &times; N square lattice of dots, and they alternate drawing a line segment between horizontally or vertically adjacent dots that haven&rsquo;t been connected before. Every time a unit square is formed by four line segments, the player who put down the last segment scores one point for that square. The game ends when the square lattice has been completely filled with line segments, and whoever scored the most points wins.</p>

<p>Alice and Bob aren&rsquo;t really in a competitive mood today, so they&rsquo;ve just been playing for fun. Hence they aren&rsquo;t following any specific game strategy, and, in particular, even if it&rsquo;s possible to make a move that scores a point or is clearly superior in some way, they won&rsquo;t necessarily make that move. But now they&rsquo;ve been playing for a while and neither of them has scored a single point. If neither of them scores a point pretty soon, they may get bored. Given the current state of the game, how many moves could be made, in the worst case, before either Alice or Bob is guaranteed to have scored a point?</p>

### 입력

<p>Input starts with a line containing an integer N (2 &le; N &le; 80), the size of the square lattice. Then follows an ASCII representation of the current state of the game, 2N &minus;1 rows high and 2N &minus;1 columns wide, listed in row-major order. There are cells of four types (1 &le; i, j &le; N):</p>

<ul>
	<li>Cell (2i &minus; 1, 2j &minus; 1) is &lsquo;*&rsquo;, representing dot (i, j).</li>
	<li>Cell (2i, 2j) is &lsquo;.&rsquo;, representing empty space.</li>
	<li>Cell (2i, 2j &minus; 1) is &lsquo;|&rsquo; if dots (i, j) and (i + 1, j) have been connected by a line segment, and &lsquo;.&rsquo; otherwise.</li>
	<li>Cell (2i &minus; 1, 2j) is &lsquo;-&rsquo; if dots (i, j) and (i, j + 1) have been connected by a line segment, and &lsquo;.&rsquo; otherwise.</li>
</ul>

<p>It is guaranteed that no player has scored a point, meaning that no unit squares have been formed.</p>

### 출력

<p>Output the number of moves that can be made, in the worst case, before either Alice or Bob is guaranteed&nbsp;to have scored a point.</p>
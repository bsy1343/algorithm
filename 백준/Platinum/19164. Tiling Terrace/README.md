# [Platinum I] Tiling Terrace - 19164

[문제 링크](https://www.acmicpc.net/problem/19164)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 31, 맞힌 사람: 30, 정답 비율: 65.217%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Talia has just bought an abandoned house in the outskirt of Jakarta. The house has a nice and long yard which can be represented as a one-dimensional grid containing 1 &times; N cells. To beautify the house, Talia is going to build a terrace on the yard by tiling the cells. Each cell on the yard contains either soil (represented by the character &lsquo;<code>.</code>&rsquo;) or rock (represented by the character &lsquo;<code>#</code>&rsquo;), and there are at most 50 cells containing rocks.</p>

<p>Being a superstitious person, Talia wants to tile the terrace with mystical tiles that have the power to repel ghosts. There are three types of mystical tiles:</p>

<ul>
	<li>Type-1: Covers 1 &times; 1 cell and can only be placed on a soil cell (&ldquo;<code>.</code>&rdquo;).</li>
	<li>Type-2: Covers 1 &times; 2 cells and can only be placed on two consecutive soil cells (&ldquo;<code>..</code>&rdquo;).</li>
	<li>Type-3: Covers 1 &times; 3 cells and can only be placed on consecutive soil-rock-soil cells (&ldquo;<code>.#.</code>&rdquo;).</li>
</ul>

<p>Each tile of Type-1, Type-2, and Type-3 has the power to repel G1, G2, and G3 ghosts per day, respectively. There are also some mystical rules which must be followed for the power to be effective:</p>

<ul>
	<li>There should be no overlapping tiles, i.e. each cell is covered by at most one tile.</li>
	<li>There should be at most K tiles of Type-1, while there are no limitations for tiles of Type-2 and Type-3.</li>
</ul>

<p>Talia is scared of ghosts, thus, the terrace (which is tiled by mystical tiles) should be able to repel as many ghosts as possible. Help Talia to find the maximum number of ghosts that can be repelled per day by the terrace. Note that Talia does not need to tile all the cells on the yard as long as the number of ghosts that can be repelled by the terrace is maximum.</p>

### 입력

<p>Input begins with a line containing five integers: N K G<sub>1</sub> G<sub>2</sub> G<sub>3</sub> (1 &le; N &le; 100 000; 0 &le; K &le; N; 0 &le; G<sub>1</sub>, G<sub>2</sub>, G<sub>3</sub> &le; 1000) representing the number of cells, the maximum number of tiles of Type-1, the number of ghosts repelled per day by a tile of Type-1, the number of ghosts repelled per day by a tile of Type-2, and the number of ghosts repelled by a tile of Type-3, respectively. The next line contains a string of N characters representing the yard. Each character in the string is either &lsquo;<code>.</code>&rsquo; which represents a soil cell or &lsquo;<code>#</code>&rsquo; which represents a rock cell. There are at most 50 rock cells.</p>

### 출력

<p>Output in a line an integer representing the maximum number of ghosts that can be repelled per day.</p>
# [Gold II] Iron and Coal - 13936

[문제 링크](https://www.acmicpc.net/problem/13936)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 167, 정답: 71, 맞힌 사람: 67, 정답 비율: 45.270%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로

### 문제 설명

<p>There are many excellent strategy board games, and your favourite among them is called &ldquo;Steel Age&rdquo;. It offers many different paths to victory but you prefer the blood-and-fire-strategy: build as many soldiers as possible and club your opposition into submission. To be able to build soldiers you need two resources: iron ore and coal.</p>

<p>The board consists of different cells numbered from 1 to n which can contain resources. The rules for moving from one cell to another are rather complicated: if you can move from cell A to cell B, it does not always mean that you can also move from B to A. For example, if two cells are connected by a river, then you may be able to move downstream, but not upstream, so long as you didn&rsquo;t invent a steam engine; however, it still could be possible to reach the upstream cell by using roads and taking a detour over other cells.</p>

<p>At the beginning of the game you own only one such cell, where all your settlers are located. At every move you are allowed to move an arbitrary number of settlers from a cell to one of its accessible neighbours. By moving your settlers into a cell for the first time, you &ldquo;claim&rdquo; it. Every claimed cell will bind one settler, which has to stay in this cell until the end of the game. However, there is no need to leave a settler in your initial cell because it is where your palace is located and thus the cell stays claimed for all time.</p>

<p>Your goal is to claim at least one cell containing the resource &ldquo;iron ore&rdquo; and at least one cell with resource &ldquo;coal&rdquo; in order to be able to build soldiers. What is the minimal number of settlers you need to reach this goal?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with three integers n (2 &le; n &le; 10<sup>5</sup>), the number of cells on the playing field, m (1 &le; m &lt; n), the number of cells containing iron ore, and k (1 &le; k &lt; n), the number of cells containing coal.</li>
	<li>One line with m distinct integers o<sub>1</sub>, . . . , o<sub>m</sub> (1 &le; o<sub>i</sub> &le; n for all 1 &le; i &le; m), where o<sub>1</sub>, . . . , o<sub>m</sub> are the IDs of cells with iron ore.</li>
	<li>One line with k distinct integers c<sub>1</sub>, . . . , c<sub>k</sub> (1 &le; c<sub>i </sub>&le; n for all 1 &le; i &le; k), where c<sub>1</sub>, . . . , c<sub>k</sub> are the IDs of cells with coal.</li>
	<li>n lines describing the topology of the board. The j-th line of this block specifies the accessible neighbours of the j-th cell and consists of the following integers:
	<ul>
		<li>One integer 0 &le; a &le; 10, the number of cells accessible from cell j.</li>
		<li>a distinct integers b<sub>1</sub>, . . . , b<sub>a</sub> (1 &le; b<sub>i</sub> &le; n, b<sub>i</sub> &ne; j for all 1 &le; i &le; a), the IDs of the cells accessible from cell j.</li>
	</ul>
	</li>
</ul>

<p>It is guaranteed, that no cell contains both resources, iron ore and coal. At the beginning of the game you own only the cell with ID 1.</p>

### 출력

<p>Output the minimum number of settlers needed to claim at least one cell with coal and at least one cell with iron ore. Output &ldquo;impossible&rdquo; if it is impossible to own both, coal and iron ore.</p>
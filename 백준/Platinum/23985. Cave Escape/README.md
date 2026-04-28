# [Platinum IV] Cave Escape - 23985

[문제 링크](https://www.acmicpc.net/problem/23985)

### 성능 요약

시간 제한: 120 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 78, 정답: 6, 맞힌 사람: 5, 정답 비율: 38.462%

### 분류

비트마스킹, 브루트포스 알고리즘, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Mr. Raven is stuck in a cave represented by a matrix of <b>N</b> rows and <b>M</b> columns, where rows are numbered from 1 to <b>N</b> from top to bottom, and columns are numbered from 1 to <b>M</b> from left to right. The cell at the i-th row and the j-th column is denoted by (i, j). Mr. Raven is currently at the cell (<b>S<sub>R</sub></b>, <b>S<sub>C</sub></b>), and the exit of the cave is located at the cell (<b>T<sub>R</sub></b>, <b>T<sub>C</sub></b>).</p>

<p>Some cells of the cave may contain obstacles. Mr. Raven cannot step into a cell that has an obstacle. Other cells may contain traps. The first time that Mr. Raven enters a cell with a trap, he must spend a number of energy points equal to the strength of the trap. If he has fewer energy points than needed, he cannot enter the cell. Moreover, some other cells may contain potions. The first time that Mr. Raven enters a cell with a potion, he gains energy points equal to the strength of the potion.</p>

<p>Mr. Raven initially has <b>E</b> energy points. He can move between cells that share an edge (not just a corner). On the exit cell, Mr. Raven can choose not to exit the cave and continue to explore the cave if he wants to. Can you help him find the maximum number of energy points he can have when he exits the cave, if it is possible to do so?</p>

### 입력

<p>The first line of the input gives the number of test cases, <b>T</b>. <b>T</b> test cases follow. Each test case consists of one line with seven integers <b>N</b>, <b>M</b>, <b>E</b>, <b>S<sub>R</sub></b>, <b>S<sub>C</sub></b>, <b>T<sub>R</sub></b> and <b>T<sub>C</sub></b> as described above. The i-th of the next <b>N</b> lines describes the i-th row of the cave. Each line consists of <b>M</b> integers <b>V<sub>ij</sub></b>; the j-th of these represents the cell in the j-th column of the i-th row. Each <b>V<sub>ij</sub></b> can be one of the following</p>

<ul>
	<li>0: represents an empty cell.</li>
	<li>-100000: represents a cell with an obstacle.</li>
	<li>an integer between -99999 and -1 (both inclusive): represents a trap with strength -<b>V<sub>ij</sub></b>.</li>
	<li>an integer between 1 and 99999 (both inclusive): represents a potion with strength <b>V<sub>ij</sub></b>.</li>
</ul>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where <code>x</code> is the test case number (starting from 1) and <code>y</code> is the maximum energy points that Mr. Raven can have when he reaches the exit of the cave. If it is not possible for Mr. Raven to reach the exit, output <code>-1</code>.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 100.</li>
	<li>1 &le; <b>N</b> &le; 100.</li>
	<li>1 &le; <b>M</b> &le; 100.</li>
	<li>0 &le; <b>E</b> &le; 100000.</li>
	<li>1 &le; <b>S<sub>R</sub></b> &le; N.</li>
	<li>1 &le; <b>S<sub>C</sub></b> &le; M.</li>
	<li>1 &le; <b>T<sub>R</sub></b> &le; N.</li>
	<li>1 &le; <b>T<sub>C</sub></b> &le; M.</li>
	<li>(<b>S<sub>R</sub></b>, <b>S<sub>C</sub></b>) &ne; (<b>T<sub>R</sub></b>, <b>T<sub>C</sub></b>).</li>
	<li>-100000 &le; <b>V<sub>ij</sub></b> &lt; 100000, for all i, j.</li>
	<li>At most 15 cells have -100000 &lt; <b>V<sub>ij</sub></b> &lt; 0. (There are at most 15 traps.)</li>
	<li><b>V<sub>S<sub>R</sub>S<sub>C</sub></sub></b> = 0. (Mr. Raven&#39;s initial position is an empty cell.)</li>
	<li><b>V<sub>T<sub>R</sub>T<sub>C</sub></sub></b> = 0. (The cell with the exit is empty.)</li>
</ul>

### 힌트

<p>In Sample Case #1, it is not possible for Mr. Raven to reach the exit.</p>

<p>In Sample Case #2, the cave is as depicted in the following image where</p>

<ul>
	<li>A cell with a positive integer x represents a potion with strength x.</li>
	<li>A cell with a negative integer y represents a trap with strength -y.</li>
	<li>Mr. Raven&#39;s initial position is in the cell with &quot;You are here&quot; text.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23985.%E2%80%85Cave%E2%80%85Escape/2d6aae84.png" data-original-src="https://upload.acmicpc.net/0439a0a7-1d8f-41ad-bddc-0a32d0b00627/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 283px; height: 280px;" /></p>

<p>In this case, one of the optimal ways to reach the exit with maximum energy points is to</p>

<ul>
	<li>Start with 250 energy points.</li>
	<li>Go to and destroy the trap at the cell (7, 3). 150 energy points remaining.</li>
	<li>Collect all three potions located at positions (6, 6), (6, 7) and (7, 6). 300 energy points remaining.</li>
	<li>Go to an destroy the trap at the cell (5, 7). 200 energy points remaining.</li>
	<li>Collect the potion at the cell (4, 6). 450 energy points remaining.</li>
	<li>Go to and destroy the trap at the cell (5, 2). 250 energy points remaining.</li>
	<li>Collect the potion at the cell (3, 2). 350 energy points remaining.</li>
	<li>Go to and destroy the trap at the cell (3, 3). 50 energy points remaining.</li>
	<li>Collect the potion at the cell (4, 4). 550 energy points remaining.</li>
	<li>Go to and destroy the trap at the cell (3, 6) and exit with 250 energy points remaining.</li>
</ul>

<p>Note that this case will not appear in the Small dataset.</p>
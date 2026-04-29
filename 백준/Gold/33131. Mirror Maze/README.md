# [Gold II] Mirror Maze - 33131

[문제 링크](https://www.acmicpc.net/problem/33131)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 43, 정답: 29, 맞힌 사람: 29, 정답 비율: 74.359%

### 분류

구현, 브루트포스 알고리즘, 시뮬레이션

### 문제 설명

<p>You are given a grid of $R$ rows (numbered from $1$ to $R$ from north to south) and $C$ columns (numbered from $1$ to $C$ from west to east). Every cell in this grid is a square of the same size. The cell located at row $r$ and column $c$ is denoted as $(r, c)$. Each cell can either be empty or have a mirror in one of the cell’s diagonals. Each mirror is represented by a line segment. The mirror is type $1$ if it is positioned diagonally from the southwest corner to the northeast corner of the cell, or type $2$ for the other diagonal.</p>

<p>These mirrors follow the law of reflection, that is, the angle of reflection equals the angle of incidence. Formally, for type $1$ mirror, if a beam of light comes from the north, south, west, or east of the cell, then it will be reflected to the west, east, north, and south of the cell, respectively. Similarly, for type $2$ mirror, if a beam of light comes from the north, south, west, or east of the cell, then it will be reflected to the east, west, south, and north of the cell, respectively.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33131.%E2%80%85Mirror%E2%80%85Maze/56ac688c.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33131-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 666px; height: 75px;"></p>

<p>You want to put a laser from outside the grid such that all mirrors are hit by the laser beam. There are $2 \cdot (R + C)$ possible locations to put the laser:</p>

<ul>
	<li>from the north side of the grid at column $c$, for $1 ≤ c ≤ C$, shooting a laser beam to the south;</li>
	<li>from the south side of the grid at column $c$, for $1 ≤ c ≤ C$, shooting a laser beam to the north;</li>
	<li>from the east side of the grid at row $r$, for $1 ≤ r ≤ R$, shooting a laser beam to the west; and</li>
	<li>from the west side of the grid at row $r$, for $1 ≤ r ≤ R$, shooting a laser beam to the east.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33131.%E2%80%85Mirror%E2%80%85Maze/e6cd35b1.png" data-original-src="https://boja.mercury.kr/assets/problem/33131-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 203px; height: 200px;"></p>

<p>Determine all possible locations for the laser such that all mirrors are hit by the laser beam.</p>

### 입력

<p>The first line consists of two integers $R$ $C$ ($1 ≤ R, C ≤ 200$).</p>

<p>Each of the next $R$ lines consists of a string $S_r$ of length $C$. The $c$<sup>th</sup> character of string $S_r$ represents cell $(r, c)$. Each character can either be <code>.</code> if the cell is empty, <code>/</code> if the cell has type $1$ mirror, or <code>\</code> if the cell has type $2$ mirror. There is <strong>at least one</strong> mirror in the grid.</p>

### 출력

<p>Output a single integer representing the number of possible locations for the laser such that all mirrors are hit by the laser beam. Denote this number as $k$.</p>

<p>If $k &gt; 0$, then output $k$ space-separated strings representing the location of the laser. Each string consists of a character followed <strong>without any space</strong> by an integer. The character represents the side of the grid, which could be <code>N</code>, <code>S</code>, <code>E</code>, or <code>W</code> if you put the laser on the north, south, east, or west side of the grid, respectively. The integer represents the row/column number. You can output the strings in any order.</p>
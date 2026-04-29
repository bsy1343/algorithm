# [Gold I] Buggy Rover - 34479

[문제 링크](https://www.acmicpc.net/problem/34479)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 16, 정답: 15, 맞힌 사람: 14, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The International Center for Planetary Cartography (ICPC) uses rovers to explore the surfaces of other planets. As we all know, other planets are flat surfaces which can be perfectly and evenly discretized into a rectangular grid structure. Each cell in this grid is either flat and can be explored by the rover, or rocky and cannot.</p>

<p>Today marks the launch of their brand-new <em>Hornet</em> rover. The rover is set to explore the planet using a simple algorithm. Internally, the rover maintains a direction ordering, a permutation of the directions north, east, south, and west. When the rover makes a move, it goes through its <em>direction ordering</em>, chooses the first direction that does not move it off the face of the planet or onto an impassable rock, and makes one step in that direction.</p>

<p>Between two consecutive moves, the rover may be hit by a cosmic ray, replacing its direction ordering with a different one. ICPC scientists have a log of the rover’s moves, but it is difficult to determine by hand if and when the rover’s direction ordering changed. Given the moves that the rover has made, what is the smallest number of times that it could have been hit by cosmic rays?</p>

### 입력

<p>The first line of input contains two integers $r$ and $c$, where $r$ ($1 ≤ r ≤ 200$) is the number of rows on the planet, and $c$ ($1 ≤ c ≤ 200$) is the number of columns. The rows run north to south, while the columns run west to east.</p>

<p>The next $r$ lines each contain $c$ characters, representing the layout of the planet. Each character is either ‘<code>#</code>’, a rocky space; ‘<code>.</code>’, a flat space; or ‘<code>S</code>’, a flat space that marks the starting position of the rover. There is exactly one ‘<code>S</code>’ in the grid.</p>

<p>The following line contains a string $s$, where each character of s is ‘<code>N</code>’, ‘<code>E</code>’, ‘<code>S</code>’, or ‘<code>W</code>’, representing the sequence of the moves performed by the rover. The string $s$ contains between $1$ and $10\, 000$ characters, inclusive. All of the moves lead to flat spaces.</p>

### 출력

<p>Output the minimum number of times the rover’s direction ordering could have changed to be consistent with the moves it made.</p>
# [Gold V] Connecting Territories - 34458

[문제 링크](https://www.acmicpc.net/problem/34458)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 64, 정답: 14, 맞힌 사람: 11, 정답 비율: 19.643%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34458.%E2%80%85Connecting%E2%80%85Territories/73b1fcd3.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34458-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 220px; height: 358px; float: right;">Ava is playing a strategic game on a grid of tiles. Each tile has an associated cost. When the costs of the tiles are read from left to right, starting with the first row, a repeating pattern of the first $M$ positive integers in increasing order is revealed: $1, 2, 3, \dots , M, 1, 2, 3, \dots , M, 1, 2, 3, \dots $. In this pattern, $M$ represents the maximum cost of a tile. In the grid of tiles shown, $M$ is equal to $5$.</p>

<p>Ava needs to purchase one tile in each row in order to make a connecting path from the upper territory (above the first row of tiles) to the lower territory (below the last row of tiles). The first tile purchased must be in the first row. Each subsequently purchased tile must share either an edge or a corner with the tile purchased previously. In the grid of tiles shown, the cost of Ava’s connecting path is $9$.</p>

<p>Given a grid of tiles, your job is to determine the minimum cost of a connecting path between the upper and lower territories.</p>

### 입력

<p>The first line of input contains a positive integer, $R$ where $R ≤ 20\, 000$, representing the number of rows in the grid. The second line contains a positive integer, $C$ where $C ≤ 20\, 000$, representing the number of columns in the grid. The third line contains a positive integer, $M$ where $M ≤ 100\, 000$, representing the maximum cost of a tile.</p>

### 출력

<p>Output the positive integer, $P$, which is the minimum cost of a connecting path between the upper and lower territories.</p>
# [Platinum III] Tatami Renovation - 35119

[문제 링크](https://www.acmicpc.net/problem/35119)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 31, 정답: 15, 맞힌 사람: 15, 정답 비율: 55.556%

### 분류

그리디 알고리즘, 스위핑

### 문제 설명

<p>The city’s art museum is known for its long straight corridor and the artistically decorated tiles laid along it. The corridor is a rectangular area $2$ meters wide and is divided into one-meter-square cells. Each cell is either occupied by a single tile or is empty.</p>

<p>As a part of the renovation of the museum, all the empty cells will be covered with tatami mats, which are traditional Japanese floor mats. Each tatami mat is $1$ meter by $2$ meters in size, so each tatami mat covers exactly two adjacent cells. Tatami mats must not overlap each other, and they must not overlap any tile.</p>

<p>Depending on the initial placement of the tiles, it may be impossible to cover all the empty cells with tatami mats. To address this, the museum allows each tile to be moved from its original position to one of its adjacent cells that shares a side, but not farther. Tiles must not be moved out of the corridor. No more than one tile should be on a single cell after the moves.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35119.%E2%80%85Tatami%E2%80%85Renovation/47f64a75.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35119-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 105px;"></p>

<p style="text-align: center;">Figure A.1. Before and after the renovation for Sample Input 1</p>

<p>The left figure shows the initial positions of the tiles for Sample Input 1, and the right figure shows one possible way to move one tile and arrange tatami mats to cover all the empty cells.</p>

<p>Determine whether it is possible to cover all the empty cells with tatami mats when you move some (possibly none) of the tiles appropriately. If it is possible, find the minimum number of tiles to be moved.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<blockquote>
<p>$n$ $l$</p>

<p>$r_1$ $c_1$</p>

<p>$r_2$ $c_2$</p>

<p>$\vdots$</p>

<p>$r_n$ $c_n$</p>
</blockquote>

<p>The integer $n$ ($1 ≤ n ≤ 10^5$) represents the number of the tiles in the corridor. The integer $l$ ($3 ≤ l ≤ 10^{18}$) represents the length of the corridor in meters. Each pair of integers $r_i$ and $c_i$ ($i = 1, \dots , n$) satisfies $1 ≤ r_i ≤ 2$ and $1 ≤ c_i ≤ l$, and indicates the location of the $i$-th tile. Specifically, if the corridor is viewed as a rectangle with its height of $2$ cells and width of $l$ cells, then the $i$-th tile is located at the $r_i$-th row from the top and the $c_i$-th column from the left. It is guaranteed that all tiles are initially on distinct cells.</p>

### 출력

<p>If you can cover all the empty cells in the corridor with zero or more tatami mats by moving some (possibly none) of the tiles appropriately, output the minimum number of tiles to be moved. Otherwise, output <code>no</code>.</p>
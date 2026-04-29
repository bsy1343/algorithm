# [Gold III] Rocky Mountain Road Trip - 34295

[문제 링크](https://www.acmicpc.net/problem/34295)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 30, 정답: 23, 맞힌 사람: 21, 정답 비율: 75.000%

### 분류

격자 그래프, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로

### 문제 설명

<p>Adeline and Byron are on a road trip through the mountains. Interestingly, the roads through the mountains can be modeled as a grid of size $ n \times m $, where each cell has an integer altitude. The grid follows standard Cartesian coordinates, with the top-left corner being $ (1,1) $ and the bottom-right corner being $ (n, m) $.</p>

<p>Adeline, an adrenaline junkie, loves the ups and downs of the mountains, while Byron gets motion sick easily. After some debate, they agreed on a compromise: they must find a route from their starting position $ (x_0, y_0) $ to their destination $ (x_f, y_f) $ that minimizes the total distance traveled, but to make it fun for Adeline, they must alternate between gaining and losing altitude with every move. If they take a longer path than necessary, Byron will get sick.</p>

<p>Adeline and Byron's car can move in any of the 8 cardinal directions: North, Northeast, East, Southeast, South, Southwest, West, and Northwest. Each movement to an adjacent cell counts as a distance of 1, regardless of direction.</p>

<p>Help Adeline and Byron determine the minimum number of moves required to reach their destination.</p>

### 입력

<p>The first line contains two integers $ n $ and $ m $ $(1 \leq n, m \leq 500)$—the dimensions of the grid.</p>

<p>The next $ n $ lines each contain $ m $ integers $ h_{i,j} $ $(0 \leq h_{i,j} \leq 10^9)$, representing the altitude of each cell in the grid.</p>

<p>The next line contains four integers $ x_0, y_0, x_f, y_f $ $(1 \leq x_0, x_f \leq n, 1 \leq y_0, y_f \leq m)$—the starting and destination positions.</p>

<p>It is guaranteed that the starting and destination positions are distinct.</p>

### 출력

<p>Print a single integer—the minimum number of moves required to reach $ (x_f, y_f) $ from $ (x_0, y_0) $, or print $-1$ if it is impossible to reach the destination.</p>
# [Gold V] Air Leak - 29849

[문제 링크](https://www.acmicpc.net/problem/29849)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 85, 정답: 28, 맞힌 사람: 24, 정답 비율: 34.783%

### 분류

그래프 이론, 그래프 탐색, 격자 그래프

### 문제 설명

<p>A space station is made up of cubic modules arranged in a $25 \times 25 \times 25$ grid. The position of each module in the grid is indicated by its X-, Y-, and Z-coordinates with integer values in the range $1 \ldots 25$. Any pair of modules next to each other along the X-, Y-, or Z-axis is connected by a tunnel. Each tunnel has doors at both ends. If both doors are open, air may flow between the two modules.</p>

<p>One of the modules has been damaged and leaks air into the space. Air is also being lost from all those modules from which it can flow to the damaged module, either directly or via other modules. Find all the modules that are losing air. You may assume that the doors of the damages module still work correctly.</p>

### 입력

<p>The first line contains $U$, the number of open doors in the station ($1 \le U \le 10\,000$). Each of the following $U$ lines describes one open door: the coordinates of the module and the direction of the door (the name of the axis and &#39;<code>+</code>&#39; for the direction of increasing values of the coordinate, or &#39;<code>-</code>&#39; for the decreasing direction). The last line contains the coordinates of the damaged module.</p>

### 출력

<p>Output the coordinates of all the modules that are losing air, each module on a separate line. Order the lines in ascending order first by the Z-, then by the Y-, and finally by the X-coordinates.</p>
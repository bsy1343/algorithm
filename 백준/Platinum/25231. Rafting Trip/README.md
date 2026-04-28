# [Platinum II] Rafting Trip - 25231

[문제 링크](https://www.acmicpc.net/problem/25231)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 139, 정답: 41, 맞힌 사람: 36, 정답 비율: 33.645%

### 분류

구현, 그래프 이론, 그래프 탐색, 트리, 함수형 그래프

### 문제 설명

<p>You are planning a rafting trip. The terrain can be viewed as a grid. Each cell is either land, or has part of a river flowing through it in one of the four directions: north, south, east, or west. Some land cells contain a sightseeing spot.</p>

<p>You can choose any river cell as the starting point of your rafting trip. Once your raft reaches a river cell (including the starting cell), it will follow the water direction of that cell and move to an adjacent cell or exit the grid.</p>

<p>You can visit a nearby sightseeing spot if your raft reaches a river cell that is adjacent to it, including the starting cell. (Cell adjacency includes horizontal and vertical neighbors, but not diagonal neighbors.) Each sightseeing spot can be visited at most once.</p>

<p>Your rafting trip stops when your raft moves onto a land cell, exits the grid, or enters a river cell that it has reached before. Note that if the raft ends at a land cell, you cannot visit the sightseeing spots adjacent to that land cell.</p>

<p>What is the maximum number of sightseeing spots you can visit in a single rafting trip if you choose your starting cell optimally?</p>

### 입력

<p>The first line of input contains two integers $r$ and $c$ ($2 \leq r, c \leq 500$); the terrain grid has $r$ rows and $c$ columns.</p>

<p>Each of the next $r$ lines contains $c$ characters describing one row of the terrain grid. A dot <code>&#39;.&#39;</code> denotes a land cell without a sightseeing spot. A hash <code>&#39;#&#39;</code> denotes a land cell that contains a sightseeing spot. River cells are denoted by <code>&#39;^&#39;</code> (north), <code>&#39;v&#39;</code> (south), <code>&#39;&gt;&#39;</code> (east), or <code>&#39;&lt;&#39;</code> (west). There is at least one river cell in the grid.</p>

### 출력

<p>Output a single line with a single integer, which is the maximum number of sightseeing spots you can visit in a single rafting trip.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25231.%E2%80%85Rafting%E2%80%85Trip/4ec7d5f2.png" data-original-src="https://upload.acmicpc.net/f89d3869-c2d6-416c-9c37-b75b528dbaf1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 356px; height: 300px;" /></p>

<p style="text-align: center;">Illustration of the first sample case. The optimal rafting trip starts at the cell with the raft and visits $4$ sightseeing spots (marked by binoculars). The river cells reached along the trip are highlighted in dark blue.</p>
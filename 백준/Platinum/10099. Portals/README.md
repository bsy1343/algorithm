# [Platinum III] Portals - 10099

[문제 링크](https://www.acmicpc.net/problem/10099)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 179, 정답: 59, 맞힌 사람: 45, 정답 비율: 37.500%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10099.%E2%80%85Portals/0e00d5b8.png" data-original-src="https://upload.acmicpc.net/ae242098-b3e2-4830-88a4-3cd338cf7476/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 157px; height: 129px; float: right;" />There is a cake placed in a labyrinth and you desperately want to eat it. You have a map of the labyrinth, which is a grid of R rows and C columns. Each grid cell contains one of the following characters:</p>

<ul>
	<li><code>#</code> (number sign) which denotes a wall block,</li>
	<li><code>.</code> (dot) which denotes an open square,</li>
	<li><code>S</code> (uppercase letter s) which denotes an open square of your current location,</li>
	<li><code>C</code> (uppercase letter c) which denotes an open square with the cake.</li>
</ul>

<p>You may only walk on the open squares and move from one open square to another if they share a side. Additionally, the rectangular area depicted on the map is completely surrounded by wall blocks.</p>

<p>In order to reach the cake faster you have acquired a portal gun from Aperture ScienceTM, which operates as follows. At any time it can fire a portal in one of the four directions up, left, down and right. When a portal is fired in some direction, it will fly in that direction until it reaches the first wall. When this happens, a portal will be spawned on the wall block, on the side that faces you.</p>

<p>At most two portals can exist at any given time. If two portals are already placed in the labyrinth, then one of them (selected by you) will be removed immediately upon using the portal gun again. Firing a portal at an existing portal will replace it (there may be at most one portal per side of wall block). Note that there may be two portals placed on different sides of the same wall block.</p>

<p>Once two portals are placed in the labyrinth you can use them to teleport yourself. When standing next to one of the portals, you can walk into it and end up at the open square next to the other portal. Doing this takes as much time as moving between two adjacent squares.</p>

<p>You may assume that firing portals does not take time and moving between two adjacent squares or teleporting through portals takes one unit of time.</p>

<p>Given the map of the labyrinth together with your starting location and the location of the cake, calculate the minimum possible time needed for you to reach the cake.</p>

### 입력

<p>The first line of the input contains two integers: the number of rows in the map R, and the number of columns C. The next R lines describe the map. Each of these lines contains C characters: <code>#</code>, <code>.</code>, <code>S</code> or <code>C</code> (whose meaning is described above).</p>

<p>It is guaranteed that characters <code>S</code> and <code>C</code> each appear exactly once in the map.</p>

### 출력

<p>The output should contain a single integer &mdash; the minimum time that is needed to reach the cake from the starting location.</p>

<p>You may assume that it is possible to reach the cake from your starting location.</p>

### 힌트

<p>One quickest sequence of moves is as follows: 1) move right, 2) move right, shoot one portal up, and one portal down, 3) move through the bottom portal, 4) move one square right and reach the cake.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10099.%E2%80%85Portals/315117e9.png" data-original-src="https://upload.acmicpc.net/635a3333-53b8-4804-a2c6-af619063029d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 160px; height: 161px;" /></p>
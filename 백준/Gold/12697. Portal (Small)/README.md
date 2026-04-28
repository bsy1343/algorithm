# [Gold II] Portal (Small) - 12697

[문제 링크](https://www.acmicpc.net/problem/12697)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 130, 정답: 39, 맞힌 사람: 34, 정답 비율: 34.694%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 0-1 너비 우선 탐색

### 문제 설명

<p>Portal<sup>TM</sup>&nbsp;is a first-person puzzle/platform game developed and published by Valve Software. The idea of the game was to create two portals on walls and then jump through one portal and come out the other. This problem has a similar idea but it does not assume you have played Portal.</p>

<p>For this problem you find yourself in a&nbsp;<strong>R</strong>&nbsp;by&nbsp;<strong>C</strong>&nbsp;grid. Additionally there is a delicious cake somewhere else in the grid. You&#39;re very hungry and wish to arrive at the cake with as few moves as possible. You can move north, south, east or west to an empty cell. Additionally, you have the ability to create portals on walls.</p>

<p>To help you get to the cake you have a portal gun which can shoot two types of portals, a yellow portal and a blue portal. A portal is created by shooting your portal gun either north, south, east or west. This emits a ball of energy that creates a portal on the first wall it hits. Note that for this problem shooting the portal gun does not count as a move. If you fire your portal gun at the cake, the energy ball will go right through it.</p>

<p>After creating a yellow portal and a blue portal, you can move through the yellow portal to arrive at the blue portal or vice versa. Using these portals you may be able to reach the cake even faster! You can only use portals after you create both a yellow and a blue portal.</p>

<p>Consider the following grid:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12697.%E2%80%85Portal%E2%80%85(Small)/cf306c52.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12697.%E2%80%85Portal%E2%80%85(Small)/cf306c52.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12697/images-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Gray cells represent walls, white cells represent empty cells, and the red circle indicates your position.</p>

<p>Suppose you shoot a blue portal east. The portal is created on the first wall it hits, resulting in:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12697.%E2%80%85Portal%E2%80%85(Small)/778c9bfd.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12697.%E2%80%85Portal%E2%80%85(Small)/778c9bfd.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12697/images-4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Now suppose you shoot a yellow portal south:<br />
<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12697.%E2%80%85Portal%E2%80%85(Small)/6d9075c9.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12697.%E2%80%85Portal%E2%80%85(Small)/6d9075c9.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12697/images-5.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Next you move south once:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12697.%E2%80%85Portal%E2%80%85(Small)/8d05fdb1.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12697.%E2%80%85Portal%E2%80%85(Small)/8d05fdb1.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12697/images-6.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:78px; width:154px" /></p>

<p>Now comes the interesting part. If you move south one more time you go through the yellow portal to the blue portal:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12697.%E2%80%85Portal%E2%80%85(Small)/4d0abddf.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12697.%E2%80%85Portal%E2%80%85(Small)/4d0abddf.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12697/images-7.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>There can only be one yellow portal and one blue portal at any time. For example if you attempt to create a blue portal to the west the other blue portal will disappear:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12697.%E2%80%85Portal%E2%80%85(Small)/65aabd52.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12697.%E2%80%85Portal%E2%80%85(Small)/65aabd52.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12697/images-8.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>A portal disappears only when another portal of the same color is fired.</p>

<p>Note that the portals are created on one side of the wall. If a wall has a portal on its east side you must move into the wall from the east to go through the portal. Otherwise you&#39;ll be moving into a wall, which is improbable.</p>

<p>Finally, you may not put two portals on top of each other. If you try to fire a portal at a side of a wall that already has a portal, the second portal will fail to form.</p>

<p>Given the maze, your initial position, and the cake&#39;s position, you want to find the minimum number of moves needed to reach the cake if it is possible. Remember that shooting the portal gun does not count as a move.</p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>N</strong>.&nbsp;<strong>N</strong>&nbsp;test cases follow.</p>

<p>The first line of each test case will contain the integers&nbsp;<strong>R</strong>&nbsp;and&nbsp;<strong>C</strong>&nbsp;separated by a space.&nbsp;&nbsp;<strong>R</strong>lines follow containing&nbsp;<strong>C</strong>&nbsp;characters each, representing the map:</p>

<ul>
	<li><code>.</code>&nbsp;indicates an empty cell;</li>
	<li><code>#</code>&nbsp;indicates a wall;</li>
	<li><code>O</code>&nbsp;indicates your starting position; and</li>
	<li><code>X</code>&nbsp;indicates the cake&#39;s position.</li>
</ul>

<p>There will be exactly one&nbsp;<code>O</code>&nbsp;and one&nbsp;<code>X</code>&nbsp;character per case.</p>

<p>Cells outside of the grid are all walls and you may use them to create portals.</p>

<p>Limits</p>

<ul>
	<li><strong>N</strong>&nbsp;= 200</li>
	<li>1 &lt;=&nbsp;<strong>R</strong>,&nbsp;<strong>C</strong>&nbsp;&lt;= 8</li>
</ul>

### 출력

<p>For each test case you should output one line containing &quot;Case #<strong>X</strong>:&nbsp;<strong>Y</strong>&quot; (quotes for clarity) where&nbsp;<strong>X</strong>&nbsp;is the number of the test case and&nbsp;<strong>Y</strong>&nbsp;is the minimum number of moves needed to reach the cake or &quot;THE CAKE IS A LIE&quot; (quotes for clarity) if the cake cannot be reached.</p>

### 힌트

<p>Here is the sequence of moves for the first case (note that shooting the portal gun does not count as a move):</p>

<ol>
	<li>Move one step east.</li>
	<li>Shoot a blue portal north.</li>
	<li>Shoot a yellow portal south.</li>
	<li>Move one step north through the blue portal.</li>
	<li>Shoot a blue portal east.</li>
	<li>Move one step south through the yellow portal.</li>
	<li>Move one step west.</li>
	<li>Eat your delicious and moist cake.</li>
</ol>

<p>Portal<sup>TM</sup>&nbsp;is a trademark of Valve Inc. Valve Inc. does not endorse and has no involvement with Google Code Jam.</p>
# [Gold IV] Tide Goes In, Tide Goes Out (Large) - 12391

[문제 링크](https://www.acmicpc.net/problem/12391)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 15, 맞힌 사람: 15, 정답 비율: 60.000%

### 분류

너비 우선 탐색, 데이크스트라, 그래프 이론, 그래프 탐색, 최단 경로

### 문제 설명

<p>You are kayaking through a system of underground caves and suddenly realize that the tide is coming in and you are trapped! Luckily, you have a map of the cave system. You are stuck until the tide starts going out, so you will be here for a while. In the meantime, you want to determine the fastest way to the exit once the tide starts going out.</p>

<p>The cave system is an&nbsp;<strong>N</strong>&nbsp;by&nbsp;<strong>M</strong>&nbsp;grid. Your map consists of two&nbsp;<strong>N</strong>&nbsp;by&nbsp;<strong>M</strong>&nbsp;grids of numbers: one that specifies the height of the ceiling in each grid square, and one that specifies the height of the floor in each grid square. The floor of the cave system is porous, which means that as the water level falls, no water will remain above the water level.</p>

<p>You are trapped at the north-west corner of the map. The current water level is&nbsp;<strong>H</strong>centimeters, and once it starts going down, it will drop at a constant rate of 10 centimeters per second, down to zero. The exit is at the south-east corner of the map. It is now covered by water, but it will become passable as soon as the water starts going down.</p>

<p>At any time, you can move north, south, east or west to an adjacent square with the following constraints:</p>

<ul>
	<li>The water level, the floor height of your current square, and the floor height of the adjacent square must all be at least 50 centimeters lower than the ceiling height of the adjacent square. Note: this means that you will never be able to enter a square with less than 50 centimeters between the floor and the ceiling.</li>
	<li>The floor height of the adjacent square must be at least 50 centimeters below the ceiling height of your current square as well.</li>
	<li>You can never move off the edge of the map.</li>
</ul>

<p>Note that you can go up or down as much as you want with your kayak. (You&#39;re very athletic from all this kayaking!) For example, you can go from a square with floor at height 10 centimeters to an adjacent square with floor at height 9000 centimeters (assuming the constraints given above are met).</p>

<p>&nbsp;</p>

<p>These constraints are illustrated below:&nbsp;<img src="%EB%B0%B1%EC%A4%80/Gold/12391.%E2%80%85Tide%E2%80%85Goes%E2%80%85In%2C%E2%80%85Tide%E2%80%85Goes%E2%80%85Out%E2%80%85(Large)/7bc2ee09.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12390/images-48.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="vertical-align:middle" /></p>

<ul>
	<li>In the first image, you can&#39;t move to the right because the water level is less than 50 centimeters below the ceiling height of the adjacent square.</li>
	<li>In the second image, you can&#39;t move to the right because the floor height of your current square is less than 50 centimeters below the ceiling height of the adjacent square.</li>
	<li>In the third image, you can&#39;t move to the right because the floor height of the adjacent square is less than 50 centimeters below the ceiling height of the adjacent square. You&#39;ll never be able to enter that square from any direction.</li>
	<li>In the fourth image, you can&#39;t move to the right because the floor height of the adjacent square is less than 50 centimeters below the ceiling height of the current square.</li>
</ul>

<p>&nbsp;</p>

<p>When moving from one square to another, if there are at least 20 centimeters of water remaining on the current square when you start moving from it, it takes 1 second to complete the move (you can use your kayak). Otherwise, it takes 10 seconds (you have to drag your kayak). Note that the time depends only on the water level in the square you are leaving, not in the square you are entering.</p>

<p>It will be a while before the tide starts going out, and so you can spend as much time moving as you want before the water starts going down. What matters is how much time you will need from the moment the water starts going down until the moment you reach the exit. Can you calculate this time?</p>

### 입력

<ul>
	<li>The first line will contain a single integer,&nbsp;<strong>T</strong>: the number of test cases&nbsp;</li>
	<li>It is followed by&nbsp;<strong>T</strong>&nbsp;test cases, each starting with a line containing integers&nbsp;<strong>H</strong>,&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>M</strong>, representing the initial water level height, in centimeters, and the map dimensions. The following 2<strong>N</strong>&nbsp;lines contain the ceiling and floor heights as follows:
	<ul>
		<li>The next&nbsp;<strong>N</strong>&nbsp;lines contain&nbsp;<strong>M</strong>&nbsp;space-separated integers each. The&nbsp;<em>j</em>th integer in the&nbsp;<em>i</em>th row represents&nbsp;<strong>C<sub>ij</sub></strong>, the height of the ceiling in centimeters at grid location&nbsp;<em>(j, i)</em>, where increasing&nbsp;<em>i</em>&nbsp;coordinates go South, and increasing&nbsp;<em>j</em>coordinates go East.</li>
		<li>The next&nbsp;<strong>N</strong>&nbsp;lines contain&nbsp;<strong>M</strong>&nbsp;space-separated integers representing the heights of the floor, in the same format.</li>
	</ul>
	</li>
	<li>At the starting location, there will always be at least 50 cm of air between the ceiling and the starting water level, and at least 50 cm between the ceiling and the floor.</li>
	<li>The exit location will always have at least 50 cm of air between the ceiling and the floor.</li>
	<li>There will always be a way out (you got in, after all!).</li>
</ul>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 50.&nbsp;</li>
	<li>1 &le;&nbsp;<strong>N, M</strong>&nbsp;&le; 100.&nbsp;</li>
	<li>1 &le;&nbsp;<strong>H</strong>&nbsp;&le; 10000.&nbsp;</li>
	<li>1 &le;&nbsp;<strong>F<sub>xy</sub></strong>&nbsp;&le;&nbsp;<strong>C<sub>xy</sub></strong>&nbsp;&le; 10000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: t&quot;, where x is the case number (starting from 1), and t is the time, in seconds, starting from when the tide begins going out, that it takes you to make your way out of the cave system. Answers within an absolute or relative error of 10<sup>-6</sup>&nbsp;of the correct answer will be accepted.</p>

### 힌트

<h3>Notes</h3>

<p>It is possible that you can go through the whole cave system before the tide starts dropping. In this case you will be able to wait at the exit for the tide to start dropping, so the answer in this case should be zero (this is the case in the fourth of the sample test cases).</p>

<p>&nbsp;</p>

<p>In the first sample test case, there are initially only 33 centimeters between the water level and the ceiling of the eastern square, so after the tide starts going down, you have to wait for at 1.7 seconds to enter it. Once it is accessible, you can start going in - but the water level in the western square is now so low (only 3 centimeters above the floor) that you have to drag your kayak for the next 10 seconds to get to the exit point.</p>

<p>The initial situation in the second case is better - you have a lot of headroom in adjacent squares, so you can move, for example, to (1, 1) before the tide starts dropping. Once there, you have to wait for the tide to start going down, and the water level to go down to 90cm (that takes one second). Then you can kayak south and then east and get out (in a total of three seconds). Note that you cannot go through the cave at (2, 1), even though the ceiling there is high enough, because there is too little space between the floor of this cave and the ceiling of any caves you could try to enter from ((1, 1) and (2, 0)) - only 10 centimeters in each case.</p>

<p>The third case is somewhat similar to the first - you have to wait at the starting position until the tide goes down to 50cm. After that you can kayak for the exit - but after three moves (taking three seconds) the water is at 20cm, which is only 10cm above the floor, which means the fourth move will be dragging instead of kayaking.</p>

<p>In the fourth case you are really lucky! You can immediately go the exit, even before the tide starts leaving, and wait there.</p>
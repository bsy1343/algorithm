# [Gold III] Ping Pong Balls (Small) - 12663

[문제 링크](https://www.acmicpc.net/problem/12663)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 16, 맞힌 사람: 16, 정답 비율: 88.889%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>A large room is filled with mousetraps, arranged in a grid. Each mousetrap is loaded with two ping-pong balls, carefully placed so that when the mousetrap goes off they will be flung, land on other mousetraps and set them off. The walls of the room are sticky, so any balls that hit the walls of the room are effectively absorbed.</p>

<p>Every mousetrap that gets hit sends the two ping-pong balls in the same way: their movement is determined by a X and Y displacement relative to the launching mousetrap. You then decide to launch a single ping-pong ball into the room. It hits a mousetrap, setting it off, and launching its two balls. These two balls then set off two more mousetraps, and now four balls fly off... When the dust settles, many of the mousetraps have been set off, but some have been missed by all the flying balls.</p>

<p>You need to calculate how many mousetraps will be set off.</p>

<p>As an example (see the first sample test case), the picture below illustrates a room with width 5, height 3. The two directions for the ping-pong balls in each room are (-1, 0) and (-1, -1), respectively. The first ball you launch hits the mousetrap at the position (4, 2). In the end, 12 mousetraps are triggered.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12663.%E2%80%85Ping%E2%80%85Pong%E2%80%85Balls%E2%80%85(Small)/8ba55e86.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12663/images-18.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>C</strong>.&nbsp;<strong>C</strong>&nbsp;test cases follow. Each case contains four lines. The first line is the size of the grid of mousetraps (equal to the size of the room), given as its width&nbsp;<strong>W</strong>&nbsp;and height&nbsp;<strong>H</strong>. The next two lines give the destinations of the two ping-pong balls, as an X and Y displacement. For example, if the two lines were&nbsp;<code>0 1</code>&nbsp;and&nbsp;<code>1 1</code>, then triggering a mousetrap would launch two balls; one would hit the mousetrap just up from the triggered mousetrap, and the other would hit the mousetrap that is up and to the right of the triggered mousetrap. The final line has two integers specifying, respectively, the column and row of the mousetrap set off by the original ping-pong ball (where 0 0 would be the bottom left mousetrap).</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 100</li>
	<li>-20 &le; any displacement &le; 20</li>
	<li>Neither vector will have zero length.</li>
	<li>2 &le;&nbsp;<strong>W</strong>,&nbsp;<strong>H</strong>&nbsp;&le; 100</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>A</strong>:&nbsp;<strong>B</strong>&quot;, where&nbsp;<strong>A</strong>&nbsp;is 1-based number of the case and&nbsp;<strong>B</strong>&nbsp;is the number of mousetraps that are triggered (including the first one).</p>
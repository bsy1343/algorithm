# [Silver III] Building a House (Large) - 12542

[문제 링크](https://www.acmicpc.net/problem/12542)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 75, 정답: 64, 맞힌 사람: 58, 정답 비율: 85.294%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>You have just bought land and want to plant the largest rectangular field possible. In surveying your land, you find a number of obstacles and decide to draw a map. You indicate in each square of the map whether it contains grass (<strong>G</strong>), rock (<strong>R</strong>), water (<strong>W</strong>), shrubs (<strong>S</strong>), or trees (<strong>T</strong>). While the grass can be mowed and the shrubs dug from the ground, the water, rocks, and trees&nbsp;<strong>cannot</strong>&nbsp;be removed. Given these obstacles, determine the area of the largest rectangular field.</p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>N</strong>.<br />
<strong>N</strong>&nbsp;test cases follow. For each test case there will be:</p>

<ul>
	<li>One line containing two space-separated integers indicating the length (<strong>L</strong>) and width (<strong>W</strong>) of your land.</li>
	<li>Followed by,&nbsp;<strong>W</strong>&nbsp;lines, each containing&nbsp;<strong>L</strong>&nbsp;characters where each indicates the conditions for that square of land (one of&nbsp;<code>G, R, W, S, or T</code>).</li>
</ul>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>L</strong>&nbsp;&le; 50</li>
	<li>1 &le;&nbsp;<strong>W</strong>&nbsp;&le; 50</li>
	<li><strong>N</strong>&nbsp;&le; 30</li>
	<li>Fewer than 20 obstacles in each test case.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>x</strong>: &quot; followed by the maximum area of the largest rectangle that can be cleared.</p>
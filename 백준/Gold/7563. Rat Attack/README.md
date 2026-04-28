# [Gold V] Rat Attack - 7563

[문제 링크](https://www.acmicpc.net/problem/7563)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 53, 정답: 34, 맞힌 사람: 22, 정답 비율: 59.459%

### 분류

브루트포스 알고리즘, 누적 합

### 문제 설명

<p>Baaaam! Another deadly gas bomb explodes in Manhattan&rsquo;s underworld. Rats have taken over the sewerage and the city council is doing everything to get the rat population under control.</p>

<p>As you know, Manhattan is organized in a regular fashion with streets and avenues arranged like a rectangular grid. Waste water drains run beneath the streets in the same arrangement and the rats have always set up their nests below street intersections. The only viable method to extinguish them is to use gas bombs like the one which has just exploded. However, gas bombs are not only dangerous for rats. The skyscrapers above the explosion point have to be evacuated in advance and so the point of rat attack must be chosen very carefully.</p>

<p>The gas bombs used are built by a company called American Catastrophe Management (ACM) and they are sold under the heading of &ldquo;smart rat gas&rdquo;. They are smart because &mdash; when fired &mdash; the gas spreads in a rectangular fashion through the understreet canals. The strength of a gas bomb is given by a number d which specifies the rectangular &ldquo;radius&rdquo; of the gas diffusion area. For example, Figure 2 shows what happens when a bomb with d = 1 explodes.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7563/1.png" style="height:247px; width:488px" /></p>

<p style="text-align: center;">Figure 2: Diffusion area of gas after an explosion.</p>

<p>The area of interest consists of a discrete grid of 1025 &times; 1025 fields. Rat exterminator scouts have given a detailed report on where rat populations of different sizes have built their nests. You are given a gas bomb with strength d and your task is to find an explosion location for this gas bomb which extinguishes the largest number of rats.</p>

<p>The best position is determined by the following criteria:</p>

<ul>
	<li>The sum of all rat population sizes within the diffusion area of the gas bomb (given by d) is maximal.</li>
	<li>If there is more than one of these best positions then the location with the &ldquo;minimal&rdquo; position will be chosen. Positions are ordered first by their x coordinate and second by their y coordinate.</li>
</ul>

<p>Formally, given a location (x1, y1) on the grid, a point (x2, y2) is within the diffusion area of a gas bomb with strength d if the following equation holds:</p>

<p style="text-align: center;">max(abs(x2 &minus; x1), abs(y2 &minus; y1)) &le; d</p>

### 입력

<p>The first line contains the number of scenarios in the input.</p>

<p>For each scenario the first line contains the strength d of the gas bomb in the scenario (1 &le; d &le; 50). The second line contains the number n (1 &le; n &le; 20000) of rat populations. Then for every rat population follows a line containing three integers separated by spaces for the position (x, y) and &ldquo;size&rdquo; i of the population (1 &le; i &le; 255). It is guaranteed that position coordinates are valid (i.e., in the range between 0 and 1024) and no position is given more than once.</p>

### 출력

<p>For every problem print a line containing the x and y coordinate of the choosen location for the gas bomb, followed by the sum of the rat population sizes which will be extinguished. The three numbers must be separated by a space.</p>
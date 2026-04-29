# [Silver I] Hurry the Hedgehog - 33254

[문제 링크](https://www.acmicpc.net/problem/33254)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 2048 MB

### 통계

제출: 43, 정답: 33, 맞힌 사람: 25, 정답 비율: 78.125%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로

### 문제 설명

<p>Hurry is a Hedgehog, who lives in the Mushroom Kingdom. He is on a mission to save Princess Plum from the evil Donkey Kong. In order to get to the Princess, Hurry must run through a hyperspace network of roads. These roads are dangerous and for every road that he walks between two intersections, he is getting attacked by Space Invaders. Luckily, at some intersections, there is a Super Mushroom that will restore Hurry's health.</p>

<p>Can you find the shortest path through the network of roads, such that you can eat a Super Mushroom at each intersection?</p>

### 입력

<p>The intersections are numbered between $1$ and $n$, inclusive. \\ Hurry will need to start at intersection $1$ and run to intersection $n$. \\ The input is structured as follows:</p>

<ul>
	<li>One line with three integers: $1 \leq n \leq 10^5$, the number of intersections; $0 \leq m \leq 10^6$, the number of roads; and $1 \leq s \leq n$, the number of Super Mushrooms.</li>
	<li>One line with $\max(0, s-2)$ integers: the indices of the intersections that have a Super Mushroom (intersections $1$ and $n$ will always have a Super Mushroom and are not in this list).</li>
	<li>$m$ lines with two integers each, indicating that there is a road between the two intersections with these indices.</li>
</ul>

### 출력

<p>One line containing one integer, which is the number of intersections in the path that Hurry will have to run.</p>
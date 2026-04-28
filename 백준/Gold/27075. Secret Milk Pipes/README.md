# [Gold II] Secret Milk Pipes - 27075

[문제 링크](https://www.acmicpc.net/problem/27075)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 9, 맞힌 사람: 9, 정답 비율: 47.368%

### 분류

그래프 이론, 그래프 탐색, 최소 스패닝 트리

### 문제 설명

<p>Farmer John wants to connect his water distribution system cheaply, but he doesn&#39;t want his rival, Farmer Snidely, to be able to predict the actual routes he chooses.  FJ knows that this kind of problem usually asks for the cheapest way to connect water pipes, so he decides to avoid that and use the second cheapest way instead.</p>

<p>Given a list of all the bidirectional pipes that might connect a set of W (3 &le; W &le; 2000) water stations (any one of which can be made into a well) along with the costs for no more than P (P &le; 20,000) pipes, find the second cheapest way to distribute water.  No pipe connects a station to itself; no two pipes connect the same pair of stations.</p>

<p>It is guaranteed that there is only one cheapest way to distribute the water and that there are at least two ways to distribute the water.  All costs are positive integers that fit into a signed 16-bit entity.  A water station is identified by its ID number, which is an integer in the range 1..W.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers, W and P</li>
	<li>Lines 2..P+1: Each line describes a single pipe and contains three space-separated integers: a water station that is one endpoint of a pipe, a water station that is the other endpoint of a pipe, and the cost of that pipe.</li>
</ul>

### 출력

<p>A single line with a single integer that is the second lowest cost to construct a water distribution system.</p>
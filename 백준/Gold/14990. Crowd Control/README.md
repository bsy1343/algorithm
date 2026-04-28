# [Gold I] Crowd Control - 14990

[문제 링크](https://www.acmicpc.net/problem/14990)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 41, 맞힌 사람: 39, 정답 비율: 79.592%

### 분류

이분 탐색, 자료 구조, 깊이 우선 탐색, 분리 집합, 그래프 이론, 그래프 탐색, 최소 스패닝 트리

### 문제 설명

<p>The BAPC draws a large number of visitors to Amsterdam. Many of these people arrive at the train station, then walk from intersection to intersection through the streets of Amsterdam in a big parade until they reach the BAPC location.</p>

<p>A street can only allow a certain number of people per hour to pass through. This is called the capacity of the street. The number of people going through a street must never exceed its capacity, otherwise accidents will happen. People may walk through a street in either direction.</p>

<p>The BAPC organizers want to prepare a single path from train station to BAPC location. They choose the path with maximum capacity, where the capacity of a path is defined to be the minimum capacity of any street on the path. To make sure that nobody walks the wrong way, the organizers close down the streets which are incident<sup>1</sup> to an intersection on the path, but not part of the path.</p>

<p>Can you write a program to help the organizers decide which streets to block? Given a graph of the streets and intersections of Amsterdam, produce the list of streets that need to be closed down in order to create a single maximum-capacity path from the train station to the BAPC. The path must be simple, i.e. it may not visit any intersection more than once.</p>

<p><sup>1</sup>An edge is incident to a vertex if the vertex is an endpoint of the edge.</p>

### 입력

<ul>
	<li>The first line contains two integers: n, the number of intersections in the city, and m, the number of streets (1 &le; n, m &le; 1000).</li>
	<li>The following m lines each specify a single street. A street is specified by three integers, a<sub>i</sub>, b<sub>i</sub> and c<sub>i</sub>, where a<sub>i</sub> and b<sub>i</sub> are ids of the two intersections that are connected by this street (0 &le; a<sub>i</sub>, b<sub>i</sub> &lt; n) and c<sub>i</sub> is the capacity of this street (1 &le; c<sub>i</sub> &le; 500000). Streets are numbered from 0 to m &minus; 1 in the given order.</li>
</ul>

<p>You may assume the following:</p>

<ul>
	<li>All visitors start walking at the train station which is the intersection with id 0. The BAPC is located at the intersection with id n &minus; 1.</li>
	<li>The intersections and streets form a connected graph.</li>
	<li>No two streets connect the same pair of intersections.</li>
	<li>No street leads back to the same intersection on both ends. &bull; There is a unique simple path of maximum capacity.</li>
</ul>

### 출력

<p>Output a single line containing a list of space separated street numbers that need to be blocked in order to create a single maximum-capacity path from train station to BAPC. Sort these street numbers in increasing order.</p>

<p>If no street must be blocked, output the word &ldquo;none&rdquo; instead.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14990.%E2%80%85Crowd%E2%80%85Control/55807e3f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14989/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:230px; width:430px" /></p>

<p style="text-align: center;">Figure 2: Illustration of the first example input.</p>
# [Platinum II] Downtown - 7732

[문제 링크](https://www.acmicpc.net/problem/7732)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 6, 맞힌 사람: 5, 정답 비율: 17.857%

### 분류

그래프 이론, 최대 유량, 평면 그래프

### 문제 설명

<p>Councillors from the Los Hippopotalamos city are overwhelmed with complaints about traffic-jams in the city centre. Most people refuse to walk and prefer local means of transportation &ndash; the hippos. The problem is that downtown lanes are quite narrow and local hippos are rather large. When two hippos come across in the opposite directions they usually stuck in the lane and jam the traffic for a very long time. To prevent these collisions, the councillors have decided to change all lanes into one-way streets. However, the department of traffic and transportation couldn&rsquo;t comply, because there are not enough traffic signs for such an operation. Situation is getting critical so the councillors have asked for your help.</p>

<p>You&rsquo;ll get a map of the town described as an undirected planar graph and you&rsquo;re supposed to direct all edges. The department of traffic and transportation warned you that from each vertex could lead at most 3 outgoing edges (number of incoming edges is not limited). You are not supposed to take care about any other details (such as vertex reachability or strong connectivity). If there are more correct solutions for a given graph you may present any one of them.</p>

### 입력

<p>The first line of the input contains two numbers N and M (1 &le; N &le; 200 000, 1 &le; M &le; 1 000 000) where N represents number of vertices and M number of edges. The following M lines describe edges. Each edge is defined by numbers of two incident vertices i and j (1 &le; i, j &le; N). The graph is guaranteed to be planar, i.e., it is possible to draw it in the plane (vertices are points, edges are line segments) in such a way that no two edges have a point in common except possibly for their end vertices. There are no loops nor multiple edges in the graph.</p>

### 출력

<p>Results are written in the very same format as the input is. Just do not forget that this time the edges are oriented (edge that is defined by vertices i and j is oriented from i to j). If the given graph has no solution at all you are supposed to write &quot;no&quot; string into the output file.</p>
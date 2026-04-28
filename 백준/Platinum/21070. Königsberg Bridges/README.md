# [Platinum II] Königsberg Bridges - 21070

[문제 링크](https://www.acmicpc.net/problem/21070)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 141, 정답: 51, 맞힌 사람: 46, 정답 비율: 41.818%

### 분류

그래프 이론, 그래프 탐색, 트리, 단절점과 단절선, 이중 연결 요소, 트리의 지름

### 문제 설명

<p>Given a graph, we say it is <em>K&ouml;nigsbergsy</em> if there is a simple path that goes through all of its bridges. Here, a <em>bridge</em> is an edge that disconnects the graph when removed. And recall that a simple path is a path that visits each vertex at most once.</p>

<p>Given a graph $G$, we want to add some edges to it to make it K&ouml;nigsbergsy. (You may add more than one edge between the same pair of vertices). Determine the maximum number of bridges that the resulting graph can have.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ ($2 \leq n \leq 10^6$; $0 \leq m \leq 10^6$), the number of vertices and the number of edges of $G$.</p>

<p>Each of the next $m$ lines contains two integers $u_i, v_i$ ($0 \leq u_i, v_i \leq n-1$), describing an edge between vertices $u_i$ and $v_i$.&nbsp;</p>

### 출력

<p>Output one integer, the maximum number of bridges the resulting graph can have.</p>
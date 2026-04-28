# [Platinum IV] A Prickly Problem – Black Edition - 26359

[문제 링크](https://www.acmicpc.net/problem/26359)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 15, 맞힌 사람: 15, 정답 비율: 75.000%

### 분류

이중 연결 요소, 선인장, 깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26359.%E2%80%85A%E2%80%85Prickly%E2%80%85Problem%E2%80%85%E2%80%93%E2%80%85Black%E2%80%85Edition/c8b76434.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26359.%E2%80%85A%E2%80%85Prickly%E2%80%85Problem%E2%80%85%E2%80%93%E2%80%85Black%E2%80%85Edition/c8b76434.png" data-original-src="https://upload.acmicpc.net/b5d0aab6-1e50-4606-a8da-5ef2b1ef8f74/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 197px; height: 299px;" /></p>

<p>A tree is a connected graph in which any two vertices have exactly one path between them.</p>

<p>A cactus (sometimes called a cactus tree) is a connected graph in which any two simple cycles have at most one vertex in common. Equivalently, every edge in such a graph belongs to at most one simple cycle. The graph pictured above is an example of a cactus graph.<sup>1</sup></p>

<p>A spanning tree can be created from a connected graph by removing a set of edges such that if there are V vertices in the graph, then there are V &ndash; 1 edges remaining and every pair of vertices has exactly one path between them. Depending on which edges you choose to remove you will end up with different spanning trees. The cactus graph pictured above contains 36,864 spanning trees.</p>

<p>In this problem, your task is to count the number of spanning trees that a given cactus has. Since this result may be quite large, you should report your result modulo 1,007.</p>

<hr />
<p><sup>1</sup>Picture of graph and definition of a cactus graph taken from www.wikipedia.org</p>

### 입력

<p>Input will begin with an integer T denoting the number of test cases. Each test case will begin with two positive integers V &le; 50,000 and E &le; (3*V)/2 denoting the number of vertices and the number of edges, respectively. This will be followed by E lines, each containing an edge in the graph. Each edge is represented by its two vertices and each vertex listed will be between 1 and V (assume that there is at most one edge in the input between any two vertices). It is guaranteed that the graph described in the input will be a cactus.</p>

### 출력

<p>For each test case, output a single line &quot;Case #x: y&quot; where x is the case number starting with 1 and y is the number of spanning trees modulo 1,007. Leave a blank line after the output for each test case. Follow the format illustrated in Sample Output.</p>
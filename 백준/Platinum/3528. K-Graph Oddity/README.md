# [Platinum III] K-Graph Oddity - 3528

[문제 링크](https://www.acmicpc.net/problem/3528)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 67, 정답: 29, 맞힌 사람: 25, 정답 비율: 62.500%

### 분류

그래프 이론, 그리디 알고리즘, 그래프 탐색, 깊이 우선 탐색

### 문제 설명

<p>You are given a connected undirected graph with an odd number of vertices. The degree of the vertex, by definition, is the number of edges incident to it. In the given graph the degree of each vertex does not exceed an odd number k. Your task is to color the vertices of this graph into at most k distinct colors, so that the colors of any two adjacent vertices are distinct.</p>

<p>The pictures below show two graphs. The first one has 3 vertices and the second one has 7 vertices. In both graphs degrees of the vertices do not exceed 3 and the vertices are colored into at most 3 different colors marked as &lsquo;<img alt="" src="/upload/images3/kgraph1.png" style="height:19px; width:18px" />&rsquo;, &lsquo;<img alt="" src="/upload/images3/kgraph2.png" style="height:18px; width:17px" />&rsquo; and &lsquo;<img alt="" src="/upload/images3/kgraph3.png" style="height:18px; width:16px" />&rsquo;.</p>

<p style="text-align: center;"><img alt="" src="/upload/images3/kgraph.png" style="height:108px; width:492px" /></p>

### 입력

<p>The first line of the input file contains two integer numbers n and m, where n is the number of vertices in the graph (3 &le; n &le; 9999, n is odd), m is the number of edges in the graph (2 &le; m &le; 100 000). The following m lines describe edges of the graph, each edge is described by two integers ai, bi (1 &le; ai, bi &le; n, ai &ne; bi) &mdash; the vertex numbers connected by this edge. Each edge is listed at most once. The graph in the input file is connected, so there is a path between any pair of vertices.</p>

### 출력

<p>On the first line of the output file write a single integer number k &mdash; the minimal odd integer number, such that the degree of any vertex does not exceed k. Then write n lines with one integer number ci (1 &le; ci &le; k) on a line that denotes the color of i-th vertex.</p>

<p>The colors of any two adjacent vertices must be different. If the graph has multiple different colorings, print any of them. At least one such coloring always exists.</p>
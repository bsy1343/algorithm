# [Gold IV] Find the Vertex - 18668

[문제 링크](https://www.acmicpc.net/problem/18668)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 102, 정답: 72, 맞힌 사람: 55, 정답 비율: 67.901%

### 분류

그래프 이론, 그래프 탐색, 애드 혹

### 문제 설명

<p>You are given a connected undirected graph with n vertices and m edges. The vertices are numbered from 1 to n. The vertex number s is the initial vertex. You don&rsquo;t know the number s, but you know all distances from vertex s to every other vertex including itself, taken modulo 3. You have to find the number s.</p>

<p>The distance between two vertices is the length of the shortest path between them. The length of a path is the number of edges in it.</p>

### 입력

<p>The first line contains two integers n and m (1 &le; n, m &le; 500 000), the number of vertices and the number of edges.</p>

<p>The second line contains n integers d<sub>1</sub>, d<sub>2</sub>, . . . , d<sub>n</sub> (0 &le; d<sub>i</sub> &le; 2). Here, d<sub>i</sub> is the distance between vertices s and i, taken modulo 3.</p>

<p>The next m lines describe the edges. The i-th of these lines describes i-th edge and contains two integers u and v (1 &le; u, v &le; n), the indices of vertices connected by this edge.</p>

<p>It is guaranteed that there are no self-loops and no multiple edges in the graph. Also, it is guaranteed that the graph is connected.</p>

### 출력

<p>Print the number s: the index of the initial vertex. If there are multiple answers, print any one of them.</p>

### 힌트

<p>In the first sample, the array of lengths of paths between vertex 2 and all vertices is [1, 0, 1, 1, 2]. It is equal to the given array d.</p>

<p>In the second sample, the array of lengths of paths from vertex 1 is [0, 1, 2, 3, 2, 1]. If we take each element modulo 3, we will get the array d.</p>
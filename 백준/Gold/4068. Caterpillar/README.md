# [Gold IV] Caterpillar - 4068

[문제 링크](https://www.acmicpc.net/problem/4068)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 22, 정답: 20, 맞힌 사람: 19, 정답 비율: 90.476%

### 분류

그래프 이론, 그래프 탐색, 애드 혹, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>An undirected graph is called a caterpillar if it is connected, has no cycles, and there is a path in the graph where every node is either on this path or a neighbor of a node on the path. This path is called the spine of the caterpillar and the spine may not be unique. You are simply going to check graphs to see if they are caterpillars.</p>

<p>For example, the left graph below is not a caterpillar, but the right graph is. One possible spine is shown by dots.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4068.%E2%80%85Caterpillar/f21f728b.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4068.%E2%80%85Caterpillar/f21f728b.png" data-original-src="https://www.acmicpc.net/upload/images2/cater.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:141px; width:385px" /></p>

### 입력

<p>There will be multiple test cases. Each test case starts with a line containing n indicating the number of nodes, numbered 1 through n (a value of n = 0 indicates end-of-input). The next line will contain an integer e indicating the number of edges. Starting on the following line will be e pairs n<sub>1</sub> n<sub>2</sub> indicating an undirected edge between nodes n<sub>1</sub> and n<sub>2</sub>. This information may span multiple lines. You may assume that n &le; 100 and e &le; 300. Do not assume that the graphs in the test cases are connected or acyclic.</p>

### 출력

<p>For each test case generate one line of output. This line should either be</p>

<pre>
Graph g is a caterpillar.</pre>

<p>or</p>

<pre>
Graph g is not a caterpillar.</pre>

<p>as appropriate, where g is the number of the graph, starting at 1.</p>
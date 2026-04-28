# [Platinum V] Paths - 15866

[문제 링크](https://www.acmicpc.net/problem/15866)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 132, 정답: 98, 맞힌 사람: 94, 정답 비율: 79.661%

### 분류

다이나믹 프로그래밍, 그래프 이론, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>A graph is a mathematical structure which consists of a set of vertices, and a set of edges, each connecting two vertices. An example of a graph with 4 vertices and 3 edges is shown in the sample explanation below.</p>

<p>A path in the graph is defined as an ordered list of 2 or more vertices, such that there are edges between consecutive vertices in the list. In this task we are only interested in simple paths in which no vertex occurs more than once. Note that the list is ordered; for example, &ldquo;5-6-7&rdquo;, &ldquo;5-7-6&rdquo; and &ldquo;7-6-5&rdquo; are all treated as different paths.</p>

<p>In this task, each vertex in the graph has one of K colors. The task is to find the number of possible (simple) paths in which no two vertices have the same color.</p>

### 입력

<p>The first line of input contains three integers: N (the number of vertices), M (the number of edges), and K (the number of different colors).</p>

<p>The second line of input contains N integers between 1 and K &ndash; the colors of each vertex (starting with vertex 1 and ending with vertex N).</p>

<p>Each of the following M lines describes an edge and contains two integers a,b (1 &le; a, b &le; N,a &ne; b) &ndash; the two vertices connected by the edge. There will be at most one edge between any two vertices.</p>

### 출력

<p>Output one integer &ndash; the number of paths whose vertices all have distinct colors. This number will always be smaller than 10<sup>18</sup>.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15866.%E2%80%85Paths/db022c31.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15866/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 258px; height: 150px;" /></p>

<p>The graph in the first example is illustrated in the figure, where each vertex has been filled with white (color 1), gray (color 2) or black (color 3). There are 10 paths whose vertices all have distinct colors: &ldquo;1-2&rdquo;, &ldquo;2-1&rdquo;, &ldquo;2-3&rdquo;, &ldquo;3-2&rdquo;, &ldquo;2-4&rdquo;, &ldquo;4-2&rdquo;, &ldquo;1-2-4&rdquo;, &ldquo;4-2-1&rdquo;, &ldquo;3-2-4&rdquo; and &ldquo;4-2-3&rdquo;.</p>

<p>Note that &ldquo;1&rdquo; is not allowed as a path, because it is a single vertex, nor is &ldquo;1-2-3&rdquo;, because it contains two nodes of color 1.</p>
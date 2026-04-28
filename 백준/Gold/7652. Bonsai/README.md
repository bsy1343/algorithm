# [Gold II] Bonsai - 7652

[문제 링크](https://www.acmicpc.net/problem/7652)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 9, 맞힌 사람: 9, 정답 비율: 69.231%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>After being assaulted in the parking lot by Mr. Miyagi following the &ldquo;All Valley Karate Tournament&rdquo;, John Kreese has come to you for assistance. Help John in his quest for justice by chopping off all the leaves from Mr. Miyagi&rsquo;s bonsai tree!</p>

<p>You are given an undirected tree (i.e., a connected graph with no cycles), where each edge (i.e., branch) has a nonnegative weight (i.e., thickness). One vertex of the tree has been designated the root of the tree. The remaining vertices of the tree each have unique paths to the root; non-root vertices which are not the successors of any other vertex on a path to the root are known as leaves.</p>

<p>Determine the minimum weight set of edges that must be removed so that none of the leaves in the original tree are connected by some path to the root.</p>

### 입력

<p>The input file will contain multiple test cases. Each test case will begin with a line containing a pair of integers n (where 1 &le; n &le; 1000) and r (where r &isin; {1, . . . , n}) indicating the number of vertices in the tree and the index of the root vertex, respectively. The next n&minus;1 lines each contain three integers u<sub>i</sub> v<sub>i</sub> w<sub>i</sub> (where u<sub>i</sub>, v<sub>i</sub> &isin; {1, . . . , n} and 0 &le; w<sub>i</sub> &le; 1000) indicating that vertex u<sub>i</sub> is connected to vertex v<sub>i</sub> by an undirected edge with weight w<sub>i</sub>. The input file will not contain duplicate edges. The end-of-file is denoted by a single line containing &ldquo;0 0&rdquo;.</p>

### 출력

<p>For each input test case, print a single integer indicating the minimum total weight of edges that must be deleted in order to ensure that there exists no path from one of the original leaves to the root.</p>
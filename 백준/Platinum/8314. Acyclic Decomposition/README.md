# [Platinum V] Acyclic Decomposition - 8314

[문제 링크](https://www.acmicpc.net/problem/8314)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 293, 정답: 87, 맞힌 사람: 72, 정답 비율: 28.458%

### 분류

그래프 이론, 그래프 탐색, 애드 혹, 깊이 우선 탐색, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>Byteman is studying directed graphs. He especially likes graphs which do not contain cycles, since this is a class of graphs in which many problems can be solved easily and effectively. Now he is trying to find a method of representing any directed graph as a sum of acyclic graphs.</p>

<p>For a given directed graph he is trying to find a way to divide the set of its edges into a minimal number of subsets in such a way that the graphs constructed using the respective subsets of edges do not contain cycles. Could you write a program which solves Byteman&#39;s problem?</p>

### 입력

<p>The first line of the standard input contains two integers n and m (1 &le; n, m &le; 100,000), denoting the number of vertices and the number of edges in the graph, respectively. The vertices are numbered from 1 to n. Each of the following m lines contains a description of one edge of the graph as a pair of integers a<sub>i</sub>, b<sub>i</sub> (1 &le; a<sub>i</sub>, b<sub>i</sub> &le; n, a<sub>i</sub> &ne; b<sub>i</sub>). Such a pair denotes a directed edge of the graph from the vertex a<sub>i</sub> to the vertex b<sub>i</sub>. You may assume that the graph does not contain multiple edges.</p>

### 출력

<p>The first line of the standard output should contain a single integer k - the minimal number of acyclic graphs in any decomposition of the graph. Each of the following k lines should contain a description of one element of the decomposition, starting with an integer l<sub>i</sub> denoting the number of edges in the ith element. It should be followed by an increasing sequence of l<sub>i</sub> numbers of edges belonging to the ith element of the decomposition. The edges are numbered from 1 to m in the order in which they appear in the input. Each edge should be present in exactly one element of the decomposition.</p>

<p>If there are multiple correct solutions, your program should output any one of them.</p>

### 힌트

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8314.%E2%80%85Acyclic%E2%80%85Decomposition/c6a6f0c6.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8314.%E2%80%85Acyclic%E2%80%85Decomposition/c6a6f0c6.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8314/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:108px; width:251px" /></p>

<p>Illustration of the example from the task statement. The circles represent the vertices, while the lines and arcs (continuous and dashed) represent the edges of the graph. The numbers next to the circles are the numbers of the vertices, and the numbers next to the lines/arcs are the numbers of edges. This graph can be decomposed into two acyclic graphs: the edges of the first one are denoted by continuous lines/arcs and the edges of the second one - by dashed lines/arcs.</p>
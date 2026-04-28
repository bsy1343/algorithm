# [Platinum I] To be Connected, or not to be, that is the Question - 21932

[문제 링크](https://www.acmicpc.net/problem/21932)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 92, 정답: 64, 맞힌 사람: 58, 정답 비율: 76.316%

### 분류

자료 구조, 그리디 알고리즘, 분리 집합

### 문제 설명

<p>An undirected graph is given, each of its nodes associated with a positive integer value. Given a <em>threshold</em>, nodes of the graph are divided into two groups: one consisting of the nodes with values less than or equal to the threshold, and the other consisting of the rest of the nodes. Now, consider a subgraph of the original graph obtained by removing all the edges connecting two nodes belonging to different groups. When both of the node groups are non-empty, the resultant subgraph is disconnected, whether or not the given graph is connected.</p>

<p>Then a number of new edges are added to the subgraph to make it connected, but these edges must connect nodes in different groups, and each node can be incident with at most one new edge. The threshold is called feasible if neither of the groups is empty and the subgraph can be made connected by adding some new edges.</p>

<p>Your task is to find the minimum feasible threshold.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<pre>
n m
l<sub>1</sub> . . . l<sub>n</sub>
x<sub>1</sub> y<sub>1</sub>
.
.
.
x<sub>m</sub> y<sub>m</sub></pre>

<p>The first line contains two integers n (2 &le; n &le; 10<sup>5</sup>) and m (0 &le; m &le; min(10<sup>5</sup>, n(n&minus;1)/2)), the numbers of the nodes and the edges, respectively, of the graph. Nodes are numbered 1 through n. The second line contains n integers l<sub>i</sub> (1 &le; l<sub>i</sub> &le; 10<sup>9</sup>), meaning that the value associated with the node i is l<sub>i</sub>. Each of the following m lines contains two integers x<sub>j</sub> and y<sub>j</sub> (1 &le; x<sub>j</sub> &lt; y<sub>j</sub> &le; n), meaning that an edge connects the nodes x<sub>j</sub> and y<sub>j</sub>. At most one edge exists between any two nodes.</p>

### 출력

<p>Output the minimum feasible threshold value. Output -1 if no threshold values are feasible.</p>
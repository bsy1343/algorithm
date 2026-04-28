# [Platinum IV] Graph Coloring - 6441

[문제 링크](https://www.acmicpc.net/problem/6441)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 90, 정답: 27, 맞힌 사람: 15, 정답 비율: 38.462%

### 분류

그래프 이론, 브루트포스 알고리즘, 휴리스틱

### 문제 설명

<p>You are to write a program that tries to find an optimal coloring for a given graph. Colors are applied to the nodes of the graph and the only available colors are black and white. The coloring of the graph is called optimal if a maximum of nodes is black. The coloring is restricted by the rule that no two connected nodes may be black.&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6441.%E2%80%85Graph%E2%80%85Coloring/1ec504d7.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/6441.%E2%80%85Graph%E2%80%85Coloring/1ec504d7.gif" data-original-src="https://www.acmicpc.net/upload/images2/Coloring.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:145px; width:217px" /></p>

<p>Figure 1: An optimal graph with three black nodes</p>

### 입력

<p>The graph is given as a set of nodes denoted by numbers 1...n, n &lt;= 100, and a set of undirected edges denoted by pairs of node numbers (n1, n2), n1 != n2. The input file contains m graphs. The number m is given on the first line. The first line of each graph contains n and k, the number of nodes and the number of edges, respectively. The following k lines contain the edges given by a pair of node numbers, which are separated by a space.</p>

### 출력

<p>The output should consists of 2m lines, two lines for each graph found in the input file. The first line of should contain the maximum number of nodes that can be colored black in the graph. The second line should contain one possible optimal coloring. It is given by the list of black nodes, separated by a blank.</p>
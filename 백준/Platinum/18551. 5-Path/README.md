# [Platinum II] 5-Path - 18551

[문제 링크](https://www.acmicpc.net/problem/18551)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 61, 정답: 13, 맞힌 사람: 10, 정답 비율: 21.739%

### 분류

이분 탐색, 그래프 이론, 중간에서 만나기

### 문제 설명

<p>You are given a list of edges of an undirected graph. There are two special nodes in the graph: a and b. Find the minimum size of a prefix of this list such that a graph represented by this prefix includes a simple path of 5 edges between nodes a and b.</p>

### 입력

<p>The first line of input contains two integers n and m: the number of nodes and the number of edges in the graph, respectively.</p>

<p>Each of the following m lines contains two integers v<sub>i</sub> and u<sub>i</sub> which describe two endpoints of an edge (1 &le; v<sub>i</sub>, u<sub>i</sub> &le; n).</p>

<p>The last line contains two integers a and b: the numbers of special nodes (a 6= b, 1 &le; a, b &le; n).</p>

<p>The graph has no multiple edges and no self-loops.</p>

### 출력

<p>If there is a simple path of 5 edges in the graph represented by the given edge list, output the answer to the problem. Otherwise, output &minus;1.</p>
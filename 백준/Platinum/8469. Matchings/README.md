# [Platinum I] Matchings - 8469

[문제 링크](https://www.acmicpc.net/problem/8469)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 144, 정답: 25, 맞힌 사람: 19, 정답 비율: 24.051%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>In an undirected graph, a matching is a subset of the edges of the graph such that each vertex of the graph is adjacent to at most one of the selected edges. The maximum matching is a matching of maximum possible cardinality.</p>

<p>You are given a tree with n nodes. Your task is to find the size of the maximum matching and the number of maximum matchings (the latter one modulo ).</p>

### 입력

<p>The first line of input contains an integer n that denotes the number of nodes of the tree (1 &le; n &le; 1 500 000). The nodes are numbered 1 through n. The following n-1 lines contain a description of the tree edges. Each of the lines contains two integers a and b that represent an edge connecting the nodes a and b (1 &le; a, b &le; n). The last line of input contains an integer m (1 &le; m &le; 10<sup>9</sup>).</p>

### 출력

<p>The first line of output should contain the cardinality of the maximum matching in the tree. The second line should contain the number of maximum matchings modulo m.</p>
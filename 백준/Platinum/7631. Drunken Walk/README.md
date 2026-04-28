# [Platinum I] Drunken Walk - 7631

[문제 링크](https://www.acmicpc.net/problem/7631)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 32, 정답: 12, 맞힌 사람: 12, 정답 비율: 42.857%

### 분류

수학, 다이나믹 프로그래밍, 그래프 이론, 확률론, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>After having a bit too much to drink in the evening, you find yourself going on a long walk on a directed graph&mdash;but not too long, as there are no cycles. You start at vertex 0, and whenever you are at a vertex, you will randomly leave the vertex along one of its outgoing edges with probability proportional to the weight of the edge.</p>

<p>You continue walking until you reach a vertex that has no edges leaving it, after which you fall asleep. The length of your walk is the number of edges you traverse. Moreover, before leaving vertex 0, you may choose one edge from anywhere in the graph that you do not like and ignore it during your walk (or you may choose to not ignore any of them). Determine the longest possible expected length of your walk.</p>

### 입력

<p>The input consists of multiple test cases. Each test case begins with a line containing two integers N, 2 &le; N &le; 10,000, and M, 1 &le; M &le; 100,000, the number of vertices and edges in the graph, respectively. The next M lines each contain three integers u, v, and w (1 &le; w &le; 1,000), indicating that there is a directed edge from vertex u to vertex v (numbered from 0 to N &minus; 1) with weight w. The input terminates with a line with N = M = 0.</p>

### 출력

<p>For each test case, print out a single line that contains the longest possible expected length of your walk. Your answer will be considered correct if it is within 10<sup>&minus;6</sup> absolute or relative precision. In the first sample case, ignoring the edge from vertex 0 to vertex 3 gives the maximum possible expected length of 2. (Without ignoring it, the expected length is 1.5.)</p>
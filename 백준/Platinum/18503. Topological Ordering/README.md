# [Platinum II] Topological Ordering - 18503

[문제 링크](https://www.acmicpc.net/problem/18503)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 19, 정답: 16, 맞힌 사람: 14, 정답 비율: 87.500%

### 분류

비트마스킹, 다이나믹 프로그래밍

### 문제 설명

<p>The topological ordering of a directed acyclic graph is a permutation of its vertices p<sub>1</sub>, . . . , p<sub>n</sub> such that for each arc, its source comes before its target in the permutation.</p>

<p>You are given a directed acyclic graph. For each pair of vertices (u, v) count the number of topological orderings such that vertex u comes before vertex v.</p>

### 입력

<p>The first line contains a single integer t, the number of test cases. Descriptions of t test cases follow.</p>

<p>In the first line of each test case there are two integers n and m: the number of vertices and arcs (1 &le; n &le; 20, 0 &le; m &le; n &middot; (n &minus; 1)/2).</p>

<p>Each of the next m lines contains two integers u<sub>i</sub> and v<sub>i</sub>, denoting the arc from vertex ui to vertex v<sub>i</sub> (1 &le; u<sub>i</sub> &lt; v<sub>i</sub> &le; n).</p>

<p>There are at most 100 test cases in the input. In at most 5 test cases n &gt; 10.</p>

### 출력

<p>For each test case, print n lines of n numbers each. The j-th number in the i-th line should equal the number of topological orderings where vertex j is before vertex i. In particular, it should equal 0 if i = j.</p>
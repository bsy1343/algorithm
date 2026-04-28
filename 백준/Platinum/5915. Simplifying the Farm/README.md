# [Platinum III] Simplifying the Farm - 5915

[문제 링크](https://www.acmicpc.net/problem/5915)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 187, 정답: 57, 맞힌 사람: 51, 정답 비율: 32.278%

### 분류

그래프 이론, 브루트포스 알고리즘, 최소 스패닝 트리

### 문제 설명

<p>Farmer John has been taking an evening algorithms course at his local university, and he has just learned about minimum spanning trees.  However, Farmer John now realizes that the design of his farm is not as efficient as it could be, and he wants to simplify the layout of his farm.</p><p>The farm is currently arranged like a graph, with vertices representing fields and edges representing pathways between these fields, each having an associated length.  Farmer John notes that for each distinct length, at most three pathways on his farm share this length.  FJ would like to remove some of the pathways on his farm so that it becomes a tree -- that is, so that there is one unique route between any pair of fields.  Moreover, Farmer John would like this to be a minimum spanning tree -- a tree having the smallest possible sum of edge lengths.</p><p>Help Farmer John compute not only the sum of edge lengths in a minimum spanning tree derived from his farm graph, but also the number of different possible minimum spanning trees he can create.</p>

### 입력

<ul><li>Line 1: Two integers N and M (1 &lt;= N &lt;= 40,000; 1 &lt;= M &lt;= 100,000), representing  the number of vertices and edges in the farm graph, respectively.  Vertices are numbered as 1..N.</li><li>Lines 2..M+1: Three integers a_i, b_i and n_i (1 &lt;= a_i, b_i &lt;= N; 1 &lt;= n_i &lt;= 1,000,000)  representing an edge from vertex a_i to b_i with length n_i.  No edge length n_i will occur more than three times.</li></ul>

### 출력

<ul><li>Line 1: Two integers representing the length of the minimal spanning tree and the number of minimal spanning trees (mod 1,000,000,007).</li></ul>

### 힌트

<h4>Output Details</h4><p>Picking both edges with length 1 and any edge with length 2 yields a minimum spanning tree of length 4.</p><p></p>
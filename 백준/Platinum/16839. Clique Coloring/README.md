# [Platinum IV] Clique Coloring - 16839

[문제 링크](https://www.acmicpc.net/problem/16839)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 63, 정답: 20, 맞힌 사람: 16, 정답 비율: 51.613%

### 분류

구현, 그리디 알고리즘, 많은 조건 분기, 백트래킹

### 문제 설명

<p>There is a complete graph with m vertices. Initially, the edges of the graph are not colored. Snuke performed the following operation for each i(1 &le; i &le; n): Choose a<sub>i</sub> vertices from the graph and paint all edges that connect two of the chosen points with color i. It turned out that no edges were painted more than once. Compute the minimal possible value of m.</p>

### 입력

<p>First line of the input contains one integer n (1 &le; n &le; 5). Then n lines follow, i-th of these lines contains one integer a<sub>i</sub> (2 &le; a<sub>i</sub> &le; 10<sup>9</sup>).</p>

### 출력

<p>Print the minimal possible value of m.</p>

### 힌트

<p>Number the vertices of the graph: 1, 2, 3, 4, 5. For example, you can color the graph in the following way:</p>

<ul>
	<li>Choose three vertices 1, 2, 3 and color edges between them with color 1.</li>
	<li>Choose three vertices 1, 4, 5 and color edges between them with color 2.</li>
</ul>
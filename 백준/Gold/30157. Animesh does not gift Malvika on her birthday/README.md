# [Gold II] Animesh does not gift Malvika on her birthday - 30157

[문제 링크](https://www.acmicpc.net/problem/30157)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 2, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

수학, 그래프 이론, 조합론

### 문제 설명

<p>Malvika was sad because Animesh, the miser, did not buy her even a chocolate bar on her birthday. Animesh, feeling sorry about his behavior, repented and asked Malvika how he could make up for this catastrophic mistake. Enraged as she was, Malvika gave him an empty graph H of n vertices and asked him to add edges into it and convert the graph into a graph that she likes.</p>

<p>Malvika always keeps a graph G with n vertices and m edges with her. Malvika likes a graph H if, and only if, she can find a permutation P of 1, 2, &hellip; , N such that there&#39;s an edge between vertices u and v in H if and only if there&#39;s an edge between vertices P[u] and P[v] in G.</p>

<p>Animesh thought for days and days about how he could add edges into the empty graph H so that he can get a graph that Malvika likes. After putting in a lot of effort, he found such a graph and said that this is the graph you desired.</p>

<p>Malvika was still really angry with him and asked little Animesh to come up as many graphs as possible, such that Malvika likes them. Given his recent track record, you know this is going to take him at least a few years to solve by himself. Can you help Animesh find out how many such graphs he has to come up with? Please output your answer modulo 10<sup>9</sup> + 7.</p>

<p>Two ways of adding edges A, B are considered different if there is a an edge (u, v) which is present in A but not in B.</p>

<p>You are given the adjacency matrix of the graph G as input. The graph has a special property &mdash; each row and column of the graph has atleast n - 3 1&#39;s.</p>

<p>Note that adjacency matrix of a graph G containing n vertices is a matrix A of size n * n. If there is an edge between vertex i and j, then A(i, j) = 1, otherwise A(i, j) = 0. In our case, as the graph is undirected, the matrix will be a symmetric matrix. Also, the entries on the diagonal will be all zeros.</p>

### 입력

<p>The first line of input contains a single integer T denoting the number of test cases.</p>

<p>For each test case:</p>

<ul>
	<li>First line contains an integer n denoting the number of vertices in graph G.</li>
	<li>Each of the next n lines contains n characters, each of them will be either &#39;0&#39; or &#39;1&#39;. The j th character in the i th line denotes A[i][j], where A is the adjacency matrix.</li>
</ul>

### 출력

<p>For each test case, output your answer in a separate line.</p>

### 제한

<ul>
	<li>1 &le; T</li>
	<li>n &le; 50</li>
</ul>

### 힌트

<p>In the first example, the graph G has an edge between 1 and 2. Animesh has to add only one edge in the graph H between vertices 1 and 2 to please her. This is the only graph he has to come up with.</p>

<p>In the second example, the graph G has edges {1, 3} and {2, 3}. Animesh can come up with the following graphs {{1, 3}, {2, 3}}, {{2, 1}, {3, 1}}, {{1, 2}, {3, 2}}. Malvika likes all of these graphs. In this representation, {{1, 3}, {2, 3}} means that a graph has 3 vertices and two edges &mdash; between 1 and 3, and between 2 and 3.</p>
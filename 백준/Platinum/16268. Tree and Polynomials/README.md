# [Platinum V] Tree and Polynomials - 16268

[문제 링크](https://www.acmicpc.net/problem/16268)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 11, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

그래프 이론, 그래프 탐색, 트리, 누적 합, 깊이 우선 탐색

### 문제 설명

<p>Nick is a freshman. He studies trees in his Algorithms class. He studies polynomials in his Algebra class. And he likes to create and combine. He has recently come up with a problem he cannot solve. Help him!</p>

<p>You are given a rooted tree with n vertices, numbered from 1 to n. There is a value in each vertex, initially all values are equal to 0. For a vertex v let us denote as d[v] the depth of the vertex v &mdash; the number of vertices on a path from the root of the tree to v, in particular the root itself has depth equal to 1.</p>

<p>You are also given k. You must process queries of two types.</p>

<ol>
	<li>You are given a vertex v and a polynomial q(t)&thinsp;=&thinsp;q<sub>0</sub>&thinsp;+&thinsp;q<sub>1</sub>t&thinsp;+&thinsp;q<sub>2</sub>t<sup>2</sup>&thinsp;+&thinsp;...&thinsp;+&thinsp;q<sub>k</sub>t<sup>k</sup>. For each vertex u in a subtree of the vertex v you must add q(d[u]) to the value in that vertex.</li>
	<li>You are given a vertex v and a polynomial q(t)&thinsp;=&thinsp;q<sub>0</sub>&thinsp;+&thinsp;q<sub>1</sub>t&thinsp;+&thinsp;q<sub>2</sub>t<sup>2</sup>&thinsp;+&thinsp;...&thinsp;+&thinsp;q<sub>k</sub>t<sup>k</sup>. For each vertex u on a path from the root of the tree to v, inclusive, add q(d[u]) to the value in that vertex.</li>
</ol>

<p>All arithmetic operations are performed modulo 10<sup>9</sup>&thinsp;+&thinsp;7.</p>

<p>Help Nick to find the values in all vertices after all operations.</p>

### 입력

<p>Input data contains multiple test cases. The first line of input data contains integer t &mdash; the number of test cases (1&thinsp;&le;&thinsp;t&thinsp;&le;&thinsp;10<sup>5</sup>).</p>

<p>The description of test cases follow. Each description starts with two integers: n &mdash; the number of vertices in a tree, and k &mdash; the maximal degree of the polynomials (1&thinsp;&le;&thinsp;n&thinsp;&le;&thinsp;10<sup>5</sup>, 1&thinsp;&le;&thinsp;k&thinsp;&le;&thinsp;20).</p>

<p>The following n integers p<sub>1</sub>,&thinsp;p<sub>2</sub>,&thinsp;...,&thinsp;p<sub>n</sub> describe the tree, p<sub>i</sub> is the number of a parent of the vertex i, or 0, if i is the root. It is guaranteed, that p<sub>i</sub> describe the correct rooted tree.</p>

<p>The integer q follows &mdash; the number of queries (1&thinsp;&le;&thinsp;q&thinsp;&le;&thinsp;10<sup>5</sup>). The following q lines contain queries, each query is specified by an integer t, equal to 1 or 2 &mdash; the type of the query, followed by v &mdash; the vertex in the query, and then k&thinsp;+&thinsp;1 integers q<sub>0</sub>,&thinsp;q<sub>1</sub>,&thinsp;...,&thinsp;q<sub>k</sub> &mdash; coefficients of the polynomial in the query (0&thinsp;&le;&thinsp;q<sub>i</sub>&thinsp;&lt;&thinsp;10<sup>9</sup>&thinsp;+&thinsp;7).</p>

<p>It is guaranteed that the sum of values of n in all test cases of one input data doesn&#39;t exceed 10<sup>5</sup>. Similarly, the sum of values of q in all test cases of one input data doesn&#39;t exceed 10<sup>5</sup>.</p>

### 출력

<p>For each test case output n integers, for each vertex print the value in this vertex after all queries. Remember to perform all operations modulo 10<sup>9</sup>&thinsp;+&thinsp;7.</p>
# [Gold I] The Tree - 27185

[문제 링크](https://www.acmicpc.net/problem/27185)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 112, 정답: 25, 맞힌 사람: 22, 정답 비율: 28.571%

### 분류

자료 구조, 트리, 트라이

### 문제 설명

<p>You are given an infinite binary tree. The tree has the root and infinitely many vertices, each vertex has left son and right son, each vertex except the root has a parent.</p>

<p>Every vertex can be painted in one of $c$ colors or be colorless. Initially, all vertices are colorless.</p>

<p>You need to process two types of requests:</p>

<ol>
	<li><code>color</code>($u$, $x$) You are given a vertex $u$, paint vertex $u$ with color $x$, and then call <code>color</code>($L$, $(x + 1) \bmod c$) for its left son $L$ and <code>color</code>($R$, $(x - 1 + c) \bmod c$) for its right son $R$. Note that this operation repaints the entire (infinite) set of vertices in the subtree of the vertex $u$. Here $\bmod$ is the operation of taking a division remainder. If the vertex has already been painted, then its color changes to the new one.</li>
	<li>Given a vertex, output its current color.</li>
</ol>

### 입력

<p>The first line contains two integers $q$, $c$ --- the number of queries and colors, respectively ($1 \leq q \leq 5 \cdot 10^5$, $1 \leq c \leq 10^9$). This is followed by $q$ queries, each starts with an integer $t_i$ --- the type of the $i$-th query.</p>

<p>If $t_i$ = 1, then an integer $x$ ($0 \leq x \leq c - 1$) is given in the line, the color that the vertex of the query $u$ should be colored. The next line describes the path to the vertex $u$ in the form of a non-empty string $s_i$ consisting of the characters &#39;<code>L</code>&#39; and &#39;<code>R</code>&#39;. This string specifies the path from the root of the tree to the vertex $u$, where &#39;<code>L</code>&#39; denotes going to the left son, and &#39;<code>R</code>&#39;  --- going to the right son.</p>

<p>If $t_i$ = 2, then the next line specifies the path to the vertex whose color should be output, described similarly to the previous query.</p>

<p>It is guaranteed that the sum of the lengths of the paths to all the vertices of the queries does not exceed $5\cdot 10^5$.</p>

### 출력

<p>For each request of the second type print the color of the corresponding vertex on a separate line. If the vertex is colorless, print $-1$.</p>
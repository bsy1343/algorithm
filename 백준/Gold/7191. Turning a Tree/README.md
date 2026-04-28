# [Gold IV] Turning a Tree - 7191

[문제 링크](https://www.acmicpc.net/problem/7191)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 14, 맞힌 사람: 9, 정답 비율: 45.000%

### 분류

구현, 그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색

### 문제 설명

<p>You are given a tree with nodes numbered $1\dots N$, where node $1$ is the root of the tree and for each node the list of its child nodes is known.<sup>1</sup></p>

<p>Find the tree we would get by lifting the leaf $K$ of the original tree to be the new root, but leaving all edges intact, including the relative ordering of the edges at each node.</p>

<p>For example, starting from the tree shown on the left in the figure below and making the leaf $3$ the new root, we would get the tree shown in the middle in the figure. The three shown on the right in the figure would not be correct answer, because the neighbors for the node $1$ (listed counter-clockwise) are $2$, $3$, $4$ in the original tree, but $2$, $4$, $3$ in this tree.</p>

<pre>
    1      3       3
   /|\     |       |
  2 3 4    1       1
          / \     / \
         4   2   2   4
</pre>

<hr />
<p><sup>1</sup>See also <a href="https://en.wikipedia.org/wiki/Tree_(data_structure)">https://en.wikipedia.org/wiki/Tree_(data_structure)</a></p>

### 입력

<p>The first line of input contains the number of nodes $N$ ($1 &le; N &le; 10\,000$) and the index $K$ of the leaf to become the new root ($1 &le; K &le; N$). The following $N$ lines describe the structure of the original tree. The $(i+ 1)$-th line first contains $m_i$, the number of child nodes of the node $i$, and then the indices of the $m_i$ child nodes, listed from left to right.</p>

### 출력

<p>The output should contain exactly $N$ lines: the structure of the new tree, in the format used in the input file.</p>

### 힌트

<p>Explanation of the output lines:</p>

<ol>
	<li>Node $1$ has $2$ children, nodes $4$ and $2$ (in this order).</li>
	<li>Node $2$ has no children.</li>
	<li>Node $3$ has $1$ child, node $1$.</li>
	<li>Node $4$ has no children.</li>
</ol>
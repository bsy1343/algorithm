# [Platinum IV] Similarity of Subtrees - 15533

[문제 링크](https://www.acmicpc.net/problem/15533)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 100, 정답: 56, 맞힌 사람: 46, 정답 비율: 59.740%

### 분류

해싱

### 문제 설명

<p>Define the depth of a node in a rooted tree by applying the following rules recursively:</p>

<ul>
	<li>The depth of a root node is 0.</li>
	<li>The depths of child nodes whose parents are with depth d are d + 1.</li>
</ul>

<p>Let S(T, d) be the number of nodes of T with depth d. Two rooted trees T and T &prime; are similar if and only if S(T, d) equals S(T &prime; , d) for all non-negative integer d.</p>

<p>You are given a rooted tree T with N nodes. The nodes of T are numbered from 1 to N. Node 1 is the root node of T. Let T<sub>i</sub> be the rooted subtree of T whose root is node i. Your task is to write a program which calculates the number of pairs (i, j) such that T<sub>i</sub> and T<sub>j</sub> are similar and i &lt; j.</p>

### 입력

<p>The input consists of a single test case.</p>

<pre>
N
a<sub>1</sub> b<sub>1</sub>
&hellip;
a<sub>N&minus;1</sub> b<sub>N&minus;1</sub></pre>

<p>The first line contains an integer N (1 &le; N &le; 100,000), which is the number of nodes in a tree. The following N &minus; 1 lines give information of branches: the i-th line of them contains a<sub>i</sub> and b<sub>i</sub>, which indicates that a node a<sub>i</sub> is a parent of a node b<sub>i</sub>. (1 &le; a<sub>i</sub>, b<sub>i</sub> &le; N, a<sub>i</sub> &ne; b<sub>i</sub>) The root node is numbered by 1. It is guaranteed that a given graph is a rooted tree, i.e. there is exactly one parent for each node except the node 1, and the graph is connected.</p>

### 출력

<p>Print the number of the pairs (x, y) of the nodes such that the subtree with the root x and the subtree with the root y are similar and x &lt; y.</p>
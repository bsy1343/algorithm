# [Gold II] Full Binary Tree (Large) - 12257

[문제 링크](https://www.acmicpc.net/problem/12257)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 51, 정답: 30, 맞힌 사람: 28, 정답 비율: 65.116%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>A tree is a connected graph with no cycles.</p>

<p>A rooted tree is a tree in which one special vertex is called the root. If there is an edge between <strong>X</strong> and <strong>Y</strong> in a rooted tree, we say that <strong>Y</strong> is a child of <strong>X</strong> if <strong>X</strong> is closer to the root than <strong>Y</strong> (in other words, the shortest path from the root to <strong>X</strong> is shorter than the shortest path from the root to <strong>Y</strong>).</p>

<p>A full binary tree is a rooted tree where every node has either exactly 2 children or 0 children.</p>

<p>You are given a tree <strong>G</strong> with <strong>N</strong> nodes (numbered from <strong>1</strong> to <strong>N</strong>). You are allowed to delete some of the nodes. When a node is deleted, the edges connected to the deleted node are also deleted. Your task is to delete as few nodes as possible so that the remaining nodes form a full binary tree for some choice of the root from the remaining nodes.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. The first line of each test case contains a single integer <strong>N</strong>, the number of nodes in the tree. The following <strong>N</strong>-1 lines each one will contain two space-separated integers: <strong>X</strong><strong><sub>i</sub></strong> <strong>Y</strong><strong><sub>i</sub></strong>, indicating that <strong>G</strong> contains an undirected edge between <strong>X</strong><strong><sub>i</sub></strong> and <strong>Y</strong><strong><sub>i</sub></strong>.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li>1 &le; <strong>X</strong><strong><sub>i</sub></strong>, <strong>Y</strong><strong><sub>i</sub></strong> &le; <strong>N</strong></li>
	<li>Each test case will form a valid connected tree.</li>
	<li><span style="line-height:1.6em">2 &le; </span><strong style="line-height:1.6em">N</strong><span style="line-height:1.6em"> &le; 1000.</span></li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>x</strong>: <strong>y</strong>&quot;, where <strong>x</strong> is the test case number (starting from 1) and <strong>y</strong> is the minimum number of nodes to delete from <strong>G</strong> to make a full binary tree.</p>

### 힌트

<p>In the first case, <strong>G</strong> is already a full binary tree (if we consider node 1 as the root), so we don&#39;t need to do anything.</p>

<p>In the second case, we may delete nodes 3 and 7; then 2 can be the root of a full binary tree.</p>

<p>In the third case, we may delete node 1; then 3 will become the root of a full binary tree (we could also have deleted node 4; then we could have made 2 the root).</p>
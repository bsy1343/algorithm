# [Platinum IV] Stablo - 32973

[문제 링크](https://www.acmicpc.net/problem/32973)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 43, 정답: 29, 맞힌 사람: 23, 정답 비율: 65.714%

### 분류

다이나믹 프로그래밍, 자료 구조, 트리, 트리에서의 다이나믹 프로그래밍, 희소 배열

### 문제 설명

<p>Toni decided to create a task for HONI (and COCI). Since he doesn’t like kids, he decided to make the task as difficult as possible. He came up with a complex problem involving a tree that constantly changes, solely to make contestants suffer as much as possible.</p>

<p>You are given a weightless tree with $N$ nodes, where the root of the tree is node $1$. Each node has an associated value $v[i]$. The structure of the tree is defined using an array $p[i]$, where for each $i$ from $1$ to $N - 1$, $p[i]$ denotes the parent of $i + 1$.</p>

<p>A function $f(y)$ is defined for a node $y$ in the tree as:</p>

<p>$$f(y) = \sum_{x \in S_y}{d(x, y) \cdot v[x]}$$</p>

<p>where $d(x, y)$ denotes the distance between nodes $x$ and $y$, while $S_y$ contains all nodes for which $y$ is an ancestor.</p>

<p>You are given $Q$ queries with two nodes $x$ and $y$. For each query, the following transformation must be simulated in the tree, and the function $f(y)$ needs to be calculated:</p>

<ol>
	<li>Attach all nodes for which $x$ is the parent to the parent of $x$</li>
	<li>Remove $x$ from the tree</li>
	<li>Insert node $x$ back into the tree, between $y$ and the descendant of $y$ from whose subtree $x$ was removed.</li>
</ol>

<p>If $y$ is the parent of $x$, the tree remains unchanged. It is always true that $x$ is in the subtree of $y$. For each query, the value of $f(y)$ must be calculated after the tree is temporarily modified according to the procedure described above. The tree modifications are not permanent, i.e. after each query, the tree returns to its original state.</p>

### 입력

<p>The first line contains two integers $N$ and $Q$ ($1 ≤ N, Q ≤ 5 \cdot 10^5$), the number of nodes in the tree and the number of queries, respectively.</p>

<p>The second line contains $N$ integers $v[i]$ ($1 ≤ v[i] ≤ 10^6$), representing the value of each node.</p>

<p>The third line contains $N - 1$ integers $p[i]$ ($1 ≤ p[i] ≤ i$), where $p[i]$ denotes the parent of node $i + 1$.</p>

<p>Each of the next $Q$ lines contains two integers $x$ and $y$ ($1 ≤ x, y ≤ N$), denoting the nodes involved in the operation described above.</p>

### 출력

<p>In the next $Q$ lines output the value of the function $f(y)$ on the modified tree.</p>

### 힌트

<p>Clarification of the first example: After applying the operation on a tree, node $3$ is at a distance of $1$ from node $1$, and node $2$ is at a distance of $2$ from node $1$. The result is $3 + 2 \cdot 2 = 7$.</p>
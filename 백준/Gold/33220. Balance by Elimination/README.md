# [Gold III] Balance by Elimination - 33220

[문제 링크](https://www.acmicpc.net/problem/33220)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 11, 정답: 6, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>You are given a binary tree with $n$ nodes. The nodes are conveniently numbered from $1$ to $n$. Node $1$ is the root of the binary tree.</p>

<p>The height of the subtree rooted at node $u$ is: $$h_u = 1 + \max \left(h_\textrm{left child}, h_\textrm{right child}\right)$$ If a left or right child doesn't exist, its subtree height is defined to be 0. In particular, if a node is a leaf, it has a height of $1$.</p>

<p>You want the tree to become height-balanced. A node is height-balanced if: $$\left|h_\textrm{left child} - h_\textrm{right child}\right| &lt; 2$$ A binary tree is height-balanced if all its nodes are height-balanced.</p>

<p>Find a way to remove at most 1 leaf from the tree, such that the binary tree becomes height-balanced, or output that this is impossible. For example, the tree of the second sample input (visualized in Figure B.1) becomes balanced when removing node $5$.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing a single integer $n$ ($1 \leq n \leq 10^5$), the number of nodes in the binary tree.</li>
	<li>Then $n$ lines follow, numbered from $1$ to $n$. The $i$th line contains two integers, the labels of the left and right child of node $i$. </li>
</ul>

<p>If a left child or right child does not exist, the corresponding integer is equal to $0$. It is guaranteed that the input graph is a binary tree.</p>

### 출력

<p>Output a single integer:</p>

<ul>
	<li>If the tree is already balanced, output "<code>balanced</code>".</li>
	<li>If it's impossible to make the tree height-balanced, output "<code>impossible</code>".</li>
	<li>Else, output the number of the leaf you want to remove. </li>
</ul>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33220.%E2%80%85Balance%E2%80%85by%E2%80%85Elimination/287bb682.png" data-original-src="https://boja.mercury.kr/assets/problem/33220-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 225px;"></p>

<p style="text-align: center;">Figure B.1: Visualization of Sample Input 2.</p>
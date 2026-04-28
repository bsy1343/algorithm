# [Platinum II] Ball Machine - 6288

[문제 링크](https://www.acmicpc.net/problem/6288)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 56, 정답: 31, 맞힌 사람: 21, 정답 비율: 56.757%

### 분류

자료 구조, 오일러 경로 테크닉, 우선순위 큐, 정렬, 희소 배열, 트리

### 문제 설명

<p>We have a &ldquo;ball machine&rdquo; that can be visualized as a rooted tree. The nodes of the tree are numbered from 1 to N. Each node is either empty or contains one ball. Initially, all nodes are empty. While running, the machine can perform operations of two different types:</p>

<ol>
	<li>Add k balls to the ball machine: Balls are put one by one into the root node. As long as a ball has an empty node directly beneath it, it will roll down. If there are multiple empty child nodes, the ball will choose the one which has the node with the smallest number in its subtree. So if the ball rolls down multiple levels, it makes a choice at each level. For example: If we add two balls to the machine in the picture below, they will go to nodes 1 and 3: The first ball rolls from node 4 to node 3 because node 3 is empty and it contains node 1 in its subtree (which consists of nodes 3 and 1); it further rolls from node 3 to node 1. The second ball rolls from node 4 to node 3 as well and stops there.</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6288.%E2%80%85Ball%E2%80%85Machine/664e9373.png" data-original-src="https://upload.acmicpc.net/31b3851e-e578-459d-8153-86b8fc3eac83/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 198px; height: 104px;" /></p>

<ol start="2">
	<li>Remove a ball from a specified node: This node becomes empty and balls from above (if there are any) roll down. Whenever a parent of an empty node contains a ball, this ball will roll down. If we remove balls from nodes 5, 7 and 8 (in this order) from the machine in the picture below, nodes 1, 2 and 3 will become empty.</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6288.%E2%80%85Ball%E2%80%85Machine/1ab9433d.png" data-original-src="https://upload.acmicpc.net/9bd67499-1723-4c99-9f8b-db6324f67c4a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 219px; height: 164px;" /></p>

### 입력

<p>The first line contains two integers N and Q &ndash; the number of tree nodes and the number of operations. The next N lines describe the ball machine. Each of these lines contains one integer, the number of a node: the i-th of these lines contains the number of node i&rsquo;s parent node, or 0 if node i is the tree root. Each of the next Q lines contains two integers and describes an operation to be performed. An operation of type 1 is denoted by 1 k where k is the number of balls to be added to the machine. An operation of type 2 is denoted by 2 x where x is the number of the node from which a ball is to be removed. It is guaranteed that all performed operations are correct: Operations will not require to add more balls than there are empty nodes in the ball machine or to remove a ball from an empty node.</p>

### 출력

<p>For each operation of type 1, output the number of the node where the last inserted ball ended up. For each operation of type 2 output the number of balls that rolled down after removing the ball from the specified node.</p>

### 제한

<ul>
	<li>N, Q &le; 100 000.</li>
</ul>
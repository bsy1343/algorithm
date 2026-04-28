# [Platinum III] Tree Pruning - 6805

[문제 링크](https://www.acmicpc.net/problem/6805)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>We are given a rooted tree with N nodes in which each node has at most two children. Each node may be black or white. We define a &ldquo;prune&rdquo; as the deletion of a node and the subtree rooted at that node from the tree. Given an integer D, find the minimum number of &ldquo;prunes&rdquo; required to obtain a tree in which the number of white nodes minus the number of black nodes is exactly D, or determine that it is impossible to do so.</p>

### 입력

<p>The first line of input will contain two integers N (1 &le; N &le; 300) and D (&minus;N &le; D &le; N), representing the number of nodes in the tree and the value of the required difference, respectively. The next N blocks of input each contain the description of a node. The first line of each block contains three integers: the id of the node (a unique integer between 0 and N &minus; 1), the colour of the node (1 for a white node, 0 for a black node) and an integer C that represents the number of children of the node. C lines follow, each one containing an integer that represents the id of one child. The root of the tree is the node with id 0.</p>

### 출력

<p>On one line, output the minimum number of &ldquo;prunes&rdquo;, as mentioned in the problem description. If it is impossible to obtain the required difference D, output &minus;1.</p>
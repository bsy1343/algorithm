# [Gold I] Ornaments on a Tree - 34272

[문제 링크](https://www.acmicpc.net/problem/34272)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 23, 정답: 18, 맞힌 사람: 17, 정답 비율: 89.474%

### 분류

그리디 알고리즘, 다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>You're helping your friend decorate their Christmas tree! Funnily enough, the places to put your ornaments on their Christmas tree can be represented by a (graph-theoretic) tree with nodes labeled $1$ to $N$, with node $1$ being the root of the tree and other nodes numbered arbitrarily. You have an infinite supply of ornaments of every non-negative integer weight (including $0$), and you must place exactly one ornament on each node of the tree.</p>

<p>However, your friend has some restrictions on how they want their tree decorated. First, they have strong opinions about which ornament must go on some of the tree nodes; you are only allowed to choose decorations on the other nodes. Second, each region of their tree can support only so much weight: if the sum of the weights of the ornaments on a node and all of its immediate children exceeds a constant $K$, the whole tree will come crashing down!</p>

<p>Your friend wants to know the largest possible total weight of ornaments on their tree, given the above restrictions. Can you help them find out?</p>

### 입력

<p>The first line of input has two space-separated integers $N$ and $K$ ($1 \leq N \leq 2 \cdot 10^5, 0 \leq K \leq 10^9$), the number of nodes in the tree and the weight constant, respectively.</p>

<p>The next line contains $N$ space-separated integers. The $i^\text{th}$ integer (starting at $i=1$) is either $-1$ or a non-negative integer. If it is $-1$, you are free to choose any ornament for node $i$. If it is a non-negative integer $w_i$ ($0 \leq w_i \leq 10^9$), your friend insists you place an ornament with weight $w_i$  on node $i$.</p>

<p>The next $N-1$ lines each contain two space-separated integers $a$ and $b$ ($1 \leq a, b \leq N$), indicating that nodes $a$ and $b$ are connected by an edge. The input graph is guaranteed to be a tree: there is a unique path of edges between every pair of nodes in the graph.</p>

### 출력

<p>If it is impossible to place ornaments on the tree in a way that satisfies all of the constraints described above, print $-1$. Otherwise, print the maximum possible total weight of the ornaments on the tree, subject to the constraints.</p>
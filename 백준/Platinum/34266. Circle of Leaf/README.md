# [Platinum II] Circle of Leaf - 34266

[문제 링크](https://www.acmicpc.net/problem/34266)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 30, 정답: 21, 맞힌 사람: 20, 정답 비율: 76.923%

### 분류

다이나믹 프로그래밍, 수학, 조합론, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<figure style="float: right;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34266.%E2%80%85Circle%E2%80%85of%E2%80%85Leaf/6fbb7d4a.png" data-original-src="https://boja.mercury.kr/assets/problem/34266-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 222px; height: 229px;">
<figcaption>Ouroboros from <a href="/assets/problem/34266-3.svg">Wikimedia Commons</a></figcaption>
</figure>

<p>Your friend has given you a rooted tree: a connected graph with $N$ nodes and $N-1$ edges. The nodes of the tree are numbered from $1$ to $N$, with node $1$ being the root of the tree and other nodes numbered arbitrarily.</p>

<p> </p>

<p>However, you recently learned about the Ouroboros, an ancient mythical snake that eats its own tail, signifying a cycle with no beginning and end. You dislike the fact that the tree you were given has a very clear beginning at the root, and clear ends at its leaves, so you decide to completely change the structure of this tree into a new graph which you have named an <em>Ouroboros Graph</em>.</p>

<p>To construct this Ouroboros Graph, you take the leaves of the tree (the nodes with no direct children) and draw special "leaf" edges that connect every leaf directly to the root. <strong>If there is already an edge connecting a leaf to the root, you still add a duplicate edge.</strong></p>

<p>With this special graph structure, you can now create lots of different trees by removing some subset of edges, and in the spirit of Ouroboros, the leaves and roots can change depending on which subset of edges you remove. How many different trees can you make by removing a subset of edges from the Ouroboros Graph? Two trees are considered different if one tree has an edge that the other tree does not. (If both a regular and a "leaf" edge connect the same pair of nodes, then they are distinguishable from each other and are considered different edges.) Since the number of trees can be large, compute the answer modulo $998\,244\,353$.</p>

### 입력

<p>The first line of input contains a single integer $N$ ($2 \leq N \leq 200\,000$), the number of nodes in the tree.</p>

<p>Each of the next $N-1$ lines contains two space separated integers $a$ and $b$ ($1 \leq a,b \leq N$) specifying that an edge exists between parent node $a$ and child node $b$ in the tree. The input graph is indeed guaranteed to be a tree: there is a unique path of edges between every pair of nodes in the graph.</p>

### 출력

<p>Print the number of different trees modulo $998\,244\,353$ that can be created by removing some subset of edges from the input tree's Ouroboros Graph.</p>
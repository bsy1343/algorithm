# [Platinum III] Broken Minimum Spanning Tree - 28146

[문제 링크](https://www.acmicpc.net/problem/28146)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 291, 정답: 71, 맞힌 사람: 66, 정답 비율: 30.698%

### 분류

그래프 이론, 그리디 알고리즘, 정렬, 최소 스패닝 트리

### 문제 설명

<p>Ethan was tasked with finding a minimum spanning tree of a weighted, connected, undirected graph. However, he misunderstood the task and found a spanning tree that may not be minimal. To make his spanning tree a minimum spanning tree, you perform a sequence of edge swaps. An edge swap removes one edge from the spanning tree and adds an edge from the graph which is not currently in the spanning tree. After each edge swap, the tree must still be a spanning tree. What is the minimum number of edge swaps you must perform to fix Ethan&#39;s minimum spanning tree?</p>

### 입력

<p>The first line of input contains two integers $n$ ($2 \le n \le 2\,000$) and $m$ ($n-1 \le m \le 3\,000$), where $n$ is the number of nodes in the graph and $m$ is the number of edges in the graph. The nodes are numbered from $1$ to $n$.</p>

<p>Each of the next $m$ lines contains three integers $u$, $v$ ($1 \le u,v \le n, u \ne v$), and $w$ ($1 \le w \le 10^9$), signifying an edge connecting nodes $u$ and $v$ with weight $w$. The edges are numbered from $1$ to $m$.</p>

<p>It is guaranteed that the graph is connected. The first $n-1$ edges of the input are Ethan&#39;s initial spanning tree. The graph may not be simple; there can be multiple edges between the same pair of nodes.</p>

### 출력

<p>Output a single integer $k$, which is the minimum number of edge swaps needed to make the spanning tree a minimum spanning tree. Then output $k$ lines, each with two integers $a$ and $b$, where $a$ is the number of the edge to remove and $b$ is the number of the edge to add. If there are multiple sets of $k$ edge swaps that work, any one will be accepted.</p>
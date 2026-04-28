# [Platinum I] Count BFS Graph - 32085

[문제 링크](https://www.acmicpc.net/problem/32085)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 71, 정답: 49, 맞힌 사람: 43, 정답 비율: 67.188%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You are currently researching a graph traversal algorithm called the Breadth First Search (BFS). Suppose you have an input graph of $N$ nodes (numbered from $1$ to $N$). The graph is represented by an adjacency matrix $M$, for which node $u$ can traverse to node $v$ if $M_{u,v}$ is $1$, otherwise it is $0$. Your algorithm will output the order the nodes are visited in the BFS. The pseudocode of the algorithm is presented as follows.</p>

<pre>
BFS(M[1..N][1..N]):
    let A be an empty array
    let Q be an empty queue

    append 1 to A
    push 1 to Q

    while Q is not empty:
        pop the front element of Q into u
        for v = 1 to N:
            if M[u][v] == 1 and v is not in A:
                append v to A
                push v to Q

    return A
</pre>

<p>During your research, you are interested in the following problem. Given an array $A$ such that $A$ is a permutation of $1$ to $N$ and $A_1 = 1$. How many simple undirected graph with $N$ nodes and adjacency matrix $M$ such that $\text{BFS}(M) = A$? Since the answer can be very large, calculate the answer modulo $998\, 244\, 353$.</p>

<p>A simple graph has no self-loop ($M_{i,i} = 0$ for $1 &le; i &le; N$) and there is at most one edge that connects a pair of nodes. In an undirected graph, if node $u$ is adjacent to node $v$, then node $v$ is also adjacent to node $u$; formally, $M_{u,v} = M_{v,u}$ for $1 &le; u &lt; v &le; N$.</p>

<p>Two graphs are considered different if there is an edge that exists in one graph but not the other. In other words, two graphs are considered different if their adjacency matrices are different.</p>

### 입력

<p>The first line consists of an integer $N$ ($2 &le; N &le; 5000$).</p>

<p>The second line consists of $N$ integers $A_i$. The array $A$ is a permutation of $1$ to $N$ and $A_1 = 1$.</p>

### 출력

<p>Output an integer representing the number of simple undirected graphs with $N$ nodes and adjacency matrix $M$ such that $\text{BFS}(M) = A$. Since the answer can be very large, output the answer modulo $998\, 244\, 353$.</p>
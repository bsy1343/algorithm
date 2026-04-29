# [Platinum V] Construct BFS Graph - 35132

[문제 링크](https://www.acmicpc.net/problem/35132)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 10, 정답: 4, 맞힌 사람: 3, 정답 비율: 42.857%

### 분류

그래프 이론, 그래프 탐색, 그리디 알고리즘, 너비 우선 탐색, 해 구성하기

### 문제 설명

<p>You are currently researching a graph traversal algorithm called the Breadth First Search (BFS). Suppose there is a graph of $N$ nodes, numbered from $1$ to $N$, and an adjacency matrix $A$, for which node $u$ can traverse to node $v$ if $A_{u, v}$ is $1$, otherwise it is $0$. The following pseudocode will output the order the nodes that are visited in a BFS algorithm.</p>

<pre>BFS(A[1..N][1..N]):
    let U be an empty array
    let Q be an empty queue

    append 1 to U
    push 1 to Q

    while Q is not empty:
        pop the front element of Q into u
        for v = 1 to N:
            if A[u][v] == 1 and v is not in U:
                append v to U
                push v to Q

    return U
</pre>

<p>Suppose now you have an integer $N$, $M$, and an array $U$ of $N$ integers. You wonder whether there exists a simple undirected graph with $N$ nodes and $M$ edges such that the output of the pseudocode above is the array $U$. Construct such graph if it exists.</p>

<p>A simple undirected graph with $M$ edges has an adjacency matrix $A$ that satisfies the following.</p>

<ul>
<li>$A_{u, u} = 0$ for all $1 \leq u \leq N$.</li>
<li>Exactly $M$ pairs $(u, v)$ satisfies $1 \leq u &lt; v \leq N$ and $A_{u, v} = 1$, meaning that there is an edge connecting node $u$ and $v$.</li>
<li>$A_{u, v} = A_{v, u}$ for all $1 \leq u &lt; v \leq N$.</li>
</ul>

### 입력

<p>The first line contains two integers $N$ and $M$ ($1 \le N, M \le 200000$). The second line contains $N$ integers representing $U$, which is a permutation of $(1, 2, \ldots, N)$. You are guaranteed that the first element of $U$ is always $1$.</p>

### 출력

<p>If such a graph exists, output $M$ lines, each containing two integers $u$ and $v$ representing an edge that connects node $u$ and $v$.</p>

<p>If there is no such graphs, output <code>-1 -1</code> in a single line.</p>

### 힌트

<p><em>Explanation of Sample 1:</em> You can also output the following edges and get a correct answer: $(1, 5), (5, 2), (2, 3), (3, 5), (2, 4), (5, 4)$.</p>
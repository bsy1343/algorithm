# [Platinum II] Count DFS Graph - 35169

[문제 링크](https://www.acmicpc.net/problem/35169)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 13, 정답: 10, 맞힌 사람: 10, 정답 비율: 76.923%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You are currently researching a graph traversal algorithm called the Depth First Search (DFS). Starting with an empty list <code>A</code>, the following pseudocode will fill the list <code>A</code> with the visitation order of a DFS algorithm.</p>

<pre>DFS(v):
    append v to A
    for each u neighbour of v in ascending node number:
        if u is not in A:
            DFS(u)</pre>

<p>After running <code>DFS(1)</code> from the pseudocode above, you now have a list $A$ containing a permutation of integers from $1$ to $N$. You now wonder how many different simple undirected graphs with $N$ nodes there are that yield the list $A$ that you have. Count the number, modulo $998\,244\,353$.</p>

<p>A graph is simple when there are no self-loops and there is at most one edge connecting each pair of nodes. Two graphs are considered different if there is an edge connecting a pair of nodes in one graph but not the other.</p>

### 입력

<p>The first line contains an integer $N$ ($2 \le N \le 300$). The second line contains a permutation of the first $N$ positive integers, representing the list $A$. The first element of $A$ is guaranteed to be $1$.</p>

### 출력

<p>A single integer representing the number of different graphs, whose DFS order gives you the list $A$, modulo $998\,244\,353$.</p>
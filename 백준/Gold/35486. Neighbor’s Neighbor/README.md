# [Gold IV] Neighbor’s Neighbor - 35486

[문제 링크](https://www.acmicpc.net/problem/35486)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 13, 맞힌 사람: 12, 정답 비율: 50.000%

### 분류

그래프 이론, 두 포인터, 정렬

### 문제 설명

<p>An undirected graph with $N$ vertices is given. Each vertex $i$ has an integer value $A_i$. The graph has $M$<b><strong> </strong></b>edges, and all edges have length $1$.</p>

<p>You want to choose two <b><strong>distinct</strong></b> vertices $a$ and $b$ that satisfy the following condition:</p>

<ul>
<li>There exists <b><strong>at least one path of length exactly $2$</strong></b> between vertices $a$ and $b$. Note that if $a$ and $b$ are directly connected by an edge (i.e., their shortest distance is $1$), the condition is satisfied as long as there exists at least one path of length $2$ between them.</li>
<li>The definition of a path is as follows: A path is a sequence of vertices such that every two consecutive vertices are connected by an edge. The length of a path is the number of edges it uses. A path may contain the same vertex multiple times.</li>
</ul>

<p>Among all pairs of vertices $(a, b)$ that satisfy the condition, <b><strong>find the minimum possible value of $|A_a + A_b|$</strong></b>. In other words, choose two distinct vertices that share a common neighbor so that the absolute value of the sum of their weights is as small as possible.</p>

### 입력

<p>The first line contains two integers $N$ and $M$, the number of vertices and the number of edges. ($3 \le N \le 100\,000, 2 \le M \le 2N$)</p>

<p>The second line contains $N$ integers $A_1, A_2, \ldots, A_N$, where $A_i$ is the value of vertex $i$. ($-10^9 \le A_i \le 10^9$)</p>

<p>Each of the next $M$ lines contains two integers $u$ and $v$, indicating an undirected edge between vertices $u$ and $v$. ($1 \le u &lt; v \le N$)</p>

<p>It is guaranteed that the given graph is connected and contains no multiple edges or self-loops.</p>

### 출력

<p>Print a single integer: the minimum value of $|A_a + A_b|$ among all pairs of<strong> distinct</strong> vertices $(a, b)$ such that there exists at least one path of length exactly $2$ between $a$ and $b$. It is guaranteed that at least one such pair $(a, b)$ exists.</p>
# [Platinum V] Kamui - 34658

[문제 링크](https://www.acmicpc.net/problem/34658)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 126, 정답: 75, 맞힌 사람: 65, 정답 비율: 57.522%

### 분류

그래프 이론, 세그먼트 트리, 수학, 이분 그래프, 이분 탐색, 자료 구조, 조합론

### 문제 설명

<p>There is a graph with a total of $2N$ vertices. There are no edges between the $1$st and $N$-th vertices, and there are no edges between the $(N+1)$-th and $2N$-th vertices. That is, the given graph is a bipartite graph.</p>

<p>A sequence of positive integers $a_1, a_2, \cdots, a_N$ is given. For any $(i,j)$ pair with $1 \le i, j \le N$, the necessary and sufficient condition for vertices $i$ and $N+j$ to be connected is that $j \le a_i$.</p>

<p>A total of $Q$ queries are given. Each query is represented by two integers $v$ and $x$, indicating that the value of $a_v$ will be changed to $a_v + x$. It is guaranteed that $x = 1$ or $x = -1$. For each query, you must count the number of cycles of length $4$ in the given graph. Since the count may be large, output the remainder when divided by $998\,244\,353$. Two cycles are considered different if the sets of edges composing them are different.</p>

### 입력

<p>The first line contains two positive integers $N$ and $Q$, separated by a space.</p>

<p>The second line contains a total of $N$ integers $a_1, a_2, \cdots, a_N$, separated by spaces.</p>

<p>The next $Q$ lines each contain two integers $v$ and $x$ separated by a space. The input on the $i$th line indicates that $a_v$ will be changed to $a_v + x$.</p>

### 출력

<p>After each query is executed, output the remainder when the number of cycles of length $4$ is divided by $998\,244\,353$ on each line.</p>

### 제한

<ul>
<li>$1 \le N \le 500\,000$, $1\le Q\le 500\,000$</li>
<li>For each queries, $1 \le v \le N$ and $x \in \left\{ -1, 1 \right\}$. </li>
<li>After each queries, it is guaranteed that $0\le a_i\le N$ for all $1\le i\le N$.</li>
</ul>

### 힌트

<p>The set of four edges $\left\{ xy,yz,zw,wx\right\}$ in a graph is considered to be a cycle of length $4$.</p>
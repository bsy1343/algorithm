# [Silver II] Two Sets - 35171

[문제 링크](https://www.acmicpc.net/problem/35171)

### 성능 요약

시간 제한: 2.5 초, 메모리 제한: 2048 MB

### 통계

제출: 121, 정답: 49, 맞힌 사람: 39, 정답 비율: 50.649%

### 분류

애드 혹

### 문제 설명

<p>You are given an undirected graph with $N$ vertices and $M$ edges, with vertices numbered from $1$ to $N$.</p>

<p>You have to select two integers $p$ and $q$ such that:</p>

<ul>
<li>$N &lt; (p + 1)(q + 1)$</li>
<li>There exists a non-empty set of vertices $S_1$ such that for every vertex $u \in S_1$, there are <strong>at least</strong> $p$ other vertices in $S_1$ that share an edge with $u$.</li>
<li>There exists a set of vertices $S_2$ of size <strong>at least</strong> $q$ such that for every vertex $u \in S_2$, there are no vertices in $S_2$ that share an edge with $u$.</li>
</ul>

<p>You have to find $p$, $q$, along with any $S_1$ and $S_2$ that satisfy the requirements above. It can be proven that such $p$ and $q$ always exist.</p>

### 입력

<p>The first line contains two integers $N$ and $M$ ($1 \leq N \leq 2000$; $0 \leq M \leq \min(\frac{N(N-1)}{2}, 200000$)). Each of the next $M$ lines contains two integers $u$ and $v$ ($1 \leq u &lt; v \leq N$) representing the two vertex numbers that are connected by an edge. All the given edges are different.</p>

### 출력

<p>The first line contains two integers $p$ and $q$. The second line contains an integer $|S_1|$ followed by $|S_1|$ integers representing the vertex numbers in $S_1$. The third line contains an integer $|S_2|$ followed by $|S_2|$ integers representing the vertex numbers in $S_2$.</p>
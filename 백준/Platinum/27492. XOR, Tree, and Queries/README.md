# [Platinum I] XOR, Tree, and Queries - 27492

[문제 링크](https://www.acmicpc.net/problem/27492)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 16, 맞힌 사람: 15, 정답 비율: 68.182%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 트리, 누적 합, 깊이 우선 탐색, 분리 집합

### 문제 설명

<p>You are given a tree of $n$ vertices. The vertices are numbered from $1$ to $n$.</p>

<p>You will need to assign a weight to each edge. Let the weight of the $i$-th edge be $a_i$ ($1 \leq i \leq n-1$). The weight of each edge should be an integer between $0$ and $2^{30}-1$, inclusive.</p>

<p>You are given $q$ conditions. Each condition consists of three integers $u$, $v$, and $x$. This means that the <a href="https://en.wikipedia.org/wiki/Bitwise_operation#XOR">Bitwise XOR</a> of all edges on the shortest path from $u$ to $v$ should be $x$.</p>

<p>Find out if there exist $a_1, a_2, \ldots, a_{n-1}$ that satisfy the given conditions. If yes, print a solution such that $a_1 \oplus a_2 \oplus \ldots \oplus a_{n-1}$ is the <strong>smallest</strong>. Here, $\oplus$ denotes the bitwise XOR operation.</p>

<p>If there are multiple solutions such that $a_1 \oplus a_2 \oplus \ldots \oplus a_{n-1}$ is the smallest, print any.</p>

### 입력

<p>The first line contains two integers $n$ and $q$ ($2 \le n \le 2.5 \cdot 10^5$, $0 \le q \le 2.5 \cdot 10^5$).</p>

<p>The $i$-th of the following $n-1$ lines contains two integers $x_i$ and $y_i$ ($1 \le x_i, y_i \le n$, $x_i \neq y_i$), meaning that the $i$-th edge connects vertices $x_i$ and $y_i$ in the tree.</p>

<p>It is guaranteed that the given edges form a tree.</p>

<p>The following $q$ lines contain information about conditions.</p>

<p>Each line contains three integers $u$, $v$, $x$ ($1 \le u, v \le n$, $u \neq v$, $0 \le x \le 2^{30}-1$), meaning that the bitwise XOR of all edges on the shortest path from $u$ to $v$ should be $x$.</p>

### 출력

<p>If there do not exist $a_1, a_2, \ldots, a_{n-1}$ that satisfy the given conditions, print &quot;No&quot;.</p>

<p>Otherwise, print &quot;Yes&quot; in the first line.</p>

<p>Then print $n-1$ integers on the next line, where the $i$-th integer is the weight of the $i$-th edge. If there are multiple solutions that satisfy the given conditions, print a solution such that $a_1 \oplus a_2 \oplus \ldots \oplus a_{n-1}$ is the smallest.</p>

<p>If there are multiple solutions such that  $a_1 \oplus a_2 \oplus \ldots \oplus a_{n-1}$ is the smallest, print any.</p>

<p>When printing &quot;Yes&quot; or &quot;No&quot;, you can print each letter in any case (either upper or lower). For example, the strings &quot;yEs&quot;, &quot;yes&quot;, &quot;Yes&quot;, and &quot;YES&quot; will be recognized as positive responses.</p>
# [Platinum I] Alice and Bob - 18907

[문제 링크](https://www.acmicpc.net/problem/18907)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 20, 맞힌 사람: 18, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 게임 이론, 배낭 문제

### 문제 설명

<p>Alice and Bob will play a game by alternating turns with Alice going first.&nbsp;</p>

<p>They have a directed acyclic graph, such that each edge $u \to v$ satisfies $u &lt; v$.</p>

<p>All vertices in this DAG are colored one of two colors, and vertices have tokens on them (a vertex may contain more than one token).</p>

<p>During her move, Alice will choose a white vertex $u$ which contains at least one token. Then, she will choose some outgoing edge, $u \to v$, and move one token from vertex $u$ to the vertex $v$.</p>

<p>During his move, Bob will choose a black vertex $u$ which contains at least one token. Then, he will choose some outgoing edge $u \to v$ and move one token from vertex $u$ to the vertex $v$.</p>

<p>The person who can&#39;t move loses.</p>

<p>Alice and Bob haven&#39;t decided on the configuration of tokens yet, but they have decided that each vertex at the beginning of the game will contain at most one token. Among all $2^n$ placement of tokens, calculate how many of them Alice will win under the optimal play of both players? As this value may be large, find it modulo $998\,244\,353$.</p>

### 입력

<p>The first line contains two integers $n,m$ ($1 \leq n \leq 300, 0 \leq m \leq \frac{n(n-1)}{2}$): the number of vertices and edges in the graph.</p>

<p>The second line contains a string of length $n$. If the $i$-th character is `W&#39;, then the vertex is white. Otherwise, it will be equal to `B&#39; and be black.</p>

<p>Each of the next $m$ lines contains two vertices $u$, $v$ ($1 \leq u &lt; v \leq n)$, denoting an edge $u \to v$.</p>

<p>It is guaranteed that the DAG will have no multiple edges.</p>

### 출력

<p>Print one integer: the number of ways to place at most one token on each vertex such that Alice wins, modulo $998\,244\,353$.</p>

### 힌트

<p>In the first example, Alice will win in all the cases, where she can make at least one move (because Bob will never be able to move), so the answer is $2^5 - 2$.</p>
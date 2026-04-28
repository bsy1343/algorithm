# [Platinum III] Diameter Two - 24688

[문제 링크](https://www.acmicpc.net/problem/24688)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 10, 맞힌 사람: 9, 정답 비율: 50.000%

### 분류

애드 혹, 많은 조건 분기, 해 구성하기

### 문제 설명

<p>You are building a computer network for a new company. The network consists of $n$ nodes numbered from $1$ to $n$. The nodes can be connected via bidirectional wires. Each wire connects exactly two nodes. Each pair of nodes can be connected with at most one wire. If a wire connects two nodes, we&#39;ll say that these two nodes are <em>directly connected</em>.</p>

<p>The first $k$ nodes (with indices $1, 2, \ldots, k$) will be <em>untrusted</em> and must be connected to the network <em>securely</em>. Each of these nodes must be directly connected to <em>exactly one</em> other node.</p>

<p>The remaining $n-k$ nodes (with indices $k+1, k+2, \ldots, n$) will be <em>trusted</em> and must be connected to the network <em>reliably</em>. Each of these nodes must be directly connected to <em>at least two</em> other nodes.</p>

<p>The <em>diameter</em> of the network must not exceed $2$: for any two nodes $i$ and $j$, they must either be directly connected, or there must exist a node $k$ such that nodes $i$ and $k$ are directly connected, and nodes $k$ and $j$ are directly connected.</p>

<p>To minimize the costs, the number of used wires must be as small as possible.</p>

<p>Build a network satisfying all the conditions above, or report if this is impossible.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 50$). Description of the test cases follows.</p>

<p>The only line of each test case contains two integers $n$ and $k$, denoting the total number of nodes and the number of untrusted nodes, respectively ($3 \le n \le 50$; $0 \le k \le n$).</p>

### 출력

<p>For each test case, if it is impossible to build a network satisfying the given conditions, print a single integer $-1$.</p>

<p>Otherwise, in the first line, print the number of used wires $m$. In each of the following $m$ lines, print two integers $u_i$ and $v_i$, denoting the indices of the nodes connected with the $i$-th wire ($1 \le u_i, v_i \le n$; $u_i \ne v_i$).</p>
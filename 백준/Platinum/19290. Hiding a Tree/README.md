# [Platinum III] Hiding a Tree - 19290

[문제 링크](https://www.acmicpc.net/problem/19290)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 147, 정답: 16, 맞힌 사람: 15, 정답 비율: 11.364%

### 분류

해 구성하기, 많은 조건 분기, 비트마스킹

### 문제 설명

<p><em>XOR-scanner</em>&nbsp;is a device which scans a sequence of integers and accepts it if and only if the bitwise XOR of all numbers in the sequence is equal to zero.</p>

<p>You have a tree with $n$ vertices, labeled with integers from $1$ to $n$. You want to write down this tree in a standard format for the programming contest problem:</p>

<p>$n$<br />
$u_1\ v_1$<br />
$\dots$<br />
$u_{n-1}\ v_{n-1}$</p>

<p>Here $n$ is the number of vertices and $u_i$, $v_i$ are vertices connected by the $i$-th edge.</p>

<p>You want the XOR-scanner to accept your output. It might be not the case initially, so you can change the labels of some vertices of the tree. After this operation all vertices must have distinct integer labels from $1$ to $10^9$, inclusive.</p>

<p>For each vertex it is known if it is possible to change its label. Find a way to relabel some allowed vertices (possibly, keeping some labels or all of them as is) in such a manner that the XOR-scanner accepts the tree representation or report that it is impossible.</p>

### 입력

<p>In the first line there is an integer $n$ ($2 \leq n \leq 100\,000$), the number of vertices in a tree.&nbsp;</p>

<p>Next line contains $n$ integers, $i$-th of them is $0$ if the label of $i$-th vertex is fixed and $1$ if it can be changed.</p>

<p>Each of the next $n-1$ lines contains two integers $u_i$, $v_i$ ($1 \leq u_i, v_i \leq n$), which denote the endpoints of the edges.</p>

### 출력

<p>If the desired relabeling exists, print the relabeled tree in the same format as it is given in the statement, keeping the order of edges and the order of endpoints of the each edge. The bitwise XOR of all printed numbers must be zero.</p>

<p>If it is impossible, print a single number <code>-1</code>.</p>
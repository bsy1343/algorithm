# [Platinum I] Kth Subtree - 21141

[문제 링크](https://www.acmicpc.net/problem/21141)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 263, 정답: 92, 맞힌 사람: 47, 정답 비율: 24.607%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>You are given an unrooted labeled tree. A subtree is a connected subgraph of this tree. The size of a subtree is the number of nodes in the subtree. Two subtrees are different if there is at least one node which is in one but not the other. The largest subtree is the original tree itself.</p>

<p>Compute the size of the $K$<sup>th</sup> smallest non-empty subtree.</p>

### 입력

<p>The first line of input contains two integers $n$ ($1 \le n \le 5,000$) and $K$ ($1 \le K \le 10^{18}$), where $n$ is the number of nodes in the tree, and you&rsquo;re looking for the size of the $K$<sup>th</sup> smallest subtree. The nodes are numbered $1$ through $n$.</p>

<p>Each of the next $n - 1$ lines contains a pair of integers $u$ and $v$ ($1 \le u, v \le&nbsp;n$, $u \ne v$), which represents an undirected edge between nodes $u$ and $v$. All edges are distinct. It is guaranteed that the edges form a single tree.</p>

### 출력

<p>Output a single integer, which is the number of nodes in the $K$<sup>th</sup> smallest non-empty subtree of the input tree. If there are fewer than $K$ non-empty subtrees of the given tree, output $-1$.</p>
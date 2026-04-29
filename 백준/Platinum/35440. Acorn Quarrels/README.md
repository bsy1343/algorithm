# [Platinum II] Acorn Quarrels - 35440

[문제 링크](https://www.acmicpc.net/problem/35440)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 12, 정답: 9, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

이분 탐색, 트리, 해 구성하기

### 문제 설명

<p>There are $N$ squirrels storing acorns in a tree. The (botanical) oak tree is also a graph-theoretic tree: a connected graph with $N$ vertices labeled from $1$ to $N$ and $N-1$ undirected edges. Each squirrel sits at a different vertex of the tree and two squirrels are <em>neighbors</em> if their vertices share an edge.</p>

<p>In ascending order of vertex label starting with the squirrel at vertex $1$, each squirrel steals one acorn from the neighboring squirrel that currently has the most acorns. If multiple neighbors are tied for having the most acorns, the squirrel steals one acorn from each of them!</p>

<p>To limit the fallout of these shenanigans, you want to distribute acorns to the squirrels so that each squirrel begins with at least $N$ acorns (so that no squirrel runs out of acorns due to thefts) and ends with the same number of acorns after all $N$ squirrels are done stealing from each other as they had originally. It can be shown that such a distribution exists where every squirrel begins with at most $2N-1$ acorns. Find any distribution satisfying these conditions.</p>

### 입력

<p>The first line of input contains an integer $N$ $(2 \leq N \leq 10^{5})$, the number of vertices (and squirrels).</p>

<p>Each of the following $N-1$ lines contains two space-separated integers $u$ and $v$ $(1 \leq u, v \leq N, u \neq v)$, indicating that an edge exists between vertices $u$ and $v$. There is at most one edge between any pair of vertices, and the edges form a tree.</p>

### 출력

<p>Print $N$ space-separated integers $d_1, d_2, \ldots, d_N$ satisfying $N \leq d_i \leq 2N-1$, where $d_i$ is the number of acorns you would like to distribute to the squirrel at vertex $i$. Your solution will be accepted if every squirrel ends with the same number of acorns as they started with after all $N$ thefts have occurred. It can be proved that such a distribution of acorns always exists.</p>
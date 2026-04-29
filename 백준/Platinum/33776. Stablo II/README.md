# [Platinum I] Stablo II - 33776

[문제 링크](https://www.acmicpc.net/problem/33776)

### 성능 요약

시간 제한: 3.5 초, 메모리 제한: 2048 MB

### 통계

제출: 36, 정답: 16, 맞힌 사람: 9, 정답 비율: 34.615%

### 분류

분리 집합, 자료 구조, 트리

### 문제 설명

<p>Patrik received a tree with $n$ vertices. He decided to paint the edges of that tree using $k$ different colors.</p>

<p>Initially, all edges of the tree are painted with color $0$. He will use the colors in order from the first to the $k$-th, where he will use the $i$-th color to paint all the edges on the shortest path from the $x_i$-th to the $y_i$-th node. If an edge on that path is already painted, the new color will overwrite the old one.</p>

<p>Help Patrik determine the final color of each edge.</p>

### 입력

<p>In the first line of input, there are numbers $n$ and $k$ ($2 ≤ n ≤ 10^6$, $1 ≤ k ≤ 10^6$), representing the number of vertices in the tree and the number of colors.</p>

<p>In the next $n - 1$ lines, there are numbers $u_i$ and $v_i$ ($1 ≤ u_i , v_i ≤ n$) — the $i$-th edge connects the vertices $u_i$ and $v_i$. It is guaranteed that the edges form a tree.</p>

<p>In the following $k$ lines, there are numbers $x_i$ and $y_i$ ($1 ≤ x_i , y_i ≤ n$), representing the nodes between which Patrik paints the edges.</p>

### 출력

<p>In a single line, print the final color of each edge in the order they were given in the input.</p>
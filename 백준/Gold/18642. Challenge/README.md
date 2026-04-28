# [Gold I] Challenge - 18642

[문제 링크](https://www.acmicpc.net/problem/18642)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 32, 정답: 19, 맞힌 사람: 18, 정답 비율: 78.261%

### 분류

트리, 해 구성하기

### 문제 설명

<p>Many programming competition problems on trees are solved using the centroid decomposition: given a tree, we first find a centroid &mdash; such vertex that after removing it from the tree the remaining pieces all have at most half the number of vertices of the original tree. Then, we remove the found centroid from the tree and recursively apply the process to each remaining piece. Since the size of each piece decreases at least 2x on each level, there are at most log<sub>2</sub>(n) + 1 levels for a tree with n vertices (in other words, for any vertex there are at most log<sub>2</sub>(n) + 1 pieces containing this vertex that are processed at any point of the algorithm).</p>

<p>You have noticed that another contestant has made a bug in their centroid decomposition: instead of finding a centroid, they find a center of the tree at each stage &mdash; a vertex that minimizes the maximum distance to other vertices in the tree. More formally, if d<sub>ij</sub> is the distance (in tree edges) between vertices i and j, the value r = min<sub>i</sub>(max<sub>j</sub>(d<sub>ij</sub>)) is called the <em>radius</em> of the tree, and any vertex k such that max<sub>j</sub>(d<sub>kj</sub>) = r is called a center of the tree.</p>

<p>It turns out that there can be more than log2(n) + 1 levels of decomposition because of this bug. In order to challenge this solution, you need to construct a tree with at most n vertices for which this &lsquo;center decomposition&rsquo; will have at least &lfloor;&radic;n&rfloor; levels (square root of n rounded down). More precisely, there must be at least one vertex which belongs to at least &lfloor;&radic;n&rfloor; different subsets processed at some point of the decomposition.</p>

<p>You can assume that whenever a tree at some stage has multiple centers, the decomposition picks the one with the smallest vertex number as the center to remove from the tree.</p>

### 입력

<p>The only line of the input contains the integer n, 1 &le; n &le; 100000.</p>

### 출력

<p>On the first line of output, print an integer m (1 &le; m &le; n) denoting the number of vertices in your tree. On the next m &minus; 1 lines describe the edges of the tree. Each edge should be described by the two numbers of vertices it connects. The vertices are numbered from 1 to m.</p>

<p>At least one vertex of the tree must belong to at least&nbsp;&lfloor;&radic;n&rfloor;&nbsp;different pieces in the process that picks the center of the tree (the one with the smallest vertex number if there are several), removes it from the tree, and recursively applies itself to all remaining pieces.</p>
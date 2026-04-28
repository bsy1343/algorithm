# [Platinum III] Šarenlist - 24473

[문제 링크](https://www.acmicpc.net/problem/24473)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 8, 맞힌 사람: 8, 정답 비율: 44.444%

### 분류

수학, 자료 구조, 조합론, 분리 집합, 포함 배제의 원리

### 문제 설명

<p>Warm summer night. Vito and his friend, Karlo, are lying in a forest clearing and watching the stars. Suddenly, Vito exclaims &ldquo;Karlo, look! The trees around us are changing colors!&rdquo; &ldquo;Wooow so colorful&rdquo; said Karlo, amazed. Indeed, the tree branches in the forest started to change colors.</p>

<p>Fascinated by the colorful trees, Vito and Karlo noticed a couple of facts about them. Each of the trees they are looking at can be represented as a tree graph, i.e. an undirected graph in which there exists a unique path between each pair of nodes. The trees they are looking at have the property that each edge of the tree is colored in one of $k$ different colors. Some of the paths on the tree are <em>colorful</em>, meaning that such a path contains edges of at least two different colors.</p>

<p>Morning has arrived and the tree magic is now lost. In order to relive this experience, Vito and Karlo ask you to solve the following problem. Given a tree and $m$ pairs of nodes on the tree, determine the number of different colorings of the tree edges so that each of the $m$ paths determined by the $m$ pairs of nodes is colorful. Since this number can be very large, output it modulo $10^9 + 7$.</p>

### 입력

<p>The first line contains three positive integers $n$, $m$ and $k$ ($3 &le; n &le; 60$, $1 &le; m &le; 15$, $2 &le; k &le; 10^9$), the number of nodes in the tree, the number of path required to be colorful and the number of possible colors for the tree branches, respectively.</p>

<p>The $i$-th of the next $n - 1$ lines contains a pair of positive integers $a_i$ and $b_i$ ($1 &le; a_i , b_i &le; n$), representing an edge of the tree.</p>

<p>The $j$-th of the next $m$ lines contains a pair of positive integers $c_j$ and $d_j$ ($1 &le; c_j , d_j &le; n$), the labels of the endpoints of the paths which are required to be colorful. The nodes $c_j$ and $d_j$ <strong>are not neighbouring</strong>.</p>

### 출력

<p>In the only line print the number of ways to color the tree edges so that each of the $m$ given paths is colorful, modulo $10^9 + 7$.</p>

### 힌트

<p>Clarification of the first example: The tree consists of only two edges, both part of a colorful path between the nodes 1 and 3. So, the two edges must have a different color. One such coloring is obtained by coloring the edge 1-2 in color 1, and 2-3 in color 2, while the other is obtained by switching these color so that 1-2 has color 2, and 2-3 has color 1.</p>
# [Platinum II] K Network Stations - 34748

[문제 링크](https://www.acmicpc.net/problem/34748)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 13, 맞힌 사람: 11, 정답 비율: 44.000%

### 분류

다이나믹 프로그래밍, 수학, 트리, 트리에서의 다이나믹 프로그래밍, 트리에서의 전방향 다이나믹 프로그래밍

### 문제 설명

<p>The city of “문해프” consists of $N$ buildings and $N - 1$<strong> </strong>roads, forming a tree structure<strong> </strong>(meaning that every pair of buildings is connected by exactly one simple path, and there are no cycles.). All roads are bidirectional and have their own lengths.</p>

<p>The newly appointed mayor of “문해프” City plans to divide the city into $K$ regions by removing $K-1$ roads. (if $K = 1$, a single region covers the entire city.) Then, one Network Station will be built in each region to facilitate communication among the buildings within that region.</p>

<p>Each region $R$ contains multiple buildings. The communication complexity of region $R$ is defined as $ \sum_{i,j\in R, i&lt;j} \operatorname{dist}(i,j) $, where the sum runs over all unordered pairs of distinct buildings in $R$. In other words, the communication complexity of a region is the total sum of distances between all pairs of buildings in that region.</p>

<p>The mayor of “문해프” City wants to <strong>minimize the maximum communication complexity</strong> among all regions. Find the minimum possible value of this maximum communication complexity when the city is divided optimally.</p>

### 입력

<p>The first line contains two integers $N$ and $K$, the number of buildings and the number of regions to divide the city into. $(K \leq N \leq 100\,000, K \in \{1,2\})$</p>

<p>Each of the next $N-1$ lines contains three integers $a_i$, $b_i$, and $c_i$, indicating that there is a bidirectional road between buildings $a_i$ and $b_i$ with length $c_i$. $(1 \leq c_i \leq 100)$</p>

<p>It is guaranteed that the given graph forms a tree.</p>

### 출력

<p>Print a single integer: the minimum possible value of the maximum communication complexity among all regions.</p>
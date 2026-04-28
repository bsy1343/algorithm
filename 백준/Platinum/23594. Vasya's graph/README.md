# [Platinum I] Vasya's graph - 23594

[문제 링크](https://www.acmicpc.net/problem/23594)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 18, 정답: 12, 맞힌 사람: 11, 정답 비율: 64.706%

### 분류

자료 구조, 집합과 맵, 분리 집합, 트리를 사용한 집합과 맵, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p>Vasya has got a graph. The graph has $N$ nodes, but it&#39;s got no eges yet. Vasya cares a lot about the future graph structure: he knows $K$ pairs of nodes {$u_j$, $v_j$}, such that if there is a path between these nodes in the graph, the <em>irredeemable</em> will happen to the graph. Vasya must prevent it at all costs.</p>

<p>Vasya has made a list of $M$ <strong>unoriented</strong> edges. Vasya will examine the edges in the preset order and he will surely put them into the graph, if possible. If adding another edge will cause the <em>irredeemable</em>, Vasya will simply discard such an edge. Your task is to find out which edges are good for the graph and which ones must end up in the trash.</p>

### 입력

<p>The first line of the input file contains three integers $N$, $K$ and $M$ ($1 \leq N \leq 10^5$, $0 \leq K, M \leq 10^5$).</p>

<p>It is followed by $K$ lines, with the $i$-th line containing two integers $u_i$ and $v_i$ &nbsp;--- the numbers of conflicting nodes, which should not have any edges between them ($1 \leq u_i &lt; v_i \leq N$). The conflicting node pairs are unique.</p>

<p>Next come $M$ lines with the $i$-th line containing two integers $\tilde u_i$ and $\tilde v_i$ &nbsp;--- the numbers of nodes of the edge which can be added to the graph ($1 \leq \tilde u_i &lt; \tilde v_i \leq N$). These edges are provided in the order of examination. Edges in the list are unique.</p>

### 출력

<p>The first line of the output file must contain the number of edges that Vasya can accomodate into the graph. The second line must contain space-separated numbers of edges in the ascending order.</p>
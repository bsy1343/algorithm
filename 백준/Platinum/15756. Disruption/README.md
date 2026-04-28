# [Platinum I] Disruption - 15756

[문제 링크](https://www.acmicpc.net/problem/15756)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 213, 정답: 100, 맞힌 사람: 84, 정답 비율: 53.503%

### 분류

자료 구조, 트리, 집합과 맵, 분리 집합, 최소 공통 조상, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p>Farmer John prides himself on running a well-connected farm. The farm is a collection of $N$ pastures ($2 \leq N \leq 50,000$), pairs of which are connected with $N-1$ bi-directional pathways, each having unit length. Farmer John notices that using an appropriate series of these pathways, it is possible to travel from any pasture to any other pasture.</p>

<p>Although FJ&#39;s farm is connected, he worries what might happen if one of the pathways gets blocked, as this would effectively partition his farm into two disjoint sets of pastures, where the cows could travel within each set but not between the sets. FJ therefore builds a set of $M$ additional bi-directional pathways ($1 \leq M \leq 50,000$), each with a positive integer length at most $10^9$. The cows still only use the original pathways for transit, unless one of these becomes blocked.</p>

<p>If one of the original pathways becomes blocked, the farm becomes partitioned into two disjoint pieces, and FJ will select from among his extra pathways a single replacement pathway that re-establishes connectivity between these two pieces, so the cows can once again travel from any pasture to any other pasture.</p>

<p>For each of the original pathways on the farm, help FJ select the shortest suitable replacement pathway.</p>

### 입력

<p>The first line of input contains $N$ and $M$. Each of the next $N-1$ lines describes an original pathway using integers $p$, $q$, where $p \neq q$ are the pastures connected by the pathway (in the range $1 \ldots N$). The remaining $M$ lines each describe an extra pathway in terms of three integers: $p$, $q$, and $r$, where $r$ is the length of the pathway. At most one pathway runs between any pair of pastures.</p>

### 출력

<p>For each of the $N-1$ original pathways in the order they appear in the input, output the length of the shortest suitable replacement pathway which would re-connect the farm if that original pathway were to be blocked. If no suitable replacement exists, output -1.</p>
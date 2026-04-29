# [Gold I] Independent Set (Max) - 33095

[문제 링크](https://www.acmicpc.net/problem/33095)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 33, 정답: 16, 맞힌 사람: 16, 정답 비율: 50.000%

### 분류

그래프 이론, 그래프 탐색, 그리디 알고리즘, 깊이 우선 탐색, 다이나믹 프로그래밍, 방향 비순환 그래프, 위상 정렬, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>You are given a tree of $N$ nodes (numbered from $1$ to $N$). The edges are numbered from $1$ to $N - 1$; edge $i$ connects node $U_i$ and $V_i$.</p>

<p>A non-empty set of nodes is <em>independent</em> if none of the nodes in the set are adjacent to each other. The following illustration provides an example of sets which are independent, and sets which are not. The nodes colored in red are the members of the set.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33095.%E2%80%85Independent%E2%80%85Set%E2%80%85(Max)/e8910774.png" data-original-src="https://boja.mercury.kr/assets/problem/33095-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 363px; height: 150px;"></p>

<p>The <em>score</em> of an independent set can be calculated as the product of:</p>

<ul>
	<li>the number of nodes in the set, and</li>
	<li>the minimum number of edges such that all nodes in the set are still connected.</li>
</ul>

<p>The following illustration provides an example for calculating the score of an independent set. There are $2$ nodes in the set. The minimum number of edges to connect all nodes in the set is $3$, as shown by the edges colored in red. The score of this set is $2 \cdot 3 = 6$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33095.%E2%80%85Independent%E2%80%85Set%E2%80%85(Max)/7146e727.png" data-original-src="https://boja.mercury.kr/assets/problem/33095-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 147px; height: 110px;"></p>

<p>Note that the score of an independent set consisting of only $1$ node is $0$.</p>

<p>Determine the <strong>maximum</strong> score over all non-empty independent sets within the tree.</p>

### 입력

<p>The first line consists of an integer $N$ ($2 ≤ N ≤ 100\, 000$).</p>

<p>Each of the next $N - 1$ lines consists two integers $U_i$ $V_i$ ($1 ≤ U_i , V_i ≤ N$). The input edges form a tree.</p>

### 출력

<p>Output a single integer representing the <strong>maximum</strong> score over all non-empty independent sets within the tree.</p>
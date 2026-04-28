# [Platinum III] Vertex Merge Game - 23736

[문제 링크](https://www.acmicpc.net/problem/23736)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 94, 정답: 53, 맞힌 사람: 49, 정답 비율: 59.036%

### 분류

그래프 이론, 그리디 알고리즘, 게임 이론, 최소 스패닝 트리

### 문제 설명

<p>Yunee is going to challenge Woongbae with a game that Yunee invented. Yunee&#39;s game is called the Vertex Merge Game and it is played on an edge-weighted connected graph. The game consists of several rounds, and each round proceeds as follows.</p>

<ol>
	<li>At the start of each round, Yunee colors each vertex either red or blue. There should be at least one red vertex and one blue vertex after coloring.</li>
	<li>Yunee receives points equal to $\text{(the number of red vertices)} \times \text{(the number of blue vertices)}$.</li>
	<li>Woongbae selects an edge that connects a red vertex and a blue vertex.</li>
	<li>Woongbae receives points equal to the weight of the selected edge.</li>
	<li>Merge the two vertices at the ends of the selected edge. All edges are preserved after merging.</li>
</ol>

<p>Repeat the rounds until there is only one vertex left in the graph. Then the game ends, and the person with higher total points wins the game.</p>

<p>Given a graph, find out who wins the game when both Yunee and Woongbae play the game optimally. Note that their goal is to win the game, not to maximize their points.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23736.%E2%80%85Vertex%E2%80%85Merge%E2%80%85Game/e1981898.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/23736.%E2%80%85Vertex%E2%80%85Merge%E2%80%85Game/e1981898.png" data-original-src="https://upload.acmicpc.net/e11e96fd-caed-4c22-a04e-25b48e6b48e2/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width: 100%; width: 720px;" /></p>

### 입력

<p>The first line contains two integers $N$ and $M$ $(2\leq N \leq 100,000, 1\leq M \leq 300,000)$. $N$ is the number of vertices and $M$ is the number of edges.</p>

<p>The next $M$ lines describe the edges of the graph. The $i$-th line contains three integers $u_i, v_i, w_i$ $(1\leq u_i, v_i \leq N, 0 \leq w_i \leq 10^9)$. It represents an edge connecting $u_i$ and $v_i$ with a weight $w_i$.</p>

<p>It is guaranteed that the given graph is connected.</p>

### 출력

<p>If Yunee wins, output <code>win</code>. If Woongbae wins, output <code>lose</code>. If there is a tie, output <code>tie</code>.</p>
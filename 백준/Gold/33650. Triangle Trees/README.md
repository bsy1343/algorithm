# [Gold IV] Triangle Trees - 33650

[문제 링크](https://www.acmicpc.net/problem/33650)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 39, 정답: 15, 맞힌 사람: 14, 정답 비율: 50.000%

### 분류

그래프 이론, 그래프 탐색, 그리디 알고리즘, 깊이 우선 탐색, 너비 우선 탐색

### 문제 설명

<p>A triangle tree is an undirected graph in which every cycle contains exactly three edges. Recall that a cycle is a sequence of at least $3$ distinct vertices $v_1,v_2,\dots ,v_k$ such that there is an edge between $v_i$ and $v_{i+1}$ for $i=1,\dots ,k-1$ and there is also an edge between $v_k$ and $v_1$.</p>

<p>A colouring of a graph is an assignment of colours to the vertices such that the two endpoints of each edge of the graph receive different colours. Given a triangle tree, your task is to find a colouring which uses the smallest possible number of colours.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33650.%E2%80%85Triangle%E2%80%85Trees/3e50d3db.png" data-original-src="https://boja.mercury.kr/assets/problem/33650-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 190px;"></p>

<p style="text-align: center;"><b>Figure 1</b>: Illustration of the second sample case. The number written just outside the vertex corresponds to the colour it receives corresponding to the output for that sample case.</p>

### 입력

<p>The first line of input contains two integers $N$ ($1≤N≤10^5$) and $M$ ($0≤M≤10^5$). The next $M$ lines each contain two integers $u$ and $v$ ($1≤u,v≤N$) indicating that the graph contains an edge between $u$ and $v$. It is guaranteed that $u \ne v$, all edges are unique, and that the graph is indeed a triangle tree.</p>

### 출력

<p>Output $N$ integers indicating the colours of vertices $1,2,\dots ,N$ in order. If you used $k$ colours, the integers should be from the set $\{1,2,\dots ,k\}$. If there are multiple valid colourings, you may output any one of them. Recall the goal is to output such a colouring using the fewest colours possible, i.e. minimize $k$.</p>
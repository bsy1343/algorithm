# [Platinum II] Graph Director - 33112

[문제 링크](https://www.acmicpc.net/problem/33112)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 2, 정답: 1, 맞힌 사람: 1, 정답 비율: 50.000%

### 분류

그래프 이론

### 문제 설명

<p>You are given a simple graph consisting of $N$ vertices (numbered from $1$ to $N$) and $M$ bidirectional edges (numbered from $1$ to $M$). Edge $i$ connects vertices $U_i$ and $V_i$. You are asked to convert each edge into a directed edge. For each edge $i$, you can choose to direct it from $U_i$ to $V_i$ or in the opposite direction.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33112.%E2%80%85Graph%E2%80%85Director/470426a9.png" data-original-src="https://boja.mercury.kr/assets/problem/33112-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 404px; height: 125px;"></p>

<p>The final directed graph has to satisfy the following requirements. For each vertex $j$, there are exactly $A_j$ different possible vertices that can be visited by a walk starting from vertex $j$. A walk consists of traversing <strong>zero</strong> or more directed edges, following the direction in the final directed graph.</p>

<p>Direct the edges, or determine whether it is impossible to achieve. If there are several solutions, you can choose any of them.</p>

### 입력

<p>The first line consists of two integers $N$ $M$ ($2 ≤ N ≤ 2000$; $1 ≤ M ≤ 4000$).</p>

<p>Each of the next $M$ lines consists of two integers $U_i$ $V_i$ ($1 ≤ U_i , V_i ≤ N$). There are no self-loops or multiedges.</p>

<p>The following line consists of $N$ integers $A_j$ ($1 ≤ A_j ≤ N$).</p>

### 출력

<p>If it is impossible to direct the edges in a way that meets the requirements, output <code>-1</code>.</p>

<p>Otherwise, output $M$ lines, each containing two integers $u$ and $v$ representing a directed edge from vertex $u$ to $v$ in your final directed graph. You can output the edges in any order. If there are several solutions, you can output any of them.</p>
# [Platinum II] Walking Around - 33084

[문제 링크](https://www.acmicpc.net/problem/33084)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

자료 구조, 트라이, 트리

### 문제 설명

<p>You are given a weighted tree with $N$ vertices, numbered from $1$ to $N$. The edges are numbered from $1$ to $N - 1$, where edge $i$ connects two vertices $U_i$ and $V_i$ with a weight of a non-negative integer $W_i$.</p>

<p>A path in the tree is defined as a sequence of unique vertices $(u_0, u_1, \dots , u_m)$ for some $m ≥ 1$ such that each pair of adjacent vertices, $(u_j , u_{j+1})$ for all $0 ≤ j &lt; m$, is connected by an edge in the tree. Define the score of a path $(u_0, u_1, \dots , u_m)$ as the bitwise XOR of the weight of all edges in the path, i.e. $\text{XOR}(w_0, w_1, \dots , w_{m-1})$ where $w_j$ is the weight of the edge that connects $u_j$ and $u_{j+1}$ (for all $0 ≤ j &lt; m$).</p>

<p>Your task is to find the minimum and the maximum score of any path that can be obtained from the given tree.</p>

<p>For example, the minimum and the maximum score of any path in the following tree are path $(4, 2, 1)$ with a score of $\text{XOR}(2, 3) = 1$, and path $(5, 2, 1, 3)$ with a score of $\text{XOR}(8, 3, 4) = 15$, respectively.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33084.%E2%80%85Walking%E2%80%85Around/00722fdc.png" data-original-src="https://boja.mercury.kr/assets/problem/33084-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 302px; height: 150px;"></p>

### 입력

<p>Input begins with an integer $N$ ($2 ≤ N ≤ 100\, 000$) representing the number of vertices in the given tree. Each of the next $N - 1$ lines contains three integers $U_i$ $V_i$ $W_i$ ($1 ≤ U_i &lt; V_i ≤ N$; $0 ≤ W_i ≤ 10^9$) representing edge $i$.</p>

### 출력

<p>Output two space-separared integers in a single line, representing the minimum and the maximum score of any path that can be obtained from the given tree in that order.</p>
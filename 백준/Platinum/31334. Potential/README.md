# [Platinum II] Potential - 31334

[문제 링크](https://www.acmicpc.net/problem/31334)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 3, 맞힌 사람: 2, 정답 비율: 8.333%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>You are given a weighted directed graph. Let each vertex $i$ have potential $\Phi_i$. Let $w_{uv}$ be the weight of the edge $(u, v)$. Then, define the new weight as $w&#39;_{uv} = w_{uv} + \Phi_u - \Phi_v$.</p>

<p>Find such integer potentials $\Phi_i$ that the weights $w&#39;$ for all edges will be equal.</p>

### 입력

<p>The first line of input contains an integer $t$, the number of test cases.</p>

<p>Each test case starts with a line containing two integers $n$ and $m$: the number of vertices and edges in the graph ($1 \le n \le 300\,000$, $0 \le m \le 300\,000$). Each of the next $m$ lines contains three integers $x_i$, $y_i$ and $w_i$: start vertex, end vertex and weight of an edge ($1 \le x_i, y_i \le n$, $-10^9 \le w_i \le 10^9$). It is guaranteed that there are no self-loops and no multiple edges in the graph.</p>

<p>That the sum of all $n$ and all $m$ is guaranteed to not exceed $600\,000$.</p>

### 출력

<p>For each test case, on the first line, print &quot;<code>YES</code>&quot; if an integer solution exists, or &quot;<code>NO</code>&quot; otherwise.</p>

<p>If the answer is positive, on next line, print $n$ integers: the potentials of the vertices. The potentials must not exceed $10^{18}$ by absolute value. It is guaranteed that, if a solution exists, there also exists a solution satisfying the above requirement.</p>

<p>If there is more than one solution, output any one of them.</p>
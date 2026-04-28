# [Platinum III] Degree of Spanning Tree - 21255

[문제 링크](https://www.acmicpc.net/problem/21255)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 10, 맞힌 사람: 7, 정답 비율: 24.138%

### 분류

자료 구조, 그래프 이론, 그리디 알고리즘, 정렬, 애드 혹, 해 구성하기, 분리 집합

### 문제 설명

<p>Given an undirected connected graph with $n$ vertices and $m$ edges, your task is to find a spanning tree of the graph such that for every vertex in the spanning tree its degree is not larger than $\frac{n}{2}$.</p>

<p>Recall that the degree of a vertex is the number of edges it is connected to.</p>

### 입력

<p>There are multiple test cases. The first line of the input contains an integer $T$ indicating the number of test cases. For each test case:</p>

<p>The first line contains two integers $n$ and $m$ ($2 \le n \le 10^5$, $n-1 \le m \le 2 \times 10^5$) indicating the number of vertices and edges in the graph.</p>

<p>For the following $m$ lines, the $i$-th line contains two integers $u_i$ and $v_i$ ($1 \le u_i, v_i \le n$) indicating that there is an edge connecting vertex $u_i$ and $v_i$. Please note that there might be self loops or multiple edges.</p>

<p>It&#39;s guaranteed that the given graph is connected. It&#39;s also guaranteed that the sum of $n$ of all test cases will not exceed $5 \times 10^5$, also the sum of $m$ of all test cases will not exceed $10^6$.</p>

### 출력

<p>For each test case, if such spanning tree exists first output &quot;Yes&quot; (without quotes) in one line, then for the following $(n-1)$ lines print two integers $p_i$ and $q_i$ on the $i$-th line separated by one space, indicating that there is an edge connecting vertex $p_i$ and $q_i$ in the spanning tree. If no valid spanning tree exists just output &quot;No&quot; (without quotes) in one line.</p>

### 힌트

<p>For the first sample test case, the maximum degree among all vertices in the spanning tree is 3 (both vertex 1 and vertex 4 has a degree of 3). As $3 \le \frac{6}{2}$ this is a valid answer.</p>

<p>For the second sample test case, it&#39;s obvious that any spanning tree will have a vertex with degree of 2, as $2 &gt; \frac{3}{2}$ no valid answer exists.</p>
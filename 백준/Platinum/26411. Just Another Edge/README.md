# [Platinum II] Just Another Edge - 26411

[문제 링크](https://www.acmicpc.net/problem/26411)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

그래프 이론, 애드 혹, 평면 그래프

### 문제 설명

<p>A <strong>simple undirected graph</strong> is an undirected graph that doesn&#39;t contain loops or multiple edges.</p>

<p>A <strong>planar graph</strong> is a simple undirected graph such that it can be embedded in the plane, i.e., it can be drawn on the plane in such a way that its edges intersect only at their common endpoints. In other words, it can be drawn in such a way that no edges cross each other. </p>

<p>An <strong>independent set</strong> is a set of vertices in a graph, no two of which are adjacent.</p>

<p>A <strong>tripartite graph</strong> is a simple undirected graph whose vertices can be divided into three disjoint independent sets.</p>

<p>You are given a planar graph. You are about to add a single edge to it.  You know there is no way to add an edge, such that the resulting graph is planar. How many ways are there to add an edge such that the resulting graph is tripartite?</p>

<p>Note that you can not add multiple edges or loops because the resulting graph must be simple. Edges $a-b$ and $b-a$ are the same and should be counted once.</p>

### 입력

<p>The first line of input contains two integers $n$ and $m$ ($3 \leq n, m \leq 3 \cdot 10^5$) --- the number of vertices and the number of edges respectively.</p>

<p>$m$ lines follow. Each of them contains two integers $a$ and $b$ ($1 \leq a, b \leq n, a \neq b$), meaning that there is an edge between vertices $a$ and $b$.</p>

<p>It&#39;s guaranteed that the graph conforms to the conditions described above.</p>

### 출력

<p>Output a single integer  --- the number of ways to add an edge, such that the resulting graph is tripartite.</p>

### 힌트

<p><em>Isn&#39;t the last sample sample beautiful and concise?</em> </p>
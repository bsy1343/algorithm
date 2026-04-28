# [Gold II] Link-Cut Tree - 31691

[문제 링크](https://www.acmicpc.net/problem/31691)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 22, 정답: 16, 맞힌 사람: 16, 정답 비율: 76.190%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 트리, 집합과 맵, 분리 집합, 최소 스패닝 트리, 역추적

### 문제 설명

<p>BaoBao just learned how to use a data structure called link-cut tree to find cycles in a graph and decided to give it a try. BaoBao is given an undirected graph with $n$ vertices and $m$ edges, where the length of the $i$-th edge equals $2^i$. She needs to find a simple cycle with the smallest length.</p>

<p>A simple cycle is a subgraph of the original graph containing $k$ ($3 &le; k &le; n$) vertices $a_1, a_2, \cdots , a_k$ and $k$ edges such that for all $1 &le; i &le; k$ there is an edge connecting vertices $a_i$ and $a_{(i \bmod k)+1}$  in the subgraph. The length of a simple cycle is the total length of the edges in the cycle.</p>

### 입력

<p>There are multiple test cases. The first line of the input contains an integer $T$ indicating the number of test cases. For each test case:</p>

<p>The first line contains two integers $n$ and $m$ ($3 &le; n &le; 10^5$, $1 &le; m &le; 10^5$) indicating the number of vertices and edges in the original graph.</p>

<p>For the following $m$ lines, the $i$-th line contains two integers $u_i$ and $v_i$ ($1 &le; u_i , v_i &le; n$) indicating an edge connecting vertices $u_i$ and $v_i$ with length $2^i$. There are no self loops nor multiple edges. Note that the graph is not necessarily connected.</p>

<p>It&rsquo;s guaranteed that neither the sum of $n$ nor the sum of $m$ of all test cases will exceed $10^6$.</p>

### 출력

<p>For each test case output one line. If there are no simple cycles in the graph output &ldquo;<code>-1</code>&rdquo; (without quotes); Otherwise output $k$ integers separated by a space in increasing order indicating the indices of the edges in the simple cycle with the smallest length. It can be shown that there is at most one answer.</p>

### 힌트

<p>The first sample test case is shown below. The integers beside the edges are their indices (outside the parentheses) and lengths (inside the parentheses). The simple cycle with the smallest length consists of edges $2$, $4$, $5$ and $6$ with a length of $2^2 + 2^4 + 2^5 + 2^6 = 116$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31691.%E2%80%85Link-Cut%E2%80%85Tree/2dbc2330.png" data-original-src="https://upload.acmicpc.net/65d3c9cb-b16c-4dfd-81b2-065aeb29e834/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 81px;" /></p>
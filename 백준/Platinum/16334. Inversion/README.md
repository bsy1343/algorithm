# [Platinum III] Inversion - 16334

[문제 링크](https://www.acmicpc.net/problem/16334)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 97, 정답: 64, 맞힌 사람: 63, 정답 비율: 74.118%

### 분류

수학, 다이나믹 프로그래밍, 그래프 이론, 조합론, 위상 정렬

### 문제 설명

<p>A sequence p<sub>1</sub>, p<sub>2</sub>, . . . , p<sub>n</sub> is called a permutation of n numbers 1, 2, . . . , n if any number in the range [1, n] occurs exactly once in it. The pair (i, j) of integers in the range 1 to n is called an inversion if i &lt; j and p<sub>i</sub> &gt; p<sub>j</sub>.</p>

<p>Let&rsquo;s call an inversion graph a graph which has exactly n vertices and there is and an edge between the pair (i, j) if and only if this pair is an inversion.</p>

<p>A set s of vertices of a graph is called independent if no two vertices from this set have an edge between them. A set t of vertices of a graph is called dominant if every vertice which does not belong to the set has an edge between at least one vertice which belongs to it. A set g of vertices of a graph is called independent-dominant if it is both dominant and independent.</p>

<p>You have an inversion graph of a particular permutation 1, 2, . . . n which is defined with pairs of vertices (a<sub>i</sub>, b<sub>i</sub>) which have an edge between them. Find the number of independent-dominant sets of the graph.</p>

<p>It is guaranteed that the answer does not exceed 10<sup>18</sup>.</p>

### 입력

<p>The first line contains two integers n and m (1 &le; n &le; 100, 0 &le; m &le; n&times;(n&minus;1)/2) &mdash; the number of vertices of the graph and the number of edges in the graph.</p>

<p>Each of the next m lines contains two integers u<sub>i</sub> and v<sub>i</sub> (1 &le; u<sub>i</sub>, v<sub>i</sub> &le; n), which means that there is an edge between u<sub>i</sub> and v<sub>i</sub>.</p>

<p>It is guaranteed that there exists a permutation that gives this graph.</p>

### 출력

<p>Print out the number of independent-dominant sets of vertices of the graph.</p>

<p>It is guaranteed that the answer does not exceed 10<sup>18</sup>.</p>

### 힌트

<p>The first sample is graph for permutation [1, 4, 2, 3]. We can select two sets of nodes: (1, 3, 4) or (1, 2).</p>

<p>The second sample is graph for permutation [3, 5, 4, 1, 2]. We can select three sets of nodes: (1, 2),(1, 3),(4, 5).</p>

<p>The third sample is a graph for permutation [2, 4, 1, 5, 7, 6, 3].</p>

<p>The fourth sample is a graph for permutation [5, 2, 1, 4, 3].</p>
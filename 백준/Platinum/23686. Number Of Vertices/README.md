# [Platinum V] Number Of Vertices - 23686

[문제 링크](https://www.acmicpc.net/problem/23686)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 13, 맞힌 사람: 13, 정답 비율: 81.250%

### 분류

그래프 이론, 애드 혹, 홀짝성, 오일러 경로

### 문제 설명

<p><em>New meta.</em></p>

<p>A <strong>zigzag cycle</strong> in an undirected graph is a sequence of vertices $a_0, a_1, \ldots, a_{k-1}$, \uline{not necessarily distinct}, such that for all $i: 0 \leq i &lt; k$ $a_i$ and $a_{(i+1) \mod k}$ are adjacent in the graph and one of the following holds:</p>

<ol>
	<li>$a_{(i+k-1)\mod k} &lt; a_i, a_i &gt; a_{(i+1) \mod k}$</li>
	<li>$a_{(i+k-1)\mod k} &gt; a_i, a_i &lt; a_{(i+1) \mod k}$</li>
</ol>

<p>A cycle contains the edge $(u, v)$ $p$ times if there exist exactly $p$ distinct $i: 0 \leq i &lt; k$, such that $a_i = u, a_{(i+1) \mod k} = v$ or $a_i = v, a_{(i+1) \mod k} = u$.&nbsp;</p>

<p>A graph is <strong>splittable</strong> if there exists a set of zigzag cycles, such that for each edge exactly one cycle contains it $1$ time and all the remaining cycles contain it $0$ times, i.e. you can split edges of the graph into zigzag cycles.</p>

<p>There is a graph which is initially empty. Process the following types of queries:</p>

<ol>
	<li>Add an edge between vertices $u$ and $v$.</li>
	<li>Remove an edge between vertices $u$ and $v$.</li>
</ol>

<p>After each query print whether the graph is splittable.</p>

### 입력

<p>The first line contains two integers $n$ and $q$ ($2 \leq n \leq 3 \cdot 10^5, 1 \leq q \leq 3 \cdot 10^5$) --- the number of vertices in the graph and the number of queries, respectively.</p>

<p>$q$ lines follow. $i$-th of them contains three integers $t, u, v$ ($t \in \{1, 2\}, 1 \leq u &lt; v \leq n$) --- the type of query and the endpoints of the edge you have to add if $t = 1$ or remove if $t = 2$. No query will ask to you to add an already present edge or to delete an absent one.</p>

### 출력

<p>Print $q$ lines. $i$-th of them should contain <code>1</code> if the graph is splittable after the first $i$ queries and <code>0</code> otherwise.</p>

### 힌트

<p>After processing all the queries one possible set of zigzag cycles is $\{[1,4,3,5], [2,6,4,5]\}$.</p>
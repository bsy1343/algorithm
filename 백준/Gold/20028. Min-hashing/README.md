# [Gold I] Min-hashing - 20028

[문제 링크](https://www.acmicpc.net/problem/20028)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 82, 정답: 49, 맞힌 사람: 42, 정답 비율: 65.625%

### 분류

그래프 이론, 그래프 탐색, 이분 그래프

### 문제 설명

<p>Consider an undirected simple graph $G = (V, E)$. The problem of finding a node with <em>similar connectivity</em>&nbsp;is a well-researched topic, because it acts as a good metric to determine which nodes are relevant to other nodes. Services such as &quot;friend recommendation&quot; in Facebook is a good example of its applications. To formalize the notion of similarity, the concept of <em>Jaccard similarity</em>&nbsp;can be used, which is defined as $|N(v_1) \cap N(v_2)| / |N(v_1) \cup N(v_2)|$, where $N(v) = \{u | (u, v) \in E\}$.&nbsp;</p>

<p>Here, we will instead discuss the <em>min-hashing</em>&nbsp;method. Assume each node $v$ has the label $l_v$. The <em>shingle value</em> $s_v$ of node $v$ is defined as $s_v = \min \{l_u | u \in N(v) \}$. This method is efficient enough to keep up with industrial needs, and it is also a great metric for similarity: the Jaccard similarity between the set of neighbors $N(v_1)$ and $N(v_2)$ is an unbiased estimator of the probability that nodes $v_1$ and $v_2$ have the same shingle values, for random unique labels.</p>

<p>Let&#39;s think about a variant of min-hashing:&nbsp;we repeatedly perform min-hashing by taking the label as the previous iteration&#39;s shingle value. In this variant, for each node $v$ and the number of iterations $k$, the value $h^{(k)}_v$ is defined as</p>

<p>$$<br />
h^{(k)}_v = \begin{cases}<br />
s_v, &amp; \text{if $k = 1$}\\<br />
\min \{h^{(k-1)}_u | u \in N(v) \}, &amp; \text{if $k \geq 2$} \\<br />
\end{cases}<br />
$$</p>

<p>For each $k$, let $c_k$ be the number of unordered pairs of distinct vertices $\{u, v\}$ such that $h^{(k)}_u = h^{(k)}_v$. Then, how does the value $c_k$ change as $k$ increases? In this problem, your task is to compute $\max_{k &nbsp;\in \mathbb{N}} c_k$.</p>

### 입력

<p>The first line contains two positive integers $n$ and $m$ $(1 \leq n \leq 100\,000, 1 \leq m \leq 250\,000)$&nbsp;representing the number of nodes and the number of edges, respectively. The nodes are numbered from $1$ to $n$. Note that these are \textbf{not} the labels of the nodes.</p>

<p>The second line contains $n$ integers comprising a permutation of the first $n$ positive integers, where the $i$-th number in the line represents the initial label of node $i$.</p>

<p>Each of the next $m$ lines contains two integers.&nbsp;The $i$-th of these lines contains two distinct integers $u_i$ and $v_i$&nbsp;$(1 \leq u_i, v_i \leq n)$,&nbsp;which means $\{u_i, v_i\} \in E$.</p>

<p>The input will be set in a way such that there are no self-loops, parallel edges, or nodes with a degree of zero.</p>

### 출력

<p>Print the maximum value of $c_k$ over all positive integers $k$.</p>
# [Platinum I] Median on Binary Tree - 19397

[문제 링크](https://www.acmicpc.net/problem/19397)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>Yuuka has a binary tree with vertices which are conveniently labeled with $1, 2, \dots, n$. For each $i \geq 2$, there is an edge between vertices $i$ and $\lfloor i / 2 \rfloor$. The $i$-th vertex has weight $w_i$ associated with it, and all weights are distinct.</p>

<p>Consider a subtree of the given tree (a subgraph which is itself a tree) which consists of vertices $v_1, v_2, \dots, v_k$ such that $w_{v_1} &lt; w_{v_2} &lt; \dots &lt; w_{v_k}$. The <em>$a$-median</em> of this subtree is then $w_{v_{\lfloor (k - a + 1) / 2 \rfloor}}$ for $0 \leq a &lt; k$.</p>

<p>For each $a \in \{0, 1, 2, \dots, n - 1\}$, find the largest $a$-median among all subtrees of the given tree.</p>

### 입력

<p>The input contains zero or more test cases, and is terminated by end-of-file. For each test case:</p>

<p>The first line contains an integer $n$ ($1 \leq n \leq 2 \cdot 10^5$).&nbsp;</p>

<p>The second line contains $n$ integers $w_1, w_2, \dots, w_n$ ($1 \leq w_i \leq n$, and the numbers $w_1, w_2, \dots, w_n$ are all distinct).  It is guaranteed that the sum of all $n$ does not exceed $2 \cdot 10^5$.</p>

### 출력

<p>For each test case, output $n$ integers $M_0, M_1, \dots, M_{n - 1}$ where $M_a$ denotes the largest $a$-median.</p>
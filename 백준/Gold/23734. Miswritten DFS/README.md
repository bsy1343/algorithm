# [Gold I] Miswritten DFS - 23734

[문제 링크](https://www.acmicpc.net/problem/23734)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 362, 정답: 73, 맞힌 사람: 65, 정답 비율: 21.242%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍, 재귀

### 문제 설명

<p>Yunee is working on a data structures assignment. Yunee wrote a function <code>DFS</code>&nbsp;that traverses a binary tree in pre-order. However, Yunee&#39;s code recursively called <code>DFS</code>&nbsp;on the left subtree twice, by mistake.</p>

<pre>
<code>function DFS(node v):
    visit v
    if v &rarr; left exists:
        DFS(v &rarr; left)
        DFS(v &rarr; left)
    if v &rarr; right exists:
        DFS(v &rarr; right)</code></pre>

<p>The pseudocode of Yunee&#39;s <code>DFS</code> is as above. Now consider the following example.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23734.%E2%80%85Miswritten%E2%80%85DFS/d82d6458.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23734.%E2%80%85Miswritten%E2%80%85DFS/d82d6458.png" data-original-src="https://upload.acmicpc.net/e1664bef-fd8d-4db6-a187-b0ce171414b3/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width: 100%; width: 200px;" /></p>

<p>If we pre-order traverse the above tree, the nodes $1, 2, 3, 4, 5$ are visited in order. However, Yunee&#39;s <code>DFS</code>&nbsp;visits the nodes $1, 2, 3, 3, 4, 2, 3, 3, 4, 5$ in order.</p>

<p>Given a binary tree, find the $K$-th node visited by Yunee&#39;s <code>DFS</code>. It is guaranteed that $K$ is not greater than the total number of visits. The nodes are numbered from $1$ to $N$ and the root node is always node $1$.</p>

### 입력

<p>The first line contains two integers $N$ and $K$ $(1\leq N \leq 10^5, 1\leq K \leq 10^{18})$. $N$ represents the number of nodes in the tree. $K$ is not greater than the total number of visits.</p>

<p>The next $N$ lines describe the tree. The $i$-th line contains two integers $l_i$ and $r_i$ $(0 \leq l_i, r_i \leq N)$. $l_i$ represents the left child of node $i$ and $r_i$ represents the right child of node $i$. If there is no corresponding child, $0$ is given in place of $l_i$ or $r_i$.</p>

<p>The root node is always node $1$.</p>

### 출력

<p>Output the $K$-th node visited by Yunee&#39;s <code>DFS</code>.</p>
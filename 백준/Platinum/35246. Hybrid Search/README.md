# [Platinum IV] Hybrid Search - 35246

[문제 링크](https://www.acmicpc.net/problem/35246)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

(분류 없음)

### 문제 설명

<p>You are the proud owner of a newly built house in the Efficient Residences complex, so effectively built that there are no redundant streets in it, looking like a tree from higher up. Rumor has it that the constructor will start connecting houses to the sewage network. You know in which order will the constructor go through the houses. Since you want yours connected as soon as possible, you count up a bribe to change a small part of the ordering process in your favour.</p>

<p>You are given a tree with $N$ nodes that is rooted in the node with index $1$. You are also given the index of a node $K$, $1 \leq K \leq N$. We can do the following types of tree searches:</p>

<ul>
<li>Start with a BFS from $1$, and at some point change into a DFS (possibly immediately in $1$). We don't necessarily have to change into DFS during the search.</li>
<li>Start with a DFS from $1$, and at some point change into a BFS (possibly immediately in $1$). We don't necessarily have to change into BFS during the search.</li>
</ul>

<p>After we change the search type (e.g. in node $z$), we will only visit the nodes from $z$'s subtree further on. We suppose that $z$ was already visited in the first search.</p>

<p>You must compute for each of the two types of hybrid searches what is the smallest position in which the node with index $K$ can appear.</p>

<p><strong>The tree neighbours are considered in the Breadth/Depth-First Searches in the order given in the input.</strong> You can consult below the exact implementations we use for DFS and BFS:</p>

<p><strong>Algorithm 1</strong> Depth-First Search (DFS) / Breadth-First Search (BFS)</p>

<pre><strong>function</strong> traversal(<em>adj_lists</em>, <em>type</em>):
    <em>p</em> ← empty list {will contain the traversal nodes}
    <em>waiting</em> ← empty list {behaves as either a stack or a queue, depending on type}
    <strong>append</strong> (1, <em>None</em>) to <em>waiting
    </em><strong>while</strong> <em>waiting</em> is not empty:
        (<em>node</em>, <em>father</em>) ← <strong>assign and pop rightmost if</strong> <em>type</em> = <strong>DFS else leftmost</strong> from <em>waiting
</em>        <strong>append</strong> <em>node</em> to <em>p
</em>        <strong>for each</strong> <em>neigh</em> in <strong>reversed</strong>(<em>adj_lists[node]</em>) <strong>if</strong> <em>type</em> = <strong>DFS else</strong> <em>adj_lists[node]</em>: {we need to reverse to enforce the input ordering for DFS}
            <strong>if</strong> <em>neigh</em> ≠ <em>father</em>:
                <strong>append</strong> (<em>neigh</em>, <em>node</em>) to <em>waiting
</em>traversal(<em>adj_lists</em>, <em>type</em> ← <strong>DFS</strong> or <strong>BFS</strong>)
</pre>

### 입력

<p>The first line contains two numbers, $N$ and $K$ ($1 \leq N \leq 10^5$).</p>

<p>The next $N - 1$ lines contain two numbers each, $A$ and $B$ ($1 \leq A, B \leq N$). There is an edge in the tree between the nodes indexed $A$ and $B$.</p>

<p><strong>If $Y$ and $Z$ are children of $X$ and the edge $X$ $Y$ (or $Y$ $X$) appears before the edge $X$ $Z$ (or $Z$ $X$) in the input, then $Y$ will appear before $Z$ in any DFS or BFS from a node whose subtree contains $X$.</strong></p>

### 출력

<p>Write on the first line the smallest position in the hybrid search the node indexed $K$ may be found (counting from $1$), if we start with a BFS.</p>

<p>Write on the second line the analog if we start with a DFS.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35246.%E2%80%85Hybrid%E2%80%85Search/28ee30cf.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35246-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 600px; height: 304px;"></p>

<p style="text-align: center;">Figure H.1: For the first example, if we start with BFS, it is optimal to switch to DFS in node $3$, $K = 13$ being the seventh visited node. If we switched in node $11$ instead, we would have needed $11$ positions instead. If we start with DFS, we could optimally change in either node $3$ or node $11$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35246.%E2%80%85Hybrid%E2%80%85Search/dfe942ec.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35246-2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 600px; height: 183px;"></p>

<p style="text-align: center;">Figure H.2: For the second example, if we start with DFS, it is also possible to achieve $7$ if we never change to BFS.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35246.%E2%80%85Hybrid%E2%80%85Search/0a1d953f.png" data-original-src="https://boja.mercury.kr/assets/problem/35246-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 600px; height: 341px;"></p>

<p style="text-align: center;">Figure H.3: For the third example, it doesn't matter with which search we begin, as both hybrid strategies have an optimal answer of $9$. Note that if we instead only used one of the two basic searches, we would have gotten both times an answer of $10$.</p>
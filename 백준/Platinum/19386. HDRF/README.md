# [Platinum I] HDRF - 19386

[문제 링크](https://www.acmicpc.net/problem/19386)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 19, 정답: 12, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

자료 구조, 오일러 경로 테크닉, 세그먼트 트리, 트리

### 문제 설명

<p>If you love Big Data, you should be familiar with running code in a distributed manner. This always requires lots of infrastructure elements working together to make the parallel computations possible. One of such elements is usually a scheduler that decides which scheduled tasks are to be started now in some &quot;fair&quot; and &quot;efficient&quot; way.&nbsp;</p>

<p>Based on the nature of the tasks (testing, long-running, real-time, etc.), they are organized into hierarchical structure which can be represented as a rooted tree.</p>

<p>The following problem is inspired by one of the modern scheduling algorithms called Hierarchical Dominant Resource Fairness (HDRF).</p>

<p>You are given a rooted tree $T$ with root at vertex $1$ which consists of $n$ vertices. Each vertex $i$ of the tree gets a unique priority $v_i$. For each vertex, we can compute the value $r_i$: the smallest $v_i$ in the subtree of vertex $i$ including itself.</p>

<p>Consider the following tree traversal algorithm:</p>

<ul>
	<li>Start at the root vertex.</li>
	<li>Choose the direct child of the current vertex which has the smallest value $r_i$.</li>
	<li>Go to this child.</li>
	<li>If the current vertex is a leaf, write it down and remove it from the tree (when we delete a vertex, we recompute all $r_i$). Otherwise, go to step 2.</li>
</ul>

<p>Repeat the above procedure starting from step 1 until the tree is empty.</p>

<p>Given a tree $T$ and the numbers $v_i$, compute the order in which vertices will be written down.</p>

### 입력

<p>The first line contains an integer $n$ ($2 \leq n \leq 100\,000$), the number of vertices in the tree.</p>

<p>The second line contains $n - 1$ integers, where $i$-th integer $p_i$ ($1 \leq p_i \leq n$) is the parent of vertex $(i + 1)$ in the tree. Vertices are numbered by integers from $1$ to $n$. It is guaranteed that the input forms a valid rooted tree with root at vertex $1$.</p>

<p>The third line contains $n$ distinct integers $v_1, v_2, \ldots, v_n$ ($0 \leq v_i \leq 10^9$), the priorities of vertices.</p>

### 출력

<p>Output $n$ vertices in the order they will be written down by the algorithm.</p>
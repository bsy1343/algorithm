# [Platinum IV] Tree Product - 20614

[문제 링크](https://www.acmicpc.net/problem/20614)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 112, 정답: 30, 맞힌 사람: 27, 정답 비율: 27.273%

### 분류

깊이 우선 탐색, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 트리

### 문제 설명

<p>Given $n$ rooted trees $T_1,T_2,\ldots,T_n$, find two permutations $p_1,p_2,\dots,p_n$ and $q_1,q_2,\ldots,q_n$ such that the diameter of $T_{p_1} \times T_{p_2} \times \ldots \times T_{p_n}$ is maximum and the diameter of $T_{q_1} \times T_{q_2} \times \ldots \times T_{q_n}$ is minimum.</p>

<p>For two rooted trees $A$ and $B$, their <em>tree product</em> $T = A \times B$ is defined as follows: copy tree $A$, and then for each vertex $x$ in it, make a copy of $B$ and merge its root with vertex $x$. See the table below for an example:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20614.%E2%80%85Tree%E2%80%85Product/0fe56ba1.png" data-original-src="https://upload.acmicpc.net/2fccc4ea-310b-42fa-9dcb-800854b4c1a4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 444px; height: 209px;" /></p>

<p>It can be shown that tree product is associative: $(A \times B) \times C = A \times (B \times C)$. So the parentheses in a product of three or more trees can be omitted.</p>

<p>Recall that:</p>

<ul>
	<li>A tree is a connected graph without cycles. A rooted tree has a special vertex called the root. The parent of a vertex $v$ is the last vertex different from $v$ on the path from the root to $v$.</li>
	<li>The diameter of a rooted tree is the length of the longest simple path in the tree, where the length of a path is the number of edges in the path.</li>
</ul>

### 입력

<p>There are multiple test cases. The first line of input contains an integer $T$, indicating the number of test cases. For each test case:</p>

<p>The first line contains an integer $n$ $(1 \le n \le 10^6)$, indicating the number of rooted trees.</p>

<p>Each of the next $n$ lines starts from an integer $m_i$ ($1 \le m_i \le 10^5$), indicating the number of vertices in the $i$-th rooted tree. It is followed by $m_i$ integers $p_{i,1},p_{i,2},\ldots,p_{i,m_i}$ ($0 \le p_{i,j} \le m_i$) on the same line, where the $j$-th of them denotes the parent of the $j$-th vertex. The root of the tree has $0$ as parent.</p>

<p>It is guaranteed that the sum of $m_i$ over all test cases does not exceed $10^6$.</p>

### 출력

<p>For each test case, output two integers: the maximum and the minimum diameter, in that order.</p>

### 힌트

<p>For the first sample test case, $T_1 \times T_2 \times T_3$ will provide the maximum diameter, while $T_3 \times T_2 \times T_1$ will provide the minimum diameter.</p>
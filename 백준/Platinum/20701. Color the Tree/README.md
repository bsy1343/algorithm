# [Platinum III] Color the Tree - 20701

[문제 링크](https://www.acmicpc.net/problem/20701)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 52, 정답: 33, 맞힌 사람: 31, 정답 비율: 62.000%

### 분류

해 구성하기

### 문제 설명

<p>Christina has a rooted tree with $n$ vertices. Initially, all vertices are colored green, except for the root, which is colored red. Christina thinks that the tree is <em>beautiful</em> if two rules are satisfied:</p>

<ul>
	<li>The root is colored red.</li>
	<li>If the vertex is colored red, all vertices on the shortest path between it and the root are also red.</li>
</ul>

<p>Christina repeatedly performs the following operation on the tree --- chooses a vertex and changes its color (if it was red, colors it green; if it was green, colors it red). The following rules must be satisfied while performing the operations:</p>

<ul>
	<li>The tree should stay beautiful.</li>
	<li>The coloring of vertices should be unique. That means there is no moment in the past when each vertex had the same color as it has right now.</li>
</ul>

<p>Your task is to help Christina build the longest possible sequence of operations following the rules.</p>

### 입력

<p>The first line contains an integer $n$ ($1 \le n \le 20$) --- the number of vertices in the tree.</p>

<p>The second line contains $n - 1$ integers $p_i$ ($1 \le p_i \le i$ for $1 \le i \le n - 1$), denoting parent vertices in the tree. The vertices in the tree are numbered from $1$ to $n$, the root has number $1$, the $i$-th vertex has parent $p_{i-1}$ for $2 \le i \le n$.</p>

### 출력

<p>On the first line output an integer $m$ --- the maximum number of operations.&nbsp;</p>

<p>On the second line output $m$ integers $o_i$ ($2 \le o_i \le n)$. $o_i$ is the number of the vertex that changes color during the corresponding operation.</p>

<p>If there are several possible longest sequences, output any one of them.</p>
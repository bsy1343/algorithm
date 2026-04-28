# [Platinum V] Clique Partition - 28054

[문제 링크](https://www.acmicpc.net/problem/28054)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 135, 정답: 79, 맞힌 사람: 73, 정답 비율: 67.593%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>We have a complete graph of size $N$. Find a way to represent the set of edges in this graph as the union of several $N$-vertex trees. Specifically, $K$ denoting the number of trees and $K$ trees $T_1, ..., T_K$ satisfying the following conditions should be output.</p>

<ul>
	<li>Each tree has vertices numbered from $1$ to $N$ and $N-1$ edges, and must not have cycles. (That is, it must satisfy the tree structure.)</li>
	<li>The union of all trees forms a complete graph.</li>
	<li>$K$ should be a minimum.</li>
</ul>

### 입력

<p>Input has only one line containing $N$.</p>

### 출력

<p>Print out $K$ at the first line. $K$ must be the minimum. After that, print the edges of $T_1$ one by one over the following $(N-1)$ lines. Output all $K$ trees in the same way without any empty lines. Each tree must satisfy the condition of the problem.</p>

### 제한

<ul>
	<li>$2 \le N \le 1000$</li>
</ul>
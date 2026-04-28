# [Platinum II] Interactive Reconstruction - 30953

[문제 링크](https://www.acmicpc.net/problem/30953)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 40, 정답: 28, 맞힌 사람: 27, 정답 비율: 71.053%

### 분류

그래프 이론, 애드 혹, 트리, 비트마스킹

### 문제 설명

<p>This is an interactive task where your program will communicate with a grader through standard input and output. Your task is to reconstruct a labelled tree with $N$ nodes and $N-1$ edges. Nodes are labelled from $1$ to $N$.</p>

<p>Your program is allowed to make a few queries of the following type: Your program should print a string of $N$ characters, consisting only of zeros and ones, one corresponding to each node. The grader will return a sequence of $N$ space-separated integers, the $i$-th representing the sum of the values (i.e. digits of the query string) of all neighbours of the $i$-th node. That is, if node $j$ is a neighbour of node $i$, then the $j$-th digit of the query string counts towards the sum in the $i$-th number of the grader&#39;s answer.</p>

<p>See the example below for an illustration.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$2 \leq N \leq 3\cdot 10^4$</li>
	<li>At most $2 \uparrow \uparrow 3 = 2^{(2^2)} = 16$ queries are allowed. The final answer does not count toward this restriction.</li>
</ul>

### 힌트

<p>The tree in question is the following one:</p>

<pre>
<code>1-4-2
  |
  5-3
</code></pre>

<p>With the three queries in the example, it is possible to reconstruct it uniquely.</p>
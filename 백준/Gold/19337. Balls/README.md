# [Gold III] Balls - 19337

[문제 링크](https://www.acmicpc.net/problem/19337)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 83, 정답: 38, 맞힌 사람: 31, 정답 비율: 47.692%

### 분류

자료 구조, 우선순위 큐, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>There are $N$ balls on the number line, each of diameter $1$, numbered from $1$ through $N$. Ball $i$&#39;s leftmost point is located at position $p_i$. Additionally, there is an immovable wall located at position $P$. You have to process $Q$ queries of one of the following forms:</p>

<ul>
	<li>&quot;1 $x$&quot;: Insert a new ball with its leftmost point at $x$. <strong>If this spot is already occupied, do nothing</strong>.</li>
	<li>&quot;2&quot;: Roll the leftmost ball to the right. When a rolling ball (possibly after moving distance zero) collides with a stationary ball, it stops, and the stationary ball begins rolling in the same direction. Specifically, a rolling ball stops at the position $1$ less than the position of the object it collided with. A ball stops when it reaches the wall.</li>
</ul>

<p>Calculate the final positions of the balls.</p>

### 입력

<p>The first line contains three integers $N$, $Q$, and $P$: the initial number of balls, the number of queries, and the position of the wall ($1 \leq N, Q \leq 10^5$, $N \leq P \leq 10^9$).</p>

<p>The second line contains $N$ integers $p_1, p_2, \ldots, p_N$ ($0 \leq p_i &lt; P$). It is guaranteed the positions are distinct.</p>

<p>The next $Q$ lines describe the queries and may have one of the following forms:</p>

<ul>
	<li>&quot;1 $x$&quot; ($0 \leq x &lt; P$)</li>
	<li>&quot;2&quot;</li>
</ul>

### 출력

<p>Print out the final positions of the balls in increasing order on a single line, separated by spaces.</p>
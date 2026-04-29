# [Platinum V] DAG Serialization - 33030

[문제 링크](https://www.acmicpc.net/problem/33030)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 31, 정답: 26, 맞힌 사람: 25, 정답 비율: 86.207%

### 분류

그래프 이론, 그리디 알고리즘, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>Consider a simple single-bit boolean register that supports two operations:</p>

<ul>
	<li><strong>set</strong> --- sets the register to <strong>true</strong> if it was <strong>false</strong>, and returns <strong>true</strong>; otherwise, it returns <strong>false</strong>;</li>
	<li><strong>unset</strong> --- sets the register to <strong>false</strong> if it was <strong>true</strong>, and returns <strong>true</strong>; otherwise, it returns <strong>false</strong>.</li>
</ul>

<p>The initial state of the register is <strong>false</strong>. Suppose there were $n$ operations $op_i$ (for $1 \le i \le n$) where <strong>at most two operations returned true</strong>. Also, we are given the partial order of operations as a directed acyclic graph (DAG): an edge $i \rightarrow j$ means that $op_i$ happened before $op_j$. You are asked whether it is possible to put these operations in some linear sequential order that satisfies the given partial order and such that if operations are applied to the register in that order, their results are the same as given.</p>

### 입력

<p>In the first line, you are given an integer $n$ --- the number of operations ($1 \le n \le 10^5$). In the following $n$ lines, you are given operations in the format "<em>type</em> <em>result</em>", where <em>type</em> is either "<code>set</code>" or "<code>unset</code>" and <em>result</em> is either "<code>true</code>" or "<code>false</code>". It is guaranteed that at most two operations have "<code>true</code>" results. </p>

<p>In the next line, you are given an integer $m$ --- the number of arcs of the DAG ($0 \le m \le 10^5$). In the following $m$ lines, you are given arcs --- pairs of integers $a$ and $b$ ($1 \leq a, b \leq n$; $a \neq b$). Each arc indicates that operation $op_a$ happened before operation $op_b$.</p>

### 출력

<p>Print any linear order of operations that satisfies the DAG constraints and ensures the results of the operations match the ones given in the input. If a correct operation order does not exist, print $-1$.</p>
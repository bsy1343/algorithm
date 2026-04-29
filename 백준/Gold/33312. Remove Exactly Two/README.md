# [Gold II] Remove Exactly Two - 33312

[문제 링크](https://www.acmicpc.net/problem/33312)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 103, 정답: 61, 맞힌 사람: 59, 정답 비율: 61.458%

### 분류

그래프 이론, 그리디 알고리즘, 자료 구조, 집합과 맵, 트리, 트리를 사용한 집합과 맵

### 문제 설명

<p style="text-align: center;"><small><em>Recently, Little John got a tree from his aunt to decorate his house. But as it seems, just one tree is not enough to decorate the entire house. Little John has an idea. Maybe he can remove a few vertices from the tree. That will turn it into more trees! Right?</em></small></p>

<p>You are given a tree<sup>1</sup> of $n$ vertices. You must perform the following operation <strong>exactly twice</strong>.</p>

<ul>
	<li>Select a vertex $v$;</li>
	<li>Remove all edges incident to $v$, and also the vertex $v$.</li>
</ul>

<p>Please find the maximum number of connected components after performing the operation <strong>exactly twice</strong>.</p>

<p>Two vertices $x$ and $y$ are in the same connected component if and only if there exists a path from $x$ to $y$. For clarity, note that the graph with $0$ vertices has $0$ connected components by definition.<sup>2</sup></p>

<hr>
<p><sup>1</sup>A tree is a connected graph without cycles.</p>

<p><sup>2</sup>But is such a graph connected?</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 10^4$). The description of the test cases follows.</p>

<p>The first line of each test case contains a single integer $n$ ($2 \le n \le 2 \cdot 10^5$).</p>

<p>Each of the next $n-1$ lines contains two integers $u_i$ and $v_i$, denoting the two vertices connected by an edge ($1 \le u_i,v_i \le n$, $u_i \neq v_i$). It is guaranteed that the given edges form a tree.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $2 \cdot 10^5$.</p>

### 출력

<p>For each test case, output the maximum number of connected components on a separate line.</p>

### 힌트

<p>On the first test case, removing a vertex twice will make the graph empty. By definition, the number of connected components in the graph with $0$ vertices is $0$. Therefore, the answer is $0$.</p>

<p>On the second test case, removing two vertices $1$ and $2$ leaves $2$ connected components. As it is impossible to make $3$ connected components with $2$ vertices, the answer is $2$.</p>

<p>On the third test case, removing two vertices $1$ and $5$ leaves $4$ connected components, which are $\left\{ 2,4\right\}$, $\left\{ 3\right\}$, $\left\{ 6\right\}$, and $\left\{ 7\right\}$. It can be shown that it is impossible to make $5$ connected components. Therefore, the answer is $4$.</p>
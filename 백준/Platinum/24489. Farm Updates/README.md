# [Platinum II] Farm Updates - 24489

[문제 링크](https://www.acmicpc.net/problem/24489)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 208, 정답: 75, 맞힌 사람: 65, 정답 비율: 33.854%

### 분류

자료 구조, 깊이 우선 탐색, 분리 집합, 그래프 이론, 그래프 탐색, 오프라인 쿼리, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p>Farmer John operates a collection of $N$ farms ($1\le N\le 10^5$), conveniently numbered $1\ldots N$. Initially, there are no roads connecting these farms to each-other, and each farm is actively producing milk.</p>

<p>Due to the dynamic nature of the economy, Farmer John needs to make changes to his farms according to a series of $Q$ update operations ($0\le Q\le 2\cdot 10^5$). Update operations come in three possible forms:</p>

<ul>
	<li>(D x) Deactivate an active farm $x$, so it no longer produces milk.</li>
	<li>(A x y) Add a road between two active farms $x$ and $y$.</li>
	<li>(R e) Remove the $e$th road that was previously added ($e = 1$ is the first road that was added).</li>
</ul>

<p>A farm $x$ that is actively producing milk, or that can reach another active farm via a series of roads, is called a &quot;relevant&quot; farm. For each farm $x$, please calculate the maximum $i$ ($0\le i\le Q$) such that $x$ is relevant after the $i$-th update.</p>

### 입력

<p>The first line of input contains $N$ and $Q$. The next $Q$ lines each contain an update of one of the following forms:</p>

<pre>
D x
A x y
R e
</pre>

<p>It is guaranteed that for updates of type R, $e$ is at most the number of roads that have been added so far, and no two updates of type R have the same value of $e$.</p>

### 출력

<p>Please output $N$ lines, each containing an integer in the range $0\ldots Q$.</p>

### 힌트

<p>In this example, roads are removed in the order $(2,3), (1,2), (2,4)$.</p>

<ul>
	<li>Farm $1$ is relevant just before $(1,2)$ is removed.</li>
	<li>Farm $2$ is relevant just before $(2,4)$ is removed.</li>
	<li>Farm $3$ is relevant just before $(2,3)$ is removed.</li>
	<li>Farms $4$ and $5$ are still active after all queries. Therefore they both stay relevant, and the output for both should be $Q$.</li>
</ul>
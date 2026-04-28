# [Gold I] Graph Theory - 31115

[문제 링크](https://www.acmicpc.net/problem/31115)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 6, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

자료 구조, 집합과 맵, 스위핑, 트리를 사용한 집합과 맵, 우선순위 큐

### 문제 설명

<p>Bobo has an undirected graph $G$ with $n$ vertices labeled by $1, \dots, n$ and $n$ edges. For each $1 \leq i \leq n$, there is an edge between the vertex $i$ and the vertex $(i \bmod n) + 1$. He also has a list of $m$ pairs $(a_1, b_1), \dots, (a_m, b_m)$.</p>

<p>Now, Bobo is going to choose an $i$ and remove the edge between the vertex $i$ and the vertex $(i \bmod n) + 1$.  Let $\delta_i(u, v)$ be the number of edges on the shortest path between the $u$-th and the $v$-th vertex <strong>after the removal</strong>. Choose an $i$ to minimize the maximum among $\delta_i(a_1, b_1), \dots, \delta_i(a_m, b_m)$.</p>

<p>Formally, find the value of $$\min_{1 \leq i \leq n}\left\{\max_{1 \leq j \leq m} \delta_i(a_j, b_j)\right\}\text{.}$$</p>

### 입력

<p>The input consists of several test cases terminated by end-of-file. For each test case,</p>

<p>The first line contains two integers $n$ and $m$.</p>

<p>For the following $m$ lines, the $i$-th line contains two integers $a_i$ and $b_i$.</p>

### 출력

<p>For each test case, output an integer which denotes the minimum value.</p>

### 제한

<ul>
	<li>$2 \leq n \leq 2 \times 10^5$</li>
	<li>$1 \leq m \leq 2 \times 10^5$</li>
	<li>$1 \leq a_i, b_i \leq n$ for each $1 \leq i \leq m$</li>
	<li>In each input, the sum of $n$ does not exeed $2 \times 10^5$. The sum of $m$ does not exceed $2 \times 10^5$.</li>
</ul>

### 힌트

<p>For the first case,</p>

<table class="table table-bordered th-center td-center table-center-30">
	<tbody>
		<tr>
			<th>$i$</th>
			<th>$\delta_i(1, 2)$</th>
			<th>$\delta_i(2, 3)$</th>
		</tr>
		<tr>
			<td>1</td>
			<td>2</td>
			<td>1</td>
		</tr>
		<tr>
			<td>2</td>
			<td>1</td>
			<td>2</td>
		</tr>
		<tr>
			<td>3</td>
			<td>1</td>
			<td>1</td>
		</tr>
	</tbody>
</table>

<p>Choosing $i = 3$ yields the minimum value $1$.</p>
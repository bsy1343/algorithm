# [Platinum I] Fantasia - 19437

[문제 링크](https://www.acmicpc.net/problem/19437)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 64 MB

### 통계

제출: 87, 정답: 14, 맞힌 사람: 14, 정답 비율: 16.471%

### 분류

단절점과 단절선, 오일러 경로 테크닉, 그래프 이론, 트리

### 문제 설명

<p>Professor Zhang has an undirected graph $G$ with $n$ vertices and $m$ edges. Each vertex has an integer weight $w_i$. Let $G_i$ be the graph obtained by deleting the $i$-th vertex from graph $G$. Professor Zhang wants to find the weights of $G_1, G_2, \ldots, G_n$.</p>

<p>The weight of a graph $G$ is defined as follows:</p>

<ul>
	<li>If $G$ is connected, then the weight of $G$ is the product of the weight of each vertex in $G$.</li>
	<li>Otherwise, the weight of $G$ is the sum of the weights of all the connected components of $G$.</li>
</ul>

<p>A connected component $H$ of an undirected graph $G$ is a subgraph in which any two vertices are connected by a path, and no other vertex in $G$ is connected to any vertex from $H$ by a path.</p>

### 입력

<p>There are multiple test cases. The first line of input contains an integer $T$ indicating the number of test cases. For each test case:</p>

<p>The first line contains two integers $n$ and $m$ ($2 \le n \le 10^5$, $1 \le m \le 2 \cdot 10^5$): the number of vertices and the number of edges.</p>

<p>The second line contains $n$ integers $w_1, w_2, \ldots, w_n$ ($1 \le w_i \le 10^9$) denoting the weight of each vertex.</p>

<p>Each of the next $m$ lines contains two integers $x_i$ and $y_i$ ($1 \le x_i, y_i \le n$, $x_i \ne y_i$) denoting an undirected edge.</p>

<p>There are at most $1000$ test cases, the sum of $n$ in all the test cases is at most $1.5 \cdot 10^6$, and the sum of $m$ in all the test cases is also at most $1.5 \cdot 10^6$.</p>

### 출력

<p>For each test case, output the integer $S = (\sum\limits_{i = 1}^{n}{i \cdot z_i})$ modulo $10^9 + 7$, where $z_i$ is the weight of $G_i$.</p>
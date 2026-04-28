# [Platinum IV] Drifting - 30364

[문제 링크](https://www.acmicpc.net/problem/30364)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 17, 맞힌 사람: 13, 정답 비율: 46.429%

### 분류

다이나믹 프로그래밍, 그래프 이론, 자료 구조, 최단 경로, 데이크스트라, 트리를 사용한 집합과 맵, 방향 비순환 그래프

### 문제 설명

<p>You are given a weighted directed graph of $N$ vertices and $M$ edges, with vertices numbered $1$ to $N$ and edges numbered $1$ to $M$. The $i$-th ($1 \le i \le M$) edge connects from vertex $u_i$ to vertex $v_i$ ($u_i &lt; v_i$), and the weight of the edge is $w_i$.</p>

<p>Also, $K$ triplets of integers are given. The $i$-th ($1 \le i \le K$) triplet is $(a_i, b_i, c_i)$ ($a_i &lt; b_i &lt; c_i$).</p>

<p>You start at vertex $1$ and move to vertex $N$ by repeatedly moving along an edge.</p>

<p>In addition, for all $i$ ($1 \le i \le K$), if you move from vertex $a_i$ to vertex $b_i$ directly, we must next move to a vertex <strong>other than</strong> vertex $c_i$.</p>

<p>Judge whether it is possible to reach vertex $N$. If it is possible to reach, also calculate the minimum sum of the weights of the edges you pass through.</p>

### 입력

<blockquote>
<p>$N$ $M$</p>

<p>$u_1$ $v_1$ $w_1$</p>

<p>$u_2$ $v_2$ $w_2$</p>

<p>$\vdots$</p>

<p>$u_M$ $v_M$ $w_M$</p>

<p>$K$</p>

<p>$a_1$ $b_1$ $c_1$</p>

<p>$a_2$ $b_2$ $c_2$</p>

<p>$\vdots$</p>

<p>$a_K$ $b_K$ $c_K$</p>
</blockquote>

### 출력

<p>If you cannot reach vertex $N$, output $-1$. Otherwise, output the minimum sum of the weights of the edges you pass through.</p>

### 제한

<ul>
	<li>All inputs consist of integers.</li>
	<li>$3 \le N \le 2 \times 10^5$</li>
	<li>$0 \le M \le 2 \times 10^5$</li>
	<li>$1 \le u_i &lt; v_i \le N$ ($1 \le i \le M$)</li>
	<li>$i \ne j \Rightarrow (u_i, v_i) \ne (u_j, v_j)$ ($1 \le i, j \le M$)</li>
	<li>$1 \le w_i \le 10^9$ ($1 \le i \le M$)</li>
	<li>$0 \le K \le 2 \times 10^5$</li>
	<li>$1 \le a_i &lt; b_i &lt; c_i \le N$ ($1 \le i \le K$)</li>
</ul>

### 힌트

<p>In Sample Input 1, the best move is $1 \rightarrow 3 \rightarrow 4$.</p>

<p>In Sample Input 2, the best move is $1 \rightarrow 2 \rightarrow 4 \rightarrow 6 \rightarrow 7$.</p>
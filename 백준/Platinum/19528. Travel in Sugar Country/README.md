# [Platinum II] Travel in Sugar Country - 19528

[문제 링크](https://www.acmicpc.net/problem/19528)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 48, 정답: 12, 맞힌 사람: 10, 정답 비율: 27.778%

### 분류

비트마스킹, 다이나믹 프로그래밍

### 문제 설명

<p>There are $N$ towns numbered $1$ through $N$. There is a bidirectional road between towns $i$ and $i+1$, and its length is $D_i$. Thus, for each pairs ($a$, $b$) ($a &lt; b$), the distance between towns $a$ and $b$ is $D(a, b) = D_a + D_{a+1} + \ldots + D_{b-1}$.</p>

<p>At each town there is a sugar shop. An ant wants to visit $K$ distinct shops.</p>

<p>The ant wants to choose a set of $K$ distinct shops and the order to visit them. For example, if it decides to visit the shops $S_1, \ldots, S_K$ in this order, the total distance it travels will be $D(S_1, S_2) + D(S_2, S_3) + \ldots + D(S_{K-1}, S_K)$.</p>

<p>In how many ways the total distance it travels become a multiple of $M$? Print the answer modulo $10^9+7$.</p>

### 입력

<p>$N$&nbsp;$M$ $K$<br />
$D_1$<br />
$D_2$<br />
$\vdots$<br />
$D_{N-1}$</p>

### 출력

<p>Print the answer modulo $10^9+7$.</p>

### 제한

<ul>
	<li>$2 \leq N \leq 100$</li>
	<li>$1 \leq M \leq 30$</li>
	<li>$2 \leq K \leq 10, K \leq N$</li>
	<li>$1 \leq D_i \leq M$</li>
	<li>All values in the input are integers.</li>
</ul>

### 힌트

<p>In Sample 1, there are six ways: $1 \rightarrow 3 \rightarrow 2$, $2 \rightarrow 3 \rightarrow 1$, $2 \rightarrow 1 \rightarrow 4$, $4 \rightarrow 1 \rightarrow 2$, $2 \rightarrow 3 \rightarrow 4$, and $4 \rightarrow 3 \rightarrow 2$.</p>
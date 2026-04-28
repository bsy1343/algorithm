# [Platinum I] Cities - 21334

[문제 링크](https://www.acmicpc.net/problem/21334)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 72, 정답: 22, 맞힌 사람: 19, 정답 비율: 32.759%

### 분류

센트로이드, 센트로이드 분할, 분할 정복, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>In a far away kingdom, there are $N$ cities numbered between $0$ and $N - 1$. The cities are connected by $N - 1$ two-way roads. Each road has the same length, and connects exactly two cities, such that there is a unique path between any pair of cities.</p>

<p>For any two cities $A$ and $B$, denote by $L(A, B)$ the number of roads of this unique path between cities $A$ and $B$. Given an integer $K$, for how many pairs of cities $A, B$ is $L(A, B) = K$?</p>

### 입력

<p>The sample judge reads input in the following format:</p>

<ul>
	<li>line $1$: <code>N K</code></li>
	<li>line $2$: <code>F[0] F[1] .. F[N - 2]</code></li>
	<li>line $3$: <code>T[0] T[1] .. T[N - 2]</code></li>
</ul>

### 출력

<p>The sample judge will write a single line with the return value of <code>paths(N, K, F, T)</code>.</p>

### 제한

<ul>
	<li>$1 \le K \le N \le 100\,000$</li>
</ul>
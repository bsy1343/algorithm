# [Gold II] Predisposed - 35178

[문제 링크](https://www.acmicpc.net/problem/35178)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 12, 정답: 10, 맞힌 사람: 10, 정답 비율: 90.909%

### 분류

수학

### 문제 설명

<p>You are given two integers $N$ and $M$. You are also given $Q$ constraints in the form $(X_j, Y_j)$.</p>

<p>A sequence $A = (A_1, \dots, A_N)$ of length $N$ is <em>predisposed</em> if and only if:</p>

<ul>
<li>For each $1 \le i \le N$, it holds that $0 \le A_i &lt; M$.</li>
<li>For each $1 \le j \le Q$, the sum of all $A_k$ where $k$ is a multiple of $X_j$ is equal to $Y_j$ under modulo $M$. Formally, $\sum_{X_j \vert k} A_k \equiv Y_j \pmod{M}$.</li>
</ul>

<p>Find the number of all possible predisposed sequences. As the answer can be quite large, compute it modulo $998244353$.</p>

### 입력

<p>The first line contains three integers $N$, $M$, and $Q$ ($1 \leq N, M &lt; 998244353$; $1 \leq Q \leq \min(N, 100000)$). Each of the next $Q$ lines contains two integers $X_j$ and $Y_j$ ($1 \leq X_j \leq N$; $0 \leq Y_j &lt; M$; $X_p \neq X_q$ for $p \neq q$) representing a constraint.</p>

### 출력

<p>Output an integer in a single line representing the number of predisposed sequences modulo $998244353$.</p>
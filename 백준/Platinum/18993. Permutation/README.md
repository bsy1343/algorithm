# [Platinum I] Permutation - 18993

[문제 링크](https://www.acmicpc.net/problem/18993)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 19, 정답: 5, 맞힌 사람: 5, 정답 비율: 31.250%

### 분류

다이나믹 프로그래밍, 수학

### 문제 설명

<p>A permutation of length $n$ is a sequence $p_1, p_2, ... p_n$, where&nbsp;$p_i \in \{1, 2, ..., n\}$ and $\forall _{i \neq j} p_i \neq p_j$. We say that a pair $(p_i, p_j)$, where $i &lt; j$, is an <em>inversion</em>, if $p_i &gt; p_j$. We call a permutation <em>stable</em>, if the number of its inversions does not change after reversing the sequence comprising the permutation.</p>

<p>You are asked to find the $k$-th stable permutation of length $n$ with respect to the lexicographic order.</p>

### 입력

<p>The only line of the input contains two integers $n, k$ ($1 \le n \le 250\,000$, $1 \le k \le 10^{18}$), denoting the length and the index (in the lexicographic order) of the sought stable permutation, respectively.</p>

### 출력

<p>If there exists such a permutation, in the first line you should output <code>YES</code>&nbsp;and in the second row, $n$ numbers $p_1,\ldots,p_n$ representing the sought permutation. Otherwise output <code>NO</code>.</p>

### 힌트

<p>There are 6 stable permutations of length $4$: $$ (1, 4, 3, 2),\ (2, 3, 4, 1),\ (2, 4, 1, 3),\&nbsp; (3, 1, 4, 2),\ (3, 2, 1, 4),\ (4, 1, 2, 3). $$</p>
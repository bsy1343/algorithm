# [Platinum I] Inverse Problem - 21273

[문제 링크](https://www.acmicpc.net/problem/21273)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 61, 정답: 28, 맞힌 사람: 21, 정답 비율: 55.263%

### 분류

수학, 애드 혹, 조합론

### 문제 설명

<p>You are given an integer $N$ and an integer sequence $X$ of length $M$. Count, modulo $998244353$, the number of permutations $P = (P_1,P_2,\ldots,P_N)$ of $(1,2,\ldots,N)$ that satisfy the following condition:</p>

<ul>
	<li>The lexicographically smallest subsequence of $P$ of length $M$ coincides with $X$.</li>
</ul>

### 입력

<p>The first line contains integers $N$ ($1 \leq N \leq 250000$) and $M$ ($1 \leq M \leq N$).</p>

<p>The second line contains integers $X_1,X_2,\ldots,X_M$ ($1 \leq X_i \leq N$, $X_i \neq X_j$ for all $i \neq j$).</p>

### 출력

<p>Print the answer.</p>
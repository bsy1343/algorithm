# [Platinum I] Bit Operation - 21266

[문제 링크](https://www.acmicpc.net/problem/21266)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 144, 정답: 105, 맞힌 사람: 51, 정답 비율: 82.258%

### 분류

수학, 조합론

### 문제 설명

<p>You are given an integer array $A$ of length $N$, consisting of $0$&#39;s and $1$&#39;s. Let $a$ be initially the array $A$. You are going to perform the following operation $N-1$ times.</p>

<ul>
	<li>Let $n$ be the current length of $a$. Choose an integer $i$ ($1 \leq i \leq n-1$) and delete the $i$-th and the $(i+1)$-th elements of $a$. Then, by letting $x$ and $y$ be the deleted elements, insert either $x\mathbin{\&amp;}y$ or $x\mathbin{|}y$ to the position of the deleted elements. Here $x\mathbin{\&amp;}y$ and $x\mathbin{|}y$ denote the bit-AND and bit-OR operations, respectively.</li>
</ul>

<p>There are $2^{N-1} \times (N-1)!$ ways to perform the operations. Count the number of ways that result in a single value of $1$, modulo $998244353$.</p>

### 입력

<p>The first line contains an integer $N$ ($1 \leq N \leq 10^6$).</p>

<p>The second line contains integers $A_1,A_2,\ldots,A_N$ ($0 \leq A_i \leq 1$).</p>

### 출력

<p>Print the answer.</p>
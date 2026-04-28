# [Gold IV] Add and Reverse - 31373

[문제 링크](https://www.acmicpc.net/problem/31373)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 84, 정답: 46, 맞힌 사람: 33, 정답 비율: 53.226%

### 분류

비트마스킹, 수학

### 문제 설명

<p>Consider a non-negative integer $x$ stored in $32$ bits of memory: $$x = b_{31} \cdot 2^{31} + b_{30} \cdot 2^{30} + \ldots + b_{2} \cdot 2^{2} + b_{1} \cdot 2^{1} + b_{0} \cdot 2^{0}$$ where each bit $b_{i}$ can take two values $0$ and $1$ independently of other bits.</p>

<p>We perform a sequence of operations with this integer, possibly an empty one. In one operation, we can either increase the number by one or reverse the bits constituting it: swap $31$-st bit and $0$-th bit, swap $30$-th bit and first bit, $\ldots$, swap $16$-th bit and $15$-th bit. We can perform any number of any of these two operations in any order.</p>

<p>What is the minimum possible number of operations required to transform a zero to the given integer $n$?</p>

<p>The increasing by one is carried out modulo $2^{32}$, which means that, if the current number is equal to $2^{32} - 1$, increasing it by one produces a zero.</p>

### 입력

<p>The only line contains an integer $n$ ($0 \le n &lt; 2^{32}$).</p>

### 출력

<p>Print one integer: the minimum possible number of operations required to transform a zero to the given integer $n$.</p>

### 힌트

<p>In the first example, the fastest way to get a $5$ is to increase the number by one five times.</p>

<p>In the second example, we start by producing a one, and then reverse the bits, turning $1 = 2^{0}$ into $2\,147\,483\,648 = 2^{31}$.</p>
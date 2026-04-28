# [Platinum II] Squaring the Triangle - 25929

[문제 링크](https://www.acmicpc.net/problem/25929)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 14, 정답: 14, 맞힌 사람: 13, 정답 비율: 100.000%

### 분류

수학, 확률론, 기댓값의 선형성

### 문제 설명

<p>Wesley creates a graph $G$ that contains $N$ vertices. For each pair of vertices $\{u, v\}$, there is a probability of $\dfrac{p}{q}$ that an edge exists between $u$ and $v$. The probabilities are independent of each other.</p>

<p>Let $∆(G)$ denote the number of triangles in $G$. A triangle is a set of $3$ vertices that are connected by $3$ edges.</p>

<p>Please help Wesley find the expected value of $(∆(G))^2$.</p>

### 입력

<p>Line $1$ contains integer $T$ ($1 &le; T &le; 10^6$), the number of cases. $T$ lines follow. The $i$<sup>th</sup> line contains integers $N$, $p$, $q$ ($3 &le; N &le; 10^6$, $1 &le; p &lt; q &le; 10^6$), separated by spaces.</p>

### 출력

<p>Output $T$ lines, one line for each case. Suppose the answer to the $i$<sup>th</sup> case is $\dfrac{P}{Q}$, in lowest terms. Output $PQ^{-1} \pmod {10^9 + 7}$. That is, output a number $R$ such that $0 &le; R &lt; 10^9 + 7$ and $P &equiv; RQ \pmod {10^9 + 7}$.</p>
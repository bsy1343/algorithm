# [Platinum III] Hamiltonian Circuit - 33423

[문제 링크](https://www.acmicpc.net/problem/33423)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 2, 정답: 1, 맞힌 사람: 1, 정답 비율: 50.000%

### 분류

그리디 알고리즘, 많은 조건 분기

### 문제 설명

<p>You are given $n$ pairs of integers $(a_i, b_i)$.</p>

<p>Consider a weighted directed complete graph $G$ with $n$ vertices, where the weight of the edge from $i$ ($1 \leq i \leq n$) to $j$ ($1 \leq j \leq n$) is $|a_i - b_j|$.</p>

<p>Find a Hamiltonian circuit in $G$ such that the sum of weights of the edges it traverses is maximized, and output this maximum value.</p>

### 입력

<p>The first line of the input contains an integer $n$ ($2 \leq n \leq 10^5$) representing the number of pairs.</p>

<p>Each of the next $n$ lines contains two integers $a_i$ and $b_i$ ($0 \leq a_i, b_i \leq 10^9$) representing a single pair.</p>

<p>You may assume that <strong>all</strong> $2 n$ integers $a_i$ and $b_i$ are pairwise distinct.</p>

### 출력

<p>Print a line with a single integer: the maximum sum of weights of the Hamiltonian circuit.</p>

### 힌트

<p>In the example, consider the Hamiltonian circuit $1 \to 2 \to 3 \to 1$, with edge weights $|1-2| + |8-5| + |4-10| = 10$. It can be proven that there is no Hamiltonian circuit with sum of weights exceeding $10$, so the answer is $10$.</p>
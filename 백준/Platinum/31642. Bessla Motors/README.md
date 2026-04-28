# [Platinum II] Bessla Motors - 31642

[문제 링크](https://www.acmicpc.net/problem/31642)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 202, 정답: 57, 맞힌 사람: 52, 정답 비율: 29.545%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>Farmer John would like to promote his line of Bessla electric tractors by
showcasing Bessla's network of charging stations. He has identified $N$
($2\le N\le 5\cdot 10^4$) points of interest labeled $1\dots N$, of which the
first $C$ ($1\le C &lt; N$) are charging stations and the remainder are travel
destinations. These points of interest are interconnected by $M$
($1\le M\le 10^5$) bidirectional roads, the $i$-th of which connects distinct
points $u_i$ and $v_i$ ($1\le u_i, v_i\le N$) and has length $\ell_i$ miles
($1\le\ell_i\le 10^9$).

<p>A Bessla can travel up to $2R$ miles ($1\le R\le 10^9$) on a single charge,
allowing it to reach any destination within $R$ miles of a charging station. A
destination is deemed <em>well-connected</em> if it is reachable from at least $K$
($1\le K\le 10$) distinct charging stations. Your task is to assist Farmer John
in identifying the set of well-connected travel destinations.

### 입력

<p>The first line contains five space-separated integers $N$, $M$, $C$, $R$, and $K$. Each of the following $M$ lines contains three space-separated integers $u_i$, $v_i$, and $\ell_i$ such that $u_i\neq v_i$.</p>

<p>The charging stations are labeled $1, 2, \ldots, C$. The remaining points of interest are all travel destinations.</p>

### 출력

<p>First, output the number of well-connected travel destinations on a single line. Then, list all well-connected travel destinations in ascending order, each on a separate line.</p>
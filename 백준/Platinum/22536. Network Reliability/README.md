# [Platinum III] Network Reliability - 22536

[문제 링크](https://www.acmicpc.net/problem/22536)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 10, 정답: 5, 맞힌 사람: 5, 정답 비율: 50.000%

### 분류

수학, 다이나믹 프로그래밍, 그래프 이론, 비트마스킹, 확률론, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>An undirected graph is given. Each edge of the graph disappears with a constant probability. Calculate the probability with which the remained graph is connected.</p>

### 입력

<p>The first line contains three integers $N$ ($1 \leq N \leq 14$), $M$ ($0 \leq M \leq 100$) and $P$ ($0 \leq P \leq 100$), separated by a single space. $N$ is the number of the vertices and $M$ is the number of the edges. $P$ is the probability represented by a percentage.</p>

<p>The following $M$ lines describe the edges. Each line contains two integers $v_i$ and $u_i$ ($1 \leq u_i, v_i \leq N$). ($u_i, v_i$) indicates the edge that connects the two vertices $u_i$ and $v_i$.</p>

### 출력

<p>Output a line containing the probability with which the remained graph is connected. Your program may output an arbitrary number of digits after the decimal point. However, the absolute error should be $10^{-9}$ or less.</p>
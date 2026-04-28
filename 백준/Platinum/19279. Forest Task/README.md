# [Platinum II] Forest Task - 19279

[문제 링크](https://www.acmicpc.net/problem/19279)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 73, 정답: 27, 맞힌 사람: 27, 정답 비율: 37.500%

### 분류

자료 구조, 그리디 알고리즘, 분리 집합

### 문제 설명

<p>You are given a forest with $N$ vertices and $M$ edges. The vertices are numbered $0$ through $N-1$. The edges are given in the format $(x_i,y_i)$, which means that vertex $x_i$ and $y_i$ are connected by an edge.</p>

<p>Each vertex $i$ is assigned value $a_i$. You want to add edges in the given forest so that the forest becomes connected. To add an edge, you choose two different vertices $i$ and $j$, then span an edge between $i$ and $j$. This operation costs $a_i + a_j$ dollars, and afterward neither vertex $i$ nor $j$ can be selected again.</p>

<p>Find the minimum total cost required to make the forest connected, or print &quot;<code>Impossible</code>&quot; if it is impossible.</p>

### 입력

<p>Input is given in the following format:</p>

<p>$N$ $M$</p>

<p>$a_0$ $a_1$ $\ldots$ $a_{N-1}$</p>

<p>$x_1$ $y_1$</p>

<p>$\ldots$</p>

<p>$x_M$ $y_M$</p>

### 출력

<p>Print the minimum total cost required to make the forest connected, or print &quot;<code>Impossible</code>&quot; if it is impossible.</p>

### 제한

<p>$1 \le N \le 100\,000$, $0 \le M \le N-1$, $1 \le a_i \le 10^9$, $0 \le x_i,y_i \le N-1$. The given graph is a forest. All input values are integers.</p>

### 힌트

<p>In Sample 1, if we connect vertices $0$ and $5$, the graph become connected, and the cost is $1 + 6 = 7$.</p>

<p>In Sample 2, we can&#39;t make the graph connected.</p>

<p>In Sample 3, the graph is connected, regardless of whether we do something or not.</p>
# [Platinum V] Kill All Termites - 24671

[문제 링크](https://www.acmicpc.net/problem/24671)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 112, 정답: 41, 맞힌 사람: 37, 정답 비율: 40.217%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>A tree is an undirected connected graph with $n$ vertices and $n - 1$ edges.</p>

<p>You are given a tree. There are termites in some vertices of this tree. Your task is to kill them all. To do so, you can poison some of the vertices. If a termite visits a poisoned vertex, it immediately dies. Every second, each termite moves to an adjacent vertex. A termite cannot move along the same edge twice in a row, except when it gets into a leaf. Find the minimal possible number of vertices you can poison so that all the termites will eventually die, regardless of their initial positions and strategies.</p>

### 입력

<p>The first line contains one integer $n$, the size of the tree ($1 \le n \le 100\,000$).</p>

<p>The second line contains $n - 1$ integers $p_2, p_3, \ldots, p_{n}$, meaning that there is an edge between vertices $i$ and $p_i$ for $2 \le i \le n$ ($1 \le p_i &lt; i$).</p>

### 출력

<p>Print one integer: the answer.</p>
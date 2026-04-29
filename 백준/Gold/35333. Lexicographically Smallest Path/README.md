# [Gold I] Lexicographically Smallest Path - 35333

[문제 링크](https://www.acmicpc.net/problem/35333)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 6, 정답: 3, 맞힌 사람: 3, 정답 비율: 50.000%

### 분류

그래프 이론, 그리디 알고리즘, 애드 혹

### 문제 설명

<p>Bessie is given an undirected graph with $N$ ($1\le N\le 2 \cdot 10^5$) vertices labeled $1\dots N$ and $M$ edges ($N - 1\le M\le 2 \cdot 10^5$). Each edge is described by two integers $u, v$ ($1\le u, v \le N$) describing an undirected edge between nodes $u$ and $v$ and a lowercase Latin letter $c$ in the range a..z that is the value on the edge. The graph given is guaranteed to be connected. There may be multiple edges or self-loops.</p>

<p>Define $f(a, b)$ as the lexicographically smallest concatenation of edge values over all paths starting from node $a$ and ending at node $b$. A path may contain the same edge more than once (i.e., cycles are allowed).</p>

<p>For each $i$ ($1\le i \le N$), help Bessie determine the length of $f(1, i)$. Output this length if it is finite, otherwise output $-1$.</p>

### 입력

<p>The first line contains $T$ ($1\le T\le 10$), the number of independent tests. Each test is specified in the following format:</p>

<p>The first line contains $N$ and $M$.</p>

<p>The next $M$ lines each contain two integers followed by a lowercase Latin character.</p>

<p>It is guaranteed that neither the sum of $N$ nor the sum of $M$ over all tests exceeds $4\cdot 10^5$.</p>

### 출력

<p>For each test, output $N$ space-separated integers on a new line.</p>
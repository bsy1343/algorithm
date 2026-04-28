# [Gold II] Cubic Path - 23658

[문제 링크](https://www.acmicpc.net/problem/23658)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 11, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

백트래킹, 비트마스킹, 해 구성하기, 런타임 전의 전처리

### 문제 설명

<p>A <em>path</em> in the $n$-dimensional set $\{0, 1\}^n$ is a sequence of $n$-dimensional points $x_1, x_2, \ldots, x_k \in \{0, 1\}^n$ such that, for each $i$ ($1 \le i \le k - 1$), points $x_i$ and $x_{i + 1}$ differ in exactly one coordinate, and all the points $x_1, \ldots, x_k$ are distinct. The length of the path $x_1, \ldots, x_k$ is $k$.</p>

<p>A path &nbsp;$x_1, \ldots, x_k$ is <em>imperfect</em> if there exists a shorter path $y_1, \ldots, y_{\ell}$ which leads from the first to the last point of this path and consists of a subset of the same points. In other words, $\{y_1, \ldots, y_{\ell}\} \subseteq \{x_1, \ldots, x_k\}$, $x_1 = y_1$, $x_k = y_{\ell}$ and $\ell &lt; k$. If a path is not imperfect, it is <em>perfect</em>.</p>

<p>Your task is to find the longest perfect path in the set $\{0, 1\}^n$.</p>

### 입력

<p>The only line contains a single integer $n$ ($1 \le n \le 6$).</p>

### 출력

<p>On the first line, print $L$, the length of the path. On the next $L$ lines, print the description of the path $x_1, \ldots, x_L$: $i$-th of these lines must contain $n$ characters (zeroes and ones) describing the point $x_i$.</p>

<p>It is easy to see that there are multiple longest perfect paths. Print any one of them.</p>
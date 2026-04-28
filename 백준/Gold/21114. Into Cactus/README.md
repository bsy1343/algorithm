# [Gold II] Into Cactus - 21114

[문제 링크](https://www.acmicpc.net/problem/21114)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 18, 맞힌 사람: 16, 정답 비율: 66.667%

### 분류

애드 혹, 해 구성하기, 깊이 우선 탐색, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 그리디 알고리즘, 트리

### 문제 설명

<p>Given a tree, add as many edges as possible so that the resulting graph is a cactus graph.</p>

<p>A cactus graph is a graph where each edge is contained in at most one simple cycle. This graph may not contain self-loops or parallel edges.</p>

### 입력

<p>The first line contains an integer $N$, the size of the tree ($1 \le N \le 200\,000$).</p>

<p>Each of the next $N - 1$ lines contains two integers $u$ and $v$ ($1 \le u, v \le N$, $u \neq v$), indicating that there is an edge between nodes $u$ and $v$. It is guaranteed that the resulting graph is a tree.</p>

### 출력

<p>On the first line, output $K$, the maximum number of edges that can be added to the graph. On each of the next $K$ lines, output two integers $a$ and $b$ ($1 \le a, b \le N$, $a \neq b$), indicating that you are going to add an edge between nodes $a$ and $b$. The resulting graph must be a cactus graph.</p>

<p>If there are several solutions with the maximum possible $K$, output any one of them.</p>
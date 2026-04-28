# [Platinum IV] Tree Search - 31200

[문제 링크](https://www.acmicpc.net/problem/31200)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 122, 정답: 23, 맞힌 사람: 17, 정답 비율: 18.681%

### 분류

트리, 이분 탐색, 분할 정복, 센트로이드, 센트로이드 분할

### 문제 설명

<p>You are given a rooted binary tree consisting of $N$ vertices. The vertices are numbered from $1$ to $N$, the root is the vertex number $1$. Each of the other vertices has a single parent in the tree. The tree is binary, i.e. each vertex can be a parent of at most two other vertices.</p>

<p>One of the vertices is special. You are trying to guess it. You can ask the questions of the following kind: &quot;Is the special vertex in the subtree of vertex $x$&quot;? A node $y$ is in the subtree of vertex $x$ if and only if the shortest path between $y$ and $1$ goes through vertex $x$. Note that vertex $x$ is also in its own subtree.</p>

<p>You are allowed to ask this question at most $35$ times. After that you should report your guess.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$2 &le; N &le; 100\, 000$</li>
</ul>
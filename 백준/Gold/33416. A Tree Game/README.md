# [Gold III] A Tree Game - 33416

[문제 링크](https://www.acmicpc.net/problem/33416)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 28, 정답: 12, 맞힌 사람: 12, 정답 비율: 44.444%

### 분류

게임 이론, 그래프 이론, 그래프 탐색, 깊이 우선 탐색, 트리

### 문제 설명

<p>Little I and Little J are playing a game again.</p>

<p>Little J brings a tree with $n$ vertices. Each edge of the tree has two states: open and closed. Initially, all edges of the tree are open.</p>

<p>There is a chip initially placed at vertex $1$. Little I can move the chip, and the goal is to move the chip to a vertex with degree <strong>exactly equal to $1$</strong>. Little J can close edges of the tree with the goal of preventing Little I from moving the chip to a vertex with degree exactly $1$. The degree of a vertex is the number of edges connected to it, regardless of whether they are open or closed.</p>

<p>The game consists of several rounds, each round having the following steps:</p>

<ol>
	<li>Little I Task Determination: If the chip is at a vertex with degree exactly $1$, Little I wins. Otherwise, proceed to step 2.</li>
	<li>Little J Action: Little J closes one currently open edge permanently. If there are no open edges at the moment, skip the action and proceed to step 3.</li>
	<li>Little I Action: Little I chooses an open edge connected to the vertex currently containing the chip, and moves the chip to the other end of this edge. If there is no such edge, Little J wins. Otherwise, a new round begins, going back to step 1.</li>
</ol>

<p>Little J wants to know who will win if Little I and Little J know the structure of this tree and are extremely smart.</p>

### 입력

<p>The first line contains a single integer $n$ ($1 \le n \le 10^5$) representing the number of vertices in the tree.</p>

<p>Then follow $n - 1$ lines, each containing two integers $u$ and $v$ ($1 \le u, v \le n$) representing two vertices connected by an edge of the tree.</p>

### 출력

<p>If Little I wins, print <code>1</code>. Otherwise, print <code>0</code>.</p>
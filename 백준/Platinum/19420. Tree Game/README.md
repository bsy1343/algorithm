# [Platinum II] Tree Game - 19420

[문제 링크](https://www.acmicpc.net/problem/19420)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 10, 맞힌 사람: 5, 정답 비율: 16.129%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Consider the following game about coloring edges in a tree.</p>

<p>You are given a tree. Initially, the color of all edges is white. Let a <em>valid path</em> be a simple path such that all its edges are white, and the two endpoints are leaves in the tree. On each step of this game, you can choose a valid path and paint all its edges black. You cannot stop your game until you cannot find any valid path.</p>

<p>The purpose of this game is to use the minimum number of steps to complete the game. Please find the minimum number of steps for the given tree.</p>

### 입력

<p>The first line of input contains one integer $N$ indicating the number of nodes in the given tree.</p>

<p>Each of the following $N-1$ lines contains two integers $x$ and $y$ indicating that $x$-th node and $y$-th node are connected by an edge in the given tree. Nodes are numbered from $1$ to $N$.</p>

### 출력

<p>Output one integer: the minimum number of steps required to complete the game on the given tree.</p>

### 제한

<ul>
	<li>$2 \le N \le 10^5$</li>
	<li>$1 \le x, y \le N$</li>
	<li>The given graph is a tree.</li>
</ul>
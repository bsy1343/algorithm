# [Platinum II] Gems - 3382

[문제 링크](https://www.acmicpc.net/problem/3382)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 28, 정답: 26, 맞힌 사람: 23, 정답 비율: 95.833%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>The Gem-Toys Company asked you to solve the following problem.</p>

<p>You are given a connected acyclic graph, i.e. a set of vertices connected by edges in such a way that from each vertex you can reach all the other vertices by traversing the edges, and it does not contain a loop.</p>

<p>The Gem-Toys Company is going to produce jewelry models of such graphs. Vertices will be made of gems and edges will be made of gold string. It is required that adjacent vertices are made of different kinds of gems. For each positive integer&nbsp;p&nbsp;there is exactly one kind of gems with the price&nbsp;p.</p>

<p>Your task is to write a program computing the minimal total price of the gems needed to make the model.</p>

### 입력

<p>The first line of the input contains one positive integer&nbsp;N&nbsp;(1&nbsp;&le;&nbsp;N&nbsp;&le;&nbsp;10&nbsp;000), the number of vertices. The vertices are numbered from&nbsp;1&nbsp;to&nbsp;N. The following&nbsp;N-1&nbsp;lines describe the edges, one per line. Each of these lines contains a pair of integers&nbsp;A&nbsp;and&nbsp;B&nbsp;separated by a space (1&nbsp;&le;&nbsp;A, B&nbsp;&le;&nbsp;N,&nbsp;A&nbsp;&ne;&nbsp;B). Such a pair represents an edge connecting vertices&nbsp;A&nbsp;and&nbsp;B.</p>

### 출력

<p>The first and only line of the output must contain one integer: the minimal total price of the gems needed to make the model.</p>
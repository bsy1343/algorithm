# [Platinum II] New Megacity - 32824

[문제 링크](https://www.acmicpc.net/problem/32824)

### 성능 요약

시간 제한: 2.5 초, 메모리 제한: 2048 MB

### 통계

제출: 142, 정답: 56, 맞힌 사람: 50, 정답 비율: 43.103%

### 분류

그래프 이론, 단절점과 단절선, 분리 집합, 자료 구조, 최소 스패닝 트리

### 문제 설명

<p>You are involved in a huge project to design a new megacity connecting $n$ cities using a given set of $m$ potential roads, each with an associated cost. All cities should be connected with the minimum total cost, that is, they form a Minimum Spanning Tree (MST). However, not all roads are equally important. Your job is to determine the importance of each road on the following categories:</p>

<ul>
	<li><strong>Type 1</strong>: The road is included in <strong>every possible MST</strong> that connects all cities. This means that this road is essential for the optimal solution.</li>
	<li><strong>Type 2</strong>: The road appears in <strong>at least one MST</strong> but <strong>does not in all</strong>.</li>
	<li><strong>Type 3</strong>: The road is <strong>never used in any MST</strong>; it does not contribute to the least costly connection of all cities.</li>
</ul>

<p>Given a road network of $n$ cities with $m$ roads with associated costs, write a program to output the type of each road.</p>

### 입력

<p>Your program is to read from standard input. The input starts with a line containing two integers $n$ and $m$, where $n$ is the number of cities ($2 ≤ n ≤ 100\,000$) and $m$ is the number of potential roads ($n - 1 ≤ m≤\min(100\,000, n(n - 1)/2)$).</p>

<p>In the following $m$ lines, the $i$-th road is given by three integers $x$, $y$, $z$ where $x$ and $y$ are the cities connected by the road ($1 ≤ x, y ≤ n$, $x \ne y$), and $z$ is the cost of building that road ($1 ≤ z ≤ 100\,000$). Each pair of cities is connected by at most one road, that is, there are no multiple edges between the same pair of cities.</p>

<p>It is guaranteed that at least one MST always exists for the given input.</p>

### 출력

<p>Your program is to write to standard output. Print $m$ lines. The $i$-th line should contain a single integer representing the type of the $i$-th road (<code>1</code>, <code>2</code>, or <code>3</code>), in the same order as the input.</p>
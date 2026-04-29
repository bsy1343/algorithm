# [Platinum II] Maximeter - 35173

[문제 링크](https://www.acmicpc.net/problem/35173)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 6, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

수학

### 문제 설명

<p>Solve the problem below for $T$ test cases.</p>

<p>You are given two integers $M$ and $D$. You are interested in a rooted weighted tree with the following conditions.</p>

<ul>
<li>Each edge has a weight of a positive integer.</li>
<li>For each vertex $v$ of the tree, there exists <strong>no</strong> set of $v$'s children of size <strong>strictly greater</strong> than $M$ such that all the edges connecting $v$ and this set of children all have the same weight.</li>
<li>The diameter of the tree is not greater than $D$. The diameter of a tree is the maximum distance between any two vertices.</li>
</ul>

<p>Find the maximum number of vertices of such a tree. As the number of vertices can be very large, find the vertex count modulo $998244353$.</p>

### 입력

<p>The first line contains an integer $T$ ($1 \leq T \leq 100$), the number of test cases. Each of the next $T$ lines contains two integers $M$ and $D$ ($1 \leq M, D \leq 10^9$) representing a case you have to solve.</p>

### 출력

<p>For each of the $T$ test cases, output a single line containing the maximum number of vertices modulo $998244353$.</p>
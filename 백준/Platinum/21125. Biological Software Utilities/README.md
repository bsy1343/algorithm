# [Platinum III] Biological Software Utilities - 21125

[문제 링크](https://www.acmicpc.net/problem/21125)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 20, 맞힌 사람: 17, 정답 비율: 94.444%

### 분류

조합론, 수학

### 문제 설명

<p>You are developing a software kit named <em>Biological Software Utilities</em> (BSU). The kit includes a program that is dedicated to tree recognition. Recall that a <em>tree</em> is a connected undirected graph without cycles.</p>

<p>In nature, when a tree grows, two neighboring vertices are added at the same time. Thus, you consider a tree to be <em>plausible</em> if, after removing some edges, the resulting graph consists only of connected components with $2$ vertices. In other words, a tree is plausible if and only if it has a perfect matching.</p>

<p>Now you are to implement a new function for BSU to calculate the number of plausible trees that have $n$ vertices numbered with distinct integers between $1$ and $n$. Two trees are considered different if there is an edge $(u, v)$ which is present in exactly one of the trees.</p>

<p>Since the number of plausible trees can be very large, you have to calculate it modulo $998\,244\,353$.</p>

### 입력

<p>The only line contains an integer $n$, the number of vertices in a tree ($1 \le n \le 10^6$).</p>

### 출력

<p>Print the number of plausible trees with $n$ vertices modulo $998\,244\,353$.</p>
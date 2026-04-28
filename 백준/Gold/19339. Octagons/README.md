# [Gold II] Octagons - 19339

[문제 링크](https://www.acmicpc.net/problem/19339)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 58, 정답: 10, 맞힌 사람: 9, 정답 비율: 23.684%

### 분류

브루트포스 알고리즘, 자료 구조, 스택, 문자열

### 문제 설명

<p>Below is a picture of an infinite hyperbolic tessellation of octagons. If we think of this as a graph of vertices (of degree three), then there exists an isomorphism of the graph which maps any vertex $x$ onto any other vertex $y$. &nbsp;Every edge is given a label from the set {<code>a</code>, <code>b</code>, <code>c</code>} in such a way that every vertex has all three types of edges incident on it, and the labels alternate around each octagon. Part of this labeling is illustrated in the diagram below.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/da928c9f-2a7d-4c12-81ac-002ceae9bd8a/-/preview/" style="width: 512px; height: 512px;" /></p>

<p>So a path in this graph (starting from any vertex) can be specified by a sequence of edge labels. Your job is to write a program which, given a sequence of labels such as &quot;<code>abcbcbcabcaccadb</code>&quot;, returns &quot;<code>closed</code>&quot; if the path ends on the same vertex where it starts, and returns &quot;<code>open</code>&quot; otherwise.</p>

### 입력

<p>The input is a string of length at least $1$ and at most $100\,000$ consisting of letters &quot;<code>a</code>&quot;, &quot;<code>b</code>&quot; and &quot;<code>c</code>&quot;.</p>

### 출력

<p>The output should be one line with one word: either &quot;<code>closed</code>&quot; or &quot;<code>open</code>&quot;.</p>
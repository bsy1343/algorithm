# [Gold V] Subway - 21959

[문제 링크](https://www.acmicpc.net/problem/21959)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 71, 정답: 31, 맞힌 사람: 30, 정답 비율: 47.619%

### 분류

조합론, 해 구성하기, 수학, 트리

### 문제 설명

<p>Given an integer number K, generate a tree with minimum number of nodes such that there are exactly K pairs of nodes (X, Y), where X is an ancestor of Y.</p>

### 입력

<p>The input (from the console) will contain a single integer number, K &ndash; the number of pairs with the specified property.</p>

### 출력

<p>The output (to the console) will contain N+1 lines, representing the generated tree, the nodes being indexed from 0.</p>

<p>The first line will contain the number N &ndash; the number of nodes in the tree.</p>

<p>The following N lines will contain each 2 numbers X and T, separated by a space, with the following meaning: node T is the direct ancestor of node X. If node X doesn&rsquo;t have a direct ancestor, T will have value -1.</p>
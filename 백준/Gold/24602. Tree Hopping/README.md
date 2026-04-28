# [Gold II] Tree Hopping - 24602

[문제 링크](https://www.acmicpc.net/problem/24602)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 200, 정답: 84, 맞힌 사람: 71, 정답 비율: 44.375%

### 분류

트리, 최소 공통 조상

### 문제 설명

<p>You are given a tree and a permutation of its vertices. It can be proven that for any tree and any pair of source/destination nodes, there is some permutation of the nodes where the first node is the source, the last node is the destination, and the distance between adjacent nodes in the permutation is less than or equal to three.</p>

<p>Your job will be to write a verifier for this property. Given such a permutation and the tree, validate whether the distance between adjacent nodes in the permutation is less than or equal to three.</p>

### 입력

<p>The first line of input contains an integer $t$ ($1 \le t \le 50{,}000$), which is the number of test cases.</p>

<p>In each test case, the first line of input contains an integer $n$ ($2 \le n \le 100{,}000$), which is the number of nodes in the tree. The nodes are numbered from $1$ to $n$.</p>

<p>Each of the next $n-1$ lines contains a pair of integers $a$ and $b$ ($1 \le a &lt; b \le n$), representing an edge in the tree between nodes $a$ and $b$.</p>

<p>Each of the next $n$ lines contains an integer $p$ ($1 \le p \le n$, all values distinct). This is the permutation of the nodes.</p>

<p>The sum of the values of $n$ over all test cases will not exceed $100{,}000$.</p>

### 출력

<p>For each test case, output a single line with a single integer, which is $1$ if the given permutation satisfies the constraint that every pair of adjacent nodes in the permutation has distance less than or equal to three in the tree. Output $0$ if the given permutation does not satisfy this constraint.&nbsp;</p>
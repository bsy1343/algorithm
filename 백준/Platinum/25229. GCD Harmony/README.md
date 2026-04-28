# [Platinum III] GCD Harmony - 25229

[문제 링크](https://www.acmicpc.net/problem/25229)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 598, 정답: 110, 맞힌 사람: 78, 정답 비율: 24.528%

### 분류

수학, 다이나믹 프로그래밍, 트리, 정수론, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Consider a tree with undirected edges, where each node has an integer value. Adjacent nodes are said to be <em>GCD-harmonic</em> if the greatest common divisor (GCD) of their values is strictly greater than $1$. </p>

<p>You can modify the value of any tree node to any positive integer. The cost of this operation is equal to the new node value, regardless of the node&#39;s original value. You can change as many node values as needed, and node values do not need to be unique.</p>

<p>What is the minimum total cost to make every pair of adjacent nodes in the tree GCD-harmonic?</p>

### 입력

<p>The first line of input contains a single integer $n$ ($2 \leq n \leq 5\,000$), which is the number of nodes in the tree. Tree nodes are numbered from $1$ to $n$.</p>

<p>Each of the next $n$ lines contains an integer $v$ ($1 \le v \le 100$). These are the initial values of the nodes (which are not guaranteed to be unique), in node number order.</p>

<p>Each of the next $n - 1$ lines contains two integers $a$ and $b$ ($1 \leq a, b \leq n, a \neq b$), indicating a tree edge between nodes $a$ and $b$. It is guaranteed that these edges form a tree.</p>

### 출력

<p>Output a single integer, which is the minimum total cost to make every pair of adjacent nodes in the tree GCD-harmonic.</p>
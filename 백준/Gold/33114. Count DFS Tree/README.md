# [Gold I] Count DFS Tree - 33114

[문제 링크](https://www.acmicpc.net/problem/33114)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 6, 정답: 6, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

누적 합, 다이나믹 프로그래밍, 수학, 조합론

### 문제 설명

<p>You are currently studying a tree traversal algorithm called the Depth First Search (DFS). Suppose you have a rooted tree of $n$ nodes (numbered from $1$ to $n$) with a depth of $K$ (numbered from $1$ to $K$). The root (the node at depth $1$) is located at node $1$. <strong>All leaves are located at the same depth</strong>, that is, at depth $K$. Node $i$ has an array of children nodes $c_i$, which could be empty if $i$ is a leaf node. The pseudocode of the algorithm is presented as follows.</p>

<pre>DFS(u, depth):
  let res be an empty array
  append depth to res

  for each v in c[u]:
    let D be an array initialized with DFS(v, depth + 1)
    for each x in D:
      append x to res

return res
</pre>

<p>Consider the trees in the following illustration. The return values of <code>DFS(1, 1)</code> for the tree on the left and the tree on the right are $[1, 2, 3, 3, 3]$ and $[1, 2, 3, 2, 3]$, respectively.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33114.%E2%80%85Count%E2%80%85DFS%E2%80%85Tree/6a2dbbaf.png" data-original-src="https://boja.mercury.kr/assets/problem/33114-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 254px; height: 125px;"></p>

<p>Denote $f_K(n)$ as the number of <strong>distinct</strong> return values of <code>DFS(1, 1)</code> across all trees consisting of $n$ nodes and all leaves are located in depth $K$. You are given $M$ integers: $A_1, A_2, \dots , A_M$. Determine the value of $f_K(A_1) \times f_K(A_2) \times \cdots \times f_K(A_M)$. As the answer can be very large, find the answer modulo $998\, 244\, 353$.</p>

### 입력

<p>The first line consists of two integers $K$ $M$ ($1 ≤ K, M ≤ 100\, 000$).</p>

<p>The following line consists of $M$ integers $A_i$ ($K ≤ A_i ≤ 200\, 000$).</p>

### 출력

<p>Output a single integer representing the value of $f_K(A_1) \times f_K(A_2) \times \cdots \times f_K(A_M)$ modulo $998\, 244\, 353$.</p>
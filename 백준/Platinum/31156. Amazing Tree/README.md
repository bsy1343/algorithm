# [Platinum I] Amazing Tree - 31156

[문제 링크](https://www.acmicpc.net/problem/31156)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 68, 정답: 31, 맞힌 사람: 22, 정답 비율: 37.288%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그리디 알고리즘, 그래프 탐색, 정렬, 트리, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Consider an undirected tree. The following algorithm constructs a post-order traversal of the tree:</p>

<pre>
fun dfs(v):
    mark v as used
    for u in neighbours(v):
        if u is not used:
            dfs(u)
    append v to order
</pre>

<p>The post-order traversal will be in the list <em>order</em>.</p>

<p>You are allowed to choose the order of neighbors for each vertex as well as the starting vertex. What is the lexicographically minimal <em>order</em> you can get?</p>

### 입력

<p>The first line of input contains one integer $T$ ($1 \le T \le 10^{5}$) --- the number of test cases you need to process. Description of the test cases follows.</p>

<p>The first line of each test case contains a single integer $n$ ($2 \le n \le 2 \cdot 10^{5}$) --- the number of vertices in the tree. </p>

<p>The $i$-th of the next $n-1$ lines contains two integers $u_i, v_i$ ($1 \le u_i, v_i \le n$, $u_i \ne v_i$), meaning that there is an undirected edge $(u_i, v_i)$ in the tree. It is guaranteed that the given graph is a tree.</p>

<p>The sum of $n$ over all test cases in one test file does not exceed $2 \cdot 10^{5}$.</p>

### 출력

<p>For each test case print the lexicographically minimal order on a separate line.</p>

### 힌트

<p>The first test looks as follows:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31156.%E2%80%85Amazing%E2%80%85Tree/5e2220fe.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31156.%E2%80%85Amazing%E2%80%85Tree/5e2220fe.png" data-original-src="https://upload.acmicpc.net/ea099afa-e54b-48ad-976f-c36500cc6e52/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>By starting in vertex $1$ we can only get order $2\ 3\ 1$. By starting in vertex $2$ we can only get order $1\ 3\ 2$. By starting in vertex $3$ we can get two orders: $1\ 2\ 3$ and $2\ 1\ 3$. The lexicographically minimal of the four orders is $1\ 2\ 3$.</p>

<p>The second test looks as follows:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31156.%E2%80%85Amazing%E2%80%85Tree/ac2adb85.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31156.%E2%80%85Amazing%E2%80%85Tree/ac2adb85.png" data-original-src="https://upload.acmicpc.net/e26941f6-2b83-4ab9-b436-63bb9f02c89f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>By starting in vertex $1$ we can get two orders: $2\ 3\ 1$ and $3\ 2\ 1$. By starting in vertex $2$ we can only get order $3\ 1\ 2$. By starting in vertex $3$ we can only get order $2\ 1\ 3$. The lexicographically minimal of the four orders is $2\ 1\ 3$.</p>

<p>The third test looks as follows:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31156.%E2%80%85Amazing%E2%80%85Tree/d898fa8a.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31156.%E2%80%85Amazing%E2%80%85Tree/d898fa8a.png" data-original-src="https://upload.acmicpc.net/c093eb05-d894-4a70-a8f2-345af30f41c4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>The lexicographically minimal order is $4\ 5\ 2\ 1\ 6\ 3\ 7$ it can be obtained by starting in node $7$.</p>
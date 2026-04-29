# [Platinum III] Tree With One Edge - 32744

[문제 링크](https://www.acmicpc.net/problem/32744)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 11, 맞힌 사람: 11, 정답 비율: 100.000%

### 분류

게임 이론, 다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Alice and Bob are playing a game on a tree rooted at node 1. A token is placed on the root then the players take turns making moves with Alice moving first. During a move a player must move the token from the node its on to one of that node's children. If there are no legal moves available, then the player whose turn it is will lose.</p>

<p>Since Alice and Bob are too good at this game they decided to play a modified version of the game. Before the game begins, Alice can add a single directed edge $(u, v)$ to the tree. Then, during the game, if the token is on vertex $u$ and the extra edge is present, the current player can choose to move the token to vertex $v$ and delete the extra edge (preventing it from being used multiple times in one game).</p>

<p>Of the $n^2$ possible pairs $(u, v)$ Alice can choose, how many will allow Alice to win the game assuming both players play optimally? Note that $u=v$ is allowed, as are $(u, v)$ pairs that match an existing edge in the tree (in either direction).</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1\le t\le  10^4$) --- the number of test cases.</p>

<p>The first line of each test case contains a single integer $n$ ($2\leq n\leq 2\cdot 10^5$) --- the number of vertices in the tree.</p>

<p>The next line of each test case contains $n-1$ integers $p_2,\,p_3,\,\ldots,\,p_n$ ($1 \le p_i &lt; i$) --- the parents of each vertex in the tree, except the root.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $2\cdot 10^5$.</p>

### 출력

<p>For each test case, print a single integer --- the number of $(u, v)$ pairs that will allow Alice to win, assuming both players play optimally.</p>

### 힌트

<p>For the first test test case, here are the $4$ edges Alice can add to give herself the winning strategy:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32744.%E2%80%85Tree%E2%80%85With%E2%80%85One%E2%80%85Edge/e1d67383.png" data-original-src="https://boja.mercury.kr/assets/problem/32744-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 459px; height: 250px;"></p>
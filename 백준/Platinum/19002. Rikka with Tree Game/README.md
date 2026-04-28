# [Platinum III] Rikka with Tree Game - 19002

[문제 링크](https://www.acmicpc.net/problem/19002)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 17, 맞힌 사람: 10, 정답 비율: 76.923%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Game theory is an important branch of computer science. So, for a college student who is a computer science major, playing games may not always be an enjoyable process.</p>

<p>Today, Rikka is doing some research about a simple but interesting game with trees.</p>

<p>Consider a rooted tree $T$. Initially, there is a token on the root. Two players play a game on this tree, taking turns to move the token. On each turn, assuming the token&#39;s position is vertex $i$, the player needs to choose a child $j$ of $i$ and move the token to $j$. If $i$ has no child, the game ends immediately.</p>

<p>The final score of the game is the depth of the final position of the token (the depth of the root is $1$, and the depth of every other vertex is $1$ plus the depth of its parent). The first player wants to maximize the score, while the second player wants to minimize the score. Assume that both players play optimally.</p>

<p>Given a rooted tree $T$, calculating the final score of the game is a simple task. So Rikka wants to solve a more challenging problem. She can do some operations to the tree: each time, she can choose a <strong>leaf</strong>&nbsp;$i$ of the tree (a leaf is a vertex which does not have any children) and link a new node to the tree with node $i$ as its parent.</p>

<p>Let $f(k)$ be the minimum number of operations to make the game&#39;s final score be exactly $k$, assuming that both players play optimally. If it is impossible, let $f(k)$ be $-1$. Rikka wants to know the value $\lim\limits_{k \rightarrow +\infty}\frac{f(k)}{k}$.</p>

<p>You know, Rikka is good at asking questions, but not as good at answering them. So, she asks you for help.</p>

### 입력

<p>The first line contains a single integer $t$ ($1 \leq t \leq 10^3$), the number of test cases.</p>

<p>For each test case, the first line contains an integer $n$ ($1 \leq n \leq 10^5$).</p>

<p>Then $n - 1$ lines follow. Each of them contains two integers $u$ and $v$ ($1 \leq u, v \leq n$) which describe an edge $(u, v)$ of the tree. The index of the root is $1$.</p>

<p>It is guaranteed that the given graphs are trees. It is also guaranteed that there are at most $10$ test cases with $n &gt; 1000$.</p>

### 출력

<p>For each test case, print a single line with a single integer: the value of the limit Rikka wants to know. (It turns out that, if the answer exists, it is an integer.) If the limit does not exist, print $-1$ instead.</p>
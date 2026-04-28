# [Gold I] Coins on a tree - 21882

[문제 링크](https://www.acmicpc.net/problem/21882)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 242, 정답: 69, 맞힌 사람: 57, 정답 비율: 27.670%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>You have a rooted tree, some vertices have coins lying on them.&nbsp;</p>

<p>You can do the following operation any number of times: take some two vertices $u$ and $v$, such that there are no coins at lowest common ancestor of $u$ and $v$ but both vertices $u$ and $v$ have non-zero amount of coins $a_u$ and $a_v$ and put $a_u + a_v$ coins at their lowest common ancestor.</p>

<p>Your goal is to maximize the sum of the number of coins on all vertices.</p>

### 입력

<p>The first line contains single integer $n$ ($2 \leq n \leq 10^5$) --- number of vertices of the tree.</p>

<p>The root of the tree is vertex $1$.</p>

<p>The second line contains $n-1$ integers $p_2, p_3, \ldots, p_n$, $p_i$ is the parent of vertex $i$ ($1 \le p_i &lt; i$).</p>

<p>The third line contains $n$ integers $a_1, a_2, \ldots, a_n$, $a_i$ is the number of coins that lie on vertex $i$ ($0 \leq a_i \leq 10^5$).</p>

### 출력

<p>Print one integer --- the maximum total amount of coins that you can get by applying the described operations.</p>
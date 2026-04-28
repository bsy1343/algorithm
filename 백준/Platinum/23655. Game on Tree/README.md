# [Platinum III] Game on Tree - 23655

[문제 링크](https://www.acmicpc.net/problem/23655)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 25, 정답: 10, 맞힌 사람: 10, 정답 비율: 47.619%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그리디 알고리즘, 그래프 탐색, 트리, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>You are given an undirected rooted tree. Vertices are numbered with integers from $1$ to $n$. The root is vertex $1$.</p>

<p>Two players are playing a game on this tree. They make alternating moves.</p>

<p>The first player can mark one leaf on his move, and it will remain marked until the end of the game. A leaf of a rooted tree is a non-root vertex with only one neighbor. Initially, all leaves are unmarked.</p>

<p>The second player controls a chip. The chip is always located in some vertex. Initially, the chip is placed in vertex $1$, the root of the tree. On his move, the second player can put the chip in any vertex adjacent to the current one, or leave it in the current vertex.</p>

<p>The game ends when either all leaves are marked (the first player wins) or the chip is put into some unmarked leaf (the second player wins). Who will be the winner if both players play optimally?</p>

### 입력

<p>The first line contains an integer $n$: the number of vertices in the tree ($2 \le n \le 100\,000$). The second line contains $n - 1$ integers $p_2, p_3, \ldots, p_n$. Here, $p_i$ is the parent of vertex $i$ ($1 \le p_i &lt; i$).</p>

### 출력

<p>If the first player wins, print &quot;<code>FIRST</code>&quot; on the first line. After that, on the second line, print an integer $v$ ($2 \le v \le n$): the number of vertex the first player has to mark on the first move. This vertex must be a leaf. The first player must win after this move if both play optimally. In case there are several such vertices, print any one of them.</p>

<p>If the second player wins, print &quot;<code>SECOND</code>&quot; on the first line.</p>
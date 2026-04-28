# [Platinum III] Chessboard Game - 31347

[문제 링크](https://www.acmicpc.net/problem/31347)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 15, 맞힌 사람: 15, 정답 비율: 39.474%

### 분류

다이나믹 프로그래밍, 애드 혹, 게임 이론

### 문제 설명

<p>bobo and yiyi are playing a game on a chessboard with $(n + 1)$ rows and $(m + 1)$ columns. Rows are numbered by $0, 1, \dots, n$ from top to bottom, while columns are numbered by $0, 1, \dots, m$ from left to right.</p>

<p>Cells $(0, 1), (0, 2), \dots, (0, m), (1, 0), (2, 0), \dots, (n, 0)$ are special. They may contain a &quot;heaven gate&quot; or &quot;hell gate&quot;. People who enters a &quot;heaven gate&quot; immediately wins. However, the one who enters a &quot;hell gate&quot; dies and gives the victory to the other.</p>

<p>The game lasts for $q$ rounds. In each round, a chess is placed on cell $(x_i, y_i)$ initially. bobo and yiyi moves alternatively. bobo goes first. In one move, chess can be moved one cell upward or leftward.</p>

<p>Determine if bobo can win for each round. You know, bobo and yiyi are really clever guys ...</p>

### 입력

<p>The first line contains $3$ integers $n, m, q$ ($1 \leq n, m, q \leq 2 \cdot 10^5$).</p>

<p>The second line contains $n$ integers $a_1, a_2, \dots, a_n$ ($0 \leq a_i \leq 1$). If cell $(i, 0)$ contains a &quot;heaven gate&quot;, then $a_i = 0$. If cell $(i, 0)$ contains a &quot;hell gate&quot; instead, then $a_i = 1$.</p>

<p>The third line contains $m$ integers $b_1, b_2, \dots, b_m$ ($0 \leq b_i \leq 1$). If cell $(0, i)$ contains a &quot;heaven gate&quot;, then $b_i = 0$. If cell $(0, i)$ contains a &quot;hell gate&quot; instead, then $b_i = 1$.</p>

<p>Each of the last $q$ lines contains $2$ integers $x_i, y_i$ ($1 \leq x_i \leq n, 1 \leq y_i \leq m$).</p>

### 출력

<p>For each rounds, print &quot;Yes&quot; if bobo can win. Print &quot;No&quot; otherwise.</p>
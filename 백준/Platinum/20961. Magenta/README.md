# [Platinum III] Magenta - 20961

[문제 링크](https://www.acmicpc.net/problem/20961)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 6, 맞힌 사람: 6, 정답 비율: 20.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 게임 이론

### 문제 설명

<p>Paula and Marin are playing a game on a tree. Not on a real tree, of course. That would be <strong>dangerous</strong>. Although, who can say that a connected graph with n nodes, marked by integers from 1 to n, and n &minus; 1 edges, is completely safe?</p>

<p>Before the game started, Paula colored some edges blue, and Marin colored some edges red. If some edge was colored by both, its final color is magenta. All edges were colored by at least one of them.</p>

<p>Paula&rsquo;s piece starts the game in node a, and Marin&rsquo;s piece in node b. Players alternate moves, and Paula goes first. When it&rsquo;s their turn, the player must move their piece to some adjacent node which doesn&rsquo;t also contain the opponents piece. Also, Paula can&rsquo;t use red edges, and Marin can&rsquo;t use blue edges, while both can use magenta edges. The player who can&rsquo;t make a move loses.</p>

<p>Paula and Marin both play optimally. If they realize that the game can run forever, they will declare a draw. Determine the outcome of the game!</p>

### 입력

<p>The first line contains an integer n (2 &le; n &le; 100 000), the number of nodes.</p>

<p>The second line contains integers a and b (1 &le; a, b &le; n, a &ne;&nbsp;b), initial nodes of Paula and Marin.</p>

<p>The next n &minus; 1 lines describe the edges. Each line is of the form &quot;x y color&quot;, where x and y (1 &le; x, y &le; n) are the endpoints, and color is <code>plava</code> (Croatian for blue), <code>crvena</code> (Croatian for red) or <code>magenta</code>.</p>

### 출력

<p>Output <code>Paula</code> if Paula will win, <code>Marin</code> if Marin will win, or <code>Magenta</code> if it&rsquo;s a draw.</p>
# [Platinum V] Unfair Game - 33795

[문제 링크](https://www.acmicpc.net/problem/33795)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 36, 정답: 16, 맞힌 사람: 15, 정답 비율: 50.000%

### 분류

게임 이론

### 문제 설명

<p>Alice and Bob are playing a game on a $1 \times n$ board. On her turn, Alice places a $1 \times a$ tile on the board, while on his turn, Bob places a $1 \times b$ tile. Tiles must be placed on unoccupied cells and cannot overlap. </p>

<p>Whoever cannot make a move loses.</p>

<p>Alice moves first, and to compensate for the advantage of going first, Alice's pieces are larger than Bob's (in other words, $a &gt; b$). Given three integers $a$, and $b$ , $n$, determine who will win the game if both players play optimally.</p>

### 입력

<p>The first line contains a single integer $t$ ($1 \le t \le 10^5$) --- the number of test cases.  </p>

<p>Each of the next $t$ lines contains three space-separated integers $a$, $b$, and $n$ ($1 \le b &lt; a \le n \le 10^9$) --- the sizes of the tiles used by Alice and Bob, and the length of the board, respectively.</p>

### 출력

<p>For each test case, print "Alice" if Alice wins the game, or "Bob" if Bob wins.</p>

### 힌트

<p>In the first sample, since Alice goes first and $a = n = 10$, she can fill in the entire board on her first move, and Bob will not have any legal moves, losing the game.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33795.%E2%80%85Unfair%E2%80%85Game/08696ccc.png" data-original-src="https://boja.mercury.kr/assets/problem/33795-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 718px; height: 75px;"></p>

<p>In the second sample, Alice can never stop Bob from placing a piece on his first turn. After Bob's first turn, there will only be $4$ empty squares in total, so Alice can never place a piece on her second turn and will lose the game.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33795.%E2%80%85Unfair%E2%80%85Game/26171bc4.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33795-2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 718px; height: 46px;"></p>
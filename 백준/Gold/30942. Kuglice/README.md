# [Gold II] Kuglice - 30942

[문제 링크](https://www.acmicpc.net/problem/30942)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 1024 MB

### 통계

제출: 43, 정답: 22, 맞힌 사람: 20, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 누적 합, 게임 이론

### 문제 설명

<p>Christmas time is approaching, the most beautiful time of the year. Our protagonists, Marin and Josip, have returned from Christmas shopping and have started decorating their Christmas tree.</p>

<p>They bought $n$ Christmas ornaments arranged next to each other in an elongated box, and the $i$-th ornament has the color $a_i$. The box is open on both sides, so the ornaments can be taken out from both the left and the right side of the box. The box is transparent, so Marin and Josip can see the color of each ornament.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/30942.%E2%80%85Kuglice/81fa36ad.png" data-original-src="https://upload.acmicpc.net/9448dc6e-8f88-4ec9-bc34-3d02b82b4934/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 445px; height: 80px;" /></p>

<p style="text-align: center;">The illustration shows the initial state of the box in the second example. On his first move, Marin can draw either an ornament of color $1$ from the left end of the box or an ornament of color $3$ from the right end of the box.</p>

<p>Josip came up with a game that would make decorating the tree even more fun, although it&rsquo;s already a lot of fun by itself. The game works as follows: Marin and Josip take turns, and Marin starts the game. The player in turn draws an ornament from the box (either from the left or the right end of the box) and places it on the tree. If they draw an ornament whose color has not been drawn yet, the player scores a point. The game ends when the last ornament is drawn from the box.</p>

<p>The winner of the game is the player who has scored more points, so both Marin and Josip want to maximize their number of points. Since both of them are excellent players, they will play optimally. Your task is to print the result at the end of the game.</p>

### 입력

<p>The first line contains an integer $n$ ($1 &le; n &le; 3\, 000$), the number of ornaments in the box.</p>

<p>The second line contains $n$ integers $a_i$ ($1 &le; a_i &le; n$), the colors of the ornaments in the box.</p>

### 출력

<p>In the first and only line, print the result of the game, i.e., two numbers connected by the character &#39;<code>:</code>&#39; (without quotes), Marin&rsquo;s and Josip&rsquo;s scores.</p>

### 힌트

<p>Clarification of the first example:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/30942.%E2%80%85Kuglice/c4a2b19e.png" data-original-src="https://upload.acmicpc.net/2fa251fd-0dbf-4f39-861e-95410ea3a839/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 221px; height: 250px; float: left;" />Marin is first, and he draws an ornament of color $1$ from the left end of the box. Marin scores a point.</p>

<p>Josip draws an ornament of color $1$ from the right end of the box, but he does not score a point because a ball of color $1$ has already been drawn.</p>

<p>Marin draws an ornament of color $1$ from the left end of the box. He does not score a point either because a ball of color $1$ has already been drawn.</p>

<p>Josip draws an ornament of color $2$ from the left end of the box. This is the first ball of color $2$ drawn, so Josip scores a point.</p>

<p>Marin draws the last ornament (color $1$) from the left end of the box, but it does not earn him a point, and the game ends.</p>

<p>Marin has a total of $1$ point (he drew the ornament of color $1$ first), and Josip also has a total of $1$ point (he drew the ornament of color $2$ first).</p>

<p>The final result is $1$ : $1$.</p>
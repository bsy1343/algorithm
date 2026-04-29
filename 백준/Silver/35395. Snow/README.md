# [Silver IV] Snow - 35395

[문제 링크](https://www.acmicpc.net/problem/35395)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 2048 MB

### 통계

제출: 40, 정답: 33, 맞힌 사람: 13, 정답 비율: 92.857%

### 분류

구현, 누적 합

### 문제 설명

<p>Since 1906, a cross-country ski race has been held in the lands of the Czech Crown, in the Krkonoše Mountains. In the eighth year of this championship, the initial conditions seemed favorable, and the racers set off wearing only light clothing. Unfortunately, the weather soon turned for the worse, and most of the competitors were forced to abandon the race. Only Jaroslav Hanč continued, but due to the increasingly dangerous conditions, his friend Václav Vrbata went out to find him. Tragically, neither of them managed to reach safety in time, and both lost their lives.</p>

<p>To prevent such dangers in the ninth year of the championship, a new system for weather estimation was introduced. As a result, we began measuring atmospheric conditions more precisely to better predict race conditions.</p>

<p>The currently observed snow in the atmosphere is a rectangular grid, with each tile containing snow or empty space, represented as '<code>*</code>' and '<code>.</code>' respectively. The snow tends to naturally fall downwards, unless there is ground or there is a pile of snow touching ground below it. A pile of snow consists of the snow flakes in one column that can no longer fall down. More precisely, if the snow flake is on the very last row or there are only other snow flakes (no empty space) below it, it stays put. Otherwise, it moves one position down.</p>

<p>At each important time of the race, we need to determine the total number of snow flakes in the piles that are touching the ground, and thus preventing unexpected difficulties.</p>

### 입력

<p>The first line contains three integers $N$, $M$, and $Q$ ($1 \le N \cdot M, Q \le 10^5$), the number of rows and columns of the grid and the number of important time points.</p>

<p>The next $N$ lines each contain $M$ characters, forming the aforementioned grid. Each character is either '<code>.</code>' (empty space) or '<code>*</code>' (snow flake).</p>

<p>Finally, $Q$ lines follow, each containing one integer $T_i$ ($0 \le T_i \le 10^5$), the time for which we need to know how many snow flakes are piled on the ground.</p>

### 출력

<p>For each query integer $T_i$, print on a separate line — in the order of the queries — the total number of snow flakes in piles that have fallen to the ground at time $T_i$.</p>
# [Platinum II] Game - 33350

[문제 링크](https://www.acmicpc.net/problem/33350)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 7, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

게임 이론, 느리게 갱신되는 세그먼트 트리, 다이나믹 프로그래밍, 세그먼트 트리, 자료 구조

### 문제 설명

<p>Consider an infinite coordinate axis. Flowers bloom in points with coordinates $1, 2, \ldots, n$. The flower at point $i$ has <em>attractiveness</em> $a_i$.</p>

<p>Two players are playing a game. The first player starts at point $1$. Then they proceed as follows:</p>

<ol>
	<li>The first player, who now stands at point $i$, picks an integer distance from $\ell_i$ to $r_i$, and moves to the right by this distance.</li>
	<li>If the first player's coordinate is more than $n$, then the game stops.</li>
	<li>Otherwise, the second player moves the first player to the left by any distance from $0$ to $c$. However, this move can not end to the left of the point $i + 1$.</li>
	<li>The first player takes the flower in his current point, and game returns to step 1.</li>
</ol>

<p>The first player wants to maximize the total attractiveness of the flowers he takes, while the second player wants to minimize it.</p>

<p>Your task is to calculate the final total attractiveness of the flowers the first player has gathered if both players play optimally.</p>

### 입력

<p>The first line contains an integer $t$ ($1 \le t \le 3 \cdot 10^5$), the number of test cases. The test cases follow.</p>

<p>The first line of each test case contains two integers: the number of flowers $n$ ($1 \le n \le 3 \cdot 10^5$) and the limit $c$ ($0 \le c \le n$). Each of the next three lines contains $n$ integers: these lines describe the arrays $\ell$, $r$, and $a$, in this order ($1 \le \ell_i \le r_i \le n$; $-10^9 \le a_i \le 10^9$). Note that attractiveness can be negative.</p>

<p>The sum of $n$ over all test cases does not exceed $3 \cdot 10^5$.</p>

### 출력

<p>For each test case, output a line with a single integer: the final total attractiveness if both players play optimally.</p>
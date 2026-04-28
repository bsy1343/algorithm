# [Platinum I] Entering Enemy Encampment - 23368

[문제 링크](https://www.acmicpc.net/problem/23368)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 42, 정답: 20, 맞힌 사람: 18, 정답 비율: 52.941%

### 분류

다이나믹 프로그래밍, 애드 혹, 비트마스킹, 게임 이론, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>A new two-player game simulates two countries fighting over a territory. This territory contains a number of strategic positions which are suitable for setting up war camps. The players take turns setting up a camp at one of these spots.</p>

<p>In this territory, there are also a number of trails that connect two positions each. Whenever a player sets up a new camp, this player will send a small group of soldiers over every adjacent trail that leads to an enemy encampment. Each of these groups of soldiers will raid the enemy camp. In other words, for every trail, the second player to capture one of the incident positions can launch at most one raid over this trail. When every strategic position has been claimed, the game ends. The player that performed the most raids wins the game.</p>

<p>Assuming both players play optimally, who wins?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing two integers $n$ ($1 \leq n \leq 20$), the number of strategic positions, and $m$ ($0 \leq m \leq \frac{n(n-1)}{2}$), the number of trails.</li>
	<li>$m$ lines, each containing two integers $a$ and $b$ ($1 \leq a, b \leq n$, $a\neq b$), indicating that there is a trail between position $a$ and position $b$.</li>
</ul>

<p>There is at most one trail between every pair of strategic positions.</p>

### 출력

<p>If the player who goes first wins, output &quot;<code>player 1</code>&quot;. If the player who goes second wins, output &quot;<code>player 2</code>&quot;. If the players tie, output &quot;<code>tie</code>&quot;.</p>
# [Platinum IV] Friendly Formation - 35197

[문제 링크](https://www.acmicpc.net/problem/35197)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 17, 정답: 8, 맞힌 사람: 8, 정답 비율: 47.059%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 다이나믹 프로그래밍, 배낭 문제, 역추적, 이분 그래프, 해 구성하기

### 문제 설명

<p>This year, $n$ players showed up for the Big Annual Paintball Competition (BAPC), a large national contest in which a blue and red team battle for the national title. Some of the players that showed up know each other already, while others do not. At last year's BAPC, this led to some unfortunate communication incidents, causing the entire event to be cut short: half of the blue team had somehow made their way to an adjacent field, and the red team miraculously managed to capture <em>their own</em> flag. This year's organization has therefore decided that in both teams, each pair of players should already know each other. Additionally, to keep the game fair, all players should be assigned a team, and both teams should be equally large. Is it possible to split the group into two such teams?</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with two integers $n$ and $m$ ($2\leq n \leq 10^6, 0 \leq m\leq 10^6$), the number of players and the number of relations.</li>
<li>$m$ lines, each with two integers $a$ and $b$ ($1\leq a, b \leq n$, $a\neq b$), indicating that players $a$ and $b$ already know each other.</li>
</ul>

<p>A relation between any pair of players will be listed at most once.</p>

### 출력

<p>If it is possible to split the group into two teams with the above requirements, then for each player $i$, output "<code>r</code>" if player $i$ should join the red team, and "<code>b</code>" if player $i$ should join the blue team. Otherwise, output "<code>impossible</code>".</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>